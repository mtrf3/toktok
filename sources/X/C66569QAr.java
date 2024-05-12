package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.account.network.ttp.GetRegionResponse;
import com.ss.android.ugc.aweme.account.network.ttp.IRegionApi;
import com.ss.android.ugc.aweme.account.network.ttp.IgnoredResponse;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.QAr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66569QAr {
    public static final C66569QAr LIZ = new C66569QAr();
    public static final java.util.Map<String, C66571QAt> LIZIZ = new LinkedHashMap();
    public static final java.util.Map<String, C66571QAt> LIZJ = new LinkedHashMap();
    public static final java.util.Map<String, C66571QAt> LIZLLL = new LinkedHashMap();
    public static final java.util.Map<String, java.util.Map<String, C66571QAt>> LJ = new LinkedHashMap();
    public static final java.util.Map<String, C66571QAt> LJFF = new LinkedHashMap();
    public static final java.util.Map<String, C66571QAt> LJI = new LinkedHashMap();
    public static final List<C66571QAt> LJII = new ArrayList();

    public static C66571QAt LIZLLL() {
        ArrayList arrayList = (ArrayList) LJII;
        if (!arrayList.isEmpty()) {
            return (C66571QAt) ORZ.LLFF(arrayList);
        }
        return null;
    }

    public static void LJFF(boolean z) {
        C66571QAt c66571QAt;
        if (z) {
            List<C66571QAt> list = LJII;
            C66571QAt LIZLLL2 = LIZLLL();
            if (LIZLLL2 != null) {
                c66571QAt = C66571QAt.LIZ(LIZLLL2);
            } else {
                c66571QAt = new C66571QAt(0);
            }
            ((ArrayList) list).add(c66571QAt);
            return;
        }
        ((ArrayList) LJII).add(new C66571QAt(0));
    }

    public static void LJII(C66571QAt c66571QAt) {
        C66571QAt LIZLLL2 = LIZLLL();
        if (LIZLLL2 != null) {
            LIZLLL2.LJ = c66571QAt.LJ;
            LIZLLL2.LJFF = c66571QAt.LJFF;
            LIZLLL2.LJI = c66571QAt.LJI;
            LIZLLL2.LIZ = c66571QAt.LIZ;
            LIZLLL2.LIZJ = c66571QAt.LIZJ;
            LIZLLL2.LIZIZ = c66571QAt.LIZIZ;
        }
    }

    public static void LIZ(String str, String str2) {
        HashMap hashMap = new HashMap();
        C66571QAt LIZLLL2 = LIZLLL();
        if (LIZLLL2 != null && C78685UuP.LJJJZ(LIZLLL2.LIZ)) {
            LIZLLL2.LJII = str;
            LIZLLL2.LJIIIIZZ = str2;
            String str3 = LIZLLL2.LJ;
            if (str3 != null) {
                hashMap.put("hashed_id", str3);
            }
            Integer num = LIZLLL2.LJFF;
            if (num != null) {
                C0EM.LIZJ(num, hashMap, "type");
            }
            String str4 = LIZLLL2.LJI;
            if (str4 != null) {
                hashMap.put("platform_app_id", str4);
            }
            String str5 = LIZLLL2.LJII;
            if (str5 != null) {
                hashMap.put("sec_uid", str5);
            }
            String str6 = LIZLLL2.LJIIIIZZ;
            if (str6 != null) {
                hashMap.put("screen_name", str6);
            }
            String str7 = LIZLLL2.LJIIIZ;
            if (str7 != null) {
                hashMap.put("pre_path", str7);
            }
            String str8 = LIZLLL2.LIZ;
            if (str8 != null) {
                hashMap.put("final_domain", str8);
            }
            C66572QAu.LIZ.getClass();
            Iterator<String> it = C66572QAu.LIZ().domains.iterator();
            while (it.hasNext()) {
                LJ(0, it.next(), hashMap);
            }
        }
    }

    public static void LJ(final int i, final String domain, final java.util.Map fieldMap) {
        o.LJIIIZ(domain, "domain");
        o.LJIIIZ(fieldMap, "fieldMap");
        if (i > 0 && !fieldMap.containsKey("is_retry")) {
            fieldMap.put("is_retry", "1");
        }
        IRegionApi.LIZ.getClass();
        C66570QAs.LIZ(domain).authBroadcast(fieldMap, C66570QAs.LIZIZ(domain, "/passport/app/auth_broadcast/", true)).LIZLLL(new C10I() { // from class: X.4gV
            @Override // X.C10I
            public final Object then(C10K c10k) {
                int i2;
                if ((!C82544WaS.LJ(c10k) || !TextUtils.equals(((IgnoredResponse) c10k.LJIIJJI()).message, "success")) && (i2 = i) <= 3) {
                    C66569QAr.LJ(i2 + 1, domain, fieldMap);
                }
                return C76800UCe.LIZ;
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String LIZIZ(int i, String str, String id, String str2, String str3) {
        C66571QAt c66571QAt;
        boolean z;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        o.LJIIIZ(id, "id");
        C66571QAt LIZLLL2 = LIZLLL();
        if (LIZLLL2 != null) {
            LIZLLL2.LJIIIZ = str;
        }
        switch (i) {
            case 1:
                c66571QAt = (C66571QAt) ((LinkedHashMap) LIZIZ).get(id);
                break;
            case 2:
                c66571QAt = (C66571QAt) ((LinkedHashMap) LIZJ).get(id);
                break;
            case 3:
                c66571QAt = (C66571QAt) ((LinkedHashMap) LIZLLL).get(id);
                break;
            case 4:
                java.util.Map<String, java.util.Map<String, C66571QAt>> map = LJ;
                o.LJI(str3);
                java.util.Map map2 = (java.util.Map) ((LinkedHashMap) map).get(str3);
                if (map2 != null) {
                    c66571QAt = (C66571QAt) map2.get(id);
                    break;
                }
                c66571QAt = null;
                break;
            case 5:
                c66571QAt = (C66571QAt) ((LinkedHashMap) LJFF).get(id);
                break;
            case 6:
                c66571QAt = (C66571QAt) ((LinkedHashMap) LJI).get(id);
                break;
            default:
                c66571QAt = null;
                break;
        }
        if (c66571QAt == null) {
            C66572QAu.LIZ.getClass();
            List<String> list = C66572QAu.LIZ().domains;
            boolean z2 = false;
            if (list == null || list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ArrayList arrayList = new ArrayList();
                CountDownLatch countDownLatch = new CountDownLatch(list.size());
                if (i != 5 && i != 6) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(id);
                    LIZ2.append("aDy0TUhtql92P7hScCs97YWMT-jub2q9");
                    String string = X1D.LIZIZ(LIZ2);
                    o.LJIIIZ(string, "string");
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    byte[] bytes = string.getBytes(PVC.LIZ);
                    o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
                    str4 = C38352F3k.LJ(messageDigest.digest(bytes));
                } else {
                    str4 = id;
                }
                Iterator<String> it = list.iterator();
                while (true) {
                    String str12 = str2;
                    if (it.hasNext()) {
                        str4 = str4;
                        LIZJ(i, 0, it.next(), str4, str12, arrayList, countDownLatch, true);
                    } else {
                        countDownLatch.await();
                        if (arrayList.size() == 0) {
                            CountDownLatch countDownLatch2 = new CountDownLatch(1);
                            str4 = str4;
                            str12 = str12;
                            LIZJ(i, 0, (String) ListProtector.get(list, 0), str4, str12, arrayList, countDownLatch2, false);
                            countDownLatch2.await();
                        }
                        JSONObject jSONObject = new JSONObject();
                        int size = arrayList.size();
                        if (size != 0) {
                            if (size != 1) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    String str13 = ((GetRegionResponse.Data) next).domain;
                                    Object obj = linkedHashMap.get(str13);
                                    if (obj == null) {
                                        obj = new ArrayList();
                                        linkedHashMap.put(str13, obj);
                                    }
                                    ((List) obj).add(next);
                                }
                                str8 = null;
                                str6 = null;
                                str7 = null;
                                boolean z3 = false;
                                str5 = null;
                                for (Map.Entry entry : linkedHashMap.entrySet()) {
                                    Object key = entry.getKey();
                                    o.LJI(key);
                                    try {
                                        jSONObject.put((String) key, ((GetRegionResponse.Data) ListProtector.get((List) entry.getValue(), 0)).countryCode);
                                    } catch (Exception e) {
                                        C16880lQ.LLLLIIL(e);
                                    }
                                    if (((List) entry.getValue()).size() >= 2) {
                                        str5 = (String) entry.getKey();
                                        str8 = ((GetRegionResponse.Data) ListProtector.get((List) entry.getValue(), 0)).countryCode;
                                        str6 = ((GetRegionResponse.Data) ListProtector.get((List) entry.getValue(), 0)).captchaDomain;
                                        for (GetRegionResponse.Data data : (List) entry.getValue()) {
                                            if (C78685UuP.LJJJZ(data.deviceRedirectInfo)) {
                                                str7 = data.deviceRedirectInfo;
                                            }
                                        }
                                    } else {
                                        z3 = true;
                                    }
                                }
                                z2 = z3;
                            } else {
                                GetRegionResponse.Data data2 = (GetRegionResponse.Data) ListProtector.get(arrayList, 0);
                                String str14 = data2.domain;
                                o.LJI(str14);
                                try {
                                    jSONObject.put(str14, data2.countryCode);
                                } catch (Exception e2) {
                                    C16880lQ.LLLLIIL(e2);
                                }
                                str8 = data2.countryCode;
                                str5 = data2.domain;
                                str6 = data2.captchaDomain;
                                str7 = data2.deviceRedirectInfo;
                                z2 = true;
                            }
                        } else {
                            str5 = null;
                            str6 = null;
                            str7 = null;
                            str8 = null;
                        }
                        if (z2) {
                            for (String str15 : list) {
                                String jSONObject2 = jSONObject.toString();
                                o.LJIIIIZZ(jSONObject2, "resultJson.toString()");
                                LJI(str15, str4, i, 0, str12, jSONObject2);
                            }
                        }
                        if (str5 != null && str6 != null) {
                            Integer valueOf = Integer.valueOf(i);
                            C66571QAt LIZLLL3 = LIZLLL();
                            if (LIZLLL3 != null) {
                                str9 = LIZLLL3.LJII;
                            } else {
                                str9 = null;
                            }
                            C66571QAt LIZLLL4 = LIZLLL();
                            if (LIZLLL4 != null) {
                                str10 = LIZLLL4.LJIIIIZZ;
                            } else {
                                str10 = null;
                            }
                            C66571QAt LIZLLL5 = LIZLLL();
                            if (LIZLLL5 != null) {
                                str11 = LIZLLL5.LJIIIZ;
                            } else {
                                str11 = null;
                            }
                            C66571QAt c66571QAt2 = new C66571QAt(str5, str6, str7, str8, str4, str12, str9, str10, str11, valueOf);
                            C66571QAt LIZ3 = C66571QAt.LIZ(c66571QAt2);
                            switch (i) {
                                case 1:
                                    LIZIZ.put(id, LIZ3);
                                    break;
                                case 2:
                                    LIZJ.put(id, LIZ3);
                                    break;
                                case 3:
                                    LIZLLL.put(id, LIZ3);
                                    break;
                                case 4:
                                    java.util.Map<String, java.util.Map<String, C66571QAt>> map3 = LJ;
                                    o.LJI(str3);
                                    java.util.Map<String, C66571QAt> map4 = (java.util.Map) ((LinkedHashMap) map3).get(str3);
                                    if (map4 == null) {
                                        map4 = new LinkedHashMap<>();
                                        map3.put(str3, map4);
                                    }
                                    map4.put(id, LIZ3);
                                    break;
                                case 5:
                                    LJFF.put(id, LIZ3);
                                    break;
                                case 6:
                                    LJI.put(id, LIZ3);
                                    break;
                            }
                            LJII(C66571QAt.LIZ(c66571QAt2));
                            return str5;
                        }
                    }
                }
            }
            return null;
        }
        LJII(c66571QAt);
        return c66571QAt.LIZ;
    }

    public static void LJI(String str, String str2, int i, int i2, String str3, String str4) {
        HH1.LIZ(str, "domain", str2, "hashedId", str4, "result");
        IRegionApi.LIZ.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("hashed_id", str2);
        hashMap.put("type", String.valueOf(i));
        hashMap.put("result", str4);
        if (C78685UuP.LJJJZ(str3)) {
            o.LJI(str3);
            hashMap.put("platform_app_id", str3);
        }
        C66570QAs.LIZ(str).regionAlert(hashMap, C66570QAs.LIZIZ(str, "/passport/app/region_alert/", true)).LIZLLL(new C39585FgD(str, str2, i, i2, str3, str4));
    }

    public static void LIZJ(int i, int i2, String domain, String hashedId, String str, List resultList, CountDownLatch countDownLatch, boolean z) {
        o.LJIIIZ(domain, "domain");
        o.LJIIIZ(hashedId, "hashedId");
        o.LJIIIZ(countDownLatch, "countDownLatch");
        o.LJIIIZ(resultList, "resultList");
        IRegionApi.LIZ.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("hashed_id", hashedId);
        hashMap.put("type", String.valueOf(i));
        if (C78685UuP.LJJJZ(str)) {
            o.LJI(str);
            hashMap.put("platform_app_id", str);
        }
        C66570QAs.LIZ(domain).getRegion(hashMap, C66570QAs.LIZIZ(domain, "/passport/app/region/", z)).LIZLLL(new C66568QAq(i2, i, domain, hashedId, str, resultList, countDownLatch, z));
    }
}
