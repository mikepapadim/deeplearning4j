// automatically generated by the FlatBuffers compiler, do not modify

package nd4j.graph;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FlatGraph extends Table {
  public static FlatGraph getRootAsFlatGraph(ByteBuffer _bb) { return getRootAsFlatGraph(_bb, new FlatGraph()); }
  public static FlatGraph getRootAsFlatGraph(ByteBuffer _bb, FlatGraph obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public FlatGraph __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long id() { int o = __offset(4); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public FlatVariable variables(int j) { return variables(new FlatVariable(), j); }
  public FlatVariable variables(FlatVariable obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int variablesLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public FlatNode nodes(int j) { return nodes(new FlatNode(), j); }
  public FlatNode nodes(FlatNode obj, int j) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int nodesLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public IntPair outputs(int j) { return outputs(new IntPair(), j); }
  public IntPair outputs(IntPair obj, int j) { int o = __offset(10); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int outputsLength() { int o = __offset(10); return o != 0 ? __vector_len(o) : 0; }
  public FlatConfiguration configuration() { return configuration(new FlatConfiguration()); }
  public FlatConfiguration configuration(FlatConfiguration obj) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createFlatGraph(FlatBufferBuilder builder,
      long id,
      int variablesOffset,
      int nodesOffset,
      int outputsOffset,
      int configurationOffset) {
    builder.startObject(5);
    FlatGraph.addId(builder, id);
    FlatGraph.addConfiguration(builder, configurationOffset);
    FlatGraph.addOutputs(builder, outputsOffset);
    FlatGraph.addNodes(builder, nodesOffset);
    FlatGraph.addVariables(builder, variablesOffset);
    return FlatGraph.endFlatGraph(builder);
  }

  public static void startFlatGraph(FlatBufferBuilder builder) { builder.startObject(5); }
  public static void addId(FlatBufferBuilder builder, long id) { builder.addLong(0, id, 0L); }
  public static void addVariables(FlatBufferBuilder builder, int variablesOffset) { builder.addOffset(1, variablesOffset, 0); }
  public static int createVariablesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startVariablesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addNodes(FlatBufferBuilder builder, int nodesOffset) { builder.addOffset(2, nodesOffset, 0); }
  public static int createNodesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startNodesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addOutputs(FlatBufferBuilder builder, int outputsOffset) { builder.addOffset(3, outputsOffset, 0); }
  public static int createOutputsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startOutputsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addConfiguration(FlatBufferBuilder builder, int configurationOffset) { builder.addOffset(4, configurationOffset, 0); }
  public static int endFlatGraph(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishFlatGraphBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedFlatGraphBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }
}

