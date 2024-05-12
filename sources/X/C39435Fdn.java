package X;

import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Fdn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39435Fdn implements F22, InterfaceC39974FmU {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final JSONObject LJLJJI;
    public final C39976FmW LJLJJL;

    @Override // X.InterfaceC39974FmU
    public final C39976FmW getLoggerWrapper() {
        return this.LJLJJL;
    }

    @Override // X.F22
    public final String getName() {
        return this.LJLJI;
    }

    @Override // X.F22
    public final /* bridge */ /* synthetic */ Object getParams() {
        return this.LJLJJI;
    }

    public final void onEvent(InterfaceC38196Eyu interfaceC38196Eyu) {
        String str = this.LJLILLLLZI;
        for (EnumC39434Fdm enumC39434Fdm : EnumC39434Fdm.values()) {
            if (o.LJ(enumC39434Fdm.getActionType(), str)) {
                if (interfaceC38196Eyu != null) {
                    String str2 = this.LJLJI;
                    JSONObject jSONObject = this.LJLJJI;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    interfaceC38196Eyu.P(str2, jSONObject, new C39436Fdo(this), new AqS172S0100000_6(this, 93));
                    return;
                }
                return;
            }
        }
    }

    @Override // X.InterfaceC39974FmU
    public final void printReject(Throwable th, String extraMsg) {
        o.LJIIJ(extraMsg, "extraMsg");
        C39973FmT.LIZJ(this, th, extraMsg);
    }

    @Override // X.InterfaceC39974FmU
    public final void printLog(String msg, EnumC39958FmE logLevel, String subModule) {
        o.LJIIJ(msg, "msg");
        o.LJIIJ(logLevel, "logLevel");
        o.LJIIJ(subModule, "subModule");
        C39973FmT.LIZ(this, msg, logLevel, subModule);
    }

    public C39435Fdn(String actionType, String name, JSONObject jSONObject, C39976FmW loggerWrapper) {
        o.LJIIJ(actionType, "actionType");
        o.LJIIJ(name, "name");
        o.LJIIJ(loggerWrapper, "loggerWrapper");
        this.LJLILLLLZI = actionType;
        this.LJLJI = name;
        this.LJLJJI = jSONObject;
        this.LJLJJL = loggerWrapper;
        this.LJLIL = C16880lQ.LJLLJ(C39435Fdn.class);
    }
}
