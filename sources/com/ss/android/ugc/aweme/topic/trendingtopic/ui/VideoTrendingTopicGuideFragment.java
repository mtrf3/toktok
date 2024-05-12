package com.ss.android.ugc.aweme.topic.trendingtopic.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.SY4;
import Y.ACListenerS21S0100000_1;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BulletSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class VideoTrendingTopicGuideFragment extends Fragment {
    public SY4 LJLIL;
    public C252709vu LJLILLLLZI;
    public TuxTextView LJLJI;
    public TuxTextView LJLJJI;
    public TuxTextView LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.eqt);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.intro_button)");
        this.LJLIL = (SY4) findViewById;
        View findViewById2 = view.findViewById(R.id.er_);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.intro_navi)");
        this.LJLILLLLZI = (C252709vu) findViewById2;
        SY4 sy4 = this.LJLIL;
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS21S0100000_1(this, 118));
            View findViewById3 = view.findViewById(R.id.eqq);
            o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.intro_body_1)");
            this.LJLJI = (TuxTextView) findViewById3;
            Resources resources = getResources();
            if (resources != null) {
                str = resources.getQuantityString(R.plurals.tm, 3, 3);
            } else {
                str = null;
            }
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new BulletSpan(15), 0, spannableString.length(), 33);
            TuxTextView tuxTextView = this.LJLJI;
            if (tuxTextView != null) {
                tuxTextView.setText(spannableString);
                View findViewById4 = view.findViewById(R.id.eqr);
                o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.intro_body_2)");
                this.LJLJJI = (TuxTextView) findViewById4;
                Resources resources2 = getResources();
                if (resources2 != null) {
                    str2 = resources2.getQuantityString(R.plurals.tn, 3, 3);
                } else {
                    str2 = null;
                }
                SpannableString spannableString2 = new SpannableString(str2);
                spannableString2.setSpan(new BulletSpan(15), 0, spannableString2.length(), 33);
                TuxTextView tuxTextView2 = this.LJLJJI;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(spannableString2);
                    View findViewById5 = view.findViewById(R.id.eqs);
                    o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.intro_body_3)");
                    this.LJLJJL = (TuxTextView) findViewById5;
                    SpannableString spannableString3 = new SpannableString(getString(R.string.sk0));
                    spannableString3.setSpan(new BulletSpan(15), 0, spannableString3.length(), 33);
                    TuxTextView tuxTextView3 = this.LJLJJL;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setText(spannableString3);
                        C252709vu c252709vu = this.LJLILLLLZI;
                        if (c252709vu != null) {
                            C235119Kp c235119Kp = new C235119Kp();
                            C234529Ii LIZJ = s1.LIZJ();
                            LIZJ.LIZJ = R.raw.icon_x_mark_small;
                            LIZJ.LIZIZ(new AqS151S0100000_1(this, 724));
                            c235119Kp.LIZIZ(LIZJ);
                            c252709vu.setNavActions(c235119Kp);
                            return;
                        }
                        o.LJIJI("tuxNavBar");
                        throw null;
                    }
                    o.LJIJI("introText3");
                    throw null;
                }
                o.LJIJI("introText2");
                throw null;
            }
            o.LJIJI("introText1");
            throw null;
        }
        o.LJIJI("continueBtn");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dse, viewGroup, false);
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
