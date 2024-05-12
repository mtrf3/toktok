package com.bytedance.android.livesdk.feed.repository;

import X.AbstractC18980oo;
import X.BJB;
import X.BJL;
import X.BMC;
import X.BME;
import X.BMG;
import X.BMM;
import X.BTJ;
import X.BZI;
import X.C06530Nl;
import X.C08680Vs;
import X.C0TQ;
import X.C0YD;
import X.C19050ov;
import X.C19170p7;
import X.C1MU;
import X.C278917p;
import X.C279317t;
import X.C28246B6s;
import X.C28635BLr;
import X.C28787BRn;
import X.C29049Baf;
import X.C32211Of;
import X.C38354F3m;
import X.C73893SzJ;
import X.C76143TuV;
import X.EnumC28634BLq;
import X.InterfaceC006000q;
import X.InterfaceC006200s;
import Y.AObserverS64S0101000_14;
import Y.AfS17S0001000_5;
import Y.AfS18S0001000_6;
import Y.AfS25S0110000_5;
import Y.AfS36S0101000_5;
import Y.AfS37S0000000_5;
import android.text.TextUtils;
import android.util.Pair;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class FeedRepository extends BaseFeedRepository implements BMM {
    public final FeedApi LJLJLJ;
    public final InterfaceC006000q<FeedDataKey, FeedExtra> LJLJLLL;
    public BMG LJLL;
    public C28635BLr LJLLI;
    public String LJLLILLLL;
    public final C73893SzJ<Object> LJLLJ;
    public final C73893SzJ<String> LJLLL;
    public final C73893SzJ<List<ImageModel>> LJLLLL;
    public final C73893SzJ<Pair<String, String>> LJLLLLLL;
    public final C73893SzJ<String> LJLZ;
    public long LJZ;

    @Override // X.BMM
    public final void L70() {
    }

    @Override // com.bytedance.android.livesdk.feed.repository.BaseFeedRepository, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.feed.repository.BaseFeedRepository
    public final FeedDataKey LIZJ() {
        BMG bmg = this.LJLL;
        if (bmg != null) {
            BaseFeedDataViewModel baseFeedDataViewModel = ((BME) bmg).LIZ;
            if (baseFeedDataViewModel.LLFII == null) {
                baseFeedDataViewModel.LLFII = baseFeedDataViewModel.iv0();
            }
            return baseFeedDataViewModel.LLFII;
        }
        throw new IllegalStateException("not call init() or params be null");
    }

    @Override // X.InterfaceC28629BLl
    public final void pV() {
        this.LJLJL.LIZJ(LIZJ());
        if (this.LJLJJLL != null) {
            C08680Vs.LJIILJJIL.LJIIIZ();
            this.LJLJJLL.LJ.onNext(BTJ.LIZJ);
        }
    }

    @Override // X.BMM
    public final C73893SzJ lG() {
        return this.LJLLLL;
    }

    @Override // X.BMM
    public final BMC yo() {
        return this.LJLJJL;
    }

    @Override // X.BMM
    public final void ZG(BME bme) {
        this.LJLL = bme;
    }

    @Override // X.BMM
    public final void ao0(String str) {
        this.LJLLILLLL = str;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.bytedance.android.livesdk.feed.feed.FeedDataKey, CacheKey] */
    @Override // X.BMM
    public final C0TQ<FeedItem> lq0(String str) {
        String str2;
        int i;
        int i2;
        int i3;
        InterfaceC006000q<FeedDataKey, FeedExtra> interfaceC006000q = this.LJLJLLL;
        BaseFeedDataViewModel baseFeedDataViewModel = ((BME) this.LJLL).LIZ;
        if (baseFeedDataViewModel.LLFII == null) {
            baseFeedDataViewModel.LLFII = baseFeedDataViewModel.iv0();
        }
        this.LJLIL.LIZ(interfaceC006000q.LIZIZ(baseFeedDataViewModel.LLFII).LJJJJZI(new AfS17S0001000_5(1, 13)));
        FeedApi feedApi = this.LJLJLJ;
        BMC bmc = this.LJLJJL;
        C73893SzJ<Pair<String, String>> c73893SzJ = this.LJLLLLLL;
        C73893SzJ<String> c73893SzJ2 = this.LJLZ;
        C73893SzJ<String> c73893SzJ3 = this.LJLLL;
        if (!C38354F3m.LJ(this.LJLLILLLL)) {
            str2 = this.LJLLILLLL;
        } else {
            str2 = "enter_auto";
        }
        this.LJLLI = new C28635BLr(str, feedApi, bmc, c73893SzJ, this, c73893SzJ2, c73893SzJ3, str2, this.LJLLLL);
        final C0YD c0yd = new C0YD();
        c0yd.LJIILL = this.LJLLI;
        BaseFeedDataViewModel baseFeedDataViewModel2 = ((BME) this.LJLL).LIZ;
        if (baseFeedDataViewModel2.LLFII == null) {
            baseFeedDataViewModel2.LLFII = baseFeedDataViewModel2.iv0();
        }
        c0yd.LJIIJJI = baseFeedDataViewModel2.LLFII;
        InterfaceC006200s interfaceC006200s = this.LJLJL;
        InterfaceC006000q interfaceC006000q2 = this.LJLJLLL;
        c0yd.LJIIL = interfaceC006200s;
        c0yd.LJIILIIL = interfaceC006000q2;
        C19170p7 c19170p7 = new C19170p7();
        c19170p7.LIZLLL = false;
        BMG bmg = this.LJLL;
        int i4 = 12;
        if (bmg == null || (i = ((BME) bmg).LIZ.LLF) <= 0) {
            i = 12;
        }
        c19170p7.LIZ = i;
        if (bmg != null && (i3 = ((BME) bmg).LIZ.LLF) > 0) {
            i4 = i3;
        }
        c19170p7.LIZJ = i4;
        if (bmg == null || (i2 = ((BME) bmg).LIZ.LLFF) <= 0) {
            i2 = 4;
        }
        c19170p7.LIZIZ = i2;
        c0yd.LJIILJJIL = c19170p7.LIZ();
        AbstractC18980oo<Long, Object> abstractC18980oo = new AbstractC18980oo<Long, Object>() { // from class: X.1Og
            @Override // X.AbstractC18980oo
            public final AbstractC19010or<Long, Object> LIZ() {
                final C0YD c0yd2 = C0YD.this;
                return new AbstractC51301zq<Long, V, CacheKey>(c0yd2) { // from class: X.2Dg
                    public final InterfaceC09740Zu<V> LJIILLIIL;

                    {
                        super(c0yd2);
                        this.LJIILLIIL = c0yd2.LJIILL;
                    }

                    @Override // X.AbstractC51301zq
                    public final Long LJIILLIIL(FeedExtra feedExtra) {
                        if (feedExtra != null && feedExtra.hasMore) {
                            return Long.valueOf(feedExtra.maxTime);
                        }
                        return null;
                    }

                    @Override // X.AbstractC51301zq
                    public final C73422Sri LJIILIIL(Object obj, final boolean z) {
                        String str3;
                        long j;
                        String str4;
                        int i5;
                        AbstractC73672Svk<BaseListResponse<FeedItem, FeedExtra>> drawerDropsFeed;
                        final String str5;
                        Long l = (Long) obj;
                        final C28635BLr c28635BLr = (C28635BLr) this.LJIILLIIL;
                        c28635BLr.getClass();
                        c28635BLr.LJIIJ.LIZ(AbstractC73672Svk.LJJIJIL(1).LJIIL(3000L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS36S0101000_5(3, c28635BLr, 30), new AfS18S0001000_6(0, 1)));
                        C28643BLz c28643BLz = B57.LIZ;
                        long j2 = c28643BLz.LIZ().mEnterRoomConfig.mRoomsData.roomId;
                        C28655BMl LIZ = B4T.LIZ();
                        Long valueOf = Long.valueOf(j2);
                        LIZ.getClass();
                        String LIZ2 = C28655BMl.LIZ(LIZ, valueOf, false, 2);
                        C28655BMl LIZ3 = B4T.LIZ();
                        if (LIZ3.LIZLLL) {
                            LIZ3.LIZLLL = false;
                            str3 = "ecom_explore_draw_refresh";
                        } else {
                            str3 = "ecom_explore_draw_loadmore";
                        }
                        String str6 = c28643BLz.LIZ().mEnterRoomConfig.mLogData.anchorId;
                        if (str6 != null && !str6.isEmpty()) {
                            j = CastLongProtector.parseLong(str6);
                        } else {
                            j = 0;
                        }
                        HashMap hashMap = new HashMap();
                        if (BOT.LIZJ()) {
                            hashMap.put("is_non_personalized", "1");
                        }
                        String str7 = C08680Vs.LJIILJJIL.LJIIIIZZ;
                        final String str8 = "tiktok_live_game_drawer";
                        if (z) {
                            c28635BLr.LJIIIIZZ.LIZIZ(EnumC28634BLq.REFRESH, c28635BLr.LIZJ);
                            str7.getClass();
                            if (!str7.equals("game_drawer_drops")) {
                                if (!str7.equals("game_drawer")) {
                                    if (LIZ2 != null) {
                                        drawerDropsFeed = c28635BLr.LIZIZ.feed(c28635BLr.LIZ, 0L, str3, LIZ2, hashMap);
                                    } else {
                                        drawerDropsFeed = c28635BLr.LIZIZ.feed(c28635BLr.LIZ, 0L, c28635BLr.LIZJ, hashMap);
                                        str3 = c28635BLr.LIZJ;
                                    }
                                    str8 = str3;
                                } else {
                                    drawerDropsFeed = c28635BLr.LIZIZ.feed(c28635BLr.LIZ, 0L, "tiktok_live_game_drawer", j, hashMap);
                                }
                                i5 = 2;
                            } else {
                                i5 = 2;
                                drawerDropsFeed = c28635BLr.LIZIZ.drawerDropsFeed(c28635BLr.LIZ, 0L, "tikcast_game_drawer_same_title_drops_refresh", "1111003", j2, j, hashMap);
                                c28635BLr.LJ = true;
                                str8 = "tikcast_game_drawer_same_title_drops_refresh";
                            }
                            c28635BLr.LJI.onNext(c28635BLr.LIZJ);
                            str5 = "click";
                        } else {
                            c28635BLr.LJIIIIZZ.LIZIZ(EnumC28634BLq.LOAD_MORE, c28635BLr.LIZLLL);
                            str7.getClass();
                            if (!str7.equals("game_drawer_drops")) {
                                if (!str7.equals("game_drawer")) {
                                    if (LIZ2 != null) {
                                        drawerDropsFeed = c28635BLr.LIZIZ.feed(c28635BLr.LIZ, 0L, str3, LIZ2, hashMap);
                                    } else {
                                        drawerDropsFeed = c28635BLr.LIZIZ.feed(c28635BLr.LIZ, l.longValue(), c28635BLr.LIZLLL, hashMap);
                                        str3 = c28635BLr.LIZLLL;
                                    }
                                    str8 = str3;
                                } else {
                                    drawerDropsFeed = c28635BLr.LIZIZ.feed(c28635BLr.LIZ, 0L, "tiktok_live_game_drawer", j, hashMap);
                                }
                                i5 = 2;
                            } else {
                                String str9 = c28635BLr.LIZLLL;
                                str8 = "tikcast_game_drawer_same_title_drops_loadmore";
                                if (str9.endsWith("_loadmore") || !str9.endsWith("_no_more")) {
                                    str4 = "tikcast_game_drawer_same_title_drops_loadmore";
                                } else if (c28635BLr.LJ) {
                                    c28635BLr.LJ = false;
                                    str4 = "tikcast_game_drawer_other_title_drops_refresh";
                                } else {
                                    str4 = "tikcast_game_drawer_other_title_drops_loadmore";
                                }
                                i5 = 2;
                                drawerDropsFeed = c28635BLr.LIZIZ.drawerDropsFeed(c28635BLr.LIZ, 0L, str4, "1111003", j2, j, hashMap);
                            }
                            c28635BLr.LJI.onNext(c28635BLr.LIZLLL);
                            c28635BLr.LJII.onNext(c28635BLr.LIZLLL);
                            str5 = "draw";
                        }
                        return drawerDropsFeed.LJJIJL(new InterfaceC48038ItG() { // from class: X.BLm
                            @Override // X.InterfaceC48038ItG
                            public final Object apply(Object obj2) {
                                EnumC28634BLq enumC28634BLq;
                                String str10;
                                int i6;
                                C28635BLr c28635BLr2 = C28635BLr.this;
                                boolean z2 = z;
                                String str11 = str5;
                                String str12 = str8;
                                BaseListResponse baseListResponse = (BaseListResponse) obj2;
                                c28635BLr2.getClass();
                                if (BJB.LIZJ <= 0 && !BJB.LJ) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    BJB.LIZJ = currentTimeMillis;
                                    long j3 = BJB.LIZIZ;
                                    if (1 <= j3 && j3 < currentTimeMillis) {
                                        BJB.LIZIZ().put("request2respond_duration", String.valueOf(BJB.LIZJ - BJB.LIZIZ));
                                    }
                                    BJB.LIZIZ().put("respond_timestamp", String.valueOf(BJB.LIZJ));
                                }
                                ArrayList arrayList = new ArrayList(baseListResponse.data);
                                FeedExtra feedExtra = (FeedExtra) baseListResponse.extra;
                                if (!C32151Nz.LJJIIJZLJL(arrayList)) {
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        FeedItem feedItem = (FeedItem) it.next();
                                        if (feedItem != null) {
                                            if (feedExtra != null && ((i6 = feedItem.type) == 1 || i6 == 2)) {
                                                Room room = (Room) feedItem.item;
                                                if (feedExtra.LIZ() != null) {
                                                    room.setLog_pb(feedExtra.LIZ().toString());
                                                    if (room.getOwner() != null) {
                                                        room.getOwner().setLogPb(feedExtra.LIZ().toString());
                                                    }
                                                }
                                                room.setRequestId(feedItem.resId);
                                            }
                                            if (feedItem.type == 1) {
                                                BLG blg = feedItem.item;
                                                if (blg instanceof Room) {
                                                    ((Room) blg).isFromRecommendCard = feedItem.isRecommendCard;
                                                }
                                            }
                                            if (feedExtra != null && feedItem.type == 3) {
                                                BLG blg2 = feedItem.item;
                                                if (feedExtra.LIZ() != null) {
                                                    feedExtra.LIZ().toString();
                                                    blg2.getClass();
                                                }
                                                blg2.getClass();
                                            }
                                        }
                                    }
                                }
                                c28635BLr2.LJFF.LIZ(c28635BLr2.LIZ, arrayList, feedExtra, z2);
                                if (!o.LJ(C08680Vs.LJIILJJIL.LJIIIIZZ, "game_drawer") && c28635BLr2.LIZLLL.startsWith("vertical_")) {
                                    if (c28635BLr2.LIZLLL.endsWith("_no_more") && z2) {
                                        c28635BLr2.LIZLLL = c28635BLr2.LIZLLL.replace("_no_more", "_loadmore");
                                    }
                                    if (c28635BLr2.LIZLLL.endsWith("_loadmore") && (!feedExtra.hasMore || arrayList.isEmpty())) {
                                        FeedItem feedItem2 = new FeedItem();
                                        feedItem2.type = 1005;
                                        feedItem2.setRoom(new Room());
                                        arrayList.add(feedItem2);
                                        feedExtra.hasMore = true;
                                        c28635BLr2.LIZLLL = c28635BLr2.LIZLLL.replace("_loadmore", "_no_more");
                                    }
                                }
                                InterfaceC28631BLn interfaceC28631BLn = c28635BLr2.LJIIIIZZ;
                                if (z2) {
                                    enumC28634BLq = EnumC28634BLq.REFRESH;
                                    str10 = c28635BLr2.LIZJ;
                                } else {
                                    enumC28634BLq = EnumC28634BLq.LOAD_MORE;
                                    str10 = c28635BLr2.LIZLLL;
                                }
                                interfaceC28631BLn.LIZ(enumC28634BLq, str10, feedExtra);
                                return new BLU(Pair.create(arrayList, baseListResponse.extra), baseListResponse.LIZ, baseListResponse.LIZIZ, baseListResponse.LIZJ, str11, str12);
                            }
                        }).LJIJJLI(new AfS36S0101000_5(1, c28635BLr, 64)).LJIJJLI(new AfS36S0101000_5(i5, c28635BLr, 60)).LJIJJLI(new AfS37S0000000_5(8)).LJIJJLI(new AfS36S0101000_5(0, c28635BLr, 27)).LJIJJ(new AfS25S0110000_5(c28635BLr, z, 8));
                    }
                };
            }
        };
        C32211Of c32211Of = new C32211Of(c0yd.LIZJ, c0yd.LIZLLL);
        C19050ov c19050ov = new C19050ov(abstractC18980oo, c0yd.LJIILJJIL);
        c19050ov.LIZJ = c32211Of;
        C1MU c1mu = new C1MU(c0yd, c19050ov.LIZ());
        this.LJLJJLL = c1mu;
        c1mu.LIZJ.observeForever(new AObserverS64S0101000_14(0, this, 6));
        return this.LJLJJLL;
    }

    @Override // com.bytedance.android.livesdk.feed.repository.BaseFeedRepository, X.InterfaceC28631BLn
    public final void LIZIZ(EnumC28634BLq enumC28634BLq, String str) {
        boolean z;
        this.LJZ = System.currentTimeMillis();
        if (BJB.LIZIZ <= 0 && !BJB.LJ) {
            long currentTimeMillis = System.currentTimeMillis();
            BJB.LIZIZ = currentTimeMillis;
            long j = BJB.LIZ;
            if (1 <= j && j < currentTimeMillis) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                BJB.LIZIZ().put("enter2request_duration", String.valueOf(BJB.LIZIZ - BJB.LIZ));
            } else {
                BJB.LIZIZ().put("enter2request_duration", CardStruct.IStatusCode.DEFAULT);
            }
            BJB.LIZIZ().put("request_start_timestamp", String.valueOf(BJB.LIZIZ));
        }
        super.LIZIZ(enumC28634BLq, str);
    }

    @Override // X.BMM
    public final void Qr(String str, String str2) {
        this.LJLLLLLL.onNext(new Pair<>(str, str2));
    }

    @Override // com.bytedance.android.livesdk.feed.repository.BaseFeedRepository, X.InterfaceC28631BLn
    public final void LIZ(EnumC28634BLq enumC28634BLq, String str, FeedExtra feedExtra) {
        BJL bjl;
        long currentTimeMillis = System.currentTimeMillis() - this.LJZ;
        BZI LIZ = C28787BRn.LIZ("livesdk_explore_request_finish");
        C08680Vs c08680Vs = C08680Vs.LJIILJJIL;
        LIZ.LJIJJ(c08680Vs.LJ, "show_method");
        C06530Nl.LIZLLL(LIZ, c08680Vs.LJII, "tab_type", currentTimeMillis, "request_duration");
        LIZ.LJIJJ(c08680Vs.LJIIJJI, "landing_reason");
        LIZ.LJIIZILJ();
        LIZ.LJIIIIZZ();
        C28246B6s c28246B6s = (C28246B6s) DataChannelGlobal.LJLJJI.mv0(C29049Baf.class);
        if (c28246B6s != null && (bjl = c28246B6s.LJFF) != null) {
            String str2 = bjl.LJIJJLI;
            if (!TextUtils.isEmpty(str2)) {
                LIZ.LJIJJ(str2, "from_drawer_tab");
            }
        }
        if ("enter_auto_vertical_game".equals(str) || "vertical_game_loadmore".equals(str)) {
            LIZ.LJIJJ("game", "request_from");
        } else {
            LIZ.LJIJJ("foru", "request_from");
        }
        if (enumC28634BLq == EnumC28634BLq.REFRESH) {
            LIZ.LJIJJ("refresh", "request_type");
        } else {
            LIZ.LJIJJ("loadmore", "request_type");
        }
        LIZ.LJJIIJZLJL();
        super.LIZ(enumC28634BLq, str, feedExtra);
    }

    public FeedRepository(BMC bmc, FeedApi feedApi, C278917p c278917p, C279317t c279317t) {
        super(bmc, c279317t);
        this.LJLLJ = new C73893SzJ<>();
        this.LJLLL = new C73893SzJ<>();
        this.LJLLLL = new C73893SzJ<>();
        this.LJLLLLLL = new C73893SzJ<>();
        this.LJLZ = new C73893SzJ<>();
        this.LJLJLJ = feedApi;
        this.LJLJLLL = c278917p;
        this.LJLIL.LIZ(c279317t.LJFF.LJJJJZI(new C76143TuV(1)));
    }
}
