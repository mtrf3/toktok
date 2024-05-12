package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EfO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36986EfO implements InterfaceC37002Efe {
    @Override // X.InterfaceC37002Efe
    public final List<C36760Ebk> LIZ(String str) {
        C36985EfN c36985EfN = C36985EfN.LIZLLL;
        if (c36985EfN != null) {
            return c36985EfN.LIZ(str);
        }
        return null;
    }

    @Override // X.InterfaceC37002Efe
    public final void LIZJ(String str) {
        C36985EfN c36985EfN = C36985EfN.LIZLLL;
        if (c36985EfN != null) {
            c36985EfN.LIZJ(str);
        }
    }

    @Override // X.InterfaceC37002Efe
    public final C36760Ebk LIZIZ(C36758Ebi c36758Ebi, InterfaceC36765Ebp listener) {
        C36760Ebk LIZIZ;
        o.LJIIJ(listener, "listener");
        C36985EfN c36985EfN = C36985EfN.LIZLLL;
        if (c36985EfN != null && (LIZIZ = c36985EfN.LIZIZ(c36758Ebi, listener)) != null) {
            return LIZIZ;
        }
        o.LJIIZILJ();
        throw null;
    }

    @Override // X.InterfaceC37002Efe
    public final C36760Ebk LIZLLL(C36758Ebi c36758Ebi, InterfaceC36765Ebp listener) {
        C36760Ebk LIZIZ;
        o.LJIIJ(listener, "listener");
        C36985EfN c36985EfN = C36985EfN.LIZLLL;
        if (c36985EfN != null && (LIZIZ = c36985EfN.LIZIZ(c36758Ebi, listener)) != null) {
            return LIZIZ;
        }
        o.LJIIZILJ();
        throw null;
    }
}
