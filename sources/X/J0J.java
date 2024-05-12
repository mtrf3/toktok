package X;

import aa2.a;
import android.content.Context;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J0J extends J0P {
    public final Context LIZ;

    public J0J(Context context) {
        o.LJIIJ(context, "context");
        this.LIZ = context;
    }

    @Override // X.J0P
    public final J0O LIZ(java.util.Map<String, String> map) {
        return new a(this.LIZ, map);
    }
}
