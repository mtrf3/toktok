package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.ClC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32250ClC implements InterfaceC32251ClD {
    public final InterfaceC32251ClD LIZ;
    public final String LIZIZ;

    @Override // X.InterfaceC32251ClD
    public final boolean LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    public C32250ClC(InterfaceC32251ClD base) {
        o.LJIIIZ(base, "base");
        this.LIZ = base;
        this.LIZIZ = "monitor";
    }

    @Override // X.InterfaceC32251ClD
    public final void ensureNotReachHere(Throwable th, String str) {
        this.LIZ.ensureNotReachHere(th, str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZIZ);
        LIZ.append(" ensureNotReachHere ");
        LIZ.append(th);
        LIZ.append(", msg = ");
        LIZ.append(str);
        C32444CoK.LIZIZ(null, X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC32251ClD
    public final void LIZ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this.LIZ.LIZ(str, jSONObject, jSONObject2);
        StringBuilder LIZ = X1D.LIZ();
        YE1.LIZLLL(LIZ, this.LIZIZ, " monitorStatusAndDuration ", str, ", status = ");
        LIZ.append(0);
        C32444CoK.LIZ(null, X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC32251ClD
    public final void monitorStatus(String str, int i, JSONObject jSONObject) {
        this.LIZ.monitorStatus(str, i, jSONObject);
        StringBuilder LIZ = X1D.LIZ();
        YE1.LIZLLL(LIZ, this.LIZIZ, " monitorStatus ", str, ", status = ");
        LIZ.append(i);
        C32444CoK.LIZ(null, X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC32251ClD
    public final void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.LIZ.monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZIZ);
        LIZ.append(" monitorEvent ");
        LIZ.append(str);
        C32444CoK.LIZ(null, X1D.LIZIZ(LIZ));
    }
}
