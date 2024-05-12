package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9Oc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C236029Oc extends F9E {
    public final long LJLIL;
    public final EnumC245179jl LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), this.LJLILLLLZI};
    }

    public C236029Oc(long j, EnumC245179jl loginType) {
        o.LJIIIZ(loginType, "loginType");
        this.LJLIL = j;
        this.LJLILLLLZI = loginType;
    }
}
