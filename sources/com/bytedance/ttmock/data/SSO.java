package com.bytedance.ttmock.data;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class SSO extends F9E {

    @InterfaceC65349Pkn("bypass")
    public final boolean bypass;

    public SSO() {
        this(false, 1, null);
    }

    public static /* synthetic */ SSO copy$default(SSO sso, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = sso.bypass;
        }
        return sso.copy(z);
    }

    public final SSO copy(boolean z) {
        return new SSO(z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.bypass)};
    }

    public final boolean getBypass() {
        return this.bypass;
    }

    public SSO(boolean z) {
        this.bypass = z;
    }

    public /* synthetic */ SSO(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
