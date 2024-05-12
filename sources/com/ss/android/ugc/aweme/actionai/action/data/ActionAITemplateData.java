package com.ss.android.ugc.aweme.actionai.action.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.actionai.net.ServerMonitorInfo;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ActionAITemplateData {

    @InterfaceC65349Pkn("monitor_info")
    public final ServerMonitorInfo serverMonitorInfo;

    @InterfaceC65349Pkn("template_info_list")
    public final List<CutsameDataItem> templateInfoList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActionAITemplateData copy$default(ActionAITemplateData actionAITemplateData, List list, ServerMonitorInfo serverMonitorInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            list = actionAITemplateData.templateInfoList;
        }
        if ((i & 2) != 0) {
            serverMonitorInfo = actionAITemplateData.serverMonitorInfo;
        }
        return actionAITemplateData.copy(list, serverMonitorInfo);
    }

    public final ActionAITemplateData copy(List<CutsameDataItem> templateInfoList, ServerMonitorInfo serverMonitorInfo) {
        o.LJIIIZ(templateInfoList, "templateInfoList");
        return new ActionAITemplateData(templateInfoList, serverMonitorInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionAITemplateData)) {
            return false;
        }
        ActionAITemplateData actionAITemplateData = (ActionAITemplateData) obj;
        return o.LJ(this.templateInfoList, actionAITemplateData.templateInfoList) && o.LJ(this.serverMonitorInfo, actionAITemplateData.serverMonitorInfo);
    }

    public int hashCode() {
        int hashCode = this.templateInfoList.hashCode() * 31;
        ServerMonitorInfo serverMonitorInfo = this.serverMonitorInfo;
        return hashCode + (serverMonitorInfo == null ? 0 : serverMonitorInfo.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ActionAITemplateData(templateInfoList=");
        LIZ.append(this.templateInfoList);
        LIZ.append(", serverMonitorInfo=");
        LIZ.append(this.serverMonitorInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final ServerMonitorInfo getServerMonitorInfo() {
        return this.serverMonitorInfo;
    }

    public final List<CutsameDataItem> getTemplateInfoList() {
        return this.templateInfoList;
    }

    public ActionAITemplateData(List<CutsameDataItem> templateInfoList, ServerMonitorInfo serverMonitorInfo) {
        o.LJIIIZ(templateInfoList, "templateInfoList");
        this.templateInfoList = templateInfoList;
        this.serverMonitorInfo = serverMonitorInfo;
    }

    public /* synthetic */ ActionAITemplateData(List list, ServerMonitorInfo serverMonitorInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : serverMonitorInfo);
    }
}
