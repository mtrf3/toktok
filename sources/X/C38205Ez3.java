package X;

import android.os.SystemClock;
import com.google.gson.internal.b;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.AqS188S0100000_6;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ez3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38205Ez3 implements InterfaceC38012Evw {
    public final /* synthetic */ AqS188S0100000_6 LJLIL;
    public final /* synthetic */ InterfaceC38217EzF LJLILLLLZI;

    public C38205Ez3(AqS188S0100000_6 aqS188S0100000_6, InterfaceC38217EzF interfaceC38217EzF) {
        this.LJLIL = aqS188S0100000_6;
        this.LJLILLLLZI = interfaceC38217EzF;
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        String str;
        JSONObject params;
        C60238NkY c60238NkY = (C60238NkY) this.LJLIL.l0;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bullet web func: ");
        InterfaceC38217EzF interfaceC38217EzF = null;
        if (c38048EwW != null) {
            str = c38048EwW.LIZJ;
        } else {
            str = null;
        }
        LIZ.append(str);
        C39973FmT.LIZIZ(c60238NkY, X1D.LIZIZ(LIZ), null, null, 6);
        SystemClock.elapsedRealtime();
        if (c38048EwW != null && c38048EwW.LIZLLL != null) {
            params = c38048EwW.LIZLLL;
        } else {
            params = new JSONObject();
        }
        C60238NkY c60238NkY2 = (C60238NkY) this.LJLIL.l0;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("call web bridge method named ");
        LIZ2.append(c38048EwW.LIZJ);
        LIZ2.append(" with params ");
        LIZ2.append(params);
        c60238NkY2.printLog(X1D.LIZIZ(LIZ2), EnumC39958FmE.D, "BridgeRegistry");
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", c38048EwW.LIZ);
            jSONObject2.put("func", c38048EwW.LIZJ);
            jSONObject2.put("callback_id", c38048EwW.LIZIZ);
            jSONObject2.put("version", Integer.valueOf(c38048EwW.LJ));
            jSONObject2.put("needCallback", Boolean.valueOf(c38048EwW.LJIIJ));
            jSONObject2.put("permissionGroup", c38048EwW.LJIIIZ);
            params.put("jsMsg", jSONObject2);
            params.put("func", c38048EwW.LIZJ);
            params.put("permissionGroup", c38048EwW.LJIIIZ);
            params.put("res", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        InterfaceC38217EzF interfaceC38217EzF2 = this.LJLILLLLZI;
        if (interfaceC38217EzF2 == null || (interfaceC38217EzF2 instanceof InterfaceC38186Eyk)) {
            if (interfaceC38217EzF2 instanceof InterfaceC38186Eyk) {
                interfaceC38217EzF = interfaceC38217EzF2;
            }
            InterfaceC38186Eyk interfaceC38186Eyk = (InterfaceC38186Eyk) interfaceC38217EzF;
            if (interfaceC38186Eyk != null) {
                o.LJFF(params, "params");
                interfaceC38186Eyk.handle(params, new C38206Ez4(this, c38048EwW));
            }
        } else {
            InterfaceC38202Ez0 interfaceC38202Ez0 = (InterfaceC38202Ez0) interfaceC38217EzF2;
            InterfaceC88471Ynr<Object, Class<?>, Object> LIZ3 = C38195Eyt.LIZ(JSONObject.class, java.util.Map.class);
            InterfaceC88471Ynr<Object, Class<?>, Object> LIZ4 = C38195Eyt.LIZ(java.util.Map.class, JSONObject.class);
            new AqS137S0200000_6(LIZ3, interfaceC38202Ez0, 26);
            interfaceC38202Ez0.l8();
            new AqS137S0200000_6(LIZ4, interfaceC38202Ez0, 27);
            interfaceC38202Ez0.a1();
            try {
                o.LJFF(params, "params");
                b.LIZ(interfaceC38202Ez0, params, new C38207Ez5(interfaceC38202Ez0));
            } catch (Throwable th) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("code", 0);
                    jSONObject3.put("msg", th.toString());
                    C38182Eyg c38182Eyg = ((C60238NkY) this.LJLIL.l0).LLILII;
                    if (c38182Eyg != null) {
                        c38182Eyg.LIZJ(interfaceC38202Ez0, c38048EwW.LIZIZ, jSONObject3);
                    }
                    C60238NkY c60238NkY3 = (C60238NkY) this.LJLIL.l0;
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("complete web bridge named ");
                    LIZ5.append(c38048EwW.LIZJ);
                    LIZ5.append(" failure with status[0, ");
                    LIZ5.append(th.toString());
                    LIZ5.append(']');
                    c60238NkY3.printLog(X1D.LIZIZ(LIZ5), EnumC39958FmE.D, "BridgeRegistry");
                } catch (JSONException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
        }
        c38048EwW.LJIIJ = this.LJLILLLLZI.getNeedCallback();
    }
}
