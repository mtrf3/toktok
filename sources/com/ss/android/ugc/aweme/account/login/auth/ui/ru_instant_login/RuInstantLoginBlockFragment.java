package com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login;

import X.AGJ;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C35936E8m;
import X.C3C5;
import X.C53203KuN;
import X.C62822Ol8;
import X.C68972R5c;
import X.C76800UCe;
import X.C81626W1u;
import X.C85579XiJ;
import X.C85675Xjr;
import X.C85837XmT;
import X.C90903hW;
import X.DialogC81625W1t;
import X.FMX;
import X.O0X;
import X.RBV;
import X.SY4;
import X.UZF;
import X.V1B;
import Y.ACListenerS31S0100000_11;
import Y.ACListenerS35S0100000_15;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes16.dex */
public final class RuInstantLoginBlockFragment extends BaseAccountFlowFragment {
    public final Map<Integer, View> LJZ = new LinkedHashMap();
    public final C62822Ol8 LJLLLLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 72));
    public final C62822Ol8 LJLZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 73));

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        o.LJIIIZ(message, "message");
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZ).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZ;
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
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final String Hl() {
        return (String) this.LJLZ.getValue();
    }

    public final void Il(String str) {
        if (C53203KuN.LIZ()) {
            ICompliancePolicyService LJII = a.LJII();
            if (LJII != null) {
                LJII.LIZIZ(new O0X(AGJ.ACCOUNT_RU_SIGNUP.getValue(), str, true, true, 4), new C85675Xjr());
                return;
            }
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != -565301353) {
            if (hashCode != -498638057) {
                if (hashCode != 442256571 || !str.equals("cookie-policy")) {
                    return;
                }
                ActivityC45651qj mo49getActivity = mo49getActivity();
                C81626W1u c81626W1u = new C81626W1u();
                UZF.LIZ.getClass();
                c81626W1u.LIZ = UZF.LIZIZ("cookie-policy");
                V1B.LJLJJL(c81626W1u.LIZ(mo49getActivity));
                return;
            }
            if (!str.equals("privacy-policy")) {
                return;
            }
            V1B.LJLJJL(DialogC81625W1t.LIZIZ(mo49getActivity()));
            return;
        }
        if (!str.equals("terms-of-use")) {
            return;
        }
        V1B.LJLJJL(DialogC81625W1t.LIZJ(mo49getActivity()));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int LJFF;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        String enterFrom = getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        String enterMethod = getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        String platform = Hl();
        o.LJIIIIZZ(platform, "platform");
        C68972R5c.LIZ.put("show_phone_account_create", Long.valueOf(System.currentTimeMillis()));
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", enterFrom);
        c35936E8m.LIZLLL("enter_method", enterMethod);
        c35936E8m.LIZLLL("platform", platform);
        c35936E8m.LIZLLL("carrier", C85579XiJ.LIZ());
        FMX.LJIIL("show_phone_account_create", c35936E8m.LIZ);
        ((TextView) _$_findCachedViewById(R.id.hah)).setText(PhoneNumberUtil.LIZ(RBV.LJ(this)));
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.hag);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS161S0100000_11(this, 10));
        c235119Kp.LIZLLL(LIZJ);
        C234529Ii LIZJ2 = s1.LIZJ();
        LIZJ2.LIZJ = R.raw.icon_question_mark_circle_ltr;
        LIZJ2.LIZLLL = true;
        LIZJ2.LIZIZ(new AqS161S0100000_11(this, 11));
        c235119Kp.LIZIZ(LIZJ2);
        c252709vu.setNavActions(c235119Kp);
        Context context = getContext();
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.hai);
        ACListenerS35S0100000_15 aCListenerS35S0100000_15 = new ACListenerS35S0100000_15(this, 22);
        ACListenerS35S0100000_15 aCListenerS35S0100000_152 = new ACListenerS35S0100000_15(this, 23);
        ACListenerS35S0100000_15 aCListenerS35S0100000_153 = new ACListenerS35S0100000_15(this, 24);
        if (C85837XmT.LJII().equals("TR")) {
            LJFF = R.string.t5f;
        } else {
            LJFF = C85837XmT.LJFF();
        }
        C85837XmT.LIZIZ(context, tuxTextView, aCListenerS35S0100000_15, aCListenerS35S0100000_152, aCListenerS35S0100000_153, LJFF, AGJ.ACCOUNT_RU_SIGNUP.getValue());
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.hae), new ACListenerS31S0100000_11(this, 2));
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.haf), new ACListenerS31S0100000_11(this, 3));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.nv, viewGroup, false);
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
