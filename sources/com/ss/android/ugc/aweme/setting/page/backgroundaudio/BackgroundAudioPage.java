package com.ss.android.ugc.aweme.setting.page.backgroundaudio;

import X.AEB;
import X.AEG;
import X.C188727au;
import X.C221108m2;
import X.C235119Kp;
import X.C252709vu;
import X.C25851ACp;
import X.C62822Ol8;
import X.C78840Uwu;
import X.FMX;
import X.ILC;
import X.ILF;
import X.InterfaceC61213O0r;
import X.J87;
import X.J88;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes9.dex */
public final class BackgroundAudioPage extends BasePage {
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 331));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 330));

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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
        return R.layout.cl_;
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final void vl() {
        String str;
        String str2;
        super.vl();
        Boolean value = ((BGAudioViewModel) this.LJLJI.getValue()).LJLIL.getValue();
        ILC value2 = ((BGAudioViewModel) this.LJLJI.getValue()).LJLILLLLZI.getValue();
        if (value != null) {
            if (value.booleanValue()) {
                str = "on";
            } else {
                str = "off";
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "settings_page");
            c188727au.LJIIIZ("status", str);
            if (value2 != null) {
                str2 = value2.toMobString();
            } else {
                str2 = null;
            }
            c188727au.LJIIIZ("play_order", str2);
            FMX.LJIIL("background_audio_status", c188727au.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final void wl(Activity activity) {
        C25851ACp c25851ACp = (C25851ACp) this.LJLJJI.getValue();
        c25851ACp.LIZ(new J88(this));
        String string = activity.getString(R.string.bv1);
        o.LJIIIIZZ(string, "getString(R.string.audio…setting_play_order_title)");
        c25851ACp.LIZ(new AEG(new AEB(string, false, false, false, false, null, null, null, null, null, null, 16382)));
        c25851ACp.LIZ(new J87(this, ILF.PLAY_IN_ORDER));
        c25851ACp.LIZ(new J87(this, ILF.REPEAT));
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C252709vu c252709vu = (C252709vu) view.findViewById(R.id.la4);
        C235119Kp c235119Kp = new C235119Kp();
        C78840Uwu.LJJIZ(c235119Kp, "", new AqS158S0100000_8(this, 329));
        c252709vu.setNavActions(c235119Kp);
    }
}
