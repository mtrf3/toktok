package com.ss.android.ugc.aweme.music.app.auth.setting.page;

import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C25851ACp;
import X.C25860ACy;
import X.C42625Go9;
import X.C62822Ol8;
import X.C8UR;
import X.C94302aeo;
import X.C94392agG;
import X.C94580ajI;
import X.C94985app;
import X.C9KF;
import X.FMX;
import X.InterfaceC61213O0r;
import X.QD3;
import X.XKX;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

@InterfaceC61213O0r
/* loaded from: classes34.dex */
public final class MusicSettingPage extends BasePage {
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 80));
    public boolean LJLJJI = true;
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 78));

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
        return R.layout.dwj;
    }

    public final C25860ACy Al() {
        return (C25860ACy) this.LJLJJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C42625Go9.LIZJ(this);
        _$_clearFindViewByIdCache();
    }

    public final void Dl(boolean z) {
        if (z) {
            DspPlatform LJIIIIZZ = C94302aeo.LJIIIIZZ(null);
            if (LJIIIIZZ != DspPlatform.UNKNOWN) {
                Al().LJIILIIL(LJIIIIZZ.getTitle());
                return;
            }
            C25860ACy Al = Al();
            String string = getString(R.string.bay);
            o.LJIIIIZZ(string, "getString(R.string.addMu…age_musicPage_sectionCTA)");
            Al.LJIILIIL(string);
            return;
        }
        Al().LJIILIIL("");
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, X.JBS
    public final void onBeforeActivityCreated(Activity activity) {
        if (activity != null) {
            activity.setTheme(R.style.kp);
        }
        super.onBeforeActivityCreated(activity);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onMusic2DspLinkChangeEvent(C8UR event) {
        o.LJIIIZ(event, "event");
        Dl(true);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onMusic2DspPlatformListLoadSuccessEvent(C94392agG event) {
        o.LJIIIZ(event, "event");
        Dl(true);
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        fragmentConfiguration(C94580ajI.LJLIL);
        ((C252709vu) _$_findCachedViewById(R.id.gwg)).LJIILJJIL(false);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.gwg);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii c234529Ii = new C234529Ii();
        c234529Ii.LIZJ();
        c234529Ii.LIZJ = R.raw.icon_arrow_left_ltr;
        c234529Ii.LIZLLL = true;
        c234529Ii.LIZIZ(new IDqS423S0100000_42(this, 79));
        c235119Kp.LIZLLL(c234529Ii);
        C9KF c9kf = new C9KF();
        String string = getString(R.string.bb2);
        o.LJIIIIZZ(string, "getString(R.string.addMu…ettingsPage_sectionTitle)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        c252709vu.setNavActions(c235119Kp);
        ((C25851ACp) this.LJLJI.getValue()).LIZ(Al());
        ((C25851ACp) this.LJLJI.getValue()).LIZLLL();
        C42625Go9.LIZIZ(this);
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C94985app(this, null), 3);
        HashMap hashMap = new HashMap();
        hashMap.put("previous_page", "settings_page");
        hashMap.put("enter_method", "click_button");
        FMX.LJIIL("enter_music_setting", hashMap);
    }
}
