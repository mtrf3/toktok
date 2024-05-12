package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.service.PoiServiceImpl;
import com.ss.android.ugc.aweme.roaming.RoamingLocationInfo;
import com.ss.android.ugc.aweme.settings.PublishLandingNearbyRevisitSettings;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes10.dex */
public final class LJA {
    public static String LIZJ;
    public static Integer LIZLLL;
    public static final java.util.Map<String, String> LIZ = new LinkedHashMap();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(LJB.LJLIL);

    public static RoamingLocationInfo LIZIZ() {
        ActivityC45651qj LJJIFFI;
        Activity[] activities = ActivityStack.getActivityStack();
        o.LJIIIIZZ(activities, "activities");
        int length = activities.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Activity activity = activities[i];
            if (activity instanceof InterfaceC55058LjC) {
                if (activity != null && (LJJIFFI = C45804HyK.LJJIFFI(activity)) != null) {
                    RoamingLocationInfo LIZIZ2 = LJ5.LIZIZ(LJJIFFI);
                    if (LIZIZ2 == null) {
                        return LJ5.LJFF();
                    }
                    return LIZIZ2;
                }
            } else {
                i++;
            }
        }
        return null;
    }

    public static OSZ LIZJ(int i) {
        Integer num;
        String LLD;
        Integer num2;
        Long LIZLLL2;
        String str;
        Object LIZ2;
        List LJFF;
        Object LJLLLLLL;
        Integer num3 = null;
        if (!PoiServiceImpl.LIZIZ().LJJIL() || (num = PublishLandingNearbyRevisitSettings.LIZ().insertPosition) == null || i > num.intValue()) {
            return null;
        }
        String[] LIZIZ2 = LJ6.LIZIZ();
        if (LIZIZ2.length == 0) {
            LLD = null;
        } else {
            C61898ORa.LJJIIJZLJL((Comparator) LJ.getValue(), LIZIZ2);
            ArrayList arrayList = (ArrayList) ORY.LJLIIIL(LIZIZ2);
            Iterator it = arrayList.iterator();
            ArrayList arrayList2 = new ArrayList();
            RoamingLocationInfo LIZIZ3 = LIZIZ();
            Gson LIZ3 = GsonHolder.LIZLLL().LIZ();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2 != null && str2.length() != 0 && (num2 = PublishLandingNearbyRevisitSettings.LIZ().expireDays) != null) {
                    long LIZJ2 = LJE.LIZJ(num2.intValue());
                    List LJFF2 = LJFF(str2);
                    if (LJFF2 != null && (LIZLLL2 = LIZLLL(LJFF2)) != null) {
                        if (System.currentTimeMillis() - LIZLLL2.longValue() < LIZJ2) {
                            List LJFF3 = LJFF(str2);
                            if (LJFF3 != null) {
                                str = (String) ORZ.LJLLLLLL(2, LJFF3);
                            } else {
                                str = null;
                            }
                            try {
                                LIZ2 = (PoiData) LIZ3.LJI(str, PoiData.class);
                                C3C5.m7constructorimpl(LIZ2);
                            } catch (Throwable th) {
                                LIZ2 = C141335gf.LIZ(th);
                                C3C5.m7constructorimpl(LIZ2);
                            }
                            if (C3C5.m12isFailureimpl(LIZ2)) {
                                LIZ2 = null;
                            }
                            PoiData poiData = (PoiData) LIZ2;
                            if (poiData != null && LIZ(poiData, LIZIZ3) && (LJFF = LJFF(str2)) != null && (LJLLLLLL = ORZ.LJLLLLLL(0, LJFF)) != null) {
                                arrayList2.add(LJLLLLLL);
                            }
                        }
                    }
                }
                it.remove();
            }
            String[] array = (String[]) arrayList.toArray(new String[0]);
            o.LJIIIZ(array, "array");
            LJ6.LIZ.storeStringArray("publish_landing_nearby_insert_awemes", array);
            LLD = ORZ.LLD(arrayList2, ",", null, null, null, 62);
        }
        Integer num4 = LIZLLL;
        if (num4 != null) {
            num3 = Integer.valueOf(num4.intValue() + 1);
        }
        return new OSZ(LLD, num3);
    }

    public static Long LIZLLL(List list) {
        Object LIZ2;
        Object obj = null;
        try {
            String str = (String) ORZ.LJLLLLLL(1, list);
            if (str != null) {
                LIZ2 = Long.valueOf(CastLongProtector.parseLong(str));
            } else {
                LIZ2 = null;
            }
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (!C3C5.m12isFailureimpl(LIZ2)) {
            obj = LIZ2;
        }
        return (Long) obj;
    }

    public static List LJFF(String str) {
        o.LJIIIZ(str, "<this>");
        List LJLJJL = s.LJLJJL(str, new String[]{"_"}, 3, 2);
        if (LJLJJL.size() == 3) {
            return LJLJJL;
        }
        return null;
    }

    public static List LJI(String str) {
        o.LJIIIZ(str, "<this>");
        List LJLJJL = s.LJLJJL(str, new String[]{"_"}, 2, 2);
        if (LJLJJL.size() == 2) {
            return LJLJJL;
        }
        return null;
    }

    public static void LJII(Integer num) {
        Integer num2 = PublishLandingNearbyRevisitSettings.LIZ().insertPosition;
        Integer num3 = null;
        if (num2 == null) {
            LIZLLL = null;
            return;
        }
        if (num2.intValue() - 1 < 0) {
            LIZLLL = null;
            return;
        }
        if (num == null || num.intValue() == 0) {
            LIZLLL = C77339UWx.LIZIZ(num2, -1);
            return;
        }
        int intValue = num2.intValue() - 1;
        if (intValue <= 6 && intValue - num.intValue() >= 0) {
            num3 = Integer.valueOf(intValue - num.intValue());
        }
        LIZLLL = num3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(com.ss.android.ugc.aweme.poi.PoiData r6, com.ss.android.ugc.aweme.roaming.RoamingLocationInfo r7) {
        /*
            r5 = 0
            if (r6 != 0) goto L4
            return r5
        L4:
            X.LQA r0 = X.LQA.LIZIZ
            boolean r0 = r0.LJIIL()
            if (r0 != 0) goto Ld
            return r5
        Ld:
            com.ss.android.ugc.aweme.poi.PoiDetails r0 = r6.getPoiDetails()
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            r3 = 0
            if (r0 == 0) goto L23
            java.lang.String r0 = r0.getGeoNameIds()
        L1d:
            X.C78685UuP.LJJLIIIJILLIZJL(r0, r4)
            if (r7 == 0) goto L25
            goto L27
        L23:
            r0 = r3
            goto L1d
        L25:
            r2 = r3
            goto L35
        L27:
            java.lang.String r0 = r7.getLevel()     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L25
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.Throwable -> L39
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L39
        L35:
            X.C3C5.m7constructorimpl(r2)     // Catch: java.lang.Throwable -> L39
            goto L41
        L39:
            r0 = move-exception
            X.3C4 r2 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r2)
        L41:
            boolean r0 = X.C3C5.m12isFailureimpl(r2)
            if (r0 == 0) goto L48
            r2 = r3
        L48:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L7e
            r2.intValue()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "l"
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = "_geoname_id"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L79
            java.lang.Object r0 = r4.get(r1)
            if (r7 == 0) goto L72
            java.lang.String r3 = r7.getCityCode()
        L72:
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r3)
            if (r0 != 0) goto L7a
            return r5
        L79:
            return r5
        L7a:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L7f
        L7e:
            return r5
        L7f:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LJA.LIZ(com.ss.android.ugc.aweme.poi.PoiData, com.ss.android.ugc.aweme.roaming.RoamingLocationInfo):boolean");
    }

    public static void LJ(String str, java.util.Map map, ActivityC45651qj activityC45651qj) {
        String str2 = null;
        if (C78685UuP.LJJJZ(str) && str != null) {
            if (o.LJ(str, "HOME") && LQA.LIZIZ.LIZJ()) {
                AbstractC53895LDf rv0 = com.bytedance.hox.Hox.LJLLI.LIZ(activityC45651qj).rv0("Nearby");
                if (rv0 != null) {
                    str2 = rv0.LJIIL();
                }
                map.put("enter_from", String.valueOf(str2));
            } else if (!o.LJ(str, "HOME")) {
                AbstractC53895LDf rv02 = com.bytedance.hox.Hox.LJLLI.LIZ(activityC45651qj).rv0(str);
                if (rv02 != null) {
                    str2 = rv02.LJIIL();
                }
                map.put("enter_from", String.valueOf(str2));
            }
        }
        map.put("enter_method", "publish_landing");
        java.util.Map<String, String> map2 = LIZ;
        ((LinkedHashMap) map2).clear();
        map2.putAll(map);
    }

    public static C54874LgE LJIIIIZZ(boolean z, C54874LgE c54874LgE, int i) {
        String str;
        if (!z) {
            return c54874LgE;
        }
        OSZ LIZJ2 = LIZJ(i);
        Integer num = null;
        if (LIZJ2 != null) {
            str = (String) LIZJ2.getFirst();
            num = (Integer) LIZJ2.getSecond();
        } else {
            str = null;
        }
        return new C54874LgE(c54874LgE.LIZ, c54874LgE.LIZIZ, c54874LgE.LIZJ, c54874LgE.LIZLLL, c54874LgE.LJ, c54874LgE.LJFF, c54874LgE.LJI, c54874LgE.LJII, c54874LgE.LJIIIIZZ, c54874LgE.LJIIIZ, str, num);
    }
}
