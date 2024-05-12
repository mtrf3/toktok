package com.ss.android.ugc.gamora.recorder.sticker.gallery;

import X.C0A2;
import X.C0A7;
import X.C0AA;
import X.C0AC;
import X.C28851Bh;
import X.C40141hq;
import X.C44058HQw;
import X.C74275TDb;
import X.C80096Vc4;
import X.C80117VcP;
import X.C90193gN;
import X.HR0;
import X.X1D;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class GalleryStickerLayoutManger extends C0A2 implements C0AA {
    public final boolean LJLZ;
    public int LJZ;
    public int LJZI;
    public int LJZL;
    public final C40141hq LL;
    public final HR0 LLD;
    public View LLF;
    public RecyclerView LLFF;
    public C44058HQw LLFFF;
    public float LLFII;
    public int LLFZ;
    public boolean LLI;

    @Override // X.C0A2
    public final boolean LJIJJLI() {
        return true;
    }

    static {
        C74275TDb.LIZ(5.0f);
    }

    @Override // X.C0A2
    public final RecyclerView.LayoutParams LJJIJL() {
        return new RecyclerView.LayoutParams(-2, -1);
    }

    public final int LLIIIL() {
        return (this.LJLLLLLL - getPaddingBottom()) - getPaddingTop();
    }

    public final void LLIIIZ() {
        int i = this.LJZL;
        if (i != -1) {
            this.LJZI = i;
        }
        int min = Math.min(Math.max(0, this.LJZI), LJJJJZ() - 1);
        this.LJZI = min;
        this.LJZ = min;
        this.LJZL = -1;
        View view = this.LLF;
        if (view != null) {
            view.setSelected(false);
            this.LLF = null;
        }
    }

    public GalleryStickerLayoutManger() {
        this(!C90193gN.LIZ());
    }

    public GalleryStickerLayoutManger(boolean z) {
        this.LJLZ = z;
        this.LJZL = -1;
        this.LL = new C40141hq();
        this.LLD = new HR0(this);
    }

    @Override // X.C0AA
    public final PointF LJII(int i) {
        int i2 = -1;
        if (!this.LJLZ ? LJJJI() != 0 && i >= this.LJZ : LJJJI() == 0 || i < this.LJZ) {
            i2 = 1;
        }
        return new PointF(i2, 0.0f);
    }

    @Override // X.C0A2
    public final void LJLJJI(C0A7 c0a7, C0AC c0ac) {
        Integer num;
        if (c0a7 == null || c0ac == null) {
            return;
        }
        if (LJJJJZ() == 0) {
            LLIIIZ();
            LJJIJIIJIL(c0a7);
            return;
        }
        if (c0ac.LJI) {
            return;
        }
        if (c0ac.LIZIZ() != 0 && !c0ac.LJFF) {
            return;
        }
        if (LJJJI() == 0 || c0ac.LJFF) {
            LLIIIZ();
        }
        this.LJZI = Math.min(Math.max(0, this.LJZI), LJJJJZ() - 1);
        LJJIJIIJIL(c0a7);
        LJJIJIIJIL(c0a7);
        C28851Bh c28851Bh = new C28851Bh(this);
        int LJIIJ = c28851Bh.LJIIJ();
        int LJI = c28851Bh.LJI();
        int i = this.LJZI;
        this.LLFII = (c28851Bh.LJI() - c28851Bh.LJIIJ()) / 2.0f;
        int LLIIIL = LLIIIL();
        View LJFF = c0a7.LJFF(this.LJZI);
        o.LJIIIIZZ(LJFF, "recycler.getViewForPosit…(initialSelectedPosition)");
        LJIJ(0, LJFF, false);
        LJJLIIIJL(0, 0, LJFF);
        int LJJJJL = LJJJJL(LJFF);
        int LJJJJJL = LJJJJJL(LJFF);
        int paddingTop = (int) (((LLIIIL - LJJJJJL) / 2.0f) + getPaddingTop());
        float f = this.LLFII;
        float f2 = LJJJJL / 2;
        Rect rect = new Rect((int) (f - f2), paddingTop, (int) (f + f2), LJJJJJL + paddingTop);
        C0A2.LJJLIIIJJI(LJFF, rect.left, rect.top, rect.right, rect.bottom);
        if (new C80117VcP().LIZ.get(i) == null) {
            new C80117VcP().LIZ.put(i, rect);
        } else {
            new C80117VcP().LIZ.get(i).set(rect);
        }
        this.LJZ = i;
        int LJ = c28851Bh.LJ(LJFF);
        int LIZIZ = c28851Bh.LIZIZ(LJFF);
        this.LLFZ = LJJJJL;
        if (this.LJLZ) {
            int LLIIIL2 = LLIIIL();
            for (int i2 = this.LJZI + 1; i2 < LJJJJZ() && LJ > LJIIJ; i2++) {
                View LJFF2 = c0a7.LJFF(i2);
                o.LJIIIIZZ(LJFF2, "recycler.getViewForPosition(i)");
                LJIIZILJ(LJFF2);
                LJJLIIIJL(0, 0, LJFF2);
                int paddingTop2 = (int) (((LLIIIL2 - r12) / 2.0f) + getPaddingTop());
                Rect rect2 = new Rect(LJ - LJJJJL(LJFF2), paddingTop2, LJ, LJJJJJL(LJFF2) + paddingTop2);
                C0A2.LJJLIIIJJI(LJFF2, rect2.left, rect2.top, rect2.right, rect2.bottom);
                LJ = LJFF2.getLeft();
                C80117VcP c80117VcP = new C80117VcP();
                if (c80117VcP.LIZ.get(i2) == null) {
                    c80117VcP.LIZ.put(i2, rect2);
                } else {
                    c80117VcP.LIZ.get(i2).set(rect2);
                }
            }
            int LLIIIL3 = LLIIIL();
            for (int i3 = this.LJZI - 1; i3 >= 0 && LIZIZ < LJI; i3--) {
                View LJFF3 = c0a7.LJFF(i3);
                o.LJIIIIZZ(LJFF3, "recycler.getViewForPosition(i)");
                LJIJ(0, LJFF3, false);
                LJJLIIIJL(0, 0, LJFF3);
                int paddingTop3 = (int) (((LLIIIL3 - r9) / 2.0f) + getPaddingTop());
                Rect rect3 = new Rect(LIZIZ, paddingTop3, LJJJJL(LJFF3) + LIZIZ, LJJJJJL(LJFF3) + paddingTop3);
                C0A2.LJJLIIIJJI(LJFF3, rect3.left, rect3.top, rect3.right, rect3.bottom);
                LIZIZ = LJFF3.getRight();
                this.LJZ = i3;
                if (new C80117VcP().LIZ.get(i3) == null) {
                    new C80117VcP().LIZ.put(i3, rect3);
                } else {
                    new C80117VcP().LIZ.get(i3).set(rect3);
                }
            }
        } else {
            int LLIIIL4 = LLIIIL();
            for (int i4 = this.LJZI - 1; i4 >= 0 && LJ > LJIIJ; i4--) {
                View LJFF4 = c0a7.LJFF(i4);
                o.LJIIIIZZ(LJFF4, "recycler.getViewForPosition(i)");
                LJIJ(0, LJFF4, false);
                LJJLIIIJL(0, 0, LJFF4);
                int paddingTop4 = (int) (((LLIIIL4 - r12) / 2.0f) + getPaddingTop());
                Rect rect4 = new Rect(LJ - LJJJJL(LJFF4), paddingTop4, LJ, LJJJJJL(LJFF4) + paddingTop4);
                C0A2.LJJLIIIJJI(LJFF4, rect4.left, rect4.top, rect4.right, rect4.bottom);
                LJ = rect4.left;
                this.LJZ = i4;
                C80117VcP c80117VcP2 = new C80117VcP();
                if (c80117VcP2.LIZ.get(i4) == null) {
                    c80117VcP2.LIZ.put(i4, rect4);
                } else {
                    c80117VcP2.LIZ.get(i4).set(rect4);
                }
            }
            int LLIIIL5 = LLIIIL();
            for (int i5 = this.LJZI + 1; i5 < LJJJJZ() && LIZIZ < LJI; i5++) {
                View LJFF5 = c0a7.LJFF(i5);
                o.LJIIIIZZ(LJFF5, "recycler.getViewForPosition(i)");
                LJIIZILJ(LJFF5);
                LJJLIIIJL(0, 0, LJFF5);
                int paddingTop5 = (int) (((LLIIIL5 - r9) / 2.0f) + getPaddingTop());
                Rect rect5 = new Rect(LIZIZ, paddingTop5, LJJJJL(LJFF5) + LIZIZ, LJJJJJL(LJFF5) + paddingTop5);
                C0A2.LJJLIIIJJI(LJFF5, rect5.left, rect5.top, rect5.right, rect5.bottom);
                LIZIZ = rect5.right;
                if (new C80117VcP().LIZ.get(i5) == null) {
                    new C80117VcP().LIZ.put(i5, rect5);
                } else {
                    new C80117VcP().LIZ.get(i5).set(rect5);
                }
            }
        }
        int LJJJI = LJJJI();
        for (int i6 = 0; i6 < LJJJI; i6++) {
            View LJJJ = LJJJ(i6);
            if (LJJJ != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("pendingOffset = ");
                LIZ.append(0);
                LIZ.append(",child.pos = ");
                RecyclerView recyclerView = this.LLFF;
                if (recyclerView != null) {
                    num = Integer.valueOf(recyclerView.indexOfChild(LJJJ));
                } else {
                    num = null;
                }
                LIZ.append(num);
                LIZ.append(" childOriginWidth / 2f = ");
                LIZ.append(this.LLFZ / 2);
                LIZ.append(", child.left =");
                LIZ.append(new C28851Bh(this).LJ(LJJJ));
                LIZ.append(", parentCenter = ");
                LIZ.append(this.LLFII);
                LIZ.append("distance = ");
                LIZ.append((new C28851Bh(this).LJ(LJJJ) + (this.LLFZ / 2)) - this.LLFII);
                X1D.LIZIZ(LIZ);
                new C28851Bh(this).LJ(LJJJ);
            }
        }
        RecyclerView recyclerView2 = this.LLFF;
        if (recyclerView2 == null) {
            return;
        }
        this.LLD.LJIILL(recyclerView2, 0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x039f, code lost:
    
        LJIJ(0, r4, false);
        LJJLIIIJL(0, 0, r4);
        r1 = (int) (((r15 - r2) / 2.0f) + getPaddingTop());
        r6.set(r3 - LJJJJL(r4), r1, r3, LJJJJJL(r4) + r1);
        X.C0A2.LJJLIIIJJI(r4, r6.left, r6.top, r6.right, r6.bottom);
        r3 = r6.left;
        r17.LJZ = r7;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0158, code lost:
    
        LJIJ(0, r7, false);
        LJJLIIIJL(0, 0, r7);
        r0 = (int) (((r14 - r2) / 2.0f) + getPaddingTop());
        r10.set(r3, r0, LJJJJL(r7) + r3, LJJJJJL(r7) + r0);
        X.C0A2.LJJLIIIJJI(r7, r10.left, r10.top, r10.right, r10.bottom);
        r3 = r10.right;
        r17.LJZ = r11;
        r11 = r11 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    @Override // X.C0A2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJZI(int r18, X.C0A7 r19, X.C0AC r20) {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.sticker.gallery.GalleryStickerLayoutManger.LJZI(int, X.0A7, X.0AC):int");
    }

    @Override // X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        o.LJIIIZ(recyclerView, "recyclerView");
        C80096Vc4 c80096Vc4 = new C80096Vc4(recyclerView.getContext());
        c80096Vc4.LIZ = i;
        LLIIIILZ(c80096Vc4);
    }
}
