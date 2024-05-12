package X;

import org.json.JSONObject;

/* renamed from: X.Ffq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39562Ffq implements InterfaceC11180cE {
    public final /* synthetic */ InterfaceC39565Fft LIZ;

    public C39562Ffq(InterfaceC39565Fft interfaceC39565Fft) {
        this.LIZ = interfaceC39565Fft;
    }

    @Override // X.InterfaceC11180cE
    public final void LIZ(JSONObject jSONObject, boolean z) {
        this.LIZ.LIZ(String.valueOf(jSONObject.opt("code")), String.valueOf(jSONObject), z);
    }
}
