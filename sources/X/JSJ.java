package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class JSJ implements InterfaceC49318JXe<C50420Jqa> {
    public final /* synthetic */ JTS LIZ;

    @Override // X.InterfaceC49318JXe
    public final Class<C50420Jqa> LIZ() {
        return C50420Jqa.class;
    }

    public JSJ(JTS jts) {
        this.LIZ = jts;
    }

    @Override // X.InterfaceC49318JXe
    public final void LIZIZ(C50420Jqa c50420Jqa) {
        C50420Jqa event = c50420Jqa;
        o.LJIIIZ(event, "event");
        if (event.LJLIL == 13) {
            JTS jts = this.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("aid", event.LJLILLLLZI);
            Bundle bundle = event.LJLJI;
            if (bundle != null) {
                jSONObject.put("dig_status", bundle.getInt("user_digged"));
            }
            jts.LIZ("changeDiggState", jSONObject);
        }
    }
}
