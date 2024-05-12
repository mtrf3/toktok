package com.ss.android.ml.process.bl;

import X.Q89;
import X.X1D;
import defpackage.b0;
import java.util.List;

/* loaded from: classes9.dex */
public class MLConfigModel {
    public String bytenn_forward_type;
    public boolean enable_gpu;
    public boolean enable_nn_api;
    public List<String> feature_list;
    public List<PreOPModel> input;
    public String input_type;
    public List<PreOPModel> intput;
    public String model_type;
    public int num_threads;
    public AfOPModel output;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MLConfigModel{model_type='");
        Q89.LIZIZ(LIZ, this.model_type, '\'', ", input_type='");
        Q89.LIZIZ(LIZ, this.input_type, '\'', ", intput=");
        LIZ.append(this.intput);
        LIZ.append(", input=");
        LIZ.append(this.input);
        LIZ.append(", output=");
        LIZ.append(this.output);
        LIZ.append(", feature_list=");
        LIZ.append(this.feature_list);
        LIZ.append(", enable_nn_api=");
        LIZ.append(this.enable_nn_api);
        LIZ.append(", enable_gpu=");
        LIZ.append(this.enable_gpu);
        LIZ.append(", bytenn_forward_type=");
        LIZ.append(this.bytenn_forward_type);
        LIZ.append(", num_threads=");
        return b0.LIZJ(LIZ, this.num_threads, '}', LIZ);
    }
}
