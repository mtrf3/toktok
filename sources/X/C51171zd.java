package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1zd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51171zd extends AbstractC014804a implements InterfaceC39641h2, InterfaceC39651h3<C51171zd>, C0DU, InterfaceC44911pX {
    public static final C51161zc LJLZ = C51161zc.LJLIL;
    public C51171zd LJLILLLLZI;
    public final C25710zf<C51171zd> LJLJI;
    public C1PB LJLJJI;
    public C51171zd LJLJJL;
    public C51151zb LJLJJLL;
    public AnonymousClass265<C38711fX> LJLJL;
    public C00E LJLJLJ;
    public InterfaceC273015i LJLJLLL;
    public C51281zo LJLL;
    public final C1PD LJLLI;
    public C51121zY LJLLILLLL;
    public AbstractC538029g LJLLJ;
    public boolean LJLLL;
    public C531626u LJLLLL;
    public final C25710zf<C531626u> LJLLLLLL;

    public C51171zd() {
        throw null;
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    @Override // X.InterfaceC39651h3
    public final C51171zd getValue() {
        return this;
    }

    @Override // X.C0DU
    public final boolean isValid() {
        if (this.LJLILLLLZI != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC39651h3
    public final C17R<C51171zd> getKey() {
        return C0ZD.LIZ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51171zd(X.C1PB r4) {
        /*
            r3 = this;
            X.1qA r1 = androidx.compose.ui.platform.g1.LIZ
            java.lang.String r0 = "initialFocus"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "inspectorInfo"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r3.<init>(r1)
            X.0zf r1 = new X.0zf
            r2 = 16
            X.1zd[] r0 = new X.C51171zd[r2]
            r1.<init>(r0)
            r3.LJLJI = r1
            r3.LJLJJI = r4
            X.1PD r0 = new X.1PD
            r0.<init>()
            r3.LJLLI = r0
            X.0zf r1 = new X.0zf
            X.26u[] r0 = new X.C531626u[r2]
            r1.<init>(r0)
            r3.LJLLLLLL = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51171zd.<init>(X.1PB):void");
    }

    public final void LIZ(C1PB value) {
        o.LJIIIZ(value, "value");
        this.LJLJJI = value;
        C51151zb c51151zb = this.LJLJJLL;
        if (c51151zb != null) {
            c51151zb.LIZJ();
        }
    }

    @Override // X.InterfaceC44911pX
    public final void LJJIZ(AbstractC538029g coordinates) {
        boolean z;
        o.LJIIIZ(coordinates, "coordinates");
        if (this.LJLLJ == null) {
            z = true;
        } else {
            z = false;
        }
        this.LJLLJ = coordinates;
        if (z) {
            C0ZH.LIZ(this);
        }
        if (this.LJLLL) {
            this.LJLLL = false;
            C09520Yy.LJFF(this);
        }
    }

    @Override // X.InterfaceC39641h2
    public final void LLJI(C00E scope) {
        C25710zf<C51171zd> c25710zf;
        C25710zf<C51171zd> c25710zf2;
        AbstractC538029g abstractC538029g;
        C29321Dc c29321Dc;
        C0DR c0dr;
        C0Z5 focusManager;
        o.LJIIIZ(scope, "scope");
        this.LJLJLJ = scope;
        C51171zd c51171zd = (C51171zd) scope.LJII(C0ZD.LIZ);
        if (!o.LJ(c51171zd, this.LJLILLLLZI)) {
            if (c51171zd == null) {
                int i = C0ZC.LIZ[this.LJLJJI.ordinal()];
                if ((i == 1 || i == 2) && (abstractC538029g = this.LJLLJ) != null && (c29321Dc = abstractC538029g.LJLJL) != null && (c0dr = c29321Dc.LJLJLJ) != null && (focusManager = c0dr.getFocusManager()) != null) {
                    focusManager.LIZIZ(true);
                }
            }
            C51171zd c51171zd2 = this.LJLILLLLZI;
            if (c51171zd2 != null && (c25710zf2 = c51171zd2.LJLJI) != null) {
                c25710zf2.LJIIL(this);
            }
            if (c51171zd != null && (c25710zf = c51171zd.LJLJI) != null) {
                c25710zf.LIZLLL(this);
            }
        }
        this.LJLILLLLZI = c51171zd;
        C51151zb c51151zb = (C51151zb) scope.LJII(C09500Yw.LIZ);
        if (!o.LJ(c51151zb, this.LJLJJLL)) {
            C51151zb c51151zb2 = this.LJLJJLL;
            if (c51151zb2 != null) {
                c51151zb2.LIZLLL(this);
            }
            if (c51151zb != null) {
                c51151zb.LIZ(this);
            }
        }
        this.LJLJJLL = c51151zb;
        C51121zY c51121zY = (C51121zY) scope.LJII(C09440Yq.LIZ);
        if (!o.LJ(c51121zY, this.LJLLILLLL)) {
            C51121zY c51121zY2 = this.LJLLILLLL;
            if (c51121zY2 != null) {
                c51121zY2.LIZLLL(this);
            }
            if (c51121zY != null) {
                c51121zY.LIZ(this);
            }
        }
        this.LJLLILLLL = c51121zY;
        this.LJLJL = (AnonymousClass265) scope.LJII(C14V.LIZ);
        this.LJLJLLL = (InterfaceC273015i) scope.LJII(C273115j.LIZ);
        this.LJLLLL = (C531626u) scope.LJII(C24900yM.LIZ);
        this.LJLL = (C51281zo) scope.LJII(C0ZH.LIZ);
        C0ZH.LIZ(this);
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }
}
