package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public class PHY implements InterfaceC64095PDn {
    public final /* synthetic */ PHU LIZ;

    public PHY(PHU phu) {
        this.LIZ = phu;
    }

    @Override // X.InterfaceC64095PDn
    public final void LIZ(String str, JSONObject jSONObject) {
        PHU phu = this.LIZ;
        if (!phu.LIZ) {
            return;
        }
        phu.LJ(str, jSONObject);
    }
}
