package com.bytedance.android.live.design.view.sheet;

import X.ActivityC45651qj;
import X.C0P1;
import X.C0PF;
import X.C10A;
import X.C12830et;
import X.C12840eu;
import X.C12850ev;
import X.C141335gf;
import X.C1B3;
import X.C29S;
import X.C3C5;
import X.C42661lu;
import X.C47111t5;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC32911Qx;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.app.LiveControllableDialogFragment;
import com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class LiveSheetHostFragment extends LiveControllableDialogFragment {
    public static final /* synthetic */ int LJLJL = 0;
    public C12830et LJLIL;
    public long LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public InterfaceC32911Qx LJLJJL;
    public C42661lu LJLJJLL;

    @Override // androidx.fragment.app.DialogFragment
    public final int getTheme() {
        return R.style.qa;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C12850ev c12850ev = C12840eu.LIZ;
        long j = this.LJLILLLLZI;
        ((ArrayList) c12850ev.LIZIZ).remove(c12850ev.LIZ.get(j));
        c12850ev.LIZ.remove(j);
    }

    @Override // com.bytedance.android.live.design.app.LiveControllableDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && dialog.getWindow() != null) {
            dialog.getWindow().setDimAmount(this.LJLJJI);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && getFragmentManager() != null) {
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.getClass();
            C1B3 c1b3 = new C1B3(fragmentManager);
            c1b3.LJJI(this);
            c1b3.LJI();
            return;
        }
        if (getArguments() == null) {
            return;
        }
        this.LJLILLLLZI = getArguments().getLong("com.bytedance.android.live.design.view.sheet.SHEET_TOKEN");
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        LiveSheetDialog liveSheetDialog = new LiveSheetDialog(getContext(), getTheme());
        liveSheetDialog.LJLJJI = new C47111t5(this);
        liveSheetDialog.LJLJJL = this;
        return liveSheetDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setTag(R.id.jw0, this.LJLIL);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C42661lu c42661lu = new C42661lu(inflater.getContext());
        this.LJLJJLL = c42661lu;
        c42661lu.setClipChildren(false);
        this.LJLJJLL.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.LJLJJLL.setId(R.id.fv_);
        this.LJLJJLL.setSystemUiVisibility(1792);
        C42661lu c42661lu2 = this.LJLJJLL;
        Context context = getContext();
        mo49getActivity();
        C12830et c12830et = new C12830et(context, getFragmentManager(), getChildFragmentManager(), c42661lu2, this.LJLILLLLZI, this);
        this.LJLIL = c12830et;
        C12850ev c12850ev = C12840eu.LIZ;
        c12850ev.LIZ.put(this.LJLILLLLZI, c12830et);
        ((ArrayList) c12850ev.LIZIZ).add(c12830et);
        if (getArguments() != null) {
            String string = getArguments().getString("com.bytedance.android.live.design.view.sheet.FRAGMENT_TAG");
            InterfaceC32911Qx interfaceC32911Qx = this.LJLJJL;
            if (interfaceC32911Qx != null) {
                C12830et c12830et2 = this.LJLIL;
                if (((ArrayList) c12830et2.LJ).isEmpty()) {
                    c12830et2.LJIIIZ(interfaceC32911Qx, string);
                }
            } else {
                String string2 = getArguments().getString("com.bytedance.android.live.design.view.sheet.FRAGMENT_CLASS");
                Bundle bundle2 = getArguments().getBundle("com.bytedance.android.live.design.view.sheet.SHEET_START_ARGS");
                SheetOptions sheetOptions = (SheetOptions) getArguments().getParcelable("com.bytedance.android.live.design.view.sheet.SHEET_OPTIONS");
                C12830et c12830et3 = this.LJLIL;
                if (((ArrayList) c12830et3.LJ).isEmpty()) {
                    c12830et3.LJII(bundle2, sheetOptions, string2, string);
                }
            }
        }
        if (this.LJLIL.LJI() && getContext() != null) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(android.R.attr.backgroundDimAmount, typedValue, true);
            this.LJLJI = typedValue.getFloat();
        } else {
            this.LJLJI = 0.0f;
        }
        this.LJLJJI = this.LJLJI;
        C0P1.LIZIZ(this.LJLJJLL, new C0PF() { // from class: X.1R2
            @Override // X.C0PF
            public final C0PI LIZ(View view, C0PI c0pi) {
                int i;
                LiveSheetHostFragment liveSheetHostFragment = LiveSheetHostFragment.this;
                liveSheetHostFragment.getClass();
                C06920Oy LIZ = c0pi.LIZ(2);
                C12830et c12830et4 = liveSheetHostFragment.LJLIL;
                if (c12830et4 != null && !c12830et4.LJI()) {
                    C12840eu.LIZ.getClass();
                    i = 0;
                } else {
                    i = LIZ.LIZLLL;
                }
                C42661lu c42661lu3 = liveSheetHostFragment.LJLJJLL;
                c42661lu3.setPadding(LIZ.LIZ, c42661lu3.getPaddingTop(), LIZ.LIZJ, i);
                liveSheetHostFragment.LJLJJLL.setNavigationInsets(LIZ);
                C12840eu.LIZ.LIZJ();
                return c0pi;
            }
        });
        C42661lu c42661lu3 = this.LJLJJLL;
        C29S c29s = null;
        if (!(c42661lu3 instanceof View)) {
            c42661lu3 = null;
        }
        if (c42661lu3 != null) {
            try {
                ViewTreeLifecycleOwner.set(c42661lu3, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(c42661lu3, this);
                C10A.LIZIZ(c42661lu3, this);
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
        return c42661lu3;
    }
}
