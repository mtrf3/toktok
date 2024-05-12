package X;

import Y.ACallableS41S0400000_15;
import Y.ARunnableS18S0201000_15;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.expirement.AdPitayaReRankClientAbModel;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.RankData;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.handler.PrepareItemDataHandler;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model.CandidateAdData;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model.FeedActionData;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model.RollAdData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pitaya.api.feature.FeatureCoreFactory;
import com.bytedance.pitaya.api.feature.IFeatureCore;
import com.bytedance.pitaya.api.feature.IKVStore;
import com.ss.android.ugc.aweme.ad.feed.candidate.ICandidateRequestService;
import com.ss.android.ugc.aweme.commercialize.feed.candidate.CandidateRequestImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.search.TrendingEventModel;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YHR implements InterfaceC48722JAg, InterfaceC87123YHf {
    public final ILE LIZ;
    public final String LIZIZ;
    public final YHU LIZJ;
    public long LIZLLL;
    public final Handler LJ;
    public C55063LjH LJFF;
    public final java.util.Map<String, YHV> LJI;
    public String LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public final C62822Ol8 LJIIL;
    public C46591IQh LJIILIIL;
    public final C62822Ol8 LJIILJJIL;
    public final C62822Ol8 LJIILL;
    public final C62822Ol8 LJIILLIIL;
    public final C62822Ol8 LJIIZILJ;
    public final C62822Ol8 LJIJ;
    public final C62822Ol8 LJIJI;

    @Override // X.InterfaceC87123YHf
    public final void LJIIIIZZ() {
        List<Aweme> currentList;
        ICandidateRequestService iCandidateRequestService;
        InterfaceC55062LjG adapter;
        YHU yhu = this.LIZJ;
        C55063LjH c55063LjH = this.LJFF;
        if (c55063LjH == null || (adapter = c55063LjH.LIZ.getAdapter()) == null || (currentList = adapter.Q8()) == null) {
            currentList = C61878OQg.INSTANCE;
        }
        yhu.getClass();
        o.LJIIIZ(currentList, "currentList");
        yhu.LIZJ = System.currentTimeMillis() / 1000;
        Object LIZ = C58096Mr6.LIZ(ICandidateRequestService.class, false);
        if (LIZ != null) {
            iCandidateRequestService = (ICandidateRequestService) LIZ;
        } else {
            if (C58096Mr6.LLLLJI == null) {
                synchronized (ICandidateRequestService.class) {
                    if (C58096Mr6.LLLLJI == null) {
                        C58096Mr6.LLLLJI = new CandidateRequestImpl();
                    }
                }
            }
            iCandidateRequestService = C58096Mr6.LLLLJI;
        }
        iCandidateRequestService.LIZ(currentList);
    }

    public final boolean LJIJI() {
        return ((Boolean) this.LJIILJJIL.getValue()).booleanValue();
    }

    @Override // X.InterfaceC48722JAg
    public final void unBind() {
        String sceneName = this.LIZ.name();
        o.LJIIIZ(sceneName, "sceneName");
        YHZ yhz = C34530Dgs.LIZ.get(sceneName);
        if (yhz != null) {
            Iterator<Map.Entry<String, YHN>> it = yhz.LJLJI.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().LIZ.LJII = true;
            }
        }
        ((LinkedHashMap) this.LJI).clear();
        this.LIZLLL = 0L;
        this.LJFF = null;
        this.LJIIIIZZ = false;
        this.LJII = "";
        C46591IQh c46591IQh = this.LJIILIIL;
        c46591IQh.LIZ = "";
        c46591IQh.LIZIZ = "";
        c46591IQh.LIZJ = -1;
        c46591IQh.LIZLLL = -1L;
        c46591IQh.LJ = null;
        YHU yhu = this.LIZJ;
        ((LinkedHashMap) yhu.LIZ).clear();
        yhu.LIZIZ = 0L;
        yhu.LIZJ = 0L;
        yhu.LJ = "";
    }

    @Override // X.InterfaceC48722JAg
    public final long LIZIZ() {
        String str;
        if (LJIJI() && this.LJIILIIL.LIZLLL != -1) {
            YHS yhs = YHS.LIZ;
            C55063LjH c55063LjH = this.LJFF;
            yhs.getClass();
            List LIZ = YHS.LIZ(c55063LjH);
            int size = LIZ.size() - C87121YHd.LIZ().recentFeedCount;
            if (size < 0) {
                size = 0;
            }
            int size2 = LIZ.size() - 1;
            if (size <= size2) {
                while (true) {
                    Aweme aweme = (Aweme) ListProtector.get(LIZ, size2);
                    if (aweme.isAd()) {
                        String str2 = this.LJIILIIL.LIZIZ;
                        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                        if (awemeRawAd != null) {
                            str = awemeRawAd.getCreativeIdStr();
                        } else {
                            str = null;
                        }
                        if (TextUtils.equals(str2, str)) {
                            return this.LJIILIIL.LIZLLL / 1000;
                        }
                    }
                    if (size2 == size) {
                        break;
                    }
                    size2--;
                }
            }
        }
        return -1L;
    }

    @Override // X.InterfaceC48722JAg
    public final String LIZLLL() {
        Aweme aweme;
        if (!LJIJI()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        YHS yhs = YHS.LIZ;
        C55063LjH c55063LjH = this.LJFF;
        yhs.getClass();
        List LIZ = YHS.LIZ(c55063LjH);
        int size = LIZ.size() - C87121YHd.LIZ().recentFeedCount;
        if (size < 0) {
            size = 0;
        }
        int size2 = LIZ.size();
        while (size < size2) {
            Aweme aweme2 = (Aweme) ListProtector.get(LIZ, size);
            sb.append(aweme2.getAid());
            if (aweme2.isAd()) {
                sb.append("_");
                AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
                o.LJI(awemeRawAd);
                Long adId = awemeRawAd.getAdId();
                o.LJIIIIZZ(adId, "aweme.awemeRawAd!!.adId");
                sb.append(adId.longValue());
            } else if (C1DJ.LJIJJLI(aweme2)) {
                int indexOf = LIZ.indexOf(aweme2);
                String str = null;
                Long l = null;
                if (indexOf != -1) {
                    StringBuilder sb2 = new StringBuilder();
                    if (indexOf <= this.LJIIJJI) {
                        String aid = aweme2.getAid();
                        if (aid != null && (aweme = JAY.LIZIZ.get(aid)) != null && aweme.isAd()) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("_midroll_");
                            LIZ2.append(aweme.getAid());
                            LIZ2.append('_');
                            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                            if (awemeRawAd2 != null) {
                                l = awemeRawAd2.getAdId();
                            }
                            LIZ2.append(l);
                            sb2.append(X1D.LIZIZ(LIZ2));
                        }
                    } else {
                        sb2.append("_midroll");
                    }
                    str = sb2.toString();
                }
                sb.append(str);
            }
            sb.append(this.LIZIZ);
            size++;
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        String sb3 = sb.toString();
        o.LJIIIIZZ(sb3, "sv.toString()");
        return sb3;
    }

    public final void LJIJJ() {
        if (!LJIJI() || this.LJIIIZ) {
            return;
        }
        AdPitayaReRankClientAbModel LIZ = C87121YHd.LIZ();
        YHJ yhj = new YHJ(LIZ.businessName, LIZ.coreTaskName, LIZ.prepareTaskName, this.LIZ.ordinal());
        GsonHolder.LIZLLL().LIZ();
        String sceneName = this.LIZ.name();
        o.LJIIIZ(sceneName, "sceneName");
        C34530Dgs.LIZ.put(sceneName, new YHZ(sceneName, yhj, new HashMap()));
        this.LJIIIZ = true;
    }

    @Override // X.InterfaceC48722JAg
    public final boolean LIZJ() {
        return this.LJIIJ;
    }

    public YHR(ILE sceneName) {
        o.LJIIIZ(sceneName, "sceneName");
        this.LIZ = sceneName;
        C16880lQ.LJLLJ(YHR.class);
        this.LIZIZ = ",";
        this.LIZJ = new YHU();
        this.LJ = new Handler(C16880lQ.LLJJJJ());
        this.LJI = new LinkedHashMap();
        this.LJII = "";
        this.LJIIJJI = -1;
        this.LJIIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 907));
        this.LJIILIIL = new C46591IQh(0);
        this.LJIILJJIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 906));
        this.LJIILL = C221108m2.LIZIZ(C87122YHe.LJLIL);
        this.LJIILLIIL = C221108m2.LIZIZ(C87119YHb.LJLIL);
        this.LJIIZILJ = C221108m2.LIZIZ(C87118YHa.LJLIL);
        this.LJIJ = C221108m2.LIZIZ(C87120YHc.LJLIL);
        this.LJIJI = C221108m2.LIZIZ(C56582MIo.LJLIL);
    }

    @Override // X.InterfaceC48722JAg
    public final void LIZ(List<? extends Aweme> awemeList) {
        o.LJIIIZ(awemeList, "awemeList");
        YHU yhu = this.LIZJ;
        yhu.getClass();
        yhu.LIZIZ = System.currentTimeMillis() / 1000;
        if (!LJIJI()) {
            return;
        }
        ((LinkedHashMap) this.LJI).clear();
        for (Aweme aweme : awemeList) {
            if (aweme != null) {
                String aid = aweme.getAid();
                o.LJIIIIZZ(aid, "aweme.aid");
                int value = YHW.UNSHOWN_ADJUSTABLE.getValue();
                FeedActionData feedActionData = new FeedActionData(0L, 1, null);
                RankData.Companion.getClass();
                YHV yhv = new YHV(aid, value, feedActionData, C72074SQk.LIZ(aweme));
                java.util.Map<String, YHV> map = this.LJI;
                String aid2 = aweme.getAid();
                o.LJIIIIZZ(aid2, "aweme.aid");
                map.put(aid2, yhv);
                aweme.isAd();
            }
        }
        if (!awemeList.isEmpty()) {
            LJIIZILJ(0, (Aweme) ListProtector.get(awemeList, 0));
        }
    }

    @Override // X.InterfaceC48722JAg
    public final void LJFF(String str) {
        if (str != null && (!ujb.o.LJJJJJL(str))) {
            this.LJII = str;
        }
    }

    @Override // X.InterfaceC48722JAg
    public final void LJI(List<? extends Aweme> awemeList) {
        o.LJIIIZ(awemeList, "awemeList");
        YHU yhu = this.LIZJ;
        yhu.getClass();
        yhu.LIZIZ = System.currentTimeMillis() / 1000;
        if (!LJIJI()) {
            return;
        }
        LJIJJ();
        for (Aweme aweme : awemeList) {
            if (aweme != null && !this.LJI.containsKey(aweme.getAid())) {
                String aid = aweme.getAid();
                o.LJIIIIZZ(aid, "aweme.aid");
                int value = YHW.UNSHOWN_ADJUSTABLE.getValue();
                FeedActionData feedActionData = new FeedActionData(0L, 1, null);
                RankData.Companion.getClass();
                YHV yhv = new YHV(aid, value, feedActionData, C72074SQk.LIZ(aweme));
                java.util.Map<String, YHV> map = this.LJI;
                String aid2 = aweme.getAid();
                o.LJIIIIZZ(aid2, "aweme.aid");
                map.put(aid2, yhv);
                aweme.isAd();
            }
        }
        LJIL(YHX.ON_LOAD_MORE);
    }

    @Override // X.InterfaceC48722JAg
    public final void LJIIIZ(C55063LjH c55063LjH) {
        this.LJFF = c55063LjH;
        LJIJJ();
    }

    @Override // X.InterfaceC48722JAg
    public final void LJIIJ(Aweme aweme) {
        C46591IQh c46591IQh;
        if (aweme != null && (c46591IQh = this.LJIILIIL.LJ) != null) {
            this.LJIILIIL = c46591IQh;
        }
    }

    @Override // X.InterfaceC87123YHf
    public final Aweme LJIIL(String aid) {
        o.LJIIIZ(aid, "aid");
        return this.LIZJ.LIZ(aid);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, X.OSZ] */
    @Override // X.InterfaceC48722JAg
    public final String LJIILIIL(List<String> list) {
        T t;
        C68322mC c68322mC = new C68322mC();
        Boolean bool = Boolean.FALSE;
        c68322mC.element = new OSZ(bool, "");
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = this.LJIIIIZZ;
        if (!z) {
            C38423F6d.LIZ.getClass();
            z = C38422F6c.LIZIZ();
            this.LJIIIIZZ = z;
        }
        if (z) {
            YHS.LIZ.getClass();
            try {
                IFeatureCore featureCore = FeatureCoreFactory.INSTANCE.getFeatureCore(String.valueOf(EF7.LJIIIZ));
                if (featureCore == null) {
                    t = new OSZ(bool, "");
                } else {
                    IKVStore createInMemoryKVStore = featureCore.createInMemoryKVStore("tiktok_clientai_cloud_local_predict");
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    t = new OSZ(Boolean.TRUE, createInMemoryKVStore.tryGetValuesForRequest(list));
                }
            } catch (Throwable th) {
                Throwable LJFF = AnonymousClass028.LJFF(th);
                if (LJFF != null) {
                    C78983UzD.LJIIZILJ(LJFF);
                }
                t = new OSZ(Boolean.FALSE, "");
            }
            c68322mC.element = t;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        AbstractC58624Mzc abstractC58624Mzc = (AbstractC58624Mzc) this.LJIJI.getValue();
        C56579MIl.LIZ.getClass();
        abstractC58624Mzc.LJIILJJIL(C56579MIl.LIZLLL, new C56581MIn(currentTimeMillis2, currentTimeMillis));
        ((AbstractC58624Mzc) this.LJIJI.getValue()).LJIILJJIL(C56579MIl.LJ, new AqS175S0100000_9(c68322mC, (C68322mC<List<TrendingEventModel>>) 578));
        return (String) ((OSZ) c68322mC.element).getSecond();
    }

    @Override // X.InterfaceC48722JAg
    public final void LJIILJJIL(Aweme aweme) {
        if (aweme != null && LJIJI()) {
            LJIJJ();
            LJIL(YHX.ON_COMPLETED_PLAY);
        }
    }

    @Override // X.InterfaceC87123YHf
    public final void LJIILL(List<String> list) {
        ArrayList arrayList = (ArrayList) list;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Aweme LIZ = this.LIZJ.LIZ((String) it.next());
            if (LIZ != null) {
                String aid = LIZ.getAid();
                o.LJIIIIZZ(aid, "aweme.aid");
                int value = YHW.UNSHOWN_ADJUSTABLE.getValue();
                FeedActionData feedActionData = new FeedActionData(0L, 1, null);
                RankData.Companion.getClass();
                YHV yhv = new YHV(aid, value, feedActionData, C72074SQk.LIZ(LIZ));
                java.util.Map<String, YHV> map = this.LJI;
                String aid2 = LIZ.getAid();
                o.LJIIIIZZ(aid2, "aweme.aid");
                map.put(aid2, yhv);
            }
        }
        YHU yhu = this.LIZJ;
        yhu.getClass();
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            linkedHashMap.put(next, next);
        }
        for (Object obj : ((LinkedHashMap) yhu.LIZ).keySet()) {
            if (linkedHashMap.containsKey(obj)) {
                yhu.LIZ.remove(obj);
            }
        }
        if (arrayList.isEmpty() && (!yhu.LIZ.isEmpty())) {
            yhu.LIZLLL++;
        } else {
            yhu.LIZLLL = 0;
        }
    }

    @Override // X.InterfaceC48722JAg
    public final void LJIILLIIL(Aweme aweme) {
        if (this.LJIIJ || C55511LqV.LJIIIIZZ(aweme) || aweme == null) {
            return;
        }
        ((LinkedHashMap) this.LJI).clear();
        this.LIZLLL = 0L;
        this.LJ.removeCallbacks((Runnable) this.LJIIL.getValue());
    }

    @Override // X.InterfaceC87123YHf
    public final void LJIJ(boolean z) {
        this.LJIIJ = z;
    }

    public final void LJIL(YHX yhx) {
        int i;
        int i2;
        if (!this.LJIIIIZZ) {
            C38423F6d.LIZ.getClass();
            boolean LIZIZ = C38422F6c.LIZIZ();
            this.LJIIIIZZ = LIZIZ;
            if (!LIZIZ) {
                return;
            }
        }
        int ordinal = yhx.ordinal();
        String str = this.LJII;
        String jVar = C87121YHd.LIZ().pitayaReRankAbParams.toString();
        o.LJIIIIZZ(jVar, "get().pitayaReRankAbParams.toString()");
        C87121YHd.LIZ();
        YHK yhk = new YHK(ordinal, str, jVar, null);
        YHS yhs = YHS.LIZ;
        C55063LjH c55063LjH = this.LJFF;
        yhs.getClass();
        List LIZ = YHS.LIZ(c55063LjH);
        java.util.Map<String, YHV> map = this.LJI;
        C55063LjH c55063LjH2 = this.LJFF;
        if (c55063LjH2 != null) {
            i = c55063LjH2.LIZ();
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList();
        int size = LIZ.size();
        int i3 = ((size - i) - 1) + C87121YHd.LIZ().recentPitayaCount;
        if (i3 <= size) {
            size = i3;
        }
        Iterator it = ORZ.LLILZ(size, LIZ).iterator();
        while (it.hasNext()) {
            Object obj = ((LinkedHashMap) map).get(((Aweme) it.next()).getAid());
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        int size2 = LIZ.size();
        if (System.currentTimeMillis() - this.LIZLLL >= ((Number) this.LJIILLIIL.getValue()).longValue() || yhk.LIZ == YHX.ON_ASYNC_API.ordinal()) {
            this.LIZLLL = System.currentTimeMillis();
            C55063LjH c55063LjH3 = this.LJFF;
            if (c55063LjH3 != null) {
                i2 = c55063LjH3.LIZ();
            } else {
                i2 = 0;
            }
            YHS yhs2 = YHS.LIZ;
            C55063LjH c55063LjH4 = this.LJFF;
            yhs2.getClass();
            yhk.LJ = new YHY(size2, i2, this.LIZLLL, YHS.LIZIZ(YHS.LIZ(c55063LjH4)));
            YHT yht = new YHT(yhk, this.LJFF, ((Number) this.LJIIZILJ.getValue()).intValue(), arrayList, this.LJI, this.LIZ.name(), this);
            YHU yhu = this.LIZJ;
            yhu.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (CandidateAdData candidateAdData : ((LinkedHashMap) yhu.LIZ).values()) {
                arrayList2.add(new CandidateAdData(candidateAdData.getFeedStatus(), candidateAdData.getSource(), candidateAdData.getFeedActionData(), candidateAdData.getRankData()));
                candidateAdData.setSource(EnumC42551Gmx.CACHE.ordinal());
            }
            YHI yhi = new YHI(yhu.LIZLLL, yhu.LIZIZ, yhu.LIZJ, yhu.LJ, arrayList2);
            if (C87121YHd.LIZ().enableCallPitaya) {
                String sceneName = this.LIZ.name();
                o.LJIIIZ(sceneName, "sceneName");
                YHZ yhz = C34530Dgs.LIZ.get(sceneName);
                if (yhz == null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("start Error:");
                    LIZ2.append(System.currentTimeMillis());
                    X1D.LIZIZ(LIZ2);
                } else {
                    if (FMX.LIZJ("tt_ad_pitaya_rerank_trace")) {
                        C188727au c188727au = new C188727au();
                        c188727au.LJIIIZ("status", "start_request");
                        c188727au.LIZLLL(yhk.LIZ, "trigger_source");
                        YHY yhy = yhk.LJ;
                        if (yhy != null) {
                            c188727au.LIZLLL(yhy.LJLIL, "item_count");
                            c188727au.LJIIIZ("cur_item_list", yhy.LJLILLLLZI);
                            c188727au.LIZLLL(yhy.LJLJI, "cur_index");
                        }
                        FMX.LJIIL("tt_ad_pitaya_rerank_trace", c188727au.LIZ);
                    }
                    YHJ sceneConfig = yhz.LJLILLLLZI;
                    o.LJIIIZ(sceneConfig, "sceneConfig");
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new YHG());
                    arrayList3.add(new PrepareItemDataHandler());
                    arrayList3.add(new YHF());
                    arrayList3.add(new YHL());
                    YHJ yhj = yhz.LJLILLLLZI;
                    YHH yhh = new YHH(yhj, yhj.LIZIZ);
                    YHO yho = new YHO(yhh);
                    YHJ config = yhz.LJLILLLLZI;
                    o.LJIIIZ(config, "config");
                    ((ArrayList) yho.LIZ).addAll(arrayList3);
                    String valueOf = String.valueOf(System.currentTimeMillis());
                    YHN yhn = new YHN(yhh, valueOf);
                    yhn.LIZJ = yho.LIZ;
                    yhz.LJLJI.put(valueOf, yhn);
                    yhh.LJ = yhk;
                    yhh.LIZJ = ORZ.LLJILJILJ(arrayList);
                    yhh.LIZLLL = yhi;
                    C10K.LIZJ(new ACallableS41S0400000_15(yhn, yht, yhz, yhk, 0));
                }
            }
            this.LJ.removeCallbacks((Runnable) this.LJIIL.getValue());
            Handler handler = this.LJ;
            Runnable runnable = (Runnable) this.LJIIL.getValue();
            o.LJI(runnable);
            handler.postDelayed(runnable, ((Number) this.LJIILL.getValue()).longValue());
        }
    }

    @Override // X.InterfaceC48722JAg
    public final void LJ(String str, List list) {
        boolean z;
        String str2;
        if (!((ArrayList) list).isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                Aweme aweme = (Aweme) it.next();
                if (aweme != null) {
                    String aid = aweme.getAid();
                    o.LJIIIIZZ(aid, "aweme.aid");
                    int value = YHW.UNSHOWN_ADJUSTABLE.getValue();
                    FeedActionData feedActionData = new FeedActionData(0L, 1, null);
                    RankData.Companion.getClass();
                    YHV yhv = new YHV(aid, value, feedActionData, C72074SQk.LIZ(aweme));
                    java.util.Map<String, YHV> map = this.LJI;
                    String aid2 = aweme.getAid();
                    o.LJIIIIZZ(aid2, "aweme.aid");
                    map.put(aid2, yhv);
                    aweme.isAd();
                }
            }
        }
        YHU yhu = this.LIZJ;
        yhu.getClass();
        if (str != null && (!ujb.o.LJJJJJL(str))) {
            yhu.LJ = str;
        }
        ArrayList arrayList = (ArrayList) list;
        if (!arrayList.isEmpty()) {
            Iterator it2 = ((LinkedHashMap) yhu.LIZ).entrySet().iterator();
            while (it2.hasNext()) {
                CandidateAdData candidateAdData = (CandidateAdData) ((Map.Entry) it2.next()).getValue();
                AwemeRawAd awemeRawAd = candidateAdData.getRankData().getOriginItem().getAwemeRawAd();
                if (awemeRawAd != null) {
                    C58644Mzw c58644Mzw = new C58644Mzw();
                    N22.LIZ.getClass();
                    C58653N0f c58653N0f = N22.LIZIZ;
                    String creativeIdStr = awemeRawAd.getCreativeIdStr();
                    o.LJIIIIZZ(creativeIdStr, "ad.creativeIdStr");
                    String logExtra = awemeRawAd.getLogExtra();
                    Long groupId = awemeRawAd.getGroupId();
                    if (groupId != null) {
                        str2 = String.valueOf(groupId);
                    } else {
                        str2 = null;
                    }
                    c58644Mzw.LIZJ(c58653N0f, creativeIdStr, logExtra, str2, new AqS176S0100000_10(candidateAdData, 251));
                }
            }
            ((LinkedHashMap) yhu.LIZ).clear();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Aweme aweme2 = (Aweme) it3.next();
                if (aweme2 != null) {
                    int value2 = YHW.UNSHOWN_ADJUSTABLE.getValue();
                    int ordinal = EnumC42551Gmx.NEW.ordinal();
                    FeedActionData feedActionData2 = new FeedActionData(0L, 1, null);
                    RankData.Companion.getClass();
                    CandidateAdData candidateAdData2 = new CandidateAdData(value2, ordinal, feedActionData2, C72074SQk.LIZ(aweme2));
                    java.util.Map<String, CandidateAdData> map2 = yhu.LIZ;
                    String aid3 = aweme2.getAid();
                    o.LJIIIIZZ(aid3, "aweme.aid");
                    map2.put(aid3, candidateAdData2);
                }
            }
        }
        LJIL(YHX.ON_ASYNC_API);
    }

    @Override // X.InterfaceC48722JAg
    public final void LJII(Aweme aweme, String str) {
        aweme.isAd();
        YHV yhv = (YHV) ((LinkedHashMap) this.LJI).get(str);
        if (yhv != null && yhv.getRankData().getRollAdData() == null) {
            RankData rankData = yhv.getRankData();
            int value = YHW.UNSHOWN_ADJUSTABLE.getValue();
            FeedActionData feedActionData = new FeedActionData(0L, 1, null);
            RankData.Companion.getClass();
            rankData.setRollAdData(new RollAdData(value, feedActionData, C72074SQk.LIZ(aweme)));
        }
        java.util.Map<String, YHV> map = this.LJI;
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "midAdAweme.aid");
        String aid2 = aweme.getAid();
        o.LJIIIIZZ(aid2, "midAdAweme.aid");
        int value2 = YHW.UNSHOWN_NONADJUSTABLE.getValue();
        FeedActionData feedActionData2 = new FeedActionData(0L, 1, null);
        RankData.Companion.getClass();
        map.put(aid, new YHV(aid2, value2, feedActionData2, C72074SQk.LIZ(aweme)));
    }

    @Override // X.InterfaceC48722JAg
    public final void LJIIZILJ(int i, Aweme aweme) {
        this.LJ.postDelayed(new ARunnableS18S0201000_15(i, this, aweme, 6), ((Number) this.LJIJ.getValue()).longValue());
    }

    public static void LJIJJLI(java.util.Map map, YHW yhw, String str) {
        YHV yhv = (YHV) map.get(str);
        if (yhv != null) {
            map.put(str, new YHV(yhv.getId(), yhw.getValue(), yhv.getFeedActionData(), yhv.getRankData()));
        }
    }

    @Override // X.InterfaceC48722JAg
    public final void LJIIJJI(long j, String str, String str2) {
        RankData rankData;
        RollAdData rollAdData;
        YHV yhv;
        RankData rankData2;
        if (str == null || str2 == null) {
            return;
        }
        YHV yhv2 = (YHV) ((LinkedHashMap) this.LJI).get(str);
        if (yhv2 != null && (rankData = yhv2.getRankData()) != null && (rollAdData = rankData.getRollAdData()) != null && (yhv = (YHV) ((LinkedHashMap) this.LJI).get(str)) != null && (rankData2 = yhv.getRankData()) != null) {
            rankData2.setRollAdData(new RollAdData(YHW.SHOWN.getValue(), new FeedActionData(j), rollAdData.getRankData()));
        }
        YHV yhv3 = (YHV) ((LinkedHashMap) this.LJI).get(str2);
        if (yhv3 != null) {
            this.LJI.put(str2, new YHV(yhv3.getId(), YHW.SHOWN.getValue(), new FeedActionData(j), yhv3.getRankData()));
        }
    }
}
