package com.ss.bytenn;

import X.C16880lQ;
import X.EnumC123094sL;
import X.J72;
import com.ss.bytenn.Tensor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public class API {
    public static String TAG = "BYTENN.API";
    public long engineHandle;
    public int modelBufferSize;

    public static native long nativeCreateEngineInstance();

    public static native int nativeDestroyEngine(long j);

    public static native Tensor nativeGetEngineGradient(long j, String str);

    public static native Tensor[] nativeGetEngineOutputs(long j);

    public static native Tensor nativeGetEngineWeight(long j, String str);

    public static native Tensor[] nativeGetInputConfig(long j);

    public static native int nativeInference(long j);

    public static native int nativeInitEngine(long j, ByteNNConfig byteNNConfig);

    public static native int nativeReInferShape(long j, int i, int i2);

    public static native int nativeReInferShapeTensors(long j, Tensor[] tensorArr);

    public static native int nativeReleaseEngine(long j);

    public static native int nativeSaveModel(long j, ByteBuffer byteBuffer);

    public static native int nativeSetEngineInputs(long j, Tensor[] tensorArr);

    public static native int nativeSetEngineLabel(long j, Tensor[] tensorArr);

    public static native int nativeSetEngineLossLayer(long j, LossInfo[] lossInfoArr);

    public static native int nativeSetEngineWeight(long j, Tensor tensor);

    public static native int nativeSetOptimizer(long j, int i, float f, String[] strArr);

    public static native float nativeStep(long j);

    static {
        C16880lQ.LLJJJIL("bytenn");
        C16880lQ.LLJJJIL("bytennwrapper");
    }

    public float Step() {
        return nativeStep(this.engineHandle);
    }

    public J72 CreateEngine() {
        long nativeCreateEngineInstance = nativeCreateEngineInstance();
        this.engineHandle = nativeCreateEngineInstance;
        if (nativeCreateEngineInstance == 0) {
            return J72.ERR_MEMORY_ALLOC;
        }
        return J72.NO_ERROR;
    }

    public J72 DestroyEngine() {
        J72 j72 = J72.values()[nativeDestroyEngine(this.engineHandle)];
        this.engineHandle = 0L;
        return j72;
    }

    public J72 Inference() {
        return J72.values()[nativeInference(this.engineHandle)];
    }

    public J72 ReleaseEngine() {
        return J72.values()[nativeReleaseEngine(this.engineHandle)];
    }

    public J72 GetEngineInputConfig(ArrayList<Tensor> arrayList) {
        long j = this.engineHandle;
        if (j == 0) {
            return J72.NULL_POINTER;
        }
        Tensor[] nativeGetInputConfig = nativeGetInputConfig(j);
        if (nativeGetInputConfig.length <= 0) {
            return J72.ERR_UNEXPECTED;
        }
        arrayList.clear();
        for (Tensor tensor : nativeGetInputConfig) {
            tensor.getData().order(ByteOrder.nativeOrder());
            arrayList.add(tensor);
        }
        return J72.NO_ERROR;
    }

    public J72 GetEngineOutputs(ArrayList<Tensor> arrayList) {
        Tensor[] nativeGetEngineOutputs = nativeGetEngineOutputs(this.engineHandle);
        if (nativeGetEngineOutputs.length <= 0) {
            return J72.ERR_UNEXPECTED;
        }
        for (Tensor tensor : nativeGetEngineOutputs) {
            arrayList.add(tensor);
        }
        return J72.NO_ERROR;
    }

    public J72 InitEngine(ByteNNConfig byteNNConfig) {
        if (byteNNConfig == null) {
            return J72.INPUT_DATA_ERROR;
        }
        int nativeInitEngine = nativeInitEngine(this.engineHandle, byteNNConfig);
        J72 j72 = J72.NO_ERROR;
        if (j72 != J72.values()[nativeInitEngine]) {
            return J72.values()[nativeInitEngine];
        }
        this.modelBufferSize = byteNNConfig.getModelBufferSize();
        return j72;
    }

    public J72 ReInferShapeTensors(ArrayList<Tensor> arrayList) {
        return J72.values()[nativeReInferShapeTensors(this.engineHandle, (Tensor[]) arrayList.toArray(new Tensor[arrayList.size()]))];
    }

    public J72 SaveModel(ByteBuffer byteBuffer) {
        if (byteBuffer == null || !byteBuffer.isDirect() || byteBuffer.capacity() < this.modelBufferSize) {
            return J72.INPUT_DATA_ERROR;
        }
        return J72.values()[nativeSaveModel(this.engineHandle, byteBuffer)];
    }

    public J72 SetEngineInputs(ArrayList<Tensor> arrayList) {
        return J72.values()[nativeSetEngineInputs(this.engineHandle, (Tensor[]) arrayList.toArray(new Tensor[arrayList.size()]))];
    }

    public J72 SetEngineLabel(ArrayList<Tensor> arrayList) {
        return J72.values()[nativeSetEngineLabel(this.engineHandle, (Tensor[]) arrayList.toArray(new Tensor[arrayList.size()]))];
    }

    public J72 SetEngineWeight(Tensor tensor) {
        if (tensor == null || !tensor.getData().isDirect()) {
            return J72.INPUT_DATA_ERROR;
        }
        return J72.values()[nativeSetEngineWeight(this.engineHandle, tensor)];
    }

    public J72 SetLossLayer(ArrayList<LossInfo> arrayList) {
        return J72.values()[nativeSetEngineLossLayer(this.engineHandle, (LossInfo[]) arrayList.toArray(new LossInfo[arrayList.size()]))];
    }

    public J72 GetEngineGradient(String str, Tensor tensor) {
        if (tensor == null) {
            return J72.INPUT_DATA_ERROR;
        }
        Tensor nativeGetEngineGradient = nativeGetEngineGradient(this.engineHandle, str);
        tensor.setBatch(nativeGetEngineGradient.getBatch());
        tensor.setChannel(nativeGetEngineGradient.getChannel());
        tensor.setHeight(nativeGetEngineGradient.getHeight());
        tensor.setWidth(nativeGetEngineGradient.getWidth());
        tensor.setData(nativeGetEngineGradient.getData());
        tensor.setDataFormat(Tensor.DataFormat.values()[nativeGetEngineGradient.getOrdinalOfDataFormat()]);
        tensor.setDataType(Tensor.DataType.values()[nativeGetEngineGradient.getOrdinalOfDataType()]);
        tensor.setName(nativeGetEngineGradient.getName());
        return J72.NO_ERROR;
    }

    public J72 GetEngineWeight(String str, Tensor tensor) {
        if (tensor == null) {
            return J72.INPUT_DATA_ERROR;
        }
        Tensor nativeGetEngineWeight = nativeGetEngineWeight(this.engineHandle, str);
        tensor.setBatch(nativeGetEngineWeight.getBatch());
        tensor.setChannel(nativeGetEngineWeight.getChannel());
        tensor.setHeight(nativeGetEngineWeight.getHeight());
        tensor.setWidth(nativeGetEngineWeight.getWidth());
        tensor.setData(nativeGetEngineWeight.getData());
        tensor.setDataFormat(Tensor.DataFormat.values()[nativeGetEngineWeight.getOrdinalOfDataFormat()]);
        tensor.setDataType(Tensor.DataType.values()[nativeGetEngineWeight.getOrdinalOfDataType()]);
        tensor.setName(nativeGetEngineWeight.getName());
        return J72.NO_ERROR;
    }

    public J72 ReInferShape(int i, int i2) {
        return J72.values()[nativeReInferShape(this.engineHandle, i2, i)];
    }

    public J72 SetOptimizer(EnumC123094sL enumC123094sL, float f, ArrayList<String> arrayList) {
        return J72.values()[nativeSetOptimizer(this.engineHandle, enumC123094sL.ordinal(), f, (String[]) arrayList.toArray(new String[arrayList.size()]))];
    }
}
