package X;

import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.K8c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51214K8c {
    public static final List<KAK> LIZ = C47261Igj.LJJIJIIJI(KAK.SHOP, KAK.ECOM_LIVE, KAK.STORE);
    public static final List<KAK> LIZIZ = ORZ.LLJILJILJ(LIZ(null));

    public static final int LIZLLL() {
        return ((ArrayList) LIZIZ).indexOf(KAK.ECOM_LIVE);
    }

    public static final int LJI() {
        return ((ArrayList) LIZIZ).indexOf(KAK.SHOP);
    }

    public static final int LJII() {
        return ((ArrayList) LIZIZ).indexOf(KAK.STORE);
    }

    public static List LIZ(SearchResultParam searchResultParam) {
        List<KAK> list = LIZ;
        List<KAK> list2 = list;
        if (searchResultParam != null) {
            String singleTabType = searchResultParam.getSingleTabType();
            list2 = list;
            if (singleTabType != null) {
                list2 = list;
                if (C78857UxB.LJJJIL(singleTabType)) {
                    ArrayList arrayList = new ArrayList();
                    KAK.Companion.getClass();
                    KAK LIZ2 = C51298KBi.LIZ(singleTabType);
                    list2 = arrayList;
                    if (LIZ2 != null) {
                        arrayList.add(LIZ2);
                        list2 = arrayList;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (KAK kak : list2) {
            int i = C51225K8n.LIZ[kak.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && ((Number) K98.LIZ.getValue()).intValue() != 1) {
                    }
                } else if (KLA.LIZ() != 2) {
                }
            }
            arrayList2.add(kak);
        }
        if (arrayList2.isEmpty()) {
            return C47261Igj.LJJIJ(KAK.SHOP);
        }
        return arrayList2;
    }

    public static final int LIZIZ(String tabName) {
        o.LJIIIZ(tabName, "tabName");
        List<KAK> list = LIZIZ;
        KAK.Companion.getClass();
        return ORZ.LJZ(C51298KBi.LIZ(tabName), list);
    }

    public static final int LIZJ(KAK searchTab) {
        o.LJIIIZ(searchTab, "searchTab");
        return ((ArrayList) LIZIZ).indexOf(searchTab);
    }

    public static final String LJ(int i) {
        KAK kak;
        String tabName;
        if (i < 0) {
            return "";
        }
        List<KAK> list = LIZIZ;
        if (i >= ((ArrayList) list).size() || (kak = (KAK) ORZ.LJLLLLLL(i, list)) == null || (tabName = kak.getTabName()) == null) {
            return "";
        }
        return tabName;
    }

    public static final String LJFF(int i) {
        if (i < 0) {
            return KAK.SHOP.getTabName();
        }
        if (i == LJI()) {
            return KAK.SHOP.getTabName();
        }
        if (i == LJII()) {
            return KAK.STORE.getTabName();
        }
        if (i == LIZLLL()) {
            return KAK.ECOM_LIVE.getTabName();
        }
        List<KAK> list = LIZIZ;
        KAK kak = KAK.ORDER;
        if (i == ((ArrayList) list).indexOf(kak)) {
            return kak.getTabName();
        }
        return KAK.SHOP.getTabName();
    }

    public static void LJIIIIZZ(SearchResultParam searchResultParam) {
        ArrayList arrayList = (ArrayList) LIZIZ;
        arrayList.clear();
        arrayList.addAll(LIZ(searchResultParam));
    }
}
