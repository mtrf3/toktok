package com.bytedance.android.live_settings;

import X.InterfaceC88472Yns;
import X.TBS;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final /* synthetic */ class SettingsManager$getFloatValue$2 extends TBS implements InterfaceC88472Yns<Class<?>, Float> {
    public SettingsManager$getFloatValue$2(Object obj) {
        super(1, obj, SettingsManager.class, "getFloatValueInternal", "getFloatValueInternal(Ljava/lang/Class;)F", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final Float invoke(Class<?> p0) {
        o.LJIIIZ(p0, "p0");
        return Float.valueOf(((SettingsManager) this.receiver).getFloatValueInternal(p0));
    }
}