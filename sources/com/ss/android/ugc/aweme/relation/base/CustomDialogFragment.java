package com.ss.android.ugc.aweme.relation.base;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C187057Vt;
import X.C188727au;
import X.C1B3;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.FMX;
import X.InterfaceC88472Yns;
import X.OSZ;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.common.ui.BaseDialogFragment;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CustomDialogFragment extends BaseDialogFragment {
    public View LJLJI;
    public OSZ<Integer, Integer> LJLJJI;
    public InterfaceC88472Yns<? super String, C76800UCe> LJLJJLL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final List<InterfaceC88472Yns<Window, C76800UCe>> LJLJJL = new ArrayList();
    public String LJLJL = "default";

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        TypedArray obtainStyledAttributes;
        Window window2;
        super.onStart();
        Context context = getContext();
        if (context != null && (obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.nc, R.attr.nd, R.attr.ne, R.attr.nf, R.attr.ng, R.attr.nh, R.attr.ni, R.attr.nj, R.attr.nk, R.attr.nl, R.attr.nm, R.attr.nn, R.attr.no, R.attr.np, R.attr.nq, R.attr.nr, R.attr.ns, R.attr.nt, R.attr.nu, R.attr.nv, R.attr.nw, R.attr.nx, R.attr.ny, R.attr.nz}, R.attr.jw, 0)) != null) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            Dialog dialog = getDialog();
            if (dialog != null && (window2 = dialog.getWindow()) != null) {
                window2.setWindowAnimations(resourceId);
            }
            obtainStyledAttributes.recycle();
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onCancel(dialog);
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        OSZ<Integer, Integer> osz;
        super.onCreate(bundle);
        if (bundle != null) {
            dismissAllowingStateLoss();
        } else {
            if (getDialog() != null || (osz = this.LJLJJI) == null) {
                return;
            }
            setStyle(osz.getFirst().intValue(), osz.getSecond().intValue());
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns = this.LJLJJLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(this.LJLJL);
        }
        String str = C187057Vt.LIZ;
        if (str != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("session_id", str);
            Long l = C187057Vt.LIZIZ;
            if (l != null) {
                c188727au.LJ(System.currentTimeMillis() - l.longValue(), "display_duration_ms");
            }
            FMX.LJIIL("rec_user_dialog_dismiss", c188727au.LIZ);
        }
        C187057Vt.LIZ = null;
        C187057Vt.LIZIZ = null;
    }

    public final void vl(InterfaceC88472Yns<? super Window, C76800UCe> interfaceC88472Yns) {
        Window window;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            ((ArrayList) this.LJLJJL).add(interfaceC88472Yns);
        } else {
            interfaceC88472Yns.invoke(window);
            window.setAttributes(window.getAttributes());
        }
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            Iterator it = ((ArrayList) this.LJLJJL).iterator();
            while (it.hasNext()) {
                ((InterfaceC88472Yns) it.next()).invoke(window);
            }
            ((ArrayList) this.LJLJJL).clear();
            window.setAttributes(window.getAttributes());
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void show(FragmentManager manager, String str) {
        o.LJIIIZ(manager, "manager");
        try {
            Field declaredField = DialogFragment.class.getDeclaredField("mDismissed");
            declaredField.setAccessible(true);
            declaredField.set(this, Boolean.FALSE);
            Field declaredField2 = DialogFragment.class.getDeclaredField("mShownByMe");
            declaredField2.setAccessible(true);
            declaredField2.set(this, Boolean.TRUE);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        C1B3 c1b3 = new C1B3(manager);
        if (isAdded()) {
            c1b3.LJIIL(this);
        } else {
            c1b3.LJIIIIZZ(0, 1, this, str);
        }
        c1b3.LJI();
        C187057Vt.LIZ = UUID.randomUUID().toString();
        C187057Vt.LIZIZ = Long.valueOf(System.currentTimeMillis());
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("session_id", C187057Vt.LIZ);
        FMX.LJIIL("rec_user_dialog_display", c188727au.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View view = this.LJLJI;
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                C10A.LIZIZ(view, this);
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
            return view;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
