package com.ss.android.ugc.aweme.compliance.business.search;

import X.C188727au;
import X.C30591Hz;
import X.C51029K0z;
import X.C96Q;
import X.FMX;
import X.OSZ;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import java.util.ArrayList;
import org.json.JSONArray;

/* loaded from: classes7.dex */
public final class SearchDeleteAction implements IRouteAction {
    public static final int $stable = 0;

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        boolean z;
        boolean z2;
        String str2;
        if (str != null) {
            boolean z3 = true;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String LJIILIIL = C30591Hz.LJIILIIL(str, "search_items");
                String LJIILIIL2 = C30591Hz.LJIILIIL(str, "delete_all");
                if (LJIILIIL == null || LJIILIIL.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (LJIILIIL2 != null && LJIILIIL2.length() != 0) {
                        z3 = false;
                    }
                    if (z3) {
                        return Boolean.FALSE;
                    }
                }
                ISearchService LLLZI = SearchServiceImpl.LLLZI();
                ArrayList arrayList = new ArrayList();
                if (C96Q.LIZ(LJIILIIL)) {
                    try {
                        JSONArray jSONArray = new JSONArray(LJIILIIL);
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            arrayList.add(C51029K0z.LJJIIZI(new OSZ("word", JSONArrayProtectorUtils.getString(jSONArray, i))));
                        }
                    } catch (Exception unused) {
                        C188727au c188727au = new C188727au();
                        c188727au.LJIIIZ("is_clear_search_blankpage", "-1");
                        c188727au.LJIIIZ("enter_from", "activity_center_page");
                        FMX.LJIIL("search_history_deletion_result", c188727au.LIZ);
                        return Boolean.FALSE;
                    }
                }
                boolean LJJIJL = LLLZI.LJJIJL(arrayList, arrayList.isEmpty());
                C188727au c188727au2 = new C188727au();
                if (LJJIJL) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c188727au2.LJIIIZ("is_clear_search_blankpage", str2);
                c188727au2.LJIIIZ("enter_from", "activity_center_page");
                FMX.LJIIL("search_history_deletion_result", c188727au2.LIZ);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
