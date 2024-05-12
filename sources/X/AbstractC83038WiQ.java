package X;

import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.WiQ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC83038WiQ extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PROTECT;

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.reportMonitorLog";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C83040WiS> LIZ() {
        return C83040WiS.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C61335O5j> LIZLLL() {
        return C61335O5j.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final EnumC38005Evp getAccess() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        boolean z;
        double asDouble;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        String LJJIJIL = u.LJJIJIL(params, "logType", "");
        if (LJJIJIL.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String LJJIJIL2 = u.LJJIJIL(params, "service", "");
            if (params.hasKey("status")) {
                InterfaceC78505UrV interfaceC78505UrV = params.get("status");
                int i = C77897Uhh.LIZ[interfaceC78505UrV.getType().ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        asDouble = interfaceC78505UrV.asDouble();
                    }
                } else {
                    asDouble = interfaceC78505UrV.asDouble();
                }
                int i2 = (int) asDouble;
                InterfaceC78280Uns LJJIJIIJIL = u.LJJIJIIJIL(params, "value");
                if (LJJIJIIJIL != null) {
                    C83040WiS c83040WiS = new C83040WiS();
                    c83040WiS.LIZ = LJJIJIL;
                    o.LJIIJ(LJJIJIL2, "<set-?>");
                    c83040WiS.LIZIZ = LJJIJIL2;
                    c83040WiS.LIZJ = i2;
                    c83040WiS.LIZLLL = LJJIJIIJIL;
                    C83039WiR c83039WiR = new C83039WiR(this, interfaceC31943CgF);
                    String str = c83040WiS.LIZ;
                    if (str != null) {
                        String str2 = c83040WiS.LIZIZ;
                        if (str2 != null) {
                            if (o.LJ("service_monitor", str) && str2.length() == 0) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("service is required while log_type=");
                                LIZ.append(str);
                                c83039WiR.LIZ(X1D.LIZIZ(LIZ));
                                return;
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("status", c83040WiS.LIZJ);
                            InterfaceC78280Uns interfaceC78280Uns = c83040WiS.LIZLLL;
                            if (interfaceC78280Uns != null) {
                                jSONObject.put("value", C78501UrR.LIZIZ(interfaceC78280Uns));
                                try {
                                    if (str2.length() > 0) {
                                        jSONObject.put("service", str2);
                                    }
                                } catch (JSONException e) {
                                    C16880lQ.LLLLIIL(e);
                                }
                                C09900aA.LJ(str, jSONObject);
                                c83039WiR.LIZIZ(new C61335O5j(), "");
                                return;
                            }
                            o.LJIJI("value");
                            throw null;
                        }
                        o.LJIJI("service");
                        throw null;
                    }
                    o.LJIJI("logType");
                    throw null;
                }
            }
        }
        AbstractC37780EsC.LJFF(this, interfaceC31943CgF, -3, null, 12);
    }
}
