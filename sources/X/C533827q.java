package X;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.27q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C533827q extends AbstractC44281oW {
    @Override // X.AbstractC44281oW
    public final String LJIIIIZZ() {
        return "pipo.fetch";
    }

    public static void LJIIIZ(InterfaceC31943CgF interfaceC31943CgF, String str, java.util.Map map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry entry : ((HashMap) map).entrySet()) {
                    try {
                        jSONObject2.put((String) entry.getKey(), (String) entry.getValue());
                    } catch (Throwable unused) {
                    }
                }
                try {
                    jSONObject.put("header", jSONObject2);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
            }
        }
        jSONObject.put("response", str);
        C04490Fp.LIZJ("pipo.fetch", jSONObject, interfaceC31943CgF);
    }

    @Override // X.AbstractC44281oW, X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns interfaceC78280Uns, final InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH enumC37847EtH) {
        final java.util.Map<String, Object> map;
        final java.util.Map<String, Object> map2;
        final String str;
        java.util.Map<String, Object> map3;
        super.LIZJ(interfaceC78280Uns, interfaceC31943CgF, enumC37847EtH);
        try {
            final String string = interfaceC78280Uns.getString("method");
            final String string2 = interfaceC78280Uns.getString("url");
            final java.util.Map<String, Object> map4 = null;
            if (interfaceC78280Uns.hasKey("headers")) {
                map = interfaceC78280Uns.getMap("headers").LIZIZ();
            } else {
                map = null;
            }
            if (interfaceC78280Uns.hasKey("params")) {
                map2 = interfaceC78280Uns.getMap("params").LIZIZ();
            } else {
                map2 = null;
            }
            InterfaceC78505UrV interfaceC78505UrV = interfaceC78280Uns.get("body");
            if (interfaceC78505UrV.getType() == EnumC78522Urm.Map) {
                InterfaceC78280Uns asMap = interfaceC78505UrV.asMap();
                if (asMap != null) {
                    map3 = asMap.LIZIZ();
                } else {
                    map3 = null;
                }
                str = null;
                map4 = map3;
            } else if (interfaceC78505UrV.getType() == EnumC78522Urm.String) {
                str = interfaceC78505UrV.asString();
            } else {
                str = null;
            }
            if (TextUtils.equals(string, "GET") || TextUtils.equals(string, "POST")) {
                if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
                    RunnableC39007FSp.LIZIZ(new Runnable() { // from class: X.120
                        public final void LIZ() {
                            if (TextUtils.equals(string, "GET")) {
                                C533827q c533827q = C533827q.this;
                                String str2 = string2;
                                java.util.Map map5 = map;
                                java.util.Map map6 = map2;
                                InterfaceC31943CgF interfaceC31943CgF2 = interfaceC31943CgF;
                                c533827q.getClass();
                                C533827q.LJIIJ(str2, map5, map6, interfaceC31943CgF2);
                                return;
                            }
                            if (!TextUtils.equals(string, "POST")) {
                                return;
                            }
                            java.util.Map map7 = map4;
                            if (map7 != null) {
                                C533827q c533827q2 = C533827q.this;
                                String str3 = string2;
                                java.util.Map map8 = map;
                                InterfaceC31943CgF interfaceC31943CgF3 = interfaceC31943CgF;
                                c533827q2.getClass();
                                C533827q.LJIIL(str3, map8, map7, interfaceC31943CgF3);
                                return;
                            }
                            C533827q c533827q3 = C533827q.this;
                            String str4 = string2;
                            java.util.Map map9 = map;
                            String str5 = str;
                            InterfaceC31943CgF interfaceC31943CgF4 = interfaceC31943CgF;
                            c533827q3.getClass();
                            C533827q.LJIIJJI(str4, map9, str5, interfaceC31943CgF4);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean LIZ;
                            try {
                                LIZ();
                            } finally {
                                if (LIZ) {
                                }
                            }
                        }
                    });
                    return;
                }
                if (TextUtils.equals(string, "GET")) {
                    LJIIJ(string2, map, map2, interfaceC31943CgF);
                    return;
                }
                if (TextUtils.equals(string, "POST")) {
                    LJIIL(string2, map, map4, interfaceC31943CgF);
                    if (map4 != null) {
                        LJIIL(string2, map, map4, interfaceC31943CgF);
                        return;
                    } else {
                        LJIIJJI(string2, map, str, interfaceC31943CgF);
                        return;
                    }
                }
                return;
            }
            C04490Fp.LIZLLL("pipo.fetch", "invalid request_method!", interfaceC31943CgF);
        } catch (Throwable th) {
            C04490Fp.LIZLLL("pipo.fetch", th.getMessage(), interfaceC31943CgF);
        }
    }

    public static void LJIIJ(String str, java.util.Map map, java.util.Map map2, InterfaceC31943CgF interfaceC31943CgF) {
        try {
            QKY qky = new QKY();
            qky.LIZ = true;
            ArrayList arrayList = new ArrayList();
            if (map2 != null) {
                for (String str2 : map2.keySet()) {
                    Object obj = map2.get(str2);
                    if (obj != null) {
                        arrayList.add(new Pair(str2, obj.toString()));
                    }
                }
            }
            if (arrayList.size() > 0) {
                StringBuilder sb = new StringBuilder(str);
                if (str.indexOf(63) < 0) {
                    sb.append("?");
                } else {
                    sb.append("&");
                }
                sb.append(C48189Ivh.LIZJ(arrayList));
                str = sb.toString();
            }
            HashMap hashMap = new HashMap();
            if (map != null) {
                for (String str3 : map.keySet()) {
                    hashMap.put(str3, map.get(str3).toString());
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("start get request:");
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
            LJIIIZ(interfaceC31943CgF, C276216o.LJIIL.LIZ.LJIIJJI.LIZIZ(str, hashMap, qky), qky.LIZIZ);
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("get error:");
            LIZ2.append(th.getMessage());
            X1D.LIZIZ(LIZ2);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("get failed:");
            LIZ3.append(th.getMessage());
            C04490Fp.LIZLLL("pipo.fetch", X1D.LIZIZ(LIZ3), interfaceC31943CgF);
        }
    }

    public static void LJIIJJI(String str, java.util.Map map, String str2, InterfaceC31943CgF interfaceC31943CgF) {
        byte[] bytes;
        try {
            QKY qky = new QKY();
            qky.LIZ = true;
            HashMap hashMap = new HashMap();
            if (map != null) {
                for (String str3 : map.keySet()) {
                    hashMap.put(str3, map.get(str3).toString());
                }
            }
            if (str2 == null) {
                bytes = null;
            } else {
                bytes = str2.getBytes();
            }
            LJIIIZ(interfaceC31943CgF, C276216o.LJIIL.LIZ.LJIIJJI.LJ(str, bytes, hashMap, qky), qky.LIZIZ);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("post error:");
            LIZ.append(th.getMessage());
            X1D.LIZIZ(LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("post failed:");
            LIZ2.append(th.getMessage());
            C04490Fp.LIZLLL("pipo.fetch", X1D.LIZIZ(LIZ2), interfaceC31943CgF);
        }
    }

    public static void LJIIL(String str, java.util.Map map, java.util.Map map2, InterfaceC31943CgF interfaceC31943CgF) {
        try {
            QKY qky = new QKY();
            qky.LIZ = true;
            ArrayList arrayList = new ArrayList();
            if (map2 != null) {
                for (String str2 : map2.keySet()) {
                    arrayList.add(new Pair(str2, map2.get(str2).toString()));
                }
            }
            HashMap hashMap = new HashMap();
            if (map != null) {
                for (String str3 : map.keySet()) {
                    hashMap.put(str3, map.get(str3).toString());
                }
            }
            LJIIIZ(interfaceC31943CgF, C276216o.LJIIL.LIZ.LJIIJJI.LIZLLL(str, arrayList, hashMap, qky), qky.LIZIZ);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("post error:");
            LIZ.append(th.getMessage());
            X1D.LIZIZ(LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("post failed:");
            LIZ2.append(th.getMessage());
            C04490Fp.LIZLLL("pipo.fetch", X1D.LIZIZ(LIZ2), interfaceC31943CgF);
        }
    }
}
