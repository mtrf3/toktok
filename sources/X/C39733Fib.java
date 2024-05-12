package X;

import android.app.Application;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Fib, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39733Fib extends C39734Fic {
    public final /* synthetic */ Application LIZLLL;

    public C39733Fib(Application application) {
        this.LIZLLL = application;
    }

    @Override // X.C39734Fic
    public final void LIZ(String str) {
        C1JX.LJIIIIZZ("decompress end ", str);
    }

    @Override // X.C39734Fic
    public final void LIZIZ(String str) {
        C1JX.LJIIIIZZ("decompress start ", str);
        try {
            FFL.LJIIIZ().getClass();
            if (C16880lQ.LLIIJLIL(C16880lQ.LLLLJI(this.LIZLLL)).getUsableSpace() < FFL.LJIIJ(31744, 50, "enable_decode_try_force_clean", false) * 1024 * 1024) {
                C22690un.LIZIZ(C16880lQ.LLLLJI(this.LIZLLL), false);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // X.C39734Fic
    public final void LJ(int i, String str, java.util.Map map) {
        super.LJ(i, str, map);
        if (FCD.LJI(C16880lQ.LLLLJI(this.LIZLLL))) {
            try {
                JSONObject jSONObject = new JSONObject(map);
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("lib_decode_duration", jSONObject.get("lib_decode_duration"));
                    jSONObject.remove("lib_decode_duration");
                } catch (JSONException unused) {
                }
                try {
                    jSONObject2.put("lib_install_duration", jSONObject.get("lib_install_duration"));
                    jSONObject.remove("lib_install_duration");
                } catch (JSONException unused2) {
                }
                try {
                    jSONObject2.put("lib_init_duration", jSONObject.get("lib_init_duration"));
                    jSONObject.remove("lib_init_duration");
                } catch (JSONException unused3) {
                }
                try {
                    jSONObject2.put("lib_lock_duration", jSONObject.get("lib_lock_duration"));
                    jSONObject.remove("lib_lock_duration");
                } catch (JSONException unused4) {
                }
                try {
                    jSONObject2.put("key_status", jSONObject.get("key_status"));
                    jSONObject.remove("key_status");
                } catch (JSONException unused5) {
                }
                try {
                    jSONObject2.put("key_decode_status", jSONObject.get("key_decode_status"));
                    jSONObject.remove("key_decode_status");
                } catch (JSONException unused6) {
                }
                try {
                    jSONObject2.put("is_first_load", jSONObject.get("is_first_load"));
                    jSONObject.remove("is_first_load");
                } catch (JSONException unused7) {
                }
                try {
                    jSONObject2.put("lib_from_dlopen", jSONObject.get("lib_from_dlopen"));
                    jSONObject.remove("lib_from_dlopen");
                } catch (JSONException unused8) {
                }
                try {
                    jSONObject2.put("duration", jSONObject.get("duration"));
                    jSONObject.remove("duration");
                } catch (JSONException unused9) {
                }
                try {
                    jSONObject2.put("lib_name_from_dlopen", jSONObject.get("lib_name_from_dlopen"));
                    jSONObject.remove("lib_name_from_dlopen");
                } catch (JSONException unused10) {
                }
                C09900aA.LJ("zoin_so_load", jSONObject2);
            } catch (Throwable unused11) {
            }
        }
    }
}
