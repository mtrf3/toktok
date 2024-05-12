package X;

import org.json.JSONObject;

/* renamed from: X.Cfk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31912Cfk implements InterfaceC60521Np7 {
    public final /* synthetic */ C31911Cfj LIZ;

    @Override // X.InterfaceC60521Np7
    public final void onExit() {
        C31911Cfj c31911Cfj = this.LIZ;
        if (!c31911Cfj.LJLIL) {
            c31911Cfj.finishWithFailure();
        }
    }

    public C31912Cfk(C31911Cfj c31911Cfj) {
        this.LIZ = c31911Cfj;
    }

    @Override // X.InterfaceC60521Np7
    public final void onChanged(String str, String str2) {
        JSONObject LJ = C47135Ieh.LJ("phoneCode", str, "shortCountryName", str2);
        C31911Cfj c31911Cfj = this.LIZ;
        c31911Cfj.LJLIL = true;
        c31911Cfj.finishWithResult(LJ);
    }
}
