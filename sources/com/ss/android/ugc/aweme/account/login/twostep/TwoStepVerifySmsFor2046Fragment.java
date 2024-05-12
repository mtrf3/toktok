package com.ss.android.ugc.aweme.account.login.twostep;

import X.ActivityC45651qj;
import X.C16360ka;
import X.C16880lQ;
import X.C221108m2;
import X.C35338Dtu;
import X.C41565GSz;
import X.C45804HyK;
import X.C52927Kpv;
import X.C62822Ol8;
import X.C69093R9t;
import X.C69134RBi;
import X.C69135RBj;
import X.C71897SJp;
import X.C73525StN;
import X.C85144XbI;
import X.C85615Xit;
import X.C85618Xiw;
import X.C85620Xiy;
import X.C85621Xiz;
import X.C85712XkS;
import X.SY4;
import X.X1D;
import Y.ACListenerS35S0100000_15;
import Y.IDaS224S0100000_15;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.ui.CountDownTimer;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class TwoStepVerifySmsFor2046Fragment extends InputCodeFragmentV2 {
    public String LLIIZ;
    public final Map<Integer, View> LLIL = new LinkedHashMap();
    public final C62822Ol8 LLIIIZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 171));
    public final C62822Ol8 LLIIJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 170));
    public final C62822Ol8 LLIIJLIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 169));
    public final C62822Ol8 LLIIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 172));
    public final C62822Ol8 LLIILII = C221108m2.LIZIZ(new AqS165S0100000_15(this, 174));
    public final C62822Ol8 LLIILZL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 173));

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIL;
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

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final C85621Xiz Xl() {
        C85621Xiz c85621Xiz = new C85621Xiz();
        c85621Xiz.LIZIZ((String) this.LLIIIZ.getValue());
        c85621Xiz.LIZIZ = true;
        c85621Xiz.LJ = false;
        c85621Xiz.LJFF = false;
        c85621Xiz.LJI = false;
        return c85621Xiz;
    }

    public final List<TwoStepVerifyWays> lm() {
        return (List) this.LLIIJI.getValue();
    }

    public final String mm() {
        return (String) this.LLIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        int i;
        int i2;
        if (C35338Dtu.LIZ()) {
            i = R.string.dql;
        } else {
            i = R.string.hxw;
        }
        if (C35338Dtu.LIZ()) {
            i2 = R.string.dqn;
        } else {
            i2 = R.string.hxv;
        }
        C85712XkS c85712XkS = new C85712XkS(null, null, false, null, null, false, null, false, false, 131071);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(getString(R.string.qfj));
        LIZ.append('\n');
        LIZ.append(getString(i2));
        c85712XkS.LJIIIIZZ = X1D.LIZIZ(LIZ);
        c85712XkS.LJIIIZ = getString(i, this.LLIIIZ.getValue());
        c85712XkS.LIZ = " ";
        c85712XkS.LJIILIIL = false;
        if (C52927Kpv.LIZ()) {
            c85712XkS.LIZ = getString(R.string.t7o);
            c85712XkS.LJIIIIZZ = getString(R.string.t7s);
            c85712XkS.LJIIIZ = getString(R.string.t7r, this.LLIIIZ.getValue());
            c85712XkS.LJIILIIL = true;
            c85712XkS.LJIIL = getEnterFrom();
            c85712XkS.LJI = true;
        }
        return c85712XkS;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, X.InterfaceC80500Via
    public final void LLFZ() {
        String enterFrom = getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        String enterMethod = getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        String platForm = mm();
        o.LJIIIIZZ(platForm, "platForm");
        C85144XbI.LJJIJIIJIL(enterFrom, enterMethod, platForm, "sms");
        super.LLFZ();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int getLayout() {
        if (C52927Kpv.LIZ()) {
            return R.layout.mf;
        }
        return R.layout.me;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void hm() {
        KeyboardUtils.LIZIZ(_$_findCachedViewById(R.id.enw));
        nm("resend").LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void fm(String str) {
        KeyboardUtils.LIZIZ(_$_findCachedViewById(R.id.enw));
        this.LLIIZ = str;
    }

    public final C73525StN nm(String str) {
        return C69093R9t.LJIL(this, this, "", xl(), Al(), "", str, null, (HashMap) this.LLIILZL.getValue()).LJFF(new IDaS224S0100000_15(this, 12));
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Window window;
        CountDownTimer countDownTimer;
        String enterFrom = getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        String enterMethod = getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        String platForm = mm();
        o.LJIIIIZZ(platForm, "platForm");
        C85144XbI.LJJIZ(enterFrom, enterMethod, platForm, "sms");
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putString("page", "twosv_login");
        }
        C69135RBj LIZ = C69134RBi.LIZ(mo49getActivity(), (String) this.LLIIIZ.getValue(), xl());
        if (LIZ == null || (countDownTimer = LIZ.LIZ) == null || !countDownTimer.isRunning()) {
            nm("auto_system").LJIILL();
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        boolean z;
        Activity LJIJJ;
        TextView textView;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C71897SJp c71897SJp = (C71897SJp) _$_findCachedViewById(R.id.b_d);
        TwoStepAuthApi.LIZ.getClass();
        c71897SJp.setChecked(TwoStepAuthApi.LJ());
        C16880lQ.LJJJI((C71897SJp) _$_findCachedViewById(R.id.b_d), new ACListenerS35S0100000_15(this, 47));
        if (lm() != null && (!r0.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            _$_findCachedViewById(R.id.b9_).setVisibility(0);
            C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.b9_), new ACListenerS35S0100000_15(this, 48));
        } else {
            _$_findCachedViewById(R.id.b9_).setVisibility(8);
        }
        ((SY4) _$_findCachedViewById(R.id.h0u)).setEnabled(true);
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.h0u), new ACListenerS35S0100000_15(this, 49));
        C16880lQ.LJIIJ(new ACListenerS35S0100000_15(view, 50), view);
        ((TextView) _$_findCachedViewById(R.id.enw)).addTextChangedListener(new C85618Xiw(this));
        _$_findCachedViewById(R.id.enw).requestFocus();
        if (C52927Kpv.LIZ()) {
            Context context = getContext();
            if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null && (textView = (TextView) LJIJJ.findViewById(R.id.ens)) != null) {
                textView.setTextColor(C41565GSz.LIZ(getContext()));
            }
            C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.b_9), new ACListenerS35S0100000_15(this, 51));
            if (Build.VERSION.SDK_INT < 30) {
                getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifySmsFor2046Fragment$onViewCreated$7
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                        o.LJIIIZ(source, "source");
                        o.LJIIIZ(event, "event");
                        if (event == Lifecycle.Event.ON_RESUME) {
                            KeyboardUtils.LIZ(TwoStepVerifySmsFor2046Fragment.this.getViewLifecycleOwner(), view, new C85620Xiy(TwoStepVerifySmsFor2046Fragment.this));
                        }
                    }
                });
            } else {
                C16360ka.LJIJJ(view, new C85615Xit(this));
            }
        }
    }
}
