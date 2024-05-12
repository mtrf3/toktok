package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ttve.nativePort.TEBundle;
import m43.u;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final /* synthetic */ class Q7K implements InterfaceC65843Psl, InterfaceC38669FFp {
    @Override // X.InterfaceC65843Psl
    public void LIZ(boolean z) {
        if (z) {
            u.LJIIL = true;
        }
    }

    public static int LIZIZ(String str, int i) {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJ(str, i);
    }

    public static JSONObject LIZLLL(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, j);
        return jSONObject;
    }

    public static TEBundle LIZJ(X0G x0g, String str, int i) {
        x0g.getClass();
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt(str, i);
        return obtain;
    }

    public static void LJ(String str, int i, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(i);
        P4Q.LIZJ(str2, X1D.LIZIZ(LIZ));
    }
}
