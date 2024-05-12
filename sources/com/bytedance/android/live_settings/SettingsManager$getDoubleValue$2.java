package com.bytedance.android.live_settings;

import X.InterfaceC88472Yns;
import X.TBS;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final /* synthetic */ class SettingsManager$getDoubleValue$2 extends TBS implements InterfaceC88472Yns<Class<?>, Double> {
    public SettingsManager$getDoubleValue$2(Object obj) {
        super(1, obj, SettingsManager.class, "getDoubleValueInternal", "getDoubleValueInternal(Ljava/lang/Class;)D", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final Double invoke(Class<?> p0) {
        o.LJIIIZ(p0, "p0");
        return Double.valueOf(((SettingsManager) this.receiver).getDoubleValueInternal(p0));
    }
}
