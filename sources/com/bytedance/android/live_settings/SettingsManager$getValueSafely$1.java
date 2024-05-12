package com.bytedance.android.live_settings;

import X.InterfaceC88472Yns;
import X.TBS;
import kotlin.jvm.internal.o;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes6.dex */
public final /* synthetic */ class SettingsManager$getValueSafely$1<T> extends TBS implements InterfaceC88472Yns<Class<?>, T> {
    public SettingsManager$getValueSafely$1(Object obj) {
        super(1, obj, SettingsManager.class, "getValueSafelyInternalV2", "getValueSafelyInternalV2(Ljava/lang/Class;)Ljava/lang/Object;", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final T invoke(Class<?> p0) {
        o.LJIIIZ(p0, "p0");
        return (T) ((SettingsManager) this.receiver).getValueSafelyInternalV2(p0);
    }
}
