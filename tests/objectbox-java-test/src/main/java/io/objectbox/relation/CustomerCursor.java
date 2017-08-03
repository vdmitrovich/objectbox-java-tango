package io.objectbox.relation;


import java.util.List;

import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.EntityInfo;
import io.objectbox.Transaction;
import io.objectbox.internal.CursorFactory;

// THIS CODE IS ADAPTED from generated resources of the test-entity-annotations project

/**
 * Cursor for DB entity "Customer".
 */
public final class CustomerCursor extends Cursor<Customer> {

    static final class Factory implements CursorFactory<Customer> {
        public Cursor<Customer> createCursor(Transaction tx, long cursorHandle, BoxStore boxStoreForEntities) {
            return new CustomerCursor(tx, cursorHandle, boxStoreForEntities);
        }
    }

    private static EntityInfo PROPERTIES = new Customer_();


    // Property IDs get verified in Cursor base class
    private final static int __ID_name = Customer_.name.id;

    public CustomerCursor(Transaction tx, long cursor, BoxStore boxStore) {
        super(tx, cursor, PROPERTIES, boxStore);
    }

    @Override
    public final long getId(Customer entity) {
        return entity.getId();
    }

    /**
     * Puts an object into its box.
     *
     * @return The ID of the object within its box.
     */
    @Override
    public final long put(Customer entity) {
        String name = entity.getName();
        int __id1 = name != null ? __ID_name : 0;

        long __assignedId = collect313311(cursor, entity.getId(), PUT_FLAG_FIRST | PUT_FLAG_COMPLETE,
                __id1, name, 0, null,
                0, null, 0, null,
                0, 0, 0, 0,
                0, 0, 0, 0,
                0, 0, 0, 0,
                0, 0, 0, 0);

        entity.setId(__assignedId);
        entity.__boxStore = boxStoreForEntities;

        if (entity.orders instanceof ToMany) {
            ToMany<Order> toMany = (ToMany<Order>) entity.orders;
            if (toMany.internalCheckApplyToDbRequired()) {
                Cursor<Order> targetCursor = getRelationTargetCursor(Order.class);
                try {
                    toMany.internalApplyToDb(this, targetCursor);
                } finally {
                    targetCursor.close();
                }
            }
        }

        List<Order> ordersStandalone = entity.getOrdersStandalone();
        if (ordersStandalone instanceof ToMany) {
            ToMany<Order> toMany = (ToMany<Order>) ordersStandalone;
            if (toMany.internalCheckApplyToDbRequired()) {
                Cursor<Order> targetCursor = getRelationTargetCursor(Order.class);
                try {
                    toMany.internalApplyToDb(this, targetCursor);
                } finally {
                    targetCursor.close();
                }
            }
        }

        return __assignedId;
    }

    // TODO @Override
    protected final void attachEntity(Customer entity) {
        // TODO super.attachEntity(entity);
        entity.__boxStore = boxStoreForEntities;
    }

    // TODO do we need this? @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }

}
