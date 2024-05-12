package com.ss.android.ugc.aweme.setting.page.account;

import X.AK7;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C25860ACy;
import X.C26045AKb;
import X.C3AY;
import X.C62822Ol8;
import X.C77273UUj;
import X.FMX;
import X.HG3;
import X.InterfaceC61213O0r;
import X.R41;
import X.RCY;
import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS1S1010000_4;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes5.dex */
public final class ThirdPartyBindingPage extends BasePage {
    public boolean LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 801));
    public final HashMap<String, C25860ACy> LJLJJI = new HashMap<>();

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int getLayout() {
        return R.layout.cl8;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        HG3.LJIILL().getSetPasswordStatus(new AK7(this));
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, X.JBS
    public final void onBeforeActivityCreated(Activity activity) {
        if (activity != null) {
            activity.setTheme(R.style.kp);
        }
        super.onBeforeActivityCreated(activity);
    }

    public static void Dl(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("source", "manage_account");
        c188727au.LJIIIZ("theme", str2);
        c188727au.LJIIIZ("platform", str);
        FMX.LJIIL("3rd_party_unbind_popup_show", c188727au.LIZ);
    }

    public final void Hl(String str, boolean z) {
        C25860ACy c25860ACy = this.LJLJJI.get(str);
        if (c25860ACy == null) {
            return;
        }
        if (z) {
            RCY rcy = R41.LIZIZ().getBoundSocialPlatforms().get(str);
            if (rcy != null) {
                c25860ACy.LJIIJ(new AqS1S1010000_4(rcy.LIZJ, true, 2));
                return;
            }
            return;
        }
        c25860ACy.LJIIJ(new AqS1S1010000_4(null, false, 2));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0096. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dc  */
    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r30, android.os.Bundle r31) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.page.account.ThirdPartyBindingPage.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static void Al(String str, String str2, String str3) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("source", "manage_account");
        c188727au.LJIIIZ("theme", str2);
        c188727au.LJIIIZ("platform", str);
        c188727au.LJIIIZ("exit_method", str3);
        FMX.LJIIL("3rd_party_unbind_popup_exit", c188727au.LIZ);
    }

    public static void Gl(int i, String str, String str2) {
        int i2;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("source", "manage_account");
        c188727au.LJIIIZ("platform", str);
        if (i == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c188727au.LIZLLL(i2, "status");
        c188727au.LIZLLL(i, "error_code");
        c188727au.LJIIIZ("error_desc", str2);
        FMX.LJIIL("3rd_party_unbind_response", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        String LLJJIJIIJIL;
        if (i != 10 || intent == null || (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "platform")) == null || LLJJIJIIJIL.length() == 0) {
            return;
        }
        String LIZJ = C77273UUj.LIZJ(LLJJIJIIJIL);
        int intExtra = intent.getIntExtra("error_code", 0);
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "description");
        if (i2 == -1) {
            String string = getString(R.string.s83, LIZJ);
            o.LJIIIIZZ(string, "getString(R.string.thrp_…dSuccess_toast, showName)");
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIZ(string);
            c26045AKb.LJFF(R.raw.icon_tick_fill_small);
            c26045AKb.LJII(R.attr.e8);
            c26045AKb.LJIIJ();
            Hl(LLJJIJIIJIL, true);
            return;
        }
        if (intExtra == 1030) {
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            C3AY.LIZ(requireActivity, getString(R.string.s81), getString(R.string.s7z), getString(R.string.s80), null, null);
            return;
        }
        if (TextUtils.isEmpty(LLJJIJIIJIL2)) {
            LLJJIJIIJIL2 = getString(R.string.s82, LIZJ);
        } else {
            o.LJI(LLJJIJIIJIL2);
        }
        o.LJIIIIZZ(LLJJIJIIJIL2, "if (TextUtils.isEmpty(er…        ) else errorMsg!!");
        C26045AKb c26045AKb2 = new C26045AKb(this);
        c26045AKb2.LJIIIZ(LLJJIJIIJIL2);
        c26045AKb2.LJIIJ();
    }
}
