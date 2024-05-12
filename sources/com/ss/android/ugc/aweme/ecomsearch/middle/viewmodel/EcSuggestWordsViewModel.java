package com.ss.android.ugc.aweme.ecomsearch.middle.viewmodel;

import X.ActivityC45651qj;
import X.C10K;
import X.C35361DuH;
import X.C35981EAf;
import X.C36033ECf;
import X.C48658J7u;
import X.C50650JuI;
import X.C50701Jv7;
import X.C50723JvT;
import X.C50764Jw8;
import X.C50948Jz6;
import X.C51090K3i;
import X.C51141K5h;
import X.C51250K9m;
import X.C51253K9p;
import X.C62814Ol0;
import X.KAA;
import X.KAB;
import X.KAG;
import X.KAL;
import X.KAO;
import X.KAT;
import X.KB1;
import X.KB4;
import X.KBX;
import X.KC5;
import X.KDP;
import X.WM7;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecomsearch.repo.EcSuggestWordsApi;
import com.ss.android.ugc.aweme.ecomsearch.utils.EcIntermediatePreload;
import com.ss.android.ugc.aweme.search.ecommerce.SearchMiddleForEcService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class EcSuggestWordsViewModel extends ViewModel {
    public static final /* synthetic */ int LJLJJI = 0;
    public final NextLiveData<Word> LJLIL = new NextLiveData<>();
    public boolean LJLILLLLZI = true;
    public final NextLiveData<C50764Jw8<String>> LJLJI = new NextLiveData<>();

    public final void gv0(C50948Jz6 c50948Jz6, String str, boolean z, String str2, C50650JuI c50650JuI, ActivityC45651qj activityC45651qj) {
        String str3;
        String str4;
        String str5;
        KB4 LJFF;
        String value;
        String str6;
        String str7;
        String str8;
        long j;
        String str9;
        String str10;
        ECSearchEntranceData ecSearchEntranceData;
        String ecUserActions;
        String str11;
        String str12;
        Boolean bool;
        Long l;
        ECSearchEntranceData ecSearchEntranceData2;
        int i = 0;
        ISearchMiddleForECService LJJJJLI = SearchMiddleForEcService.LJJJJLI();
        C51253K9p c51253K9p = C51253K9p.LIZ;
        KAO kao = C51253K9p.LIZIZ;
        if (kao == null || !kao.LJ) {
            c51253K9p.LIZJ();
        }
        JSONObject jSONObject = new JSONObject();
        String str13 = "";
        if (c50948Jz6 == null || (str3 = c50948Jz6.getEnterSearchFrom()) == null) {
            str3 = "";
        }
        jSONObject.put("enter_from", str3);
        jSONObject.put(WM7.SCENE_SERVICE, "guess_word_scene");
        if (c50948Jz6 != null) {
            jSONObject.put("root_enter_from_type", c50948Jz6.getEcSearchEntranceValue());
        }
        C48658J7u.LIZIZ("rd_tiktok_search_intermediate_request_send", jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(WM7.SCENE_SERVICE, "guess");
        jSONObject2.put("step", "request");
        jSONObject2.put("is_force", 0);
        if (c50948Jz6 == null || (str4 = c50948Jz6.getEnterSearchFrom()) == null) {
            str4 = "";
        }
        jSONObject2.put("enter_from", str4);
        if (c50948Jz6 != null) {
            jSONObject2.put("root_enter_from_type", c50948Jz6.getEcSearchEntranceValue());
        }
        C48658J7u.LIZIZ("rd_ec_search_middle_trace", jSONObject2);
        C51141K5h.LIZ.getClass();
        if (C51141K5h.LIZ(activityC45651qj)) {
            if (LJJJJLI != null) {
                LJJJJLI.LJJJJIZL();
            }
        } else {
            KC5 kc5 = KDP.LIZ;
            if (kc5 != null) {
                kc5.LIZIZ = System.currentTimeMillis();
            }
        }
        System.currentTimeMillis();
        KAA kaa = new KAA();
        kaa.LIZ = "100011";
        if (c50948Jz6 != null) {
            str5 = c50948Jz6.getGroupId();
        } else {
            str5 = null;
        }
        kaa.LIZIZ = str5;
        kaa.LIZJ = Integer.valueOf(C50723JvT.LIZ(KBX.LJLIL, KAT.LJLIL));
        if (c50948Jz6 == null || c50948Jz6.getEcSearchEntranceData() == null ? (LJFF = KB1.LJFF(KB1.LIZ(c50948Jz6))) == null || (value = LJFF.getValue()) == null : (ecSearchEntranceData2 = c50948Jz6.getEcSearchEntranceData()) == null || (value = ecSearchEntranceData2.getMiddleReqSource()) == null) {
            value = "";
        }
        kaa.LIZLLL = value;
        if (c50948Jz6 != null && C62814Ol0.LJIIJ(c50948Jz6) && this.LJLILLLLZI) {
            this.LJLILLLLZI = false;
            kaa.LJ = c50948Jz6.getSearchHint();
        }
        if (C51141K5h.LIZ(activityC45651qj)) {
            kaa.LJIIJ = Integer.valueOf(LJJJJLI.LIZLLL(c50650JuI));
            kaa.LJIIJJI = LJJJJLI.LJJIIJZLJL(c50650JuI);
            C50701Jv7 LJJJIL = LJJJJLI.LJJJIL(c50650JuI);
            if (LJJJIL != null) {
                str11 = LJJJIL.LJLJJL;
            } else {
                str11 = null;
            }
            kaa.LJI = str11;
            C50701Jv7 LJJJIL2 = LJJJJLI.LJJJIL(c50650JuI);
            if (LJJJIL2 != null) {
                str12 = LJJJIL2.LJLJJI;
            } else {
                str12 = null;
            }
            kaa.LJII = str12;
            C50701Jv7 LJJJIL3 = LJJJJLI.LJJJIL(c50650JuI);
            if (LJJJIL3 != null) {
                bool = Boolean.valueOf(LJJJIL3.LJLJI);
            } else {
                bool = null;
            }
            if (o.LJ(bool, Boolean.TRUE)) {
                i = 1;
            }
            kaa.LJIIIIZZ = i;
            C50701Jv7 LJJJIL4 = LJJJJLI.LJJJIL(c50650JuI);
            if (LJJJIL4 != null) {
                l = Long.valueOf(LJJJIL4.LJLJLJ);
            } else {
                l = null;
            }
            kaa.LJIIIZ = l;
        } else {
            LinkedHashMap linkedHashMap = (LinkedHashMap) C51090K3i.LIZIZ;
            KAL kal = (KAL) linkedHashMap.get(str);
            if (kal == null || (str6 = kal.LJFF) == null) {
                str6 = "";
            }
            kaa.LJFF = str6;
            KAL kal2 = (KAL) linkedHashMap.get(str);
            if (kal2 == null || (str7 = kal2.LJ) == null) {
                str7 = "";
            }
            kaa.LJI = str7;
            KAL kal3 = (KAL) linkedHashMap.get(str);
            if (kal3 == null || (str8 = kal3.LIZLLL) == null) {
                str8 = "";
            }
            kaa.LJII = str8;
            KAL kal4 = (KAL) linkedHashMap.get(str);
            if (kal4 != null) {
                i = Integer.valueOf(kal4.LIZIZ);
            }
            kaa.LJIIIIZZ = i;
            KAL kal5 = (KAL) linkedHashMap.get(str);
            if (kal5 != null) {
                j = kal5.LJI;
            } else {
                j = 0;
            }
            kaa.LJIIIZ = Long.valueOf(j);
            kaa.LJIIJ = C51090K3i.LIZJ;
            kaa.LJIIJJI = C51090K3i.LIZIZ(str);
        }
        if (c50948Jz6 == null || (str9 = c50948Jz6.getSrcMaterialId()) == null) {
            str9 = "";
        }
        kaa.LJIIL = str9;
        if (c50948Jz6 == null || (str10 = c50948Jz6.getSrcAnchorProductId()) == null) {
            str10 = "";
        }
        kaa.LJIILIIL = str10;
        kaa.LJIILJJIL = str2;
        if (c50948Jz6 != null && (ecSearchEntranceData = c50948Jz6.getEcSearchEntranceData()) != null && (ecUserActions = ecSearchEntranceData.getEcUserActions()) != null) {
            str13 = ecUserActions;
        }
        kaa.LJIILL = str13;
        EcIntermediatePreload.Companion.getClass();
        String str14 = EcIntermediatePreload.ecomUserActions;
        if (str14 == null) {
            str14 = C36033ECf.LIZIZ(Integer.valueOf(C35361DuH.LIZ()), C35981EAf.LIZ(kaa.LJIILL));
        }
        EcIntermediatePreload.ecomUserActions = null;
        Object value2 = EcSuggestWordsApi.LIZ.getValue();
        o.LJIIIIZZ(value2, "<get-S_API>(...)");
        ((EcSuggestWordsApi.SuggestApi) value2).getSuggestWordsWithRawString(kaa.LIZ, kaa.LIZIZ, null, kaa.LJ, kaa.LIZJ, kaa.LIZLLL, KAB.LIZIZ.LIZ().LIZ(), kaa.LJFF, kaa.LJI, kaa.LJII, kaa.LJIIIIZZ, kaa.LJIIIZ, kaa.LJIIJ, kaa.LJIIJJI, kaa.LJIIL, kaa.LJIILIIL, kaa.LJIILJJIL, "grec", KAG.LIZ(false), KAG.LIZ(true), str14).LJ(new C51250K9m(LJJJJLI, activityC45651qj, c50948Jz6, this, z), C10K.LJIIIIZZ, null);
    }
}
