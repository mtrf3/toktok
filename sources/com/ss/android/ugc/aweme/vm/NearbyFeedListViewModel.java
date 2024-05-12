package com.ss.android.ugc.aweme.vm;

import X.AbstractC57774Mlu;
import X.C188727au;
import X.C214188as;
import X.C33Q;
import X.C3A5;
import X.C47261Igj;
import X.C47497IkX;
import X.C47636Imm;
import X.C48480J0y;
import X.C52229Kef;
import X.C53084KsS;
import X.C53525KzZ;
import X.C54665Lcr;
import X.C54874LgE;
import X.C54876LgG;
import X.C54919Lgx;
import X.C57775Mlv;
import X.C58655N0h;
import X.C58704N2e;
import X.C63081OpJ;
import X.C65777Prh;
import X.C76800UCe;
import X.C78404Ups;
import X.C78685UuP;
import X.C78996UzQ;
import X.C7HV;
import X.C7KB;
import X.C8HZ;
import X.FFL;
import X.FMX;
import X.InterfaceC54879LgJ;
import X.InterfaceC57784Mm4;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.LJ6;
import X.LJA;
import X.ORZ;
import X.OSZ;
import X.X1D;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.NearbyInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.service.PoiServiceImpl;
import com.ss.android.ugc.aweme.service.ILocationOfflineService;
import com.ss.android.ugc.aweme.settings.NearbyTabConfig;
import com.ss.android.ugc.aweme.settings.PublishLandingNearbyRevisitSettings;
import com.ss.android.ugc.aweme.settings.UrlStruct;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class NearbyFeedListViewModel extends AssemSingleListViewModel<Aweme, C54665Lcr, Long> {
    public int LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public Long LJLJLLL;
    public boolean LJLL;
    public final AtomicInteger LJLIL = new AtomicInteger(0);
    public boolean LJLILLLLZI = true;
    public final C214188as LJLJI = C78404Ups.LIZJ(this, C54876LgG.LJLIL);
    public final List<Aweme> LJLJJI = new ArrayList();
    public final List<InterfaceC65784Pro<C76800UCe>> LJLLI = new ArrayList();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C54665Lcr(new C8HZ(null, null, 15), 4);
    }

    public final Aweme hv0() {
        String[] strArr;
        Video video = new Video();
        Aweme aweme = new Aweme();
        aweme.setAid(UUID.randomUUID().toString());
        aweme.setAwemeType(327);
        UrlStruct urlStruct = NearbyTabConfig.LIZIZ().bkgdVideo;
        if (urlStruct != null) {
            video.setRatio("720p");
            video.setHeight(1280);
            video.setWidth(720);
            aweme.setVideo(video);
            String[] strArr2 = urlStruct.urlList;
            if (strArr2 != null) {
                ArrayList arrayList = new ArrayList();
                for (String str : strArr2) {
                    arrayList.add(str);
                }
                VideoUrlModel videoUrlModel = new VideoUrlModel();
                videoUrlModel.setUrlList(arrayList);
                videoUrlModel.setUri(urlStruct.uri);
                videoUrlModel.setHeight(1280);
                videoUrlModel.setWidth(720);
                aweme.getVideo().setPlayAddr(videoUrlModel);
                aweme.getVideo().setDownloadAddr(videoUrlModel);
            }
        }
        UrlStruct urlStruct2 = NearbyTabConfig.LIZIZ().bkgdVideoCover;
        if (urlStruct2 != null && (strArr = urlStruct2.urlList) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : strArr) {
                arrayList2.add(str2);
            }
            VideoUrlModel videoUrlModel2 = new VideoUrlModel();
            videoUrlModel2.setUrlList(arrayList2);
            videoUrlModel2.setUri(urlStruct2.uri);
            videoUrlModel2.setHeight(1280);
            videoUrlModel2.setWidth(720);
            video.setCover(videoUrlModel2);
            video.setOriginCover(videoUrlModel2);
        }
        return aweme;
    }

    public final void jv0() {
        if (!this.LJLLI.isEmpty()) {
            Iterator<InterfaceC65784Pro<C76800UCe>> it = this.LJLLI.iterator();
            while (it.hasNext()) {
                it.next().invoke();
            }
            ((ArrayList) this.LJLLI).clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void nv0() {
        int i;
        Aweme aweme;
        C53084KsS.LIZ.getClass();
        FFL.LJIIIZ().getClass();
        int i2 = 0;
        if (FFL.LJIIJ(31744, 0, "nearby_cache_optimization", false) != 1 || (i = this.LJLJJL) > 10 || i < 0 || (aweme = (Aweme) ORZ.LJLLLL(this.LJLJJI)) == null || !aweme.isClientCache()) {
            return;
        }
        int min = Math.min(10, ((ArrayList) this.LJLJJI).size());
        for (int i3 = 0; i3 < min; i3++) {
            if (i3 > this.LJLJJL && ((Aweme) ListProtector.get(this.LJLJJI, i3)).isClientCache()) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) this.LJLJJI).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    int i4 = i2 + 1;
                    if (i2 >= 0) {
                        if (i2 > this.LJLJJL && ((Aweme) ListProtector.get(this.LJLJJI, i2)).isClientCache()) {
                            ILocationOfflineService iLocationOfflineService = (ILocationOfflineService) ServiceManager.get().getService(ILocationOfflineService.class);
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("The ");
                            LIZ.append(i4);
                            LIZ.append("th video is not consumed, discard it");
                            X1D.LIZIZ(LIZ);
                            iLocationOfflineService.LIZ("Nearby");
                        } else {
                            arrayList.add(next);
                        }
                        i2 = i4;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                ((ArrayList) this.LJLJJI).clear();
                ((ArrayList) this.LJLJJI).addAll(arrayList);
                setState(new AqS175S0100000_9(C8HZ.LIZIZ(((C54665Lcr) getState()).LJLIL, null, null, null, arrayList, 7), (C8HZ<InterfaceC57784Mm4>) 352));
                return;
            }
        }
    }

    public static int mv0() {
        int i;
        Integer num;
        int i2 = Integer.MAX_VALUE;
        if (C53525KzZ.LIZ()) {
            i = Math.min(Integer.MAX_VALUE, C52229Kef.LIZ() - 1);
        } else {
            i = Integer.MAX_VALUE;
        }
        if (PoiServiceImpl.LIZIZ().LJJIL() && (num = PublishLandingNearbyRevisitSettings.LIZ().insertPosition) != null) {
            Integer valueOf = Integer.valueOf(num.intValue() - 1);
            if (valueOf.intValue() >= 0) {
                int intValue = valueOf.intValue();
                if (LJ6.LIZIZ().length != 0) {
                    i2 = intValue;
                }
            }
        }
        return Math.max(Math.min(i, i2), 0);
    }

    public final void ov0() {
        if (!C53525KzZ.LIZ()) {
            return;
        }
        if (((ArrayList) this.LJLJJI).size() >= C52229Kef.LIZ()) {
            C54919Lgx.LIZ().LIZJ();
            return;
        }
        int LIZ = C52229Kef.LIZ() - ((ArrayList) this.LJLJJI).size();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("insert_index", LIZ);
            String jSONObject2 = jSONObject.toString();
            o.LJIIIIZZ(jSONObject2, "bizInfo.toString()");
            C54919Lgx.LIZ().LIZIZ(new CardTypeRequest(3, jSONObject2));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("realCount:");
            LIZ2.append(LIZ);
            X1D.LIZIZ(LIZ2);
        } catch (Exception e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("requestInsertCardAtVV exception : ");
            LIZ3.append(e.getMessage());
            X1D.LIZIZ(LIZ3);
        }
    }

    public final List<Aweme> iv0(FeedItemList feedItemList) {
        int i;
        String str;
        AwemeRawAd awemeRawAd;
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : feedItemList.getItems()) {
            if (((ArrayList) this.LJLJJI).isEmpty() || C78996UzQ.LJJI(aweme, this.LJLJJI) < 0) {
                List<Aweme> list = this.LJLJJI;
                o.LJIIIIZZ(aweme, "aweme");
                ((ArrayList) list).add(aweme);
                arrayList.add(aweme);
            } else if (C78996UzQ.LJJI(aweme, this.LJLJJI) >= 0) {
                o.LJIIIIZZ(aweme, "aweme");
                int i2 = 1;
                if (!aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.isEnableFilterSameVideo()) {
                    List<Aweme> list2 = this.LJLJJI;
                    Aweme aweme2 = (Aweme) ListProtector.get(list2, C78996UzQ.LJJI(aweme, list2));
                    if (aweme2 != null && TextUtils.equals(aweme.getAid(), aweme2.getAid())) {
                        String str2 = "";
                        if (aweme.isAd()) {
                            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "item_repeat", aweme.getAwemeRawAd());
                            if (aweme2.isAd()) {
                                i = 1;
                            } else {
                                i = 2;
                            }
                            LIZLLL.LIZIZ(Integer.valueOf(i), "filter_reason");
                            if (!aweme2.isAd()) {
                                str = "";
                            } else {
                                AwemeRawAd awemeRawAd2 = aweme2.getAwemeRawAd();
                                o.LJI(awemeRawAd2);
                                str = awemeRawAd2.getCreativeIdStr();
                            }
                            LIZLLL.LIZIZ(str, "repeat_cid");
                            LIZLLL.LIZIZ(1, "repeat_type");
                            LIZLLL.LJI();
                        }
                        if (C63081OpJ.LLJJIJI(aweme)) {
                            C58655N0h LIZLLL2 = C58704N2e.LIZLLL("draw_ad", "show_failed", aweme.getAwemeRawAd());
                            LIZLLL2.LIZIZ("8", "ad_show_fail_type");
                            if (aweme2.isAd()) {
                                AwemeRawAd awemeRawAd3 = aweme2.getAwemeRawAd();
                                o.LJI(awemeRawAd3);
                                str2 = awemeRawAd3.getCreativeIdStr();
                            }
                            LIZLLL2.LIZIZ(str2, "repeat_cid");
                            LIZLLL2.LJI();
                        }
                        C188727au c188727au = new C188727au();
                        if (!aweme2.isAd()) {
                            i2 = 2;
                        }
                        c188727au.LIZLLL(i2, "failed_reason");
                        c188727au.LJIIIZ("group_id", aweme2.getAid());
                        FMX.LJIIL("vv_failed", c188727au.LIZ);
                    }
                } else {
                    ((ArrayList) this.LJLJJI).add(aweme);
                    arrayList.add(aweme);
                }
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    /* renamed from: lv0, reason: merged with bridge method [inline-methods] */
    public final void manualListLoadMore(Long l) {
        long j;
        if (this.LJLJLLL != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Long l2 = this.LJLJLLL;
            if (l2 != null) {
                j = l2.longValue();
            } else {
                j = 0;
            }
            if (Math.abs(elapsedRealtime - j) < 200) {
                return;
            }
        }
        this.LJLJLLL = Long.valueOf(SystemClock.elapsedRealtime());
        super.manualListLoadMore(l);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<Aweme> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS175S0100000_9(newListState, (C8HZ<InterfaceC57784Mm4>) 351));
    }

    public final void qv0(FeedItemList feedItemList) {
        Iterator<Aweme> it = feedItemList.getItems().iterator();
        while (it.hasNext()) {
            if (it.next().isAd()) {
                Iterator<Aweme> it2 = feedItemList.getItems().iterator();
                while (it2.hasNext()) {
                    it2.next().setHasAd(1);
                }
                return;
            }
        }
    }

    public final void rv0(int i) {
        this.LJLJJL = i;
        ILocationOfflineService iLocationOfflineService = (ILocationOfflineService) ServiceManager.get().getService(ILocationOfflineService.class);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateShownIndex:");
        LIZ.append(this.LJLJJL);
        X1D.LIZIZ(LIZ);
        iLocationOfflineService.LIZ("Nearby");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f0 A[Catch: Exception -> 0x017b, TryCatch #0 {Exception -> 0x017b, blocks: (B:3:0x0009, B:7:0x001c, B:9:0x0023, B:15:0x00d2, B:16:0x00df, B:18:0x00f0, B:21:0x010b, B:23:0x011c, B:25:0x0129, B:26:0x0122, B:30:0x0134, B:32:0x013d, B:33:0x0144, B:35:0x014a, B:38:0x0171, B:39:0x0176, B:41:0x016a, B:42:0x0159, B:46:0x0033, B:48:0x0039, B:50:0x003f, B:51:0x0043, B:52:0x004b, B:55:0x0056, B:57:0x005f, B:58:0x0062), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010b A[Catch: Exception -> 0x017b, TryCatch #0 {Exception -> 0x017b, blocks: (B:3:0x0009, B:7:0x001c, B:9:0x0023, B:15:0x00d2, B:16:0x00df, B:18:0x00f0, B:21:0x010b, B:23:0x011c, B:25:0x0129, B:26:0x0122, B:30:0x0134, B:32:0x013d, B:33:0x0144, B:35:0x014a, B:38:0x0171, B:39:0x0176, B:41:0x016a, B:42:0x0159, B:46:0x0033, B:48:0x0039, B:50:0x003f, B:51:0x0043, B:52:0x004b, B:55:0x0056, B:57:0x005f, B:58:0x0062), top: B:2:0x0009 }] */
    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object whenRefresh(X.InterfaceC67352kd<? super X.AbstractC57774Mlu<com.ss.android.ugc.aweme.feed.model.Aweme>> r18) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.vm.NearbyFeedListViewModel.whenRefresh(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void kv0(int i, Aweme aweme) {
        List arrayList;
        o.LJIIIZ(aweme, "aweme");
        List<Aweme> listItemState = ((C54665Lcr) getState()).getListItemState();
        if (listItemState != null) {
            arrayList = ORZ.LLJILJILJ(listItemState);
        } else {
            arrayList = new ArrayList();
        }
        if (arrayList.isEmpty()) {
            arrayList.add(aweme);
        } else if (i <= arrayList.size()) {
            ListProtector.add(arrayList, i, aweme);
        }
        if (((ArrayList) this.LJLJJI).isEmpty()) {
            ((ArrayList) this.LJLJJI).add(aweme);
        } else if (i <= ((ArrayList) this.LJLJJI).size()) {
            ListProtector.add(this.LJLJJI, i, aweme);
        }
        setState(new AqS175S0100000_9(C8HZ.LIZIZ(((C54665Lcr) getState()).LJLIL, null, null, null, arrayList, 7), (C8HZ<InterfaceC57784Mm4>) 643));
    }

    public final void pv0(String str, List list) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = ListProtector.get(list, i);
                Aweme aweme = (Aweme) obj;
                aweme.setRequestId(str);
                IAwemeService LIZ = AwemeService.LIZ();
                if (LIZ != null) {
                    obj = LIZ.R1(aweme);
                    o.LJI(obj);
                }
                IRequestIdService LJ = RequestIdService.LJ();
                if (LJ != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(((Aweme) obj).getAid());
                    LIZ2.append('7');
                    LJ.LIZJ(i, X1D.LIZIZ(LIZ2), str);
                }
                ListProtector.set(list, i, obj);
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final Object whenLoadMore(Long l, InterfaceC67352kd<? super AbstractC57774Mlu<Aweme>> interfaceC67352kd) {
        String str;
        Integer num;
        List<Aweme> list;
        l.longValue();
        try {
            if (C53525KzZ.LIZ()) {
                ov0();
            }
            OSZ LIZJ = LJA.LIZJ(((ArrayList) this.LJLJJI).size());
            int i = 2;
            double LJII = C47636Imm.LJII(2);
            int LIZJ2 = C47497IkX.LIZJ();
            String str2 = this.LJLJJLL;
            String LIZ = C54919Lgx.LIZ().LIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("cardInsert:");
            LIZ2.append(LIZ);
            X1D.LIZIZ(LIZ2);
            int incrementAndGet = this.LJLIL.incrementAndGet();
            if (LIZJ != null) {
                str = (String) LIZJ.getFirst();
                num = (Integer) LIZJ.getSecond();
            } else {
                str = null;
                num = null;
            }
            FeedItemList LJIILL = ((InterfaceC54879LgJ) this.LJLJI.getValue().getOperator()).LJIILL(new C54874LgE(i, LJII, LIZJ2, str2, LIZ, incrementAndGet, str, num, 128));
            C3A5.LIZ.LJFF(LJIILL.getRequestId(), LJIILL.logPb);
            if (LJIILL.size() == 0) {
                setState(new AqS175S0100000_9(LJIILL, 644));
                return C57775Mlv.LIZIZ();
            }
            qv0(LJIILL);
            if (this.LJLIL.get() == 1 && mv0() == Integer.MAX_VALUE) {
                nv0();
            }
            List<Aweme> iv0 = iv0(LJIILL);
            if (!((ArrayList) iv0).isEmpty()) {
                C7HV.LIZIZ.LIZJ(iv0, C7KB.OTHERS);
            }
            if (C65777Prh.LJI(iv0)) {
                list = iv0;
            } else {
                list = null;
            }
            pv0(LJIILL.getRequestId(), list);
            C48480J0y.LIZ(LJIILL, this.LJLJL);
            C54919Lgx.LIZ().LIZLLL(LJIILL);
            if (LJIILL.isHasMore()) {
                setState(new AqS175S0100000_9(LJIILL, 645));
                return C57775Mlv.LIZLLL(null, null, iv0);
            }
            setState(new AqS175S0100000_9(LJIILL, 646));
            return C57775Mlv.LIZ(iv0);
        } catch (Exception e) {
            C54919Lgx.LIZ().LIZLLL(null);
            return C57775Mlv.LIZJ(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List gv0(List list, boolean z, boolean z2) {
        List<Aweme> list2;
        Aweme aweme;
        String str;
        if (z || !z2 || (list2 = ((C54665Lcr) getState()).LJLIL.LJLJJI) == null || (aweme = (Aweme) ORZ.LJLLLL(list2)) == null) {
            return list;
        }
        List<Aweme> awemeStore = this.LJLJJI;
        o.LJIIIZ(awemeStore, "awemeStore");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List LLJILJILJ = ORZ.LLJILJILJ(list);
        NearbyInfo nearbyInfo = aweme.nearbyInfo;
        if (nearbyInfo != null) {
            str = nearbyInfo.getEventTrack();
        } else {
            str = null;
        }
        C78685UuP.LJJLIIIJILLIZJL(str, linkedHashMap);
        if (linkedHashMap.containsKey("is_insert_personal_video") && o.LJ(linkedHashMap.get("is_insert_personal_video"), "1")) {
            ArrayList arrayList = (ArrayList) LLJILJILJ;
            if (arrayList.isEmpty()) {
                arrayList.add(aweme);
            } else {
                ListProtector.add(LLJILJILJ, 0, aweme);
            }
            ArrayList arrayList2 = (ArrayList) awemeStore;
            if (arrayList2.isEmpty()) {
                arrayList2.add(aweme);
            } else if (!o.LJ(ListProtector.get(awemeStore, 0), ListProtector.get(LLJILJILJ, 0))) {
                ListProtector.add(awemeStore, 0, aweme);
            }
        }
        return ORZ.LLJI(LLJILJILJ);
    }
}
