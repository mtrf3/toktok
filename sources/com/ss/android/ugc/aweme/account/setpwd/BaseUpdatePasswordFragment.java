package com.ss.android.ugc.aweme.account.setpwd;

import X.AbstractC73635Sv9;
import X.AbstractC73672Svk;
import X.C221108m2;
import X.C252949wI;
import X.C35936E8m;
import X.C62822Ol8;
import X.C68972R5c;
import X.C69041R7t;
import X.C69067R8t;
import X.C69071R8x;
import X.C69093R9t;
import X.C71786SFi;
import X.C73318Sq2;
import X.C73426Srm;
import X.C73636SvA;
import X.C73969T1h;
import X.C74088T5w;
import X.C74090T5y;
import X.C78886Uxe;
import X.C85712XkS;
import X.C9WD;
import X.EnumC71789SFl;
import X.FMX;
import X.R41;
import X.R92;
import X.RAA;
import X.RB0;
import X.RB6;
import X.RB7;
import X.RB8;
import X.RB9;
import X.RBB;
import X.RBC;
import X.RBD;
import X.SAU;
import X.T0J;
import X.T0K;
import X.T0N;
import X.T16;
import Y.ACListenerS31S0100000_11;
import Y.AfS20S1200000_11;
import Y.AfS24S1100000_11;
import Y.AfS3S2200000_11;
import Y.AfS63S0100000_11;
import Y.IDxS310S0100000_11;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountFeatureFlagService;
import com.ss.android.ugc.aweme.account.experiment.AccountFeatureFlagService;
import com.ss.android.ugc.aweme.account.login.v2.network.SetPasswordMobHelper;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class BaseUpdatePasswordFragment extends BaseI18nLoginFragment {
    public String LLFFF;
    public boolean LLFII;
    public final IAccountFeatureFlagService LLFZ;
    public final boolean LLI;
    public final boolean LLIFFJFJJ;
    public final C73318Sq2 LLII;
    public final C62822Ol8 LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public final Map<Integer, View> LLIIIJ = new LinkedHashMap();
    public final C62822Ol8 LJZL = C221108m2.LIZIZ(new AqS161S0100000_11(this, 41));
    public final C62822Ol8 LL = C221108m2.LIZIZ(new AqS161S0100000_11(this, 40));
    public final C62822Ol8 LLD = C221108m2.LIZIZ(new AqS161S0100000_11(this, 38));
    public final C62822Ol8 LLF = C221108m2.LIZIZ(new AqS161S0100000_11(this, 36));
    public final C62822Ol8 LLFF = C221108m2.LIZIZ(new AqS161S0100000_11(this, 39));

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIIJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LLIIIJ;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int getLayout() {
        return R.layout.of;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public BaseUpdatePasswordFragment() {
        IAccountFeatureFlagService LJI = AccountFeatureFlagService.LJI();
        this.LLFZ = LJI;
        this.LLI = LJI.LJFF();
        this.LLIFFJFJJ = LJI.LIZ();
        this.LLII = new C73318Sq2();
        this.LLIIII = C221108m2.LIZIZ(RAA.LJLIL);
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS161S0100000_11(this, 37));
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public C85712XkS Jl() {
        int i;
        C85712XkS c85712XkS = new C85712XkS(null, null, false, null, null, false, null, false, false, 131071);
        if (((Boolean) this.LLD.getValue()).booleanValue() && this.LLF.getValue() == null) {
            i = R.string.tg8;
        } else {
            i = R.string.dqc;
        }
        c85712XkS.LJIIIIZZ = getString(i);
        c85712XkS.LIZ = " ";
        c85712XkS.LJIILIIL = false;
        return c85712XkS;
    }

    public final String Rl() {
        return (String) this.LL.getValue();
    }

    public final String Sl() {
        return (String) this.LLIIII.getValue();
    }

    public final String Tl() {
        return (String) this.LJZL.getValue();
    }

    public final void Wl() {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", getEnterFrom());
        c35936E8m.LIZLLL("page", (String) this.LLFF.getValue());
        c35936E8m.LIZLLL("platform", Rl());
        FMX.LJIIL("exit_password_back", c35936E8m.LIZ);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.LLII.LIZLLL();
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Hl() {
        C74088T5w c74088T5w = (C74088T5w) _$_findCachedViewById(R.id.byh);
        if (c74088T5w != null) {
            c74088T5w.LIZ(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Pl() {
        C74088T5w c74088T5w = (C74088T5w) _$_findCachedViewById(R.id.byh);
        if (c74088T5w != null) {
            c74088T5w.LIZIZ(true);
        }
    }

    public void Xl() {
        ((C74088T5w) _$_findCachedViewById(R.id.byh)).LIZIZ(true);
        String text = ((C74090T5y) _$_findCachedViewById(R.id.byi)).getText();
        if (Vl(text)) {
            return;
        }
        if (!TextUtils.isEmpty(Tl())) {
            if (TextUtils.equals(Rl(), "email")) {
                String ticket = Tl();
                String Sl = Sl();
                o.LJIIIZ(ticket, "ticket");
                SetPasswordMobHelper setPasswordMobHelper = new SetPasswordMobHelper(this);
                C73636SvA.LIZ(this, this, AbstractC73635Sv9.LJ(new C69071R8x(this, this, ticket, text, Sl)).LJIIIZ(new AfS20S1200000_11(setPasswordMobHelper, this, text, 4)).LJIIIIZZ(new AfS20S1200000_11(setPasswordMobHelper, this, text, 6))).LJIIIZ(new AfS63S0100000_11(this, 33)).LJIILL();
                return;
            }
            String ticket2 = Tl();
            String Sl2 = Sl();
            o.LJIIIZ(ticket2, "ticket");
            SetPasswordMobHelper setPasswordMobHelper2 = new SetPasswordMobHelper(this);
            C73636SvA.LIZ(this, this, AbstractC73635Sv9.LJ(new R92(this, this, ticket2, text, Sl2)).LJIIIZ(new AfS20S1200000_11(setPasswordMobHelper2, this, text, 10)).LJIIIIZZ(new AfS20S1200000_11(setPasswordMobHelper2, this, text, 11))).LJIIIZ(new AfS63S0100000_11(this, 34)).LJIILL();
            return;
        }
        C69093R9t.LJJIII(this, this, text, Sl()).LJIIIZ(new AfS63S0100000_11(this, 35)).LJIILL();
    }

    public final void Yl() {
        int i;
        View checklist_item_special_char = _$_findCachedViewById(R.id.ba3);
        o.LJIIIIZZ(checklist_item_special_char, "checklist_item_special_char");
        int i2 = 0;
        if (!this.LLI) {
            i = 0;
        } else {
            i = 8;
        }
        checklist_item_special_char.setVisibility(i);
        View password_strength_view = _$_findCachedViewById(R.id.hio);
        o.LJIIIIZZ(password_strength_view, "password_strength_view");
        if (!this.LLIFFJFJJ) {
            i2 = 8;
        }
        password_strength_view.setVisibility(i2);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public boolean onBackPressed() {
        Wl();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Yl();
        C9WD.LIZIZ(((C74090T5y) _$_findCachedViewById(R.id.byi)).getEditText());
    }

    public final void Ql(String pwd) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("rule_strategies", Sl());
        if (AccountService.LJIJ().LJFF().isLogin() && R41.LJ().isEnableMultiAccountLogin()) {
            String encode = Uri.encode("1");
            o.LJIIIIZZ(encode, "encode(\"1\")");
            linkedHashMap.put("multi_login", encode);
        }
        String str2 = (String) this.LLF.getValue();
        if (str2 == null) {
            return;
        }
        String str3 = "phone";
        if (o.LJ(Rl(), "phone") || o.LJ(Rl(), "mobile")) {
            str = "mobile";
        } else {
            str = "email";
        }
        String ticket = Tl();
        o.LJIIIZ(pwd, "pwd");
        o.LJIIIZ(ticket, "ticket");
        SetPasswordMobHelper setPasswordMobHelper = new SetPasswordMobHelper(this);
        if (!o.LJ(str, "mobile")) {
            str3 = str;
        }
        C73636SvA.LIZ(this, this, AbstractC73635Sv9.LJ(new C69067R8t(this, this, str, pwd, str2, ticket, linkedHashMap)).LJIIIZ(new AfS3S2200000_11(setPasswordMobHelper, this, str3, pwd, 2)).LJIIIIZZ(new AfS3S2200000_11(setPasswordMobHelper, this, str3, pwd, 0))).LJIIIZ(new AfS24S1100000_11((Object) this, str, 9)).LJIILL();
    }

    public final boolean Vl(String password) {
        o.LJIIIZ(password, "password");
        String conditionalLoginTicket = (String) this.LLF.getValue();
        if (conditionalLoginTicket == null || conditionalLoginTicket.length() == 0) {
            return false;
        }
        if (!o.LJ(this.LLFFF, password)) {
            this.LLFFF = password;
            String Sl = Sl();
            o.LJIIIZ(conditionalLoginTicket, "conditionalLoginTicket");
            C73636SvA.LIZ(this, this, AbstractC73635Sv9.LJ(new C69041R7t(this, conditionalLoginTicket, Sl, password))).LJIIIZ(new AfS24S1100000_11((Object) this, password, 10)).LJIILL();
        } else {
            Ql(password);
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle arguments;
        super.onCreate(bundle);
        if (C68972R5c.LIZJ(getArguments()) == null && (arguments = getArguments()) != null) {
            arguments.putSerializable("extra_param", new HashMap());
        }
        Map LIZJ = C68972R5c.LIZJ(getArguments());
        if (LIZJ != null) {
            LIZJ.put("page", this.LLFF.getValue());
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("platform", Rl());
        c35936E8m.LIZLLL("enter_from", getEnterFrom());
        c35936E8m.LIZLLL("enter_method", getEnterMethod());
        c35936E8m.LIZLLL("login_panel_type", wl());
        c35936E8m.LIZLLL("page", (String) this.LLFF.getValue());
        FMX.LJIIL("set_password_show", c35936E8m.LIZ);
    }

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        o.LJIIIZ(message, "message");
        ((C252949wI) _$_findCachedViewById(R.id.byj)).LIZIZ(message);
        ((C74088T5w) _$_findCachedViewById(R.id.byh)).LIZ(true);
        ((C74088T5w) _$_findCachedViewById(R.id.byh)).setEnabled(false);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ((TextView) _$_findCachedViewById(R.id.ba1)).setText(R.string.rdf);
        SAU sau = (SAU) _$_findCachedViewById(R.id.b_y);
        String string = getString(R.string.rdc);
        o.LJIIIIZZ(string, "getString(R.string.signup_pwReq_item1)");
        sau.setDesc(string);
        SAU sau2 = (SAU) _$_findCachedViewById(R.id.ba2);
        String string2 = getString(R.string.rdd);
        o.LJIIIIZZ(string2, "getString(R.string.signup_pwReq_item2)");
        sau2.setDesc(string2);
        SAU sau3 = (SAU) _$_findCachedViewById(R.id.ba3);
        String string3 = getString(R.string.rde);
        o.LJIIIIZZ(string3, "getString(R.string.signup_pwReq_item3)");
        sau3.setDesc(string3);
        Yl();
        Resources resources = getResources();
        o.LJIIIIZZ(resources, "resources");
        RB6 rb6 = new RB6(resources);
        ((ArrayList) rb6.LIZ).add(new RB9());
        if (!this.LLI) {
            ((ArrayList) rb6.LIZ).add(new RBD());
        }
        ((ArrayList) rb6.LIZ).add(new RBC());
        ((ArrayList) rb6.LIZ).add(new RBB(resources));
        RB7 rb7 = new RB7(rb6);
        T0K LIZ = T0N.LIZ();
        T0J<RB8> t0j = rb7.LIZIZ;
        t0j.getClass();
        new C73426Srm(t0j).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS310S0100000_11(this, 0));
        if (this.LLIFFJFJJ) {
            ((C71786SFi) _$_findCachedViewById(R.id.hio)).LIZ(EnumC71789SFl.UNKNOWN);
            T0J<EnumC71789SFl> t0j2 = LIZ.LIZIZ;
            t0j2.getClass();
            new C73426Srm(t0j2).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS310S0100000_11(this, 1));
        }
        T0J<Boolean> t0j3 = rb7.LIZJ;
        t0j3.getClass();
        C73426Srm c73426Srm = new C73426Srm(t0j3);
        T0J<EnumC71789SFl> t0j4 = LIZ.LIZIZ;
        t0j4.getClass();
        AbstractC73672Svk.LJI(c73426Srm, new C73426Srm(t0j4), C78886Uxe.LJLJJI).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS310S0100000_11(this, 2));
        ((C74090T5y) _$_findCachedViewById(R.id.byi)).getEditText().addTextChangedListener(new RB0(this, rb7, LIZ));
        Ol(new ACListenerS31S0100000_11(this, 11), _$_findCachedViewById(R.id.byh));
    }
}
