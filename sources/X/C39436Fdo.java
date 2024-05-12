package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Fdo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39436Fdo implements InterfaceC37120EhY {
    public final /* synthetic */ C39435Fdn LIZ;

    public C39436Fdo(C39435Fdn c39435Fdn) {
        this.LIZ = c39435Fdn;
    }

    @Override // X.InterfaceC37120EhY
    public final void LIZ(JSONObject data) {
        o.LJIIJ(data, "data");
        C39435Fdn c39435Fdn = this.LIZ;
        String str = c39435Fdn.LJLIL;
        EnumC39958FmE enumC39958FmE = EnumC39958FmE.D;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onComplete actionType:");
        LIZ.append(this.LIZ.LJLILLLLZI);
        LIZ.append(", name:");
        LIZ.append(this.LIZ.LJLJI);
        c39435Fdn.printLog(str, enumC39958FmE, X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC37120EhY
    public final void onError(int i, String str) {
        C39435Fdn c39435Fdn = this.LIZ;
        String str2 = c39435Fdn.LJLIL;
        EnumC39958FmE enumC39958FmE = EnumC39958FmE.D;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onError actionType:");
        C0EH.LIZLLL(LIZ, this.LIZ.LJLILLLLZI, ", code:", i, ", message:");
        LIZ.append(str);
        c39435Fdn.printLog(str2, enumC39958FmE, X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC37120EhY
    public final void LIZIZ(int i, String str, JSONObject jSONObject) {
        C39435Fdn c39435Fdn = this.LIZ;
        String str2 = c39435Fdn.LJLIL;
        EnumC39958FmE enumC39958FmE = EnumC39958FmE.D;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onError actionType:");
        C0EH.LIZLLL(LIZ, this.LIZ.LJLILLLLZI, ", code:", i, ", message:");
        LIZ.append(str);
        c39435Fdn.printLog(str2, enumC39958FmE, X1D.LIZIZ(LIZ));
    }
}
