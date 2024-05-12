package com.ss.android.ugc.aweme.paidcontent.fragments;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C214298b3;
import X.C214528bQ;
import X.C25587A2l;
import X.C25589A2n;
import X.C25636A4i;
import X.C25637A4j;
import X.C29S;
import X.C3C5;
import X.C47261Igj;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71897SJp;
import X.C76800UCe;
import X.C78926UyI;
import X.C7MY;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.SY4;
import X.T5T;
import X.X1D;
import Y.ACListenerS24S0100000_4;
import Y.ACListenerS39S0200000_4;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentDetailPaymentViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidContentRefundFragment extends Fragment {
    public static final /* synthetic */ int LJLJL = 0;
    public final CollectionDetailModel LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final List<CheckBox> LJLJI;
    public SY4 LJLJJI;
    public T5T LJLJJL;
    public Dialog LJLJJLL;

    public final void Dl() {
        boolean z;
        Editable text;
        Iterator<CheckBox> it = this.LJLJI.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            if (it.next().isChecked()) {
                z3 = true;
            }
        }
        T5T t5t = this.LJLJJL;
        if (t5t != null && (text = t5t.getText()) != null && text.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        SY4 sy4 = this.LJLJJI;
        if (sy4 == null) {
            return;
        }
        if (z3 || z) {
            z2 = true;
        }
        sy4.setEnabled(z2);
    }

    public PaidContentRefundFragment(CollectionDetailModel collectionDetailModel) {
        C214298b3 c214298b3;
        new LinkedHashMap();
        this.LJLIL = collectionDetailModel;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PaidContentDetailPaymentViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 566);
        C25587A2l c25587A2l = C25587A2l.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c25587A2l, LIZ);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c25587A2l, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLILLLLZI = c214298b3;
        this.LJLJI = new ArrayList();
    }

    public final String vl(String str) {
        String str2;
        String str3;
        int i = -1;
        int i2 = 0;
        for (CheckBox checkBox : this.LJLJI) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                if (checkBox.isChecked()) {
                    i = i2;
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    str2 = "No selected reason";
                } else {
                    str2 = "Poor video quality";
                }
            } else {
                str2 = "Not what I expected";
            }
        } else {
            str2 = "Purchased by accident";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str2);
        if (str.length() > 0) {
            str3 = " and Other.";
        } else {
            str3 = "";
        }
        LIZ.append(str3);
        return X1D.LIZIZ(LIZ);
    }

    public final void Al(LinearLayout linearLayout, String str) {
        TuxTextView tuxTextView = (TuxTextView) linearLayout.findViewById(R.id.itz);
        C71897SJp optionCheckbox = (C71897SJp) linearLayout.findViewById(R.id.ity);
        List<CheckBox> list = this.LJLJI;
        o.LJIIIIZZ(optionCheckbox, "optionCheckbox");
        ((ArrayList) list).add(optionCheckbox);
        tuxTextView.setText(str);
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS39S0200000_4(this, optionCheckbox, 25));
        C16880lQ.LJJJI(optionCheckbox, new ACListenerS24S0100000_4(this, 105));
        optionCheckbox.setOnCheckedChangeListener(new C25637A4j(this, str, optionCheckbox));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        Resources resources;
        Resources resources2;
        String string;
        Resources resources3;
        Resources resources4;
        LinearLayout linearLayout = (LinearLayout) C7MY.LIZLLL(view, "view", R.id.itv, "view.findViewById(R.id.refund_option_1)");
        Context context = getContext();
        String str4 = "";
        if (context == null || (resources4 = context.getResources()) == null || (str = resources4.getString(R.string.qo5)) == null) {
            str = "";
        }
        Al(linearLayout, str);
        View findViewById = view.findViewById(R.id.itw);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.refund_option_2)");
        LinearLayout linearLayout2 = (LinearLayout) findViewById;
        Context context2 = getContext();
        if (context2 == null || (resources3 = context2.getResources()) == null || (str2 = resources3.getString(R.string.qog)) == null) {
            str2 = "";
        }
        Al(linearLayout2, str2);
        View findViewById2 = view.findViewById(R.id.itx);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.refund_option_3)");
        LinearLayout linearLayout3 = (LinearLayout) findViewById2;
        Context context3 = getContext();
        if (context3 != null && (resources2 = context3.getResources()) != null && (string = resources2.getString(R.string.qow)) != null) {
            str4 = string;
        }
        Al(linearLayout3, str4);
        C16880lQ.LJJJ((TuxIconView) view.findViewById(R.id.aej), new ACListenerS24S0100000_4(this, 103));
        SY4 sy4 = (SY4) view.findViewById(R.id.iu0);
        this.LJLJJI = sy4;
        if (sy4 != null) {
            Context context4 = getContext();
            if (context4 != null && (resources = context4.getResources()) != null) {
                str3 = resources.getString(R.string.qot);
            } else {
                str3 = null;
            }
            sy4.setText(str3);
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.itt);
        tuxTextView.setText("0/200");
        T5T t5t = (T5T) view.findViewById(R.id.itu);
        this.LJLJJL = t5t;
        if (t5t != null) {
            t5t.addTextChangedListener(new C25636A4i(this, tuxTextView));
        }
        SY4 sy42 = this.LJLJJI;
        if (sy42 != null) {
            C16880lQ.LJJIZ(sy42, new ACListenerS24S0100000_4(this, 104));
        }
    }

    public final void wl(String str, String str2) {
        String str3;
        Bundle arguments = getArguments();
        if (arguments != null) {
            str3 = arguments.getString("enter_from");
        } else {
            str3 = null;
        }
        C25589A2n.LJIIJJI(str, str3, null, null, null, null, null, str2, null, null, null, null, null, null, null, null, null, null, this.LJLIL, null, null, null, null, null, null, 66584316);
    }

    public final void xl(String str, boolean z) {
        String str2;
        Bundle arguments = getArguments();
        Long l = null;
        if (arguments != null) {
            str2 = arguments.getString("enter_from");
        } else {
            str2 = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            l = Long.valueOf(arguments2.getLong("room_id"));
        }
        C25589A2n.LJIIJJI("collection_refund_summary", str2, null, null, null, null, Boolean.valueOf(z), str, null, null, null, l, null, null, null, null, null, null, this.LJLIL, null, null, null, null, null, null, 66580092);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.aj3, viewGroup, false);
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
