package com.ss.android.ugc.gamora.editor.sticker.donation;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C42023GeR;
import X.C42691GpD;
import X.C42693GpF;
import X.C42694GpG;
import X.C42695GpH;
import X.C42699GpL;
import X.C42847Grj;
import X.C65531Pnj;
import X.C76800UCe;
import X.C90903hW;
import X.HJO;
import X.WM7;
import X.WMA;
import Y.ARunnableS43S0100000_7;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.scene.navigation.NavigationScene;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class EditSelectDonationOrganizationDialogFragment extends DialogFragment {
    public C42691GpD LJLIL;
    public C42699GpL LJLILLLLZI;
    public boolean LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C42691GpD c42691GpD = this.LJLIL;
        if (c42691GpD != null) {
            c42691GpD.LJII();
            super.onDestroy();
        } else {
            o.LJIJI("sceneDispatcher");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C42691GpD c42691GpD = this.LJLIL;
        if (c42691GpD != null) {
            c42691GpD.LIZJ();
            super.onPause();
        } else {
            o.LJIJI("sceneDispatcher");
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        Dialog dialog;
        Window window;
        if (!this.LJLJI && (dialog = getDialog()) != null && (window = dialog.getWindow()) != null) {
            window.setWindowAnimations(0);
        }
        C42691GpD c42691GpD = this.LJLIL;
        if (c42691GpD != null) {
            c42691GpD.LJI();
            super.onStop();
        } else {
            o.LJIJI("sceneDispatcher");
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C42691GpD c42691GpD = this.LJLIL;
        if (c42691GpD != null) {
            c42691GpD.LIZLLL();
        } else {
            o.LJIJI("sceneDispatcher");
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        C42691GpD c42691GpD = this.LJLIL;
        if (c42691GpD != null) {
            c42691GpD.LJFF();
            View view = getView();
            if (view != null) {
                view.postDelayed(new ARunnableS43S0100000_7(this, 57), 50L);
            }
            Dialog dialog = getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                ViewTreeLifecycleOwner.set(decorView, this);
                ViewTreeViewModelStoreOwner.set(decorView, this);
                C10A.LIZIZ(decorView, this);
                return;
            }
            return;
        }
        o.LJIJI("sceneDispatcher");
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.a82);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        o.LJIIIIZZ(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.a5f);
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        this.LJLJI = true;
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C42847Grj c42847Grj;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C42847Grj c42847Grj2 = new C42847Grj();
        Bundle arguments = getArguments();
        if (arguments != null) {
            c42847Grj2.mArguments = arguments;
        }
        HJO hjo = new HJO((Bundle) null, C42847Grj.class);
        hjo.LIZJ = false;
        hjo.LIZLLL = false;
        hjo.LJ = 0;
        WM7 LIZ = C65531Pnj.LIZ(hjo.LIZ(), NavigationScene.class);
        o.LJII(LIZ, "null cannot be cast to non-null type com.bytedance.scene.navigation.NavigationScene");
        NavigationScene navigationScene = (NavigationScene) LIZ;
        navigationScene.LJLILLLLZI = new C42693GpF(c42847Grj2);
        C42691GpD c42691GpD = new C42691GpD(new WMA(R.id.j71, new C42023GeR(this), navigationScene, new C42695GpH(), null, false));
        this.LJLIL = c42691GpD;
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        c42691GpD.LIZIZ(requireActivity, bundle);
        WM7 LLJJIII = navigationScene.LLJJIII();
        if (!(LLJJIII instanceof C42847Grj) || (c42847Grj = (C42847Grj) LLJJIII) == null) {
            return;
        }
        c42847Grj.LJLJL = new C42694GpG(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.au1, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
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
        return LLLLIILL;
    }
}
