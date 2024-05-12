package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1qd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45591qd extends AbstractC65781Prl implements InterfaceC88472Yns<C29321Dc, Boolean> {
    public static final C45591qd LJLIL = new C45591qd();

    public C45591qd() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C29321Dc c29321Dc) {
        C1JY c1jy;
        C29321Dc it = c29321Dc;
        o.LJIIIZ(it, "it");
        C1DT LJIILLIIL = C1E4.LJIILLIIL(it);
        if (LJIILLIIL != null) {
            c1jy = C78598Ut0.LIZLLL(LJIILLIIL);
        } else {
            c1jy = null;
        }
        boolean z = false;
        if (c1jy != null && c1jy.LJLILLLLZI && c1jy.LJII(C0QY.LJII)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
