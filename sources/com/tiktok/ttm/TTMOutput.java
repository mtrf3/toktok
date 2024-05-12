package com.tiktok.ttm;

import X.C77800Ug8;
import X.X1D;

/* loaded from: classes7.dex */
public final class TTMOutput {
    public String msg;
    public int type = -1;
    public Object value;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTMOutput{type=");
        LIZ.append(this.type);
        LIZ.append(", value=");
        LIZ.append(this.value);
        LIZ.append(", msg='");
        return C77800Ug8.LIZJ(LIZ, this.msg, '\'', '}', LIZ);
    }
}
