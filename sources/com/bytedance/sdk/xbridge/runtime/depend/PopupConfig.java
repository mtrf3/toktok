package com.bytedance.sdk.xbridge.runtime.depend;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class PopupConfig extends F9E {
    public final Integer disableMaskClickClose;
    public final Integer enablePullDownClose;

    /* JADX WARN: Multi-variable type inference failed */
    public PopupConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PopupConfig copy$default(PopupConfig popupConfig, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = popupConfig.disableMaskClickClose;
        }
        if ((i & 2) != 0) {
            num2 = popupConfig.enablePullDownClose;
        }
        return popupConfig.copy(num, num2);
    }

    public final PopupConfig copy(Integer num, Integer num2) {
        return new PopupConfig(num, num2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.disableMaskClickClose, this.enablePullDownClose};
    }

    public final Integer getDisableMaskClickClose() {
        return this.disableMaskClickClose;
    }

    public final Integer getEnablePullDownClose() {
        return this.enablePullDownClose;
    }

    public PopupConfig(Integer num, Integer num2) {
        this.disableMaskClickClose = num;
        this.enablePullDownClose = num2;
    }

    public /* synthetic */ PopupConfig(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
