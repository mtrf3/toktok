package com.bytedance.android.livesdk.chatroom.interact.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.model.Extra;

/* loaded from: classes14.dex */
public class RivalsListExtra extends Extra {

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPbBean;

    public String getRequestId() {
        LogPbBean logPbBean = this.logPbBean;
        if (logPbBean != null) {
            return logPbBean.imprId;
        }
        return "";
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RivalsListExtra{logPbBean=");
        LIZ.append(this.logPbBean);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes14.dex */
    public static final class LogPbBean extends F9E {

        @InterfaceC65349Pkn("client_log_id")
        public String clientLogId = "";

        @InterfaceC65349Pkn("impr_id")
        public String imprId;

        @Override // X.F9E
        public Object[] getObjects() {
            return new Object[]{this.imprId};
        }

        public String getImprId() {
            return this.imprId;
        }
    }

    public LogPbBean getLogPbBean() {
        return this.logPbBean;
    }
}
