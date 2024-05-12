package com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel;

import X.C00F;
import X.C35651Dyx;
import X.C36034ECg;
import X.InterfaceC50037JkP;
import X.InterfaceC55235Lm3;
import X.KFR;
import X.KFU;
import X.T2R;
import X.XKQ;
import X.XKX;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.result.common.core.model.EComCreatorSearchStruct;
import com.ss.android.ugc.aweme.result.common.core.model.EComMallLiveTabCardStruct;
import com.ss.android.ugc.aweme.result.common.core.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class LiveVerticalViewModel extends AssemViewModel<C35651Dyx> {
    public final Gson LJLIL;
    public final List<Aweme> LJLILLLLZI;
    public Boolean LJLJI;
    public InterfaceC50037JkP LJLJJI;
    public final Map<String, String> LJLJJL;
    public long LJLJJLL;
    public List<Aweme> LJLJL;
    public HashMap<String, String> LJLJLJ;
    public String LJLJLLL;
    public XKQ LJLL;
    public InterfaceC55235Lm3 LJLLI;
    public KFR LJLLILLLL;
    public final KFU LJLLJ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C35651Dyx defaultState() {
        return new C35651Dyx(0);
    }

    public LiveVerticalViewModel() {
        Gson LIZ = GsonHolder.LIZLLL().LIZ();
        o.LJIIIIZZ(LIZ, "get().gson");
        this.LJLIL = LIZ;
        this.LJLILLLLZI = new ArrayList();
        this.LJLJI = Boolean.TRUE;
        this.LJLJJL = new LinkedHashMap();
        this.LJLJL = new ArrayList();
        this.LJLLJ = new KFU(this);
    }

    public final List<Aweme> gv0(List<EComMallLiveTabCardStruct> list) {
        Aweme aweme;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (EComMallLiveTabCardStruct eComMallLiveTabCardStruct : list) {
                EComCreatorSearchStruct eComCreatorSearchStruct = eComMallLiveTabCardStruct.creatorCardInfo;
                Aweme aweme2 = null;
                if (eComCreatorSearchStruct != null) {
                    aweme = eComCreatorSearchStruct.liveEntity;
                } else {
                    aweme = null;
                }
                EComShopCardStruct eComShopCardStruct = eComMallLiveTabCardStruct.shopCardInfo;
                if (eComShopCardStruct != null) {
                    aweme2 = eComShopCardStruct.liveEntity;
                }
                if (aweme != null) {
                    arrayList.add(aweme);
                    String str = eComMallLiveTabCardStruct.searchResultId;
                    if (str != null) {
                        Map<String, String> map = this.LJLJJL;
                        String aid = aweme.getAid();
                        o.LJIIIIZZ(aid, "it.aid");
                        map.put(aid, str);
                    }
                }
                if (aweme2 != null) {
                    arrayList.add(aweme2);
                    String str2 = eComMallLiveTabCardStruct.searchResultId;
                    if (str2 != null) {
                        Map<String, String> map2 = this.LJLJJL;
                        String aid2 = aweme2.getAid();
                        o.LJIIIIZZ(aid2, "it.aid");
                        map2.put(aid2, str2);
                    }
                }
            }
        }
        this.LJLJL = arrayList;
        ((ArrayList) this.LJLILLLLZI).addAll(arrayList);
        return arrayList;
    }

    public final String jv0(JSONObject jSONObject) {
        String str;
        List<Object> list = null;
        if (jSONObject == null || (str = jSONObject.optString("traffic_source_list")) == null) {
            str = "[]";
        }
        JSONArray LJJII = T2R.LJJII(str);
        if (LJJII != null) {
            list = JsonExtKt.toList(LJJII);
        }
        String str2 = "";
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                String obj = it.next().toString();
                if (str2.length() == 0) {
                    str2 = obj;
                } else {
                    str2 = C00F.LIZIZ(str2, ',', obj);
                }
            }
        }
        return str2;
    }

    public final void hv0(SearchResultParam searchResultParam, JSONObject jSONObject) {
        ((ArrayList) this.LJLILLLLZI).clear();
        ((LinkedHashMap) this.LJLJJL).clear();
        KFR kfr = this.LJLLILLLL;
        if (kfr != null) {
            kfr.LJ("request_start");
        }
        XKQ xkq = this.LJLL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJLL = XKX.LIZLLL(getAssemVMScope(), null, null, new C36034ECg(jSONObject, this, searchResultParam, null), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|(5:(1:(1:(5:11|12|13|14|(7:16|(4:(2:19|20)(1:26)|21|(1:23)(1:25)|24)|27|(1:29)|30|31|32)(2:34|35))(2:42|43))(5:44|45|46|47|(2:49|50)(4:51|(2:53|54)|14|(0)(0))))(3:56|57|58)|37|(2:(1:40)|41)|31|32)(8:68|69|70|(2:(3:73|74|75)(1:80)|76)|81|82|83|(1:85)(1:86))|59|60|(2:62|63)|47|(0)(0)))|91|6|(0)(0)|59|60|(0)|47|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013b, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f5 A[Catch: Exception -> 0x0135, TryCatch #5 {Exception -> 0x0135, blocks: (B:13:0x00ee, B:14:0x00f1, B:16:0x00f5, B:20:0x00fe, B:21:0x0102, B:23:0x0108, B:24:0x010c, B:27:0x0113, B:29:0x0125, B:30:0x012a, B:34:0x012f, B:35:0x0134), top: B:12:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012f A[Catch: Exception -> 0x0135, TryCatch #5 {Exception -> 0x0135, blocks: (B:13:0x00ee, B:14:0x00f1, B:16:0x00f5, B:20:0x00fe, B:21:0x0102, B:23:0x0108, B:24:0x010c, B:27:0x0113, B:29:0x0125, B:30:0x012a, B:34:0x012f, B:35:0x0134), top: B:12:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf A[Catch: Exception -> 0x0138, TryCatch #4 {Exception -> 0x0138, blocks: (B:46:0x00b8, B:47:0x00bb, B:49:0x00bf, B:51:0x00c2), top: B:45:0x00b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c2 A[Catch: Exception -> 0x0138, TryCatch #4 {Exception -> 0x0138, blocks: (B:46:0x00b8, B:47:0x00bb, B:49:0x00bf, B:51:0x00c2), top: B:45:0x00b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object iv0(com.ss.android.ugc.aweme.search.model.SearchResultParam r18, java.lang.String r19, X.KFN r20, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock<X.InterfaceC36553EWf> r21, X.InterfaceC67352kd<? super X.C76800UCe> r22) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.LiveVerticalViewModel.iv0(com.ss.android.ugc.aweme.search.model.SearchResultParam, java.lang.String, X.KFN, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.2kd):java.lang.Object");
    }
}
