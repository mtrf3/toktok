package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C47261Igj;
import X.C50345JpN;
import X.C50668Jua;
import X.C50669Jub;
import X.C50773JwH;
import X.C50837JxJ;
import X.C50898JyI;
import X.C50948Jz6;
import X.C51282KAs;
import X.C61878OQg;
import X.C76800UCe;
import X.C84763XOl;
import X.EnumC50899JyJ;
import X.EnumC51281KAr;
import X.EnumC61742ba;
import X.F3T;
import X.IGF;
import X.InterfaceC37146Ehy;
import X.InterfaceC50670Juc;
import X.JTO;
import X.KB1;
import X.ORZ;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.discover.model.suggest.TopHistoryWord;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class DeleteSearchHistoryMethod extends BaseBridgeMethod {
    public final String LJLIL;
    public final C50345JpN LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteSearchHistoryMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "deleteSearchHistory";
        this.LJLILLLLZI = new C50345JpN(contextProviderFactory, "deleteSearchHistory");
    }

    public static JSONObject LIZJ(InterfaceC50670Juc interfaceC50670Juc, C50773JwH c50773JwH) {
        List<TopHistoryWord> list;
        String LIZLLL;
        ArrayList arrayList = new ArrayList();
        List<SearchHistory> LIZIZ = interfaceC50670Juc.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "model.searchHistory");
        arrayList.addAll(LIZIZ);
        C76800UCe c76800UCe = null;
        if (c50773JwH != null) {
            list = c50773JwH.LJI(arrayList);
        } else {
            list = null;
        }
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                for (TopHistoryWord topHistoryWord : list) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("word", topHistoryWord.word);
                        jSONObject.put("is_top_word", topHistoryWord.isTopWord);
                        jSONObject.put("icon_type", topHistoryWord.iconType);
                        jSONObject.put("group_id", topHistoryWord.groupId);
                    } catch (Exception unused) {
                    }
                    jSONArray.put(jSONObject);
                }
                c76800UCe = C76800UCe.LIZ;
            }
        }
        if (c76800UCe == null) {
            for (SearchHistory searchHistory : ORZ.LLILLL(arrayList, 20)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("word", searchHistory.keyword);
                jSONArray.put(jSONObject2);
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("history_list", jSONArray);
            if (c50773JwH != null && (LIZLLL = c50773JwH.LIZLLL()) != null) {
                jSONObject3.put("historyTopWordLogId", LIZLLL);
            }
        } catch (Exception unused2) {
        }
        return jSONObject3;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        ECSearchEntranceData eCSearchEntranceData;
        boolean z;
        EnumC61742ba enumC61742ba;
        EnumC61742ba enumC61742ba2;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (this.LJLILLLLZI.LIZ(params, iReturn)) {
            return;
        }
        try {
            String string = JSONObjectProtectorUtils.getString(params, "type");
            params.optString("enterFrom");
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            EnumC51281KAr enumC51281KAr = EnumC51281KAr.DEFAULT;
            if (LJIIIIZZ != null && (LJIIIIZZ instanceof ActivityC45651qj)) {
                C50948Jz6 LIZIZ = JTO.LIZIZ((ActivityC45651qj) LJIIIIZZ);
                C51282KAs c51282KAs = EnumC51281KAr.Companion;
                int LIZ = KB1.LIZ(LIZIZ);
                c51282KAs.getClass();
                enumC51281KAr = C51282KAs.LIZIZ(LIZ);
                z = KB1.LJI(enumC51281KAr);
                if (LIZIZ != null) {
                    eCSearchEntranceData = LIZIZ.getEcSearchEntranceData();
                } else {
                    eCSearchEntranceData = null;
                }
            } else {
                eCSearchEntranceData = null;
                z = false;
            }
            InterfaceC50670Juc LJIIL = C50837JxJ.LJIIL(enumC51281KAr, eCSearchEntranceData);
            C50773JwH LIZ2 = C50668Jua.LIZ(z);
            if (o.LJ(string, CardStruct.IStatusCode.DEFAULT)) {
                C50669Jub.LIZIZ.LIZ().LIZIZ(C61878OQg.INSTANCE, true, enumC51281KAr, eCSearchEntranceData);
                if (z) {
                    if (eCSearchEntranceData != null && eCSearchEntranceData.isEC()) {
                        IEcomSearchService LJJJJZI = EcomSearchServiceImpl.LJJJJZI();
                        if (LJJJJZI != null) {
                            enumC61742ba2 = LJJJJZI.LJJIIJ(eCSearchEntranceData);
                        } else {
                            enumC61742ba2 = null;
                        }
                        if (enumC61742ba2 == EnumC61742ba.EC_SINGLE_ISOLATE) {
                            InterfaceC50670Juc LJIIL2 = C50837JxJ.LJIIL(null, null);
                            Iterator<SearchHistory> it = LJIIL.LIZIZ().iterator();
                            while (it.hasNext()) {
                                LJIIL2.LJ(it.next());
                            }
                        }
                    } else if (C50898JyI.LIZ() == EnumC50899JyJ.SINGLE) {
                        InterfaceC50670Juc LJIIL3 = C50837JxJ.LJIIL(null, null);
                        Iterator<SearchHistory> it2 = LJIIL.LIZIZ().iterator();
                        while (it2.hasNext()) {
                            LJIIL3.LJ(it2.next());
                        }
                    }
                }
                LJIIL.LIZ();
                if (LIZ2 != null) {
                    LIZ2.LIZ();
                }
                iReturn.onSuccess(LIZJ(LJIIL, LIZ2));
                return;
            }
            if (o.LJ(string, "1")) {
                String string2 = JSONObjectProtectorUtils.getString(params, "keyword");
                C50669Jub.LIZIZ.LIZ().LIZIZ(C47261Igj.LJJIJ(string2), false, enumC51281KAr, eCSearchEntranceData);
                LJIIL.LJ(new SearchHistory(string2, 0));
                if (z) {
                    if (eCSearchEntranceData != null && eCSearchEntranceData.isEC()) {
                        IEcomSearchService LJJJJZI2 = EcomSearchServiceImpl.LJJJJZI();
                        if (LJJJJZI2 != null) {
                            enumC61742ba = LJJJJZI2.LJJIIJ(eCSearchEntranceData);
                        } else {
                            enumC61742ba = null;
                        }
                        if (enumC61742ba == EnumC61742ba.EC_SINGLE_ISOLATE) {
                            SearchServiceImpl.LLLZI().LJJLJLI(null, null).LJ(new SearchHistory(string2, 0));
                        }
                    } else if (C50898JyI.LIZ() == EnumC50899JyJ.SINGLE) {
                        SearchServiceImpl.LLLZI().LJJLJLI(null, null).LJ(new SearchHistory(string2, 0));
                    }
                }
                if (LIZ2 != null) {
                    LIZ2.LJIIIZ(string2);
                }
                iReturn.onSuccess(LIZJ(LJIIL, LIZ2));
            }
        } catch (Exception e) {
            IGF.LIZ(e, "DeleteSearchHistoryMethod");
            iReturn.LIZ(-1, e.getMessage());
            C16880lQ.LLLLIIL(e);
        }
    }
}
