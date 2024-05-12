package X;

import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowListUser;

/* renamed from: X.U2r, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76553U2r extends F9E implements InterfaceC73131Sn1 {
    public final ShowListUser LJLIL;
    public final boolean LJLILLLLZI;
    public final int LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI)};
    }

    @Override // X.InterfaceC73131Sn1
    public final boolean LLILLIZIL(Object obj) {
        if (!(obj instanceof C76553U2r)) {
            return false;
        }
        C76553U2r c76553U2r = (C76553U2r) obj;
        if (!U30.LIZIZ(c76553U2r.LJLIL, this.LJLIL) || c76553U2r.LJLILLLLZI != this.LJLILLLLZI || c76553U2r.LJLJI != this.LJLJI) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC73131Sn1
    public final boolean LLLLLLZ(Object obj) {
        return obj instanceof C76553U2r;
    }

    public C76553U2r(ShowListUser showListUser, boolean z, int i) {
        o.LJIIIZ(showListUser, "showListUser");
        this.LJLIL = showListUser;
        this.LJLILLLLZI = z;
        this.LJLJI = i;
    }
}
