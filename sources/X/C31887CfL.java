package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.CfL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31887CfL implements InterfaceC40311Frv {
    public final /* synthetic */ C38113ExZ LIZ;

    public C31887CfL(C38113ExZ c38113ExZ) {
        this.LIZ = c38113ExZ;
    }

    @Override // X.InterfaceC40311Frv
    public final void LIZ(InterfaceC78280Uns interfaceC78280Uns, String eventName) {
        JSONObject jSONObject;
        o.LJIIIZ(eventName, "eventName");
        if (interfaceC78280Uns != null) {
            jSONObject = C78501UrR.LIZIZ(interfaceC78280Uns);
        } else {
            jSONObject = new JSONObject();
        }
        if (!this.LIZ.LJFF) {
            C38113ExZ c38113ExZ = this.LIZ;
            if (c38113ExZ.LJFF) {
                IllegalStateException illegalStateException = new IllegalStateException("JsBridge2 is already released!!!");
                if (C1A7.LJLIL) {
                    throw illegalStateException;
                }
            }
            c38113ExZ.LIZ.LJIILL(jSONObject, eventName);
        }
    }
}
