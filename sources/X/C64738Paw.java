package X;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Paw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64738Paw {
    public EnumC38093ExF LIZ;
    public int LIZIZ;
    public String LIZJ;
    public JSONObject LIZLLL;
    public String LJ;
    public boolean LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public long LJIIZILJ;
    public long LJIJ;
    public long LJIJI;
    public long LJIJJ;
    public long LJIJJLI;
    public long LJIL;
    public long LJJ;
    public boolean LJJI;
    public final java.util.Map<String, Long> LJJIFFI;
    public final java.util.Map<String, Long> LJJII;
    public long LJJIII;
    public long LJJIIJ;
    public long LJJIIJZLJL;
    public long LJJIIZ;
    public long LJJIIZI;
    public long LJJIJ;
    public long LJJIJIIJI;
    public long LJJIJIIJIL;
    public long LJJIJIL;
    public long LJJIJL;
    public long LJJIJLIJ;
    public long LJJIL;
    public long LJJIZ;
    public long LJJJ;
    public final java.util.Map<String, Long> LJJJI;
    public String LJJJIL;
    public JSONArray LJJJJ;
    public long LJJJJI;
    public boolean LJJJJIZL;
    public long LJJJJJ;
    public long LJJJJJL;
    public long LJJJJL;
    public int LJJJJLI;
    public int LJJJJLL;
    public String LJJJJZ;
    public String LJJJJZI;
    public JSONObject LJJJLIIL;
    public final java.util.Map<String, Object> LJJJLL;
    public final List<C37825Esv> LJJJLZIJ;
    public final List<C37825Esv> LJJJZ;

    public final JSONObject LIZ() {
        boolean LJI;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fallback", this.LIZIZ);
            if (!TextUtils.isEmpty(this.LIZJ)) {
                jSONObject.put("fallbackMessage", this.LIZJ);
            }
            jSONObject.put("createRetrofitTime", this.LJI);
            jSONObject.put("appRequestStartTime", this.LJII);
            jSONObject.put("beforeAllInterceptTime", this.LJIIIIZZ);
            jSONObject.put("callServerInterceptTime", this.LJIIIZ);
            jSONObject.put("callExecuteStartTime", this.LJIIJ);
            jSONObject.put("reportTime", this.LJIIJJI);
            jSONObject.put("delayWait", this.LJIILLIIL);
            EnumC38093ExF enumC38093ExF = this.LIZ;
            if (enumC38093ExF != EnumC38093ExF.ENCRYPT_NONE) {
                jSONObject.put("encrypt", enumC38093ExF.getValue());
            }
            if (!TextUtils.isEmpty(this.LJ)) {
                jSONObject.put("transactionId", this.LJ);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        boolean LJI2 = LJI(jSONObject, "loadServiceMethod", this.LJIIL, this.LJIILIIL, true);
        long j = this.LJIILJJIL;
        if (j > 0) {
            LJI = LJI(jSONObject, "enqueueWait", j, this.LJIIZILJ, LJI2);
        } else {
            LJI = LJI(jSONObject, "executeWait", this.LJIILL, this.LJIIZILJ, LJI2);
        }
        LJI(jSONObject, "responseParse", this.LJIL, this.LJJ, LJI(jSONObject, "requestParse", this.LJIJ, this.LJIJI, LJI(jSONObject, "executeCall", this.LJIJJ, this.LJIJJLI, LJI)));
        return jSONObject;
    }

    public final JSONObject LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("filterUrl", this.LJJIII);
            jSONObject.put("addCommonParam", this.LJJIIJ);
            jSONObject.put("requestVerify", this.LJJIIJZLJL);
            jSONObject.put("encryptRequest", this.LJJIIZI);
            jSONObject.put("genReqTicket", this.LJJIJ);
            jSONObject.put("checkReqTicket", this.LJJIJIIJI);
            jSONObject.put("preCdnVerify", this.LJJIJIIJIL);
            jSONObject.put("postCdnVerify", this.LJJIJLIJ);
            jSONObject.put("addClientKey", this.LJJIJIL);
            jSONObject.put("updateClientKey", this.LJJIJL);
            jSONObject.put("commandListener", this.LJJIL);
            jSONObject.put("filterDupQuery", this.LJJIIZ);
            jSONObject.put("queryFilter", this.LJJIZ);
            long j = this.LJJJ;
            if (j >= 0) {
                jSONObject.put("bodyEncrypt", j);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    public final JSONObject LIZJ() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!((ConcurrentHashMap) this.LJJIFFI).isEmpty()) {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry entry : ((ConcurrentHashMap) this.LJJIFFI).entrySet()) {
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                }
                jSONObject.put("request", jSONObject2);
            }
            if (!((ConcurrentHashMap) this.LJJII).isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry entry2 : ((ConcurrentHashMap) this.LJJII).entrySet()) {
                    jSONObject3.put((String) entry2.getKey(), entry2.getValue());
                }
                jSONObject.put("response", jSONObject3);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    public final String LIZLLL() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.LIZIZ != -1) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("model", Build.MODEL);
                    String str = "";
                    String[] strArr = Build.SUPPORTED_ABIS;
                    if (strArr != null && strArr.length > 0) {
                        str = Arrays.asList(strArr).toString();
                    }
                    jSONObject2.put("abis", str);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                jSONObject.put("model", jSONObject2);
            }
            JSONObject jSONObject3 = this.LIZLLL;
            if (jSONObject3 != null) {
                jSONObject.put("concurrentRequest", jSONObject3);
            }
            jSONObject.put("concurrent", this.LJFF);
            jSONObject.put("base", LIZ());
            jSONObject.put("callback", LIZIZ());
            jSONObject.put("interceptor", LIZJ());
            jSONObject.put("ttnetVersion", this.LJJJIL);
            JSONArray jSONArray = this.LJJJJ;
            if (jSONArray != null) {
                jSONObject.put("actionInfo", jSONArray);
            }
            JSONObject jSONObject4 = this.LJJJLIIL;
            if (jSONObject4 != null) {
                jSONObject.put("compress", jSONObject4);
            }
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        return jSONObject.toString();
    }

    public final void LJ() {
        if (this.LJJJLZIJ.size() <= 0) {
            return;
        }
        List<C37825Esv> list = this.LJJJLZIJ;
        ((C37825Esv) C64504PTg.LIZIZ(list, -1, list)).LIZJ = SystemClock.uptimeMillis();
    }

    public C64738Paw() {
        this.LIZ = EnumC38093ExF.ENCRYPT_NONE;
        this.LIZIZ = -1;
        this.LIZJ = "";
        this.LJJIFFI = new ConcurrentHashMap();
        this.LJJII = new ConcurrentHashMap();
        this.LJJIII = -1L;
        this.LJJIIJ = -1L;
        this.LJJIIJZLJL = -1L;
        this.LJJIIZ = -1L;
        this.LJJIIZI = -1L;
        this.LJJIJ = -1L;
        this.LJJIJIIJI = -1L;
        this.LJJIJIIJIL = -1L;
        this.LJJIJIL = -1L;
        this.LJJIJL = -1L;
        this.LJJIJLIJ = -1L;
        this.LJJIL = -1L;
        this.LJJIZ = -1L;
        this.LJJJ = -1L;
        this.LJJJI = new HashMap();
        this.LJJJIL = "";
        this.LJJJJIZL = true;
        this.LJJJJLI = -1;
        this.LJJJJLL = -1;
        this.LJJJJZ = "";
        this.LJJJJZI = "";
        this.LJJJLL = new HashMap();
        this.LJJJLZIJ = new ArrayList();
        this.LJJJZ = new ArrayList();
    }

    public C64738Paw(boolean z) {
        this.LIZ = EnumC38093ExF.ENCRYPT_NONE;
        this.LIZIZ = -1;
        this.LIZJ = "";
        this.LJJIFFI = new ConcurrentHashMap();
        this.LJJII = new ConcurrentHashMap();
        this.LJJIII = -1L;
        this.LJJIIJ = -1L;
        this.LJJIIJZLJL = -1L;
        this.LJJIIZ = -1L;
        this.LJJIIZI = -1L;
        this.LJJIJ = -1L;
        this.LJJIJIIJI = -1L;
        this.LJJIJIIJIL = -1L;
        this.LJJIJIL = -1L;
        this.LJJIJL = -1L;
        this.LJJIJLIJ = -1L;
        this.LJJIL = -1L;
        this.LJJIZ = -1L;
        this.LJJJ = -1L;
        this.LJJJI = new HashMap();
        this.LJJJIL = "";
        this.LJJJJIZL = true;
        this.LJJJJLI = -1;
        this.LJJJJLL = -1;
        this.LJJJJZ = "";
        this.LJJJJZI = "";
        this.LJJJLL = new HashMap();
        this.LJJJLZIJ = new ArrayList();
        this.LJJJZ = new ArrayList();
        this.LJI = System.currentTimeMillis();
        long uptimeMillis = SystemClock.uptimeMillis();
        this.LJJJJI = uptimeMillis;
        if (z) {
            this.LJIIL = uptimeMillis;
            this.LJIILIIL = uptimeMillis;
        }
    }

    public final void LJFF(InterfaceC37216Ej6 interfaceC37216Ej6) {
        String name = interfaceC37216Ej6.getClass().getName();
        if (!TextUtils.isEmpty(name)) {
            String substring = name.substring(name.lastIndexOf(46) + 1);
            ((ArrayList) this.LJJJZ).add(new C37825Esv(substring, SystemClock.uptimeMillis()));
        }
    }

    public static boolean LJI(JSONObject jSONObject, String str, long j, long j2, boolean z) {
        try {
            if (z && j <= j2) {
                jSONObject.put(str, j2 - j);
                return true;
            }
            jSONObject.put(str, -1);
            return false;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }
}
