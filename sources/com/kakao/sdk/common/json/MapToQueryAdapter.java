package com.kakao.sdk.common.json;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.TypeAdapter;
import com.kakao.sdk.common.util.Utility;
import java.util.Map;

/* loaded from: classes12.dex */
public final class MapToQueryAdapter extends TypeAdapter<Map<String, ? extends String>> {
    @Override // com.google.gson.TypeAdapter
    public Map<String, ? extends String> read(C65385PlN c65385PlN) {
        EnumC65386PlO LJJIJIL;
        String str = null;
        if (c65385PlN == null) {
            LJJIJIL = null;
        } else {
            LJJIJIL = c65385PlN.LJJIJIL();
        }
        if (LJJIJIL == EnumC65386PlO.NULL) {
            c65385PlN.LJJIIJ();
            return null;
        }
        if (c65385PlN != null) {
            str = c65385PlN.LJJIIZI();
        }
        return Utility.INSTANCE.parseQuery(str);
    }

    /* renamed from: write, reason: avoid collision after fix types in other method */
    public void write2(C65403Plf c65403Plf, Map<String, String> map) {
        if (map == null) {
            if (c65403Plf == null) {
                return;
            }
            c65403Plf.LJIIJJI();
        } else {
            String buildQuery = Utility.INSTANCE.buildQuery(map);
            if (c65403Plf == null) {
                return;
            }
            c65403Plf.LJJ(buildQuery);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(C65403Plf c65403Plf, Map<String, ? extends String> map) {
        write2(c65403Plf, (Map<String, String>) map);
    }
}
