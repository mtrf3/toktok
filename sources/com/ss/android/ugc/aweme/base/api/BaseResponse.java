package com.ss.android.ugc.aweme.base.api;

import X.AbstractC36908Ee8;
import X.C38333F2r;
import X.C62850Ola;
import X.C77800Ug8;
import X.Q89;
import X.X1D;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class BaseResponse extends AbstractC36908Ee8 {
    public int error_code;
    public ServerTimeExtra extra;
    public Map<String, String> extraMap;
    public Map<String, Object> mLocalExtra;
    public String message;
    public String prompts;
    public int status_code;
    public String status_msg;

    /* loaded from: classes7.dex */
    public static class ServerTimeExtra {
        public String dc;
        public String logid;
        public long now;
        public long server_stream_time;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("{now=");
            LIZ.append(this.now);
            LIZ.append(", logid='");
            Q89.LIZIZ(LIZ, this.logid, '\'', ", server_stream_time ='");
            C62850Ola.LJIIIIZZ(LIZ, this.server_stream_time, '\'', ", dc ='");
            return C77800Ug8.LIZJ(LIZ, this.dc, '\'', '}', LIZ);
        }
    }

    private void checkStatusCode() {
        if (this.status_code == 0) {
            return;
        }
        C38333F2r c38333F2r = new C38333F2r(this.status_code);
        c38333F2r.setErrorMsg(this.status_msg);
        c38333F2r.setPrompt(this.prompts);
        c38333F2r.setResponse(this);
        throw c38333F2r;
    }

    public Map<String, Object> getLocalExtra() {
        if (this.mLocalExtra == null) {
            synchronized (this) {
                if (this.mLocalExtra == null) {
                    this.mLocalExtra = new ConcurrentHashMap(4);
                }
            }
        }
        return this.mLocalExtra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC36908Ee8
    public <T> T checkValid() {
        checkStatusCode();
        super.checkValid();
        return this;
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
