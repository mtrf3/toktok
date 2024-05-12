package com.google.android.material.timepicker;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C78972Uz2;
import X.C80400Vgy;
import X.C80418VhG;
import X.C80506Vig;
import X.C80507Vih;
import X.C80509Vij;
import X.C80521Viv;
import X.C90903hW;
import X.InterfaceC80523Vix;
import X.KMP;
import X.ViewOnClickListenerC13880ga;
import X.ViewOnClickListenerC80512Vim;
import X.ViewOnClickListenerC80513Vin;
import X.ViewOnClickListenerC80516Viq;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class MaterialTimePicker extends DialogFragment {
    public C80509Vij LJLJJL;
    public ViewStub LJLJJLL;
    public C80507Vih LJLJL;
    public C80506Vig LJLJLJ;
    public InterfaceC80523Vix LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public String LJLLJ;
    public C80400Vgy LJLLL;
    public TimeModel LJLLLLLL;
    public final Set<View.OnClickListener> LJLIL = new LinkedHashSet();
    public final Set<View.OnClickListener> LJLILLLLZI = new LinkedHashSet();
    public final Set<DialogInterface.OnCancelListener> LJLJI = new LinkedHashSet();
    public final Set<DialogInterface.OnDismissListener> LJLJJI = new LinkedHashSet();
    public int LJLLILLLL = 0;
    public int LJLLLL = 0;

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
        if (bundle == null && (bundle = getArguments()) == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
        this.LJLLLLLL = timeModel;
        if (timeModel == null) {
            this.LJLLLLLL = new TimeModel();
        }
        this.LJLLLL = bundle.getInt("TIME_PICKER_INPUT_MODE", 0);
        this.LJLLILLLL = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
        this.LJLLJ = bundle.getString("TIME_PICKER_TITLE_TEXT");
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        int i;
        TypedValue LIZ = C78972Uz2.LIZ(R.attr.b06, requireContext());
        Context requireContext = requireContext();
        if (LIZ == null) {
            i = 0;
        } else {
            i = LIZ.data;
        }
        Dialog dialog = new Dialog(requireContext, i);
        Context context = dialog.getContext();
        int LIZIZ = C78972Uz2.LIZIZ(context, R.attr.a4y, C16880lQ.LJLLILLLL(MaterialTimePicker.class));
        C80418VhG c80418VhG = new C80418VhG(context, null, R.attr.b05, R.style.a24);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.a3t, R.attr.ajw}, R.attr.b05, R.style.a24);
        this.LJLLI = obtainStyledAttributes.getResourceId(0, 0);
        this.LJLL = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        c80418VhG.LJIIIIZZ(context);
        c80418VhG.LJIIJJI(ColorStateList.valueOf(LIZIZ));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(c80418VhG);
        window.requestFeature(1);
        window.setLayout(-2, -2);
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
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.LJLLLLLL);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.LJLLLL);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.LJLLILLLL);
        bundle.putString("TIME_PICKER_TITLE_TEXT", this.LJLLJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void vl(C80400Vgy c80400Vgy) {
        C80506Vig c80506Vig;
        Pair pair;
        InterfaceC80523Vix interfaceC80523Vix = this.LJLJLLL;
        if (interfaceC80523Vix != null) {
            interfaceC80523Vix.hide();
        }
        if (this.LJLLLL == 0) {
            C80507Vih c80507Vih = this.LJLJL;
            C80507Vih c80507Vih2 = c80507Vih;
            if (c80507Vih == null) {
                c80507Vih2 = new C80507Vih(this.LJLJJL, this.LJLLLLLL);
            }
            this.LJLJL = c80507Vih2;
            c80506Vig = c80507Vih2;
        } else {
            if (this.LJLJLJ == null) {
                this.LJLJLJ = new C80506Vig((LinearLayout) this.LJLJJLL.inflate(), this.LJLLLLLL);
            }
            C80506Vig c80506Vig2 = this.LJLJLJ;
            c80506Vig2.LJLJJL.setChecked(false);
            c80506Vig2.LJLJJLL.setChecked(false);
            c80506Vig = this.LJLJLJ;
        }
        this.LJLJLLL = c80506Vig;
        c80506Vig.show();
        this.LJLJLLL.invalidate();
        int i = this.LJLLLL;
        if (i != 0) {
            if (i == 1) {
                pair = new Pair(Integer.valueOf(this.LJLLI), Integer.valueOf(R.string.i0j));
            } else {
                throw new IllegalArgumentException(KMP.LJ("no icon for mode: ", i));
            }
        } else {
            pair = new Pair(Integer.valueOf(this.LJLL), Integer.valueOf(R.string.i0o));
        }
        c80400Vgy.setIconResource(((Integer) pair.first).intValue());
        c80400Vgy.setContentDescription(getResources().getString(((Integer) pair.second).intValue()));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bry, inflater, viewGroup);
        C80509Vij c80509Vij = (C80509Vij) LLLZIIL.findViewById(R.id.gg8);
        this.LJLJJL = c80509Vij;
        c80509Vij.setOnDoubleTapListener(new C80521Viv(this));
        this.LJLJJLL = (ViewStub) LLLZIIL.findViewById(R.id.gg2);
        this.LJLLL = (C80400Vgy) LLLZIIL.findViewById(R.id.gg6);
        TextView textView = (TextView) LLLZIIL.findViewById(R.id.e4n);
        if (!TextUtils.isEmpty(this.LJLLJ)) {
            textView.setText(this.LJLLJ);
        }
        int i = this.LJLLILLLL;
        if (i != 0) {
            textView.setText(i);
        }
        vl(this.LJLLL);
        C16880lQ.LJIILIIL((Button) LLLZIIL.findViewById(R.id.gg7), new ViewOnClickListenerC80512Vim(this));
        C16880lQ.LJIILIIL((Button) LLLZIIL.findViewById(R.id.gg3), new ViewOnClickListenerC80513Vin(this));
        this.LJLLL.setOnClickListener(new ViewOnClickListenerC13880ga(new ViewOnClickListenerC80516Viq(this)));
        try {
            ViewTreeLifecycleOwner.set(LLLZIIL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLZIIL, this);
            C10A.LIZIZ(LLLZIIL, this);
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
        return LLLZIIL;
    }
}
