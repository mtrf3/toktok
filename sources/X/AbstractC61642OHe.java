package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.OHe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC61642OHe implements InterfaceC61646OHi {
    public JSONObject LIZ;

    public abstract void LIZIZ(JSONObject jSONObject);

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        LIZ.append(' ');
        LIZ.append(this.LIZ);
        return X1D.LIZIZ(LIZ);
    }

    public AbstractC61642OHe(EnumC61643OHf type) {
        o.LJIIJ(type, "type");
    }
}
