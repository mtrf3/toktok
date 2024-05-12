package X;

import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import org.json.JSONObject;

/* renamed from: X.IoT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47741IoT implements InterfaceC47420IjI {
    public final /* synthetic */ InterfaceC47746IoY LIZ;

    public C47741IoT(C47740IoS c47740IoS) {
        this.LIZ = c47740IoS;
    }

    @Override // X.InterfaceC47420IjI
    public final void LIZIZ(JSONObject jSONObject, C47789IpF c47789IpF) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setting result ");
        LIZ.append(jSONObject);
        TTVideoEngineLog.d("VodSettings", X1D.LIZIZ(LIZ));
        if (c47789IpF != null) {
            InterfaceC47746IoY interfaceC47746IoY = this.LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(" fail. info: ");
            LIZ2.append(c47789IpF.toString());
            ((C47740IoS) interfaceC47746IoY).LIZ(null, new Error(X1D.LIZIZ(LIZ2)));
            return;
        }
        if (jSONObject == null) {
            return;
        }
        ((C47740IoS) this.LIZ).LIZ(jSONObject, null);
    }
}
