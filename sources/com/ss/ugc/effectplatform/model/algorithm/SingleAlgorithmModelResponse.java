package com.ss.ugc.effectplatform.model.algorithm;

import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class SingleAlgorithmModelResponse extends F9E {
    public ModelInfo data;

    public static /* synthetic */ SingleAlgorithmModelResponse copy$default(SingleAlgorithmModelResponse singleAlgorithmModelResponse, ModelInfo modelInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            modelInfo = singleAlgorithmModelResponse.data;
        }
        return singleAlgorithmModelResponse.copy(modelInfo);
    }

    public final SingleAlgorithmModelResponse copy(ModelInfo data) {
        o.LJIIJ(data, "data");
        return new SingleAlgorithmModelResponse(data);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.data};
    }

    public final ModelInfo getData() {
        return this.data;
    }

    public SingleAlgorithmModelResponse(ModelInfo data) {
        o.LJIIJ(data, "data");
        this.data = data;
    }

    public final void setData(ModelInfo modelInfo) {
        o.LJIIJ(modelInfo, "<set-?>");
        this.data = modelInfo;
    }
}
