package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1Cp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29191Cp extends C0A6 {
    public C29171Cn LJLIL;
    public final C0CM LJLILLLLZI;
    public final RecyclerView LJLJI;
    public final LinearLayoutManager LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public final C0CP LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;

    public final void LJIJ() {
        this.LJLJJL = 0;
        this.LJLJJLL = 0;
        C0CP c0cp = this.LJLJL;
        c0cp.LIZ = -1;
        c0cp.LIZIZ = 0.0f;
        c0cp.LIZJ = 0;
        this.LJLJLJ = -1;
        this.LJLJLLL = -1;
        this.LJLL = false;
        this.LJLLI = false;
        this.LJLLJ = false;
        this.LJLLILLLL = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (r3.LIZ.LJJJI() <= 1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0148, code lost:
    
        if (r7[r8 - 1][1] >= r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ() {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29191Cp.LJIJJ():void");
    }

    public C29191Cp(C0CM c0cm) {
        this.LJLILLLLZI = c0cm;
        C45681qm c45681qm = c0cm.LJLL;
        this.LJLJI = c45681qm;
        this.LJLJJI = (LinearLayoutManager) c45681qm.getLayoutManager();
        this.LJLJL = new C0CP();
        LJIJ();
    }

    public final void LJIILLIIL(int i) {
        C29171Cn c29171Cn = this.LJLIL;
        if (c29171Cn != null) {
            c29171Cn.LIZJ(i);
        }
    }

    public final void LJIIZILJ(int i) {
        if ((this.LJLJJL == 3 && this.LJLJJLL == 0) || this.LJLJJLL == i) {
            return;
        }
        this.LJLJJLL = i;
        C29171Cn c29171Cn = this.LJLIL;
        if (c29171Cn != null) {
            c29171Cn.LIZ(i);
        }
    }

    public final void LJIJI(boolean z) {
        int i;
        this.LJLLJ = z;
        if (z) {
            i = 4;
        } else {
            i = 1;
        }
        this.LJLJJL = i;
        int i2 = this.LJLJLLL;
        if (i2 != -1) {
            this.LJLJLJ = i2;
            this.LJLJLLL = -1;
        } else if (this.LJLJLJ == -1) {
            this.LJLJLJ = this.LJLJJI.LLILL();
        }
        LJIIZILJ(1);
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        boolean z;
        boolean z2;
        C29171Cn c29171Cn;
        int i2 = this.LJLJJL;
        if ((i2 != 1 || this.LJLJJLL != 1) && i == 1) {
            LJIJI(false);
            return;
        }
        if (i2 == 1 || i2 == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z && i == 2) {
            if (this.LJLLI) {
                LJIIZILJ(2);
                this.LJLL = true;
                return;
            }
            return;
        }
        if (i2 == 1 || i2 == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && i == 0) {
            LJIJJ();
            if (!this.LJLLI) {
                int i3 = this.LJLJL.LIZ;
                if (i3 != -1 && (c29171Cn = this.LJLIL) != null) {
                    c29171Cn.LIZIZ(i3, 0.0f, 0);
                }
            } else {
                C0CP c0cp = this.LJLJL;
                if (c0cp.LIZJ == 0) {
                    int i4 = this.LJLJLJ;
                    int i5 = c0cp.LIZ;
                    if (i4 != i5) {
                        LJIILLIIL(i5);
                    }
                }
            }
            LJIIZILJ(0);
            LJIJ();
        }
        if (this.LJLJJL == 2 && i == 0 && this.LJLLILLLL) {
            LJIJJ();
            C0CP c0cp2 = this.LJLJL;
            if (c0cp2.LIZJ == 0) {
                int i6 = this.LJLJLLL;
                int i7 = c0cp2.LIZ;
                if (i6 != i7) {
                    if (i7 == -1) {
                        i7 = 0;
                    }
                    LJIILLIIL(i7);
                }
                LJIIZILJ(0);
                LJIJ();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r1 == r0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    @Override // X.C0A6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(androidx.recyclerview.widget.RecyclerView r8, int r9, int r10) {
        /*
            r7 = this;
            r4 = 1
            r7.LJLLI = r4
            r7.LJIJJ()
            boolean r0 = r7.LJLL
            r5 = -1
            r3 = 0
            if (r0 == 0) goto L69
            r7.LJLL = r3
            if (r10 > 0) goto L22
            if (r10 != 0) goto L64
            if (r9 >= 0) goto L62
            r1 = 1
        L15:
            X.0CM r0 = r7.LJLILLLLZI
            X.1i9 r0 = r0.LJLJL
            int r0 = r0.LJJJJZI()
            if (r0 != r4) goto L60
            r0 = 1
        L20:
            if (r1 != r0) goto L64
        L22:
            X.0CP r1 = r7.LJLJL
            int r0 = r1.LIZJ
            if (r0 == 0) goto L64
            int r0 = r1.LIZ
            int r1 = r0 + 1
        L2c:
            r7.LJLJLLL = r1
            int r0 = r7.LJLJLJ
            if (r0 == r1) goto L35
            r7.LJIILLIIL(r1)
        L35:
            X.0CP r0 = r7.LJLJL
            int r6 = r0.LIZ
            if (r6 != r5) goto L3c
            r6 = 0
        L3c:
            float r2 = r0.LIZIZ
            int r1 = r0.LIZJ
            X.1Cn r0 = r7.LJLIL
            if (r0 == 0) goto L47
            r0.LIZIZ(r6, r2, r1)
        L47:
            X.0CP r2 = r7.LJLJL
            int r1 = r2.LIZ
            int r0 = r7.LJLJLLL
            if (r1 == r0) goto L51
            if (r0 != r5) goto L5f
        L51:
            int r0 = r2.LIZJ
            if (r0 != 0) goto L5f
            int r0 = r7.LJLJJLL
            if (r0 == r4) goto L5f
            r7.LJIIZILJ(r3)
            r7.LJIJ()
        L5f:
            return
        L60:
            r0 = 0
            goto L20
        L62:
            r1 = 0
            goto L15
        L64:
            X.0CP r0 = r7.LJLJL
            int r1 = r0.LIZ
            goto L2c
        L69:
            int r0 = r7.LJLJJL
            if (r0 != 0) goto L35
            X.0CP r0 = r7.LJLJL
            int r0 = r0.LIZ
            if (r0 != r5) goto L74
            r0 = 0
        L74:
            r7.LJIILLIIL(r0)
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29191Cp.LJIILL(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
