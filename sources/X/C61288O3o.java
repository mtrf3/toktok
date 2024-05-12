package X;

import android.os.AsyncTask;
import com.bytedance.forest.model.Request;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.O3o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61288O3o {
    public static final List<AbstractC61294O3u> LIZ = new ArrayList();

    public static void LIZJ(C61295O3v response) {
        o.LJIIJ(response, "response");
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new RunnableC61285O3l(response));
    }

    public static JSONObject LIZLLL(java.util.Map map) {
        String LJJZZIII;
        long longValue;
        JSONObject jSONObject = new JSONObject();
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                boolean z = false;
                String str2 = "_finish";
                if (ujb.o.LJJJJ(str, "_start", false)) {
                    LJJZZIII = s.LJJZZIII("_start", str);
                    z = true;
                } else {
                    LJJZZIII = s.LJJZZIII("_finish", str);
                }
                if (jSONObject.opt(LJJZZIII) == null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(LJJZZIII);
                    if (!z) {
                        str2 = "_start";
                    }
                    LIZ2.append(str2);
                    String LIZIZ = X1D.LIZIZ(LIZ2);
                    if (linkedHashMap.containsKey(LIZIZ)) {
                        if (z) {
                            Object obj = linkedHashMap.get(LIZIZ);
                            if (obj != null) {
                                longValue = ((Number) obj).longValue() - ((Number) entry.getValue()).longValue();
                            } else {
                                o.LJIIZILJ();
                                throw null;
                            }
                        } else {
                            long longValue2 = ((Number) entry.getValue()).longValue();
                            Object obj2 = linkedHashMap.get(LIZIZ);
                            if (obj2 != null) {
                                longValue = longValue2 - ((Number) obj2).longValue();
                            } else {
                                o.LJIIZILJ();
                                throw null;
                            }
                        }
                        jSONObject.put(LJJZZIII, longValue);
                    } else {
                        continue;
                    }
                }
            }
        } catch (Exception e) {
            C39930Flm.LIZIZ("ResourceReporter", "assemble duration error", e);
        }
        return jSONObject;
    }

    public static void LIZIZ(String url, String str, JSONObject jSONObject) {
        o.LJIIJ(url, "url");
        C61325O4z.LJ(new C61290O3q(url, str, jSONObject));
    }

    public static void LIZ(String str, JSONObject jSONObject, C61295O3v c61295O3v, JSONObject jSONObject2, java.util.Map map, int i) {
        JSONObject jSONObject3;
        Object LIZ2;
        Object LIZ3;
        Request request = c61295O3v.LJZI;
        java.util.Map<String, Long> map2 = c61295O3v.LJZ;
        O5C o5c = C61318O4s.LIZ;
        if (o5c.LIZIZ.get()) {
            jSONObject3 = LIZLLL(map2);
            o5c.LIZ(str, jSONObject, jSONObject3, jSONObject2);
        } else {
            jSONObject3 = null;
        }
        if (request.isPreload()) {
            if (jSONObject3 == null) {
                jSONObject3 = LIZLLL(c61295O3v.LJZ);
            }
            Request request2 = c61295O3v.LJZI;
            Iterator it = ((ArrayList) LIZ).iterator();
            while (it.hasNext()) {
                AbstractC61294O3u abstractC61294O3u = (AbstractC61294O3u) it.next();
                try {
                    String url = request2.getUrl();
                    String groupId = request2.getGroupId();
                    abstractC61294O3u.getClass();
                    o.LJIIJ(url, "url");
                    abstractC61294O3u.LIZ(str, url, groupId, jSONObject, jSONObject3, jSONObject2, i);
                    LIZ3 = C76800UCe.LIZ;
                    C3C5.m7constructorimpl(LIZ3);
                } catch (Throwable th) {
                    LIZ3 = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ3);
                }
                Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ3);
                if (m10exceptionOrNullimpl != null) {
                    C39930Flm.LIZIZ("ResourceReporter", "custom report error", m10exceptionOrNullimpl);
                }
            }
            return;
        }
        java.util.Map<String, ? extends Object> customParams = request.getCustomParams();
        Iterator it2 = ((ArrayList) LIZ).iterator();
        while (it2.hasNext()) {
            try {
                ((AbstractC61294O3u) it2.next()).LIZIZ(str, map, customParams, c61295O3v);
                LIZ2 = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ2);
            } catch (Throwable th2) {
                LIZ2 = C141335gf.LIZ(th2);
                C3C5.m7constructorimpl(LIZ2);
            }
            Throwable m10exceptionOrNullimpl2 = C3C5.m10exceptionOrNullimpl(LIZ2);
            if (m10exceptionOrNullimpl2 != null) {
                C39930Flm.LIZIZ("ResourceReporter", "custom report error", m10exceptionOrNullimpl2);
            }
        }
    }
}
