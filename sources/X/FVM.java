package X;

import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FVM implements QJ5 {
    @Override // X.QJ5
    public final void LIZIZ(long j) {
        FVP.LIZ.onNext(new C2323199v(FVN.Start, j, "", null));
    }

    @Override // X.QJ5
    public final void LIZ(String str, long j, JSONObject jSONObject) {
        FVP.LIZ.onNext(new C2323199v(FVN.End, j, str, jSONObject));
    }

    @Override // X.QJ5
    public final void LIZJ(String str, long j, JSONObject jSONObject) {
        FVP.LIZIZ = str;
        FVP.LIZ.onNext(new C2323199v(FVN.LogSessionBatch, j, str, jSONObject));
    }
}
