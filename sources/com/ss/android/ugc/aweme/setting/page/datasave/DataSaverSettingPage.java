package com.ss.android.ugc.aweme.setting.page.datasave;

import X.C221108m2;
import X.C235119Kp;
import X.C252709vu;
import X.C25851ACp;
import X.C62822Ol8;
import X.C78840Uwu;
import X.C79045V0n;
import X.FMX;
import X.InterfaceC61213O0r;
import X.ViewOnClickListenerC48667J8d;
import X.ViewOnClickListenerC48681J8r;
import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.net.mutli.network.SpeedModeServiceImpl;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes9.dex */
public final class DataSaverSettingPage extends BasePage {
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 333));
    public final String LJLJJI = "enter_data_use";

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
        return R.layout.ck0;
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final void wl(Activity activity) {
        int i;
        boolean LJFF = SpeedModeServiceImpl.LJII().LJFF();
        if (!LJFF) {
            i = R.string.eed;
        } else {
            i = R.string.cj_;
        }
        C252709vu c252709vu = (C252709vu) activity.findViewById(R.id.la4);
        C235119Kp c235119Kp = new C235119Kp();
        String string = activity.getString(i);
        o.LJIIIIZZ(string, "getString(titleRes)");
        C78840Uwu.LJJIZ(c235119Kp, string, new AqS158S0100000_8(this, 332));
        c252709vu.setNavActions(c235119Kp);
        if (LJFF) {
            ((C25851ACp) this.LJLJI.getValue()).LIZ(new ViewOnClickListenerC48681J8r(this));
        }
        ((C25851ACp) this.LJLJI.getValue()).LIZ(new ViewOnClickListenerC48667J8d(this));
        FMX.onEventV3(this.LJLJJI);
        Integer LJI = C79045V0n.LJI(R.attr.c9, activity);
        o.LJI(LJI);
        int intValue = LJI.intValue();
        View view = getView();
        if (view != null) {
            view.setBackgroundColor(intValue);
        }
        C252709vu c252709vu2 = (C252709vu) activity.findViewById(R.id.la4);
        c252709vu2.setNavBackground(intValue);
        c252709vu2.LJIILJJIL(false);
        ((C25851ACp) this.LJLJI.getValue()).LIZLLL();
    }
}
