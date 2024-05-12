package X;

import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CFB implements InterfaceC15840jk {
    public final /* synthetic */ CFG LIZ;

    @Override // X.InterfaceC15840jk
    public final void LIZJ() {
    }

    @Override // X.InterfaceC15840jk
    public final void LIZ() {
        this.LIZ.getClass();
        CFG cfg = this.LIZ;
        CFH.LIZ(cfg.LJ, cfg.LIZLLL, true);
    }

    @Override // X.InterfaceC15840jk
    public final void LJIIIZ() {
        CFG cfg = this.LIZ;
        String str = cfg.LJ;
        String str2 = cfg.LIZLLL;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        C05630Jz.LIZ(1, "play_status", jSONObject);
        if (str == null) {
            str = "unkown";
        }
        C05630Jz.LJI(jSONObject, "channel", str);
        if (str2 == null) {
            str2 = "unkown";
        }
        C05630Jz.LJI(jSONObject, "videoname", str2);
        C05630Jz.LIZJ("extra", jSONObject4, jSONObject3);
        C0K2.LJI("ttlive_barrage_player_status_event", jSONObject, jSONObject2, jSONObject4);
    }

    @Override // X.InterfaceC15840jk
    public final void onStart() {
        this.LIZ.getClass();
    }

    @Override // X.InterfaceC15840jk
    public final void onStop() {
        this.LIZ.getClass();
    }

    public CFB(CFG cfg) {
        this.LIZ = cfg;
    }

    @Override // X.InterfaceC15840jk
    public final void LIZIZ(int i, String str, boolean z) {
        int i2;
        this.LIZ.getClass();
        if (z) {
            CFG cfg = this.LIZ;
            String str2 = cfg.LJ;
            String str3 = cfg.LIZLLL;
            Integer valueOf = Integer.valueOf(i);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            C05630Jz.LIZ(2, "play_status", jSONObject);
            if (str2 == null) {
                str2 = "unkown";
            }
            C05630Jz.LJI(jSONObject, "channel", str2);
            if (str3 == null) {
                str3 = "unkown";
            }
            C05630Jz.LJI(jSONObject, "videoname", str3);
            if (str == null) {
                str = "unkown";
            }
            C05630Jz.LJI(jSONObject3, "error_msg", str);
            if (valueOf != null) {
                i2 = valueOf.intValue();
            } else {
                i2 = -1;
            }
            C05630Jz.LIZ(i2, "error_code", jSONObject3);
            C05630Jz.LIZJ("extra", jSONObject4, jSONObject3);
            C0K2.LJI("ttlive_barrage_player_status_event", jSONObject, jSONObject2, jSONObject4);
            return;
        }
        CFG cfg2 = this.LIZ;
        CFH.LIZ(cfg2.LJ, cfg2.LIZLLL, false);
    }
}
