package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Wut, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83811Wut implements InterfaceC83796Wue {
    public final /* synthetic */ C83808Wuq LIZ;

    @Override // X.InterfaceC83796Wue
    public final C29S getActivity() {
        C29S c29s = this.LIZ.LJLIL;
        if (c29s != null) {
            return c29s;
        }
        o.LJIJI("hostActivity");
        throw null;
    }

    @Override // X.InterfaceC83796Wue
    public final C83808Wuq LIZ() {
        return this.LIZ;
    }

    public C83811Wut(C83808Wuq c83808Wuq) {
        this.LIZ = c83808Wuq;
    }
}
