package X;

import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.OtD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63323OtD {
    public String LIZ;
    public JSONObject LIZIZ;

    public final void LIZLLL() {
        if (C63308Osy.LJI().LIZLLL().LJJJJZI) {
            String event = this.LIZ;
            JSONObject data = this.LIZIZ;
            o.LJIIIZ(event, "event");
            o.LJIIIZ(data, "data");
            C63310Ot0.LIZJ(data, event, false);
            return;
        }
        String str = this.LIZ;
        JSONObject jSONObject = this.LIZIZ;
        InterfaceC63336OtQ interfaceC63336OtQ = C63337OtR.LIZ;
        if (interfaceC63336OtQ == null) {
            return;
        }
        interfaceC63336OtQ.LIZIZ(str, jSONObject);
    }

    public final void LJ() {
        if (C63308Osy.LJI().LIZLLL().LJJJJZI) {
            String event = this.LIZ;
            JSONObject data = this.LIZIZ;
            o.LJIIIZ(event, "event");
            o.LJIIIZ(data, "data");
            C63310Ot0.LIZJ(data, event, false);
            return;
        }
        String str = this.LIZ;
        JSONObject jSONObject = this.LIZIZ;
        InterfaceC63336OtQ interfaceC63336OtQ = C63337OtR.LIZ;
        if (interfaceC63336OtQ == null) {
            return;
        }
        interfaceC63336OtQ.LJI(jSONObject, str);
    }

    public final void LJFF() {
        if (C63308Osy.LJI().LIZLLL().LJJJJZI) {
            C63310Ot0.LIZJ(this.LIZIZ, this.LIZ, true);
            return;
        }
        String str = this.LIZ;
        JSONObject jSONObject = this.LIZIZ;
        InterfaceC63336OtQ interfaceC63336OtQ = C63337OtR.LIZ;
        if (interfaceC63336OtQ == null) {
            return;
        }
        interfaceC63336OtQ.LJFF(jSONObject, str);
    }

    public final void LIZIZ(java.util.Map map) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new JSONObject();
        }
        try {
            for (Map.Entry entry : map.entrySet()) {
                this.LIZIZ.put((String) entry.getKey(), entry.getValue());
            }
        } catch (Exception unused) {
        }
    }

    public final void LIZJ(String str) {
        this.LIZ = str;
        LIZ("imsdk", "params_for_special");
        LIZ("local", "sdk_version");
        LIZ("Android", "sdk_type");
        LIZ(Integer.valueOf(C63308Osy.LJI().LIZIZ().LJIJI()), "im_appid");
    }

    public final void LIZ(Object obj, String str) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new JSONObject();
        }
        try {
            this.LIZIZ.put(str, obj);
        } catch (Exception unused) {
        }
    }
}
