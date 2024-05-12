package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.LoginDialogFragment;
import com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login.RuInstantLoginSIModeFragment;
import com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login.RuInstantLoginSettingsObject;
import com.ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XiF, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85575XiF extends AbstractC85577XiH {
    public int LJ;
    public int LJFF;
    public final C80147Vct LJI;
    public final java.util.Map<Integer, Boolean> LJII;

    public final String LJIIJ() {
        PagerAdapter adapter = this.LJI.getAdapter();
        o.LJII(adapter, "null cannot be cast to non-null type androidx.fragment.app.FragmentPagerAdapter");
        Bundle arguments = ((C1BC) adapter).LJJIII(this.LJI.getCurrentItem()).getArguments();
        o.LJI(arguments);
        String string = arguments.getString("view_type_string", "");
        o.LJIIIIZZ(string, "viewpager.adapter as Fra…ing(VIEW_TYPE_STRING, \"\")");
        return string;
    }

    @Override // X.InterfaceC85586XiQ
    public final boolean LJJLIIIJLLLLLLLZ() {
        if (this.LJI.getCurrentItem() != 0) {
            C80147Vct c80147Vct = this.LJI;
            c80147Vct.setCurrentItem(c80147Vct.getCurrentItem() - 1);
            return true;
        }
        if (LIZIZ().rv0()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC85586XiQ
    public final boolean LJJLIIJ() {
        if (this.LJI.getCurrentItem() == this.LJ) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC85586XiQ
    public final InterfaceC85593XiX getContent() {
        return new C85588XiS(this.LJI);
    }

    @Override // X.AbstractC85577XiH
    public final Bundle LIZJ() {
        if (LJJLIIJ()) {
            return LIZIZ().nv0();
        }
        return LIZIZ().kv0();
    }

    public final void LJIILL() {
        if (LIZIZ().pv0() && LJJLIIJ()) {
            if (o.LJ(((LinkedHashMap) this.LJII).get(Integer.valueOf(this.LJI.getCurrentItem())), Boolean.TRUE)) {
                this.LJI.setShouldLimitHeight(true);
                this.LJI.setIsFullScreenDialog(LIZIZ().rv0());
                this.LJI.setShouldAdjustHeightDynamically(LIZIZ().gv0());
                this.LJI.setPanelMaxHeightRatio(((Number) LIZIZ().LJLZ.getValue()).doubleValue());
                this.LJI.requestLayout();
            }
        }
        this.LJI.setShouldLimitHeight(false);
        this.LJI.setIsFullScreenDialog(LIZIZ().rv0());
        this.LJI.setShouldAdjustHeightDynamically(LIZIZ().gv0());
        this.LJI.setPanelMaxHeightRatio(((Number) LIZIZ().LJLZ.getValue()).doubleValue());
        this.LJI.requestLayout();
    }

    @Override // X.InterfaceC85586XiQ
    public final boolean LJJLIL() {
        return o.LJ(LJIIJ(), "ru_instant_login_si");
    }

    public final LoginDialogFragment LJIIJJI(boolean z) {
        LoginDialogFragment loginDialogFragment = new LoginDialogFragment();
        Bundle LIZ = C01R.LIZ("is_signup_view", z);
        if (z) {
            LIZ.putString("view_type_string", "signup");
        } else {
            LIZ.putString("view_type_string", "login");
        }
        LIZ(LIZ);
        loginDialogFragment.setArguments(LIZ);
        return loginDialogFragment;
    }

    @Override // X.InterfaceC85586XiQ
    public final void LJIIL(int i) {
        if (i != 16) {
            if (i != 17) {
                return;
            }
            LJIILJJIL("signup");
            return;
        }
        LJIILJJIL("login");
    }

    public final int LJIILIIL(boolean z) {
        if (LIZIZ().gv0()) {
            return 5;
        }
        if (!z) {
            return Integer.MAX_VALUE;
        }
        int i = 4;
        if (LIZIZ().pv0()) {
            return 4;
        }
        Integer num = C252759vz.LIZ().showNum;
        if (num != null) {
            i = num.intValue() + 1;
        }
        return i + 1;
    }

    public final void LJIILJJIL(String str) {
        if (o.LJ(str, "signup")) {
            this.LJI.setCurrentItem(this.LJ);
        } else {
            if (!o.LJ(str, "login")) {
                return;
            }
            this.LJI.setCurrentItem(this.LJFF);
            LJIIIZ();
        }
    }

    @Override // X.InterfaceC85586XiQ
    public final void LJJLJ(Bundle bundle) {
        boolean z;
        String str;
        boolean z2;
        String str2;
        String str3;
        String str4;
        String str5;
        AccountService.LJIJ().tryInit();
        this.LIZ.activityConfiguration(new AqS181S0100000_15(this, 0));
        LJI();
        C80147Vct c80147Vct = this.LJI;
        View LIZ = C80148Vcu.LIZ(c80147Vct);
        if (LIZ != null) {
            c80147Vct.addOnPageChangeListener(new C80149Vcv(c80147Vct, LIZ));
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (((Boolean) LIZIZ().LLII.getValue()).booleanValue()) {
            arrayList.add(LJIIJJI(false));
            arrayList.add(LJIIJJI(true));
        } else {
            arrayList.add(LJIIJJI(true));
            arrayList.add(LJIIJJI(false));
        }
        boolean LJ = C82727WdP.LJ("si");
        C85579XiJ.LIZIZ(false, LJ);
        RuInstantLoginSettingsObject.RealConfig LIZ2 = C35368DuO.LIZ();
        if (LIZ2 != null && LIZ2.type == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z && LJ) {
            RuInstantLoginSIModeFragment ruInstantLoginSIModeFragment = new RuInstantLoginSIModeFragment();
            Bundle bundle2 = new Bundle(LIZIZ().kv0());
            bundle2.putBoolean("is_signup_view", false);
            bundle2.putString("view_type_string", "ru_instant_login_si");
            LIZ(bundle2);
            bundle2.putInt("current_page", EnumC69113RAn.RU_INSTANT_LOGIN_SI.getValue());
            ruInstantLoginSIModeFragment.setArguments(bundle2);
            ListProtector.add(arrayList, 0, ruInstantLoginSIModeFragment);
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            str = "";
            if (i2 >= size) {
                break;
            }
            Bundle arguments = ((Fragment) ListProtector.get(arrayList, i2)).getArguments();
            if (arguments != null) {
                str5 = arguments.getString("view_type_string", "");
            } else {
                str5 = null;
            }
            if (o.LJ(str5, "login")) {
                this.LJFF = i2;
            } else if (o.LJ(str5, "signup")) {
                this.LJ = i2;
            }
            i2++;
        }
        this.LJI.setAdapter(new C80860VoO(arrayList, this, this.LIZ.getSupportFragmentManager()));
        this.LJI.addOnPageChangeListener(new C85572XiC(arrayList, this));
        if (bundle == null) {
            LoginMethodName loginMethodName = C68517Qun.LIZ.LJIIJJI().getLoginMethodName();
            if (LIZIZ().nv0().getBoolean("force_use_default_login_method", false) || LIZIZ().nv0().getBoolean("is_fullscreen_dialog")) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (loginMethodName == LoginMethodName.DEFAULT || z2) {
                i = 1;
            }
            LIZIZ().nv0().putInt("login_last_time", i ^ 1);
            if (this.LJI.getCurrentItem() == this.LJ) {
                str2 = "click_sign_up";
            } else {
                str2 = "click_login";
            }
            String LJIIJ = LJIIJ();
            int hashCode = LJIIJ.hashCode();
            if (hashCode != -902467304) {
                if (hashCode != 103149417) {
                    if (hashCode == 444807686 && LJIIJ.equals("ru_instant_login_si")) {
                        java.util.Map LIZJ = C68972R5c.LIZJ((Bundle) LIZIZ().LLIFFJFJJ.getValue());
                        if (LIZJ == null) {
                            LIZJ = new LinkedHashMap();
                        }
                        if (!TextUtils.isEmpty(LIZIZ().iv0())) {
                            String iv0 = LIZIZ().iv0();
                            o.LJIIIIZZ(iv0, "dependencies.forceLoginTrigger");
                            LIZJ.put("force_login_trigger", iv0);
                        }
                        String enterFrom = LIZIZ().getEnterFrom();
                        o.LJIIIIZZ(enterFrom, "dependencies.enterFrom");
                        String enterMethod = LIZIZ().getEnterMethod();
                        o.LJIIIIZZ(enterMethod, "dependencies.enterMethod");
                        C68972R5c.LIZ.put("login_notify", Long.valueOf(System.currentTimeMillis()));
                        C35936E8m c35936E8m = new C35936E8m();
                        c35936E8m.LIZLLL("enter_from", enterFrom);
                        c35936E8m.LIZLLL("enter_method", enterMethod);
                        c35936E8m.LIZLLL("platform", "instant_login_si");
                        c35936E8m.LIZLLL("carrier", C85579XiJ.LIZ());
                        c35936E8m.LIZLLL("login_panel_type", "login");
                        C68972R5c.LIZIZ(c35936E8m, LIZJ);
                        C68972R5c.LIZ(c35936E8m);
                        FMX.LJIIL("login_notify", c35936E8m.LIZ);
                        return;
                    }
                } else if (LJIIJ.equals("login")) {
                    java.util.Map LIZJ2 = C68972R5c.LIZJ(LIZIZ().kv0());
                    if (LIZJ2 == null) {
                        LIZJ2 = new LinkedHashMap();
                    }
                    if (!TextUtils.isEmpty(LIZIZ().iv0())) {
                        String iv02 = LIZIZ().iv0();
                        o.LJIIIIZZ(iv02, "dependencies.forceLoginTrigger");
                        LIZJ2.put("force_login_trigger", iv02);
                    }
                    LIZJ2.put("is_skippable", Integer.valueOf(LIZIZ().sv0() ? 1 : 0));
                    LIZIZ().nv0().putString("enter_type", str2);
                    String enterFrom2 = LIZIZ().getEnterFrom();
                    o.LJIIIIZZ(enterFrom2, "dependencies.enterFrom");
                    String enterMethod2 = LIZIZ().getEnterMethod();
                    o.LJIIIIZZ(enterMethod2, "dependencies.enterMethod");
                    String string = LIZIZ().kv0().getString("channel");
                    if (string == null) {
                        string = "";
                    }
                    List<C85542Xhi> hv0 = LIZIZ().hv0();
                    int size2 = LIZIZ().hv0().size() - 1;
                    String jv0 = LIZIZ().jv0();
                    o.LJIIIIZZ(jv0, "dependencies.groupId");
                    boolean qv0 = LIZIZ().qv0();
                    String str6 = (String) LIZIZ().LJLLILLLL.getValue();
                    o.LJIIIIZZ(str6, "dependencies.authorId");
                    String lv0 = LIZIZ().lv0();
                    o.LJIIIIZZ(lv0, "dependencies.loginPanelType");
                    Bundle kv0 = LIZIZ().kv0();
                    boolean rv0 = LIZIZ().rv0();
                    String str7 = (String) LIZIZ().LJLLJ.getValue();
                    if (str7 != null) {
                        str = str7;
                    }
                    C68971R5b.LIZIZ(enterFrom2, enterMethod2, str2, string, LIZJ2, hv0, size2, jv0, qv0, str6, lv0, kv0, rv0, str);
                    return;
                }
            } else if (LJIIJ.equals("signup")) {
                java.util.Map LIZJ3 = C68972R5c.LIZJ(LIZIZ().nv0());
                if (LIZJ3 == null) {
                    LIZJ3 = new LinkedHashMap();
                }
                if (!TextUtils.isEmpty(LIZIZ().iv0())) {
                    String iv03 = LIZIZ().iv0();
                    o.LJIIIIZZ(iv03, "dependencies.forceLoginTrigger");
                    LIZJ3.put("force_login_trigger", iv03);
                }
                LIZJ3.put("is_skippable", Integer.valueOf(LIZIZ().sv0() ? 1 : 0));
                LIZIZ().nv0().putString("enter_type", str2);
                String enterFrom3 = LIZIZ().getEnterFrom();
                o.LJIIIIZZ(enterFrom3, "dependencies.enterFrom");
                String enterMethod3 = LIZIZ().getEnterMethod();
                o.LJIIIIZZ(enterMethod3, "dependencies.enterMethod");
                String string2 = LIZIZ().nv0().getString("channel");
                if (string2 == null) {
                    string2 = "";
                }
                List<? extends C85542Xhi> list = LIZIZ().LJLJJI;
                if (list != null) {
                    int LJIILIIL = LJIILIIL(true);
                    String jv02 = LIZIZ().jv0();
                    o.LJIIIIZZ(jv02, "dependencies.groupId");
                    boolean qv02 = LIZIZ().qv0();
                    String str8 = (String) LIZIZ().LJLLILLLL.getValue();
                    o.LJIIIIZZ(str8, "dependencies.authorId");
                    String lv02 = LIZIZ().lv0();
                    o.LJIIIIZZ(lv02, "dependencies.loginPanelType");
                    Bundle nv0 = LIZIZ().nv0();
                    boolean rv02 = LIZIZ().rv0();
                    String str9 = (String) LIZIZ().LJLLJ.getValue();
                    if (str9 != null) {
                        str = str9;
                    }
                    C68971R5b.LIZIZ(enterFrom3, enterMethod3, str2, string2, LIZJ3, list, LJIILIIL, jv02, qv02, str8, lv02, nv0, rv02, str);
                    return;
                }
                o.LJIJI("allSignupItems");
                throw null;
            }
            C35936E8m c35936E8m2 = new C35936E8m();
            try {
                StringBuilder sb = new StringBuilder();
                for (String str10 : LIZIZ().mv0().keySet()) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(' ');
                    LIZ3.append(str10);
                    LIZ3.append(':');
                    Object LLJJIII = C16880lQ.LLJJIII(LIZIZ().mv0(), str10);
                    if (LLJJIII != null) {
                        str4 = LLJJIII.toString();
                    } else {
                        str4 = null;
                    }
                    LIZ3.append(str4);
                    sb.append(X1D.LIZIZ(LIZ3));
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("call: ");
                LIZ4.append(this.LIZ.getClass().getName());
                LIZ4.append(" bundle:");
                LIZ4.append((Object) sb);
                str3 = X1D.LIZIZ(LIZ4);
            } catch (Exception unused) {
                str3 = "Exception";
            }
            c35936E8m2.LIZLLL("info", str3);
            FMX.LJIIL("account_debug_info", c35936E8m2.LIZ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85575XiF(ActivityC86117Xqz activity, R6A signupListener, InterfaceC85592XiW signupContentListener) {
        super(activity, signupListener, signupContentListener);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(signupListener, "signupListener");
        o.LJIIIZ(signupContentListener, "signupContentListener");
        C80147Vct c80147Vct = new C80147Vct(activity);
        this.LJI = c80147Vct;
        this.LJII = new LinkedHashMap();
        c80147Vct.setId(R.id.ncx);
    }
}
