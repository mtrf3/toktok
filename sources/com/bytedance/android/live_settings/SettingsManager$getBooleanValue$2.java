package com.bytedance.android.live_settings;

import X.InterfaceC88472Yns;
import X.TBS;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final /* synthetic */ class SettingsManager$getBooleanValue$2 extends TBS implements InterfaceC88472Yns<Class<?>, Boolean> {
    public SettingsManager$getBooleanValue$2(Object obj) {
        super(1, obj, SettingsManager.class, "getBooleanValueInternal", "getBooleanValueInternal(Ljava/lang/Class;)Z", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Class<?> p0) {
        o.LJIIIZ(p0, "p0");
        return Boolean.valueOf(((SettingsManager) this.receiver).getBooleanValueInternal(p0));
    }
}
