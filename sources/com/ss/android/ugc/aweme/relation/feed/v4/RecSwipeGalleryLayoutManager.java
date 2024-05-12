package com.ss.android.ugc.aweme.relation.feed.v4;

import X.AbstractC03050Ab;
import X.C06460Ne;
import X.C0A2;
import X.C0A7;
import X.C0AA;
import X.C0AC;
import X.C221018lt;
import X.C221108m2;
import X.C28851Bh;
import X.C28861Bi;
import X.C40161hs;
import X.C57616MjM;
import X.C57690MkY;
import X.C62822Ol8;
import X.C77413UZt;
import X.C80079Vbn;
import X.C80110VcI;
import X.C80113VcL;
import X.X1D;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AqS112S0101000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class RecSwipeGalleryLayoutManager extends C0A2 implements C0AA {
    public int LJLZ;
    public int LJZ;
    public int LJZI;
    public View LL;
    public C80113VcL LLD;
    public C28851Bh LLFII;
    public C28861Bi LLFZ;
    public C77413UZt LLIFFJFJJ;
    public C57616MjM LLII;
    public RecyclerView LLIIII;
    public int LJZL = -1;
    public final C40161hs LLF = new C40161hs();
    public final C57690MkY LLFF = new C57690MkY(this);
    public final C62822Ol8 LLI = C221108m2.LIZIZ(new AqS112S0101000_14(this, 9));
    public final int LLFFF = 0;

    @Override // X.C0A2
    public final void LJLIL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }

    @Override // X.C0A2
    public final boolean LJIJJLI() {
        if (this.LLFFF == 0) {
            return true;
        }
        return false;
    }

    @Override // X.C0A2
    public final boolean LJIL() {
        if (this.LLFFF == 1) {
            return true;
        }
        return false;
    }

    @Override // X.C0A2
    public final RecyclerView.LayoutParams LJJIJL() {
        if (this.LLFFF == 1) {
            return new C80110VcI(-1, -2);
        }
        return new C80110VcI(-2, -1);
    }

    public final int LLIIJI() {
        return (this.LJLLLL - getPaddingRight()) - getPaddingLeft();
    }

    public final AbstractC03050Ab LLIIJLIL() {
        return (AbstractC03050Ab) this.LLI.getValue();
    }

    public final C80113VcL LLIIL() {
        if (this.LLD == null) {
            this.LLD = new C80113VcL();
        }
        return this.LLD;
    }

    public final int LLIILII() {
        return (this.LJLLLLLL - getPaddingBottom()) - getPaddingTop();
    }

    public final void LLIILZL() {
        SparseArray<Rect> sparseArray;
        C221018lt.LIZ("TTRecGalleryLayoutManager", "reset: ");
        C80113VcL c80113VcL = this.LLD;
        if (c80113VcL != null && (sparseArray = c80113VcL.LIZ) != null) {
            sparseArray.clear();
        }
        int i = this.LJZL;
        if (i != -1) {
            this.LJZI = i;
        }
        int min = Math.min(Math.max(0, this.LJZI), LJJJJZ() - 1);
        this.LJZI = min;
        this.LJLZ = min;
        this.LJZ = min;
        this.LJZL = -1;
        View view = this.LL;
        if (view != null) {
            view.setSelected(false);
            this.LL = null;
        }
    }

    @Override // X.C0AA
    public final PointF LJII(int i) {
        int i2 = -1;
        if (LJJJI() != 0 && i >= this.LJLZ) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (this.LLFFF == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = i2;
        }
        return pointF;
    }

    @Override // X.C0A2
    public final boolean LJJ(RecyclerView.LayoutParams lp) {
        o.LJIIIZ(lp, "lp");
        return lp instanceof C80110VcI;
    }

    @Override // X.C0A2
    public final RecyclerView.LayoutParams LJJIL(ViewGroup.LayoutParams lp) {
        o.LJIIIZ(lp, "lp");
        if (lp instanceof ViewGroup.MarginLayoutParams) {
            return new C80110VcI((ViewGroup.MarginLayoutParams) lp);
        }
        return new C80110VcI(lp);
    }

    @Override // X.C0A2
    public final RecyclerView.LayoutParams LJJIJLIJ(Context c, AttributeSet attrs) {
        o.LJIIIZ(c, "c");
        o.LJIIIZ(attrs, "attrs");
        return new C80110VcI(c, attrs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v13, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r10v17 */
    @Override // X.C0A2
    public final void LJLJJI(C0A7 recycler, C0AC state) {
        Integer num;
        Integer num2;
        SparseArray<Rect> sparseArray;
        SparseArray<Rect> sparseArray2;
        SparseArray<Rect> sparseArray3;
        SparseArray<Rect> sparseArray4;
        Rect rect;
        SparseArray<Rect> sparseArray5;
        SparseArray<Rect> sparseArray6;
        SparseArray<Rect> sparseArray7;
        Rect rect2;
        SparseArray<Rect> sparseArray8;
        SparseArray<Rect> sparseArray9;
        Rect rect3;
        C77413UZt c77413UZt;
        Integer num3;
        Integer num4;
        SparseArray<Rect> sparseArray10;
        SparseArray<Rect> sparseArray11;
        SparseArray<Rect> sparseArray12;
        SparseArray<Rect> sparseArray13;
        Rect rect4;
        SparseArray<Rect> sparseArray14;
        SparseArray<Rect> sparseArray15;
        SparseArray<Rect> sparseArray16;
        Rect rect5;
        SparseArray<Rect> sparseArray17;
        SparseArray<Rect> sparseArray18;
        Rect rect6;
        o.LJIIIZ(recycler, "recycler");
        o.LJIIIZ(state, "state");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLayoutChildren() called with: state = [");
        LIZ.append(state);
        LIZ.append(']');
        C221018lt.LIZ("TTRecGalleryLayoutManager", X1D.LIZIZ(LIZ));
        if (LJJJJZ() == 0) {
            LLIILZL();
            LJJIJIIJIL(recycler);
            return;
        }
        if (state.LJI) {
            return;
        }
        if (state.LIZIZ() != 0 && !state.LJFF) {
            C221018lt.LIZ("TTRecGalleryLayoutManager", "onLayoutChildren: ignore extra layout step");
            return;
        }
        if (LJJJI() == 0 || state.LJFF) {
            LLIILZL();
        }
        ?? r10 = 0;
        this.LJZI = Math.min(Math.max(0, this.LJZI), LJJJJZ() - 1);
        LJJIJIIJIL(recycler);
        if (this.LLFFF == 0) {
            LJJIJIIJIL(recycler);
            AbstractC03050Ab LLIIJLIL = LLIIJLIL();
            if (LLIIJLIL != null) {
                num3 = Integer.valueOf(LLIIJLIL.LJIIJ());
            } else {
                num3 = null;
            }
            AbstractC03050Ab LLIIJLIL2 = LLIIJLIL();
            if (LLIIJLIL2 != null) {
                num4 = Integer.valueOf(LLIIJLIL2.LJI());
            } else {
                num4 = null;
            }
            int i = this.LJZI;
            Rect rect7 = new Rect();
            int LLIILII = LLIILII();
            View LJFF = recycler.LJFF(this.LJZI);
            o.LJIIIIZZ(LJFF, "recycler.getViewForPosit…(initialSelectedPosition)");
            LJIJ(0, LJFF, false);
            LJJLIIIJL(0, 0, LJFF);
            int paddingTop = (int) (((LLIILII - r11) / 2.0f) + getPaddingTop());
            int LLIIJI = (int) (((LLIIJI() - r12) / 2.0f) + getPaddingLeft());
            rect7.set(LLIIJI, paddingTop, LJJJJL(LJFF) + LLIIJI, LJJJJJL(LJFF) + paddingTop);
            C0A2.LJJLIIIJJI(LJFF, rect7.left, rect7.top, rect7.right, rect7.bottom);
            C80113VcL LLIIL = LLIIL();
            if (LLIIL == null || (sparseArray17 = LLIIL.LIZ) == null || sparseArray17.get(i) == null) {
                C80113VcL LLIIL2 = LLIIL();
                if (LLIIL2 != null && (sparseArray10 = LLIIL2.LIZ) != null) {
                    sparseArray10.put(i, rect7);
                }
            } else {
                C80113VcL LLIIL3 = LLIIL();
                if (LLIIL3 != null && (sparseArray18 = LLIIL3.LIZ) != null && (rect6 = sparseArray18.get(i)) != null) {
                    rect6.set(rect7);
                }
            }
            this.LJZ = i;
            this.LJLZ = i;
            int left = LJFF.getLeft() - C0A2.LJJJLIIL(LJFF);
            int LJJJZ = C0A2.LJJJZ(LJFF) + LJFF.getRight();
            if (num3 != null) {
                int i2 = this.LJZI - 1;
                int intValue = num3.intValue();
                Rect rect8 = new Rect();
                int LLIILII2 = LLIILII();
                while (i2 >= 0 && left > intValue) {
                    View LJFF2 = recycler.LJFF(i2);
                    o.LJIIIIZZ(LJFF2, "recycler.getViewForPosition(i)");
                    LJIJ(r10, LJFF2, r10);
                    LJJLIIIJL(r10, r10, LJFF2);
                    int paddingTop2 = (int) (((LLIILII2 - r11) / 2.0f) + getPaddingTop());
                    rect8.set(left - LJJJJL(LJFF2), paddingTop2, left, LJJJJJL(LJFF2) + paddingTop2);
                    C0A2.LJJLIIIJJI(LJFF2, rect8.left, rect8.top, rect8.right, rect8.bottom);
                    left = rect8.left;
                    this.LJLZ = i2;
                    C80113VcL LLIIL4 = LLIIL();
                    if (LLIIL4 == null || (sparseArray15 = LLIIL4.LIZ) == null || sparseArray15.get(i2) == null) {
                        C80113VcL LLIIL5 = LLIIL();
                        if (LLIIL5 != null && (sparseArray14 = LLIIL5.LIZ) != null) {
                            sparseArray14.put(i2, rect8);
                        }
                    } else {
                        C80113VcL LLIIL6 = LLIIL();
                        if (LLIIL6 != null && (sparseArray16 = LLIIL6.LIZ) != null && (rect5 = sparseArray16.get(i2)) != null) {
                            rect5.set(rect8);
                        }
                    }
                    i2--;
                    r10 = 0;
                }
            }
            if (num4 != null) {
                int intValue2 = num4.intValue();
                Rect rect9 = new Rect();
                int LLIILII3 = LLIILII();
                for (int i3 = this.LJZI + 1; i3 < LJJJJZ() && LJJJZ < intValue2; i3++) {
                    View LJFF3 = recycler.LJFF(i3);
                    o.LJIIIIZZ(LJFF3, "recycler.getViewForPosition(i)");
                    LJIIZILJ(LJFF3);
                    LJJLIIIJL(0, 0, LJFF3);
                    int paddingTop3 = (int) (((LLIILII3 - r10) / 2.0f) + getPaddingTop());
                    rect9.set(LJJJZ, paddingTop3, LJJJJL(LJFF3) + LJJJZ, LJJJJJL(LJFF3) + paddingTop3);
                    C0A2.LJJLIIIJJI(LJFF3, rect9.left, rect9.top, rect9.right, rect9.bottom);
                    LJJJZ = rect9.right;
                    this.LJZ = i3;
                    C80113VcL LLIIL7 = LLIIL();
                    if (LLIIL7 == null || (sparseArray12 = LLIIL7.LIZ) == null || sparseArray12.get(i3) == null) {
                        C80113VcL LLIIL8 = LLIIL();
                        if (LLIIL8 != null && (sparseArray11 = LLIIL8.LIZ) != null) {
                            sparseArray11.put(i3, rect9);
                        }
                    } else {
                        C80113VcL LLIIL9 = LLIIL();
                        if (LLIIL9 != null && (sparseArray13 = LLIIL9.LIZ) != null && (rect4 = sparseArray13.get(i3)) != null) {
                            rect4.set(rect9);
                        }
                    }
                }
            }
        } else {
            LJJIJIIJIL(recycler);
            AbstractC03050Ab LLIIJLIL3 = LLIIJLIL();
            if (LLIIJLIL3 != null) {
                num = Integer.valueOf(LLIIJLIL3.LJIIJ());
            } else {
                num = null;
            }
            AbstractC03050Ab LLIIJLIL4 = LLIIJLIL();
            if (LLIIJLIL4 != null) {
                num2 = Integer.valueOf(LLIIJLIL4.LJI());
            } else {
                num2 = null;
            }
            int i4 = this.LJZI;
            Rect rect10 = new Rect();
            int LLIIJI2 = LLIIJI();
            View LJFF4 = recycler.LJFF(this.LJZI);
            o.LJIIIIZZ(LJFF4, "recycler.getViewForPosit…(initialSelectedPosition)");
            LJIJ(0, LJFF4, false);
            LJJLIIIJL(0, 0, LJFF4);
            int paddingLeft = (int) (((LLIIJI2 - r11) / 2.0f) + getPaddingLeft());
            int LLIILII4 = (int) (((LLIILII() - r10) / 2.0f) + getPaddingTop());
            rect10.set(paddingLeft, LLIILII4, LJJJJL(LJFF4) + paddingLeft, LJJJJJL(LJFF4) + LLIILII4);
            C0A2.LJJLIIIJJI(LJFF4, rect10.left, rect10.top, rect10.right, rect10.bottom);
            C80113VcL LLIIL10 = LLIIL();
            if (LLIIL10 == null || (sparseArray8 = LLIIL10.LIZ) == null || sparseArray8.get(i4) == null) {
                C80113VcL LLIIL11 = LLIIL();
                if (LLIIL11 != null && (sparseArray = LLIIL11.LIZ) != null) {
                    sparseArray.put(i4, rect10);
                }
            } else {
                C80113VcL LLIIL12 = LLIIL();
                if (LLIIL12 != null && (sparseArray9 = LLIIL12.LIZ) != null && (rect3 = sparseArray9.get(i4)) != null) {
                    rect3.set(rect10);
                }
            }
            this.LJZ = i4;
            this.LJLZ = i4;
            int top = LJFF4.getTop() - C0A2.LJJLI(LJFF4);
            int LJJIZ = C0A2.LJJIZ(LJFF4) + LJFF4.getBottom();
            if (num != null) {
                int intValue3 = num.intValue();
                Rect rect11 = new Rect();
                int LLIIJI3 = LLIIJI();
                for (int i5 = this.LJZI - 1; i5 >= 0 && top > intValue3; i5--) {
                    View LJFF5 = recycler.LJFF(i5);
                    o.LJIIIIZZ(LJFF5, "recycler.getViewForPosition(i)");
                    LJIJ(0, LJFF5, false);
                    LJJLIIIJL(0, 0, LJFF5);
                    int LJJJJL = LJJJJL(LJFF5);
                    int paddingLeft2 = (int) (((LLIIJI3 - LJJJJL) / 2.0f) + getPaddingLeft());
                    rect11.set(paddingLeft2, top - LJJJJJL(LJFF5), LJJJJL + paddingLeft2, top);
                    C0A2.LJJLIIIJJI(LJFF5, rect11.left, rect11.top, rect11.right, rect11.bottom);
                    top = rect11.top;
                    this.LJLZ = i5;
                    C80113VcL LLIIL13 = LLIIL();
                    if (LLIIL13 == null || (sparseArray6 = LLIIL13.LIZ) == null || sparseArray6.get(i5) == null) {
                        C80113VcL LLIIL14 = LLIIL();
                        if (LLIIL14 != null && (sparseArray5 = LLIIL14.LIZ) != null) {
                            sparseArray5.put(i5, rect11);
                        }
                    } else {
                        C80113VcL LLIIL15 = LLIIL();
                        if (LLIIL15 != null && (sparseArray7 = LLIIL15.LIZ) != null && (rect2 = sparseArray7.get(i5)) != null) {
                            rect2.set(rect11);
                        }
                    }
                }
            }
            if (num2 != null) {
                int intValue4 = num2.intValue();
                Rect rect12 = new Rect();
                int LLIIJI4 = LLIIJI();
                for (int i6 = this.LJZI + 1; i6 < LJJJJZ() && LJJIZ < intValue4; i6++) {
                    View LJFF6 = recycler.LJFF(i6);
                    o.LJIIIIZZ(LJFF6, "recycler.getViewForPosition(i)");
                    LJIIZILJ(LJFF6);
                    LJJLIIIJL(0, 0, LJFF6);
                    int paddingLeft3 = (int) (((LLIIJI4 - r12) / 2.0f) + getPaddingLeft());
                    rect12.set(paddingLeft3, LJJIZ, LJJJJL(LJFF6) + paddingLeft3, LJJJJJL(LJFF6) + LJJIZ);
                    C0A2.LJJLIIIJJI(LJFF6, rect12.left, rect12.top, rect12.right, rect12.bottom);
                    LJJIZ = rect12.bottom;
                    this.LJZ = i6;
                    C80113VcL LLIIL16 = LLIIL();
                    if (LLIIL16 == null || (sparseArray3 = LLIIL16.LIZ) == null || sparseArray3.get(i6) == null) {
                        C80113VcL LLIIL17 = LLIIL();
                        if (LLIIL17 != null && (sparseArray2 = LLIIL17.LIZ) != null) {
                            sparseArray2.put(i6, rect12);
                        }
                    } else {
                        C80113VcL LLIIL18 = LLIIL();
                        if (LLIIL18 != null && (sparseArray4 = LLIIL18.LIZ) != null && (rect = sparseArray4.get(i6)) != null) {
                            rect.set(rect12);
                        }
                    }
                }
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("firstFillCover finish:first: ");
        LIZ2.append(this.LJLZ);
        LIZ2.append(",last:");
        LIZ2.append(this.LJZ);
        C221018lt.LIZ("TTRecGalleryLayoutManager", X1D.LIZIZ(LIZ2));
        if (this.LLIFFJFJJ != null) {
            int LJJJI = LJJJI();
            for (int i7 = 0; i7 < LJJJI; i7++) {
                View LJJJ = LJJJ(i7);
                if (LJJJ != null && (c77413UZt = this.LLIFFJFJJ) != null) {
                    c77413UZt.LJJIIZI(LJJJ, LLIIIL(LJJJ, 0));
                }
            }
        }
        RecyclerView recyclerView = this.LLIIII;
        if (recyclerView != null) {
            this.LLFF.LJIILL(recyclerView, 0, 0);
        }
    }

    public final float LLIIIL(View view, float f) {
        float height;
        int top;
        int height2;
        AbstractC03050Ab LLIIJLIL = LLIIJLIL();
        int LJIIJ = LLIIJLIL.LJIIJ() + ((LLIIJLIL.LJI() - LLIIJLIL.LJIIJ()) / 2);
        if (this.LLFFF == 0) {
            height = (view.getWidth() / 2) - f;
            top = view.getLeft();
        } else {
            height = (view.getHeight() / 2) - f;
            top = view.getTop();
        }
        int i = (int) ((height + top) - LJIIJ);
        if (this.LLFFF == 0) {
            height2 = view.getWidth();
        } else {
            height2 = view.getHeight();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("calculateToCenterFraction: distance:");
        LIZ.append(i);
        LIZ.append(",childLength:");
        LIZ.append(height2);
        C221018lt.LIZ("TTRecGalleryLayoutManager", X1D.LIZIZ(LIZ));
        return Math.max(-1.0f, Math.min(1.0f, (i * 1.0f) / height2));
    }

    public final void LLIIIZ(int i, C0A7 c0a7) {
        int i2;
        Rect rect;
        SparseArray<Rect> sparseArray;
        SparseArray<Rect> sparseArray2;
        View LJJJ;
        int i3;
        SparseArray<Rect> sparseArray3;
        SparseArray<Rect> sparseArray4;
        View LJJJ2;
        C77413UZt c77413UZt;
        int i4;
        Rect rect2;
        SparseArray<Rect> sparseArray5;
        SparseArray<Rect> sparseArray6;
        int i5;
        Rect rect3;
        SparseArray<Rect> sparseArray7;
        SparseArray<Rect> sparseArray8;
        if (LJJJJZ() == 0) {
            return;
        }
        if (this.LLFFF == 0) {
            int LJIIJ = LLIIJLIL().LJIIJ();
            int LJI = LLIIJLIL().LJI();
            StringBuilder LIZJ = C06460Ne.LIZJ("fillWithHorizontal() called with: dx = [", i, "],leftEdge:", LJIIJ, ",rightEdge:");
            LIZJ.append(LJI);
            String msg = X1D.LIZIZ(LIZJ);
            o.LJIIIZ(msg, "msg");
            if (LJJJI() > 0) {
                if (i >= 0) {
                    int LJJJI = LJJJI();
                    int i6 = 0;
                    View view = null;
                    for (int i7 = 0; i7 < LJJJI; i7++) {
                        View LJJJ3 = LJJJ(i7 + i6);
                        if (LJJJ3 != null) {
                            view = LJJJ3;
                        } else if (view == null) {
                            o.LJIJI("child");
                            throw null;
                        }
                        if ((C0A2.LJJJZ(view) + view.getRight()) - i >= LJIIJ) {
                            break;
                        }
                        LJLLL(view, c0a7);
                        this.LJLZ++;
                        i6--;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("fillWithHorizontal:removeAndRecycleView:");
                        LIZ.append(C0A2.LJJJLL(view));
                        LIZ.append(" mFirstVisiblePosition change to:");
                        LIZ.append(this.LJLZ);
                        String msg2 = X1D.LIZIZ(LIZ);
                        o.LJIIIZ(msg2, "msg");
                    }
                } else {
                    int LJJJI2 = LJJJI() - 1;
                    View view2 = null;
                    for (int i8 = -1; i8 < LJJJI2; i8 = -1) {
                        View LJJJ4 = LJJJ(LJJJI2);
                        if (LJJJ4 != null) {
                            view2 = LJJJ4;
                        } else if (view2 == null) {
                            o.LJIJI("child");
                            throw null;
                        }
                        if ((view2.getLeft() - C0A2.LJJJLIIL(view2)) - i > LJI) {
                            LJLLL(view2, c0a7);
                            this.LJZ--;
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("fillWithHorizontal:removeAndRecycleView:");
                            LIZ2.append(C0A2.LJJJLL(view2));
                            LIZ2.append("mLastVisiblePos change to:");
                            LIZ2.append(this.LJZ);
                            String msg3 = X1D.LIZIZ(LIZ2);
                            o.LJIIIZ(msg3, "msg");
                        }
                        LJJJI2--;
                    }
                }
            }
            int i9 = this.LJLZ;
            int LLIILII = LLIILII();
            if (i >= 0) {
                if (LJJJI() != 0) {
                    View LJJJ5 = LJJJ(LJJJI() - 1);
                    if (LJJJ5 != null) {
                        i9 = C0A2.LJJJLL(LJJJ5) + 1;
                        i5 = C0A2.LJJJZ(LJJJ5) + LJJJ5.getRight();
                    } else {
                        i5 = -1;
                    }
                    StringBuilder LIZJ2 = C06460Ne.LIZJ("fillWithHorizontal:to right startPosition:", i9, ",startOffset:", i5, ",rightEdge:");
                    LIZJ2.append(LJI);
                    C221018lt.LIZ("TTRecGalleryLayoutManager", X1D.LIZIZ(LIZJ2));
                } else {
                    i5 = -1;
                }
                for (int i10 = i9; i10 < LJJJJZ() && i5 < LJI + i; i10++) {
                    C80113VcL LLIIL = LLIIL();
                    if (LLIIL != null && (sparseArray8 = LLIIL.LIZ) != null) {
                        rect3 = sparseArray8.get(i10);
                    } else {
                        rect3 = null;
                    }
                    View LJFF = c0a7.LJFF(i10);
                    o.LJIIIIZZ(LJFF, "recycler.getViewForPosition(i)");
                    LJIIZILJ(LJFF);
                    if (rect3 == null) {
                        rect3 = new Rect();
                        C80113VcL LLIIL2 = LLIIL();
                        if (LLIIL2 != null && (sparseArray7 = LLIIL2.LIZ) != null) {
                            sparseArray7.put(i10, rect3);
                        }
                    }
                    LJJLIIIJL(0, 0, LJFF);
                    int LJJJJL = LJJJJL(LJFF);
                    int LJJJJJL = LJJJJJL(LJFF);
                    int paddingTop = (int) (((LLIILII - LJJJJJL) / 2.0f) + getPaddingTop());
                    if (i5 == -1 && i9 == 0) {
                        int LLIIJI = (int) (((LLIIJI() - LJJJJL) / 2.0f) + getPaddingLeft());
                        rect3.set(LLIIJI, paddingTop, LJJJJL + LLIIJI, LJJJJJL + paddingTop);
                    } else {
                        rect3.set(i5, paddingTop, LJJJJL + i5, LJJJJJL + paddingTop);
                    }
                    C0A2.LJJLIIIJJI(LJFF, rect3.left, rect3.top, rect3.right, rect3.bottom);
                    i5 = rect3.right;
                    this.LJZ = i10;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("fillWithHorizontal,layout:mLastVisiblePos: ");
                    LIZ3.append(this.LJZ);
                    C221018lt.LIZ("TTRecGalleryLayoutManager", X1D.LIZIZ(LIZ3));
                }
            } else {
                if (LJJJI() > 0) {
                    View LJJJ6 = LJJJ(0);
                    if (LJJJ6 != null) {
                        i9 = C0A2.LJJJLL(LJJJ6) - 1;
                        i4 = LJJJ6.getLeft() - C0A2.LJJJLIIL(LJJJ6);
                    } else {
                        i4 = -1;
                    }
                    StringBuilder LIZJ3 = C06460Ne.LIZJ("fillWithHorizontal:to left startPosition:", i9, ",startOffset:", i4, ",leftEdge:");
                    LIZJ3.append(LJIIJ);
                    LIZJ3.append(",child count:");
                    LIZJ3.append(LJJJI());
                    C221018lt.LIZ("TTRecGalleryLayoutManager", X1D.LIZIZ(LIZJ3));
                } else {
                    i4 = -1;
                }
                while (i9 >= 0 && i4 > LJIIJ + i) {
                    C80113VcL LLIIL3 = LLIIL();
                    if (LLIIL3 != null && (sparseArray6 = LLIIL3.LIZ) != null) {
                        rect2 = sparseArray6.get(i9);
                    } else {
                        rect2 = null;
                    }
                    View LJFF2 = c0a7.LJFF(i9);
                    o.LJIIIIZZ(LJFF2, "recycler.getViewForPosition(i)");
                    LJIJ(0, LJFF2, false);
                    if (rect2 == null) {
                        rect2 = new Rect();
                        C80113VcL LLIIL4 = LLIIL();
                        if (LLIIL4 != null && (sparseArray5 = LLIIL4.LIZ) != null) {
                            sparseArray5.put(i9, rect2);
                        }
                    }
                    LJJLIIIJL(0, 0, LJFF2);
                    int paddingTop2 = (int) (((LLIILII - r12) / 2.0f) + getPaddingTop());
                    rect2.set(i4 - LJJJJL(LJFF2), paddingTop2, i4, LJJJJJL(LJFF2) + paddingTop2);
                    C0A2.LJJLIIIJJI(LJFF2, rect2.left, rect2.top, rect2.right, rect2.bottom);
                    i4 = rect2.left;
                    this.LJLZ = i9;
                    i9--;
                }
            }
        } else {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("fillWithVertical: dy:");
            LIZ4.append(i);
            C221018lt.LIZ("TTRecGalleryLayoutManager", X1D.LIZIZ(LIZ4));
            int LJIIJ2 = LLIIJLIL().LJIIJ();
            int LJI2 = LLIIJLIL().LJI();
            if (LJJJI() > 0) {
                if (i >= 0) {
                    int LJJJI3 = LJJJI();
                    int i11 = 0;
                    int i12 = 0;
                    View view3 = null;
                    while (true) {
                        if (i11 >= LJJJI3) {
                            break;
                        }
                        View LJJJ7 = LJJJ(i11 + i12);
                        if (LJJJ7 != null) {
                            view3 = LJJJ7;
                        } else if (view3 == null) {
                            o.LJIJI("child");
                            throw null;
                        }
                        if ((C0A2.LJJIZ(view3) + view3.getBottom()) - i < LJIIJ2) {
                            StringBuilder LIZ5 = X1D.LIZ();
                            LIZ5.append("fillWithVertical: removeAndRecycleView:");
                            LIZ5.append(C0A2.LJJJLL(view3));
                            LIZ5.append(",bottom:");
                            LIZ5.append(C0A2.LJJIZ(view3) + view3.getBottom());
                            String msg4 = X1D.LIZIZ(LIZ5);
                            o.LJIIIZ(msg4, "msg");
                            LJLLL(view3, c0a7);
                            this.LJLZ++;
                            i12--;
                            i11++;
                        } else {
                            StringBuilder LIZ6 = X1D.LIZ();
                            LIZ6.append("fillWithVertical: break:");
                            LIZ6.append(C0A2.LJJJLL(view3));
                            LIZ6.append(",bottom:");
                            LIZ6.append(C0A2.LJJIZ(view3) + view3.getBottom());
                            C221018lt.LIZ("TTRecGalleryLayoutManager", X1D.LIZIZ(LIZ6));
                            break;
                        }
                    }
                } else {
                    int LJJJI4 = LJJJI() - 1;
                    View view4 = null;
                    for (int i13 = -1; i13 < LJJJI4; i13 = -1) {
                        View LJJJ8 = LJJJ(LJJJI4);
                        if (LJJJ8 != null) {
                            view4 = LJJJ8;
                        } else if (view4 == null) {
                            o.LJIJI("child");
                            throw null;
                        }
                        if ((view4.getTop() - C0A2.LJJLI(view4)) - i <= LJI2) {
                            break;
                        }
                        StringBuilder LIZ7 = X1D.LIZ();
                        LIZ7.append("fillWithVertical: removeAndRecycleView:");
                        LIZ7.append(C0A2.LJJJLL(view4));
                        String msg5 = X1D.LIZIZ(LIZ7);
                        o.LJIIIZ(msg5, "msg");
                        LJLLL(view4, c0a7);
                        this.LJZ--;
                        LJJJI4--;
                    }
                }
            }
            Rect rect4 = null;
            int i14 = this.LJLZ;
            int LLIIJI2 = LLIIJI();
            if (i >= 0) {
                if (LJJJI() != 0 && (LJJJ2 = LJJJ(LJJJI() - 1)) != null) {
                    i14 = C0A2.LJJJLL(LJJJ2) + 1;
                    i3 = C0A2.LJJIZ(LJJJ2) + LJJJ2.getBottom();
                } else {
                    i3 = -1;
                }
                int i15 = i14;
                while (i15 < LJJJJZ() && i3 < LJI2 + i) {
                    C80113VcL LLIIL5 = LLIIL();
                    if (LLIIL5 != null && (sparseArray4 = LLIIL5.LIZ) != null) {
                        rect4 = sparseArray4.get(i15);
                    }
                    View LJFF3 = c0a7.LJFF(i15);
                    o.LJIIIIZZ(LJFF3, "recycler.getViewForPosition(i)");
                    LJIIZILJ(LJFF3);
                    if (rect4 == null) {
                        rect4 = new Rect();
                        C80113VcL LLIIL6 = LLIIL();
                        if (LLIIL6 != null && (sparseArray3 = LLIIL6.LIZ) != null) {
                            sparseArray3.put(i15, rect4);
                        }
                    }
                    LJJLIIIJL(0, 0, LJFF3);
                    int LJJJJL2 = LJJJJL(LJFF3);
                    int LJJJJJL2 = LJJJJJL(LJFF3);
                    int paddingLeft = (int) (((LLIIJI2 - LJJJJL2) / 2.0f) + getPaddingLeft());
                    if (i3 == -1 && i14 == 0) {
                        int LLIILII2 = (int) (((LLIILII() - LJJJJJL2) / 2.0f) + getPaddingTop());
                        rect4.set(paddingLeft, LLIILII2, LJJJJL2 + paddingLeft, LJJJJJL2 + LLIILII2);
                    } else {
                        rect4.set(paddingLeft, i3, LJJJJL2 + paddingLeft, LJJJJJL2 + i3);
                    }
                    C0A2.LJJLIIIJJI(LJFF3, rect4.left, rect4.top, rect4.right, rect4.bottom);
                    i3 = rect4.bottom;
                    this.LJZ = i15;
                    StringBuilder LIZJ4 = C06460Ne.LIZJ("fillWithVertical: add view:", i15, ",startOffset:", i3, ",mLastVisiblePos:");
                    LIZJ4.append(this.LJZ);
                    LIZJ4.append(",bottomEdge");
                    LIZJ4.append(LJI2);
                    C221018lt.LIZ("TTRecGalleryLayoutManager", X1D.LIZIZ(LIZJ4));
                    i15++;
                    rect4 = null;
                }
            } else {
                if (LJJJI() > 0 && (LJJJ = LJJJ(0)) != null) {
                    i14 = C0A2.LJJJLL(LJJJ) - 1;
                    i2 = LJJJ.getTop() - C0A2.LJJLI(LJJJ);
                } else {
                    i2 = -1;
                }
                while (i14 >= 0 && i2 > LJIIJ2 + i) {
                    C80113VcL LLIIL7 = LLIIL();
                    if (LLIIL7 != null && (sparseArray2 = LLIIL7.LIZ) != null) {
                        rect = sparseArray2.get(i14);
                    } else {
                        rect = null;
                    }
                    View LJFF4 = c0a7.LJFF(i14);
                    o.LJIIIIZZ(LJFF4, "recycler.getViewForPosition(i)");
                    LJIJ(0, LJFF4, false);
                    if (rect == null) {
                        rect = new Rect();
                        C80113VcL LLIIL8 = LLIIL();
                        if (LLIIL8 != null && (sparseArray = LLIIL8.LIZ) != null) {
                            sparseArray.put(i14, rect);
                        }
                    }
                    LJJLIIIJL(0, 0, LJFF4);
                    int LJJJJL3 = LJJJJL(LJFF4);
                    int paddingLeft2 = (int) (((LLIIJI2 - LJJJJL3) / 2.0f) + getPaddingLeft());
                    rect.set(paddingLeft2, i2 - LJJJJJL(LJFF4), LJJJJL3 + paddingLeft2, i2);
                    C0A2.LJJLIIIJJI(LJFF4, rect.left, rect.top, rect.right, rect.bottom);
                    i2 = rect.top;
                    this.LJLZ = i14;
                    i14--;
                }
            }
        }
        if (this.LLIFFJFJJ != null) {
            int LJJJI5 = LJJJI();
            for (int i16 = 0; i16 < LJJJI5; i16++) {
                View LJJJ9 = LJJJ(i16);
                if (LJJJ9 != null && (c77413UZt = this.LLIFFJFJJ) != null) {
                    c77413UZt.LJJIIZI(LJJJ9, LLIIIL(LJJJ9, i));
                }
            }
        }
    }

    @Override // X.C0A2
    public final int LJZI(int i, C0A7 recycler, C0AC state) {
        View LJJJ;
        int min;
        View LJJJ2;
        o.LJIIIZ(recycler, "recycler");
        o.LJIIIZ(state, "state");
        if (LJJJI() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        int LJIIJ = LLIIJLIL().LJIIJ() + ((LLIIJLIL().LJI() - LLIIJLIL().LJIIJ()) / 2);
        if (i > 0) {
            View LJJJ3 = LJJJ(LJJJI() - 1);
            if (LJJJ3 != null && C0A2.LJJJLL(LJJJ3) == LJJJJZ() - 1 && (LJJJ2 = LJJJ(LJJJI() - 1)) != null) {
                min = Math.max(0, Math.min(i, (LJJJ2.getLeft() + ((LJJJ2.getRight() - LJJJ2.getLeft()) / 2)) - LJIIJ));
                i2 = -min;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("scrollHorizontallyBy: dx:");
            LIZ.append(i);
            LIZ.append(",fixed:");
            LIZ.append(i2);
            C221018lt.LIZ("TTRecGalleryLayoutManager", X1D.LIZIZ(LIZ));
            LLIIL();
            int i3 = -i2;
            LLIIIZ(i3, recycler);
            LJJLIIIJLJLI(i2);
            return i3;
        }
        if (this.LJLZ == 0 && (LJJJ = LJJJ(0)) != null) {
            min = Math.min(0, Math.max(i, (LJJJ.getLeft() + ((LJJJ.getRight() - LJJJ.getLeft()) / 2)) - LJIIJ));
            i2 = -min;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("scrollHorizontallyBy: dx:");
        LIZ2.append(i);
        LIZ2.append(",fixed:");
        LIZ2.append(i2);
        C221018lt.LIZ("TTRecGalleryLayoutManager", X1D.LIZIZ(LIZ2));
        LLIIL();
        int i32 = -i2;
        LLIIIZ(i32, recycler);
        LJJLIIIJLJLI(i2);
        return i32;
    }

    @Override // X.C0A2
    public final int LL(int i, C0A7 recycler, C0AC state) {
        View LJJJ;
        int min;
        View LJJJ2;
        o.LJIIIZ(recycler, "recycler");
        o.LJIIIZ(state, "state");
        if (LJJJI() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        int LJIIJ = LLIIJLIL().LJIIJ() + ((LLIIJLIL().LJI() - LLIIJLIL().LJIIJ()) / 2);
        if (i > 0) {
            View LJJJ3 = LJJJ(LJJJI() - 1);
            if (LJJJ3 != null && C0A2.LJJJLL(LJJJ3) == LJJJJZ() - 1 && (LJJJ2 = LJJJ(LJJJI() - 1)) != null) {
                min = Math.max(0, Math.min(i, ((LJJJ2.getTop() - C0A2.LJJLI(LJJJ2)) + (((C0A2.LJJIZ(LJJJ2) + LJJJ2.getBottom()) - (LJJJ2.getTop() - C0A2.LJJLI(LJJJ2))) / 2)) - LJIIJ));
                i2 = -min;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("scrollVerticallyBy: dy:");
            LIZ.append(i);
            LIZ.append(",fixed:");
            LIZ.append(i2);
            C221018lt.LIZ("TTRecGalleryLayoutManager", X1D.LIZIZ(LIZ));
            LLIIL();
            int i3 = -i2;
            LLIIIZ(i3, recycler);
            LJJLIIIJLLLLLLLZ(i2);
            return i3;
        }
        if (this.LJLZ == 0 && (LJJJ = LJJJ(0)) != null) {
            min = Math.min(0, Math.max(i, ((LJJJ.getTop() - C0A2.LJJLI(LJJJ)) + (((C0A2.LJJIZ(LJJJ) + LJJJ.getBottom()) - (LJJJ.getTop() - C0A2.LJJLI(LJJJ))) / 2)) - LJIIJ));
            i2 = -min;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("scrollVerticallyBy: dy:");
        LIZ2.append(i);
        LIZ2.append(",fixed:");
        LIZ2.append(i2);
        C221018lt.LIZ("TTRecGalleryLayoutManager", X1D.LIZIZ(LIZ2));
        LLIIL();
        int i32 = -i2;
        LLIIIZ(i32, recycler);
        LJJLIIIJLLLLLLLZ(i2);
        return i32;
    }

    @Override // X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC state, int i) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(state, "state");
        C80079Vbn c80079Vbn = new C80079Vbn(recyclerView.getContext());
        c80079Vbn.LIZ = i;
        LLIIIILZ(c80079Vbn);
    }
}
