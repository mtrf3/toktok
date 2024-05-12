package com.bytedance.android.live.design.view.sheet;

import X.ActivityC45651qj;
import X.C03880Dg;
import X.C0KB;
import X.C0P1;
import X.C0P4;
import X.C10A;
import X.C12830et;
import X.C12840eu;
import X.C141335gf;
import X.C16880lQ;
import X.C17230lz;
import X.C18950ol;
import X.C259910h;
import X.C29S;
import X.C30161Gi;
import X.C30171Gj;
import X.C3C5;
import X.C41011jF;
import X.C65300Pk0;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC32911Qx;
import X.V16;
import X.X1D;
import Y.IDCListenerS10S0101000;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public abstract class LiveSheetFragment extends LiveThemeAwareFragment implements InterfaceC32911Qx {
    public static final /* synthetic */ int LL = 0;
    public SheetOptions LJLIL;
    public boolean LJLILLLLZI = true;
    public int LJLJI;
    public View LJLJJI;
    public GradientDrawable LJLJJL;
    public C30171Gj LJLJJLL;
    public GradientDrawable LJLJL;
    public FrameLayout LJLJLJ;
    public SheetOptions LJLJLLL;
    public SheetOptions LJLL;
    public LiveBottomSheetBehavior<View> LJLLI;
    public View LJLLILLLL;
    public C41011jF LJLLJ;
    public GradientDrawable LJLLL;
    public C17230lz LJLLLL;
    public final String LJLLLLLL;
    public C12830et LJLZ;
    public boolean LJZ;
    public int LJZI;
    public RecyclerView LJZL;

    public boolean Dl() {
        return true;
    }

    public C17230lz Il() {
        return null;
    }

    public abstract View Jl(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public C0KB Kl() {
        return null;
    }

    public SheetOptions Ll(Context context) {
        return null;
    }

    @Override // X.InterfaceC32911Qx
    public final boolean ah() {
        return true;
    }

    @Override // X.InterfaceC32911Qx
    public final Fragment getFragment() {
        return this;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        Hl(true);
        C12830et c12830et = this.LJLZ;
        if (c12830et != null) {
            c12830et.LJIIJJI(this);
        }
        super.onDestroyView();
    }

    public final C30161Gi Gl() {
        if (this.LJLZ == null) {
            return null;
        }
        return new C30161Gi(R.attr.asm, new IDCListenerS10S0101000(0, this, 6));
    }

    @Override // X.InterfaceC32911Qx
    public final boolean LJJJLZIJ() {
        LiveBottomSheetBehavior<View> liveBottomSheetBehavior = this.LJLLI;
        if (liveBottomSheetBehavior != null && this.LJLJLLL.fullscreenEnabled && liveBottomSheetBehavior.LJIJI == 3) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC32911Qx
    public final void Q9() {
        SheetOptions sheetOptions;
        LiveBottomSheetBehavior<View> liveBottomSheetBehavior = this.LJLLI;
        if (liveBottomSheetBehavior != null && (sheetOptions = this.LJLJLLL) != null && sheetOptions.fullscreenEnabled) {
            liveBottomSheetBehavior.setState(4);
        }
    }

    public void close() {
        C12830et c12830et = this.LJLZ;
        if (c12830et != null) {
            c12830et.LIZIZ(this);
        }
    }

    @Override // X.InterfaceC32911Qx
    public final void hide() {
        C12830et c12830et = this.LJLZ;
        if (c12830et != null) {
            c12830et.LJ(this);
        }
    }

    @Override // X.InterfaceC32911Qx
    public final void show() {
        C12830et c12830et = this.LJLZ;
        if (c12830et != null) {
            c12830et.LJIILIIL(this);
        }
    }

    public LiveSheetFragment() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(String.valueOf(System.nanoTime()));
        LIZ.append(UUID.randomUUID());
        this.LJLLLLLL = X1D.LIZIZ(LIZ);
    }

    public final void Al() {
        if (isHidden()) {
            FrameLayout frameLayout = this.LJLJLJ;
            if (frameLayout != null && this.LJLLI != null) {
                C0P1.LIZJ(frameLayout, null);
                LiveBottomSheetBehavior<View> liveBottomSheetBehavior = this.LJLLI;
                liveBottomSheetBehavior.LJII = 0;
                liveBottomSheetBehavior.LJIJ = this.LJLJLLL.draggable;
                liveBottomSheetBehavior.LJJJIL = 0;
                FrameLayout frameLayout2 = this.LJLJLJ;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), this.LJLJLJ.getPaddingTop(), this.LJLJLJ.getPaddingRight(), 0);
                return;
            }
            return;
        }
        FrameLayout frameLayout3 = this.LJLJLJ;
        if (frameLayout3 == null) {
            return;
        }
        C0P1.LIZJ(frameLayout3, new C0P4() { // from class: X.1GX
            @Override // X.C0P4
            public final C0PI LIZLLL(C0PI c0pi, List<C0PA> list) {
                LiveSheetFragment.this.xl(c0pi.LIZ(8).LIZLLL, c0pi.LIZ(7).LIZLLL);
                return c0pi;
            }
        });
    }

    @Override // X.InterfaceC32911Qx
    public final boolean n5() {
        return !isLight(getContext());
    }

    @Override // X.InterfaceC32911Qx
    public final SheetOptions g1() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC32911Qx
    public final String nk() {
        return this.LJLLLLLL;
    }

    public void Hl(boolean z) {
        if (this.LJZI > 0 && V16.LJJIIJZLJL(getView()) && z) {
            xl(0, 0);
        }
    }

    @Override // X.InterfaceC32911Qx
    public final int Ng(Context context) {
        return C259910h.LIZIZ(R.attr.bme, context);
    }

    @Override // X.InterfaceC32911Qx
    public final void jb(C12830et c12830et) {
        this.LJLZ = c12830et;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.LJLIL = (SheetOptions) getArguments().getParcelable("com.bytedance.android.live.design.view.sheet.SHEET_OPTIONS");
            this.LJLILLLLZI = getArguments().getBoolean("com.bytedance.android.live.design.view.sheet.SHOWS_SHEET", true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "7337186662215826153");
        if (c03880Dg.LIZJ(10501, "com/bytedance/android/live/design/view/sheet/LiveSheetFragment", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/bytedance/android/live/design/view/sheet/LiveSheetFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.onHiddenChanged(z);
        if (z) {
            Hl(true);
        }
        Al();
        c03880Dg.LIZIZ(10501, "com/bytedance/android/live/design/view/sheet/LiveSheetFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
    }

    @Override // X.InterfaceC32911Qx
    public final void onWindowFocusChanged(boolean z) {
        if (!z) {
            Hl(true);
        }
    }

    public final void vl(float f) {
        GradientDrawable gradientDrawable;
        if (this.LJLZ != null && (gradientDrawable = this.LJLJJL) != null) {
            gradientDrawable.mutate();
            if (this.LJLZ.LJI()) {
                this.LJLJJL.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
            } else if (this.LJLZ.LJIIJ == 1) {
                this.LJLJJL.setCornerRadii(new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f});
            } else {
                this.LJLJJL.setCornerRadii(new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f});
            }
        }
    }

    public final void wl(float f) {
        GradientDrawable gradientDrawable;
        if (this.LJLZ != null && (gradientDrawable = this.LJLJL) != null) {
            gradientDrawable.mutate();
            if (this.LJLZ.LJI()) {
                this.LJLJL.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
            } else if (this.LJLZ.LJIIJ == 1) {
                this.LJLJL.setCornerRadii(new float[]{0.0f, 0.0f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
            } else {
                this.LJLJL.setCornerRadii(new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x032a  */
    /* JADX WARN: Type inference failed for: r0v44, types: [X.1jI] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 1368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.design.view.sheet.LiveSheetFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void xl(int i, int i2) {
        int i3;
        int i4;
        int height;
        int height2;
        this.LJZI = i;
        if (!this.LJLILLLLZI) {
            return;
        }
        if (this.LJLJLJ.hasWindowFocus()) {
            C12830et c12830et = this.LJLZ;
            if (c12830et != null && !c12830et.LJI()) {
                C12840eu.LIZ.getClass();
                if (this.LJLLJ != null && Dl()) {
                    height2 = 0;
                } else {
                    height2 = this.LJLLJ.getHeight();
                }
                i3 = Math.max(0, i - height2);
            } else {
                int i5 = i - i2;
                if (this.LJLLJ != null && Dl()) {
                    height = 0;
                } else {
                    height = this.LJLLJ.getHeight();
                }
                i3 = Math.max(0, i5 - height);
            }
        } else {
            i3 = 0;
        }
        if (this.LJLJLJ.getPaddingBottom() != i3) {
            LiveBottomSheetBehavior<View> liveBottomSheetBehavior = this.LJLLI;
            liveBottomSheetBehavior.LJII = i3;
            if (i3 > 0) {
                SheetOptions sheetOptions = this.LJLL;
                if (sheetOptions != null && !this.LJZ && liveBottomSheetBehavior.LJIJI != 3) {
                    liveBottomSheetBehavior.LIZIZ(sheetOptions, false);
                    this.LJZ = true;
                }
                this.LJLLI.LJIJ = false;
            } else {
                if (this.LJZ) {
                    liveBottomSheetBehavior.LIZIZ(this.LJLJLLL, false);
                    this.LJZ = false;
                }
                this.LJLLI.LJIJ = this.LJLJLLL.draggable;
            }
            LiveBottomSheetBehavior<View> liveBottomSheetBehavior2 = this.LJLLI;
            if (this.LJLLJ != null && Dl()) {
                i4 = 0;
            } else {
                i4 = i3;
            }
            liveBottomSheetBehavior2.LJJJIL = i4;
            FrameLayout frameLayout = this.LJLJLJ;
            frameLayout.setPadding(frameLayout.getPaddingLeft(), this.LJLJLJ.getPaddingTop(), this.LJLJLJ.getPaddingRight(), i3);
        }
        RecyclerView recyclerView = this.LJZL;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                this.LJZL.getChildAt(i6).requestLayout();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        if (i2 == 0 || getContext() == null) {
            return null;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), i2);
        if (i2 == R.anim.dy) {
            loadAnimation.setInterpolator(C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
        } else if (i2 == R.anim.dz) {
            loadAnimation.setInterpolator(C18950ol.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f));
            loadAnimation.setStartOffset(100L);
        }
        return loadAnimation;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        View Jl;
        int i;
        o.LJIIIZ(inflater, "inflater");
        C12830et c12830et = this.LJLZ;
        if (c12830et != null) {
            z = c12830et.LJI();
        } else {
            z = true;
        }
        if (this.LJLILLLLZI) {
            if (z) {
                i = R.layout.bpd;
            } else {
                i = R.layout.bpe;
            }
            Jl = C16880lQ.LLLLIILL(inflater, i, viewGroup, false);
        } else {
            Jl = Jl(inflater, viewGroup);
        }
        C29S c29s = null;
        if (!(Jl instanceof View)) {
            Jl = null;
        }
        if (Jl != null) {
            try {
                ViewTreeLifecycleOwner.set(Jl, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(Jl, this);
                C10A.LIZIZ(Jl, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return Jl;
    }
}
