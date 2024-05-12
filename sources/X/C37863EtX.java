package X;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EtX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37863EtX implements InterfaceC38177Eyb {
    public final /* synthetic */ C37860EtU LIZ;
    public final /* synthetic */ InterfaceC37673EqT LIZIZ;
    public final /* synthetic */ Iterator LIZJ;
    public final /* synthetic */ C37904EuC LIZLLL;
    public final /* synthetic */ C37955Ev1 LJ;

    @Override // X.InterfaceC37673EqT
    public final void LIZ(Object parcel) {
        o.LJIIJ(parcel, "parcel");
        this.LIZIZ.LIZ(parcel);
    }

    @Override // X.InterfaceC38177Eyb
    public final void LIZIZ(EnumC37868Etc reason) {
        o.LJIIJ(reason, "reason");
        int i = C37867Etb.LIZ[reason.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            if (this.LIZJ.hasNext()) {
                InterfaceC37862EtW interfaceC37862EtW = (InterfaceC37862EtW) ((Map.Entry) this.LIZJ.next()).getValue();
                C37860EtU c37860EtU = this.LIZ;
                C37904EuC c37904EuC = this.LIZLLL;
                C37955Ev1 c37955Ev1 = this.LJ;
                InterfaceC37673EqT interfaceC37673EqT = this.LIZIZ;
                Iterator it = this.LIZJ;
                c37860EtU.getClass();
                c37904EuC.LIZJ.LJIIIIZZ(c37904EuC, c37955Ev1);
                interfaceC37862EtW.LIZIZ(c37955Ev1, new C37863EtX(c37860EtU, interfaceC37673EqT, it, c37904EuC, c37955Ev1));
                c37904EuC.LIZJ.LJII(c37904EuC, c37955Ev1);
                return;
            }
            C37858EtS.LIZ(this.LIZIZ);
            return;
        }
        InterfaceC37673EqT callback = this.LIZIZ;
        o.LJIIJ(callback, "callback");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", -1);
        jSONObject.put("data", new JSONObject());
        jSONObject.put("msg", "The URL is not authorized to call this JSBridge method");
        callback.LIZ(jSONObject);
    }

    @Override // X.InterfaceC38177Eyb
    public final void LIZJ(Object obj, String name) {
        o.LJIIJ(name, "name");
        Iterator<AbstractC37899Eu7> it = this.LIZLLL.LJII.iterator();
        while (it.hasNext()) {
            it.next().LJIIIZ(obj, name);
        }
    }

    public C37863EtX(C37860EtU c37860EtU, InterfaceC37673EqT interfaceC37673EqT, Iterator it, C37904EuC c37904EuC, C37955Ev1 c37955Ev1) {
        this.LIZ = c37860EtU;
        this.LIZIZ = interfaceC37673EqT;
        this.LIZJ = it;
        this.LIZLLL = c37904EuC;
        this.LJ = c37955Ev1;
    }
}
