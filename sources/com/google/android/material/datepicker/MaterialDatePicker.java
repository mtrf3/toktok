package com.google.android.material.datepicker;

import X.ActivityC45651qj;
import X.C0EH;
import X.C10A;
import X.C141335gf;
import X.C16330kX;
import X.C16360ka;
import X.C16880lQ;
import X.C1B3;
import X.C20110qd;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C78972Uz2;
import X.C80364VgO;
import X.C80418VhG;
import X.C80531Vj5;
import X.C80532Vj6;
import X.C80541VjF;
import X.C80561VjZ;
import X.C90903hW;
import X.InterfaceC80533Vj7;
import X.ViewOnClickListenerC13880ga;
import X.ViewOnClickListenerC80528Vj2;
import X.ViewOnClickListenerC80529Vj3;
import X.ViewOnClickListenerC80530Vj4;
import X.ViewOnTouchListenerC72261SXp;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.google.android.material.datepicker.CalendarConstraints;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;
import o3.h0;

/* loaded from: classes15.dex */
public final class MaterialDatePicker<S> extends DialogFragment {
    public final LinkedHashSet<InterfaceC80533Vj7<? super S>> LJLIL = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> LJLILLLLZI = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> LJLJI = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> LJLJJI = new LinkedHashSet<>();
    public int LJLJJL;
    public DateSelector<S> LJLJJLL;
    public PickerFragment<S> LJLJL;
    public CalendarConstraints LJLJLJ;
    public MaterialCalendar<S> LJLJLLL;
    public int LJLL;
    public CharSequence LJLLI;
    public boolean LJLLILLLL;
    public int LJLLJ;
    public TextView LJLLL;
    public C80364VgO LJLLLL;
    public C80418VhG LJLLLLLL;
    public Button LJLZ;

    public final void Dl() {
        String LLILZ = this.LJLJJLL.LLILZ(getContext());
        this.LJLLL.setContentDescription(C16880lQ.LLLZ(getString(R.string.i9t), new Object[]{LLILZ}));
        this.LJLLL.setText(LLILZ);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        this.LJLJL.LJLIL.clear();
        super.onStop();
    }

