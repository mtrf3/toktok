package com.bytedance.ropa.encrypt;

import X.C77800Ug8;
import X.X1D;

/* loaded from: classes9.dex */
public class EncryptResult {
    public final int code;
    public final String data;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EncryptResult{code=");
        LIZ.append(this.code);
        LIZ.append(", data='");
        return C77800Ug8.LIZJ(LIZ, this.data, '\'', '}', LIZ);
    }

    public int getCode() {
        return this.code;
    }

    public String getData() {
        return this.data;
    }

    public EncryptResult(int i, String str) {
        this.code = i;
        this.data = str;
    }
}
