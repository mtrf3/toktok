package X;

import Y.ARunnableS33S0200000_14;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.view.UIComponent;

/* renamed from: X.VUq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnAttachStateChangeListenerC79828VUq extends C0A6 implements View.OnAttachStateChangeListener {
    public final UIList LJLIL;
    public final C79698VPq LJLILLLLZI;
    public int LJLJJI;
    public boolean LJLJLJ = true;
    public int LJLJI = -1;
    public int LJLJJL = -1;
    public final VV0 LJLJJLL = new VV0();
    public final VV0 LJLJL = new VV0();

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public final void LJIJJ() {
        RecyclerView recyclerView;
        int i;
        int LJZL;
        int i2 = 0;
        if (this.LJLJJLL.LIZIZ != -1 && (recyclerView = (RecyclerView) this.LJLIL.mView) != null && recyclerView.getChildCount() > 1) {
            View childAt = recyclerView.getChildAt(0);
            View childAt2 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
            if (childAt != null && childAt2 != null) {
                RecyclerView.ViewHolder LJJJJJL = recyclerView.LJJJJJL(childAt);
                RecyclerView.ViewHolder LJJJJJL2 = recyclerView.LJJJJJL(childAt2);
                if (LJJJJJL != null && LJJJJJL2 != null) {
                    int adapterPosition = LJJJJJL.getAdapterPosition();
                    int adapterPosition2 = LJJJJJL2.getAdapterPosition();
                    if (adapterPosition >= 0 && adapterPosition2 >= 0) {
                        C79829VUr c79829VUr = this.LJLIL.LJLJI;
                        int i3 = this.LJLJJLL.LIZIZ + 1;
                        if (c79829VUr.LJLL != null) {
                            int i4 = 0;
                            while (true) {
                                if (i4 >= c79829VUr.LJLL.size()) {
                                    break;
                                }
                                int i5 = c79829VUr.LJLL.getInt(i4);
                                if (i5 >= i3) {
                                    if (i5 >= adapterPosition && i5 <= adapterPosition2 && (this.LJLJLJ || this.LJLIL.LJLJI.LJLL.contains(Integer.valueOf(i5)))) {
                                        RecyclerView.ViewHolder LJJIZ = ((RecyclerView) this.LJLIL.mView).LJJIZ(i5);
                                        if (LJJIZ != null) {
                                            i = Math.min(0, LJJIZ.itemView.getTop() - this.LJLJJLL.LIZ.mView.getBottom());
                                        } else {
                                            i = 0;
                                        }
                                        this.LJLJJLL.LIZ.mView.setTranslationY(i);
                                        if (this.LJLJJLL.LIZ.mView.getBottom() + i < 0) {
                                            LJIILLIIL(this.LJLJJLL);
                                        }
                                    }
                                } else {
                                    i4++;
                                }
                            }
                        }
                    }
                }
            }
        }
        int i6 = this.LJLJL.LIZIZ;
        if (i6 == -1 || (LJZL = this.LJLIL.LJLJI.LJZL(i6 - 1)) == -1) {
            return;
        }
        if (!this.LJLJLJ && !this.LJLIL.LJLJI.LJLLI.contains(Integer.valueOf(LJZL))) {
            return;
        }
        RecyclerView recyclerView2 = (RecyclerView) this.LJLIL.mView;
        RecyclerView.ViewHolder LJJIZ2 = recyclerView2.LJJIZ(LJZL);
        if (LJJIZ2 != null) {
            i2 = Math.max(0, LJJIZ2.itemView.getBottom() - this.LJLJL.LIZ.mView.getTop());
        }
        this.LJLJL.LIZ.mView.setTranslationY(i2);
        if (this.LJLJL.LIZ.mView.getTop() + i2 <= recyclerView2.getHeight()) {
            return;
        }
        LJIILLIIL(this.LJLJL);
    }

    public ViewOnAttachStateChangeListenerC79828VUq(UIList uIList) {
        this.LJLIL = uIList;
        this.LJLILLLLZI = new C79698VPq(this, uIList.mContext);
        ((RecyclerView) uIList.mView).LJIIJJI(this);
        uIList.mView.addOnAttachStateChangeListener(this);
    }

    public static void LJIJJLI(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            C16880lQ.LJLLL(view, (ViewGroup) parent);
        }
    }

    public final void LJIILLIIL(VV0 vv0) {
        UIComponent uIComponent;
        T t;
        if (vv0 != null && (uIComponent = vv0.LIZ) != null && (t = uIComponent.mView) != 0) {
            t.setTranslationY(0.0f);
        }
        C79831VUt c79831VUt = (C79831VUt) ((RecyclerView) this.LJLIL.mView).LJJIZ(vv0.LIZIZ);
        LJIJJLI(vv0.LIZ.mView);
        if (c79831VUt != null) {
            c79831VUt.L(vv0.LIZ);
            vv0.LIZIZ = -1;
            vv0.LIZ = null;
            return;
        }
        UIList uIList = this.LJLIL;
        if (uIList.LJLJI.LJLJJI) {
            uIList.LJIL(vv0.LIZ);
            return;
        }
        UIComponent uIComponent2 = vv0.LIZ;
        C79655VNz c79655VNz = uIList.LJLIL;
        int sign = uIList.getSign();
        int sign2 = uIComponent2.getSign();
        TemplateAssembler templateAssembler = (TemplateAssembler) c79655VNz.LIZ;
        if (templateAssembler == null) {
            return;
        }
        templateAssembler.LJJ(sign, sign2);
    }

    public final void LJIIZILJ(VV0 vv0) {
        C79829VUr c79829VUr;
        int i = vv0.LIZIZ;
        if (i != -1 && (c79829VUr = this.LJLIL.LJLJI) != null && i < c79829VUr.getItemCount()) {
            UIList uIList = this.LJLIL;
            C79829VUr c79829VUr2 = uIList.LJLJI;
            if (c79829VUr2.LJLJJI) {
                uIList.LJIJJLI(vv0.LIZIZ, c79829VUr2.LJLZ(), this.LJLIL.LJLJI.LLD);
                return;
            }
            UIComponent uIComponent = vv0.LIZ;
            int i2 = vv0.LIZIZ;
            long LJLZ = c79829VUr2.LJLZ();
            C79655VNz c79655VNz = uIList.LJLIL;
            int sign = uIList.getSign();
            int sign2 = uIComponent.getSign();
            TemplateAssembler templateAssembler = (TemplateAssembler) c79655VNz.LIZ;
            if (templateAssembler == null) {
                return;
            }
            templateAssembler.LJJIZ(sign, sign2, i2, LJLZ);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.LJLILLLLZI.indexOfChild(view) >= 0) {
            return;
        }
        C79698VPq c79698VPq = this.LJLILLLLZI;
        c79698VPq.getClass();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null) {
            LLog.LIZLLL(4, "ListStickyManager", "addRecyclerView failed, parent is null.");
            return;
        }
        int indexOfChild = viewGroup.indexOfChild(view);
        C16880lQ.LLIFFJFJJ(indexOfChild, viewGroup);
        c79698VPq.addView(view, new FrameLayout.LayoutParams(-1, -1));
        viewGroup.addView(c79698VPq, indexOfChild);
    }

    public final void LJJ(int i, RecyclerView recyclerView) {
        VV0 vv0;
        int i2;
        C79831VUt c79831VUt;
        int LLD;
        int LL;
        int i3;
        int i4;
        C79831VUt c79831VUt2;
        if (i > 0) {
            VV0 vv02 = this.LJLJL;
            int i5 = vv02.LIZIZ;
            if (i5 != -1 && (c79831VUt2 = (C79831VUt) ((RecyclerView) this.LJLIL.mView).LJJIZ(i5)) != null) {
                LJIL(vv02, c79831VUt2, false, false);
            }
        } else if (i < 0 && (i2 = (vv0 = this.LJLJJLL).LIZIZ) != -1 && (c79831VUt = (C79831VUt) ((RecyclerView) this.LJLIL.mView).LJJIZ(i2)) != null) {
            LJIL(vv0, c79831VUt, true, false);
        }
        int i6 = -1;
        int i7 = -1;
        for (int i8 = 0; i8 < recyclerView.getChildCount(); i8++) {
            View childAt = recyclerView.getChildAt(i8);
            if (childAt.getTop() <= this.LJLJJI && childAt.getBottom() > this.LJLJJI) {
                i6 = recyclerView.LJJJJJL(childAt).getAdapterPosition();
            }
            if (childAt.getTop() < recyclerView.getHeight() - this.LJLJJI && childAt.getBottom() >= recyclerView.getHeight() - this.LJLJJI) {
                i7 = recyclerView.LJJJJJL(childAt).getAdapterPosition();
            }
        }
        C79829VUr c79829VUr = this.LJLIL.LJLJI;
        if (c79829VUr != null) {
            if (this.LJLJLJ) {
                LLD = c79829VUr.LJZL(i6);
            } else {
                LLD = c79829VUr.LLD(i6);
            }
            if (this.LJLJLJ) {
                LL = c79829VUr.LJZI(i7);
            } else {
                LL = c79829VUr.LL(i7);
            }
            if (c79829VUr.LJLL.contains(Integer.valueOf(LLD))) {
                if (this.LJLJI != LLD) {
                    this.LJLJI = LLD;
                }
            } else {
                this.LJLJI = -1;
            }
            if (c79829VUr.LJLLI.contains(Integer.valueOf(LL))) {
                if (this.LJLJJL != LL) {
                    this.LJLJJL = LL;
                }
            } else {
                this.LJLJJL = -1;
            }
            VV0 vv03 = this.LJLJJLL;
            int i9 = vv03.LIZIZ;
            if (i9 != -1 && (i4 = this.LJLJI) != -1 && i9 != i4) {
                LJIILLIIL(vv03);
            }
            VV0 vv04 = this.LJLJL;
            int i10 = vv04.LIZIZ;
            if (i10 != -1 && (i3 = this.LJLJJL) != -1 && i10 != i3) {
                LJIILLIIL(vv04);
            }
        }
        LJIJI(this.LJLJJLL, this.LJLJI, true);
        LJIJI(this.LJLJL, this.LJLJJL, false);
        LJIJJ();
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        if (i2 == 0) {
            recyclerView.post(new ARunnableS33S0200000_14(this, recyclerView, 22));
        } else {
            LJJ(i2, recyclerView);
        }
    }

    public final void LJIJ(VV0 vv0, boolean z, boolean z2) {
        int i = vv0.LIZIZ;
        if (i == -1) {
            return;
        }
        C79831VUt c79831VUt = (C79831VUt) ((RecyclerView) this.LJLIL.mView).LJJIZ(i);
        if (c79831VUt == null) {
            LJIJJLI(vv0.LIZ.mView);
            vv0.LIZIZ = -1;
            vv0.LIZ = null;
            return;
        }
        LJIL(vv0, c79831VUt, z, z2);
    }

    public final void LJIJI(VV0 vv0, int i, boolean z) {
        boolean z2;
        int i2;
        int i3;
        if (i == -1 || i == vv0.LIZIZ) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) this.LJLIL.mView;
        C79831VUt c79831VUt = (C79831VUt) recyclerView.LJJIZ(i);
        int i4 = 0;
        if (c79831VUt == null) {
            c79831VUt = (C79831VUt) recyclerView.getAdapter().createViewHolder(recyclerView, recyclerView.getAdapter().getItemViewType(i));
            C79829VUr c79829VUr = this.LJLIL.LJLJI;
            if (c79829VUr.LJLJJI) {
                c79829VUr.LJLLLLLL(c79831VUt, i);
            } else {
                c79829VUr.bindViewHolder(c79831VUt, i);
            }
        } else if (z) {
            if (c79831VUt.LJLIL.getTop() >= this.LJLJJI) {
                return;
            }
        } else {
            if (!z && c79831VUt.LJLIL.getBottom() > this.LJLILLLLZI.getHeight() - this.LJLJJI) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (0 == 0 && !z2) {
                return;
            }
        }
        VRX vrx = c79831VUt.LJLIL;
        UIComponent uIComponent = vrx.LJLILLLLZI;
        if (uIComponent == null) {
            return;
        }
        vrx.removeAllViews();
        c79831VUt.LJLIL.LJLILLLLZI = null;
        if (z) {
            i2 = 48;
        } else {
            i2 = 80;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, i2);
        if (z) {
            i3 = this.LJLJJI;
        } else {
            i3 = 0;
        }
        layoutParams.topMargin = i3;
        if (!z) {
            i4 = this.LJLJJI;
        }
        layoutParams.bottomMargin = i4;
        LJIJJLI(uIComponent.mView);
        this.LJLILLLLZI.addView(uIComponent.mView, layoutParams);
        vv0.LIZ = uIComponent;
        vv0.LIZIZ = i;
    }

    public final void LJIL(VV0 vv0, C79831VUt c79831VUt, boolean z, boolean z2) {
        T t;
        if (vv0.LIZIZ == -1) {
            return;
        }
        int top = c79831VUt.LJLIL.getTop();
        T t2 = vv0.LIZ.mView;
        if (t2 == 0) {
            return;
        }
        if (!z ? top >= t2.getTop() : top <= t2.getTop()) {
            if (!z2) {
                return;
            }
        }
        UIComponent uIComponent = vv0.LIZ;
        if (uIComponent != null && (t = uIComponent.mView) != 0) {
            t.setTranslationY(0.0f);
        }
        LJIJJLI(vv0.LIZ.mView);
        UIComponent uIComponent2 = c79831VUt.LJLIL.LJLILLLLZI;
        if (uIComponent2 != null) {
            UIList uIList = this.LJLIL;
            if (uIList.LJLJI.LJLJJI) {
                uIList.LJIL(uIComponent2);
            }
            VRX vrx = c79831VUt.LJLIL;
            if (vrx.LJLILLLLZI != null) {
                vrx.removeAllViews();
                c79831VUt.LJLIL.LJLILLLLZI = null;
            }
        }
        c79831VUt.L(vv0.LIZ);
        vv0.LIZIZ = -1;
        vv0.LIZ = null;
    }
}
