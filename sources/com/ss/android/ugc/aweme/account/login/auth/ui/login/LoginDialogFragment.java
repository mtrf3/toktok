package com.ss.android.ugc.aweme.account.login.auth.ui.login;

import X.AbstractC85571XiB;
import X.AbstractC85577XiH;
import X.ActivityC45651qj;
import X.ActivityC86117Xqz;
import X.C018905p;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C76800UCe;
import X.C85570XiA;
import X.C85575XiF;
import X.C85576XiG;
import X.C90903hW;
import X.DialogC81625W1t;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class LoginDialogFragment extends AmeBaseFragment {
    public AbstractC85571XiB LJLIL;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 71));

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        AbstractC85571XiB abstractC85571XiB = this.LJLIL;
        if (abstractC85571XiB != null) {
            DialogC81625W1t dialogC81625W1t = abstractC85571XiB.LJIIJJI;
            if (dialogC81625W1t != null) {
                dialogC81625W1t.dismiss();
            }
            DialogC81625W1t dialogC81625W1t2 = abstractC85571XiB.LJIIL;
            if (dialogC81625W1t2 != null) {
                dialogC81625W1t2.dismiss();
            }
            DialogC81625W1t dialogC81625W1t3 = abstractC85571XiB.LJIILIIL;
            if (dialogC81625W1t3 != null) {
                dialogC81625W1t3.dismiss();
            }
        }
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC85571XiB c85570XiA;
        List hv0;
        View findViewById;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJII(mo49getActivity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity");
        AbstractC85577XiH abstractC85577XiH = ((I18nSignUpActivity) mo49getActivity).LJLJL;
        if (abstractC85577XiH != null) {
            if (((SignupViewModel) this.LJLILLLLZI.getValue()).gv0() && (findViewById = view.findViewById(R.id.b9f)) != null) {
                if (!(findViewById.getLayoutParams() instanceof C018905p)) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.height = -2;
                findViewById.setLayoutParams(marginLayoutParams);
            }
            if (abstractC85577XiH instanceof C85575XiF) {
                C85575XiF c85575XiF = (C85575XiF) abstractC85577XiH;
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                o.LJII(mo49getActivity2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity");
                I18nSignUpActivity i18nSignUpActivity = (I18nSignUpActivity) mo49getActivity2;
                ActivityC45651qj mo49getActivity3 = mo49getActivity();
                o.LJII(mo49getActivity3, "null cannot be cast to non-null type com.bytedance.ies.foundation.activity.BaseActivity");
                ActivityC86117Xqz activityC86117Xqz = (ActivityC86117Xqz) mo49getActivity3;
                boolean z = arguments.getBoolean("is_signup_view");
                if (arguments.getBoolean("is_signup_view")) {
                    hv0 = ((SignupViewModel) this.LJLILLLLZI.getValue()).LJLJJI;
                    if (hv0 == null) {
                        o.LJIJI("allSignupItems");
                        throw null;
                    }
                } else {
                    hv0 = ((SignupViewModel) this.LJLILLLLZI.getValue()).hv0();
                }
                c85570XiA = new ViewPagerLoginView(c85575XiF, i18nSignUpActivity, activityC86117Xqz, view, z, hv0);
            } else if (abstractC85577XiH instanceof C85576XiG) {
                ActivityC45651qj mo49getActivity4 = mo49getActivity();
                o.LJII(mo49getActivity4, "null cannot be cast to non-null type com.bytedance.ies.foundation.activity.BaseActivity");
                c85570XiA = new C85570XiA((C85576XiG) abstractC85577XiH, (ActivityC86117Xqz) mo49getActivity4, view, ((SignupViewModel) this.LJLILLLLZI.getValue()).hv0());
            } else {
                throw new UnsupportedOperationException("Unsupported type of a SignupManager");
            }
            this.LJLIL = c85570XiA;
            return;
        }
        o.LJIJI("signupManager");
        throw null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.n3, viewGroup, false);
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
