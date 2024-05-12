package com.google.android.material.datepicker;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C80534Vj8;
import X.C90903hW;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class MaterialTextInputPicker<S> extends PickerFragment<S> {
    public int LJLILLLLZI;
    public DateSelector<S> LJLJI;
    public CalendarConstraints LJLJJI;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.LJLILLLLZI = bundle.getInt("THEME_RES_ID_KEY");
        this.LJLJI = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.LJLJJI = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.LJLILLLLZI);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.LJLJI);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.LJLJJI);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LJLILLLLZI = this.LJLJI.LJLILLLLZI(inflater.cloneInContext(new ContextThemeWrapper(getContext(), this.LJLILLLLZI)), viewGroup, this.LJLJJI, new C80534Vj8(this));
        C29S c29s = null;
        if (!(LJLILLLLZI instanceof View)) {
            LJLILLLLZI = null;
        }
        if (LJLILLLLZI != null) {
            try {
                ViewTreeLifecycleOwner.set(LJLILLLLZI, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LJLILLLLZI, this);
                C10A.LIZIZ(LJLILLLLZI, this);
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
        return LJLILLLLZI;
    }
}
