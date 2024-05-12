package X;

import com.google.gson.m;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommercelive.framework.serviceimpl.ECommerceLiveServiceImpl;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import ujb.o;

/* loaded from: classes10.dex */
public final class M2U {
    public static final /* synthetic */ int LIZ = 0;

    public static m LIZ(Object obj, Object obj2) {
        String str;
        String str2;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        } else {
            str2 = null;
        }
        if (str != null && !o.LJJJJJL(str) && str2 != null && !o.LJJJJJL(str2)) {
            String str3 = (String) obj;
            String str4 = (String) obj2;
            m LJ = ECommerceLiveServiceImpl.LJFF().LJ(str3, str4);
            if (LJ != null) {
                return LJ;
            }
            m LJIIJJI = ECommerceAnchorService.LJJJJI().LJIIJJI(str3, str4);
            if (LJIIJJI != null) {
                return LJIIJJI;
            }
        }
        return null;
    }

    public static List LIZIZ(String originJson, String str) {
        String str2;
        kotlin.jvm.internal.o.LJIIIZ(originJson, "originJson");
        try {
            JSONArray optJSONArray = new JSONObject(originJson).optJSONArray(str);
            boolean z = false;
            ArrayList arrayList = null;
            if (optJSONArray != null) {
                ArrayList arrayList2 = new ArrayList();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    try {
                        Object LJII = C27739Aud.LJFF().LJII(String.valueOf(optJSONArray.get(i)), C65330PkU.LIZJ(C65352Pkq.LJI(String.class)));
                        if (!(LJII instanceof String)) {
                            LJII = null;
                        }
                        str2 = (String) LJII;
                    } catch (s unused) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        arrayList2.add(str2);
                    }
                }
                arrayList = arrayList2;
            }
            if (arrayList != null && (!arrayList.isEmpty())) {
                z = true;
            }
            if (!z) {
                return C61878OQg.INSTANCE;
            }
            return arrayList;
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Parse trackParams error in showcase tab, originJson:");
            LIZ2.append(originJson);
            C36746EbW.LIZ(6, X1D.LIZIZ(LIZ2));
            C16880lQ.LLLLIIL(e);
            return C61878OQg.INSTANCE;
        }
    }
}
