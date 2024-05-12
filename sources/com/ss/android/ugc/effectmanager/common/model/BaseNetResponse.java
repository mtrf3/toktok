package com.ss.android.ugc.effectmanager.common.model;

import X.C77800Ug8;
import X.X1D;

/* loaded from: classes7.dex */
public class BaseNetResponse {
    public String message;
    public int status_code;

    public boolean checkValue() {
        return true;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BaseNetResponse{status_code=");
        LIZ.append(this.status_code);
        LIZ.append(", message='");
        return C77800Ug8.LIZJ(LIZ, this.message, '\'', '}', LIZ);
    }
}
