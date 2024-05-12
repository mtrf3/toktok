package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS15S0500000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Fdh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39429Fdh implements InterfaceC40516FvE {
    @Override // X.InterfaceC40516FvE
    public final void B9() {
    }

    @Override // X.InterfaceC40516FvE
    public final void Ka(String actionType, List<String> name, List<? extends JSONObject> params) {
        o.LJIIIZ(actionType, "actionType");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(params, "params");
    }

    @Override // X.InterfaceC40516FvE
    public final void LLJILJIL() {
    }

    @Override // X.InterfaceC40516FvE
    public final boolean S1() {
        return false;
    }

    @Override // X.InterfaceC40516FvE
    public final void Ua(android.net.Uri input, C60220NkG c60220NkG, AqS15S0500000_10 aqS15S0500000_10) {
        o.LJIIIZ(input, "input");
    }

    @Override // X.InterfaceC40516FvE
    public final void be(Throwable th) {
    }

    @Override // X.InterfaceC40516FvE
    public final void g() {
    }

    @Override // X.InterfaceC40516FvE
    public final AbstractC59475NVv h6() {
        return null;
    }

    @Override // X.InterfaceC40516FvE
    public final void kf(List newPackageNames, C60251Nkl c60251Nkl) {
        o.LJIIIZ(newPackageNames, "newPackageNames");
    }

    @Override // X.InterfaceC40516FvE
    public final <T extends InterfaceC60387Nmx> T mb(Class<T> cls) {
        return null;
    }

    @Override // X.InterfaceC40516FvE
    public void onEvent(F22 event) {
        o.LJIIIZ(event, "event");
    }

    @Override // X.InterfaceC40516FvE
    public android.net.Uri rk() {
        return null;
    }

    @Override // X.InterfaceC40516FvE
    public final <T extends AbstractC59475NVv> T tf(Class<T> cls) {
        return null;
    }

    @Override // X.InterfaceC40516FvE
    public F21 LLLLLLJ() {
        return new F21("");
    }

    @Override // X.InterfaceC39974FmU
    public final C39976FmW getLoggerWrapper() {
        return new C39976FmW(null, "");
    }

    @Override // X.InterfaceC40516FvE
    public final F3T getProviderFactory() {
        return new F3T();
    }

    @Override // X.InterfaceC40516FvE
    public final List<String> v1() {
        return new ArrayList();
    }

    @Override // X.InterfaceC39974FmU
    public final void printReject(Throwable th, String extraMsg) {
        o.LJIIJ(extraMsg, "extraMsg");
        C39973FmT.LIZJ(this, th, extraMsg);
    }

    @Override // X.InterfaceC39974FmU
    public final void printLog(String str, EnumC39958FmE enumC39958FmE, String str2) {
        C39431Fdj.LIZ(this, str, enumC39958FmE, str2);
    }
}
