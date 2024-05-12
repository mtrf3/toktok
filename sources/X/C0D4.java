package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0D4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0D4 {
    public final C29321Dc LIZ;
    public final C55952Hn LIZIZ;
    public AbstractC538029g LIZJ;
    public final C40461iM LIZLLL;
    public C1M3 LJ;
    public C25710zf<C1M2> LJFF;
    public C25710zf<C1M2> LJI;
    public C0D3 LJII;

    public final void LIZ() {
        for (C1M3 c1m3 = this.LJ; c1m3 != null; c1m3 = c1m3.LJLJJL) {
            if (!c1m3.LJLJL) {
                if (c1m3.LJLJJLL != null) {
                    c1m3.LJLJL = true;
                    c1m3.LJIIZILJ();
                } else {
                    "Check failed.".toString();
                    throw new IllegalStateException("Check failed.");
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        C1M3 c1m3 = this.LJ;
        if (c1m3 != this.LIZLLL) {
            while (true) {
                if (c1m3 == null || c1m3 == this.LIZLLL) {
                    break;
                }
                sb.append(String.valueOf(c1m3));
                if (c1m3.LJLJJL == this.LIZLLL) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                c1m3 = c1m3.LJLJJL;
            }
        } else {
            sb.append("]");
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public C0D4(C29321Dc layoutNode) {
        o.LJIIIZ(layoutNode, "layoutNode");
        this.LIZ = layoutNode;
        C55952Hn c55952Hn = new C55952Hn(layoutNode);
        this.LIZIZ = c55952Hn;
        this.LIZJ = c55952Hn;
        C40461iM c40461iM = c55952Hn.LLIIII;
        this.LIZLLL = c40461iM;
        this.LJ = c40461iM;
    }

    public static C1M3 LIZIZ(C1M2 c1m2, C1M3 c1m3) {
        C1M3 node;
        int i;
        if (c1m2 instanceof AbstractC40451iL) {
            node = ((AbstractC40451iL) c1m2).LIZ();
            o.LJIIIZ(node, "node");
            if (node instanceof C1DY) {
                i = 3;
            } else {
                i = 1;
            }
            if (node instanceof C1DP) {
                i |= 4;
            }
            if (node instanceof C1DT) {
                i |= 8;
            }
            if (node instanceof C1DO) {
                i |= 16;
            }
            if (node instanceof C17Q) {
                i |= 32;
            }
            if (node instanceof C1DN) {
                i |= 64;
            }
            if (node instanceof C1DX) {
                i |= 128;
            }
            if (node instanceof C1DQ) {
                i |= 256;
            }
            if (node instanceof InterfaceC40491iP) {
                i |= 512;
            }
            node.LJLILLLLZI = i;
        } else {
            node = new C45791qx(c1m2);
        }
        C1M3 c1m32 = c1m3.LJLJJI;
        if (c1m32 != null) {
            c1m32.LJLJJL = node;
            node.LJLJJI = c1m32;
        }
        c1m3.LJLJJI = node;
        node.LJLJJL = c1m3;
        return node;
    }

    public static C1M3 LIZLLL(C1M2 c1m2, C1M2 value, C1M3 c1m3) {
        if (!(c1m2 instanceof AbstractC40451iL) || !(value instanceof AbstractC40451iL)) {
            if (c1m3 instanceof C45791qx) {
                C45791qx c45791qx = (C45791qx) c1m3;
                c45791qx.getClass();
                o.LJIIIZ(value, "value");
                if (c45791qx.LJLJL) {
                    c45791qx.LJIJJLI();
                }
                c45791qx.LJLJLJ = value;
                c45791qx.LJLILLLLZI = C17J.LJIILL(value);
                if (c45791qx.LJLJL) {
                    c45791qx.LJIJI(false);
                }
                return c1m3;
            }
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        }
        o.LJII(c1m3, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        C1M3 LIZIZ = ((AbstractC40451iL) value).LIZIZ();
        if (LIZIZ != c1m3) {
            c1m3.LJIILLIIL();
            C1M3 c1m32 = c1m3.LJLJJI;
            if (c1m32 != null) {
                LIZIZ.LJLJJI = c1m32;
                c1m32.LJLJJL = LIZIZ;
                c1m3.LJLJJI = null;
            }
            C1M3 c1m33 = c1m3.LJLJJL;
            if (c1m33 != null) {
                LIZIZ.LJLJJL = c1m33;
                c1m33.LJLJJI = LIZIZ;
                c1m3.LJLJJL = null;
            }
            LIZIZ.LJLJJLL = c1m3.LJLJJLL;
        }
        return LIZIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01a5, code lost:
    
        r0 = r24 - r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01a7, code lost:
    
        if (r0 < r3) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a9, code lost:
    
        if (r0 > r4) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01af, code lost:
    
        if (r9[r25 + r0] < r2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b1, code lost:
    
        r7[0] = r2;
        r7[1] = r1;
        r7[2] = r13;
        r7[3] = r20;
        r7[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x021e, code lost:
    
        r14 = r14 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x018f, code lost:
    
        r2 = r19;
        r1 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x015f, code lost:
    
        r20 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x014f, code lost:
    
        r13 = r8[(r14 + 1) + r25];
        r2 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0234, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0230, code lost:
    
        r21 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0136, code lost:
    
        if ((r24 % 2) != 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0138, code lost:
    
        r21 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x013a, code lost:
    
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013b, code lost:
    
        if (r14 > r4) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x013d, code lost:
    
        if (r14 == r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x013f, code lost:
    
        if (r14 == r4) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014d, code lost:
    
        if (r8[(r14 + 1) + r25] >= r8[(r14 - 1) + r25]) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0226, code lost:
    
        r13 = r8[(r14 - 1) + r25];
        r2 = r13 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0156, code lost:
    
        r1 = r31 - ((r6 - r2) - r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x015b, code lost:
    
        if (r4 == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x015d, code lost:
    
        if (r2 == r13) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0222, code lost:
    
        r20 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0161, code lost:
    
        if (r2 <= r5) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0165, code lost:
    
        if (r1 <= r30) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0167, code lost:
    
        r19 = r2 - 1;
        r18 = r1 - 1;
        r17 = r10.LIZJ.LJLIL[r19];
        r16 = r10.LIZLLL.LJLIL[r18];
        kotlin.jvm.internal.o.LJIIIZ(r17, "prev");
        kotlin.jvm.internal.o.LJIIIZ(r16, "next");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x018d, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r17, r16) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x019c, code lost:
    
        if (r17.getClass() != r16.getClass()) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x019f, code lost:
    
        r8[r25 + r14] = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01a3, code lost:
    
        if (r21 == false) goto L145;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C25710zf<X.C1M2> r36, int r37, X.C25710zf<X.C1M2> r38, int r39, X.C1M3 r40) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D4.LIZJ(X.0zf, int, X.0zf, int, X.1M3):void");
    }
}
