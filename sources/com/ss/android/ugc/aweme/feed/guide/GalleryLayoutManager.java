package com.ss.android.ugc.aweme.feed.guide;

import X.AbstractC03050Ab;
import X.AbstractC28951Br;
import X.C0A2;
import X.C0A7;
import X.C0AA;
import X.C0AC;
import X.C28851Bh;
import X.C28861Bi;
import X.C40141hq;
import X.C40161hs;
import X.C53322KwI;
import X.C57549MiH;
import X.C57691MkZ;
import X.C80082Vbq;
import X.C80104VcC;
import X.C80105VcD;
import X.InterfaceC57552MiK;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public class GalleryLayoutManager extends C0A2 implements C0AA {
    public int LJLZ;
    public int LJZI;
    public View LL;
    public C80105VcD LLD;
    public final AbstractC28951Br LLF;
    public final int LLFFF;
    public C28851Bh LLFII;
    public C28861Bi LLFZ;
    public WeakReference<Activity> LLI;
    public C57549MiH LLIFFJFJJ;
    public RecyclerView LLIIII;
    public final boolean LJZ = true;
    public int LJZL = -1;
    public final C57691MkZ LLFF = new C57691MkZ(this);
    public final ArrayList<InterfaceC57552MiK> LLII = new ArrayList<>();

    @Override // X.C0A2
    public final void LJLIL(RecyclerView recyclerView, int i, int i2) {
    }

    @Override // X.C0A2
    public final boolean LJIJJLI() {
        RecyclerView recyclerView = this.LLIIII;
        if (recyclerView != null && !recyclerView.LJJJLIIL() && this.LJZ && this.LLFFF == 0) {
            return true;
        }
        return false;
    }

    @Override // X.C0A2
    public final boolean LJIL() {
        RecyclerView recyclerView = this.LLIIII;
        if (recyclerView != null && !recyclerView.LJJJLIIL() && this.LJZ && this.LLFFF == 1) {
            return true;
        }
        return false;
    }

    @Override // X.C0A2
    public final RecyclerView.LayoutParams LJJIJL() {
        if (this.LLFFF == 1) {
            return new C80104VcC(-1, -2);
        }
        return new C80104VcC(-2, -1);
    }

    public final int LLIIJI() {
        return (this.LJLLLL - getPaddingRight()) - getPaddingLeft();
    }

    public final AbstractC03050Ab LLIIJLIL() {
        if (this.LLFFF == 0) {
            if (this.LLFII == null) {
                this.LLFII = new C28851Bh(this);
            }
            return this.LLFII;
        }
        if (this.LLFZ == null) {
            this.LLFZ = new C28861Bi(this);
        }
        return this.LLFZ;
    }

    public final C80105VcD LLIIL() {
        if (this.LLD == null) {
            this.LLD = new C80105VcD();
        }
        return this.LLD;
    }

    public final int LLIILII() {
        return (this.LJLLLLLL - getPaddingBottom()) - getPaddingTop();
    }

    public final void LLIIZ() {
        C80105VcD c80105VcD = this.LLD;
        if (c80105VcD != null) {
            c80105VcD.LIZ.clear();
        }
        int i = this.LJZL;
        if (i != -1) {
            this.LJZI = i;
        }
        int min = Math.min(Math.max(0, this.LJZI), LJJJJZ() - 1);
        this.LJZI = min;
        this.LJLZ = min;
        this.LJZL = -1;
        View view = this.LL;
        if (view != null) {
            view.setSelected(false);
            this.LL = null;
        }
    }

    public GalleryLayoutManager() {
        this.LLFFF = 0;
        this.LLFFF = 0;
        if (C53322KwI.LIZIZ() == 3 || C53322KwI.LIZIZ() == 4) {
            this.LLF = new C40161hs();
        } else {
            this.LLF = new C40141hq();
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
    public final boolean LJJ(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof C80104VcC;
    }

    @Override // X.C0A2
    public final RecyclerView.LayoutParams LJJIL(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C80104VcC((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C80104VcC(layoutParams);
    }

    @Override // X.C0A2
    public final RecyclerView.LayoutParams LJJIJLIJ(Context context, AttributeSet attributeSet) {
        return new C80104VcC(context, attributeSet);
    }

    @Override // X.C0A2
    public final void LJLJJI(C0A7 c0a7, C0AC c0ac) {
        if (LJJJJZ() == 0) {
            LLIIZ();
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
            LLIIZ();
        }
        this.LJZI = Math.min(Math.max(0, this.LJZI), LJJJJZ() - 1);
        LJJIJIIJIL(c0a7);
        if (this.LLFFF == 0) {
            LJJIJIIJIL(c0a7);
            int LJIIJ = LLIIJLIL().LJIIJ();
            int LJI = LLIIJLIL().LJI();
            int i = this.LJZI;
            Rect rect = new Rect();
            int LLIILII = LLIILII();
            View LJFF = c0a7.LJFF(this.LJZI);
            LJIJ(0, LJFF, false);
            LJJLIIIJL(0, 0, LJFF);
            int paddingTop = (int) (((LLIILII - r9) / 2.0f) + getPaddingTop());
            int LLIIJI = (int) (((LLIIJI() - r10) / 2.0f) + getPaddingLeft());
            rect.set(LLIIJI, paddingTop, LJJJJL(LJFF) + LLIIJI, LJJJJJL(LJFF) + paddingTop);
            C0A2.LJJLIIIJJI(LJFF, rect.left, rect.top, rect.right, rect.bottom);
            if (LLIIL().LIZ.get(i) == null) {
                LLIIL().LIZ.put(i, rect);
            } else {
                LLIIL().LIZ.get(i).set(rect);
            }
            this.LJLZ = i;
            int left = LJFF.getLeft() - C0A2.LJJJLIIL(LJFF);
            int LJJJZ = C0A2.LJJJZ(LJFF) + LJFF.getRight();
            Rect rect2 = new Rect();
            int LLIILII2 = LLIILII();
            for (int i2 = this.LJZI - 1; i2 >= 0 && left > LJIIJ; i2--) {
                View LJFF2 = c0a7.LJFF(i2);
                LJIJ(0, LJFF2, false);
                LJJLIIIJL(0, 0, LJFF2);
                int paddingTop2 = (int) (((LLIILII2 - r9) / 2.0f) + getPaddingTop());
                rect2.set(left - LJJJJL(LJFF2), paddingTop2, left, LJJJJJL(LJFF2) + paddingTop2);
                C0A2.LJJLIIIJJI(LJFF2, rect2.left, rect2.top, rect2.right, rect2.bottom);
                left = rect2.left;
                this.LJLZ = i2;
                if (LLIIL().LIZ.get(i2) == null) {
                    LLIIL().LIZ.put(i2, rect2);
                } else {
                    LLIIL().LIZ.get(i2).set(rect2);
                }
            }
            Rect rect3 = new Rect();
            int LLIILII3 = LLIILII();
            for (int i3 = this.LJZI + 1; i3 < LJJJJZ() && LJJJZ < LJI; i3++) {
                View LJFF3 = c0a7.LJFF(i3);
                LJIIZILJ(LJFF3);
                LJJLIIIJL(0, 0, LJFF3);
                int paddingTop3 = (int) (((LLIILII3 - r7) / 2.0f) + getPaddingTop());
                rect3.set(LJJJZ, paddingTop3, LJJJJL(LJFF3) + LJJJZ, LJJJJJL(LJFF3) + paddingTop3);
                C0A2.LJJLIIIJJI(LJFF3, rect3.left, rect3.top, rect3.right, rect3.bottom);
                LJJJZ = rect3.right;
                if (LLIIL().LIZ.get(i3) == null) {
                    LLIIL().LIZ.put(i3, rect3);
                } else {
                    LLIIL().LIZ.get(i3).set(rect3);
                }
            }
        } else {
            LJJIJIIJIL(c0a7);
            int LJIIJ2 = LLIIJLIL().LJIIJ();
            int LJI2 = LLIIJLIL().LJI();
            int i4 = this.LJZI;
            Rect rect4 = new Rect();
            int LLIIJI2 = LLIIJI();
            View LJFF4 = c0a7.LJFF(this.LJZI);
            LJIJ(0, LJFF4, false);
            LJJLIIIJL(0, 0, LJFF4);
            int paddingLeft = (int) (((LLIIJI2 - r10) / 2.0f) + getPaddingLeft());
            int LLIILII4 = (int) (((LLIILII() - r9) / 2.0f) + getPaddingTop());
            rect4.set(paddingLeft, LLIILII4, LJJJJL(LJFF4) + paddingLeft, LJJJJJL(LJFF4) + LLIILII4);
            C0A2.LJJLIIIJJI(LJFF4, rect4.left, rect4.top, rect4.right, rect4.bottom);
            if (LLIIL().LIZ.get(i4) == null) {
                LLIIL().LIZ.put(i4, rect4);
            } else {
                LLIIL().LIZ.get(i4).set(rect4);
            }
            this.LJLZ = i4;
            int top = LJFF4.getTop() - C0A2.LJJLI(LJFF4);
            int LJJIZ = C0A2.LJJIZ(LJFF4) + LJFF4.getBottom();
            Rect rect5 = new Rect();
            int LLIIJI3 = LLIIJI();
            for (int i5 = this.LJZI - 1; i5 >= 0 && top > LJIIJ2; i5--) {
                View LJFF5 = c0a7.LJFF(i5);
                LJIJ(0, LJFF5, false);
                LJJLIIIJL(0, 0, LJFF5);
                int LJJJJL = LJJJJL(LJFF5);
                int paddingLeft2 = (int) (((LLIIJI3 - LJJJJL) / 2.0f) + getPaddingLeft());
                rect5.set(paddingLeft2, top - LJJJJJL(LJFF5), LJJJJL + paddingLeft2, top);
                C0A2.LJJLIIIJJI(LJFF5, rect5.left, rect5.top, rect5.right, rect5.bottom);
                top = rect5.top;
                this.LJLZ = i5;
                if (LLIIL().LIZ.get(i5) == null) {
                    LLIIL().LIZ.put(i5, rect5);
                } else {
                    LLIIL().LIZ.get(i5).set(rect5);
                }
            }
            Rect rect6 = new Rect();
            int LLIIJI4 = LLIIJI();
            for (int i6 = this.LJZI + 1; i6 < LJJJJZ() && LJJIZ < LJI2; i6++) {
                View LJFF6 = c0a7.LJFF(i6);
                LJIIZILJ(LJFF6);
                LJJLIIIJL(0, 0, LJFF6);
                int paddingLeft3 = (int) (((LLIIJI4 - r9) / 2.0f) + getPaddingLeft());
                rect6.set(paddingLeft3, LJJIZ, LJJJJL(LJFF6) + paddingLeft3, LJJJJJL(LJFF6) + LJJIZ);
                C0A2.LJJLIIIJJI(LJFF6, rect6.left, rect6.top, rect6.right, rect6.bottom);
                LJJIZ = rect6.bottom;
                if (LLIIL().LIZ.get(i6) == null) {
                    LLIIL().LIZ.put(i6, rect6);
                } else {
                    LLIIL().LIZ.get(i6).set(rect6);
                }
            }
        }
        if (this.LLIFFJFJJ != null) {
            for (int i7 = 0; i7 < LJJJI(); i7++) {
                View LJJJ = LJJJ(i7);
                this.LLIFFJFJJ.LIZ(this, LJJJ, LLIIIL(LJJJ, 0));
            }
        }
        this.LLFF.LJIILL(this.LLIIII, 0, 0);
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
        return Math.max(-1.0f, Math.min(1.0f, (i * 1.0f) / height2));
    }

    public final void LLIIIZ(int i, C0A7 c0a7) {
        int i2;
        int i3;
        if (LJJJJZ() == 0) {
            return;
        }
        int i4 = -1;
        int i5 = 0;
        if (this.LLFFF == 0) {
            int LJIIJ = LLIIJLIL().LJIIJ();
            int LJI = LLIIJLIL().LJI();
            if (LJJJI() > 0) {
                if (i >= 0) {
                    int i6 = 0;
                    for (int i7 = 0; i7 < LJJJI(); i7++) {
                        View LJJJ = LJJJ(i7 + i6);
                        if (LJJJJLI(LJJJ) - i >= LJIIJ) {
                            break;
                        }
                        LJLLL(LJJJ, c0a7);
                        this.LJLZ++;
                        i6--;
                    }
                } else {
                    for (int LJJJI = LJJJI() - 1; LJJJI >= 0; LJJJI--) {
                        View LJJJ2 = LJJJ(LJJJI);
                        if (LJJJJJ(LJJJ2) - i > LJI) {
                            LJLLL(LJJJ2, c0a7);
                        }
                    }
                }
            }
            int i8 = this.LJLZ;
            int LLIILII = LLIILII();
            if (i >= 0) {
                if (LJJJI() != 0) {
                    View LJJJ3 = LJJJ(LJJJI() - 1);
                    i8 = C0A2.LJJJLL(LJJJ3) + 1;
                    i3 = C0A2.LJJJZ(LJJJ3) + LJJJ3.getRight();
                } else {
                    i3 = -1;
                }
                int i9 = i8;
                while (i9 < LJJJJZ() && i3 < LJI + i) {
                    Rect rect = LLIIL().LIZ.get(i9);
                    View LJFF = c0a7.LJFF(i9);
                    LJIIZILJ(LJFF);
                    if (rect == null) {
                        rect = new Rect();
                        LLIIL().LIZ.put(i9, rect);
                    }
                    LJJLIIIJL(i5, i5, LJFF);
                    int LJJJJL = LJJJJL(LJFF);
                    int LJJJJJL = LJJJJJL(LJFF);
                    int paddingTop = (int) (((LLIILII - LJJJJJL) / 2.0f) + getPaddingTop());
                    if (i3 == -1 && i8 == 0) {
                        int LLIIJI = (int) (((LLIIJI() - LJJJJL) / 2.0f) + getPaddingLeft());
                        rect.set(LLIIJI, paddingTop, LJJJJL + LLIIJI, LJJJJJL + paddingTop);
                    } else {
                        rect.set(i3, paddingTop, LJJJJL + i3, LJJJJJL + paddingTop);
                    }
                    C0A2.LJJLIIIJJI(LJFF, rect.left, rect.top, rect.right, rect.bottom);
                    i3 = rect.right;
                    i9++;
                    i5 = 0;
                }
            } else {
                if (LJJJI() > 0) {
                    View LJJJ4 = LJJJ(0);
                    i8 = C0A2.LJJJLL(LJJJ4) - 1;
                    i4 = LJJJ4.getLeft() - C0A2.LJJJLIIL(LJJJ4);
                }
                while (i8 >= 0 && i4 > LJIIJ + i) {
                    Rect rect2 = LLIIL().LIZ.get(i8);
                    View LJFF2 = c0a7.LJFF(i8);
                    LJIJ(0, LJFF2, false);
                    if (rect2 == null) {
                        rect2 = new Rect();
                        LLIIL().LIZ.put(i8, rect2);
                    }
                    LJJLIIIJL(0, 0, LJFF2);
                    int paddingTop2 = (int) (((LLIILII - r2) / 2.0f) + getPaddingTop());
                    rect2.set(i4 - LJJJJL(LJFF2), paddingTop2, i4, LJJJJJL(LJFF2) + paddingTop2);
                    C0A2.LJJLIIIJJI(LJFF2, rect2.left, rect2.top, rect2.right, rect2.bottom);
                    i4 = rect2.left;
                    this.LJLZ = i8;
                    i8--;
                }
            }
        } else {
            int LJIIJ2 = LLIIJLIL().LJIIJ();
            int LJI2 = LLIIJLIL().LJI();
            if (LJJJI() > 0) {
                if (i >= 0) {
                    int i10 = 0;
                    for (int i11 = 0; i11 < LJJJI(); i11++) {
                        View LJJJ5 = LJJJ(i11 + i10);
                        if (LJJJJIZL(LJJJ5) - i >= LJIIJ2) {
                            break;
                        }
                        LJLLL(LJJJ5, c0a7);
                        this.LJLZ++;
                        i10--;
                    }
                } else {
                    for (int LJJJI2 = LJJJI() - 1; LJJJI2 >= 0; LJJJI2--) {
                        View LJJJ6 = LJJJ(LJJJI2);
                        if (LJJJJLL(LJJJ6) - i <= LJI2) {
                            break;
                        }
                        LJLLL(LJJJ6, c0a7);
                    }
                }
            }
            int i12 = this.LJLZ;
            int LLIIJI2 = LLIIJI();
            if (i >= 0) {
                if (LJJJI() != 0) {
                    View LJJJ7 = LJJJ(LJJJI() - 1);
                    i12 = C0A2.LJJJLL(LJJJ7) + 1;
                    i2 = C0A2.LJJIZ(LJJJ7) + LJJJ7.getBottom();
                } else {
                    i2 = -1;
                }
                for (int i13 = i12; i13 < LJJJJZ() && i2 < LJI2 + i; i13++) {
                    Rect rect3 = LLIIL().LIZ.get(i13);
                    View LJFF3 = c0a7.LJFF(i13);
                    LJIIZILJ(LJFF3);
                    if (rect3 == null) {
                        rect3 = new Rect();
                        LLIIL().LIZ.put(i13, rect3);
                    }
                    LJJLIIIJL(0, 0, LJFF3);
                    int LJJJJL2 = LJJJJL(LJFF3);
                    int LJJJJJL2 = LJJJJJL(LJFF3);
                    int paddingLeft = (int) (((LLIIJI2 - LJJJJL2) / 2.0f) + getPaddingLeft());
                    if (i2 == -1 && i12 == 0) {
                        int LLIILII2 = (int) (((LLIILII() - LJJJJJL2) / 2.0f) + getPaddingTop());
                        rect3.set(paddingLeft, LLIILII2, LJJJJL2 + paddingLeft, LJJJJJL2 + LLIILII2);
                    } else {
                        rect3.set(paddingLeft, i2, LJJJJL2 + paddingLeft, LJJJJJL2 + i2);
                    }
                    C0A2.LJJLIIIJJI(LJFF3, rect3.left, rect3.top, rect3.right, rect3.bottom);
                    i2 = rect3.bottom;
                }
            } else {
                if (LJJJI() > 0) {
                    View LJJJ8 = LJJJ(0);
                    i12 = (-1) + C0A2.LJJJLL(LJJJ8);
                    i4 = LJJJ8.getTop() - C0A2.LJJLI(LJJJ8);
                }
                while (i12 >= 0 && i4 > LJIIJ2 + i) {
                    Rect rect4 = LLIIL().LIZ.get(i12);
                    View LJFF4 = c0a7.LJFF(i12);
                    LJIJ(0, LJFF4, false);
                    if (rect4 == null) {
                        rect4 = new Rect();
                        LLIIL().LIZ.put(i12, rect4);
                    }
                    LJJLIIIJL(0, 0, LJFF4);
                    int LJJJJL3 = LJJJJL(LJFF4);
                    int paddingLeft2 = (int) (((LLIIJI2 - LJJJJL3) / 2.0f) + getPaddingLeft());
                    rect4.set(paddingLeft2, i4 - LJJJJJL(LJFF4), LJJJJL3 + paddingLeft2, i4);
                    C0A2.LJJLIIIJJI(LJFF4, rect4.left, rect4.top, rect4.right, rect4.bottom);
                    i4 = rect4.top;
                    this.LJLZ = i12;
                    i12--;
                }
            }
        }
        if (this.LLIFFJFJJ != null) {
            for (int i14 = 0; i14 < LJJJI(); i14++) {
                View LJJJ9 = LJJJ(i14);
                this.LLIFFJFJJ.LIZ(this, LJJJ9, LLIIIL(LJJJ9, i));
            }
        }
    }

    @Override // X.C0A2
    public final int LJZI(int i, C0A7 c0a7, C0AC c0ac) {
        int min;
        if (LJJJI() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        int LJIIJ = LLIIJLIL().LJIIJ() + ((LLIIJLIL().LJI() - LLIIJLIL().LJIIJ()) / 2);
        if (i > 0) {
            if (C0A2.LJJJLL(LJJJ(LJJJI() - 1)) == LJJJJZ() - 1) {
                View LJJJ = LJJJ(LJJJI() - 1);
                min = Math.max(0, Math.min(i, (LJJJ.getLeft() + ((LJJJ.getRight() - LJJJ.getLeft()) / 2)) - LJIIJ));
                i2 = -min;
            }
            int i3 = -i2;
            LLIIL().getClass();
            LLIIIZ(i3, c0a7);
            LJJLIIIJLJLI(i2);
            return i3;
        }
        if (this.LJLZ == 0) {
            View LJJJ2 = LJJJ(0);
            min = Math.min(0, Math.max(i, (LJJJ2.getLeft() + ((LJJJ2.getRight() - LJJJ2.getLeft()) / 2)) - LJIIJ));
            i2 = -min;
        }
        int i32 = -i2;
        LLIIL().getClass();
        LLIIIZ(i32, c0a7);
        LJJLIIIJLJLI(i2);
        return i32;
    }

    @Override // X.C0A2
    public final int LL(int i, C0A7 c0a7, C0AC c0ac) {
        int min;
        if (LJJJI() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        int LJIIJ = LLIIJLIL().LJIIJ() + ((LLIIJLIL().LJI() - LLIIJLIL().LJIIJ()) / 2);
        if (i > 0) {
            if (C0A2.LJJJLL(LJJJ(LJJJI() - 1)) == LJJJJZ() - 1) {
                View LJJJ = LJJJ(LJJJI() - 1);
                min = Math.max(0, Math.min(i, ((LJJJ.getTop() - C0A2.LJJLI(LJJJ)) + ((LJJJJIZL(LJJJ) - (LJJJ.getTop() - C0A2.LJJLI(LJJJ))) / 2)) - LJIIJ));
                i2 = -min;
            }
            int i3 = -i2;
            LLIIL().getClass();
            LLIIIZ(i3, c0a7);
            LJJLIIIJLLLLLLLZ(i2);
            return i3;
        }
        if (this.LJLZ == 0) {
            View LJJJ2 = LJJJ(0);
            min = Math.min(0, Math.max(i, ((LJJJ2.getTop() - C0A2.LJJLI(LJJJ2)) + ((LJJJJIZL(LJJJ2) - (LJJJ2.getTop() - C0A2.LJJLI(LJJJ2))) / 2)) - LJIIJ));
            i2 = -min;
        }
        int i32 = -i2;
        LLIIL().getClass();
        LLIIIZ(i32, c0a7);
        LJJLIIIJLLLLLLLZ(i2);
        return i32;
    }

    @Override // X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        C80082Vbq c80082Vbq = new C80082Vbq(recyclerView.getContext());
        c80082Vbq.LIZ = i;
        LLIIIILZ(c80082Vbq);
    }

    public final void LLIILZL(int i, View view, RecyclerView recyclerView) {
        Iterator<InterfaceC57552MiK> it = this.LLII.iterator();
        while (it.hasNext()) {
            it.next().LJIIIZ(i, view, recyclerView);
        }
    }
}
