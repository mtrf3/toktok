package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.A8z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25757A8z implements Y6O {
    public final Context LIZ;

    public C25757A8z(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
    }

    @Override // X.Y6O
    public final C8IC LIZ(String str) {
        C8IC c8ic = new C8IC(this.LIZ, null, 6);
        c8ic.setMessage(str);
        return c8ic;
    }
}
