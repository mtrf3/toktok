package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class F03 implements InterfaceC38051EwZ {
    public final /* synthetic */ F09 LIZ;
    public final /* synthetic */ C60737Nsb LIZIZ;

    public F03(F09 f09, C60737Nsb c60737Nsb) {
        this.LIZ = f09;
        this.LIZIZ = c60737Nsb;
    }

    @Override // X.InterfaceC38051EwZ
    public final C77357UXp LIZ(int i, String str, JSONObject jSONObject) {
        C37948Euu LIZ;
        if (str == null) {
            return null;
        }
        F09 f09 = this.LIZ;
        C60737Nsb c60737Nsb = this.LIZIZ;
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            C37942Euo c37942Euo = (C37942Euo) c60737Nsb.LIZIZ(C37942Euo.class);
            if (c37942Euo != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                c37942Euo.LIZ(str, jSONObject);
            }
            if (!C19N.LJ("Fix_CrossPlatform_Event_Hook_Bug", false)) {
                return null;
            }
            return new C77357UXp();
        }
        o.LJII(f09, "null cannot be cast to non-null type com.ss.android.ugc.aweme.hybridkit.bridge.support.CrossPlatformJSBRegistry");
        if (((F04) f09).LJLJJI.get() || (LIZ = f09.LIZ(str)) == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        LIZ.LIZ(1, "success", jSONObject);
        if (C19N.LJ("crossplatform_jsb_callback_unregister", false)) {
            f09.LIZLLL(str);
        }
        return new C77357UXp();
    }
}
