package X;

import kotlin.jvm.internal.IDqS0S0301000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0Z8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Z8 {
    public static final boolean LIZIZ(int i, C10390ax c10390ax, C10390ax c10390ax2) {
        if (i == 3 || i == 4) {
            if (c10390ax.LIZLLL > c10390ax2.LIZIZ && c10390ax.LIZIZ < c10390ax2.LIZLLL) {
                return true;
            }
        } else if (i == 5 || i == 6) {
            if (c10390ax.LIZJ > c10390ax2.LIZ && c10390ax.LIZ < c10390ax2.LIZJ) {
                return true;
            }
        } else {
            "This function should only be used for 2-D focus search".toString();
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        return false;
    }

    public static final C51171zd LIZJ(C25710zf<C51171zd> c25710zf, C10390ax c10390ax, int i) {
        boolean z;
        C10390ax LIZJ;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LIZJ = c10390ax.LIZJ((c10390ax.LIZJ - c10390ax.LIZ) + 1, 0.0f);
        } else if (i == 4) {
            LIZJ = c10390ax.LIZJ(-((c10390ax.LIZJ - c10390ax.LIZ) + 1), 0.0f);
        } else if (i == 5) {
            LIZJ = c10390ax.LIZJ(0.0f, (c10390ax.LIZLLL - c10390ax.LIZIZ) + 1);
        } else if (i == 6) {
            LIZJ = c10390ax.LIZJ(0.0f, -((c10390ax.LIZLLL - c10390ax.LIZIZ) + 1));
        } else {
            "This function should only be used for 2-D focus search".toString();
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        int i2 = c25710zf.LJLJI;
        C51171zd c51171zd = null;
        if (i2 > 0) {
            C51171zd[] c51171zdArr = c25710zf.LJLIL;
            o.LJII(c51171zdArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i3 = 0;
            do {
                C51171zd c51171zd2 = c51171zdArr[i3];
                if (C0Z0.LJ(c51171zd2)) {
                    C10390ax LIZLLL = C0Z0.LIZLLL(c51171zd2);
                    if (LJFF(i, LIZLLL, c10390ax) && (!LJFF(i, LIZJ, c10390ax) || LIZ(c10390ax, LIZLLL, LIZJ, i) || (!LIZ(c10390ax, LIZJ, LIZLLL, i) && LJI(i, c10390ax, LIZLLL) < LJI(i, c10390ax, LIZJ)))) {
                        c51171zd = c51171zd2;
                        LIZJ = LIZLLL;
                    }
                }
                i3++;
            } while (i3 < i2);
        }
        return c51171zd;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZLLL(X.C51171zd r5, int r6, X.InterfaceC88472Yns<? super X.C51171zd, java.lang.Boolean> r7) {
        /*
            java.lang.String r0 = "$this$findChildCorrespondingToFocusEnter"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "onFound"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            X.1PD r0 = r5.LJLLI
            X.Yns<? super X.0Yt, X.0ZJ> r1 = r0.LJIIIZ
            X.0Yt r0 = new X.0Yt
            r0.<init>(r6)
            java.lang.Object r0 = r1.invoke(r0)
            X.0ZJ r0 = (X.C0ZJ) r0
            java.lang.Boolean r0 = r0.LIZ(r7)
            if (r0 == 0) goto L24
            boolean r0 = r0.booleanValue()
            return r0
        L24:
            X.0zf r3 = X.C0Z0.LIZ(r5)
            int r1 = r3.LJLJI
            r0 = 1
            r4 = 0
            if (r1 > r0) goto L46
            boolean r0 = r3.LJIIJ()
            if (r0 == 0) goto L35
        L34:
            return r4
        L35:
            T[] r0 = r3.LJLIL
            r0 = r0[r4]
            if (r0 == 0) goto L34
            java.lang.Object r0 = r7.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r4 = r0.booleanValue()
            goto L34
        L46:
            r0 = 7
            if (r6 != r0) goto L88
            r0 = 1
        L4a:
            r1 = 3
            if (r0 == 0) goto L6c
            r6 = 3
        L4e:
            X.0ax r0 = X.C0Z0.LIZLLL(r5)
            X.0ax r2 = new X.0ax
            float r1 = r0.LIZJ
            float r0 = r0.LIZLLL
            r2.<init>(r1, r0, r1, r0)
        L5b:
            X.1zd r0 = LIZJ(r3, r2, r6)
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r7.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r4 = r0.booleanValue()
        L6b:
            return r4
        L6c:
            r0 = 4
            if (r6 != r0) goto L7d
        L6f:
            X.0ax r0 = X.C0Z0.LIZLLL(r5)
            X.0ax r2 = new X.0ax
            float r1 = r0.LIZ
            float r0 = r0.LIZIZ
            r2.<init>(r1, r0, r1, r0)
            goto L5b
        L7d:
            r0 = 6
            if (r6 != r0) goto L81
            goto L6f
        L81:
            if (r6 != r1) goto L84
            goto L4e
        L84:
            r0 = 5
            if (r6 != r0) goto L8a
            goto L4e
        L88:
            r0 = 0
            goto L4a
        L8a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "This function should only be used for 2-D focus search"
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z8.LIZLLL(X.1zd, int, X.Yns):boolean");
    }

    public static final boolean LJFF(int i, C10390ax c10390ax, C10390ax c10390ax2) {
        if (i == 3) {
            float f = c10390ax2.LIZJ;
            float f2 = c10390ax.LIZJ;
            if ((f <= f2 && c10390ax2.LIZ < f2) || c10390ax2.LIZ <= c10390ax.LIZ) {
                return false;
            }
        } else if (i == 4) {
            float f3 = c10390ax2.LIZ;
            float f4 = c10390ax.LIZ;
            if ((f3 >= f4 && c10390ax2.LIZJ > f4) || c10390ax2.LIZJ >= c10390ax.LIZJ) {
                return false;
            }
        } else if (i == 5) {
            float f5 = c10390ax2.LIZLLL;
            float f6 = c10390ax.LIZLLL;
            if ((f5 <= f6 && c10390ax2.LIZIZ < f6) || c10390ax2.LIZIZ <= c10390ax.LIZIZ) {
                return false;
            }
        } else if (i == 6) {
            float f7 = c10390ax2.LIZIZ;
            float f8 = c10390ax.LIZIZ;
            if ((f7 >= f8 && c10390ax2.LIZLLL > f8) || c10390ax2.LIZLLL >= c10390ax.LIZLLL) {
                return false;
            }
        } else {
            "This function should only be used for 2-D focus search".toString();
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        return true;
    }

    public static final long LJI(int i, C10390ax c10390ax, C10390ax c10390ax2) {
        boolean z;
        float f;
        float f2;
        boolean z2;
        float f3;
        float f4;
        float f5;
        float f6;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = c10390ax.LIZ;
            f2 = c10390ax2.LIZJ;
        } else if (i == 4) {
            f = c10390ax2.LIZ;
            f2 = c10390ax.LIZJ;
        } else if (i == 5) {
            f = c10390ax.LIZIZ;
            f2 = c10390ax2.LIZLLL;
        } else if (i == 6) {
            f = c10390ax2.LIZIZ;
            f2 = c10390ax.LIZLLL;
        } else {
            "This function should only be used for 2-D focus search".toString();
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        long abs = Math.abs(Math.max(0.0f, f - f2));
        if (i == 3 || i == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            float f7 = c10390ax.LIZIZ;
            f3 = 2;
            f4 = ((c10390ax.LIZLLL - f7) / f3) + f7;
            f5 = c10390ax2.LIZIZ;
            f6 = c10390ax2.LIZLLL;
        } else if (i == 5 || i == 6) {
            float f8 = c10390ax.LIZ;
            f3 = 2;
            f4 = ((c10390ax.LIZJ - f8) / f3) + f8;
            f5 = c10390ax2.LIZ;
            f6 = c10390ax2.LIZJ;
        } else {
            "This function should only be used for 2-D focus search".toString();
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        long abs2 = Math.abs(f4 - (((f6 - f5) / f3) + f5));
        return (abs2 * abs2) + (13 * abs * abs);
    }

    public static final boolean LJIIIIZZ(C51171zd c51171zd, int i, IDqS416S0100000 iDqS416S0100000) {
        C1PB c1pb = c51171zd.LJLJJI;
        int[] iArr = C0Z7.LIZ;
        switch (iArr[c1pb.ordinal()]) {
            case 1:
            case 2:
                C51171zd c51171zd2 = c51171zd.LJLJJL;
                if (c51171zd2 != null) {
                    switch (iArr[c51171zd2.LJLJJI.ordinal()]) {
                        case 1:
                        case 2:
                            if (LJIIIIZZ(c51171zd2, i, iDqS416S0100000)) {
                                return true;
                            }
                            Boolean LIZ = c51171zd2.LJLLI.LJIIJ.invoke(new C09470Yt(i)).LIZ(iDqS416S0100000);
                            if (LIZ != null) {
                                return LIZ.booleanValue();
                            }
                            C1PB c1pb2 = c51171zd2.LJLJJI;
                            if (c1pb2 == C1PB.ActiveParent || c1pb2 == C1PB.DeactivatedParent) {
                                C51171zd LIZIZ = C0Z0.LIZIZ(c51171zd2);
                                if (LIZIZ != null) {
                                    return LJ(c51171zd, LIZIZ, i, iDqS416S0100000);
                                }
                                "ActiveParent must have a focusedChild".toString();
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            "Check failed.".toString();
                            throw new IllegalStateException("Check failed.");
                        case 3:
                        case 4:
                            return LJ(c51171zd, c51171zd2, i, iDqS416S0100000);
                        case 5:
                        case 6:
                            "ActiveParent must have a focusedChild".toString();
                            throw new IllegalStateException("ActiveParent must have a focusedChild");
                        default:
                            throw new C162476Zf();
                    }
                }
                "ActiveParent must have a focusedChild".toString();
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            case 3:
            case 4:
                return LIZLLL(c51171zd, i, iDqS416S0100000);
            case 5:
                return false;
            case 6:
                return ((Boolean) iDqS416S0100000.invoke(c51171zd)).booleanValue();
            default:
                throw new C162476Zf();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (r9.LIZ >= r11.LIZJ) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        if (r12 != 3) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r12 != 4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if (r12 != 3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        r1 = r9.LIZ;
        r0 = r10.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        r7 = java.lang.Math.max(0.0f, r1 - r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (r12 != 3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        r1 = r9.LIZ;
        r0 = r11.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (r7 >= java.lang.Math.max(1.0f, r1 - r0)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r12 != 4) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        r1 = r11.LIZJ;
        r0 = r9.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r12 != 5) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        r1 = r9.LIZIZ;
        r0 = r11.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        if (r12 != 6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        r1 = r11.LIZLLL;
        r0 = r9.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        "This function should only be used for 2-D focus search".toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
    
        if (r12 != 4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        r1 = r10.LIZ;
        r0 = r9.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        if (r12 != 5) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
    
        r1 = r9.LIZIZ;
        r0 = r10.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0069, code lost:
    
        if (r12 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:
    
        r1 = r10.LIZIZ;
        r0 = r9.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
    
        "This function should only be used for 2-D focus search".toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a4, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0023, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0078, code lost:
    
        if (r9.LIZJ <= r11.LIZ) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0083, code lost:
    
        if (r9.LIZIZ >= r11.LIZLLL) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
    
        if (r9.LIZLLL <= r11.LIZIZ) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZ(X.C10390ax r9, X.C10390ax r10, X.C10390ax r11, int r12) {
        /*
            boolean r0 = LIZIZ(r12, r11, r9)
            r8 = 0
            if (r0 != 0) goto Ld
            boolean r0 = LIZIZ(r12, r10, r9)
            if (r0 != 0) goto Le
        Ld:
            return r8
        Le:
            r6 = 3
            if (r12 != r6) goto L91
            r0 = 1
        L12:
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            r5 = 6
            r4 = 5
            r2 = 4
            if (r0 == 0) goto L70
            float r1 = r9.LIZ
            float r0 = r11.LIZJ
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L23
        L21:
            if (r12 != r6) goto L25
        L23:
            r8 = 1
            goto Ld
        L25:
            if (r12 != r2) goto L28
            goto L23
        L28:
            if (r12 != r6) goto L5b
            float r1 = r9.LIZ
            float r0 = r10.LIZJ
        L2e:
            float r1 = r1 - r0
            r0 = 0
            float r7 = java.lang.Math.max(r0, r1)
            if (r12 != r6) goto L46
            float r1 = r9.LIZ
            float r0 = r11.LIZ
        L3a:
            float r1 = r1 - r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.max(r0, r1)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto Ld
            goto L23
        L46:
            if (r12 != r2) goto L4d
            float r1 = r11.LIZJ
            float r0 = r9.LIZJ
            goto L3a
        L4d:
            if (r12 != r4) goto L54
            float r1 = r9.LIZIZ
            float r0 = r11.LIZIZ
            goto L3a
        L54:
            if (r12 != r5) goto L93
            float r1 = r11.LIZLLL
            float r0 = r9.LIZLLL
            goto L3a
        L5b:
            if (r12 != r2) goto L62
            float r1 = r10.LIZ
            float r0 = r9.LIZJ
            goto L2e
        L62:
            if (r12 != r4) goto L69
            float r1 = r9.LIZIZ
            float r0 = r10.LIZLLL
            goto L2e
        L69:
            if (r12 != r5) goto L9c
            float r1 = r10.LIZIZ
            float r0 = r9.LIZLLL
            goto L2e
        L70:
            if (r12 != r2) goto L7b
            float r1 = r9.LIZJ
            float r0 = r11.LIZ
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L23
            goto L21
        L7b:
            if (r12 != r4) goto L86
            float r1 = r9.LIZIZ
            float r0 = r11.LIZLLL
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L23
            goto L21
        L86:
            if (r12 != r5) goto La5
            float r1 = r9.LIZLLL
            float r0 = r11.LIZIZ
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L23
            goto L21
        L91:
            r0 = 0
            goto L12
        L93:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r3.toString()
            r0.<init>(r3)
            throw r0
        L9c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r3.toString()
            r0.<init>(r3)
            throw r0
        La5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r3.toString()
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z8.LIZ(X.0ax, X.0ax, X.0ax, int):boolean");
    }

    public static final boolean LJ(C51171zd c51171zd, C51171zd c51171zd2, int i, InterfaceC88472Yns<? super C51171zd, Boolean> interfaceC88472Yns) {
        if (LJII(c51171zd, c51171zd2, i, interfaceC88472Yns)) {
            return true;
        }
        Boolean bool = (Boolean) C78915Uy7.LJJIIZ(c51171zd, i, new IDqS0S0301000(c51171zd, c51171zd2, (C51171zd) i, (int) interfaceC88472Yns, (InterfaceC88472Yns<? super C51171zd, Boolean>) 2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean LJII(C51171zd c51171zd, C51171zd c51171zd2, int i, InterfaceC88472Yns<? super C51171zd, Boolean> interfaceC88472Yns) {
        C51171zd LIZJ;
        C25710zf<C51171zd> c25710zf = c51171zd.LJLJI;
        C25710zf c25710zf2 = new C25710zf(new C51171zd[c25710zf.LJLJI]);
        c25710zf2.LJ(c25710zf2.LJLJI, c25710zf);
        while (c25710zf2.LJIIJJI() && (LIZJ = LIZJ(c25710zf2, C0Z0.LIZLLL(c51171zd2), i)) != null) {
            if (!LIZJ.LJLJJI.isDeactivated()) {
                return interfaceC88472Yns.invoke(LIZJ).booleanValue();
            }
            Boolean LIZ = LIZJ.LJLLI.LJIIIZ.invoke(new C09470Yt(i)).LIZ(interfaceC88472Yns);
            if (LIZ != null) {
                return LIZ.booleanValue();
            }
            if (LJ(LIZJ, c51171zd2, i, interfaceC88472Yns)) {
                return true;
            }
            c25710zf2.LJIIL(LIZJ);
        }
        return false;
    }
}
