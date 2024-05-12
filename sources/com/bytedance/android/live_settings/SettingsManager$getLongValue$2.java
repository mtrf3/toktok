package com.bytedance.android.live_settings;

import X.InterfaceC88472Yns;
import X.TBS;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final /* synthetic */ class SettingsManager$getLongValue$2 extends TBS implements InterfaceC88472Yns<Class<?>, Long> {
    public SettingsManager$getLongValue$2(Object obj) {
        super(1, obj, SettingsManager.class, "getLongValueInternal", "getLongValueInternal(Ljava/lang/Class;)J", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final Long invoke(Class<?> p0) {
        o.LJIIIZ(p0, "p0");
        return Long.valueOf(((SettingsManager) this.receiver).getLongValueInternal(p0));
    }
}
