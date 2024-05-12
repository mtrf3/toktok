package com.ss.android.ugc.aweme.poi.collect.collectassem;

import X.C190237dL;
import X.C190817eH;
import X.C225248si;
import X.RBW;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class PoiMapPageCollectStatusAssem extends PoiCollectStatusRedBtnAssem {
    public PoiMapPageCollectStatusAssem() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusRedBtnAssem
    public final void X3() {
        C190817eH c190817eH = M3().LJLJL;
        if (c190817eH == null) {
            return;
        }
        C190817eH copy$default = C190817eH.copy$default(c190817eH, "poi_map", "click_button_map", c190817eH.getEnterFrom(), 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554424, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(copy$default.forceToMap());
        String str = "1";
        if (RBW.LJLLI.LJI()) {
            linkedHashMap.put("is_login", "1");
            Boolean bool = (Boolean) withState(O3(), C190237dL.LJLIL);
            if (bool != null) {
                if (!bool.booleanValue()) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_favourite", str);
            }
        } else {
            linkedHashMap.put("is_login", CardStruct.IStatusCode.DEFAULT);
        }
        C225248si.LJJIIJ(linkedHashMap);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusRedBtnAssem, com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void P3(boolean z) {
        C190817eH c190817eH = M3().LJLJL;
        if (c190817eH == null) {
            return;
        }
        C190817eH copy$default = C190817eH.copy$default(c190817eH, "poi_map", "click_button_map", c190817eH.getEnterFrom(), 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554424, null);
        if (z) {
            C225248si.LJIILJJIL(copy$default.forceToMap());
        } else {
            C225248si.LJFF(copy$default.forceToMap());
        }
    }
}
