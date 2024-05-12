package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.JWy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49312JWy implements InterfaceC49318JXe<C1IZ> {
    public final /* synthetic */ JTS LIZ;

    @Override // X.InterfaceC49318JXe
    public final Class<C1IZ> LIZ() {
        return C1IZ.class;
    }

    public C49312JWy(JTS jts) {
        this.LIZ = jts;
    }

    @Override // X.InterfaceC49318JXe
    public final void LIZIZ(C1IZ c1iz) {
        C1IZ event = c1iz;
        o.LJIIIZ(event, "event");
        long j = event.LJLIL;
        JTS jts = this.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("room_id_str", String.valueOf(j));
        jts.LIZ("updateLiveCloseState", jSONObject);
    }
}
