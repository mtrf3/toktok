package com.bytedance.helios.network.api.service;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ReplaceConfig extends F9E {
    public String target;
    public String value;

    /* JADX WARN: Multi-variable type inference failed */
    public ReplaceConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ReplaceConfig copy$default(ReplaceConfig replaceConfig, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = replaceConfig.value;
        }
        if ((i & 2) != 0) {
            str2 = replaceConfig.target;
        }
        return replaceConfig.copy(str, str2);
    }

    public final ReplaceConfig copy(String value, String target) {
        o.LJIIIZ(value, "value");
        o.LJIIIZ(target, "target");
        return new ReplaceConfig(value, target);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.value, this.target};
    }

    public final String getTarget() {
        return this.target;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setTarget(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.target = str;
    }

    public final void setValue(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.value = str;
    }

    public ReplaceConfig(String value, String target) {
        o.LJIIIZ(value, "value");
        o.LJIIIZ(target, "target");
        this.value = value;
        this.target = target;
    }

    public /* synthetic */ ReplaceConfig(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "key" : str2);
    }
}
