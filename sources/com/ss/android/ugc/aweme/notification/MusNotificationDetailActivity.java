package com.ss.android.ugc.aweme.notification;

import X.AbstractC57014MZe;
import X.ActivityC86117Xqz;
import X.C10K;
import X.C113554cx;
import X.C16880lQ;
import X.C221018lt;
import X.C221108m2;
import X.C252709vu;
import X.C2NU;
import X.C56729MOf;
import X.C57015MZf;
import X.C57016MZg;
import X.C57019MZj;
import X.C57050MaE;
import X.C57051MaF;
import X.C57053MaH;
import X.C57111MbD;
import X.C5H3;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C73318Sq2;
import X.C9NE;
import X.FMX;
import X.InterfaceC03360Bg;
import X.InterfaceC191547fS;
import X.InterfaceC223218pR;
import X.InterfaceC45040Hm0;
import X.InterfaceC56810MRi;
import X.MGN;
import X.MZA;
import X.MZI;
import X.MZJ;
import X.MZL;
import X.MZN;
import X.MZO;
import X.OSZ;
import X.QD3;
import X.X1D;
import Y.ARunnableS45S0100000_9;
import Y.AgS126S0100000_9;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.UnsubscribeSettingMetadata;
import com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg;
import com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel;
import com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM;
import com.ss.android.ugc.aweme.notification.vm.SubscribeSettingVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class MusNotificationDetailActivity extends ActivityC86117Xqz implements InterfaceC03360Bg, InterfaceC191547fS, InterfaceC223218pR<BaseNotice>, InterfaceC45040Hm0, InterfaceC56810MRi {
    public AbstractC57014MZe LJLJI;
    public MZI LJLJJI;
    public MZI LJLJJL;
    public MZJ LJLJJLL;
    public MusNewNotificationModel LJLJLJ;
    public C57111MbD LJLJLLL;
    public boolean LJLLILLLL;
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();
    public final C5H3 LJLIL = RouteArgExtension.INSTANCE.navArg(this);
    public final MZL LJLILLLLZI = MZL.LIZ;
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(C57019MZj.LJLIL);
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 342));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(C57016MZg.LJLIL);
    public long LJLLJ = -1;
    public String LJLLL = "close";
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 341));

    @Override // X.InterfaceC223218pR
    public final void Iw() {
    }

    @Override // X.InterfaceC03360Bg
    public final void LJ() {
        boolean z;
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            MZJ mzj = this.LJLJJLL;
            if (mzj != null) {
                if (mzj.getItemCount() == 0) {
                    ((C73305Spp) _$_findCachedViewById(R.id.kf_)).LJFF();
                    ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
                }
                LLFZ().LJIILL(1, Integer.valueOf(LLFII().groupType), null, Boolean.valueOf(LLFII().mergeTikTokShop));
                ((Set) ((NotificationDetailVM) this.LJLL.getValue()).LJLIL.getValue()).clear();
                C57050MaE c57050MaE = C57050MaE.LJLIL;
                C57051MaF c57051MaF = C57053MaH.LIZ;
                if (c57051MaF != null) {
                    c57050MaE.invoke(c57051MaF);
                    return;
                }
                return;
            }
            o.LJIJI("mAdapter");
            throw null;
        }
        MZJ mzj2 = this.LJLJJLL;
        if (mzj2 != null) {
            if (mzj2.getItemCount() == 0) {
                C10K.LJII(100L).LJ(new AgS126S0100000_9(this, 6), C10K.LJIIIIZZ, null);
            }
            C57053MaH.LIZ = null;
            return;
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    @Override // X.InterfaceC223218pR
    public final void LJII() {
    }

    @Override // X.InterfaceC223218pR
    public final void Qw(Exception exc) {
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLLLL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLLLL;
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
    public final void jh(List<BaseNotice> list, boolean z) {
    }

    @Override // X.InterfaceC56810MRi
    public final void onItemLongClick(int i) {
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

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final MusNotificationDetailArg LLFII() {
        MusNotificationDetailArg musNotificationDetailArg = (MusNotificationDetailArg) this.LJLIL.getValue();
        if (musNotificationDetailArg == null) {
            return new MusNotificationDetailArg(0, 0, null, null, null, false, 0L, null, 255, null);
        }
        return musNotificationDetailArg;
    }

    public final C56729MOf LLFZ() {
        return (C56729MOf) this.LJLJL.getValue();
    }

    public final MZA LLII() {
        String str;
        LLFII();
        String str2 = LLFII().title;
        String str3 = LLFII().tabName;
        String str4 = LLFII().enterFrom;
        if (LLFII().mergeTikTokShop) {
            str = "shop_info";
        } else {
            str = null;
        }
        MZA mza = new MZA(str2, str3, str4, str);
        NotificationDetailVM notificationDetailVM = (NotificationDetailVM) this.LJLL.getValue();
        o.LJIIIZ(notificationDetailVM, "<set-?>");
        mza.LIZ = notificationDetailVM;
        return mza;
    }

    @Override // X.InterfaceC223218pR
    public final void Ne() {
        MZJ mzj = this.LJLJJLL;
        if (mzj != null) {
            if (mzj.mShowFooter) {
                mzj.setShowFooter(false);
                MZJ mzj2 = this.LJLJJLL;
                if (mzj2 != null) {
                    mzj2.notifyDataSetChanged();
                    showLoadMoreEmpty();
                } else {
                    o.LJIJI("mAdapter");
                    throw null;
                }
            }
            ((SwipeRefreshLayout) _$_findCachedViewById(R.id.h5v)).setRefreshing(false);
            MZJ mzj3 = this.LJLJJLL;
            if (mzj3 != null) {
                if (mzj3.getItemCount() == 0) {
                    C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.kf_);
                    C73306Spq c73306Spq = new C73306Spq();
                    MZI mzi = this.LJLJJI;
                    if (mzi != null) {
                        c73306Spq.LIZJ(mzi.LIZIZ());
                        MZI mzi2 = this.LJLJJI;
                        if (mzi2 != null) {
                            mzi2.LIZJ();
                            c73306Spq.LJI = "";
                            c73305Spp.setStatus(c73306Spq);
                            ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
                        } else {
                            o.LJIJI("mDetailProxy");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mDetailProxy");
                        throw null;
                    }
                }
                C57053MaH.LIZ(0);
                return;
            }
            o.LJIJI("mAdapter");
            throw null;
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    @Override // X.InterfaceC45040Hm0
    public final Analysis getAnalysis() {
        String str;
        Analysis analysis = new Analysis();
        int i = LLFII().groupType;
        if (i != 2) {
            if (i != 3) {
                if (i != 6) {
                    str = "fans";
                } else {
                    str = "at";
                }
            } else {
                str = "like";
            }
        } else {
            str = "comment";
        }
        analysis.setLabelName(str);
        o.LJIIIIZZ(analysis, "Analysis().setLabelName(getEnterFrom())");
        return analysis;
    }

    public final void showLoadMoreEmpty() {
        MZJ mzj = this.LJLJJLL;
        if (mzj != null) {
            mzj.showLoadMoreEmpty();
            MZJ mzj2 = this.LJLJJLL;
            if (mzj2 != null) {
                mzj2.setShowFooter(false);
                return;
            } else {
                o.LJIJI("mAdapter");
                throw null;
            }
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    @Override // X.InterfaceC223218pR
    public final void showLoadMoreLoading() {
        MZJ mzj = this.LJLJJLL;
        if (mzj != null) {
            mzj.showLoadMoreLoading();
        } else {
            o.LJIJI("mAdapter");
            throw null;
        }
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        LLFZ().LJIILL(4, Integer.valueOf(LLFII().groupType), null, Boolean.valueOf(LLFII().mergeTikTokShop));
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        String str;
        super.onBackPressed();
        this.LJLLL = "return";
        Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
        if (LLJJIJI != null) {
            str = LLJJIJI.getString("lastActivity");
        } else {
            str = null;
        }
        if (o.LJ("main", str)) {
            FMX.LJIIL("enter_homepage_message_navi", C113554cx.LJJLIIIIJ(new OSZ("enter_from", "notification_page"), new OSZ("enter_method", "click_back"), new OSZ("from_inbox_page", "system_notification")));
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        LLFZ().LIZIZ();
        ((C73318Sq2) this.LJLLI.getValue()).dispose();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity", "onStart", true);
        super.onStart();
        this.LJLLL = "close";
        this.LJLLJ = SystemClock.elapsedRealtime();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity", "onStart", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (LLFII().mergeTikTokShop && LLFII().groupType == 210 && this.LJLLJ != -1) {
            _$_findCachedViewById(R.id.h5k).post(new ARunnableS45S0100000_9(this, 85));
        }
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
    public final void cb0(Exception exc) {
        MZJ mzj = this.LJLJJLL;
        if (mzj != null) {
            if (mzj.mShowFooter) {
                mzj.setShowFooter(false);
                MZJ mzj2 = this.LJLJJLL;
                if (mzj2 != null) {
                    mzj2.notifyDataSetChanged();
                } else {
                    o.LJIJI("mAdapter");
                    throw null;
                }
            }
            ((SwipeRefreshLayout) _$_findCachedViewById(R.id.h5v)).setRefreshing(false);
            MZJ mzj3 = this.LJLJJLL;
            if (mzj3 != null) {
                if (mzj3.getItemCount() == 0) {
                    ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
                    MGN mgn = MGN.LJLILLLLZI;
                    if (mgn.isStandardUIEnable()) {
                        C73305Spp status_view = (C73305Spp) _$_findCachedViewById(R.id.kf_);
                        o.LJIIIIZZ(status_view, "status_view");
                        mgn.setStatusView(status_view, "inbox_notification_detail", new MZN(this), exc);
                        mgn.triggerNetworkTips(this, "inbox_notification_detail", exc, (C73305Spp) _$_findCachedViewById(R.id.kf_));
                    } else {
                        C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.kf_);
                        C73306Spq c73306Spq = new C73306Spq();
                        C73312Spw.LJI(c73306Spq, new MZO(this));
                        c73305Spp.setStatus(c73306Spq);
                    }
                }
                C57053MaH.LIZ(0);
                return;
            }
            o.LJIJI("mAdapter");
            throw null;
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    @Override // X.InterfaceC223218pR
    public final void nc(Exception exc) {
        MZJ mzj = this.LJLJJLL;
        if (mzj != null) {
            mzj.showPullUpLoadMore();
        } else {
            o.LJIJI("mAdapter");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0269  */
    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.InterfaceC56810MRi
    public final void onItemClick(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onItemClick:");
        LIZ.append(i);
        C221018lt.LIZ("NotificationDetail", X1D.LIZIZ(LIZ));
        this.LJLLL = "next";
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSwitchBusinessAccountSuccessEvent(C9NE c9ne) {
        finish();
    }

    @Override // X.InterfaceC223218pR
    public final void J5(List<BaseNotice> list, boolean z) {
        MZJ mzj = this.LJLJJLL;
        if (mzj != null) {
            mzj.setShowFooter(true);
            int i = 0;
            if (this.LJLLILLLL) {
                MZJ mzj2 = this.LJLJJLL;
                if (mzj2 != null) {
                    mzj2.LJLJJI = 0;
                } else {
                    o.LJIJI("mAdapter");
                    throw null;
                }
            }
            if (!z) {
                showLoadMoreEmpty();
            } else {
                MZJ mzj3 = this.LJLJJLL;
                if (mzj3 != null) {
                    mzj3.resetLoadMoreState();
                } else {
                    o.LJIJI("mAdapter");
                    throw null;
                }
            }
            MusNewNotificationModel musNewNotificationModel = this.LJLJLJ;
            if (musNewNotificationModel != null) {
                UnsubscribeSettingMetadata unsubscribeSettingMetadata = musNewNotificationModel.unsubscribeSetting;
                if (unsubscribeSettingMetadata != null && unsubscribeSettingMetadata.hasUnsubscribeSetting) {
                    C57111MbD c57111MbD = this.LJLJLLL;
                    if (c57111MbD != null) {
                        ((SubscribeSettingVM) c57111MbD.LJFF.getValue()).gv0(c57111MbD.LIZIZ);
                        ((C252709vu) _$_findCachedViewById(R.id.l_2)).LJIJ("gear", C57015MZf.LJLIL);
                    } else {
                        o.LJIJI("mSubscribeSettingHelper");
                        throw null;
                    }
                }
                ((SwipeRefreshLayout) _$_findCachedViewById(R.id.h5v)).setRefreshing(false);
                MZJ mzj4 = this.LJLJJLL;
                if (mzj4 != null) {
                    mzj4.setData(list);
                    ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(8);
                    if (!this.LJLLILLLL && LLFII().mergeTikTokShop && LLFII().groupType == 210) {
                        _$_findCachedViewById(R.id.h5k).post(new ARunnableS45S0100000_9(this, 84));
                    }
                    this.LJLLILLLL = true;
                    if (list != null) {
                        i = list.size();
                    }
                    C57053MaH.LIZ(i);
                    return;
                }
                o.LJIJI("mAdapter");
                throw null;
            }
            o.LJIJI("mNoticeModel");
            throw null;
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    @Override // X.InterfaceC223218pR
    public final void j0(List<BaseNotice> list, boolean z) {
        if (list == null || list.isEmpty()) {
            z = false;
        }
        if (!z) {
            showLoadMoreEmpty();
        } else {
            MZJ mzj = this.LJLJJLL;
            if (mzj != null) {
                mzj.resetLoadMoreState();
            } else {
                o.LJIJI("mAdapter");
                throw null;
            }
        }
        MZJ mzj2 = this.LJLJJLL;
        if (mzj2 != null) {
            mzj2.setDataAfterLoadMore(list);
        } else {
            o.LJIJI("mAdapter");
            throw null;
        }
    }
}
