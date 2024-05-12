package X;

import Y.ARunnableS49S0100000_13;
import org.json.JSONObject;

/* renamed from: X.UmC, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78176UmC implements CHW {
    public final /* synthetic */ C78174UmA LIZ;

    public C78176UmC(C78174UmA c78174UmA) {
        this.LIZ = c78174UmA;
    }

    @Override // X.CHW
    public final void LIZJ(JSONObject jSONObject) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DropFrameCallback = ");
        LIZ.append(jSONObject);
        C32444CoK.LIZ(null, X1D.LIZIZ(LIZ));
        C32257ClJ.LIZ.post(new ARunnableS49S0100000_13(this.LIZ, 124));
    }
}
