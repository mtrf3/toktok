package com.ss.android.ugc.tiktok.addyours.ui.fragment;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C17N;
import X.C1B3;
import X.C1B6;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C28289B8j;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC219588ja;
import X.InterfaceC36571c5;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import q03.IDaS483S0100000_3;

/* loaded from: classes4.dex */
public final class PadAdaptionFragment extends AppCompatDialogFragment {
    public Fragment LJLIL;
    public Integer LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        Window window2;
        Window window3;
        Dialog dialog = getDialog();
        if (dialog != null && (window3 = dialog.getWindow()) != null) {
            window3.requestFeature(1);
        }
        super.onActivityCreated(bundle);
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
            C28289B8j.LIZIZ(0, window2);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null && (window = dialog3.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        Window window;
        WindowManager.LayoutParams attributes;
        o.LJIIIZ(dialog, "dialog");
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            attributes.windowAnimations = R.anim.cb;
        }
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC219588ja interfaceC219588ja;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        Fragment fragment = this.LJLIL;
        C235119Kp c235119Kp = null;
        if (fragment != null) {
            LIZ.LJIIJ(fragment, null, R.id.bs8);
            LIZ.LJII();
            _$_findCachedViewById(R.id.j71).setClickable(true);
            View overlay = _$_findCachedViewById(R.id.heu);
            o.LJIIIIZZ(overlay, "overlay");
            C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 29, 42, 42), overlay);
            InterfaceC36571c5 interfaceC36571c5 = this.LJLIL;
            if (interfaceC36571c5 != null) {
                if ((interfaceC36571c5 instanceof InterfaceC219588ja) && (interfaceC219588ja = (InterfaceC219588ja) interfaceC36571c5) != null) {
                    c235119Kp = interfaceC219588ja.createNavActions();
                }
                if (c235119Kp != null) {
                    C234529Ii LIZJ = s1.LIZJ();
                    LIZJ.LIZJ = R.raw.icon_x_mark;
                    LIZJ.LIZIZ(new AqS153S0100000_3(this, 1720));
                    c235119Kp.LIZLLL(LIZJ);
                    ((C252709vu) _$_findCachedViewById(R.id.gwg)).setNavActions(c235119Kp);
                    if (C76800UCe.LIZ != null) {
                        return;
                    }
                }
                C17N.LJJIIJZLJL(_$_findCachedViewById(R.id.gwg));
                return;
            }
            o.LJIJI("childFragment");
            throw null;
        }
        o.LJIJI("childFragment");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        Integer num = this.LJLILLLLZI;
        if (num != null) {
            inflater = C16880lQ.LLZIL(new ContextThemeWrapper(inflater.getContext(), num.intValue()));
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.gh, viewGroup, false);
        o.LJIIIIZZ(LLLLIILL, "themeId?.let {\n        L…aption, container, false)");
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }
}
