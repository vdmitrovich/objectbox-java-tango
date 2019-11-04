/*
 * Copyright 2019 ObjectBox Ltd. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// automatically generated by the FlatBuffers compiler, do not modify

package io.objectbox.model;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class ModelEntity extends Table {
  public static ModelEntity getRootAsModelEntity(ByteBuffer _bb) { return getRootAsModelEntity(_bb, new ModelEntity()); }
  public static ModelEntity getRootAsModelEntity(ByteBuffer _bb, ModelEntity obj) { Constants.FLATBUFFERS_1_11_1(); _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public ModelEntity __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public IdUid id() { return id(new IdUid()); }
  public IdUid id(IdUid obj) { int o = __offset(4); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public String name() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public ModelProperty properties(int j) { return properties(new ModelProperty(), j); }
  public ModelProperty properties(ModelProperty obj, int j) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int propertiesLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public IdUid lastPropertyId() { return lastPropertyId(new IdUid()); }
  public IdUid lastPropertyId(IdUid obj) { int o = __offset(10); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public ModelRelation relations(int j) { return relations(new ModelRelation(), j); }
  public ModelRelation relations(ModelRelation obj, int j) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int relationsLength() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }
  /**
   * Can be language specific, e.g. if no-args constructor should be used
   */
  public long flags() { int o = __offset(14); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  /**
   * Secondary name ignored by core; e.g. may reference a binding specific name (e.g. Java class)
   */
  public String nameSecondary() { int o = __offset(16); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameSecondaryAsByteBuffer() { return __vector_as_bytebuffer(16, 1); }
  public ByteBuffer nameSecondaryInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 16, 1); }

  public static void startModelEntity(FlatBufferBuilder builder) { builder.startTable(7); }
  public static void addId(FlatBufferBuilder builder, int idOffset) { builder.addStruct(0, idOffset, 0); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(1, nameOffset, 0); }
  public static void addProperties(FlatBufferBuilder builder, int propertiesOffset) { builder.addOffset(2, propertiesOffset, 0); }
  public static int createPropertiesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startPropertiesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addLastPropertyId(FlatBufferBuilder builder, int lastPropertyIdOffset) { builder.addStruct(3, lastPropertyIdOffset, 0); }
  public static void addRelations(FlatBufferBuilder builder, int relationsOffset) { builder.addOffset(4, relationsOffset, 0); }
  public static int createRelationsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startRelationsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addFlags(FlatBufferBuilder builder, long flags) { builder.addInt(5, (int)flags, (int)0L); }
  public static void addNameSecondary(FlatBufferBuilder builder, int nameSecondaryOffset) { builder.addOffset(6, nameSecondaryOffset, 0); }
  public static int endModelEntity(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
}

