package X;

import com.ss.android.ugc.aweme.compliance.api.services.search.IPnSSearchHistoryService;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.PnSSearchHistoryServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* renamed from: X.Jub, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50669Jub {
    public static final C50671Jud LIZIZ = new C50671Jud();
    public static C50669Jub LIZJ;
    public List<? extends Object> LIZ;

    public final String LIZLLL() {
        JSONArray jSONArray = new JSONArray();
        List<? extends Object> list = this.LIZ;
        if (list != null) {
            Iterator<? extends Object> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toString());
            }
        }
        String encode = android.net.Uri.encode(jSONArray.toString());
        o.LJIIIIZZ(encode, "encode(historiesJsonArray.toString())");
        return encode;
    }

    public final boolean LIZJ(String str, List list, boolean z) {
        boolean z2;
        List<String> LJIIJ = C50837JxJ.LJIIJ();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LJIIJ).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!o.LJ(next, str) || str == null || str.length() == 0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String spKey = (String) it2.next();
            o.LJIIIIZZ(spKey, "spKey");
            arrayList2.add(Boolean.valueOf(LIZ(list, z, false, spKey)));
        }
        Iterator it3 = arrayList2.iterator();
        if (it3.hasNext()) {
            Object next2 = it3.next();
            while (it3.hasNext()) {
                boolean booleanValue = ((Boolean) it3.next()).booleanValue();
                if (((Boolean) next2).booleanValue() && booleanValue) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                next2 = Boolean.valueOf(z2);
            }
            return ((Boolean) next2).booleanValue();
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.Juc] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    public final boolean LIZ(List list, boolean z, boolean z2, String str) {
        ?? arrayList;
        String str2;
        List<SearchHistory> LIZIZ2;
        try {
            ?? LJIILIIL = C50837JxJ.LJIILIIL(str);
            if (z) {
                if (LJIILIIL == 0 || (LIZIZ2 = LJIILIIL.LIZIZ()) == null || (arrayList = ORZ.LLJI(LIZIZ2)) == 0) {
                    arrayList = C61878OQg.INSTANCE;
                }
            } else {
                arrayList = new ArrayList(C32I.LJJL(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new SearchHistory((String) it.next(), 0));
                }
            }
            LJIILIIL.LIZLLL(arrayList);
            if (z2 && ((ArrayList) C50837JxJ.LJIIJ()).contains(str)) {
                IPnSSearchHistoryService LIZIZ3 = PnSSearchHistoryServiceImpl.LIZIZ();
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
                for (SearchHistory searchHistory : arrayList) {
                    if (searchHistory == null || (str2 = searchHistory.keyword) == null) {
                        str2 = "";
                    }
                    arrayList2.add(str2);
                }
                LIZIZ3.LIZ(arrayList2, new EBJ(this, arrayList, str));
                return true;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void LIZIZ(List<String> historyList, boolean z, EnumC51281KAr enumC51281KAr, ECSearchEntranceData eCSearchEntranceData) {
        o.LJIIIZ(historyList, "historyList");
        String LJIIJJI = C50837JxJ.LJIIJJI(enumC51281KAr, eCSearchEntranceData);
        o.LJIIIIZZ(LJIIJJI, "getSpKeyByEnterFrom(ecSe…ance, searchEntranceData)");
        LIZ(historyList, z, true, LJIIJJI);
    }
}
