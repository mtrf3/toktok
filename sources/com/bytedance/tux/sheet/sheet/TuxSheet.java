package com.bytedance.tux.sheet.sheet;

import X.ASI;
import X.ASK;
import X.ASM;
import X.ASN;
import X.ASP;
import X.ASQ;
import X.ASW;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C235119Kp;
import X.C26255ASd;
import X.C26338AVi;
import X.C29S;
import X.C3C5;
import X.C53860LBw;
import X.C74291TDr;
import X.C76800UCe;
import X.C7MY;
import X.C90903hW;
import X.DialogInterfaceOnKeyListenerC25844ACi;
import X.InterfaceC36571c5;
import X.KMP;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.sheet.BaseSheet;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TuxSheet extends BaseSheet {
    public static final /* synthetic */ int LLIIIILZ = 0;
    public View LJLLI;
    public Fragment LJLLILLLL;
    public C235119Kp LJLLL;
    public int LJLLLL;
    public boolean LJZL;
    public ASI LLF;
    public C74291TDr LLFF;
    public C26255ASd LLFFF;
    public Integer LLFII;
    public BottomSheetBehavior<?> LLFZ;
    public View LLI;
    public boolean LLII;
    public final Map<Integer, View> LLIIII = new LinkedHashMap();
    public boolean LJLLJ = true;
    public int LJLLLLLL = -1;
    public int LJLZ = -1;
    public int LJZ = -1;
    public boolean LJZI = true;
    public boolean LL = true;
    public boolean LLD = true;
    public final ASM LLIFFJFJJ = new ASM(this);

    static {
        new ASQ();
    }

    @Override // com.bytedance.tux.sheet.BaseSheet
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIII).clear();
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.tux.sheet.BaseSheet
    public final int vl() {
        int i = this.LJLLLL;
        if (i == 0) {
            return R.style.ad6;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return R.style.ad6;
                }
                return R.style.ad4;
            }
            return wl(this.LJLZ);
        }
        return wl(this.LJLLLLLL);
    }

    public final void xl() {
        if (getChildFragmentManager().LJJJJIZL() > 0) {
            getChildFragmentManager().LJJLIIIJL();
            return;
        }
        if (!this.LL) {
            return;
        }
        ASQ.LJIIJJI(getDialog(), ASW.LIZ);
        Dialog dialog = getDialog();
        if (dialog != null) {
            onCancel(dialog);
        }
        dismissAllowingStateLoss();
    }

    public final void Dl(View view) {
        InterfaceC36571c5 interfaceC36571c5 = this.LJLLILLLL;
        if (interfaceC36571c5 != null && (interfaceC36571c5 instanceof ASN)) {
            ((ASN) interfaceC36571c5).a5();
        }
    }

    public final void Gl(C235119Kp c235119Kp) {
        ViewGroup.LayoutParams layoutParams;
        if (this.LJLLLL == 2 && c235119Kp != null) {
            ASI asi = this.LLF;
            C53860LBw c53860LBw = null;
            if (asi != null) {
                layoutParams = asi.getLayoutParams();
            } else {
                layoutParams = null;
            }
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = C7MY.LIZIZ(14);
            ASI asi2 = this.LLF;
            if (asi2 != null) {
                asi2.setLayoutParams(layoutParams2);
            }
            C26255ASd c26255ASd = this.LLFFF;
            if (c26255ASd != null) {
                c53860LBw = c26255ASd.getHandleView();
            }
            ASI asi3 = this.LLF;
            if (asi3 != null) {
                asi3.LJLIL.LJIJJ();
                asi3.LJLILLLLZI.LJIJJ();
            }
            ASI asi4 = this.LLF;
            if (asi4 != null) {
                int currentNavBarBackgroundColor = asi4.getCurrentNavBarBackgroundColor();
                if (c53860LBw != null) {
                    c53860LBw.setBackgroundColor(currentNavBarBackgroundColor);
                }
            }
            ASI asi5 = this.LLF;
            if (asi5 != null) {
                asi5.getCurrentNavBarBackgroundColor();
            }
        }
    }

    public final void Hl(boolean z) {
        if (z) {
            if (!this.LLII) {
                C74291TDr c74291TDr = this.LLFF;
                if (c74291TDr != null) {
                    float f = BaseSheet.LJLL;
                    c74291TDr.LIZ(f, f, 0.0f, 0.0f);
                }
                ASP asp = (ASP) getDialog();
                if (asp != null) {
                    asp.LJJIFFI(true);
                }
                this.LLII = true;
                return;
            }
            return;
        }
        if (!this.LLII) {
            return;
        }
        C74291TDr c74291TDr2 = this.LLFF;
        if (c74291TDr2 != null) {
            c74291TDr2.setRadius(0.0f);
        }
        ASP asp2 = (ASP) getDialog();
        if (asp2 != null) {
            asp2.LJJIFFI(false);
        }
        this.LLII = false;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getChildFragmentManager().LJJLIL(new ASK(this), false);
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnKeyListener(new DialogInterfaceOnKeyListenerC25844ACi(new AqS154S0100000_4(this, 31)));
        Integer num = this.LLFII;
        if (num != null) {
            int intValue = num.intValue();
            Window window = onCreateDialog.getWindow();
            if (window != null) {
                window.setSoftInputMode(intValue);
            }
        }
        return onCreateDialog;
    }

    public final void Al(Fragment fragment, boolean z) {
        boolean z2 = true;
        String LJ = KMP.LJ("sheet_content_fragment", getChildFragmentManager().LJJJJIZL() + 1);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        Context context = getContext();
        if (context == null || !C26338AVi.LIZJ(context)) {
            z2 = false;
        }
        if (z2) {
            LIZ.LJIIJJI(R.anim.fm, R.anim.fp, R.anim.fn, R.anim.fo);
        } else {
            LIZ.LJIIJJI(R.anim.fn, R.anim.fo, R.anim.fm, R.anim.fp);
        }
        LIZ.LJIIJ(fragment, LJ, R.id.jvy);
        if (z) {
            LIZ.LJ(LJ);
        }
        LIZ.LJI();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Window window;
        Window window2;
        Window window3;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ch, viewGroup, false);
        this.LLFF = (C74291TDr) LLLLIILL.findViewById(R.id.ilw);
        this.LLII = false;
        Hl(true);
        C26255ASd c26255ASd = (C26255ASd) LLLLIILL.findViewById(R.id.jvv);
        this.LLFFF = c26255ASd;
        c26255ASd.setFixedHeightPx(this.LJLLLLLL);
        c26255ASd.setDynamicPeekHeightPx(this.LJLZ);
        c26255ASd.setDynamicMaxHeightPx(this.LJZ);
        c26255ASd.setVariant(this.LJLLLL);
        c26255ASd.setHideable(this.LLD);
        c26255ASd.setDismissFunc(new AqS154S0100000_4(this, 32));
        c26255ASd.setBehavior(this.LLFZ);
        c26255ASd.setBottomSheetCallback(this.LLIFFJFJJ);
        ViewStub viewStub = (ViewStub) LLLLIILL.findViewById(R.id.jvz);
        if (this.LJZI) {
            i = R.layout.cj;
        } else {
            i = R.layout.ck;
        }
        viewStub.setLayoutResource(i);
        View inflate = viewStub.inflate();
        C29S c29s = null;
        if (o.LJ(null, Boolean.TRUE)) {
            ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = C7MY.LIZIZ(14);
            inflate.setLayoutParams(marginLayoutParams);
        }
        if (this.LJZL) {
            View findViewById = LLLLIILL.findViewById(R.id.jvy);
            ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
            layoutParams2.height = -1;
            findViewById.setLayoutParams(layoutParams2);
        }
        View view = this.LJLLI;
        if (view != null) {
            view.setTag(R.id.c2m, this);
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                C16880lQ.LJLLL(view, (ViewGroup) parent);
            }
            ((ViewGroup) LLLLIILL.findViewById(R.id.jvy)).addView(view);
        }
        Fragment fragment = this.LJLLILLLL;
        if (fragment != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(childFragmentManager);
            c1b3.LJIIJ(fragment, "sheet_content_fragment", R.id.jvy);
            c1b3.LJI();
        }
        ASI asi = (ASI) LLLLIILL.findViewById(R.id.jw8);
        this.LLF = asi;
        if (asi != null) {
            asi.setNavActions(this.LJLLL);
        }
        ASI asi2 = this.LLF;
        if (asi2 != null) {
            asi2.setNavBarBackgroundColor(0);
        }
        Gl(this.LJLLL);
        if (this.LJLLJ) {
            Dialog dialog = getDialog();
            if (dialog != null && (window3 = dialog.getWindow()) != null) {
                window3.addFlags(2);
            }
            Dialog dialog2 = getDialog();
            if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
                window2.setDimAmount(0.5f);
            }
        } else {
            Dialog dialog3 = getDialog();
            if (dialog3 != null && (window = dialog3.getWindow()) != null) {
                window.clearFlags(2);
            }
        }
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }
}
