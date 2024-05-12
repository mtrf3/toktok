package X;

import kotlin.jvm.internal.IDqS0S0301000;
import kotlin.jvm.internal.o;

/* renamed from: X.0Z4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Z4 {
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x003a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0070 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZ(X.C51171zd r4, X.InterfaceC88472Yns<? super X.C51171zd, java.lang.Boolean> r5) {
        /*
            X.1PB r0 = r4.LJLJJI
            int[] r1 = X.C0Z3.LIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L2b;
                case 2: goto L2b;
                case 3: goto L26;
                case 4: goto L26;
                case 5: goto L26;
                case 6: goto L13;
                default: goto Ld;
            }
        Ld:
            X.6Zf r0 = new X.6Zf
            r0.<init>()
            throw r0
        L13:
            boolean r0 = LIZLLL(r4, r5)
            if (r0 != 0) goto L70
            java.lang.Object r0 = r5.invoke(r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L72
            goto L70
        L26:
            boolean r0 = LIZLLL(r4, r5)
            goto L71
        L2b:
            X.1zd r3 = r4.LJLJJL
            java.lang.String r2 = "ActiveParent must have a focusedChild"
            if (r3 == 0) goto L74
            X.1PB r0 = r3.LJLJJI
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 2
            switch(r0) {
                case 1: goto L5e;
                case 2: goto L51;
                case 3: goto L4c;
                case 4: goto L4c;
                case 5: goto L43;
                case 6: goto L43;
                default: goto L3d;
            }
        L3d:
            X.6Zf r0 = new X.6Zf
            r0.<init>()
            throw r0
        L43:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r2.toString()
            r0.<init>(r2)
            throw r0
        L4c:
            boolean r0 = LIZJ(r4, r3, r1, r5)
            goto L71
        L51:
            boolean r0 = LIZ(r3, r5)
            if (r0 != 0) goto L70
            boolean r0 = LIZJ(r4, r3, r1, r5)
            if (r0 == 0) goto L72
            goto L70
        L5e:
            boolean r0 = LIZ(r3, r5)
            if (r0 != 0) goto L70
            java.lang.Object r0 = r5.invoke(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L72
        L70:
            r0 = 1
        L71:
            return r0
        L72:
            r0 = 0
            goto L71
        L74:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r2.toString()
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z4.LIZ(X.1zd, X.Yns):boolean");
    }

    public static final boolean LIZIZ(C51171zd c51171zd, InterfaceC88472Yns<? super C51171zd, Boolean> interfaceC88472Yns) {
        switch (C0Z3.LIZ[c51171zd.LJLJJI.ordinal()]) {
            case 1:
            case 2:
                C51171zd c51171zd2 = c51171zd.LJLJJL;
                if (c51171zd2 != null) {
                    if (!LIZIZ(c51171zd2, interfaceC88472Yns) && !LIZJ(c51171zd, c51171zd2, 1, interfaceC88472Yns)) {
                        return false;
                    }
                    return true;
                }
                "ActiveParent must have a focusedChild".toString();
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            case 3:
            case 4:
            case 5:
                c51171zd.LJLJI.LJIIZILJ(C0Z2.LJLIL);
                C25710zf<C51171zd> c25710zf = c51171zd.LJLJI;
                int i = c25710zf.LJLJI;
                if (i <= 0) {
                    return false;
                }
                C51171zd[] c51171zdArr = c25710zf.LJLIL;
                o.LJII(c51171zdArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i2 = 0;
                do {
                    C51171zd c51171zd3 = c51171zdArr[i2];
                    if (C0Z0.LJ(c51171zd3) && LIZIZ(c51171zd3, interfaceC88472Yns)) {
                        return true;
                    }
                    i2++;
                } while (i2 < i);
                return false;
            case 6:
                return interfaceC88472Yns.invoke(c51171zd).booleanValue();
            default:
                throw new C162476Zf();
        }
    }

    public static final boolean LIZLLL(C51171zd c51171zd, InterfaceC88472Yns<? super C51171zd, Boolean> interfaceC88472Yns) {
        c51171zd.LJLJI.LJIIZILJ(C0Z2.LJLIL);
        C25710zf<C51171zd> c25710zf = c51171zd.LJLJI;
        int i = c25710zf.LJLJI;
        if (i > 0) {
            int i2 = i - 1;
            C51171zd[] c51171zdArr = c25710zf.LJLIL;
            o.LJII(c51171zdArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                C51171zd c51171zd2 = c51171zdArr[i2];
                if (C0Z0.LJ(c51171zd2) && LIZ(c51171zd2, interfaceC88472Yns)) {
                    return true;
                }
                i2--;
            } while (i2 >= 0);
            return false;
        }
        return false;
    }

    public static final boolean LIZJ(C51171zd c51171zd, C51171zd c51171zd2, int i, InterfaceC88472Yns<? super C51171zd, Boolean> interfaceC88472Yns) {
        if (LJ(c51171zd, c51171zd2, i, interfaceC88472Yns)) {
            return true;
        }
        Boolean bool = (Boolean) C78915Uy7.LJJIIZ(c51171zd, i, new IDqS0S0301000(c51171zd, c51171zd2, (C51171zd) i, (int) interfaceC88472Yns, (InterfaceC88472Yns<? super C51171zd, Boolean>) 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean LJ(C51171zd c51171zd, C51171zd c51171zd2, int i, InterfaceC88472Yns<? super C51171zd, Boolean> interfaceC88472Yns) {
        C1PB c1pb = c51171zd.LJLJJI;
        if (c1pb == C1PB.ActiveParent || c1pb == C1PB.DeactivatedParent) {
            c51171zd.LJLJI.LJIIZILJ(C0Z2.LJLIL);
            if (i == 1) {
                C25710zf<C51171zd> c25710zf = c51171zd.LJLJI;
                int i2 = new C40517FvF(0, c25710zf.LJLJI - 1).LJLILLLLZI;
                if (i2 >= 0) {
                    boolean z = false;
                    int i3 = 0;
                    while (true) {
                        if (o.LJ(c25710zf.LJLIL[i3], c51171zd2)) {
                            z = true;
                        }
                        if (i3 == i2) {
                            break;
                        }
                        i3++;
                        if (z) {
                            C51171zd c51171zd3 = c25710zf.LJLIL[i3];
                            if (C0Z0.LJ(c51171zd3) && LIZIZ(c51171zd3, interfaceC88472Yns)) {
                                return true;
                            }
                        }
                    }
                }
            } else if (i == 2) {
                C25710zf<C51171zd> c25710zf2 = c51171zd.LJLJI;
                int i4 = new C40517FvF(0, c25710zf2.LJLJI - 1).LJLILLLLZI;
                if (i4 >= 0) {
                    boolean z2 = false;
                    while (true) {
                        if (o.LJ(c25710zf2.LJLIL[i4], c51171zd2)) {
                            z2 = true;
                        }
                        if (i4 == 0) {
                            break;
                        }
                        i4--;
                        if (z2) {
                            C51171zd c51171zd4 = c25710zf2.LJLIL[i4];
                            if (C0Z0.LJ(c51171zd4) && LIZ(c51171zd4, interfaceC88472Yns)) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                "This function should only be used for 1-D focus search".toString();
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            if (i == 1 || c51171zd.LJLJJI == C1PB.DeactivatedParent || c51171zd.LJLILLLLZI == null) {
                return false;
            }
            return interfaceC88472Yns.invoke(c51171zd).booleanValue();
        }
        "This function should only be used within a parent that has focus.".toString();
        throw new IllegalStateException("This function should only be used within a parent that has focus.");
    }
}
