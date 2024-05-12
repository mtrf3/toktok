package com.ss.android.ugc.aweme.account.agegate.ftc;

import X.AGJ;
import X.AbstractC73851Syd;
import X.C03880Dg;
import X.C221108m2;
import X.C252949wI;
import X.C26045AKb;
import X.C35936E8m;
import X.C40535FvX;
import X.C53203KuN;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C71745SDt;
import X.C73411SrX;
import X.C73969T1h;
import X.C74088T5w;
import X.C74090T5y;
import X.C78562UsQ;
import X.C78563UsR;
import X.C81626W1u;
import X.C85636XjE;
import X.C85678Xju;
import X.C85679Xjv;
import X.C85684Xk0;
import X.C85685Xk1;
import X.C85712XkS;
import X.C85837XmT;
import X.C88393dT;
import X.C9WD;
import X.DialogC81625W1t;
import X.E2M;
import X.EOO;
import X.EnumC69113RAn;
import X.FMX;
import X.InterfaceC85680Xjw;
import X.O0X;
import X.UZF;
import X.X1D;
import Y.ACListenerS34S0100000_14;
import Y.ACListenerS35S0100000_15;
import Y.AfS67S0100000_15;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes16.dex */
public final class FtcCreateAccountFragment extends BaseI18nLoginFragment implements InterfaceC85680Xjw {
    public C88393dT LLFF;
    public C85679Xjv LLFFF;
    public final Map<Integer, View> LLFZ = new LinkedHashMap();
    public final C62822Ol8 LJZL = C221108m2.LIZIZ(new C85636XjE(this));
    public final C62822Ol8 LL = C221108m2.LIZIZ(new C85685Xk1(this));
    public final C62822Ol8 LLD = C221108m2.LIZIZ(new C85684Xk0(this));
    public final C62822Ol8 LLF = C221108m2.LIZIZ(new AqS165S0100000_15(this, 49));
    public final C78563UsR[] LLFII = {C78563UsR.LIZJ, C78563UsR.LIZLLL, C78563UsR.LJ};

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFZ;
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

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int getLayout() {
        return R.layout.mn;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final boolean Ql() {
        return ((Boolean) this.LJZL.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Hl() {
        boolean z;
        C74088T5w c74088T5w = (C74088T5w) _$_findCachedViewById(R.id.doz);
        if (c74088T5w != null) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.doz);
            if (_$_findCachedViewById != null) {
                z = _$_findCachedViewById.isEnabled();
            } else {
                z = false;
            }
            c74088T5w.LIZ(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        String string;
        String str;
        if (Ql()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(getString(R.string.thz));
            LIZ.append('\n');
            LIZ.append(getString(R.string.ti0));
            string = X1D.LIZIZ(LIZ);
        } else {
            string = getString(R.string.cqv);
            o.LJIIIIZZ(string, "getString(R.string.chooseusername_desc)");
        }
        boolean Ql = Ql();
        if (Ql()) {
            str = getString(R.string.dr1);
        } else {
            str = " ";
        }
        return new C85712XkS(str, null, Ql, getString(R.string.cqz), string, false, null, false, true, 105694);
    }

    @Override // X.InterfaceC85680Xjw
    public final void K5() {
        C252949wI c252949wI = (C252949wI) _$_findCachedViewById(R.id.doy);
        if (c252949wI != null) {
            c252949wI.LIZ();
        }
        C74090T5y c74090T5y = (C74090T5y) _$_findCachedViewById(R.id.dox);
        if (c74090T5y != null) {
            c74090T5y.LIZLLL(1, 3);
        }
    }

    @Override // X.InterfaceC85680Xjw
    public final void LLJJJJ() {
        String str;
        C252949wI c252949wI = (C252949wI) _$_findCachedViewById(R.id.doy);
        if (c252949wI != null) {
            c252949wI.LIZ();
        }
        Hl();
        C40535FvX.LIZJ(false);
        if (((Number) this.LLF.getValue()).intValue() == 0) {
            SmartRouter.buildRoute(this, "aweme://hyd_action/video_export_complete?is_kids_mode=1").open();
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", EnumC69113RAn.DELETE_VIDEO_ALERT.getValue());
        C74090T5y c74090T5y = (C74090T5y) _$_findCachedViewById(R.id.dox);
        if (c74090T5y == null || (str = c74090T5y.getText()) == null) {
            str = "";
        }
        arguments.putString("username", str);
        arguments.putString("enter_from", "from_kids_account_page");
        arguments.putInt("is_kids", 1);
        arguments.putBoolean("finish_before_jump", true);
        rh(arguments);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Pl() {
        boolean z;
        C74088T5w c74088T5w = (C74088T5w) _$_findCachedViewById(R.id.doz);
        if (c74088T5w != null) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.doz);
            if (_$_findCachedViewById != null) {
                z = _$_findCachedViewById.isEnabled();
            } else {
                z = false;
            }
            c74088T5w.LIZIZ(z);
        }
    }

    @Override // X.InterfaceC85680Xjw
    public final void g9() {
        String str;
        C252949wI c252949wI = (C252949wI) _$_findCachedViewById(R.id.doy);
        if (c252949wI != null) {
            c252949wI.LIZ();
        }
        Hl();
        if (((Boolean) this.LLD.getValue()).booleanValue()) {
            C40535FvX.LIZJ(false);
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", EnumC69113RAn.FTC_CREATE_PASSWORD.getValue());
        C74090T5y c74090T5y = (C74090T5y) _$_findCachedViewById(R.id.dox);
        if (c74090T5y == null || (str = c74090T5y.getText()) == null) {
            str = "";
        }
        arguments.putString("username", str);
        rh(arguments);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        return !Ql();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C9WD.LIZIZ(((C74090T5y) _$_findCachedViewById(R.id.dox)).getEditText());
    }

    @Override // X.InterfaceC85680Xjw
    public final void Ik(boolean z) {
        C74088T5w c74088T5w = (C74088T5w) _$_findCachedViewById(R.id.doz);
        if (c74088T5w == null) {
            return;
        }
        c74088T5w.setEnabled(z);
    }

    @Override // X.InterfaceC85680Xjw
    public final void LJIILL(String str) {
        Hl();
        if (str != null) {
            Sg(0, str);
        }
    }

    @Override // X.InterfaceC85680Xjw
    public final void LLZZZZ(List<String> list) {
        C88393dT c88393dT = this.LLFF;
        if (c88393dT != null) {
            c88393dT.LIZ(list);
        }
    }

    @Override // X.InterfaceC85680Xjw
    public final void N3(String username) {
        o.LJIIIZ(username, "username");
        C74090T5y c74090T5y = (C74090T5y) _$_findCachedViewById(R.id.dox);
        if (c74090T5y != null) {
            c74090T5y.setText(username);
        }
    }

    public final void Rl(String str) {
        if (C53203KuN.LIZ()) {
            ICompliancePolicyService LJII = a.LJII();
            if (LJII != null) {
                LJII.LIZIZ(new O0X(AGJ.ACCOUNT_KIDS_SIGNUP.getValue(), str, true, true, 4), new C71745SDt());
                return;
            }
            return;
        }
        C81626W1u c81626W1u = new C81626W1u();
        UZF.LIZ.getClass();
        c81626W1u.LIZ = UZF.LIZIZ(str);
        DialogC81625W1t LIZ = c81626W1u.LIZ(mo49getActivity());
        if (new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/account/base/component/AwemeProtocolDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "1806023052992492468")).LIZ) {
            return;
        }
        LIZ.show();
    }

    public final void Sl(String str) {
        ICompliancePolicyService LJII = a.LJII();
        if (LJII != null) {
            LJII.LIZ(new O0X(AGJ.ACCOUNT_KIDS_SIGNUP.getValue(), str, false, false, 28));
        }
    }

    @Override // X.InterfaceC85680Xjw
    public final void j5(boolean z) {
        int i;
        String text;
        C74090T5y c74090T5y = (C74090T5y) _$_findCachedViewById(R.id.dox);
        if (c74090T5y != null) {
            if (z) {
                i = 2;
            } else {
                C74090T5y c74090T5y2 = (C74090T5y) _$_findCachedViewById(R.id.dox);
                if (c74090T5y2 == null || (text = c74090T5y2.getText()) == null || text.length() == 0) {
                    i = 0;
                } else {
                    i = 1;
                }
            }
            c74090T5y.LIZLLL(i, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean booleanValue = ((Boolean) this.LLD.getValue()).booleanValue();
        String enterFrom = getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        String enterMethod = getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        this.LLFFF = new C85679Xjv(this, booleanValue, enterFrom, enterMethod);
    }

    @Override // X.InterfaceC85680Xjw
    public final void LJLJL(Integer num, Integer num2) {
        Hl();
        if (num2 != null) {
            String string = getString(num2.intValue());
            o.LJIIIIZZ(string, "getString(it)");
            Sg(0, string);
        }
        if (num != null) {
            int intValue = num.intValue();
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIZ(getString(intValue));
            c26045AKb.LJIIJ();
        }
    }

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        o.LJIIIZ(message, "message");
        C252949wI c252949wI = (C252949wI) _$_findCachedViewById(R.id.doy);
        if (c252949wI != null) {
            c252949wI.LIZIZ(message);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C73411SrX c73411SrX;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C85679Xjv c85679Xjv = this.LLFFF;
        if (c85679Xjv != null) {
            C73411SrX c73411SrX2 = c85679Xjv.LJI;
            if (c73411SrX2 != null && !c73411SrX2.isDisposed() && (c73411SrX = c85679Xjv.LJI) != null) {
                c73411SrX.dispose();
            }
            c85679Xjv.LJI = (C73411SrX) c85679Xjv.LJII.LJIILIIL().LJIJJLI(new AfS67S0100000_15(c85679Xjv, 87)).LJIIJJI(500L, TimeUnit.MILLISECONDS).LJJIFFI(E2M.LJLIL).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS67S0100000_15(c85679Xjv, 88));
            if (c85679Xjv.LIZIZ) {
                InterfaceC85680Xjw interfaceC85680Xjw = c85679Xjv.LIZ;
                Object value = c85679Xjv.LJ.LIZ.getValue();
                o.LJIIIIZZ(value, "<get-currentUsername>(...)");
                interfaceC85680Xjw.N3((String) value);
                AbstractC73851Syd abstractC73851Syd = c85679Xjv.LJII;
                Object value2 = c85679Xjv.LJ.LIZ.getValue();
                o.LJIIIIZZ(value2, "<get-currentUsername>(...)");
                abstractC73851Syd.onNext(value2);
            }
            String str = c85679Xjv.LIZJ;
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZLLL("enter_from", str);
            c35936E8m.LIZ(EOO.LIZIZ(), "is_in_personalized_nuj");
            FMX.LJIIL("show_create_account_page", c35936E8m.LIZ);
            if (Ql() || ((Boolean) this.LL.getValue()).booleanValue()) {
                _$_findCachedViewById(R.id.dp0).setVisibility(0);
                C85837XmT.LIZ(mo49getActivity(), (TuxTextView) _$_findCachedViewById(R.id.dp0), new ACListenerS35S0100000_15(this, 17), new ACListenerS35S0100000_15(this, 18), new ACListenerS34S0100000_14(this, 4));
                if (C53203KuN.LIZ()) {
                    Sl("privacy-policy");
                    Sl("terms-of-use");
                }
            }
            if (((Boolean) this.LLD.getValue()).booleanValue()) {
                C40535FvX.LIZJ(true);
            }
            ((C74090T5y) _$_findCachedViewById(R.id.dox)).getEditText().setInputType(524288);
            ((C74090T5y) _$_findCachedViewById(R.id.dox)).getEditText().setFilters(new C78562UsQ[]{new C78562UsQ(this.LLFII, new AqS181S0100000_15(this, 18))});
            ((C74090T5y) _$_findCachedViewById(R.id.dox)).getEditText().addTextChangedListener(new C85678Xju(this));
            Ol(new ACListenerS35S0100000_15(this, 19), _$_findCachedViewById(R.id.doz));
            RecyclerView ftcUsernameSuggestion = (RecyclerView) _$_findCachedViewById(R.id.dp4);
            o.LJIIIIZZ(ftcUsernameSuggestion, "ftcUsernameSuggestion");
            C88393dT c88393dT = new C88393dT(ftcUsernameSuggestion, null, new AqS181S0100000_15(this, 19));
            this.LLFF = c88393dT;
            c88393dT.LJ = true;
            return;
        }
        o.LJIJI("presenter");
        throw null;
    }
}
