package com.ss.android.ugc.aweme.setting.page.accessibility;

import X.AEB;
import X.AEE;
import X.AEG;
import X.AGD;
import X.AGE;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C2057985v;
import X.C221108m2;
import X.C235119Kp;
import X.C252709vu;
import X.C25849ACn;
import X.C25851ACp;
import X.C35068DpY;
import X.C41032G8m;
import X.C53326KwM;
import X.C53379KxD;
import X.C58604MzI;
import X.C62822Ol8;
import X.C78840Uwu;
import X.C79045V0n;
import X.C85935Xo3;
import X.C85936Xo4;
import X.C85937Xo5;
import X.InterfaceC58304MuS;
import X.InterfaceC61213O0r;
import X.KMV;
import X.LFH;
import Y.ACListenerS23S0100000_3;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;
import yq4.a;

@InterfaceC61213O0r
/* loaded from: classes16.dex */
public final class AccessibilitySettingPage extends BasePage {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 257));

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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
        return R.layout.cjn;
    }

    public final C25851ACp Al() {
        return (C25851ACp) this.LJLJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final void wl(Activity activity) {
        C252709vu c252709vu = (C252709vu) activity.findViewById(R.id.la4);
        C235119Kp c235119Kp = new C235119Kp();
        String string = activity.getString(R.string.a9s);
        o.LJIIIIZZ(string, "getString(R.string.accessibility)");
        C78840Uwu.LJJIZ(c235119Kp, string, new AqS163S0100000_13(this, 256));
        c252709vu.setNavActions(c235119Kp);
        InterfaceC58304MuS smartNetworkService = C58604MzI.LIZIZ.getSmartNetworkService();
        if (smartNetworkService != null && smartNetworkService.LIZIZ()) {
            Al().LIZ(new C85936Xo4(this));
        }
        if (C2057985v.LIZ()) {
            Al().LIZ(new C85937Xo5(getContext()));
        }
        if (!C16880lQ.LLLZLL() && !LFH.LIZIZ.LIZLLL().LJIIJ().LJII()) {
            Al().LIZ(new C25849ACn(this) { // from class: X.8wK
                public final Context LJLJJL;
                public final String LJLJJLL;

                @Override // X.C25849ACn
                /* renamed from: LJIIJJI */
                public final C25848ACm LJIIIIZZ() {
                    return new C25848ACm(C208568Gm.LIZ(), this.LJLJJLL, new ACListenerS23S0100000_3(this, 239), false, null, null, null, null, false, false, false, null, 65528);
                }

                @Override // X.C25849ACn, X.AG6
                public final /* bridge */ /* synthetic */ C25848ACm LJIIIIZZ() {
                    return LJIIIIZZ();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(null);
                    o.LJIIIZ(this, "fragment");
                    this.LJLJJL = this.getContext();
                    String string2 = this.getString(R.string.f24);
                    o.LJIIIIZZ(string2, "fragment.getString(R.string.dynamic_cover)");
                    this.LJLJJLL = string2;
                }
            });
        }
        if (AGD.LIZ() && C53379KxD.LIZ() && !C53326KwM.LIZ() && (!C41032G8m.LIZ())) {
            Al().LIZ(new AGE(this));
        }
        if (((Boolean) C35068DpY.LIZ.getValue()).booleanValue()) {
            Al().LIZ(new AEE());
        }
        if (a.LJFF().LJJIIJZLJL() > 0) {
            String string2 = activity.getString(R.string.jlv);
            o.LJIIIIZZ(string2, "getString(R.string.photo…sitive_settings_category)");
            Al().LIZ(new AEG(new AEB(string2, true, false, false, false, null, null, null, null, null, null, 16380)));
            Al().LIZ(new C85935Xo3(this));
        }
        Integer LJI = C79045V0n.LJI(R.attr.c9, activity);
        if (LJI != null) {
            int intValue = LJI.intValue();
            View view = getView();
            if (view != null) {
                view.setBackgroundColor(intValue);
            }
            ((C252709vu) activity.findViewById(R.id.la4)).setNavBackground(intValue);
        }
        ((C252709vu) activity.findViewById(R.id.la4)).LJIILJJIL(false);
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
