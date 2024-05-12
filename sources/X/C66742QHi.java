package X;

import com.ss.android.deviceregister.DeviceRegisterManager;
import org.json.JSONArray;

/* renamed from: X.QHi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66742QHi implements InterfaceC66743QHj {
    @Override // X.InterfaceC66743QHj
    public final boolean isEnable() {
        return C66741QHh.LIZIZ(String.valueOf(DeviceRegisterManager.getAppId()));
    }

    @Override // X.InterfaceC66743QHj
    public final void setEventVerifyUrl(String str) {
        C66741QHh.LIZLLL(String.valueOf(DeviceRegisterManager.getAppId()), str);
    }

    @Override // X.InterfaceC66743QHj
    public final void putEvent(String str, JSONArray jSONArray) {
        C66741QHh.LIZJ(String.valueOf(DeviceRegisterManager.getAppId()), str, jSONArray);
    }
}
