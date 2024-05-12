package com.ss.android.ugc.aweme.setting.unit.privacy;

import X.AEH;
import X.AEI;
import X.AEJ;
import X.ActivityC45651qj;
import X.C188727au;
import X.C221108m2;
import X.C235119Kp;
import X.C252709vu;
import X.C25851ACp;
import X.C58741N3p;
import X.C5H3;
import X.C62822Ol8;
import X.C77150UPq;
import X.C77157UPx;
import X.C77259UTv;
import X.C77266UUc;
import X.C78840Uwu;
import X.C79045V0n;
import X.EnumC77147UPn;
import X.EnumC77154UPu;
import X.FMX;
import X.InterfaceC61213O0r;
import X.QD3;
import X.UPA;
import X.UTK;
import X.UUC;
import X.UUD;
import X.UUE;
import X.UUL;
import X.UUO;
import X.UUP;
import Y.AObserverS81S0100000_13;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bytedance.keva.Keva;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.friends.model.BackFromSettingEvent;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformTokenStatus;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

@InterfaceC61213O0r
/* loaded from: classes14.dex */
public final class FindCtxSettingPage extends BasePage {
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public boolean LJLJL;
    public final C62822Ol8 LJLJLJ;
    public UUD LJLJLLL;
    public UUC LJLL;
    public RemoveContactsUnit LJLLI;
    public RemoveFBFriendsUnit LJLLILLLL;
    public UUE LJLLJ;
    public RemoveMLBBFriendsUnit LJLLL;
    public final Map<Integer, View> LJLLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLL;
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
        return R.layout.ck3;
    }

    public FindCtxSettingPage() {
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLJI = routeArgExtension.optionalArg(this, UUO.LJLIL, "enter_from", String.class);
        this.LJLJJI = routeArgExtension.optionalArg(this, UUL.LJLIL, "is_rec", Integer.class);
        this.LJLJJL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 260));
        this.LJLJJLL = C221108m2.LIZIZ(UUP.LJLIL);
        this.LJLJLJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 259));
    }

    public final FindCtxViewModel Al() {
        return (FindCtxViewModel) this.LJLJJL.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Keva.getRepo("contacts_sync_repo").storeBoolean("contacts_sync_is_removing", false);
        Keva.getRepo("facebook_sync_repo").storeBoolean("facebook_sync_is_removing", false);
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LJLJL) {
            C77266UUc c77266UUc = C77266UUc.LIZIZ;
            boolean z = false;
            if (c77266UUc.LIZJ()) {
                ((UPA) C58741N3p.LIZ(getContext(), UPA.class)).LIZ();
                c77266UUc.LJIIIZ("privacy_setting");
                FindCtxViewModel Al = Al();
                if (Al != null) {
                    Al.gv0(new C77259UTv(new C77157UPx(EnumC77154UPu.SYNC_STATUS, new C77150UPq(true, 0, 0, null, 30)), "contact", z, 4));
                }
            }
            this.LJLJL = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final void vl() {
        Intent intent;
        ActivityC45651qj mo49getActivity;
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null && (intent = mo49getActivity2.getIntent()) != null && (mo49getActivity = mo49getActivity()) != null) {
            mo49getActivity.setResult(-1, intent);
        }
        super.vl();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onBackFromPermissionSettingEvent(BackFromSettingEvent event) {
        o.LJIIIZ(event, "event");
        if (o.LJ("privacy_setting", event.enterFrom)) {
            this.LJLJL = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        EventBus.LIZJ().LJIILJJIL(this);
        String str = (String) this.LJLJI.getValue();
        Integer num = (Integer) this.LJLJJI.getValue();
        C188727au c188727au = new C188727au();
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("enter_from", str);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        c188727au.LIZLLL(i, "is_rec");
        FMX.LJIIL("enter_sync_auth", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C252709vu c252709vu = (C252709vu) view.findViewById(R.id.la4);
        C235119Kp c235119Kp = new C235119Kp();
        UTK utk = UTK.LIZIZ;
        EnumC77147UPn enumC77147UPn = EnumC77147UPn.MLBB;
        Integer LIZLLL = utk.LIZLLL(enumC77147UPn).LIZLLL();
        if (LIZLLL != null && LIZLLL.intValue() != SocialPlatformTokenStatus.STATUS_UNKNOWN.getValue()) {
            LIZLLL.intValue();
            i = R.string.i6u;
        } else {
            i = R.string.vg;
        }
        String string = getString(i);
        o.LJIIIIZZ(string, "getString(getSyncCtxAndFBItemTitle())");
        C78840Uwu.LJJIZ(c235119Kp, string, new AqS163S0100000_13(this, 258));
        c252709vu.setNavActions(c235119Kp);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        Integer LJI = C79045V0n.LJI(R.attr.c9, context);
        if (LJI != null) {
            int intValue = LJI.intValue();
            view.setBackgroundColor(intValue);
            C252709vu c252709vu2 = (C252709vu) view.findViewById(R.id.la4);
            c252709vu2.setNavBackground(intValue);
            c252709vu2.LJIILJJIL(false);
        }
        FindCtxViewModel Al = Al();
        Al.getClass();
        C77266UUc c77266UUc = C77266UUc.LIZIZ;
        Al.LJLIL = c77266UUc.LJIILLIIL().LIZJ();
        Al.LJLILLLLZI = c77266UUc.LJIIJ().LIZJ();
        Al.LJLJI = utk.LIZLLL(enumC77147UPn).LIZ();
        C25851ACp c25851ACp = (C25851ACp) this.LJLJLJ.getValue();
        c25851ACp.LIZ(new AEH());
        UUD uud = new UUD(this);
        this.LJLJLLL = uud;
        c25851ACp.LIZ(uud);
        RemoveContactsUnit removeContactsUnit = new RemoveContactsUnit(this);
        this.LJLLI = removeContactsUnit;
        c25851ACp.LIZ(removeContactsUnit);
        c25851ACp.LIZ(new AEI());
        UUC uuc = new UUC(this);
        this.LJLL = uuc;
        c25851ACp.LIZ(uuc);
        RemoveFBFriendsUnit removeFBFriendsUnit = new RemoveFBFriendsUnit(this);
        this.LJLLILLLL = removeFBFriendsUnit;
        c25851ACp.LIZ(removeFBFriendsUnit);
        Integer LIZLLL2 = utk.LIZLLL(enumC77147UPn).LIZLLL();
        if (LIZLLL2 != null && LIZLLL2.intValue() != SocialPlatformTokenStatus.STATUS_UNKNOWN.getValue()) {
            LIZLLL2.intValue();
            c25851ACp.LIZ(new AEJ());
            UUE uue = new UUE(this);
            this.LJLLJ = uue;
            c25851ACp.LIZ(uue);
            RemoveMLBBFriendsUnit removeMLBBFriendsUnit = new RemoveMLBBFriendsUnit(this);
            this.LJLLL = removeMLBBFriendsUnit;
            c25851ACp.LIZ(removeMLBBFriendsUnit);
        }
        ((C25851ACp) this.LJLJLJ.getValue()).LIZLLL();
        Al().LJLJJI.observe(this, new AObserverS81S0100000_13(this, 49));
        Al().LJLJJL.observe(this, new AObserverS81S0100000_13(this, 50));
        Al().LJLJL.observe(this, new AObserverS81S0100000_13(this, 51));
    }
}
