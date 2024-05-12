package X;

import Y.ACallableS113S0100000_10;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.N0h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58655N0h {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final java.util.Map<String, Object> LJFF;
    public final java.util.Map<String, Object> LJI;
    public Aweme LJII;

    public final JSONObject LJ() {
        Object LIZ;
        Object LIZ2;
        JSONObject jSONObject;
        boolean z;
        JSONObject jSONObject2 = new JSONObject();
        Context LIZIZ = EF7.LIZIZ();
        jSONObject2.put("log_extra", this.LJ);
        jSONObject2.put("is_ad_event", "1");
        jSONObject2.put("nt", C16880lQ.LLJILLL(LIZIZ));
        for (Map.Entry entry : ((LinkedHashMap) this.LJFF).entrySet()) {
            jSONObject2.put((String) entry.getKey(), entry.getValue());
        }
        if (TextUtils.equals(this.LIZIZ, "click")) {
            jSONObject2.put("has_v3", "1");
        }
        if (!TextUtils.equals(this.LIZIZ, "click")) {
            this.LJI.put("system_start_timestamp", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        }
        if (jSONObject2.has("ad_extra_data")) {
            try {
                LIZ = jSONObject2.get("ad_extra_data");
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m13isSuccessimpl(LIZ)) {
                if (LIZ instanceof JSONObject) {
                    jSONObject = (JSONObject) LIZ;
                } else {
                    Object obj = null;
                    if (LIZ instanceof String) {
                        try {
                            LIZ2 = new JSONObject((String) LIZ);
                            C3C5.m7constructorimpl(LIZ2);
                        } catch (Throwable th2) {
                            LIZ2 = C141335gf.LIZ(th2);
                            C3C5.m7constructorimpl(LIZ2);
                        }
                        if (!C3C5.m12isFailureimpl(LIZ2)) {
                            obj = LIZ2;
                        }
                        jSONObject = (JSONObject) obj;
                    } else {
                        jSONObject = null;
                    }
                }
                if (jSONObject != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String extKey = keys.next();
                        java.util.Map<String, Object> map = this.LJI;
                        o.LJIIIIZZ(extKey, "extKey");
                        Object obj2 = jSONObject.get(extKey);
                        o.LJIIIIZZ(obj2, "it[extKey]");
                        map.put(extKey, obj2);
                    }
                }
            }
        }
        java.util.Map<String, Object> map2 = this.LJI;
        if (map2 == null || map2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            jSONObject2.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), this.LJI));
        }
        return jSONObject2;
    }

    public final boolean LJFF() {
        if (TextUtils.isEmpty(this.LIZ) || TextUtils.isEmpty(this.LIZIZ) || TextUtils.isEmpty(this.LIZJ)) {
            return false;
        }
        return true;
    }

    public final void LJI() {
        ExecutorService executorService;
        if (!LJFF()) {
            return;
        }
        ACallableS113S0100000_10 aCallableS113S0100000_10 = new ACallableS113S0100000_10(this, 10);
        IAppLogDepend LIZ = C59835Ne3.LIZ();
        if (LIZ != null) {
            executorService = LIZ.getLogThreadPool();
        } else {
            executorService = null;
        }
        C10K.LIZIZ(aCallableS113S0100000_10, executorService, null);
    }

    public final void LJII() {
        ExecutorService executorService;
        if (!LJFF()) {
            return;
        }
        ACallableS113S0100000_10 aCallableS113S0100000_10 = new ACallableS113S0100000_10(this, 11);
        IAppLogDepend LIZ = C59835Ne3.LIZ();
        if (LIZ != null) {
            executorService = LIZ.getLogThreadPool();
        } else {
            executorService = null;
        }
        C10K.LIZIZ(aCallableS113S0100000_10, executorService, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(java.util.Map map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                this.LJI.put(entry.getKey(), value);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(java.util.Map map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                this.LJFF.put(entry.getKey(), value);
            }
        }
    }

    public final void LIZIZ(Object obj, String str) {
        if (str != null && str.length() != 0 && obj != null) {
            if ((obj instanceof String) && ((CharSequence) obj).length() == 0) {
                return;
            }
            this.LJI.put(str, obj);
        }
    }

    public final void LIZJ(Object obj, String str) {
        if (str != null && str.length() != 0 && obj != null) {
            if ((obj instanceof String) && ((CharSequence) obj).length() == 0) {
                return;
            }
            this.LJFF.put(str, obj);
        }
    }

    public C58655N0h(String str, String str2, String str3, String str4, String str5) {
        HH1.LIZ(str, "tag", str2, "label", str3, "creativeId");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = new LinkedHashMap();
        this.LJI = new LinkedHashMap();
    }
}
