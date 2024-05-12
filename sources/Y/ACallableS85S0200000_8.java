package Y;

import X.AbstractC36908Ee8;
import X.AbstractC51036K1g;
import X.ActivityC45651qj;
import X.C17N;
import X.C32I;
import X.C36922EeM;
import X.C38987FRv;
import X.C39061g6;
import X.C3A5;
import X.C45804HyK;
import X.C46728IVo;
import X.C47497IkX;
import X.C48658J7u;
import X.C49571Jct;
import X.C49574Jcw;
import X.C50032JkK;
import X.C50321Joz;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50948Jz6;
import X.C51141K5h;
import X.C51249K9l;
import X.C51307KBr;
import X.C55457Lpd;
import X.C61200O0e;
import X.C62814Ol0;
import X.C65777Prh;
import X.C76800UCe;
import X.HH1;
import X.IPG;
import X.JTO;
import X.K7T;
import X.KAN;
import X.KCC;
import X.OSZ;
import android.R;
import android.app.Activity;
import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.bullet.bridge.framework.OpenAwemeDetailMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.OpenFeedsFlowMethod;
import com.ss.android.ugc.aweme.discover.model.SearchOperation;
import com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugContextAbility;
import com.ss.android.ugc.aweme.ecommerce.search.sug.repo.EcSearchSugResponse;
import com.ss.android.ugc.aweme.ecommerce.search.sug.vm.EcSearchSugAssemVM;
import com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcAbstractSearchIntermediateFragmentNew;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.ecommerce.SearchMiddleForEcService;
import com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApi;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class ACallableS85S0200000_8 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case 9:
                return call$9(this);
            case 10:
                return call$10(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS85S0200000_8 aCallableS85S0200000_8) {
        AbstractC51036K1g abstractC51036K1g;
        Activity LJIJJ;
        Activity LJIJJ2;
        Context context = ((OpenAwemeDetailMethod) aCallableS85S0200000_8.l0).getContext();
        if (context != null && (LJIJJ2 = C45804HyK.LJIJJ(context)) != null) {
            abstractC51036K1g = (AbstractC51036K1g) LJIJJ2.findViewById(R.id.content).getTag(com.zhiliaoapp.musically.R.id.asv);
        } else {
            abstractC51036K1g = null;
        }
        C55457Lpd.LJLJJLL = abstractC51036K1g;
        Context context2 = ((OpenAwemeDetailMethod) aCallableS85S0200000_8.l0).getContext();
        if (context2 == null || (LJIJJ = C45804HyK.LJIJJ(context2)) == null) {
            return null;
        }
        return Boolean.valueOf(C61200O0e.LIZLLL().LJI(LJIJJ, ((C39061g6) aCallableS85S0200000_8.l1).LIZJ()));
    }

    public static final Object call$1(ACallableS85S0200000_8 aCallableS85S0200000_8) {
        Activity LJIJJ;
        C55457Lpd.LJLJJLL = ((OpenFeedsFlowMethod) aCallableS85S0200000_8.l0).LIZJ();
        Context context = ((OpenFeedsFlowMethod) aCallableS85S0200000_8.l0).getContext();
        if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
            return Boolean.valueOf(C61200O0e.LIZLLL().LJI(LJIJJ, ((C39061g6) aCallableS85S0200000_8.l1).LIZJ()));
        }
        return null;
    }

    public static final Object call$10(ACallableS85S0200000_8 aCallableS85S0200000_8) {
        C50032JkK c50032JkK = (C50032JkK) aCallableS85S0200000_8.l0;
        String str = c50032JkK.LIZ;
        long j = c50032JkK.LJII;
        String str2 = c50032JkK.LIZIZ;
        String str3 = c50032JkK.LIZJ;
        String str4 = c50032JkK.LIZLLL;
        Integer num = (Integer) aCallableS85S0200000_8.l1;
        HH1.LIZ(str, "keyword", str2, "roomInfoListString", str4, "searchId");
        try {
            SearchLiveList searchLiveList = SearchApi.LIZ().searchLiveList(j, str, 20, "load_more_general_list", str3, str4, "", str2, "", "", "", num, null, Long.valueOf(C17N.LJJJJLL().IO().LIZJ().LJLIL)).get();
            o.LJIIIIZZ(searchLiveList, "RETROFIT.searchLiveList(…ionId\n            ).get()");
            SearchLiveList searchLiveList2 = searchLiveList;
            ((C50032JkK) aCallableS85S0200000_8.l0).LJII = searchLiveList2.cursor;
            List<SearchLiveStruct> LJI = searchLiveList2.LJI();
            o.LJIIIIZZ(LJI, "response.liveList");
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJI, 10));
            Iterator it = ((ArrayList) LJI).iterator();
            while (it.hasNext()) {
                arrayList.add(((SearchLiveStruct) it.next()).getLiveAweme());
            }
            return new OSZ(searchLiveList2, arrayList);
        } catch (ExecutionException e) {
            RuntimeException compatibleException = AbstractC36908Ee8.getCompatibleException(e);
            o.LJIIIIZZ(compatibleException, "getCompatibleException(e)");
            throw compatibleException;
        }
    }

    public static final Object call$2(ACallableS85S0200000_8 aCallableS85S0200000_8) {
        String str;
        String str2;
        String str3;
        Object obj;
        Integer num;
        Map map;
        String str4;
        EcSearchSugResponse ecSearchSugResponse = (EcSearchSugResponse) aCallableS85S0200000_8.l0;
        List<SearchSugEntity> filteredList = ecSearchSugResponse.sugList;
        if (o.LJ("1", ecSearchSugResponse.sugVirtualEnable)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<SearchSugEntity> list = ((EcSearchSugResponse) aCallableS85S0200000_8.l0).sugList;
            o.LJIIIIZZ(list, "response.sugList");
            for (SearchSugEntity searchSugEntity : list) {
                if (searchSugEntity.sugExtraInfo.isRichSug()) {
                    str4 = "enrich_sug";
                } else {
                    str4 = "normal_sug";
                }
                arrayList2.add(str4);
                String str5 = searchSugEntity.content;
                o.LJIIIIZZ(str5, "entity.content");
                arrayList.add(str5);
            }
            ISearchMiddleForECService LJJJJLI = SearchMiddleForEcService.LJJJJLI();
            C51141K5h c51141K5h = C51141K5h.LIZ;
            ActivityC45651qj mo49getActivity = ((EcAbstractSearchIntermediateFragmentNew) aCallableS85S0200000_8.l1).mo49getActivity();
            c51141K5h.getClass();
            if (C51141K5h.LIZ(mo49getActivity)) {
                LJJJJLI.LJIIZILJ(arrayList2);
                LJJJJLI.LJIJJ(arrayList);
                LJJJJLI.LJIJI();
            } else {
                ((ArrayList) C51249K9l.LIZLLL).add(arrayList2);
                ((ArrayList) C51249K9l.LIZJ).add(arrayList);
            }
        }
        o.LJIIIIZZ(filteredList, "filteredList");
        if (!filteredList.isEmpty()) {
            ((EcAbstractSearchIntermediateFragmentNew) aCallableS85S0200000_8.l1).Rl();
            EcAbstractSearchIntermediateFragmentNew ecAbstractSearchIntermediateFragmentNew = (EcAbstractSearchIntermediateFragmentNew) aCallableS85S0200000_8.l1;
            EcSearchSugResponse ecSearchSugResponse2 = (EcSearchSugResponse) aCallableS85S0200000_8.l0;
            ecAbstractSearchIntermediateFragmentNew.getClass();
            String LIZIZ = C3A5.LIZ.LIZIZ(ecAbstractSearchIntermediateFragmentNew.Ml().LJLILLLLZI);
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            String str6 = ecSearchSugResponse2.LJLJI;
            String str7 = "";
            if (str6 == null) {
                str6 = "";
            }
            concurrentHashMap.put("raw_query", str6);
            RecommendWordMob recommendWordMob = ecSearchSugResponse2.recommendWordMob;
            if (recommendWordMob == null || (str = recommendWordMob.getInfo()) == null) {
                str = "";
            }
            concurrentHashMap.put("info", str);
            concurrentHashMap.put("sug_session_id", "");
            LogPbBean logPbBean = ecSearchSugResponse2.logPb;
            String str8 = null;
            if (logPbBean == null || (str2 = logPbBean.getImprId()) == null) {
                str2 = "";
            }
            concurrentHashMap.put("impr_id", str2);
            if (LIZIZ == null) {
                LIZIZ = "";
            }
            concurrentHashMap.put("log_pb", LIZIZ);
            String Ll = ecAbstractSearchIntermediateFragmentNew.Ll();
            if (Ll != null) {
                str7 = Ll;
            }
            concurrentHashMap.put("search_position", str7);
            int size = ((EcSearchSugResponse) aCallableS85S0200000_8.l0).sugList.size();
            for (int i = 0; i < size; i++) {
                ((SearchSugEntity) ListProtector.get(((EcSearchSugResponse) aCallableS85S0200000_8.l0).sugList, i)).LIZLLL = concurrentHashMap;
            }
            EcAbstractSearchIntermediateFragmentNew ecAbstractSearchIntermediateFragmentNew2 = (EcAbstractSearchIntermediateFragmentNew) aCallableS85S0200000_8.l1;
            EcSearchSugResponse ecSearchSugResponse3 = (EcSearchSugResponse) aCallableS85S0200000_8.l0;
            ecAbstractSearchIntermediateFragmentNew2.getClass();
            C50948Jz6 c50948Jz6 = JTO.LIZ(ecAbstractSearchIntermediateFragmentNew2.mo49getActivity()).LJLIL;
            String Kl = ecAbstractSearchIntermediateFragmentNew2.Kl();
            if (c50948Jz6 != null && c50948Jz6.getLastSearchPosition() != null) {
                str3 = c50948Jz6.getLastSearchPosition();
            } else {
                C50651JuJ c50651JuJ = C50652JuK.Companion;
                ActivityC45651qj mo49getActivity2 = ecAbstractSearchIntermediateFragmentNew2.mo49getActivity();
                c50651JuJ.getClass();
                C50321Joz LJIIJJI = C50651JuJ.LJIIJJI(mo49getActivity2);
                if (LJIIJJI == null || (str3 = LJIIJJI.getSearchPosition()) == null || str3.length() <= 0) {
                    str3 = Kl;
                }
            }
            String str9 = C51307KBr.LIZ;
            if (c50948Jz6 != null && c50948Jz6.obtainEcLogData("search_entrance") != null) {
                Kl = String.valueOf(c50948Jz6.obtainEcLogData("search_entrance"));
            }
            KCC kcc = new KCC();
            kcc.LJIILL("search_position", str3);
            Object obtainLogData = JTO.LIZ(ecAbstractSearchIntermediateFragmentNew2.mo49getActivity()).hv0().obtainLogData("tab_name");
            if (obtainLogData != null) {
                kcc.LIZLLL("tab_name", obtainLogData.toString());
            }
            if (C62814Ol0.LJIJJ(c50948Jz6)) {
                kcc.LJIILL("EVENT_ORIGIN_FEATURE", "TEMAI");
            }
            if (c50948Jz6 != null) {
                obj = c50948Jz6.obtainEcLogData("ec_middle_extra_log_params");
            } else {
                obj = null;
            }
            if (C65777Prh.LJII(obj) && (map = (Map) obj) != null) {
                for (Map.Entry entry : map.entrySet()) {
                    kcc.LJIILL((String) entry.getKey(), (String) entry.getValue());
                }
            }
            List<SearchSugEntity> list2 = ecSearchSugResponse3.sugList;
            if (list2 != null) {
                num = Integer.valueOf(list2.size());
            } else {
                num = null;
            }
            kcc.LJIILL("words_num", String.valueOf(num));
            RecommendWordMob recommendWordMob2 = ecSearchSugResponse3.recommendWordMob;
            if (recommendWordMob2 != null) {
                str8 = recommendWordMob2.getWordsSource();
            }
            kcc.LJIILL("words_source", str8);
            kcc.LIZ(concurrentHashMap);
            kcc.LJIILL("new_sug_session_id", str9);
            kcc.LJIILL("search_entrance", Kl);
            kcc.LJIILIIL();
        }
        return filteredList;
    }

    public static final Object call$3(ACallableS85S0200000_8 aCallableS85S0200000_8) {
        AbstractC51036K1g abstractC51036K1g;
        Activity activity = (Activity) ((com.ss.android.ugc.aweme.fe.method.OpenAwemeDetailMethod) aCallableS85S0200000_8.l0).getActContext();
        if (activity != null) {
            abstractC51036K1g = (AbstractC51036K1g) activity.findViewById(R.id.content).getTag(com.zhiliaoapp.musically.R.id.asv);
        } else {
            abstractC51036K1g = null;
        }
        C55457Lpd.LJLJJLL = abstractC51036K1g;
        C61200O0e LIZLLL = C61200O0e.LIZLLL();
        Context context = ((com.ss.android.ugc.aweme.fe.method.OpenAwemeDetailMethod) aCallableS85S0200000_8.l0).mContextRef.get();
        o.LJI(context);
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        o.LJI(LJIJJ);
        return Boolean.valueOf(LIZLLL.LJI(LJIJJ, ((C39061g6) aCallableS85S0200000_8.l1).LIZJ()));
    }

    public static final Object call$4(ACallableS85S0200000_8 aCallableS85S0200000_8) {
        AbstractC51036K1g abstractC51036K1g;
        Activity activity = (Activity) ((com.ss.android.ugc.aweme.fe.method.OpenFeedsFlowMethod) aCallableS85S0200000_8.l0).getActContext();
        Activity activity2 = null;
        if (activity != null) {
            abstractC51036K1g = (AbstractC51036K1g) activity.findViewById(R.id.content).getTag(com.zhiliaoapp.musically.R.id.asv);
        } else {
            abstractC51036K1g = null;
        }
        C55457Lpd.LJLJJLL = abstractC51036K1g;
        C61200O0e LIZLLL = C61200O0e.LIZLLL();
        Context context = ((com.ss.android.ugc.aweme.fe.method.OpenFeedsFlowMethod) aCallableS85S0200000_8.l0).mContextRef.get();
        if (context != null) {
            activity2 = C45804HyK.LJIJJ(context);
        }
        o.LJI(activity2);
        return Boolean.valueOf(LIZLLL.LJI(activity2, ((C39061g6) aCallableS85S0200000_8.l1).LIZJ()));
    }

    public static final Object call$5(ACallableS85S0200000_8 aCallableS85S0200000_8) {
        int i;
        String videoUrlModel;
        try {
            int videoLength = ((Video) aCallableS85S0200000_8.l0).getVideoLength();
            JSONObject jSONObject = new JSONObject();
            IPG ipg = (IPG) aCallableS85S0200000_8.l1;
            Video video = (Video) aCallableS85S0200000_8.l0;
            jSONObject.put("error_code", String.valueOf(ipg.LJ));
            jSONObject.put("error_internal_code", String.valueOf(ipg.LJFF));
            jSONObject.put("error_info", ipg.LJI.toString());
            int i2 = 1;
            if (ipg.LIZIZ) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_bytevc1", String.valueOf(i));
            if (!ipg.LIZLLL) {
                i2 = 0;
            }
            jSONObject.put("is_dash", String.valueOf(i2));
            jSONObject.put("is_ad", CardStruct.IStatusCode.DEFAULT);
            jSONObject.put("vduration", videoLength * 1000);
            jSONObject.put("internet_speed", String.valueOf(C47497IkX.LIZJ()));
            jSONObject.put("cache_size", String.valueOf(C46728IVo.LJ(video.getPlayAddr())));
            jSONObject.put("video_size", String.valueOf(C46728IVo.LJIIIZ(video.getPlayAddr())));
            if (video.getPlayAddr() == null) {
                videoUrlModel = "null";
            } else {
                videoUrlModel = video.getPlayAddr().toString();
                o.LJIIIIZZ(videoUrlModel, "video.playAddr.toString()");
            }
            jSONObject.put("play_url", videoUrlModel);
            jSONObject.put("is_from_feed_cache", CardStruct.IStatusCode.DEFAULT);
            jSONObject.put("enter_from", "TEMAI");
            Boolean LIZLLL = C38987FRv.LIZLLL();
            o.LJIIIIZZ(LIZLLL, "isFirstInstallAndFirstLaunch()");
            jSONObject.put("is_cold_start_first_launch", LIZLLL.booleanValue() ? 1 : 0);
            C48658J7u.LIZIZ("video_play_failed", jSONObject);
        } catch (Exception e) {
            C36922EeM.LIZ(e);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$6(ACallableS85S0200000_8 aCallableS85S0200000_8) {
        String str;
        String str2;
        String str3;
        Object obj;
        Integer num;
        Map map;
        Object obtainLogData;
        KAN Vk0;
        String str4;
        EcSearchSugAssemVM ecSearchSugAssemVM = (EcSearchSugAssemVM) aCallableS85S0200000_8.l0;
        String str5 = ((EcSearchSugResponse) aCallableS85S0200000_8.l1).requestId;
        o.LJIIIIZZ(str5, "response.requestId");
        EcSearchSugResponse sourceData = (EcSearchSugResponse) aCallableS85S0200000_8.l1;
        ecSearchSugAssemVM.getClass();
        o.LJIIIZ(sourceData, "sourceData");
        List<SearchSugEntity> filteredList = sourceData.sugList;
        if (o.LJ("1", sourceData.sugVirtualEnable)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<SearchSugEntity> list = sourceData.sugList;
            o.LJIIIIZZ(list, "sourceData.sugList");
            for (SearchSugEntity searchSugEntity : list) {
                if (searchSugEntity.sugExtraInfo.isRichSug()) {
                    str4 = "enrich_sug";
                } else {
                    str4 = "normal_sug";
                }
                arrayList2.add(str4);
                String str6 = searchSugEntity.content;
                o.LJIIIIZZ(str6, "entity.content");
                arrayList.add(str6);
            }
            ISearchSugContextAbility iSearchSugContextAbility = ecSearchSugAssemVM.LJLILLLLZI;
            if (iSearchSugContextAbility != null) {
                iSearchSugContextAbility.YH(arrayList2);
            }
        }
        o.LJIIIIZZ(filteredList, "filteredList");
        if (!filteredList.isEmpty()) {
            String str7 = ecSearchSugAssemVM.LJLJJL;
            ISearchSugContextAbility iSearchSugContextAbility2 = ecSearchSugAssemVM.LJLILLLLZI;
            String str8 = "";
            if (iSearchSugContextAbility2 == null || (Vk0 = iSearchSugContextAbility2.Vk0()) == null || (str = Vk0.LIZJ) == null) {
                str = "";
            }
            K7T.LIZIZ(str7, null, str5, null, str, "show");
            String iv0 = ecSearchSugAssemVM.iv0();
            String LIZIZ = C3A5.LIZ.LIZIZ(str5);
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            String str9 = sourceData.LJLJI;
            if (str9 == null) {
                str9 = "";
            }
            concurrentHashMap.put("raw_query", str9);
            RecommendWordMob recommendWordMob = sourceData.recommendWordMob;
            if (recommendWordMob == null || (str2 = recommendWordMob.getInfo()) == null) {
                str2 = "";
            }
            concurrentHashMap.put("info", str2);
            concurrentHashMap.put("sug_session_id", "");
            LogPbBean logPbBean = sourceData.logPb;
            String str10 = null;
            if (logPbBean == null || (str3 = logPbBean.getImprId()) == null) {
                str3 = "";
            }
            concurrentHashMap.put("impr_id", str3);
            if (LIZIZ != null) {
                str8 = LIZIZ;
            }
            concurrentHashMap.put("log_pb", str8);
            concurrentHashMap.put("search_position", iv0);
            int size = sourceData.sugList.size();
            for (int i = 0; i < size; i++) {
                ((SearchSugEntity) ListProtector.get(sourceData.sugList, i)).LIZLLL = concurrentHashMap;
            }
            String hv0 = ecSearchSugAssemVM.hv0();
            String iv02 = ecSearchSugAssemVM.iv0();
            C50948Jz6 c50948Jz6 = ecSearchSugAssemVM.LJLJI;
            String str11 = C51307KBr.LIZ;
            if (c50948Jz6 != null && c50948Jz6.obtainEcLogData("search_entrance") != null) {
                hv0 = String.valueOf(c50948Jz6.obtainEcLogData("search_entrance"));
            }
            KCC kcc = new KCC();
            kcc.LJIILL("search_position", iv02);
            if (c50948Jz6 != null && (obtainLogData = c50948Jz6.obtainLogData("tab_name")) != null) {
                kcc.LIZLLL("tab_name", obtainLogData.toString());
            }
            if (C62814Ol0.LJIJJ(c50948Jz6)) {
                kcc.LJIILL("EVENT_ORIGIN_FEATURE", "TEMAI");
            }
            if (c50948Jz6 != null) {
                obj = c50948Jz6.obtainEcLogData("ec_middle_extra_log_params");
            } else {
                obj = null;
            }
            if (C65777Prh.LJII(obj) && (map = (Map) obj) != null) {
                for (Map.Entry entry : map.entrySet()) {
                    kcc.LJIILL((String) entry.getKey(), (String) entry.getValue());
                }
            }
            List<SearchSugEntity> list2 = sourceData.sugList;
            if (list2 != null) {
                num = Integer.valueOf(list2.size());
            } else {
                num = null;
            }
            kcc.LJIILL("words_num", String.valueOf(num));
            RecommendWordMob recommendWordMob2 = sourceData.recommendWordMob;
            if (recommendWordMob2 != null) {
                str10 = recommendWordMob2.getWordsSource();
            }
            kcc.LJIILL("words_source", str10);
            kcc.LIZ(concurrentHashMap);
            kcc.LJIILL("new_sug_session_id", str11);
            kcc.LJIILL("search_entrance", hv0);
            kcc.LJIILIIL();
        }
        return filteredList;
    }

    public static final Object call$7(ACallableS85S0200000_8 aCallableS85S0200000_8) {
        C49574Jcw c49574Jcw = new C49574Jcw();
        c49574Jcw.LJIIZILJ("log_pb", ((C49571Jct) aCallableS85S0200000_8.l0).LJLJL().LJIIIIZZ);
        c49574Jcw.LJIIZILJ("card_id", ((SearchOperation) aCallableS85S0200000_8.l1).getCardId());
        c49574Jcw.LJIJI(((C49571Jct) aCallableS85S0200000_8.l0).LJLJL().LJFF);
        c49574Jcw.LJIIZILJ("search_keyword", ((C49571Jct) aCallableS85S0200000_8.l0).LJLJL().LJ);
        c49574Jcw.LJIILIIL();
        return C76800UCe.LIZ;
    }

    public static final Object call$8(ACallableS85S0200000_8 aCallableS85S0200000_8) {
        int i;
        String videoUrlModel;
        try {
            int videoLength = ((Video) aCallableS85S0200000_8.l0).getVideoLength();
            JSONObject jSONObject = new JSONObject();
            IPG ipg = (IPG) aCallableS85S0200000_8.l1;
            Video video = (Video) aCallableS85S0200000_8.l0;
            jSONObject.put("error_code", String.valueOf(ipg.LJ));
            jSONObject.put("error_internal_code", String.valueOf(ipg.LJFF));
            jSONObject.put("error_info", ipg.LJI.toString());
            int i2 = 1;
            if (ipg.LIZIZ) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_bytevc1", String.valueOf(i));
            if (!ipg.LIZLLL) {
                i2 = 0;
            }
            jSONObject.put("is_dash", String.valueOf(i2));
            jSONObject.put("is_ad", CardStruct.IStatusCode.DEFAULT);
            jSONObject.put("vduration", videoLength * 1000);
            jSONObject.put("internet_speed", String.valueOf(C47497IkX.LIZJ()));
            jSONObject.put("cache_size", String.valueOf(C46728IVo.LJ(video.getPlayAddr())));
            jSONObject.put("video_size", String.valueOf(C46728IVo.LJIIIZ(video.getPlayAddr())));
            if (video.getPlayAddr() == null) {
                videoUrlModel = "null";
            } else {
                videoUrlModel = video.getPlayAddr().toString();
                o.LJIIIIZZ(videoUrlModel, "video.playAddr.toString()");
            }
            jSONObject.put("play_url", videoUrlModel);
            jSONObject.put("is_from_feed_cache", CardStruct.IStatusCode.DEFAULT);
            jSONObject.put("enter_from", "TEMAI");
            Boolean LIZLLL = C38987FRv.LIZLLL();
            o.LJIIIIZZ(LIZLLL, "isFirstInstallAndFirstLaunch()");
            jSONObject.put("is_cold_start_first_launch", LIZLLL.booleanValue() ? 1 : 0);
            C48658J7u.LIZIZ("video_play_failed", jSONObject);
        } catch (Exception e) {
            C36922EeM.LIZ(e);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:239:0x0637, code lost:
    
        if (r1 == null) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0182, code lost:
    
        if (r13 == false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0960  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x093b A[LOOP:1: B:262:0x0935->B:264:0x093b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x08cc  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0903  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x090f  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0927  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0957  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$9(Y.ACallableS85S0200000_8 r15) {
        /*
            Method dump skipped, instructions count: 2574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS85S0200000_8.call$9(Y.ACallableS85S0200000_8):java.lang.Object");
    }

    public ACallableS85S0200000_8(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
