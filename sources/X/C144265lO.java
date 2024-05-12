package X;

import java.util.List;
import org.json.JSONObject;

/* renamed from: X.5lO */
/* loaded from: classes3.dex */
public final class C144265lO {
    public final int LIZ;
    public long LIZIZ = -1;
    public long LIZJ = -1;
    public long LIZLLL = -1;
    public List<String> LJ;
    public long LJFF;
    public long LJI;

    public C144265lO(int i) {
        this.LIZ = i;
    }

    public final void LIZJ(int i, String str) {
        this.LJI = System.currentTimeMillis() - this.LJI;
        LIZIZ(this, 1, 2, Integer.valueOf(i), str, 16);
    }

    public final void LIZ(int i, int i2, Integer num, String str, boolean z) {
        InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("compositing_type", this.LIZ);
        jSONObject.put("audit_duration", this.LJFF);
        jSONObject.put("compositing_duration", this.LJI);
        jSONObject.put("duration", System.currentTimeMillis() - this.LIZIZ);
        jSONObject.put("failed_step", i2);
        jSONObject.put("is_audit_pass", z);
        if (num != null) {
            jSONObject.put("failed_code", num.intValue());
            jSONObject.put("failed_msg", str);
        }
        LJJIIZI.LJIIL(i, "tt_video2sticker_click_next_monitor", jSONObject);
    }

    public static /* synthetic */ void LIZIZ(C144265lO c144265lO, int i, int i2, Integer num, String str, int i3) {
        Integer num2 = num;
        String str2 = null;
        if ((i3 & 4) != 0) {
            num2 = null;
        }
        if ((i3 & 8) == 0) {
            str2 = str;
        }
        c144265lO.LIZ(i, i2, num2, str2, false);
    }
}
