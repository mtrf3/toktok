package com.ss.android.ugc.aweme.actionai.action.data;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.actionai.net.StatusInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ActionAITextResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public final ActionAITextData data;

    @InterfaceC65349Pkn("status")
    public final int status;

    @InterfaceC65349Pkn("status_info")
    public final StatusInfo status_info;

    public static /* synthetic */ ActionAITextResponse copy$default(ActionAITextResponse actionAITextResponse, ActionAITextData actionAITextData, int i, StatusInfo statusInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            actionAITextData = actionAITextResponse.data;
        }
        if ((i2 & 2) != 0) {
            i = actionAITextResponse.status;
        }
        if ((i2 & 4) != 0) {
            statusInfo = actionAITextResponse.status_info;
        }
        return actionAITextResponse.copy(actionAITextData, i, statusInfo);
    }

    public final ActionAITextResponse copy(ActionAITextData data, int i, StatusInfo status_info) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(status_info, "status_info");
        return new ActionAITextResponse(data, i, status_info);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.data, Integer.valueOf(this.status), this.status_info};
    }

    public final ActionAITextData getData() {
        return this.data;
    }

    public final int getStatus() {
        return this.status;
    }

    public final StatusInfo getStatus_info() {
        return this.status_info;
    }

    public ActionAITextResponse(ActionAITextData data, int i, StatusInfo status_info) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(status_info, "status_info");
        this.data = data;
        this.status = i;
        this.status_info = status_info;
    }
}
