package com.ss.android.ugc.aweme.setting.page.playback;

import X.AEB;
import X.AEG;
import X.AV1;
import X.ActivityC45651qj;
import X.C221108m2;
import X.C235119Kp;
import X.C252709vu;
import X.C25851ACp;
import X.C48664J8a;
import X.C48665J8b;
import X.C62822Ol8;
import X.C78840Uwu;
import X.C79045V0n;
import X.FMX;
import X.IFM;
import X.IG4;
import X.InterfaceC61213O0r;
import X.KMV;
import X.OSZ;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.pipfeed.PipServiceImpl;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.ss.android.ugc.aweme.setting.page.accessibility.PipSettingUnit;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes9.dex */
public final class PlaybackSettingPage extends BasePage {
    public final boolean LJLJJL;
    public final boolean LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 337));
    public final boolean LJLJJI = PipServiceImpl.LJJII().LJIIJJI();

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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
        return R.layout.ck5;
    }

    public PlaybackSettingPage() {
        boolean z;
        if (IFM.LIZ && !AV1.LJIILLIIL()) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJJL = z;
        this.LJLJJLL = IG4.LIZ();
    }

    public final C25851ACp Al() {
        return (C25851ACp) this.LJLJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.LJLJJI) {
            FMX.LJIILL("enter_playback_page", new OSZ("settings_page", "enter_from"));
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final void wl(Activity activity) {
        C252709vu c252709vu = (C252709vu) activity.findViewById(R.id.la4);
        C235119Kp c235119Kp = new C235119Kp();
        String string = activity.getString(R.string.jc5);
        o.LJIIIIZZ(string, "getString(R.string.openo…ngs_page_header_playback)");
        C78840Uwu.LJJIZ(c235119Kp, string, new AqS158S0100000_8(this, 336));
        c252709vu.setNavActions(c235119Kp);
        c252709vu.LJIILJJIL(false);
        Integer LJI = C79045V0n.LJI(R.attr.c9, activity);
        if (LJI != null) {
            c252709vu.setNavBackground(LJI.intValue());
        }
        Integer LJI2 = C79045V0n.LJI(R.attr.c9, activity);
        if (LJI2 != null) {
            int intValue = LJI2.intValue();
            View view = getView();
            if (view != null) {
                view.setBackgroundColor(intValue);
            }
        }
        if (this.LJLJJI) {
            Al().LIZ(new PipSettingUnit(this));
        }
        if (this.LJLJJI && this.LJLJJL && this.LJLJJLL) {
            C25851ACp Al = Al();
            String string2 = activity.getString(R.string.uz);
            o.LJIIIIZZ(string2, "getString(R.string.Setting_sound_section_title)");
            Al.LIZ(new AEG(new AEB(string2, true, false, false, false, null, null, null, null, null, null, 16380)));
        }
        if (this.LJLJJL) {
            Al().LIZ(new C48664J8a(this));
        }
        if (this.LJLJJLL) {
            Al().LIZ(new C48665J8b(this));
        }
        Al().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity instanceof KMV) {
            ((KMV) mo49getActivity).onActivityResult_Activity(i, i2, intent);
        }
    }
}
