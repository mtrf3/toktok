package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JoX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50293JoX {
    public static final java.util.Map<String, C50294JoY> LIZ = new LinkedHashMap();
    public static final List<List<String>> LIZIZ;
    public static final List<List<String>> LIZJ;
    public static final List<String> LIZLLL;
    public static String LJ;
    public static boolean LJFF;

    static {
        List<List<String>> synchronizedList = Collections.synchronizedList(new ArrayList());
        o.LJIIIIZZ(synchronizedList, "synchronizedList(mutableListOf<List<String>>())");
        LIZIZ = synchronizedList;
        List<List<String>> synchronizedList2 = Collections.synchronizedList(new ArrayList());
        o.LJIIIIZZ(synchronizedList2, "synchronizedList(mutableListOf<List<String>>())");
        LIZJ = synchronizedList2;
        List<String> synchronizedList3 = Collections.synchronizedList(new ArrayList());
        o.LJIIIIZZ(synchronizedList3, "synchronizedList(mutableListOf<String>())");
        LIZLLL = synchronizedList3;
        LJ = "";
    }

    public static void LIZIZ() {
        LIZIZ.clear();
        LIZJ.clear();
        LIZLLL.clear();
        LJFF = false;
    }

    public static String LJFF() {
        C50652JuK.Companion.getClass();
        C50650JuI LIZJ2 = C50651JuJ.LIZJ();
        if (LIZJ2 != null) {
            return LJ(LIZJ2.getSearchVideoModel().getGroupId(), LIZJ2.getSearchCommonModel().getEnterFrom());
        }
        return null;
    }

    public static String LJI() {
        RBY LJFF2 = AccountService.LJIJ().LJFF();
        if (LJFF2.isLogin()) {
            return LJFF2.getCurUserId();
        }
        return "FAKE_USER";
    }

    public static void LIZ(String str) {
        Collection collection;
        long j;
        List<String> list;
        List<String> list2;
        List<String> list3;
        List<String> list4;
        if (str != null) {
            java.util.Map<String, C50294JoY> map = LIZ;
            if (!map.containsKey(str)) {
                return;
            }
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            C50294JoY c50294JoY = (C50294JoY) linkedHashMap.get(str);
            if (c50294JoY != null) {
                c50294JoY.LIZJ = "";
            }
            C50294JoY c50294JoY2 = (C50294JoY) linkedHashMap.get(str);
            if (c50294JoY2 != null) {
                c50294JoY2.LJII = "";
            }
            C50294JoY c50294JoY3 = (C50294JoY) linkedHashMap.get(str);
            if (c50294JoY3 != null) {
                c50294JoY3.LJIIIIZZ = "";
            }
            C50294JoY c50294JoY4 = (C50294JoY) linkedHashMap.get(str);
            if (c50294JoY4 != null && (list4 = c50294JoY4.LIZLLL) != null) {
                list4.clear();
            }
            C50294JoY c50294JoY5 = (C50294JoY) linkedHashMap.get(str);
            if (c50294JoY5 != null && (list3 = c50294JoY5.LJ) != null) {
                list3.clear();
            }
            C50294JoY c50294JoY6 = (C50294JoY) linkedHashMap.get(str);
            if (c50294JoY6 != null) {
                C50294JoY c50294JoY7 = (C50294JoY) linkedHashMap.get(str);
                if (c50294JoY7 == null || (collection = c50294JoY7.LJIIIZ) == null) {
                    collection = C61878OQg.INSTANCE;
                }
                c50294JoY6.LJIIJ = ORZ.LLJILJILJ(collection);
            }
            C50294JoY c50294JoY8 = (C50294JoY) linkedHashMap.get(str);
            if (c50294JoY8 != null) {
                C50294JoY c50294JoY9 = (C50294JoY) linkedHashMap.get(str);
                if (c50294JoY9 != null) {
                    j = c50294JoY9.LJIJ;
                } else {
                    j = 0;
                }
                c50294JoY8.LJIJI = j;
            }
            C50294JoY c50294JoY10 = (C50294JoY) linkedHashMap.get(str);
            if (c50294JoY10 != null && (list2 = c50294JoY10.LJIIIZ) != null) {
                list2.clear();
            }
            C50294JoY c50294JoY11 = (C50294JoY) linkedHashMap.get(str);
            if (c50294JoY11 != null && (list = c50294JoY11.LJIIJJI) != null) {
                list.clear();
            }
            C50294JoY c50294JoY12 = (C50294JoY) linkedHashMap.get(str);
            if (c50294JoY12 == null) {
                return;
            }
            c50294JoY12.LIZIZ = CardStruct.IStatusCode.DEFAULT;
        }
    }

    public static List LIZJ(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return arrayList;
    }

    public static boolean LJII(String str) {
        List<String> list;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        List<String> list2;
        List<String> list3;
        List<String> list4;
        List<String> list5;
        List<String> list6;
        List<String> list7;
        boolean z = false;
        if (!TextUtils.isEmpty(str)) {
            java.util.Map<String, C50294JoY> map = LIZ;
            if (map.containsKey(str)) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                C50294JoY c50294JoY = (C50294JoY) linkedHashMap.get(str);
                if (c50294JoY == null || c50294JoY.LIZ) {
                    if (str != null && map.containsKey(str)) {
                        long currentTimeMillis = System.currentTimeMillis();
                        C50294JoY c50294JoY2 = (C50294JoY) linkedHashMap.get(str);
                        if (c50294JoY2 != null) {
                            j = c50294JoY2.LJIIL;
                        } else {
                            j = 0;
                        }
                        long j10 = 18000000;
                        if (currentTimeMillis - j > j10) {
                            C50294JoY c50294JoY3 = (C50294JoY) linkedHashMap.get(str);
                            if (c50294JoY3 != null) {
                                c50294JoY3.LJIIL = 0L;
                            }
                            C50294JoY c50294JoY4 = (C50294JoY) linkedHashMap.get(str);
                            if (c50294JoY4 != null) {
                                c50294JoY4.LIZJ = "";
                            }
                        }
                        C50294JoY c50294JoY5 = (C50294JoY) linkedHashMap.get(str);
                        if (c50294JoY5 != null) {
                            j2 = c50294JoY5.LJIILIIL;
                        } else {
                            j2 = 0;
                        }
                        if (currentTimeMillis - j2 > j10) {
                            C50294JoY c50294JoY6 = (C50294JoY) linkedHashMap.get(str);
                            if (c50294JoY6 != null) {
                                c50294JoY6.LJIILIIL = 0L;
                            }
                            C50294JoY c50294JoY7 = (C50294JoY) linkedHashMap.get(str);
                            if (c50294JoY7 != null && (list7 = c50294JoY7.LIZLLL) != null) {
                                list7.clear();
                            }
                        }
                        C50294JoY c50294JoY8 = (C50294JoY) linkedHashMap.get(str);
                        if (c50294JoY8 != null) {
                            j3 = c50294JoY8.LJIILJJIL;
                        } else {
                            j3 = 0;
                        }
                        if (currentTimeMillis - j3 > j10) {
                            C50294JoY c50294JoY9 = (C50294JoY) linkedHashMap.get(str);
                            if (c50294JoY9 != null) {
                                c50294JoY9.LJIILJJIL = 0L;
                            }
                            C50294JoY c50294JoY10 = (C50294JoY) linkedHashMap.get(str);
                            if (c50294JoY10 != null && (list6 = c50294JoY10.LJ) != null) {
                                list6.clear();
                            }
                        }
                        C50294JoY c50294JoY11 = (C50294JoY) linkedHashMap.get(str);
                        if (c50294JoY11 != null) {
                            j4 = c50294JoY11.LJIILL;
                        } else {
                            j4 = 0;
                        }
                        if (currentTimeMillis - j4 > j10) {
                            C50294JoY c50294JoY12 = (C50294JoY) linkedHashMap.get(str);
                            if (c50294JoY12 != null) {
                                c50294JoY12.LJIILL = 0L;
                            }
                            C50294JoY c50294JoY13 = (C50294JoY) linkedHashMap.get(str);
                            if (c50294JoY13 != null && (list5 = c50294JoY13.LJFF) != null) {
                                list5.clear();
                            }
                        }
                        C50294JoY c50294JoY14 = (C50294JoY) linkedHashMap.get(str);
                        if (c50294JoY14 != null) {
                            j5 = c50294JoY14.LJIILLIIL;
                        } else {
                            j5 = 0;
                        }
                        if (currentTimeMillis - j5 > j10) {
                            C50294JoY c50294JoY15 = (C50294JoY) linkedHashMap.get(str);
                            if (c50294JoY15 != null) {
                                c50294JoY15.LJIILLIIL = 0L;
                            }
                            C50294JoY c50294JoY16 = (C50294JoY) linkedHashMap.get(str);
                            if (c50294JoY16 != null) {
                                c50294JoY16.LJII = "";
                            }
                        }
                        C50294JoY c50294JoY17 = (C50294JoY) linkedHashMap.get(str);
                        if (c50294JoY17 != null) {
                            j6 = c50294JoY17.LJIJ;
                        } else {
                            j6 = 0;
                        }
                        if (currentTimeMillis - j6 > j10) {
                            C50294JoY c50294JoY18 = (C50294JoY) linkedHashMap.get(str);
                            if (c50294JoY18 != null) {
                                c50294JoY18.LJIJ = 0L;
                            }
                            C50294JoY c50294JoY19 = (C50294JoY) linkedHashMap.get(str);
                            if (c50294JoY19 != null && (list4 = c50294JoY19.LJIIIZ) != null) {
                                list4.clear();
                            }
                        }
                        C50294JoY c50294JoY20 = (C50294JoY) linkedHashMap.get(str);
                        if (c50294JoY20 != null) {
                            j7 = c50294JoY20.LJIJI;
                        } else {
                            j7 = 0;
                        }
                        if (currentTimeMillis - j7 > j10) {
                            C50294JoY c50294JoY21 = (C50294JoY) linkedHashMap.get(str);
                            if (c50294JoY21 != null) {
                                c50294JoY21.LJIJI = 0L;
                            }
                            C50294JoY c50294JoY22 = (C50294JoY) linkedHashMap.get(str);
                            if (c50294JoY22 != null && (list3 = c50294JoY22.LJIIJ) != null) {
                                list3.clear();
                            }
                        }
                        C50294JoY c50294JoY23 = (C50294JoY) linkedHashMap.get(str);
                        if (c50294JoY23 != null) {
                            j8 = c50294JoY23.LJIJJ;
                        } else {
                            j8 = 0;
                        }
                        if (currentTimeMillis - j8 > j10) {
                            C50294JoY c50294JoY24 = (C50294JoY) linkedHashMap.get(str);
                            if (c50294JoY24 != null) {
                                c50294JoY24.LJIJJ = 0L;
                            }
                            C50294JoY c50294JoY25 = (C50294JoY) linkedHashMap.get(str);
                            if (c50294JoY25 != null && (list2 = c50294JoY25.LJIIJJI) != null) {
                                list2.clear();
                            }
                        }
                        C50294JoY c50294JoY26 = (C50294JoY) linkedHashMap.get(str);
                        if (c50294JoY26 != null) {
                            j9 = c50294JoY26.LJIIZILJ;
                        } else {
                            j9 = 0;
                        }
                        if (currentTimeMillis - j9 > j10) {
                            C50294JoY c50294JoY27 = (C50294JoY) linkedHashMap.get(str);
                            if (c50294JoY27 != null) {
                                c50294JoY27.LJIIZILJ = 0L;
                            }
                            C50294JoY c50294JoY28 = (C50294JoY) linkedHashMap.get(str);
                            if (c50294JoY28 != null) {
                                c50294JoY28.LJIIIIZZ = "";
                            }
                        }
                    }
                    C50294JoY c50294JoY29 = (C50294JoY) linkedHashMap.get(str);
                    if (c50294JoY29 == null || (list = c50294JoY29.LJ) == null || list.isEmpty()) {
                        z = true;
                    }
                    return !z;
                }
            }
        }
        return false;
    }

    public static String LJIIIIZZ(String str) {
        if (str == null) {
            return "[]";
        }
        String json = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), C47261Igj.LJJIJ(str));
        o.LJIIIIZZ(json, "get().gson.toJson(listOf(keywords))");
        return json;
    }

    public static String LJIIIZ(List list) {
        if (list == null || list.isEmpty()) {
            return "[]";
        }
        String json = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), list);
        o.LJIIIIZZ(json, "get().gson.toJson(keywords)");
        return json;
    }

    public static void LIZLLL(String str, boolean z) {
        C50294JoY c50294JoY;
        if (str == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LJI());
        LIZ2.append(str);
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        java.util.Map<String, C50294JoY> map = LIZ;
        if (!map.containsKey(LIZIZ2)) {
            map.put(LIZIZ2, new C50294JoY(null));
        }
        if (!z || (c50294JoY = (C50294JoY) ((LinkedHashMap) map).get(LIZIZ2)) == null) {
            return;
        }
        c50294JoY.LIZ = true;
    }

    public static String LJ(String str, String str2) {
        if (o.LJ("homepage_friends", str2) || o.LJ("discovery", str2)) {
            return LJ;
        }
        return str;
    }
}