    public final void Al() {
        PickerFragment<S> pickerFragment;
        Context requireContext = requireContext();
        int i = this.LJLJJL;
        if (i == 0) {
            i = this.LJLJJLL.LJJLIIIJJIZ(requireContext);
        }
        DateSelector<S> dateSelector = this.LJLJJLL;
        CalendarConstraints calendarConstraints = this.LJLJLJ;
        MaterialCalendar<S> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.openAt);
        materialCalendar.setArguments(bundle);
        this.LJLJLLL = materialCalendar;
        if (this.LJLLLL.isChecked()) {
            DateSelector<S> dateSelector2 = this.LJLJJLL;
            CalendarConstraints calendarConstraints2 = this.LJLJLJ;
            pickerFragment = new MaterialTextInputPicker<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i);
            bundle2.putParcelable("DATE_SELECTOR_KEY", dateSelector2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            pickerFragment.setArguments(bundle2);
        } else {
            pickerFragment = this.LJLJLLL;
        }
        this.LJLJL = pickerFragment;
        Dl();
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(childFragmentManager);
        c1b3.LJIIJ(this.LJLJL, null, R.id.go3);
        c1b3.LJIILLIIL();
        this.LJLJL.vl(new C80532Vj6(this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        Window window2 = requireDialog().getWindow();
        if (this.LJLLILLLL) {
            window2.setLayout(-1, -1);
            window2.setBackgroundDrawable(this.LJLLLLLL);
        } else {
            window2.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.a0v);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window2.setBackgroundDrawable(new InsetDrawable((Drawable) this.LJLLLLLL, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window2.getDecorView().setOnTouchListener(new ViewOnTouchListenerC72261SXp(requireDialog(), rect));
        }
        Al();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    public static int vl(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.a0n);
        int i = new Month(C80561VjZ.LJII()).LJLJI;
        return C0EH.LIZ(i, -1, resources.getDimensionPixelOffset(R.dimen.a17), (resources.getDimensionPixelSize(R.dimen.a0t) * i) + (dimensionPixelOffset * 2));
    }

    public static boolean wl(Context context) {
        return xl(android.R.attr.windowFullscreen, context);
    }

    public final void Gl(C80364VgO c80364VgO) {
        String string;
        if (this.LJLLLL.isChecked()) {
            string = c80364VgO.getContext().getString(R.string.i_h);
        } else {
            string = c80364VgO.getContext().getString(R.string.i_j);
        }
        this.LJLLLL.setContentDescription(string);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.LJLJI.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.LJLJJL = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.LJLJJLL = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.LJLJLJ = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.LJLL = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.LJLLI = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.LJLLJ = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        Context requireContext2 = requireContext();
        int i = this.LJLJJL;
        if (i == 0) {
            i = this.LJLJJLL.LJJLIIIJJIZ(requireContext2);
        }
        Dialog dialog = new Dialog(requireContext, i);
        Context context = dialog.getContext();
        this.LJLLILLLL = wl(context);
        int LIZIZ = C78972Uz2.LIZIZ(context, R.attr.a4y, C16880lQ.LJLLILLLL(MaterialDatePicker.class));
        C80418VhG c80418VhG = new C80418VhG(context, null, R.attr.azy, R.style.a0s);
        this.LJLLLLLL = c80418VhG;
        c80418VhG.LJIIIIZZ(context);
        this.LJLLLLLL.LJIIJJI(ColorStateList.valueOf(LIZIZ));
        this.LJLLLLLL.LJIIJ(C16360ka.LJIIIIZZ(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.LJLJJI.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        Month LJI;
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.LJLJJL);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.LJLJJLL);
        C80531Vj5 c80531Vj5 = new C80531Vj5(this.LJLJLJ);
        Month month = this.LJLJLLL.LJLJJL;
        if (month != null) {
            c80531Vj5.LIZJ = Long.valueOf(month.LJLJJL);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", c80531Vj5.LIZLLL);
        Month LJI2 = Month.LJI(c80531Vj5.LIZ);
        Month LJI3 = Month.LJI(c80531Vj5.LIZIZ);
        CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = c80531Vj5.LIZJ;
        if (l == null) {
            LJI = null;
        } else {
            LJI = Month.LJI(l.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(LJI2, LJI3, dateValidator, LJI));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.LJLL);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.LJLLI);
    }

    public static boolean xl(int i, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C78972Uz2.LIZIZ(context, R.attr.azy, C16880lQ.LJLLILLLL(MaterialCalendar.class)), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        boolean z;
        o.LJIIIZ(inflater, "inflater");
        if (this.LJLLILLLL) {
            i = R.layout.bu6;
        } else {
            i = R.layout.bu5;
        }
        View LLLZIIL = C16880lQ.LLLZIIL(i, inflater, viewGroup);
        Context context = LLLZIIL.getContext();
        if (this.LJLLILLLL) {
            LLLZIIL.findViewById(R.id.go3).setLayoutParams(new LinearLayout.LayoutParams(vl(context), -2));
        } else {
            View findViewById = LLLZIIL.findViewById(R.id.go4);
            View findViewById2 = LLLZIIL.findViewById(R.id.go3);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(vl(context), -1));
            Resources resources = requireContext().getResources();
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.a19) + resources.getDimensionPixelOffset(R.dimen.a1a) + resources.getDimensionPixelSize(R.dimen.a1_);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.a0u);
            int i2 = C80541VjF.LJLJJLL;
            findViewById2.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.a18) * (i2 - 1)) + (resources.getDimensionPixelSize(R.dimen.a0p) * i2) + resources.getDimensionPixelOffset(R.dimen.a0m));
        }
        TextView textView = (TextView) LLLZIIL.findViewById(R.id.goe);
        this.LJLLL = textView;
        C16330kX.LJFF(textView, 1);
        this.LJLLLL = (C80364VgO) LLLZIIL.findViewById(R.id.gog);
        TextView textView2 = (TextView) LLLZIIL.findViewById(R.id.gok);
        CharSequence charSequence = this.LJLLI;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.LJLL);
        }
        this.LJLLLL.setTag("TOGGLE_BUTTON_TAG");
        C80364VgO c80364VgO = this.LJLLLL;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, C20110qd.LIZ(context, R.drawable.bqk));
        stateListDrawable.addState(new int[0], C20110qd.LIZ(context, R.drawable.bqm));
        c80364VgO.setImageDrawable(stateListDrawable);
        C80364VgO c80364VgO2 = this.LJLLLL;
        if (this.LJLLJ != 0) {
            z = true;
        } else {
            z = false;
        }
        c80364VgO2.setChecked(z);
        C29S c29s = null;
        h0.LJIJI(this.LJLLLL, null);
        Gl(this.LJLLLL);
        this.LJLLLL.setOnClickListener(new ViewOnClickListenerC13880ga(new ViewOnClickListenerC80530Vj4(this)));
        this.LJLZ = (Button) LLLZIIL.findViewById(R.id.br1);
        if (this.LJLJJLL.LLLLLLL()) {
            this.LJLZ.setEnabled(true);
        } else {
            this.LJLZ.setEnabled(false);
        }
        this.LJLZ.setTag("CONFIRM_BUTTON_TAG");
        C16880lQ.LJIILIIL(this.LJLZ, new ViewOnClickListenerC80528Vj2(this));
        Button button = (Button) LLLZIIL.findViewById(R.id.b3s);
        button.setTag("CANCEL_BUTTON_TAG");
        C16880lQ.LJIILIIL(button, new ViewOnClickListenerC80529Vj3(this));
        try {
            ViewTreeLifecycleOwner.set(LLLZIIL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLZIIL, this);
            C10A.LIZIZ(LLLZIIL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLZIIL;
    }
}
