package com.bytedance.android.live_settings;

import X.InterfaceC88472Yns;
import X.TBS;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final /* synthetic */ class SettingsManager$getLongValue$1 extends TBS implements InterfaceC88472Yns<Class<?>, Long> {
    public SettingsManager$getLongValue$1(Object obj) {
        super(1, obj, SettingsManager.class, "getLongValueInternalV2", "getLongValueInternalV2(Ljava/lang/Class;)J", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final Long invoke(Class<?> p0) {
        o.LJIIIZ(p0, "p0");
        return Long.valueOf(((SettingsManager) this.receiver).getLongValueInternalV2(p0));
    }
}
