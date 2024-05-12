package X;

import android.util.SparseArray;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import defpackage.a1;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.0Fv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04550Fv {
    public static final ConcurrentHashMap<String, C0NN> LIZ = new ConcurrentHashMap<>();

    public static void LIZIZ(String channel, JSONObject jSONObject) {
        o.LJIIIZ(channel, "channel");
        ConcurrentHashMap<String, C0NN> concurrentHashMap = LIZ;
        if (concurrentHashMap.containsKey(channel)) {
            return;
        }
        C0NN c0nn = new C0NN();
        Iterator<String> keys = jSONObject.keys();
        o.LJIIIIZZ(keys, "definitionJson.keys()");
        while (keys.hasNext()) {
            String key = keys.next();
            HashMap<String, C0NL> hashMap = c0nn.LIZ;
            o.LJIIIIZZ(key, "key");
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, key);
            o.LJIIIIZZ(jSONObject2, "definitionJson.getJSONObject(key)");
            SparseArray sparseArray = new SparseArray(jSONObject2.length());
            C0NL c0nl = new C0NL(sparseArray);
            Iterator<String> keys2 = jSONObject2.keys();
            o.LJIIIIZZ(keys2, "jsonObject.keys()");
            while (keys2.hasNext()) {
                String it = keys2.next();
                o.LJIIIIZZ(it, "it");
                JSONObject jSONObject3 = JSONObjectProtectorUtils.getJSONObject(jSONObject2, it);
                o.LJIIIIZZ(jSONObject3, "jsonObject.getJSONObject(it)");
                C0NJ LIZ2 = C0NI.LIZ(it, jSONObject3);
                sparseArray.put(LIZ2.LIZIZ, LIZ2);
            }
            hashMap.put(key, c0nl);
        }
        concurrentHashMap.put(channel, c0nn);
    }

    public static final JSONObject LIZ(String channel, String dataMessageName, String str, byte[] body) {
        o.LJIIIZ(body, "body");
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(dataMessageName, "dataMessageName");
        C0NN c0nn = LIZ.get(channel);
        if (c0nn != null) {
            C0NN c0nn2 = c0nn;
            JSONObject jSONObject = new JSONObject();
            Q9H q9h = new Q9H();
            q9h.LJIIL(new Q9M(body));
            C0PK c0pk = new C0PK();
            long LIZJ = q9h.LIZJ();
            while (true) {
                int LJI = q9h.LJI();
                int i = -1;
                if (LJI != -1) {
                    if (LJI != 1) {
                        if (LJI != 2) {
                            Q9J.LIZJ(q9h);
                        } else {
                            c0pk.LIZIZ = q9h.LJII();
                        }
                    } else {
                        C0PJ c0pj = new C0PJ();
                        long LIZJ2 = q9h.LIZJ();
                        while (true) {
                            int LJI2 = q9h.LJI();
                            if (LJI2 != -1) {
                                switch (LJI2) {
                                    case 1:
                                        c0pj.LIZ = (int) q9h.LJIIJJI();
                                        break;
                                    case 2:
                                        c0pj.LIZIZ = Q9J.LIZIZ(q9h);
                                        break;
                                    case 3:
                                        c0pj.LIZJ = Q9J.LIZIZ(q9h);
                                        break;
                                    case 4:
                                        c0pj.LIZLLL = Q9J.LIZIZ(q9h);
                                        break;
                                    case 5:
                                        c0pj.LJ = q9h.LJIIJJI();
                                        break;
                                    case 6:
                                        c0pj.LJFF = Q9J.LIZIZ(q9h);
                                        break;
                                    default:
                                        Q9J.LIZJ(q9h);
                                        break;
                                }
                            } else {
                                q9h.LJ(LIZJ2);
                                if (c0pj.LIZ != -1) {
                                    if (c0pj.LJ != -1) {
                                        c0pk.LIZ = c0pj;
                                    } else {
                                        throw new IOException("Invalid protobuf data: missing header.now!");
                                    }
                                } else {
                                    throw new IOException("Invalid protobuf data: missing header.statusCode!");
                                }
                            }
                        }
                    }
                } else {
                    q9h.LJ(LIZJ);
                    C0PJ c0pj2 = c0pk.LIZ;
                    if (c0pj2 != null) {
                        jSONObject.put("status_code", c0pj2.LIZ);
                        if (c0pk.LIZ.LIZ == 0) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("now", c0pk.LIZ.LJ);
                            jSONObject.put("extra", jSONObject2);
                            byte[] bArr = c0pk.LIZIZ;
                            if (bArr != null) {
                                q9h.LJIIL(new Q9M(bArr));
                            }
                            byte[] bArr2 = c0pk.LIZIZ;
                            if (bArr2 != null) {
                                q9h.LJIIL(new Q9M(bArr2));
                                long LIZJ3 = q9h.LIZJ();
                                while (true) {
                                    int LJI3 = q9h.LJI();
                                    if (LJI3 == i) {
                                        q9h.LJ(LIZJ3);
                                    } else {
                                        if (LJI3 != 1) {
                                            if (LJI3 != 2 || str == null || !c0nn2.LIZ.containsKey(str)) {
                                                Q9J.LIZJ(q9h);
                                            } else {
                                                JSONObject LIZ2 = c0nn2.LIZ(q9h, str);
                                                Iterator<String> keys = LIZ2.keys();
                                                o.LJIIIIZZ(keys, "json.keys()");
                                                while (keys.hasNext()) {
                                                    String next = keys.next();
                                                    jSONObject2.put(next, LIZ2.get(next));
                                                }
                                            }
                                        } else {
                                            System.currentTimeMillis();
                                            jSONObject.put("data", c0nn2.LIZ(q9h, dataMessageName));
                                            System.currentTimeMillis();
                                        }
                                        i = -1;
                                    }
                                }
                            }
                        } else {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("message", c0pk.LIZ.LIZIZ);
                            jSONObject3.put("prompts", c0pk.LIZ.LIZJ);
                            jSONObject3.put("alert", c0pk.LIZ.LIZLLL);
                            jSONObject.put("data", jSONObject3);
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("now", c0pk.LIZ.LJ);
                            jSONObject.put("extra", jSONObject4);
                            String str2 = c0pk.LIZ.LJFF;
                            if (str != null && c0nn2.LIZ.containsKey(str) && str2 != null && str2.length() != 0) {
                                JSONObject jSONObject5 = new JSONObject(str2);
                                Iterator<String> keys2 = jSONObject5.keys();
                                o.LJIIIIZZ(keys2, "json.keys()");
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    jSONObject4.put(next2, jSONObject5.get(next2));
                                }
                            }
                        }
                        return jSONObject;
                    }
                    throw new IOException("Invalid protobuf data: response.header is null!");
                }
            }
        } else {
            String LJ = a1.LJ("channel [", channel, "] Message definition not found");
            LJ.toString();
            throw new IllegalArgumentException(LJ);
        }
    }
}
