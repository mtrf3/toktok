package X;

import Y.ARunnableS25S0200000_6;
import com.lynx.react.bridge.Callback;
import org.json.JSONObject;

/* renamed from: X.FmZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39979FmZ implements InterfaceC39983Fmd {
    public final /* synthetic */ ARunnableS25S0200000_6 LIZ;

    public C39979FmZ(ARunnableS25S0200000_6 aRunnableS25S0200000_6) {
        this.LIZ = aRunnableS25S0200000_6;
    }

    @Override // X.InterfaceC39983Fmd
    public final void LIZ(C39982Fmc c39982Fmc) {
        JSONObject jSONObject = new JSONObject();
        if (c39982Fmc == null) {
            return;
        }
        try {
            jSONObject.put("statusCode", c39982Fmc.LIZ);
            throw null;
        } catch (Exception e) {
            ((Callback) this.LIZ.l1).invoke(e.toString());
        }
    }

    @Override // X.InterfaceC39983Fmd
    public final void LIZIZ(C39982Fmc c39982Fmc) {
        ((Callback) this.LIZ.l1).invoke(c39982Fmc.LIZIZ);
    }
}
