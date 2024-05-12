package X;

import android.content.Context;
import android.text.TextUtils;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes12.dex */
public abstract class PP1 implements InterfaceC64760PbI<C64672PZs> {
    public abstract void LIZJ(long j, long j2, String str, String str2, String str3, C64672PZs c64672PZs, Throwable th, JSONObject jSONObject);

    public abstract void LIZLLL(long j, long j2, String str, String str2, String str3, C64672PZs c64672PZs, JSONObject jSONObject);

    public abstract void LJ(C64672PZs c64672PZs, JSONObject jSONObject);

    public PP1(Context context) {
        C64668PZo.LJJIJIL = new PP3();
    }

    public final void LJFF(C64672PZs c64672PZs) {
        if (C64390POw.LIZIZ.LJIIIIZZ()) {
            C76800UCe c76800UCe = null;
            if (c64672PZs == null || c64672PZs.LJJIFFI == null) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(c64672PZs.LJJIFFI);
                PP2 pp2 = PP2.LIZIZ;
                String it = jSONObject.optString(pp2.LIZLLL());
                o.LJIIIIZZ(it, "it");
                if (it.length() > 0) {
                    JSONObject jSONObject2 = new JSONObject();
                    LJ(c64672PZs, jSONObject2);
                    pp2.LJ(it, jSONObject2);
                    c76800UCe = C76800UCe.LIZ;
                }
                C3C5.m7constructorimpl(c76800UCe);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
    }

    @Override // X.InterfaceC64760PbI
    public final void LIZ(long j, long j2, String str, String str2, C64672PZs c64672PZs) {
        long j3;
        C64672PZs c64672PZs2 = c64672PZs;
        if (!new C03880Dg(2).LIZJ(400201, "com/ss/android/ugc/aweme/net/cronet/AbsCronetMonitorProcessHook", "monitorApiOk", this, new Object[]{Long.valueOf(j), Long.valueOf(j2), str, str2, c64672PZs2}, "void", new C65300Pk0("(JJLjava/lang/String;Ljava/lang/String;Lcom/bytedance/ttnet/http/HttpRequestInfo;)V")).LIZ) {
            try {
                String[] strArr = new String[1];
                JSONObject jSONObject = new JSONObject();
                if (((Boolean) C35035Dp1.LIZ.getValue()).booleanValue() && !C64094PDm.LIZ.LJIILLIIL("api_all", str, jSONObject)) {
                    if (EB7.LIZ()) {
                        long j4 = 0;
                        if (c64672PZs2 == null) {
                            j3 = 0;
                        } else {
                            j3 = c64672PZs2.LJIIZILJ;
                            j4 = c64672PZs2.LJIJ;
                        }
                        PP4.LIZIZ.LIZIZ(j3 + j4, str);
                        return;
                    }
                    return;
                }
                if (str != null && s.LJJJLZIJ(str, "&config_retry=b", false)) {
                    jSONObject.put("log_config_retry", 1);
                }
                if (TextUtils.isEmpty(strArr[0]) && c64672PZs2 != null) {
                    strArr[0] = c64672PZs2.LIZ;
                    T t = c64672PZs2.LIZIZ;
                    if (t != 0) {
                    }
                }
                LJ(c64672PZs2, jSONObject);
                LIZLLL(j, j2, str, str2, strArr[0], c64672PZs2, jSONObject);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // X.InterfaceC64760PbI
    public final void LIZIZ(long j, long j2, String str, String str2, C64672PZs c64672PZs, Throwable th) {
        long j3;
        C64672PZs c64672PZs2 = c64672PZs;
        if (!new C03880Dg(2).LIZJ(400202, "com/ss/android/ugc/aweme/net/cronet/AbsCronetMonitorProcessHook", "monitorApiError", this, new Object[]{Long.valueOf(j), Long.valueOf(j2), str, str2, c64672PZs2, th}, "void", new C65300Pk0("(JJLjava/lang/String;Ljava/lang/String;Lcom/bytedance/ttnet/http/HttpRequestInfo;Ljava/lang/Throwable;)V")).LIZ) {
            try {
                String[] strArr = new String[1];
                JSONObject jSONObject = new JSONObject();
                if (TextUtils.isEmpty(strArr[0]) && c64672PZs2 != null) {
                    strArr[0] = c64672PZs2.LIZ;
                    T t = c64672PZs2.LIZIZ;
                    if (t != 0) {
                    }
                }
                PN0.LIZ(th, jSONObject);
                if (((Boolean) C35035Dp1.LIZ.getValue()).booleanValue() && !C64094PDm.LIZ.LJIILLIIL("api_error", str, jSONObject)) {
                    if (EB7.LIZ()) {
                        long j4 = 0;
                        if (c64672PZs2 == null) {
                            j3 = 0;
                        } else {
                            j3 = c64672PZs2.LJIIZILJ;
                            j4 = c64672PZs2.LJIJ;
                        }
                        PP4.LIZIZ.LIZIZ(j3 + j4, str);
                    }
                    LJFF(c64672PZs2);
                    return;
                }
                LJFF(c64672PZs2);
                LJ(c64672PZs2, jSONObject);
                LIZJ(j, j2, str, str2, strArr[0], c64672PZs2, th, jSONObject);
            } catch (Throwable unused) {
            }
        }
    }
}
