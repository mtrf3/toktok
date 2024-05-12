package com.ss.android.ugc.aweme.setting.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class LaunchOauthBindUnbindResponse extends F9E {

    @InterfaceC65349Pkn("enabled")
    public final boolean enable;

    public LaunchOauthBindUnbindResponse() {
        this(false, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable)};
    }

    public LaunchOauthBindUnbindResponse(boolean z) {
        this.enable = z;
    }

    public /* synthetic */ LaunchOauthBindUnbindResponse(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
