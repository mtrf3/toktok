package com.bytedance.sdk.xbridge.runtime.depend;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class BackPressConfig extends F9E {
    public final Integer disableBackPress;

    /* JADX WARN: Multi-variable type inference failed */
    public BackPressConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BackPressConfig copy$default(BackPressConfig backPressConfig, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = backPressConfig.disableBackPress;
        }
        return backPressConfig.copy(num);
    }

    public final BackPressConfig copy(Integer num) {
        return new BackPressConfig(num);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.disableBackPress};
    }

    public final Integer getDisableBackPress() {
        return this.disableBackPress;
    }

    public BackPressConfig(Integer num) {
        this.disableBackPress = num;
    }

    public /* synthetic */ BackPressConfig(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }
}
