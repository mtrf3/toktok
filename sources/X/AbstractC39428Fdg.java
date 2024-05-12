package X;

import defpackage.i0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS15S0500000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Fdg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39428Fdg implements InterfaceC40516FvE {
    public final WeakReference<InterfaceC60761Nsz> LJLIL;
    public final WeakReference<C37942Euo> LJLILLLLZI;

    @Override // X.InterfaceC40516FvE
    public final void B9() {
    }

    @Override // X.InterfaceC40516FvE
    public final void LLJILJIL() {
    }

    @Override // X.InterfaceC40516FvE
    public final boolean S1() {
        return false;
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
    public F0S LLLIZZ() {
        EnumC39924Flg enumC39924Flg;
        C60737Nsb hybridContext;
        InterfaceC60710NsA interfaceC60710NsA;
        InterfaceC60761Nsz interfaceC60761Nsz = this.LJLIL.get();
        if (interfaceC60761Nsz != null && (hybridContext = interfaceC60761Nsz.getHybridContext()) != null && (interfaceC60710NsA = hybridContext.hybridParams) != null) {
            enumC39924Flg = interfaceC60710NsA.getType();
        } else {
            enumC39924Flg = null;
        }
        if (enumC39924Flg == EnumC39924Flg.LYNX) {
            return F0S.LYNX;
        }
        return F0S.WEB;
    }

    @Override // X.InterfaceC40516FvE
    public final F21 LLLLLLJ() {
        String str;
        C60737Nsb hybridContext;
        InterfaceC60761Nsz interfaceC60761Nsz = this.LJLIL.get();
        if (interfaceC60761Nsz == null || (hybridContext = interfaceC60761Nsz.getHybridContext()) == null || (str = hybridContext.containerId) == null) {
            str = "";
        }
        return new F21(str);
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
    public final android.net.Uri rk() {
        C60737Nsb hybridContext;
        InterfaceC60710NsA interfaceC60710NsA;
        InterfaceC60761Nsz interfaceC60761Nsz = this.LJLIL.get();
        if (interfaceC60761Nsz != null && (hybridContext = interfaceC60761Nsz.getHybridContext()) != null && (interfaceC60710NsA = hybridContext.hybridParams) != null) {
            return interfaceC60710NsA.LIZIZ();
        }
        return null;
    }

    @Override // X.InterfaceC40516FvE
    public final List<String> v1() {
        return new ArrayList();
    }

    public AbstractC39428Fdg(WeakReference<InterfaceC60761Nsz> weakReference) {
        Object obj;
        C60737Nsb hybridContext;
        this.LJLIL = weakReference;
        InterfaceC60761Nsz interfaceC60761Nsz = weakReference.get();
        if (interfaceC60761Nsz != null && (hybridContext = interfaceC60761Nsz.getHybridContext()) != null) {
            obj = hybridContext.LIZIZ(C37942Euo.class);
        } else {
            obj = null;
        }
        this.LJLILLLLZI = new WeakReference<>(obj);
    }

    @Override // X.InterfaceC40516FvE
    public void onEvent(F22 event) {
        o.LJIIIZ(event, "event");
        C37942Euo c37942Euo = this.LJLILLLLZI.get();
        if (c37942Euo != null) {
            c37942Euo.LIZ(event.getName(), (JSONObject) event.getParams());
        }
    }

    @Override // X.InterfaceC40516FvE
    public final <T extends AbstractC59475NVv> T tf(Class<T> cls) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Use Spark Method instead"));
    }

    @Override // X.InterfaceC39974FmU
    public final void printReject(Throwable th, String extraMsg) {
        o.LJIIJ(extraMsg, "extraMsg");
        C39973FmT.LIZJ(this, th, extraMsg);
    }

    @Override // X.InterfaceC40516FvE
    public final void Ka(String actionType, List<String> name, List<? extends JSONObject> params) {
        InterfaceC60761Nsz interfaceC60761Nsz;
        C60737Nsb hybridContext;
        C37942Euo c37942Euo;
        o.LJIIIZ(actionType, "actionType");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(params, "params");
        if (o.LJ(actionType, EnumC39434Fdm.Closed.getActionType()) && (interfaceC60761Nsz = this.LJLIL.get()) != null && (hybridContext = interfaceC60761Nsz.getHybridContext()) != null && (c37942Euo = (C37942Euo) hybridContext.LIZIZ(C37942Euo.class)) != null) {
            c37942Euo.LJIIIIZZ(name, params);
        }
    }

    @Override // X.InterfaceC40516FvE
    public final void Ua(android.net.Uri input, C60220NkG c60220NkG, AqS15S0500000_10 aqS15S0500000_10) {
        o.LJIIIZ(input, "input");
        InterfaceC60761Nsz interfaceC60761Nsz = this.LJLIL.get();
        if (interfaceC60761Nsz != null) {
            String uri = input.toString();
            o.LJIIIIZZ(uri, "input.toString()");
            interfaceC60761Nsz.load(uri);
        }
    }

    @Override // X.InterfaceC39974FmU
    public final void printLog(String str, EnumC39958FmE enumC39958FmE, String str2) {
        C39431Fdj.LIZ(this, str, enumC39958FmE, str2);
    }
}
