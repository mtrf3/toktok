package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Npj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60559Npj extends FrameLayout implements InterfaceC60585Nq9, InterfaceC60582Nq6 {
    public static final /* synthetic */ int LJLL = 0;
    public AbstractC60578Nq2 LJLIL;
    public BottomSheetBehavior<FrameLayout> LJLILLLLZI;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLJI;
    public C60560Npk LJLJJI;
    public boolean LJLJJL;
    public View LJLJJLL;
    public View LJLJL;
    public InterfaceC88472Yns<? super String, C76800UCe> LJLJLJ;
    public final C60576Nq0 LJLJLLL;

    @Override // X.InterfaceC60582Nq6
    public final void LIZ() {
        this.LJLJJL = true;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.LJLILLLLZI;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(4);
        }
    }

    @Override // X.InterfaceC60582Nq6
    public final void LIZIZ() {
        this.LJLJJL = true;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.LJLILLLLZI;
        if (bottomSheetBehavior != null) {
            if (bottomSheetBehavior.LJFF == 5) {
                InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = this.LJLJI;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(true);
                    return;
                }
                return;
            }
            bottomSheetBehavior.setState(5);
        }
    }

    @Override // X.InterfaceC60582Nq6
    public final void LIZLLL() {
        this.LJLJJL = false;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.LJLILLLLZI;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(5);
        }
    }

    public final boolean LJFF() {
        InterfaceC60583Nq7 interfaceC60583Nq7 = this.LJLJJI.LJLJLJ;
        if (interfaceC60583Nq7 != null && interfaceC60583Nq7.LIZ()) {
            return true;
        }
        return false;
    }

    public final void LJI() {
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = this.LJLJI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.valueOf(this.LJLJJL));
        }
    }

    public final AbstractC60578Nq2 getOnBottomSheetCallback() {
        return this.LJLIL;
    }

    public C60559Npj(Context context) {
        super(context, null, 0);
        this.LJLJJI = new C60560Npk(0, 0, 0, 0, 0, 0, null, 0, false, false, false, 4095);
        this.LJLJJL = true;
        this.LJLJLLL = new C60576Nq0(this);
    }

    public final void setOnBottomSheetCallback(AbstractC60578Nq2 abstractC60578Nq2) {
        this.LJLIL = abstractC60578Nq2;
    }

    @Override // X.InterfaceC60585Nq9
    public final void LIZJ(int i, Integer num, boolean z) {
        C45621qg c45621qg;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        View view = this.LJLJJLL;
        C74084T5s c74084T5s = null;
        if (view != null) {
            c45621qg = (C45621qg) view.findViewById(R.id.bv5);
            if (c45621qg != null) {
                c74084T5s = (C74084T5s) c45621qg.findViewById(R.id.bn4);
            }
        } else {
            c45621qg = null;
        }
        View view2 = this.LJLJL;
        if (z) {
            if (num != null) {
                C60560Npk c60560Npk = this.LJLJJI;
                if (c60560Npk.LJLIL == 0 && !c60560Npk.LJLL) {
                    int min = Math.min(c60560Npk.LJLJJLL, num.intValue());
                    BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.LJLILLLLZI;
                    if (bottomSheetBehavior != null) {
                        bottomSheetBehavior.setPeekHeight(min);
                    }
                    if (c45621qg != null && (layoutParams3 = c45621qg.getLayoutParams()) != null) {
                        layoutParams3.height = min;
                    }
                    if (c74084T5s != null && (layoutParams2 = c74084T5s.getLayoutParams()) != null) {
                        layoutParams2.height = min;
                    }
                    if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
                        layoutParams.height = min;
                    }
                }
            }
            View view3 = this.LJLJJLL;
            if (view3 != null) {
                view3.setPadding(0, 0, 0, i);
                return;
            }
            return;
        }
        if (c45621qg != null && c74084T5s != null && view2 != null) {
            LJ(c45621qg, c74084T5s, view2);
        }
        View view4 = this.LJLJJLL;
        if (view4 == null) {
            return;
        }
        view4.setPadding(0, 0, 0, 0);
    }

    public final void LJ(C45621qg c45621qg, C74084T5s c74084T5s, View view) {
        C60560Npk c60560Npk = this.LJLJJI;
        int i = c60560Npk.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    } else {
                        throw new Exception("auto height is an incubating feature");
                    }
                }
                throw new Exception("auto height is an incubating feature");
            }
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.LJLILLLLZI;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setPeekHeight(c60560Npk.LJLJJLL);
            }
            ViewGroup.LayoutParams layoutParams = c45621qg.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -1;
            }
            ViewGroup.LayoutParams layoutParams2 = c74084T5s.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -1;
            }
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            if (layoutParams3 == null) {
                return;
            }
            layoutParams3.height = -2;
            return;
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior2 = this.LJLILLLLZI;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.setPeekHeight(c60560Npk.LJLJJLL);
        }
        ViewGroup.LayoutParams layoutParams4 = c45621qg.getLayoutParams();
        if (layoutParams4 != null) {
            layoutParams4.height = this.LJLJJI.LJLJJLL;
        }
        ViewGroup.LayoutParams layoutParams5 = c74084T5s.getLayoutParams();
        if (layoutParams5 != null) {
            layoutParams5.height = this.LJLJJI.LJLJJLL;
        }
        if (this.LJLJJI.LJLL) {
            ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
            if (layoutParams6 != null) {
                layoutParams6.height = -1;
            }
            ViewGroup.LayoutParams layoutParams7 = c74084T5s.getLayoutParams();
            if (layoutParams7 != null) {
                layoutParams7.height = -1;
            }
        } else {
            ViewGroup.LayoutParams layoutParams8 = view.getLayoutParams();
            if (layoutParams8 != null) {
                layoutParams8.height = this.LJLJJI.LJLJJLL;
            }
            ViewGroup.LayoutParams layoutParams9 = c74084T5s.getLayoutParams();
            if (layoutParams9 != null) {
                layoutParams9.height = this.LJLJJI.LJLJJLL;
            }
        }
        if (this.LJLJJI.LJLJJL <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams10 = c45621qg.getLayoutParams();
        if (layoutParams10 != null) {
            layoutParams10.width = this.LJLJJI.LJLJJL;
        }
        ViewGroup.LayoutParams layoutParams11 = c74084T5s.getLayoutParams();
        if (layoutParams11 != null) {
            layoutParams11.width = this.LJLJJI.LJLJJL;
        }
        ViewGroup.LayoutParams layoutParams12 = view.getLayoutParams();
        if (layoutParams12 == null) {
            return;
        }
        layoutParams12.width = this.LJLJJI.LJLJJL;
    }
}
