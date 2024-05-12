package com.ss.android.ugc.aweme.account.login.twostep;

import X.C10K;
import X.C141415gn;
import X.C16360ka;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C41565GSz;
import X.C45804HyK;
import X.C52927Kpv;
import X.C5S1;
import X.C62822Ol8;
import X.C64698PaI;
import X.C71897SJp;
import X.C7FC;
import X.C80498ViY;
import X.C82544WaS;
import X.C85144XbI;
import X.C85193Xc5;
import X.C85611Xip;
import X.C85612Xiq;
import X.C85613Xir;
import X.C85621Xiz;
import X.C85712XkS;
import X.EF7;
import X.EnumC69116RAq;
import X.FMX;
import X.R4R;
import X.SY4;
import X.X1D;
import Y.ACListenerS35S0100000_15;
import Y.AgS131S0100000_15;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class TOTPCodeVerifyFragment extends InputCodeFragmentV2 {
    public Integer LLIIIZ;
    public String LLIIJI;
    public final Map<Integer, View> LLIIZ = new LinkedHashMap();
    public final C62822Ol8 LLIIJLIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 105));
    public final C62822Ol8 LLIIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 104));
    public final C62822Ol8 LLIILII = C221108m2.LIZIZ(new AqS165S0100000_15(this, 102));
    public final C62822Ol8 LLIILZL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 103));

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIZ;
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

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void hm() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        String str;
        String str2;
        C85712XkS c85712XkS = new C85712XkS(null, null, false, null, null, false, null, false, false, 131071);
        if (qm()) {
            str = getString(R.string.t7i);
        } else {
            str = " ";
        }
        c85712XkS.LIZ = str;
        c85712XkS.LJIILIIL = false;
        boolean sm = sm();
        int i = R.string.t7k;
        if (sm) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(getString(R.string.shh));
            LIZ.append('\n');
            LIZ.append(getString(R.string.shi));
            c85712XkS.LJIIIIZZ = X1D.LIZIZ(LIZ);
            c85712XkS.LJIIIZ = getString(R.string.shg);
            if (C52927Kpv.LIZ()) {
                c85712XkS.LIZ = getString(R.string.t7o);
                c85712XkS.LJIIIIZZ = getString(R.string.t7k);
                c85712XkS.LJIIIZ = getString(R.string.t7j);
                c85712XkS.LJIILIIL = true;
                c85712XkS.LJIIL = getEnterFrom();
                c85712XkS.LJI = true;
            }
        } else {
            if (!C52927Kpv.LIZ()) {
                i = R.string.sg9;
            }
            c85712XkS.LJIIIIZZ = getString(i);
            Bundle arguments = getArguments();
            if (arguments != null) {
                str2 = arguments.getString("page");
            } else {
                str2 = null;
            }
            if (o.LJ(str2, "twosv_setup") && xm()) {
                c85712XkS.LJIIIZ = getString(R.string.sg5);
            } else {
                c85712XkS.LJIIIZ = getString(R.string.sg2);
            }
            if (qm() && !vm()) {
                c85712XkS.LJI = true;
            }
        }
        return c85712XkS;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final C85621Xiz Xl() {
        C85621Xiz c85621Xiz = new C85621Xiz();
        c85621Xiz.LIZ = "";
        c85621Xiz.LIZJ = true;
        c85621Xiz.LJ = false;
        c85621Xiz.LIZLLL = Boolean.FALSE;
        if (sm()) {
            c85621Xiz.LJFF = false;
        }
        return c85621Xiz;
    }

    public final String lm() {
        return (String) this.LLIILZL.getValue();
    }

    public final List<TwoStepVerifyWays> mm() {
        return (List) this.LLIIL.getValue();
    }

    public final String nm() {
        return (String) this.LLIIJLIL.getValue();
    }

    public final boolean pm() {
        Integer num = this.LLIIIZ;
        int value = EnumC69116RAq.BIND_TOTP.getValue();
        if ((num != null && num.intValue() == value) || vm()) {
            return true;
        }
        return false;
    }

    public final boolean sm() {
        Integer num = this.LLIIIZ;
        int value = EnumC69116RAq.TWO_STEP_VERIFICATION.getValue();
        if (num == null || num.intValue() != value) {
            return false;
        }
        return true;
    }

    public final boolean vm() {
        Integer num = this.LLIIIZ;
        int value = EnumC69116RAq.UPDATE_TOTP.getValue();
        if (num == null || num.intValue() != value) {
            return false;
        }
        return true;
    }

    public final boolean xm() {
        Integer num = this.LLIIIZ;
        int value = EnumC69116RAq.VERIFY_TOTP.getValue();
        if (num == null || num.intValue() != value) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, X.InterfaceC80500Via
    public final void LLFZ() {
        String enterFrom = getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        String flowType = lm();
        o.LJIIIZ(flowType, "flowType");
        C188727au LJFF = C85144XbI.LJFF();
        LJFF.LJIIIZ("enter_from", enterFrom);
        LJFF.LJIIIZ("popup_type", "totp");
        LJFF.LJIIIZ("flow_type", flowType);
        FMX.LJIIL("twosv_totp_code_start_typing", LJFF.LIZ);
        String enterFrom2 = getEnterFrom();
        o.LJIIIIZZ(enterFrom2, "enterFrom");
        String enterMethod = getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        C85144XbI.LJJIJIIJIL(enterFrom2, enterMethod, nm(), "totp");
        super.LLFZ();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int getLayout() {
        if (C52927Kpv.LIZ()) {
            return R.layout.mx;
        }
        return R.layout.mw;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        if (!qm() || vm() || !C41565GSz.LIZJ(mo49getActivity())) {
            return false;
        }
        return true;
    }

    public final boolean qm() {
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getInt("progress", -1) >= 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void fm(String str) {
        if (pm()) {
            String enterFrom = getEnterFrom();
            o.LJIIIIZZ(enterFrom, "enterFrom");
            C85144XbI.LJIILLIIL(enterFrom, lm());
            LJII();
            TwoStepAuthApi twoStepAuthApi = TwoStepAuthApi.LIZ;
            int i = EF7.LJIIIZ;
            twoStepAuthApi.getClass();
            TwoStepAuthApi.LIZIZ().bindTotpVerify(i, str, TwoStepAuthApi.LIZJ("/passport/totp/bind_verify/")).LJ(new AgS131S0100000_15(this, 1), C10K.LJIIIIZZ, null);
            return;
        }
        if (xm()) {
            String enterFrom2 = getEnterFrom();
            o.LJIIIIZZ(enterFrom2, "enterFrom");
            C85144XbI.LJIILLIIL(enterFrom2, lm());
            LJII();
            TwoStepAuthApi.LIZ.verifyTotp(EF7.LJIIIZ, str).LJ(new AgS131S0100000_15(this, 2), C10K.LJIIIIZZ, null);
            return;
        }
        if (!sm()) {
            return;
        }
        KeyboardUtils.LIZIZ(_$_findCachedViewById(R.id.enw));
        this.LLIIJI = str;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Integer num;
        Bundle arguments = getArguments();
        if (arguments != null) {
            num = Integer.valueOf(arguments.getInt("current_scene"));
        } else {
            num = null;
        }
        this.LLIIIZ = num;
        super.onCreate(bundle);
    }

    public final void om(int i, String str) {
        if (1016 == i) {
            String string = getString(R.string.sg3);
            o.LJIIIIZZ(string, "getString(R.string.totp2…p_codePage_error_message)");
            Sg(i, string);
        } else {
            if (pm() && 1365 == i) {
                Bundle arguments = getArguments();
                if (arguments != null) {
                    arguments.putBundle("final_data", C141415gn.LIZ("error_code", i));
                    Dl(arguments);
                    return;
                }
                return;
            }
            Sg(i, R4R.LIZ(Integer.valueOf(i), str));
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        Context context;
        Activity LJIJJ;
        TextView textView;
        boolean z;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (sm()) {
            String enterFrom = getEnterFrom();
            o.LJIIIIZZ(enterFrom, "enterFrom");
            String enterMethod = getEnterMethod();
            o.LJIIIIZZ(enterMethod, "enterMethod");
            C85144XbI.LJJIZ(enterFrom, enterMethod, nm(), "totp");
            _$_findCachedViewById(R.id.b_d).setVisibility(0);
            C71897SJp c71897SJp = (C71897SJp) _$_findCachedViewById(R.id.b_d);
            TwoStepAuthApi.LIZ.getClass();
            c71897SJp.setChecked(TwoStepAuthApi.LJ());
            ((CompoundButton) _$_findCachedViewById(R.id.b_d)).setOnCheckedChangeListener(C85193Xc5.LJLIL);
            List<TwoStepVerifyWays> mm = mm();
            if (mm == null || mm.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                _$_findCachedViewById(R.id.b9_).setVisibility(0);
                C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.b9_), new ACListenerS35S0100000_15(this, 29));
            } else {
                _$_findCachedViewById(R.id.b9_).setVisibility(8);
            }
            _$_findCachedViewById(R.id.h0u).setVisibility(0);
            C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.h0u), new ACListenerS35S0100000_15(this, 30));
            _$_findCachedViewById(R.id.b_g).setVisibility(0);
            C16880lQ.LJIIJ(new ACListenerS35S0100000_15(view, 31), view);
            ((C80498ViY) _$_findCachedViewById(R.id.enw)).setInputLength(6);
            ((TextView) _$_findCachedViewById(R.id.enw)).addTextChangedListener(new C85611Xip(this));
            _$_findCachedViewById(R.id.enw).requestFocus();
            C16880lQ.LJIIJ(new ACListenerS35S0100000_15(view, 32), view);
            if (C52927Kpv.LIZ()) {
                ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.b_a);
                if (constraintLayout != null) {
                    C16880lQ.LJIL(constraintLayout, new ACListenerS35S0100000_15(this, 33));
                }
                if (Build.VERSION.SDK_INT < 30) {
                    getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.account.login.twostep.TOTPCodeVerifyFragment$onViewCreated$8
                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                            o.LJIIIZ(source, "source");
                            o.LJIIIZ(event, "event");
                            if (event == Lifecycle.Event.ON_RESUME) {
                                KeyboardUtils.LIZ(this.getViewLifecycleOwner(), view, new C85613Xir(this));
                            }
                        }
                    });
                } else {
                    C16360ka.LJIJJ(view, new C85612Xiq(this));
                }
            }
        } else if (pm() || xm()) {
            String enterFrom2 = getEnterFrom();
            o.LJIIIIZZ(enterFrom2, "enterFrom");
            String flowType = lm();
            o.LJIIIZ(flowType, "flowType");
            C188727au LJFF = C85144XbI.LJFF();
            LJFF.LJIIIZ("enter_from", enterFrom2);
            LJFF.LJIIIZ("popup_type", "totp");
            LJFF.LJIIIZ("flow_type", flowType);
            FMX.LJIIL("twosv_totp_code_enter_show", LJFF.LIZ);
        }
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.enx);
        C7FC.LIZIZ(textView2);
        Bundle arguments = getArguments();
        String str = null;
        if (arguments != null) {
            str = arguments.getString("page");
        }
        if (o.LJ(str, "twosv_setup") && xm()) {
            textView2.setVisibility(0);
            textView2.setText(getString(R.string.sg6));
            Ol(new ACListenerS35S0100000_15(this, 28), textView2);
            textView2.setEnabled(true);
        }
        if (C52927Kpv.LIZ() && (context = getContext()) != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null && (textView = (TextView) LJIJJ.findViewById(R.id.ens)) != null) {
            textView.setTextColor(C41565GSz.LIZ(getContext()));
        }
    }

    public final <T> boolean ym(C10K<T> c10k, boolean z) {
        if (!C82544WaS.LJ(c10k)) {
            Integer num = -2;
            String string = getString(R.string.sg8);
            if (c10k.LJIIJ() instanceof C64698PaI) {
                num = null;
                string = null;
            }
            if (!z) {
                C5S1 c5s1 = new C5S1(getContext());
                c5s1.LIZLLL(R4R.LIZ(null, null));
                c5s1.LJ();
                return false;
            }
            Sg(-2, R4R.LIZ(num, string));
            return false;
        }
        return true;
    }
}
