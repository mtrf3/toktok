package com.bytedance.android.live_settings;

import X.InterfaceC88472Yns;
import X.TBS;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final /* synthetic */ class SettingsManager$getStringValue$1 extends TBS implements InterfaceC88472Yns<Class<?>, String> {
    public SettingsManager$getStringValue$1(Object obj) {
        super(1, obj, SettingsManager.class, "getStringValueInternalV2", "getStringValueInternalV2(Ljava/lang/Class;)Ljava/lang/String;", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(Class<?> p0) {
        o.LJIIIZ(p0, "p0");
        return ((SettingsManager) this.receiver).getStringValueInternalV2(p0);
    }
}
