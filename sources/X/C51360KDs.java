package X;

import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.KDs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51360KDs {
    public static final List<KAK> LIZJ = C47261Igj.LJJIJIL(KAK.SHOP, KAK.ECOM_LIVE, KAK.STORE);
    public final List<KAK> LIZ;
    public final java.util.Map<KAK, Boolean> LIZIZ;

    public C51360KDs(C50948Jz6 c50948Jz6) {
        ECSearchEntranceData ecSearchEntranceData;
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        new ArrayList();
        this.LIZIZ = new LinkedHashMap();
        String str = null;
        if (c50948Jz6 != null && (ecSearchEntranceData = c50948Jz6.getEcSearchEntranceData()) != null) {
            str = ecSearchEntranceData.getSingleTabType();
        }
        if (C78857UxB.LJJJIL(str) && str != null) {
            KAK.Companion.getClass();
            KAK LIZ = C51298KBi.LIZ(str);
            if (LIZ != null && Boolean.valueOf(arrayList.add(LIZ)) != null) {
                return;
            }
        }
        for (KAK kak : LIZJ) {
            ((ArrayList) this.LIZ).add(kak);
            this.LIZIZ.put(kak, Boolean.FALSE);
        }
    }

    public final KAK LIZ(int i) {
        if (i < 0 || i >= ((ArrayList) this.LIZ).size()) {
            return null;
        }
        return (KAK) ORZ.LJLLLLLL(i, this.LIZ);
    }
}
