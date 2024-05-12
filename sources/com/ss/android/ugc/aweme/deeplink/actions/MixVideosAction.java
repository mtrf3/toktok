package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC54341LUj;
import X.C113554cx;
import X.C229238z9;
import X.C76800UCe;
import X.M5X;
import X.M7D;
import X.OSZ;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MixVideosAction extends AbstractC54341LUj<C76800UCe> {
    @Override // X.AbstractC54341LUj
    public OSZ<String, HashMap<String, Object>> buildInnerUrl(String outerUrl, HashMap<String, Object> originalQueryMap, M5X deepLinkData) {
        String str;
        String str2;
        String str3;
        o.LJIIIZ(outerUrl, "outerUrl");
        o.LJIIIZ(originalQueryMap, "originalQueryMap");
        o.LJIIIZ(deepLinkData, "deepLinkData");
        OSZ[] oszArr = new OSZ[1];
        M7D m7d = new M7D();
        Object obj = originalQueryMap.get("id");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            Object obj2 = originalQueryMap.get("mix_id");
            if (!(obj2 instanceof String) || (str = (String) obj2) == null) {
                str = "";
            }
        }
        m7d.setMixId(str);
        Object obj3 = originalQueryMap.get("author_id");
        if (!(obj3 instanceof String) || (str2 = (String) obj3) == null) {
            str2 = "";
        }
        m7d.setMUsrId(str2);
        Object obj4 = originalQueryMap.get("sec_uid");
        if ((obj4 instanceof String) && (str3 = (String) obj4) != null) {
            str4 = str3;
        }
        m7d.setMSecUid(str4);
        m7d.setMNeedShowDialog(true);
        m7d.setSearchParam(new C229238z9(null, null, null, 0, null, null, 63, null));
        m7d.setMVideoFrom("from_profile_mix_list");
        m7d.setFromShare(true);
        oszArr[0] = new OSZ("mix_video_list_params", m7d);
        return new OSZ<>("//mix/detail", C113554cx.LJJJLZIJ(oszArr));
    }
}
