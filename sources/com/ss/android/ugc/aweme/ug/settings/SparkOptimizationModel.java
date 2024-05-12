package com.ss.android.ugc.aweme.ug.settings;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SparkOptimizationModel {

    @InterfaceC65349Pkn("sparkPreload")
    public final SparkPreloadModel sparkPreloadModel;

    @InterfaceC65349Pkn("sparkReUse")
    public final SparkReUseModel sparkReUseModel;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SparkOptimizationModel)) {
            return false;
        }
        SparkOptimizationModel sparkOptimizationModel = (SparkOptimizationModel) obj;
        return o.LJ(this.sparkPreloadModel, sparkOptimizationModel.sparkPreloadModel) && o.LJ(this.sparkReUseModel, sparkOptimizationModel.sparkReUseModel);
    }

    public final int hashCode() {
        SparkPreloadModel sparkPreloadModel = this.sparkPreloadModel;
        int hashCode = (sparkPreloadModel == null ? 0 : sparkPreloadModel.hashCode()) * 31;
        SparkReUseModel sparkReUseModel = this.sparkReUseModel;
        return hashCode + (sparkReUseModel != null ? sparkReUseModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SparkOptimizationModel(sparkPreloadModel=");
        LIZ.append(this.sparkPreloadModel);
        LIZ.append(", sparkReUseModel=");
        LIZ.append(this.sparkReUseModel);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public SparkOptimizationModel(SparkPreloadModel sparkPreloadModel, SparkReUseModel sparkReUseModel) {
        this.sparkPreloadModel = sparkPreloadModel;
        this.sparkReUseModel = sparkReUseModel;
    }
}
