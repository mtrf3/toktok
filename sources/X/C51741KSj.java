package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.KSj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51741KSj {
    public static boolean LIZ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public static int LIZIZ = -1;
    public static int LIZJ = -1;
    public static long LJII = -1;

    public static int LJ() {
        double d = EF7.LIZIZ().getResources().getDisplayMetrics().density;
        if (LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX <= d && d <= 1.4d) {
            return 1;
        }
        if (1.4d <= d && d <= 2.4d) {
            return 2;
        }
        return 3;
    }

    public static void LIZJ(java.util.Map map, boolean z) {
        boolean z2;
        EnumC51740KSi enumC51740KSi;
        String value;
        EnumC51740KSi enumC51740KSi2;
        String value2;
        C36746EbW.LIZ(3, "ShopTabV3 ImgPreload");
        if (!LIZ) {
            C36746EbW.LIZ(3, "ShopTabV3 ImgPreload");
            List LIZIZ2 = C35685DzV.LIZIZ(map);
            String src = EnumC123164sS.LOAD_FROM_OPERATION.getSrc();
            Boolean LIZ2 = C35685DzV.LIZ(map);
            boolean z3 = false;
            if (LIZ2 != null) {
                z2 = LIZ2.booleanValue();
            } else {
                z2 = false;
            }
            if (z) {
                enumC51740KSi = EnumC51740KSi.LOAD_IN_HOME_FEED;
            } else {
                enumC51740KSi = EnumC51740KSi.LOAD_IN_MALL;
            }
            String pageName = enumC51740KSi.getPageName();
            if (z) {
                if (LJII == -1) {
                    LJII = System.currentTimeMillis();
                }
                value = EnumC51744KSm.LOCAL_FIRST_REQUEST.getValue();
            } else if (LJII != -1 && System.currentTimeMillis() - LJII < 30000) {
                value = EnumC51744KSm.LOCAL_FIRST_REQUEST.getValue();
            } else {
                value = EnumC51744KSm.REMOTE_SECOND_REQUEST.getValue();
            }
            LIZLLL(LIZIZ2, src, z2, pageName, value);
            C36746EbW.LIZ(3, "ShopTabV3 ImgPreload");
            List LIZJ2 = C35685DzV.LIZJ(map);
            String src2 = EnumC123164sS.LOAD_FROM_RECOMMEND.getSrc();
            Boolean LIZ3 = C35685DzV.LIZ(map);
            if (LIZ3 != null) {
                z3 = LIZ3.booleanValue();
            }
            if (z) {
                enumC51740KSi2 = EnumC51740KSi.LOAD_IN_HOME_FEED;
            } else {
                enumC51740KSi2 = EnumC51740KSi.LOAD_IN_MALL;
            }
            String pageName2 = enumC51740KSi2.getPageName();
            if (z) {
                value2 = EnumC51744KSm.LOCAL_FIRST_REQUEST.getValue();
            } else {
                value2 = EnumC51744KSm.REMOTE_SECOND_REQUEST.getValue();
            }
            LIZLLL(LIZJ2, src2, z3, pageName2, value2);
        }
    }

    public static int LJFF(String str, boolean z) {
        try {
            if (o.LJ(str, EnumC123164sS.LOAD_FROM_OPERATION.getSrc())) {
                int i = LIZIZ;
                if (i != -1) {
                    return i;
                }
                SettingsManager.LIZLLL().getClass();
                String LJI2 = SettingsManager.LJI("tt_mall_preload_image_size", "{\"promotionPreLoadEntry\":\"8,6\",\"recommendPreLoadEntry\":\"2,2\"}");
                o.LJIIIIZZ(LJI2, "getInstance().getStringV…SizeSettings::class.java)");
                String string = JSONObjectProtectorUtils.getString(new JSONObject(LJI2), "promotionPreLoadEntry");
                o.LJIIIIZZ(string, "commonParamsJson.getStri…(\"promotionPreLoadEntry\")");
                List LJLJJL = s.LJLJJL(s.LJZI(string).toString(), new String[]{","}, 0, 6);
                ArrayList arrayList = new ArrayList(C32I.LJJL(LJLJJL, 10));
                Iterator it = LJLJJL.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(CastIntegerProtector.parseInt((String) it.next())));
                }
                if (z) {
                    Object LJLLJ = ORZ.LJLLJ(arrayList);
                    LIZIZ = ((Number) LJLLJ).intValue();
                    return ((Number) LJLLJ).intValue();
                }
                Object LLFF = ORZ.LLFF(arrayList);
                LIZIZ = ((Number) LLFF).intValue();
                return ((Number) LLFF).intValue();
            }
            int i2 = LIZJ;
            if (i2 != -1) {
                return i2;
            }
            SettingsManager.LIZLLL().getClass();
            String LJI3 = SettingsManager.LJI("tt_mall_preload_image_size", "{\"promotionPreLoadEntry\":\"8,6\",\"recommendPreLoadEntry\":\"2,2\"}");
            o.LJIIIIZZ(LJI3, "getInstance().getStringV…SizeSettings::class.java)");
            String string2 = JSONObjectProtectorUtils.getString(new JSONObject(LJI3), "recommendPreLoadEntry");
            o.LJIIIIZZ(string2, "commonParamsJson.getStri…(\"recommendPreLoadEntry\")");
            List LJLJJL2 = s.LJLJJL(s.LJZI(string2).toString(), new String[]{","}, 0, 6);
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJLJJL2, 10));
            Iterator it2 = LJLJJL2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(CastIntegerProtector.parseInt((String) it2.next())));
            }
            if (z) {
                Object LJLLJ2 = ORZ.LJLLJ(arrayList2);
                LIZJ = ((Number) LJLLJ2).intValue();
                return ((Number) LJLLJ2).intValue();
            }
            Object LLFF2 = ORZ.LLFF(arrayList2);
            LIZJ = ((Number) LLFF2).intValue();
            return ((Number) LLFF2).intValue();
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return -1;
        }
    }

    public static void LIZ(Boolean bool, List list, List list2, String pageName, String requestType) {
        o.LJIIIZ(pageName, "pageName");
        o.LJIIIZ(requestType, "requestType");
        if (bool != null) {
            bool.booleanValue();
            C36746EbW.LIZ(3, "ShopTabV3 ImgPreload");
            if (!LIZ) {
                C36746EbW.LIZ(3, "ShopTabV3 ImgPreload");
                LIZLLL(list, EnumC123164sS.LOAD_FROM_OPERATION.getSrc(), bool.booleanValue(), pageName, requestType);
                C36746EbW.LIZ(3, "ShopTabV3 ImgPreload");
                LIZLLL(list2, EnumC123164sS.LOAD_FROM_RECOMMEND.getSrc(), bool.booleanValue(), pageName, requestType);
            }
        }
    }

    public static void LIZIZ(long j, String str, String str2, String str3, String str4) {
        W5U.LJIIIIZZ(str).LJIIIZ(new C51742KSk(str2, str3, str4, j, str));
    }

    public static void LIZLLL(List list, String str, boolean z, String str2, String str3) {
        HH1.LIZ(str, "loadSrc", str2, "pageName", str3, "requestType");
        int i = 3;
        int i2 = 2;
        if (o.LJ(str3, EnumC51744KSm.LOCAL_FIRST_REQUEST.getValue())) {
            if (LIZLLL && LJ) {
                return;
            }
            if (C51749KSr.LIZ() == 2 || C51749KSr.LIZ() == 3) {
                EnumC51740KSi enumC51740KSi = EnumC51740KSi.LOAD_IN_MALL;
                if (o.LJ(str2, enumC51740KSi.getPageName()) && o.LJ(str, EnumC123164sS.LOAD_FROM_OPERATION.getSrc())) {
                    LIZLLL = true;
                }
                if (o.LJ(str2, enumC51740KSi.getPageName()) && o.LJ(str, EnumC123164sS.LOAD_FROM_RECOMMEND.getSrc())) {
                    LJ = true;
                }
            } else {
                if (o.LJ(str, EnumC123164sS.LOAD_FROM_OPERATION.getSrc())) {
                    LIZLLL = true;
                }
                if (o.LJ(str, EnumC123164sS.LOAD_FROM_RECOMMEND.getSrc())) {
                    LJ = true;
                }
            }
        } else {
            if (LJFF && LJI) {
                return;
            }
            if (o.LJ(str, EnumC123164sS.LOAD_FROM_OPERATION.getSrc())) {
                LJFF = true;
            }
            if (o.LJ(str, EnumC123164sS.LOAD_FROM_RECOMMEND.getSrc())) {
                LJI = true;
            }
        }
        C76800UCe c76800UCe = null;
        if (list != null) {
            try {
                int i3 = 0;
                for (Object obj : list) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        String str4 = (String) obj;
                        if (i3 < LJFF(str, z)) {
                            int LIZ2 = C51749KSr.LIZ();
                            if (LIZ2 == 1) {
                                if (!LIZ) {
                                    C56092Lzs c56092Lzs = C56092Lzs.LIZ;
                                    String value = EnumC51745KSn.LOAD_IN_MEMORY.getValue();
                                    c56092Lzs.getClass();
                                    C56092Lzs.LJIIIIZZ(str2, str3, value, str);
                                    LIZIZ(System.currentTimeMillis(), str4, str2, str3, str);
                                }
                            } else if (LIZ2 != i2) {
                                if (LIZ2 != i) {
                                    if (LIZ2 == 4 && !LIZ && o.LJ(str2, EnumC51740KSi.LOAD_IN_HOME_FEED.getPageName())) {
                                        C56092Lzs c56092Lzs2 = C56092Lzs.LIZ;
                                        String value2 = EnumC51745KSn.LOAD_IN_MEMORY.getValue();
                                        c56092Lzs2.getClass();
                                        C56092Lzs.LJIIIIZZ(str2, str3, value2, str);
                                        LIZIZ(System.currentTimeMillis(), str4, str2, str3, str);
                                    }
                                } else if (!LIZ && o.LJ(str2, EnumC51740KSi.LOAD_IN_MALL.getPageName())) {
                                    C56092Lzs c56092Lzs3 = C56092Lzs.LIZ;
                                    String value3 = EnumC51745KSn.LOAD_IN_MEMORY.getValue();
                                    c56092Lzs3.getClass();
                                    C56092Lzs.LJIIIIZZ(str2, str3, value3, str);
                                    LIZIZ(System.currentTimeMillis(), str4, str2, str3, str);
                                }
                            } else if (!LIZ && o.LJ(str2, EnumC51740KSi.LOAD_IN_HOME_FEED.getPageName())) {
                                C56092Lzs c56092Lzs4 = C56092Lzs.LIZ;
                                String value4 = EnumC51745KSn.LOAD_IN_DISK.getValue();
                                c56092Lzs4.getClass();
                                C56092Lzs.LJIIIIZZ(str2, str3, value4, str);
                                W5U.LJIIIIZZ(str4).LJII(new C51743KSl(str2, str3, str, System.currentTimeMillis(), str4));
                            } else if (!LIZ) {
                                C56092Lzs c56092Lzs5 = C56092Lzs.LIZ;
                                String value5 = EnumC51745KSn.LOAD_IN_MEMORY.getValue();
                                c56092Lzs5.getClass();
                                C56092Lzs.LJIIIIZZ(str2, str3, value5, str);
                                LIZIZ(System.currentTimeMillis(), str4, str2, str3, str);
                            }
                        }
                        i = 3;
                        i2 = 2;
                        i3 = i4;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                c76800UCe = C76800UCe.LIZ;
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
                return;
            }
        }
        C3C5.m7constructorimpl(c76800UCe);
    }
}
