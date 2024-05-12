package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EfQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36988EfQ implements InterfaceC37002Efe {
    @Override // X.InterfaceC37002Efe
    public final List<C36760Ebk> LIZ(String str) {
        C36991EfT c36991EfT = C36991EfT.LJ;
        if (c36991EfT != null) {
            return c36991EfT.LIZ(str);
        }
        return null;
    }

    @Override // X.InterfaceC37002Efe
    public final void LIZJ(String str) {
        C36991EfT c36991EfT = C36991EfT.LJ;
        if (c36991EfT != null) {
            c36991EfT.LIZJ(str);
        }
    }

    @Override // X.InterfaceC37002Efe
    public final C36760Ebk LIZIZ(C36758Ebi c36758Ebi, InterfaceC36765Ebp listener) {
        C36760Ebk LIZIZ;
        o.LJIIJ(listener, "listener");
        C36991EfT c36991EfT = C36991EfT.LJ;
        if (c36991EfT != null && (LIZIZ = c36991EfT.LIZIZ(c36758Ebi, listener)) != null) {
            return LIZIZ;
        }
        o.LJIIZILJ();
        throw null;
    }

    @Override // X.InterfaceC37002Efe
    public final C36760Ebk LIZLLL(C36758Ebi c36758Ebi, InterfaceC36765Ebp listener) {
        C36760Ebk LIZLLL;
        o.LJIIJ(listener, "listener");
        C36991EfT c36991EfT = C36991EfT.LJ;
        if (c36991EfT != null && (LIZLLL = c36991EfT.LIZLLL(c36758Ebi, listener)) != null) {
            return LIZLLL;
        }
        o.LJIIZILJ();
        throw null;
    }
}
