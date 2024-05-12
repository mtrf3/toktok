package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class MultiHostDividerSettingsConf {

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    public MultiHostDividerSettingsConf() {
        this(false, 1, null);
    }

    public MultiHostDividerSettingsConf(boolean z) {
        this.enable = z;
    }

    public /* synthetic */ MultiHostDividerSettingsConf(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
