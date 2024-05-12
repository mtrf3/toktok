package com.ss.android.ml.process.bl;

import X.C1NE;
import X.J5N;
import X.Q89;
import X.X1D;
import java.util.List;

/* loaded from: classes9.dex */
public class AfOPModel implements J5N {
    public List<String> args;
    public List<String> labels;
    public String op;
    public List<Float> opts;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AfOPModel{labels=");
        LIZ.append(this.labels);
        LIZ.append(", op='");
        Q89.LIZIZ(LIZ, this.op, '\'', ", args=");
        LIZ.append(this.args);
        LIZ.append(", opts=");
        return C1NE.LIZIZ(LIZ, this.opts, '}', LIZ);
    }

    @Override // X.J5N
    public List<String> getArgs() {
        return this.args;
    }

    public List<String> getLabels() {
        return this.labels;
    }

    @Override // X.J5N
    public List<Float> getOPTs() {
        return this.opts;
    }

    @Override // X.J5N
    public String getOperator() {
        return this.op;
    }
}
