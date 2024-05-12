package com.bytedance.android.live_settings;

import X.InterfaceC88472Yns;
import X.TBS;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final /* synthetic */ class SettingsManager$getIntValue$2 extends TBS implements InterfaceC88472Yns<Class<?>, Integer> {
    public SettingsManager$getIntValue$2(Object obj) {
        super(1, obj, SettingsManager.class, "getIntValueInternal", "getIntValueInternal(Ljava/lang/Class;)I", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final Integer invoke(Class<?> p0) {
        o.LJIIIZ(p0, "p0");
        return Integer.valueOf(((SettingsManager) this.receiver).getIntValueInternal(p0));
    }
}
