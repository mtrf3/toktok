package com.ss.android.ugc.aweme.simkit.model;

import X.C77800Ug8;
import X.Q89;
import X.X1D;

/* loaded from: classes7.dex */
public class BaseResponse {
    public int error_code;
    public ServerTimeExtra extra;
    public String message;
    public String prompts;
    public int status_code;
    public String status_msg;

    /* loaded from: classes7.dex */
    public static class ServerTimeExtra {
        public String logid;
        public long now;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("{now=");
            LIZ.append(this.now);
            LIZ.append(", logid='");
            return C77800Ug8.LIZJ(LIZ, this.logid, '\'', '}', LIZ);
        }
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BaseResponse{status_code=");
        LIZ.append(this.status_code);
        LIZ.append(", message='");
        Q89.LIZIZ(LIZ, this.message, '\'', ", status_msg='");
        Q89.LIZIZ(LIZ, this.status_msg, '\'', ", prompts='");
        Q89.LIZIZ(LIZ, this.prompts, '\'', ", extra=");
        LIZ.append(this.extra);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
