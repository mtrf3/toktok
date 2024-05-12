package com.bytedance.ttmock.data;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PopupMockConfig extends F9E {

    @InterfaceC65349Pkn("allow_list")
    public final List<String> allowList;

    @InterfaceC65349Pkn("force_stop")
    public final boolean forceStop;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PopupMockConfig copy$default(PopupMockConfig popupMockConfig, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = popupMockConfig.forceStop;
        }
        if ((i & 2) != 0) {
            list = popupMockConfig.allowList;
        }
        return popupMockConfig.copy(z, list);
    }

    public final PopupMockConfig copy(boolean z, List<String> allowList) {
        o.LJIIIZ(allowList, "allowList");
        return new PopupMockConfig(z, allowList);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.forceStop), this.allowList};
    }

    public final List<String> getAllowList() {
        return this.allowList;
    }

    public final boolean getForceStop() {
        return this.forceStop;
    }

    public PopupMockConfig(boolean z, List<String> allowList) {
        o.LJIIIZ(allowList, "allowList");
        this.forceStop = z;
        this.allowList = allowList;
    }
}
