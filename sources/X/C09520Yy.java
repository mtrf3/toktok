package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0Yy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09520Yy {
    public static final void LIZ(C51171zd c51171zd) {
        o.LJIIIZ(c51171zd, "<this>");
        int i = C09510Yx.LIZ[c51171zd.LJLJJI.ordinal()];
        if (i != 4) {
            if (i != 5) {
                return;
            }
            c51171zd.LIZ(C1PB.ActiveParent);
            return;
        }
        c51171zd.LIZ(C1PB.Inactive);
    }

    public static final boolean LIZIZ(C51171zd c51171zd) {
        C51171zd c51171zd2 = c51171zd.LJLJJL;
        if (c51171zd2 != null) {
            if (!LIZJ(c51171zd2, false)) {
                return false;
            }
            c51171zd.LJLJJL = null;
            return true;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void LIZLLL(C51171zd c51171zd) {
        C29321Dc c29321Dc;
        C0DR c0dr;
        C0Z5 focusManager;
        o.LJIIIZ(c51171zd, "<this>");
        int i = C09510Yx.LIZ[c51171zd.LJLJJI.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 6) {
                    return;
                }
                c51171zd.LIZ(C1PB.Deactivated);
                return;
            }
            c51171zd.LIZ(C1PB.DeactivatedParent);
            return;
        }
        AbstractC538029g abstractC538029g = c51171zd.LJLLJ;
        if (abstractC538029g != null && (c29321Dc = abstractC538029g.LJLJL) != null && (c0dr = c29321Dc.LJLJLJ) != null && (focusManager = c0dr.getFocusManager()) != null) {
            focusManager.LIZIZ(true);
        }
        c51171zd.LIZ(C1PB.Deactivated);
    }

    public static final void LJ(C51171zd c51171zd) {
        C1PB c1pb;
        switch (C09510Yx.LIZ[c51171zd.LJLJJI.ordinal()]) {
            case 1:
            case 3:
            case 6:
                c1pb = C1PB.Active;
                break;
            case 2:
                c1pb = C1PB.Captured;
                break;
            case 4:
            case 5:
                "Granting focus to a deactivated node.".toString();
                throw new IllegalStateException("Granting focus to a deactivated node.");
            default:
                throw new C162476Zf();
        }
        c51171zd.LIZ(c1pb);
    }

    public static final void LJFF(C51171zd c51171zd) {
        C29321Dc c29321Dc;
        o.LJIIIZ(c51171zd, "<this>");
        AbstractC538029g abstractC538029g = c51171zd.LJLLJ;
        if (abstractC538029g == null || (c29321Dc = abstractC538029g.LJLJL) == null || c29321Dc.LJLJLJ == null) {
            c51171zd.LJLLL = true;
            return;
        }
        switch (C09510Yx.LIZ[c51171zd.LJLJJI.ordinal()]) {
            case 1:
            case 2:
                C51151zb c51151zb = c51171zd.LJLJJLL;
                if (c51151zb == null) {
                    return;
                }
                c51151zb.LIZJ();
                return;
            case 3:
                if (!LIZIZ(c51171zd)) {
                    return;
                }
                LJ(c51171zd);
                return;
            case 4:
            case 5:
                C0Z8.LIZLLL(c51171zd, 7, C51141za.LJLIL);
                return;
            case 6:
                C51171zd c51171zd2 = c51171zd.LJLILLLLZI;
                if (c51171zd2 != null) {
                    LJI(c51171zd2, c51171zd);
                    return;
                } else {
                    if (!LJII(c51171zd)) {
                        return;
                    }
                    LJ(c51171zd);
                    return;
                }
            default:
                return;
        }
    }

    public static final boolean LJII(C51171zd c51171zd) {
        C29321Dc c29321Dc;
        C0DR c0dr;
        AbstractC538029g abstractC538029g = c51171zd.LJLLJ;
        if (abstractC538029g != null && (c29321Dc = abstractC538029g.LJLJL) != null && (c0dr = c29321Dc.LJLJLJ) != null) {
            return c0dr.requestFocus();
        }
        "Owner not initialized.".toString();
        throw new IllegalStateException("Owner not initialized.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
    public static final boolean LIZJ(C51171zd c51171zd, boolean z) {
        o.LJIIIZ(c51171zd, "<this>");
        switch (C09510Yx.LIZ[c51171zd.LJLJJI.ordinal()]) {
            case 1:
                c51171zd.LIZ(C1PB.Inactive);
                return true;
            case 2:
                if (z) {
                    c51171zd.LIZ(C1PB.Inactive);
                    return z;
                }
                return z;
            case 3:
                if (LIZIZ(c51171zd)) {
                    c51171zd.LIZ(C1PB.Inactive);
                    return true;
                }
                return false;
            case 4:
            case 6:
                return true;
            case 5:
                if (LIZIZ(c51171zd)) {
                    c51171zd.LIZ(C1PB.Deactivated);
                    return true;
                }
                return false;
            default:
                throw new C162476Zf();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0012. Please report as an issue. */
    public static final boolean LJI(C51171zd c51171zd, C51171zd c51171zd2) {
        if (c51171zd.LJLJI.LJIIIIZZ(c51171zd2)) {
            switch (C09510Yx.LIZ[c51171zd.LJLJJI.ordinal()]) {
                case 1:
                    c51171zd.LIZ(C1PB.ActiveParent);
                    c51171zd.LJLJJL = c51171zd2;
                    LJ(c51171zd2);
                    return true;
                case 2:
                    return false;
                case 3:
                    if (LIZIZ(c51171zd)) {
                        c51171zd.LJLJJL = c51171zd2;
                        LJ(c51171zd2);
                        return true;
                    }
                    return false;
                case 4:
                    LIZ(c51171zd);
                    boolean LJI = LJI(c51171zd, c51171zd2);
                    LIZLLL(c51171zd);
                    return LJI;
                case 5:
                    if (c51171zd.LJLJJL == null) {
                        c51171zd.LJLJJL = c51171zd2;
                        LJ(c51171zd2);
                    } else {
                        if (LIZIZ(c51171zd)) {
                            c51171zd.LJLJJL = c51171zd2;
                            LJ(c51171zd2);
                        }
                        return false;
                    }
                    return true;
                case 6:
                    C51171zd c51171zd3 = c51171zd.LJLILLLLZI;
                    if (c51171zd3 == null) {
                        if (LJII(c51171zd)) {
                            c51171zd.LIZ(C1PB.Active);
                            return LJI(c51171zd, c51171zd2);
                        }
                    } else if (LJI(c51171zd3, c51171zd)) {
                        return LJI(c51171zd, c51171zd2);
                    }
                    return false;
                default:
                    throw new C162476Zf();
            }
        }
        "Non child node cannot request focus.".toString();
        throw new IllegalStateException("Non child node cannot request focus.");
    }
}
