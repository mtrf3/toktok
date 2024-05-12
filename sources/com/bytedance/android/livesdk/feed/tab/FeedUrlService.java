package com.bytedance.android.livesdk.feed.tab;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.BL7;
import X.BMC;
import X.BN3;
import X.BO1;
import X.BO2;
import X.BOX;
import X.C0NB;
import X.C1EW;
import X.C278917p;
import X.C279317t;
import X.C28623BLf;
import X.C28679BNj;
import X.C28791BRr;
import X.C29245Bdp;
import X.C38354F3m;
import X.C39441gi;
import X.C62822Ol8;
import X.C65814PsI;
import X.C73422Sri;
import X.C73969T1h;
import X.Q7L;
import X.T16;
import Y.AfS17S0001000_5;
import Y.AfS36S0101000_5;
import Y.AfS37S0000000_5;
import Y.IDhS10S1100000_5;
import android.text.TextUtils;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.livesdk.feed.api.FollowRecommendApi;
import com.bytedance.android.livesdk.feed.drawerfeed.DrawerFeedLiveFragmentV2;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.android.livesdk.feed.tab.api.FeedTabApi;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.livesetting.feed.FeedDrawMtSetting;
import com.bytedance.android.livesdk.livesetting.model.DrawerLoadOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerLoadOptSetting;
import com.bytedance.android.livesdk.model.ItemTab;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class FeedUrlService implements ILiveFeedApiService {
    public boolean LJLIL;
    public boolean LJLILLLLZI;

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final void ka0() {
        DrawerLoadOpt value = LiveDrawerLoadOptSetting.INSTANCE.getValue();
        if (value != null) {
            if (value.isPreLoadingForuData || value.isPreLoadingGameData) {
                ((Map) BO2.LIZ.getValue()).clear();
                ((Map) BO2.LIZIZ.getValue()).clear();
                BO2.LIZ().clear();
            }
        }
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final C29245Bdp T7() {
        return C29245Bdp.LJ.getValue();
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final AbstractC73672Svk bm0() {
        return ((FollowRecommendApi) Q7L.LIZIZ(FollowRecommendApi.class)).getRecommendList("tiktok_follow_top_rec");
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final void j9() {
        if (this.LJLIL || !this.LJLILLLLZI) {
            return;
        }
        BOX.LJFF().LJIIIZ().LJJJLIIL(new AfS36S0101000_5(0, this, 28), new AfS37S0000000_5(9));
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final C28679BNj nu0() {
        if (C28679BNj.LIZIZ == null) {
            synchronized (C28679BNj.class) {
                if (C28679BNj.LIZIZ == null) {
                    C28679BNj.LIZIZ = new C28679BNj();
                }
            }
        }
        return C28679BNj.LIZIZ;
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final void v3() {
        if (!this.LJLIL && !this.LJLILLLLZI) {
            this.LJLILLLLZI = true;
        }
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final void T90() {
        BOX LJFF = BOX.LJFF();
        if (LJFF.LIZ == null) {
            LJFF.LIZ = (FeedTabApi) Q7L.LIZIZ(FeedTabApi.class);
        }
        LJFF.LIZ.queryTab(0).LJJL(T16.LIZ()).LJJIJL(new C1EW()).LJIJJLI(new AfS36S0101000_5(0, LJFF, 12)).LJJJLIIL(new AfS17S0001000_5(0, 9), new AfS17S0001000_5(0, 10));
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final void e9() {
        AbstractC73672Svk.LJJIJIL(Boolean.valueOf(BOX.LJI(BOX.LJFF().LJ()))).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS17S0001000_5(0, 5));
        C0NB.LJIIIZ("LiveIconGeneratorLog", "feedurlservice#requestTabListForyouPage");
        BOX.LJFF().LJIIIZ().LJJJLIIL(new C39441gi(1, this), new AfS17S0001000_5(1, 7));
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final Map<String, Object> G1(long j) {
        return LIZ(j, BOX.LJFF().LIZJ());
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final Map<String, Object> Ta(long j) {
        return LIZ(j, BOX.LJFF().LJ());
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final AbstractC73672Svk<Object> removeRecommendUser(String str) {
        return ((FollowRecommendApi) Q7L.LIZIZ(FollowRecommendApi.class)).removeRecommendUser(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r0 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZ(long r6, java.util.List r8) {
        /*
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            boolean r0 = X.C32151Nz.LJJIIJZLJL(r8)
            if (r0 == 0) goto Lc
            return r4
        Lc:
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.util.Iterator r5 = r8.iterator()
        L12:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r5.next()
            com.bytedance.android.livesdk.model.ItemTab r0 = (com.bytedance.android.livesdk.model.ItemTab) r0
            if (r0 == 0) goto L12
            long r2 = r0.getId()
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 != 0) goto L12
        L28:
            java.lang.String r2 = "feed_url"
            java.lang.String r1 = r0.getInnerStreamUrl()
            r4.put(r2, r1)
            int r1 = r0.getStyle()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "feed_style"
            r4.put(r1, r2)
            java.lang.String r1 = "feed_name"
            java.lang.String r0 = r0.getName()
            r4.put(r1, r0)
        L47:
            return r4
        L48:
            r0 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r8, r0)
            com.bytedance.android.livesdk.model.ItemTab r0 = (com.bytedance.android.livesdk.model.ItemTab) r0
            if (r0 == 0) goto L47
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.tab.FeedUrlService.LIZ(long, java.util.List):java.util.Map");
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final DrawerFeedLiveFragmentV2 iu0(BL7 bl7, String str) {
        DrawerFeedLiveFragmentV2 drawerFeedLiveFragmentV2 = new DrawerFeedLiveFragmentV2();
        drawerFeedLiveFragmentV2.LJLL = bl7;
        drawerFeedLiveFragmentV2.LJLLL = str;
        return drawerFeedLiveFragmentV2;
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final void lu(ActivityC45651qj activityC45651qj, String str) {
        TabFeedViewModel tabFeedViewModel;
        long j;
        String str2;
        DrawerLoadOpt value = LiveDrawerLoadOptSetting.INSTANCE.getValue();
        if (value != null) {
            if (value.isPreLoadingForuData || value.isPreLoadingGameData) {
                if (BO2.LIZ().get(str) == null) {
                    if (activityC45651qj != null) {
                        TabFeedViewModel tabFeedViewModel2 = (TabFeedViewModel) BO2.LIZ().get(str);
                        if (tabFeedViewModel2 == null) {
                            C62822Ol8 c62822Ol8 = BO2.LIZIZ;
                            BO1 bo1 = (BO1) ((Map) c62822Ol8.getValue()).get(str);
                            if (bo1 == null) {
                                C62822Ol8 c62822Ol82 = BO2.LIZ;
                                BMC bmc = (BMC) ((Map) c62822Ol82.getValue()).get(str);
                                if (bmc == null) {
                                    bmc = new BN3();
                                    ((Map) c62822Ol82.getValue()).put(str, bmc);
                                }
                                bo1 = new BO1(new FeedRepository(bmc, (FeedApi) Q7L.LIZIZ(FeedApi.class), new C278917p(), new C279317t()));
                                ((Map) c62822Ol8.getValue()).put(str, bo1);
                            }
                            List<ItemTab> LIZJ = BOX.LJFF().LIZJ();
                            if (LIZJ != null && ((ArrayList) LIZJ).size() > 0) {
                                j = ((ItemTab) ListProtector.get(LIZJ, 0)).getId();
                            } else {
                                j = 1;
                            }
                            bo1.LIZIZ = j;
                            bo1.LIZJ = new C28791BRr();
                            tabFeedViewModel2 = (TabFeedViewModel) ViewModelProviders.of(activityC45651qj, bo1).get(str, TabFeedViewModel.class);
                            tabFeedViewModel2.pv0();
                            tabFeedViewModel2.qv0();
                            BO2.LIZIZ();
                            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "foru")) {
                                str2 = i0.LJFF("enter_auto_vertical_", str);
                            } else {
                                str2 = "drawer_enter_from_room";
                            }
                            tabFeedViewModel2.LLIIIJ = true ^ C38354F3m.LJ(str2);
                            tabFeedViewModel2.LJLZ.ao0(str2);
                            BO2.LIZ().put(str, tabFeedViewModel2);
                        }
                        tabFeedViewModel2.nv0();
                        return;
                    }
                    return;
                }
                TabFeedViewModel tabFeedViewModel3 = (TabFeedViewModel) BO2.LIZ().get(str);
                if (tabFeedViewModel3 == null) {
                    return;
                }
                tabFeedViewModel3.pv0();
                return;
            }
            if ((!value.isPreLoadingForuUI && !value.isPreLoadingGameUI) || (tabFeedViewModel = (TabFeedViewModel) BO2.LIZ().get(str)) == null) {
                return;
            }
            tabFeedViewModel.pv0();
        }
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final C73422Sri uv(String str, String str2, Map map) {
        String str3 = str2;
        if (str3 == null || str3.length() == 0) {
            str3 = FeedDrawMtSetting.INSTANCE.getValue().getUrl();
            ((HashMap) map).put("channel_id", "21");
        }
        C65814PsI.LIZ().getClass();
        return ((FeedApi) C65814PsI.LIZIZ(FeedApi.class)).feed(str3, 0L, "related_live_refresh", map).LJJIJL(new IDhS10S1100000_5(str, map, 1)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJIJJLI(C28623BLf.LJLIL);
    }
}
