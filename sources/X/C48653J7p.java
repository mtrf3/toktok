package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.J7p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48653J7p implements InterfaceC80025Vav {
    public IDP LJLIL;

    @Override // X.InterfaceC80025Vav
    public final InterfaceC79968Va0 LJIJJLI() {
        return null;
    }

    public final IDP LIZIZ() {
        IDP idp = this.LJLIL;
        if (idp != null) {
            return idp;
        }
        o.LJIJI("playerController");
        throw null;
    }

    @Override // X.InterfaceC80025Vav
    public final EnumC79963VZv R() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // X.InterfaceC80025Vav
    public final V1L LIZ() {
        Aweme LJJIIZI = LIZIZ().LJJIIZI();
        if (LJJIIZI != null) {
            return C60903NvH.LIZIZ(LJJIIZI);
        }
        return null;
    }

    @Override // X.InterfaceC80025Vav
    public final V1L LIZJ() {
        Aweme LJJLIIJ = LIZIZ().LJJLIIJ();
        if (LJJLIIJ != null) {
            return C60903NvH.LIZIZ(LJJLIIJ);
        }
        return null;
    }

    @Override // X.InterfaceC80025Vav
    public final boolean LIZLLL() {
        if (LIZIZ().LJLLI() != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC80025Vav
    public final boolean LJFF() {
        if (LIZIZ().LJJLIIJ() != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC80025Vav
    public final V1L LJIIIIZZ() {
        Aweme LJLLI = LIZIZ().LJLLI();
        if (LJLLI != null) {
            return C60903NvH.LIZIZ(LJLLI);
        }
        return null;
    }

    @Override // X.InterfaceC80025Vav
    public final boolean LJIJI() {
        if (LIZIZ().LJJIIZI() != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC80025Vav
    public final void LJIIJ(V1L v1l, C48651J7n c48651J7n) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }
}
