package com.ss.android.ugc.aweme.actionai.net;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class StatusInfo extends F9E {

    @InterfaceC65349Pkn("detail")
    public final String detail;

    @InterfaceC65349Pkn("log_id")
    public final String logId;

    @InterfaceC65349Pkn("message")
    public final String message;

    public static /* synthetic */ StatusInfo copy$default(StatusInfo statusInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = statusInfo.message;
        }
        if ((i & 2) != 0) {
            str2 = statusInfo.detail;
        }
        if ((i & 4) != 0) {
            str3 = statusInfo.logId;
        }
        return statusInfo.copy(str, str2, str3);
    }

    public final StatusInfo copy(String message, String detail, String logId) {
        o.LJIIIZ(message, "message");
        o.LJIIIZ(detail, "detail");
        o.LJIIIZ(logId, "logId");
        return new StatusInfo(message, detail, logId);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.message, this.detail, this.logId};
    }

    public final String getDetail() {
        return this.detail;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final String getMessage() {
        return this.message;
    }

    public StatusInfo(String str, String str2, String str3) {
        HH1.LIZ(str, "message", str2, "detail", str3, "logId");
        this.message = str;
        this.detail = str2;
        this.logId = str3;
    }
}
