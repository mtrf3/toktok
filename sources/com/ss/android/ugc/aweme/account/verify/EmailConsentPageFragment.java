package com.ss.android.ugc.aweme.account.verify;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C35936E8m;
import X.C3C5;
import X.C76800UCe;
import X.C82802Wec;
import X.C90903hW;
import X.FMX;
import X.InterfaceC252919wF;
import X.SY4;
import Y.ACListenerS24S0100000_4;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class EmailConsentPageFragment extends BaseAccountFlowFragment {
    public static final /* synthetic */ int LJZ = 0;
    public InterfaceC252919wF LJLLLLLL;
    public final Map<Integer, View> LJLZ = new LinkedHashMap();

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        o.LJIIIZ(message, "message");
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLZ).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLZ;
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

    @Override // X.InterfaceC69056R8i
    public final void ee(int i) {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (o.LJ(LJJLIIIJJI(), "manage_account_page")) {
            ((TextView) _$_findCachedViewById(R.id.krt)).setText(getString(R.string.ll));
            Keva.getRepo("email_consent_keva").storeLong("email_consent_show_time", System.currentTimeMillis());
            Keva.getRepo("email_consent_keva").storeLong(getEnterFrom(), System.currentTimeMillis());
            Keva.getRepo("email_consent_keva").storeInt("email_consent_show_times", Keva.getRepo("email_consent_keva").getInt("email_consent_show_times", 0) + 1);
        } else {
            ((TextView) _$_findCachedViewById(R.id.title)).setText(getString(R.string.m2));
            ((TextView) _$_findCachedViewById(R.id.krt)).setText(getString(R.string.m5));
            _$_findCachedViewById(R.id.aex).setVisibility(0);
            C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.aex);
            C235119Kp c235119Kp = new C235119Kp();
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_x_mark;
            LIZJ.LIZLLL = true;
            LIZJ.LIZIZ(new AqS154S0100000_4(this, 47));
            c235119Kp.LIZLLL(LIZJ);
            c252709vu.setNavActions(c235119Kp);
        }
        ImageView icon = (ImageView) _$_findCachedViewById(R.id.e_q);
        o.LJIIIIZZ(icon, "icon");
        UgCommonServiceImpl.LJIJ().LIZIZ();
        C82802Wec.LJIIJJI(icon, "18d672861696c90ffb63e9a7c134f815", null);
        String enterFrom = getEnterFrom();
        o.LJIIIIZZ(enterFrom, "this.enterFrom");
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("page_name", enterFrom);
        c35936E8m.LIZLLL("exp_name", "collect_email_consent_phase3");
        FMX.LJIIL("show_email_consent_popup_page", c35936E8m.LIZ);
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.br0), new ACListenerS24S0100000_4(this, 19));
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.b3r), new ACListenerS24S0100000_4(this, 20));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ml, viewGroup, false);
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
