package X;

import android.view.KeyEvent;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.o;

/* renamed from: X.26u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C531626u implements InterfaceC39641h2, InterfaceC39651h3<C531626u>, InterfaceC44911pX {
    public final InterfaceC88472Yns<C24870yJ, Boolean> LJLIL;
    public final InterfaceC88472Yns<C24870yJ, Boolean> LJLILLLLZI;
    public C51171zd LJLJI;
    public C531626u LJLJJI;
    public C29321Dc LJLJJL;

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    @Override // X.InterfaceC39651h3
    public final C531626u getValue() {
        return this;
    }

    @Override // X.InterfaceC39651h3
    public final C17R<C531626u> getKey() {
        return C24900yM.LIZ;
    }

    public final boolean LIZ(KeyEvent keyEvent) {
        Boolean bool;
        o.LJIIIZ(keyEvent, "keyEvent");
        InterfaceC88472Yns<C24870yJ, Boolean> interfaceC88472Yns = this.LJLIL;
        if (interfaceC88472Yns != null) {
            bool = interfaceC88472Yns.invoke(new C24870yJ(keyEvent));
        } else {
            bool = null;
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            return bool.booleanValue();
        }
        C531626u c531626u = this.LJLJJI;
        if (c531626u != null) {
            return c531626u.LIZ(keyEvent);
        }
        return false;
    }

    public final boolean LIZIZ(KeyEvent keyEvent) {
        Boolean bool;
        o.LJIIIZ(keyEvent, "keyEvent");
        C531626u c531626u = this.LJLJJI;
        if (c531626u != null) {
            bool = Boolean.valueOf(c531626u.LIZIZ(keyEvent));
        } else {
            bool = null;
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            return bool.booleanValue();
        }
        InterfaceC88472Yns<C24870yJ, Boolean> interfaceC88472Yns = this.LJLILLLLZI;
        if (interfaceC88472Yns != null) {
            return interfaceC88472Yns.invoke(new C24870yJ(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC44911pX
    public final void LJJIZ(AbstractC538029g coordinates) {
        o.LJIIIZ(coordinates, "coordinates");
        this.LJLJJL = coordinates.LJLJL;
    }

    @Override // X.InterfaceC39641h2
    public final void LLJI(C00E scope) {
        C25710zf<C531626u> c25710zf;
        C25710zf<C531626u> c25710zf2;
        o.LJIIIZ(scope, "scope");
        C51171zd c51171zd = this.LJLJI;
        if (c51171zd != null && (c25710zf2 = c51171zd.LJLLLLLL) != null) {
            c25710zf2.LJIIL(this);
        }
        C51171zd c51171zd2 = (C51171zd) scope.LJII(C0ZD.LIZ);
        this.LJLJI = c51171zd2;
        if (c51171zd2 != null && (c25710zf = c51171zd2.LJLLLLLL) != null) {
            c25710zf.LIZLLL(this);
        }
        this.LJLJJI = (C531626u) scope.LJII(C24900yM.LIZ);
    }

    public C531626u(InterfaceC88472Yns interfaceC88472Yns, IDqS172S0200000 iDqS172S0200000) {
        this.LJLIL = interfaceC88472Yns;
        this.LJLILLLLZI = iDqS172S0200000;
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }
}
