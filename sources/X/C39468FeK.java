package X;

import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.ugc.statisticlogger.btm.BTMTrackerServiceImpl;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.ECHead;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSource;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.FeK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39468FeK {
    public static final /* synthetic */ int LIZ = 0;

    public static PageSourceInfo LIZJ() {
        if (E9D.LIZ().pageSourceEnable == 1) {
            return (PageSourceInfo) LIZLLL(E9D.LIZ().maxPageSize).getFirst();
        }
        return null;
    }

    public static String LIZ(String str) {
        java.util.Map<String, String> map;
        String str2;
        java.util.Map<String, String> map2;
        C18080nM.LIZ.getClass();
        C18090nN c18090nN = C18080nM.LIZJ;
        if (c18090nN != null) {
            int i = 0;
            do {
                String LJFF = i0.LJFF("prefix_ec_params_", str);
                C17980nC c17980nC = c18090nN.LJJIJLIJ;
                if ((c17980nC != null && (map2 = c17980nC.LIZLLL) != null && (str2 = map2.get(LJFF)) != null) || ((map = c18090nN.LJJIL) != null && (str2 = map.get(LJFF)) != null)) {
                    return str2;
                }
                c18090nN = c18090nN.LJIILLIIL;
                i++;
                if (c18090nN == null) {
                    break;
                }
            } while (i <= 200);
        }
        return null;
    }

    public static java.util.Map LIZIZ(String... keys) {
        String str;
        java.util.Map<String, String> map;
        String str2;
        o.LJIIIZ(keys, "keys");
        C18080nM.LIZ.getClass();
        C18090nN c18090nN = C18080nM.LIZJ;
        if (c18090nN != null) {
            Object[] copyOf = Arrays.copyOf(keys, keys.length);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ORS.LJJLIIIJJIZ(arrayList, copyOf);
            ORS.LJJLIIIJJIZ(arrayList2, copyOf);
            int i = 0;
            LinkedHashMap linkedHashMap = null;
            do {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    String LJFF = i0.LJFF("prefix_ec_params_", str3);
                    C17980nC c17980nC = c18090nN.LJJIJLIJ;
                    if (c17980nC != null && (map = c17980nC.LIZLLL) != null && (str2 = map.get(LJFF)) != null) {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        linkedHashMap.put(str3, str2);
                        arrayList2.remove(str3);
                    } else {
                        java.util.Map<String, String> map2 = c18090nN.LJJIL;
                        if (map2 != null && (str = map2.get(LJFF)) != null) {
                            if (linkedHashMap == null) {
                                linkedHashMap = new LinkedHashMap();
                            }
                            linkedHashMap.put(str3, str);
                            arrayList2.remove(str3);
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.clear();
                    arrayList.addAll(arrayList2);
                    c18090nN = c18090nN.LJIILLIIL;
                    i++;
                    if (c18090nN == null) {
                        break;
                    }
                } else {
                    break;
                }
            } while (i <= 200);
            if (linkedHashMap != null) {
                return linkedHashMap;
            }
        }
        return null;
    }

    public static OSZ LIZLLL(int i) {
        String str;
        String str2;
        List<C18090nN> LIZ2 = BTMTrackerServiceImpl.LJFF().LIZ();
        ArrayList arrayList = new ArrayList();
        Iterator<C18090nN> it = LIZ2.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            Object obj = null;
            if (it.hasNext()) {
                C18090nN next = it.next();
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    C18090nN c18090nN = next;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    java.util.Map<String, String> map = c18090nN.LJJIL;
                    if (map != null) {
                        linkedHashMap.putAll(map);
                    }
                    PageSource pageSource = new PageSource(c18090nN.LIZIZ(), linkedHashMap);
                    String str3 = c18090nN.LJ;
                    PageSource pageSource2 = (PageSource) ORZ.LJLLLLLL(i3 - 1, arrayList);
                    if (C78685UuP.LJJJZ(str3) && pageSource2 != null) {
                        LJIIIIZZ(str3, pageSource2);
                    }
                    arrayList.add(pageSource);
                    i3 = i4;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            } else {
                List<ECHead> list = E9D.LIZ().ecHeadPageSet;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    PageSource pageSource3 = (PageSource) next2;
                    if (list != null) {
                        boolean z = false;
                        for (ECHead eCHead : list) {
                            if ((C78685UuP.LJJJZ(eCHead.pageCode) && o.LJ(eCHead.pageCode, pageSource3.pageName)) || (str = eCHead.pageCode) == null || str.length() == 0) {
                                java.util.Map<String, String> map2 = eCHead.extra;
                                if (map2 != null) {
                                    for (Map.Entry<String, String> entry : map2.entrySet()) {
                                        java.util.Map<String, String> map3 = pageSource3.extra;
                                        if (map3 != null) {
                                            str2 = map3.get(entry.getKey());
                                        } else {
                                            str2 = null;
                                        }
                                        o.LJ(str2, entry.getValue());
                                    }
                                }
                                z = true;
                            }
                        }
                        if (z) {
                            obj = next2;
                            break;
                        }
                    }
                }
                PageSource pageSource4 = (PageSource) obj;
                int size = arrayList.size() - i;
                if (size >= 0) {
                    i2 = size;
                }
                int size2 = arrayList.size();
                if (i2 > size2) {
                    i2 = size2;
                }
                List subList = arrayList.subList(i2, arrayList.size());
                o.LJIIIIZZ(subList, "list.subList(startIndex, list.size)");
                return new OSZ(new PageSourceInfo(subList, pageSource4), LIZ2);
            }
        }
    }

    public static PageSourceInfo LJ(PageSource pageSource) {
        C17980nC c17980nC;
        HashMap<String, HashSet<C18090nN>> hashMap;
        String str = null;
        if (E9D.LIZ().pageSourceEnable != 1) {
            return null;
        }
        OSZ LIZLLL = LIZLLL(E9D.LIZ().maxPageSize - 1);
        PageSourceInfo pageSourceInfo = (PageSourceInfo) LIZLLL.getFirst();
        List list = (List) LIZLLL.getSecond();
        C18090nN c18090nN = (C18090nN) ORZ.LLFII(list);
        C18080nM.LIZ.getClass();
        C18090nN c18090nN2 = C18080nM.LIZLLL;
        if (c18090nN != null && (hashMap = c18090nN.LJIJI) != null && (!hashMap.isEmpty()) && c18090nN2 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            java.util.Map<String, String> map = c18090nN2.LJJIL;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            pageSourceInfo.sourcePageList.add(new PageSource(c18090nN2.LIZIZ(), linkedHashMap));
        }
        C18090nN c18090nN3 = (C18090nN) ORZ.LJLLLLLL(pageSourceInfo.sourcePageList.size() - 1, list);
        if (c18090nN3 != null && (c17980nC = c18090nN3.LJJIJLIJ) != null) {
            str = c17980nC.LIZ;
        }
        if (C78685UuP.LJJJZ(str)) {
            List<PageSource> list2 = pageSourceInfo.sourcePageList;
            PageSource pageSource2 = (PageSource) ORZ.LJLLLLLL(list2.size() - 1, list2);
            if (pageSource2 != null) {
                LJIIIIZZ(str, pageSource2);
            }
        }
        pageSourceInfo.sourcePageList.add(pageSource);
        return pageSourceInfo;
    }

    public static void LJI(String str) {
        java.util.Map<String, String> map;
        if (E9D.LIZ().pageSourceEnable == 1) {
            C18080nM.LIZ.getClass();
            C18090nN c18090nN = C18080nM.LIZJ;
            if (c18090nN != null && c18090nN.LJJIL == null && c18090nN != null) {
                c18090nN.LJJIL = new LinkedHashMap();
            }
            C18090nN c18090nN2 = C18080nM.LIZJ;
            if (c18090nN2 != null && (map = c18090nN2.LJJIL) != null) {
                map.put("ec_search_root_enter_from_type", str);
            }
        }
    }

    public static void LJII(View view, boolean z) {
        C18090nN c18090nN;
        java.util.Map<String, String> map;
        String str;
        if (E9D.LIZ().pageSourceEnable == 1) {
            C18080nM.LIZ.getClass();
            C18090nN c18090nN2 = C18080nM.LIZJ;
            if (c18090nN2 != null && c18090nN2.LJJIL == null && c18090nN2 != null) {
                c18090nN2.LJJIL = new LinkedHashMap();
            }
            if (((view != null && (c18090nN = C18080nM.LIZLLL(view, null)) != null) || (c18090nN = C18080nM.LIZJ) != null) && (map = c18090nN.LJJIL) != null) {
                if (z) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("ec_is_video_page", str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIIIZZ(String str, PageSource pageSource) {
        if (!ujb.o.LJJJJ(str, ".c0.d0", false)) {
            List LJLJJL = s.LJLJJL(str, new String[]{"."}, 0, 6);
            if (LJLJJL.size() == 4 && ujb.o.LJJJLIIL((String) ListProtector.get(LJLJJL, 2), "c", false) && !o.LJ(ListProtector.get(LJLJJL, 2), "c0")) {
                if (pageSource.extra == null) {
                    pageSource.extra = new LinkedHashMap();
                }
                java.util.Map<String, String> map = pageSource.extra;
                if (map != 0) {
                    map.put("ec_next_page_c_btm_code", ListProtector.get(LJLJJL, 2));
                }
            }
            if (LJLJJL.size() == 4 && ujb.o.LJJJLIIL((String) ListProtector.get(LJLJJL, 3), "d", false) && !o.LJ(ListProtector.get(LJLJJL, 3), "d0")) {
                if (pageSource.extra == null) {
                    pageSource.extra = new LinkedHashMap();
                }
                java.util.Map<String, String> map2 = pageSource.extra;
                if (map2 != 0) {
                    map2.put("ec_next_page_d_btm_code", ListProtector.get(LJLJJL, 3));
                }
            }
        }
    }

    public static void LJIIIZ(SparkContext sparkContext, View view) {
        if (E9D.LIZ().pageSourceEnable == 1) {
            sparkContext.LJJIIZ(BTMTrackerServiceImpl.LJFF().LIZLLL(view), "btm_route_data");
            sparkContext.LJJIIZ(1, "priority_btm_route_data_has_set");
        }
    }

    public static void LJIIJJI(java.util.Map map, View view) {
        C18080nM.LIZ.getClass();
        C18090nN LIZLLL = C18080nM.LIZLLL(view, null);
        if (LIZLLL != null) {
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                LJIILIIL((String) entry.getKey(), (String) entry.getValue(), LIZLLL);
            }
        }
    }

    public static void LJIIL(String str, String value) {
        o.LJIIIZ(value, "value");
        C18080nM.LIZ.getClass();
        C18090nN c18090nN = C18080nM.LIZJ;
        if (c18090nN != null) {
            LJIILIIL(str, value, c18090nN);
        }
    }

    public static void LJIIJ(String str, String str2, String id) {
        o.LJIIIZ(id, "id");
        C18080nM.LIZ.getClass();
        C18090nN LJFF = C18080nM.LJFF(id);
        if (LJFF != null) {
            LJIILIIL(str, str2, LJFF);
        }
    }

    public static void LJIILIIL(String str, String str2, C18090nN c18090nN) {
        if (c18090nN.LJJIL == null) {
            c18090nN.LJJIL = new LinkedHashMap();
        }
        String LJFF = i0.LJFF("prefix_ec_params_", str);
        java.util.Map<String, String> map = c18090nN.LJJIL;
        if (map != null) {
            map.put(LJFF, str2);
        }
    }

    public static void LJFF(View view, String btmC, String btmD, java.util.Map map, InterfaceC34451Wv interfaceC34451Wv) {
        LinkedHashMap linkedHashMap;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(btmC, "btmC");
        o.LJIIIZ(btmD, "btmD");
        if (map != null) {
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("prefix_ec_params_");
                LIZ2.append((String) entry.getKey());
                linkedHashMap.put(X1D.LIZIZ(LIZ2), entry.getValue());
            }
        } else {
            linkedHashMap = null;
        }
        C12460eI.LJIILJJIL(view, btmC, btmD, linkedHashMap, interfaceC34451Wv);
    }
}
