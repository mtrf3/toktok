package com.ss.android.ml.process.bl;

import X.J5M;
import X.Q89;
import X.X1D;
import defpackage.b0;
import java.util.List;

/* loaded from: classes9.dex */
public class PreOPModel implements J5M {
    public List<String> args;
    public String feature;
    public List<String> labels;
    public List<String> lables;
    public int length;
    public String op;
    public List<Float> opts;
    public String type;
    public int vector_length;
    public int vector_num;

    @Override // X.J5M
    public List<String> getLabels() {
        List<String> list = this.labels;
        if (list != null) {
            return list;
        }
        return this.lables;
    }

    @Override // X.J5M
    public int getLength() {
        if (getVectorLength() > 0 && getVectorNum() > 0) {
            return getVectorNum() * getVectorLength();
        }
        return this.length;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreOPModel{feature='");
        Q89.LIZIZ(LIZ, this.feature, '\'', ", op='");
        Q89.LIZIZ(LIZ, this.op, '\'', ", args=");
        LIZ.append(this.args);
        LIZ.append(", opts=");
        LIZ.append(this.opts);
        LIZ.append(", labels=");
        LIZ.append(getLabels());
        LIZ.append(", length=");
        LIZ.append(this.length);
        LIZ.append(", type='");
        Q89.LIZIZ(LIZ, this.type, '\'', ", vector_length=");
        LIZ.append(this.vector_length);
        LIZ.append(", vector_num=");
        return b0.LIZJ(LIZ, this.vector_num, '}', LIZ);
    }

    @Override // X.J5N
    public List<String> getArgs() {
        return this.args;
    }

    @Override // X.J5M
    public String getFeature() {
        return this.feature;
    }

    @Override // X.J5N
    public List<Float> getOPTs() {
        return this.opts;
    }

    @Override // X.J5N
    public String getOperator() {
        return this.op;
    }

    @Override // X.J5M
    public String getType() {
        return this.type;
    }

    @Override // X.J5M
    public int getVectorLength() {
        return this.vector_length;
    }

    @Override // X.J5M
    public int getVectorNum() {
        return this.vector_num;
    }
}
