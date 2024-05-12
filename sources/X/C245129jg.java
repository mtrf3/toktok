package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9jg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245129jg extends F9E implements C33Q {
    public final EnumC245149ji LJLIL;
    public final EnumC245179jl LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C245129jg(EnumC245149ji dataType, EnumC245179jl loginType) {
        o.LJIIIZ(dataType, "dataType");
        o.LJIIIZ(loginType, "loginType");
        this.LJLIL = dataType;
        this.LJLILLLLZI = loginType;
    }
}
