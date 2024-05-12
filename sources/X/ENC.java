package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class ENC extends Exception implements InterfaceC61049Nxd {
    public final String LJLIL;

    @Override // X.InterfaceC61049Nxd
    public JSONObject getFormatData() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error_type", this.LJLIL);
        StringBuilder LIZ = X1D.LIZ();
        Throwable cause = getCause();
        o.LJI(cause);
        LIZ.append(C16880lQ.LJLLJ(cause.getClass()));
        LIZ.append(": ");
        Throwable cause2 = getCause();
        o.LJI(cause2);
        LIZ.append(cause2.getMessage());
        jSONObject.put("error_message", X1D.LIZIZ(LIZ));
        return jSONObject;
    }

    public final String getType() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ENC(String type, Throwable cause) {
        super(type, cause);
        o.LJIIIZ(type, "type");
        o.LJIIIZ(cause, "cause");
        this.LJLIL = type;
    }
}
