package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.27s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C534027s extends AbstractC44281oW {
    @Override // X.AbstractC44281oW
    public final String LJIIIIZZ() {
        return "pipo.onEvent";
    }

    @Override // X.AbstractC44281oW, X.InterfaceC37774Es6
    public final String getName() {
        return "pipo.onEvent";
    }

    @Override // X.AbstractC44281oW, X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns interfaceC78280Uns, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH enumC37847EtH) {
        super.LIZJ(interfaceC78280Uns, interfaceC31943CgF, enumC37847EtH);
        String string = interfaceC78280Uns.getString("event_name");
        InterfaceC78280Uns map = interfaceC78280Uns.getMap("params");
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            java.util.Map<String, Object> LIZIZ = map.LIZIZ();
            for (String str : LIZIZ.keySet()) {
                try {
                    jSONObject.put(str, LIZIZ.get(str));
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        C276216o.LJIIL.LIZIZ().onEventV3(string, jSONObject);
        C04490Fp.LIZJ("pipo.onEvent", "success", interfaceC31943CgF);
    }
}
