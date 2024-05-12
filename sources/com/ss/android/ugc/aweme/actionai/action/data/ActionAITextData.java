package com.ss.android.ugc.aweme.actionai.action.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.actionai.net.ServerMonitorInfo;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ActionAITextData {

    @InterfaceC65349Pkn("monitor_info")
    public final ServerMonitorInfo serverMonitorInfo;

    @InterfaceC65349Pkn("text_result")
    public final List<String> textResult;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActionAITextData copy$default(ActionAITextData actionAITextData, List list, ServerMonitorInfo serverMonitorInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            list = actionAITextData.textResult;
        }
        if ((i & 2) != 0) {
            serverMonitorInfo = actionAITextData.serverMonitorInfo;
        }
        return actionAITextData.copy(list, serverMonitorInfo);
    }

    public final ActionAITextData copy(List<String> textResult, ServerMonitorInfo serverMonitorInfo) {
        o.LJIIIZ(textResult, "textResult");
        return new ActionAITextData(textResult, serverMonitorInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionAITextData)) {
            return false;
        }
        ActionAITextData actionAITextData = (ActionAITextData) obj;
        return o.LJ(this.textResult, actionAITextData.textResult) && o.LJ(this.serverMonitorInfo, actionAITextData.serverMonitorInfo);
    }

    public int hashCode() {
        int hashCode = this.textResult.hashCode() * 31;
        ServerMonitorInfo serverMonitorInfo = this.serverMonitorInfo;
        return hashCode + (serverMonitorInfo == null ? 0 : serverMonitorInfo.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ActionAITextData(textResult=");
        LIZ.append(this.textResult);
        LIZ.append(", serverMonitorInfo=");
        LIZ.append(this.serverMonitorInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final ServerMonitorInfo getServerMonitorInfo() {
        return this.serverMonitorInfo;
    }

    public final List<String> getTextResult() {
        return this.textResult;
    }

    public ActionAITextData(List<String> textResult, ServerMonitorInfo serverMonitorInfo) {
        o.LJIIIZ(textResult, "textResult");
        this.textResult = textResult;
        this.serverMonitorInfo = serverMonitorInfo;
    }

    public /* synthetic */ ActionAITextData(List list, ServerMonitorInfo serverMonitorInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : serverMonitorInfo);
    }
}
