package com.ss.android.ugc.aweme.notification;

import X.AbstractC030109x;
import X.AbstractC28931Bp;
import X.ActivityC86117Xqz;
import X.C107724Kq;
import X.C10K;
import X.C113554cx;
import X.C116644hw;
import X.C16880lQ;
import X.C221108m2;
import X.C2NU;
import X.C3U3;
import X.C57050MaE;
import X.C57051MaF;
import X.C57053MaH;
import X.C57057MaL;
import X.C57058MaM;
import X.C57059MaN;
import X.C57060MaO;
import X.C57061MaP;
import X.C57062MaQ;
import X.C57065MaT;
import X.C57066MaU;
import X.C57067MaV;
import X.C57068MaW;
import X.C57069MaX;
import X.C57070MaY;
import X.C57071MaZ;
import X.C57072Maa;
import X.C57073Mab;
import X.C57074Mac;
import X.C57075Mad;
import X.C57076Mae;
import X.C57077Maf;
import X.C57078Mag;
import X.C57079Mah;
import X.C57080Mai;
import X.C57081Maj;
import X.C57082Mak;
import X.C57083Mal;
import X.C57084Mam;
import X.C5H3;
import X.C61712OJw;
import X.C61713OJx;
import X.C65803Ps7;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C73379Sr1;
import X.EF7;
import X.EnumC112364b2;
import X.EnumC221088m0;
import X.FMX;
import X.InterfaceC107704Ko;
import X.InterfaceC191547fS;
import X.InterfaceC223218pR;
import X.InterfaceC57085Man;
import X.KL2;
import X.MGN;
import X.MX7;
import X.MXA;
import X.MXP;
import X.ORZ;
import X.OSZ;
import X.QD3;
import Y.ACListenerS29S0100000_9;
import Y.AObserverS77S0100000_9;
import Y.AgS126S0100000_9;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.notification.bean.DiggInfo;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class UserListActivity extends ActivityC86117Xqz implements InterfaceC191547fS, InterfaceC223218pR<DiggInfo>, InterfaceC107704Ko {
    public static final int LLIIII = (int) KL2.LIZJ(EF7.LIZIZ(), 8.0f);
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public final C5H3 LJLJL;
    public final C5H3 LJLJLJ;
    public final C5H3 LJLJLLL;
    public final C5H3 LJLL;
    public final C5H3 LJLLI;
    public final C5H3 LJLLILLLL;
    public final C5H3 LJLLJ;
    public final C5H3 LJLLL;
    public final C5H3 LJLLLL;
    public final C5H3 LJLLLLLL;
    public final C5H3 LJLZ;
    public final C5H3 LJZ;
    public final C5H3 LJZI;
    public final C5H3 LJZL;
    public final C5H3 LL;
    public final C5H3 LLD;
    public final C5H3 LLF;
    public final C5H3 LLFF;
    public final C5H3 LLFFF;
    public final C5H3 LLFII;
    public final C5H3 LLFZ;
    public final C5H3 LLI;
    public List<DiggInfo> LLIFFJFJJ;
    public final Map<Integer, View> LLII = new LinkedHashMap();

    @Override // X.InterfaceC223218pR
    public final void Iw() {
    }

    public final void LLFII() {
        try {
            if (C2NU.LIZ.LIZIZ()) {
                if (LLFZ().getItemCount() == 0) {
                    ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
                    ((C73305Spp) _$_findCachedViewById(R.id.kf_)).LJFF();
                }
                LLIIIILZ().refresh();
                C57050MaE c57050MaE = C57050MaE.LJLIL;
                C57051MaF c57051MaF = C57053MaH.LIZ;
                if (c57051MaF != null) {
                    c57050MaE.invoke(c57051MaF);
                    return;
                }
                return;
            }
        } catch (Exception unused) {
        }
        if (LLFZ().getItemCount() == 0) {
            C10K.LJII(100L).LJ(new AgS126S0100000_9(this, 15), C10K.LJIIIIZZ, null);
        }
        C57053MaH.LIZ = null;
    }

    @Override // X.InterfaceC223218pR
    public final void Qw(Exception exc) {
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLII).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLII;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC223218pR
    public final void jh(List<DiggInfo> list, boolean z) {
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.UserListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public UserListActivity() {
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LJLIL = C221108m2.LIZ(enumC221088m0, new AqS159S0100000_9(this, 358));
        this.LJLILLLLZI = C221108m2.LIZ(enumC221088m0, new AqS159S0100000_9(this, 360));
        this.LJLJI = C221108m2.LIZ(enumC221088m0, new AqS159S0100000_9(this, 359));
        this.LJLJJI = C221108m2.LIZ(enumC221088m0, new AqS159S0100000_9(this, 357));
        this.LJLJJL = C221108m2.LIZ(enumC221088m0, new AqS159S0100000_9(this, 356));
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLJJLL = routeArgExtension.optionalArg(this, C57078Mag.LJLIL, "nid", String.class);
        this.LJLJL = routeArgExtension.optionalArg(this, C57074Mac.LJLIL, "aweme_id", String.class);
        this.LJLJLJ = routeArgExtension.optionalArg(this, C57079Mah.LJLIL, "ref_id", String.class);
        this.LJLJLLL = routeArgExtension.optionalArgNotNull(this, C57060MaO.LJLIL, "digg_type", Integer.class);
        this.LJLL = routeArgExtension.optionalArgNotNull(this, C57059MaN.LJLIL, "biz_type", Integer.class);
        this.LJLLI = routeArgExtension.optionalArgNotNull(this, C57077Maf.LJLIL, "is_new", Boolean.class);
        this.LJLLILLLL = routeArgExtension.optionalArgNotNull(this, C57062MaQ.LJLIL, "last_read_time", Long.class);
        this.LJLLJ = routeArgExtension.optionalArg(this, C57080Mai.LJLIL, "second_title", String.class);
        this.LJLLL = routeArgExtension.optionalArg(this, C57075Mad.LJLIL, "cover", UrlModel.class);
        this.LJLLLL = routeArgExtension.optionalArg(this, C57076Mae.LJLIL, "cover_url", String.class);
        this.LJLLLLLL = routeArgExtension.optionalArg(this, C57081Maj.LJLIL, "tab_name", String.class);
        this.LJLZ = routeArgExtension.optionalArg(this, C57061MaP.LJLIL, "is_favorite", Integer.class);
        this.LJZ = routeArgExtension.optionalArgNotNull(this, C57073Mab.LJLIL, "is_story", Boolean.class);
        this.LJZI = routeArgExtension.optionalArg(this, C57069MaX.LJLIL, "sub_type", String.class);
        this.LJZL = routeArgExtension.optionalArg(this, C57070MaY.LJLIL, "author_id", String.class);
        this.LL = routeArgExtension.optionalArg(this, C57072Maa.LJLIL, "follow_status", Integer.class);
        this.LLD = routeArgExtension.optionalArg(this, C57083Mal.LJLIL, "title", String.class);
        this.LLF = routeArgExtension.optionalArg(this, C57067MaV.LJLIL, "account_type", String.class);
        this.LLFF = routeArgExtension.optionalArg(this, C57071MaZ.LJLIL, "topic", Long.class);
        this.LLFFF = routeArgExtension.optionalArg(this, C57084Mam.LJLIL, "pass_through", String.class);
        this.LLFII = routeArgExtension.optionalArg(this, C57068MaW.LJLIL, "sort_option_name", String.class);
        this.LLFZ = routeArgExtension.optionalArg(this, C57082Mak.LJLIL, "notification_tab_name", String.class);
        this.LLI = routeArgExtension.optionalArg(this, C57065MaT.LJLIL, "inbox_log_extra", HashMap.class);
    }

    public final MX7 LLFZ() {
        return (MX7) this.LJLIL.getValue();
    }

    public final String LLII() {
        return (String) this.LJLJL.getValue();
    }

    public final InterfaceC57085Man LLIIIILZ() {
        return (InterfaceC57085Man) this.LJLILLLLZI.getValue();
    }

    public final int LLIIIJ() {
        return ((Number) this.LJLJJL.getValue()).intValue();
    }

    @Override // X.InterfaceC107704Ko
    public final C107724Kq getActivityStatusParams() {
        C107724Kq c107724Kq = new C107724Kq(this);
        c107724Kq.LIZIZ = EnumC112364b2.LIKE_NOTIFICATION_SUBPAGE;
        c107724Kq.LIZLLL = "notification_page";
        LLIIIJ();
        return c107724Kq;
    }

    @Override // X.InterfaceC223218pR
    public final void LJII() {
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).LJFF();
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        LLIIIILZ().LJIIJJI();
    }

    @Override // X.InterfaceC223218pR
    public final void Ne() {
        if (LLIIIJ() == 17) {
            ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
            C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.kf_);
            C73306Spq c73306Spq = new C73306Spq();
            String string = getString(R.string.it6);
            o.LJIIIIZZ(string, "getString(R.string.no_vi…ection_error_description)");
            c73306Spq.LJFF = string;
            c73305Spp.setStatus(c73306Spq);
            return;
        }
        if (LLFZ().mShowFooter) {
            LLFZ().setShowFooter(false);
            LLFZ().notifyDataSetChanged();
            LLFZ().showLoadMoreEmpty();
            LLFZ().setShowFooter(false);
        }
        if (LLFZ().getItemCount() == 0) {
            ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
            C73305Spp c73305Spp2 = (C73305Spp) _$_findCachedViewById(R.id.kf_);
            C73306Spq c73306Spq2 = new C73306Spq();
            String string2 = getString(R.string.h6i);
            o.LJIIIIZZ(string2, "getString(R.string.im_like_list_empty_title)");
            c73306Spq2.LJFF = string2;
            String string3 = getString(R.string.h6h);
            o.LJIIIIZZ(string3, "getString(R.string.im_like_list_empty_desc)");
            c73306Spq2.LJI = string3;
            c73305Spp2.setStatus(c73306Spq2);
        }
        C57053MaH.LIZ(0);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        LLIIIILZ().LIZIZ();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // X.InterfaceC223218pR
    public final void showLoadMoreLoading() {
        LLFZ().showLoadMoreLoading();
    }

    @Override // X.InterfaceC223218pR
    public final void cb0(Exception exc) {
        if (LLFZ().mShowFooter) {
            LLFZ().setShowFooter(false);
            LLFZ().notifyDataSetChanged();
        }
        if (LLFZ().getItemCount() == 0) {
            ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
            MGN mgn = MGN.LJLILLLLZI;
            if (mgn.isStandardUIEnable()) {
                C73305Spp status_view = (C73305Spp) _$_findCachedViewById(R.id.kf_);
                o.LJIIIIZZ(status_view, "status_view");
                mgn.setStatusView(status_view, "inbox_like_list", new C57057MaL(this), exc);
                mgn.triggerNetworkTips(this, "inbox_like_list", exc, (C73305Spp) _$_findCachedViewById(R.id.kf_));
            } else {
                C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.kf_);
                C73306Spq c73306Spq = new C73306Spq();
                C73312Spw.LJI(c73306Spq, new C57058MaM(this));
                c73305Spp.setStatus(c73306Spq);
            }
        }
        C57053MaH.LIZ(0);
    }

    @Override // X.InterfaceC223218pR
    public final void nc(Exception exc) {
        LLFZ().showPullUpLoadMore();
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Integer num;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.UserListActivity", "onCreate", true);
        activityConfiguration(C57066MaU.LJLIL);
        super.onCreate(bundle);
        C57053MaH.LIZIZ(MXP.DETAIL_TYPE_LIKE_LIST, ((Number) this.LJLJLLL.getValue()).intValue(), (String) this.LJLJJLL.getValue());
        setContentView(R.layout.rk);
        Object value = this.LJLJI.getValue();
        String str = null;
        if ((!o.LJ(value, -1)) && value != null) {
            if (value instanceof String) {
                str = (String) value;
            }
            if (str != null) {
                TextView title_text = (TextView) _$_findCachedViewById(R.id.lai);
                o.LJIIIIZZ(title_text, "title_text");
                title_text.setText(str);
            }
            if ((value instanceof Integer) && (num = (Integer) value) != null) {
                TextView title_text2 = (TextView) _$_findCachedViewById(R.id.lai);
                o.LJIIIIZZ(title_text2, "title_text");
                title_text2.setText(num.intValue());
            }
        }
        AbstractC030109x itemAnimator = ((RecyclerView) _$_findCachedViewById(R.id.h5k)).getItemAnimator();
        o.LJII(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((AbstractC28931Bp) itemAnimator).LJI = false;
        ((RecyclerView) _$_findCachedViewById(R.id.h5k)).setLayoutManager(new LinearLayoutManager());
        ((RecyclerView) _$_findCachedViewById(R.id.h5k)).LJII(new C116644hw(1, (int) KL2.LIZJ(this, 1.0f), 0), -1);
        ((RecyclerView) _$_findCachedViewById(R.id.h5k)).LJIIJJI(new C73379Sr1(this));
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.aej), new ACListenerS29S0100000_9(this, 190));
        String LLII = LLII();
        if (LLII == null || LLII.length() == 0) {
            LLFZ().LJLJL = false;
        } else {
            LLFZ().LJLJI = (UrlModel) this.LJLLL.getValue();
            LLFZ().LJLJJI = (String) this.LJLLLL.getValue();
            LLFZ().LJLJJL = (String) this.LJLLJ.getValue();
            MX7 LLFZ = LLFZ();
            AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(this, 1021);
            LLFZ.getClass();
            LLFZ.LJLJJLL = aqS159S0100000_9;
        }
        LLFZ().setLoadMoreListener(this);
        LLFZ().setShowFooter(true);
        LLFZ().showLoadMoreEmpty();
        ((RecyclerView) _$_findCachedViewById(R.id.h5k)).setAdapter(LLFZ());
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).LJFF();
        LLFZ().registerAdapterDataObserver(new MXA(this));
        LLFII();
        UserService.LIZ().LJFF().observe(this, new AObserverS77S0100000_9(this, 32));
        FMX.LJIIL("enter_social_interaction", C113554cx.LJJLIIIIJ(new OSZ("enter_from", "notification_page")));
        EventBus.LIZJ().LJIILJJIL(this);
        C61713OJx LIZJ = C61712OJw.LIZJ(this);
        LIZJ.LJII(R.attr.cl);
        LIZJ.LJ(R.attr.cl);
        LIZJ.LIZ(true);
        LIZJ.LIZJ();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.UserListActivity", "onCreate", false);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onRefreshMessageButton(C3U3 event) {
        o.LJIIIZ(event, "event");
        LLFZ().notifyDataSetChanged();
    }

    @Override // X.InterfaceC223218pR
    public final void J5(List<DiggInfo> list, boolean z) {
        int i;
        List arrayList;
        this.LLIFFJFJJ = list;
        LLFZ().setShowFooter(true);
        int i2 = 0;
        if (!z) {
            LLFZ().showLoadMoreEmpty();
            LLFZ().setShowFooter(false);
        } else {
            LLFZ().resetLoadMoreState();
        }
        if (LLIIIILZ().LJIIZILJ() == 0) {
            i = LLIIII;
        } else {
            i = 0;
        }
        _$_findCachedViewById(R.id.h58).setPadding(0, i, 0, 0);
        LLFZ().LJLILLLLZI = LLIIIILZ().LJIIZILJ();
        MX7 LLFZ = LLFZ();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (DiggInfo diggInfo : list) {
                if (diggInfo.user != null) {
                    arrayList2.add(diggInfo);
                }
            }
            arrayList = ORZ.LLJILJILJ(arrayList2);
        } else {
            arrayList = new ArrayList();
        }
        LLFZ.setData(arrayList);
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(8);
        if (list != null) {
            i2 = list.size();
        }
        C57053MaH.LIZ(i2);
    }

    @Override // X.InterfaceC223218pR
    public final void j0(List<DiggInfo> list, boolean z) {
        List arrayList;
        if (list == null || list.isEmpty() || !z) {
            LLFZ().showLoadMoreEmpty();
            LLFZ().setShowFooter(false);
        } else {
            LLFZ().resetLoadMoreState();
        }
        LLFZ().LJLILLLLZI = LLIIIILZ().LJIIZILJ();
        MX7 LLFZ = LLFZ();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (DiggInfo diggInfo : list) {
                if (diggInfo.user != null) {
                    arrayList2.add(diggInfo);
                }
            }
            arrayList = ORZ.LLJILJILJ(arrayList2);
        } else {
            arrayList = new ArrayList();
        }
        LLFZ.addData(arrayList);
        this.LLIFFJFJJ = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIIZ(com.ss.android.ugc.aweme.profile.model.User r8, int r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.UserListActivity.LLIIIZ(com.ss.android.ugc.aweme.profile.model.User, int, java.lang.String):void");
    }
}
