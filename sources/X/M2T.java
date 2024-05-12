package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class M2T {
    public static final int LIZ = Q7K.LIZIZ("ec_source_list_max_length", 2);

    public static ArrayList LIZIZ(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(arrayList, i);
            o.LJIIIIZZ(obj, "trafficSourceList[index]");
            if (obj instanceof Number) {
                arrayList2.add(Integer.valueOf(((Number) obj).intValue()));
            }
        }
        return arrayList2;
    }

    public static int[] LJ(Aweme aweme) {
        HashMap<String, String> mobParams;
        String str;
        Object obj;
        String str2;
        int[] iArr = null;
        if (aweme != null && (mobParams = aweme.getMobParams()) != null && (str = mobParams.get("traffic_source_list")) != null) {
            if (!(str instanceof int[])) {
                obj = null;
            } else {
                obj = str;
            }
            int[] iArr2 = (int[]) obj;
            if (iArr2 == null) {
                if (str instanceof String) {
                    str2 = str;
                } else {
                    str2 = null;
                }
                try {
                    Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str2, C65330PkU.LIZJ(C65352Pkq.LIZLLL(int[].class)));
                    if (!(fromJson instanceof int[])) {
                        fromJson = null;
                    }
                    iArr = (int[]) fromJson;
                } catch (s unused) {
                }
            } else {
                iArr = iArr2;
            }
        }
        return LIZ(2, iArr);
    }

    public static int[] LJFF(HashMap hashMap) {
        Object obj;
        ArrayList arrayList;
        if (hashMap != null) {
            try {
                if (hashMap.containsKey("traffic_source_list") && (obj = hashMap.get("traffic_source_list")) != null && (obj instanceof ArrayList)) {
                    if (obj instanceof ArrayList) {
                        arrayList = (ArrayList) obj;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        return ORZ.LLJ(LIZIZ(arrayList));
                    }
                }
                return null;
            } catch (Exception e) {
                C52966KqY.LIZ(e);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[Catch: Exception -> 0x0089, TryCatch #0 {Exception -> 0x0089, blocks: (B:47:0x0006, B:6:0x0012, B:13:0x0023, B:16:0x002a, B:18:0x0035, B:20:0x003c, B:22:0x0042, B:24:0x004f, B:26:0x005b, B:28:0x0063, B:30:0x0069, B:32:0x0074, B:36:0x0077, B:38:0x007d, B:40:0x0084, B:42:0x0048), top: B:46:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a A[Catch: Exception -> 0x0089, TryCatch #0 {Exception -> 0x0089, blocks: (B:47:0x0006, B:6:0x0012, B:13:0x0023, B:16:0x002a, B:18:0x0035, B:20:0x003c, B:22:0x0042, B:24:0x004f, B:26:0x005b, B:28:0x0063, B:30:0x0069, B:32:0x0074, B:36:0x0077, B:38:0x007d, B:40:0x0084, B:42:0x0048), top: B:46:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] LJI(android.net.Uri r11) {
        /*
            java.lang.String r3 = "traffic_source_list"
            r10 = 0
            r6 = 2
            if (r11 == 0) goto Ld
            java.lang.String r0 = "trackParams"
            java.lang.String r2 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r11, r0)     // Catch: java.lang.Exception -> L89
            goto Le
        Ld:
            r2 = r10
        Le:
            r7 = 1
            r9 = 0
            if (r2 == 0) goto L1a
            int r0 = r2.length()     // Catch: java.lang.Exception -> L89
            if (r0 != 0) goto L1c
            r0 = 1
            goto L1d
        L1a:
            r0 = 0
            goto L20
        L1c:
            r0 = 0
        L1d:
            if (r0 != r7) goto L1a
            r0 = 1
        L20:
            r8 = 6
            if (r0 == 0) goto L2a
            int[] r0 = new int[r6]     // Catch: java.lang.Exception -> L89
            r0[r9] = r8     // Catch: java.lang.Exception -> L89
            r0[r7] = r7     // Catch: java.lang.Exception -> L89
            return r0
        L2a:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L89
            r1.<init>(r2)     // Catch: java.lang.Exception -> L89
            boolean r0 = r1.has(r3)     // Catch: java.lang.Exception -> L89
            if (r0 != 0) goto L3c
            int[] r0 = new int[r6]     // Catch: java.lang.Exception -> L89
            r0[r9] = r8     // Catch: java.lang.Exception -> L89
            r0[r7] = r7     // Catch: java.lang.Exception -> L89
            return r0
        L3c:
            org.json.JSONArray r5 = r1.optJSONArray(r3)     // Catch: java.lang.Exception -> L89
            if (r5 == 0) goto L48
            int r0 = r5.length()     // Catch: java.lang.Exception -> L89
            if (r0 != 0) goto L4f
        L48:
            int[] r0 = new int[r6]     // Catch: java.lang.Exception -> L89
            r0[r9] = r8     // Catch: java.lang.Exception -> L89
            r0[r7] = r7     // Catch: java.lang.Exception -> L89
            return r0
        L4f:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> L89
            r4.<init>()     // Catch: java.lang.Exception -> L89
            int r3 = r5.length()     // Catch: java.lang.Exception -> L89
            r2 = 0
        L59:
            if (r2 >= r3) goto L77
            java.lang.Object r1 = r5.get(r2)     // Catch: java.lang.Exception -> L89
            boolean r0 = r1 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L89
            if (r0 == 0) goto L66
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L89
            goto L67
        L66:
            r1 = r10
        L67:
            if (r1 == 0) goto L74
            int r0 = r1.intValue()     // Catch: java.lang.Exception -> L89
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L89
            r4.add(r0)     // Catch: java.lang.Exception -> L89
        L74:
            int r2 = r2 + 1
            goto L59
        L77:
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Exception -> L89
            if (r0 == 0) goto L84
            int[] r0 = new int[r6]     // Catch: java.lang.Exception -> L89
            r0[r9] = r8     // Catch: java.lang.Exception -> L89
            r0[r7] = r7     // Catch: java.lang.Exception -> L89
            return r0
        L84:
            int[] r0 = X.ORZ.LLJ(r4)     // Catch: java.lang.Exception -> L89
            return r0
        L89:
            r0 = move-exception
            X.C52966KqY.LIZ(r0)
            int[] r0 = new int[r6]
            r0 = {x0094: FILL_ARRAY_DATA , data: [6, 1} // fill-array
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M2T.LJI(android.net.Uri):int[]");
    }

    public static String LJII(String str) {
        boolean z;
        String stringBuffer;
        boolean z2;
        StringBuffer stringBuffer2 = new StringBuffer();
        if (str != null) {
            int i = 0;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int[] iArr = null;
                try {
                    try {
                        Object LJII = C27739Aud.LJFF().LJII(str, C65330PkU.LIZJ(C65352Pkq.LJI(int[].class)));
                        if (!(LJII instanceof int[])) {
                            LJII = null;
                        }
                        iArr = (int[]) LJII;
                    } catch (s unused) {
                    }
                    if (iArr == null) {
                        iArr = new int[0];
                    }
                    if (iArr.length != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        stringBuffer2.append("[");
                        stringBuffer2.append(1);
                        stringBuffer2.append("]");
                        stringBuffer = stringBuffer2.toString();
                    } else {
                        Integer LJJJLL = ORY.LJJJLL(iArr);
                        if (LJJJLL == null || LJJJLL.intValue() != 1) {
                            List LJLI = ORY.LJLI(iArr);
                            ArrayList arrayList = (ArrayList) LJLI;
                            if (arrayList.size() >= LIZ) {
                                ListProtector.remove(LJLI, 0);
                            }
                            arrayList.add(1);
                            stringBuffer2.append("[");
                            int size = arrayList.size();
                            while (i < size) {
                                int intValue = ((Number) ListProtector.get(LJLI, i)).intValue();
                                if (i == arrayList.size() - 1) {
                                    stringBuffer2.append(intValue);
                                } else {
                                    stringBuffer2.append(intValue);
                                    stringBuffer2.append(",");
                                }
                                i++;
                            }
                            stringBuffer2.append("]");
                            stringBuffer = stringBuffer2.toString();
                        } else {
                            List LJLI2 = ORY.LJLI(iArr);
                            stringBuffer2.append("[");
                            ArrayList arrayList2 = (ArrayList) LJLI2;
                            int size2 = arrayList2.size();
                            while (i < size2) {
                                int intValue2 = ((Number) ListProtector.get(LJLI2, i)).intValue();
                                if (i == arrayList2.size() - 1) {
                                    stringBuffer2.append(intValue2);
                                } else {
                                    stringBuffer2.append(intValue2);
                                    stringBuffer2.append(",");
                                }
                                i++;
                            }
                            stringBuffer2.append("]");
                            stringBuffer = stringBuffer2.toString();
                        }
                    }
                } catch (Exception e) {
                    C52966KqY.LIZ(e);
                    stringBuffer2.append("[1]");
                    stringBuffer = stringBuffer2.toString();
                }
                o.LJIIIIZZ(stringBuffer, "{\n            try {\n    …)\n            }\n        }");
                return stringBuffer;
            }
        }
        stringBuffer2.append("[1]");
        String stringBuffer3 = stringBuffer2.toString();
        o.LJIIIIZZ(stringBuffer3, "{\n            buffer.app…\"]\").toString()\n        }");
        return stringBuffer3;
    }

    public static String LJIIIIZZ(Aweme aweme) {
        HashMap<String, String> mobParams;
        if (aweme != null && (mobParams = aweme.getMobParams()) != null) {
            return mobParams.get("traffic_source_list");
        }
        return null;
    }

    public static String LJIIIZ(HashMap hashMap) {
        String jSONArray;
        try {
            int[] LJFF = LJFF(hashMap);
            if (LJFF != null) {
                jSONArray = new JSONArray(LJFF).toString();
            } else {
                jSONArray = new JSONArray((Collection) new ArrayList()).toString();
            }
            o.LJIIIIZZ(jSONArray, "{\n            val traffi…)\n            }\n        }");
            return jSONArray;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            String jSONArray2 = new JSONArray((Collection) new ArrayList()).toString();
            o.LJIIIIZZ(jSONArray2, "{\n            EnsureMana…>()).toString()\n        }");
            return jSONArray2;
        }
    }

    public static int[] LIZ(int i, int[] iArr) {
        boolean z;
        if (iArr != null) {
            try {
                if (iArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Integer LJJJLL = ORY.LJJJLL(iArr);
                    if (LJJJLL != null && LJJJLL.intValue() == i) {
                        return iArr;
                    }
                    List LJLI = ORY.LJLI(iArr);
                    ArrayList arrayList = (ArrayList) LJLI;
                    if (arrayList.size() >= LIZ) {
                        ListProtector.remove(LJLI, 0);
                    }
                    arrayList.add(Integer.valueOf(i));
                    return ORZ.LLJ(LJLI);
                }
            } catch (Exception e) {
                C52966KqY.LIZ(e);
                return new int[]{i};
            }
        }
        return new int[]{i};
    }

    public static int[] LIZJ(int i, String str) {
        int[] iArr = null;
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(int[].class)));
            if (!(fromJson instanceof int[])) {
                fromJson = null;
            }
            iArr = (int[]) fromJson;
        } catch (s unused) {
        }
        return LIZ(i, iArr);
    }

    public static int[] LIZLLL(int i, java.util.Map trackParams) {
        boolean z;
        ArrayList arrayList;
        boolean z2;
        o.LJIIIZ(trackParams, "trackParams");
        try {
            if (trackParams.containsKey("traffic_source_list")) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return new int[]{i};
            }
            Object obj = trackParams.get("traffic_source_list");
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null && arrayList.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 || arrayList.size() == 0) {
                return new int[]{i};
            }
            ArrayList LIZIZ = LIZIZ(arrayList);
            if (LIZIZ.isEmpty()) {
                LIZIZ.add(Integer.valueOf(i));
            }
            Integer num = (Integer) ORZ.LLFII(LIZIZ);
            if (num != null && num.intValue() == i) {
                return ORZ.LLJ(LIZIZ);
            }
            if (LIZIZ.size() >= LIZ) {
                ListProtector.remove(LIZIZ, 0);
            }
            LIZIZ.add(Integer.valueOf(i));
            return ORZ.LLJ(LIZIZ);
        } catch (Exception e) {
            C52966KqY.LIZ(e);
            return new int[]{i};
        }
    }

    public static String LJIIJ(int i, String str) {
        String str2;
        JSONArray jSONArray;
        String uri;
        String uri2;
        boolean z;
        String str3;
        try {
            android.net.Uri parse = UriProtector.parse(str);
            if (parse != null) {
                str2 = UriProtector.getQueryParameter(parse, "trackParams");
            } else {
                str2 = null;
            }
            if (str2 != null) {
                JSONObject jSONObject = new JSONObject(str2);
                boolean z2 = true;
                if (jSONObject.has("traffic_source_list")) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("traffic_source_list");
                    if (optJSONArray != null && optJSONArray.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        jSONArray = new JSONArray(new int[]{i});
                    } else {
                        Object obj = jSONObject.get("traffic_source_list");
                        if (obj != null) {
                            str3 = obj.toString();
                        } else {
                            str3 = null;
                        }
                        jSONArray = new JSONArray(LIZJ(i, str3));
                    }
                } else {
                    jSONArray = new JSONArray(new int[]{i});
                }
                jSONObject.putOpt("traffic_source_list", jSONArray);
                if (parse == null || (uri2 = parse.toString()) == null || !ujb.s.LJJJLZIJ(uri2, "trackParams=", false)) {
                    z2 = false;
                }
                if (z2) {
                    if (parse == null || (uri = parse.toString()) == null) {
                        return null;
                    }
                    OJD ojd = new OJD("(trackParams=[^&]*)");
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("trackParams=");
                    LIZ2.append(URLEncoder.encode(jSONObject.toString(), "UTF-8"));
                    str = ojd.replace(uri, X1D.LIZIZ(LIZ2));
                    return str;
                }
                return str;
            }
            return str;
        } catch (Exception e) {
            C52966KqY.LIZ(e);
            return str;
        }
    }
}
