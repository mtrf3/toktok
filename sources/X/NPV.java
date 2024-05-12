package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final /* synthetic */ class NPV implements InterfaceC38988FRw {
    public static boolean LIZ(O7E o7e) {
        if (NW6.LIZ().isChildrenMode()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("show_failed_reason", "4");
            } catch (JSONException e) {
                C78983UzD.LJIIZILJ(e);
            }
            FMX.LJIILJJIL("topview_show_failed", jSONObject);
            NW6.LIZ().LJJIJIIJI("Child mode does not show ads");
        } else if (NW6.LIZ().LJ()) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("show_failed_reason", "5");
            } catch (JSONException e2) {
                C78983UzD.LJIIZILJ(e2);
            }
            FMX.LJIILJJIL("topview_show_failed", jSONObject2);
            NW6.LIZ().LJJIJIIJI("ad subscription user does not show ads");
        } else if (o7e.LJIIJJI() && NW6.LIZ().LIZIZ()) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("show_failed_reason", "3");
            } catch (JSONException e3) {
                C78983UzD.LJIIZILJ(e3);
            }
            FMX.LJIILJJIL("topview_show_failed", jSONObject3);
            NW6.LIZ().LJJIJIIJI("is np user, no ads");
        } else {
            return true;
        }
        return false;
    }
}
