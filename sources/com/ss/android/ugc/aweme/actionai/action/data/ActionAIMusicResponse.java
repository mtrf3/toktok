package com.ss.android.ugc.aweme.actionai.action.data;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.actionai.net.StatusInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ActionAIMusicResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public final ActionAIMusicInfoList data;

    @InterfaceC65349Pkn("status")
    public final int status;

    @InterfaceC65349Pkn("status_info")
    public final StatusInfo statusInfo;

    public static /* synthetic */ ActionAIMusicResponse copy$default(ActionAIMusicResponse actionAIMusicResponse, ActionAIMusicInfoList actionAIMusicInfoList, int i, StatusInfo statusInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            actionAIMusicInfoList = actionAIMusicResponse.data;
        }
        if ((i2 & 2) != 0) {
            i = actionAIMusicResponse.status;
        }
        if ((i2 & 4) != 0) {
            statusInfo = actionAIMusicResponse.statusInfo;
        }
        return actionAIMusicResponse.copy(actionAIMusicInfoList, i, statusInfo);
    }

    public final ActionAIMusicResponse copy(ActionAIMusicInfoList data, int i, StatusInfo statusInfo) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(statusInfo, "statusInfo");
        return new ActionAIMusicResponse(data, i, statusInfo);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.data, Integer.valueOf(this.status), this.statusInfo};
    }

    public final ActionAIMusicInfoList getData() {
        return this.data;
    }

    public final int getStatus() {
        return this.status;
    }

    public final StatusInfo getStatusInfo() {
        return this.statusInfo;
    }

    public ActionAIMusicResponse(ActionAIMusicInfoList data, int i, StatusInfo statusInfo) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(statusInfo, "statusInfo");
        this.data = data;
        this.status = i;
        this.statusInfo = statusInfo;
    }
}
