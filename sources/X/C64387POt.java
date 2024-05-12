package X;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.POt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64387POt implements InterfaceC18060nK {
    public static JSONObject LJ(java.util.Map map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @Override // X.InterfaceC18060nK
    public final void LIZ(C32781Qk c32781Qk) {
        try {
            C64386POs c64386POs = C64386POs.LIZIZ;
            c64386POs.LIZ.LJI(new NDG(c32781Qk.LIZIZ().LIZ, c32781Qk.LIZIZ().LIZIZ), LJ(c32781Qk.LIZIZ().LJFF));
        } catch (Throwable unused) {
        }
    }

    @Override // X.InterfaceC18060nK
    public final void LIZIZ(C32781Qk c32781Qk) {
        try {
            C64386POs c64386POs = C64386POs.LIZIZ;
            c64386POs.LIZ.LJ(new NDG(c32781Qk.LIZIZ().LIZ, c32781Qk.LIZIZ().LIZIZ), LJ(c32781Qk.LIZIZ().LJFF));
        } catch (Throwable unused) {
        }
    }

    @Override // X.InterfaceC18060nK
    public final void LIZJ(C32781Qk c32781Qk) {
        try {
            C64386POs c64386POs = C64386POs.LIZIZ;
            c64386POs.LIZ.LJFF(new NDG(c32781Qk.LIZIZ().LIZ, c32781Qk.LIZIZ().LIZIZ), LJ(c32781Qk.LIZIZ().LJFF));
        } catch (Throwable unused) {
        }
    }

    @Override // X.InterfaceC18060nK
    public final void LIZLLL(C32781Qk c32781Qk) {
        try {
            C64386POs c64386POs = C64386POs.LIZIZ;
            c64386POs.LIZ.LIZJ(new NDG(c32781Qk.LIZIZ().LIZ, c32781Qk.LIZIZ().LIZIZ), LJ(c32781Qk.LIZIZ().LJFF));
        } catch (Throwable unused) {
        }
    }
}
