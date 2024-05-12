package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.Oph, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63105Oph implements CMW {
    public final /* synthetic */ Context LIZ;

    public C63105Oph(Context context) {
        this.LIZ = context;
    }

    @Override // X.CMW
    public final void LIZ(int i) {
        if (i == 0) {
            C63100Opc.LIZJ(this.LIZ, "", "live_server", true);
        } else {
            C63100Opc.LIZJ(this.LIZ, String.valueOf(i), "live_server", false);
        }
    }

    @Override // X.CMW
    public final void onFailed(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        C63100Opc.LIZJ(this.LIZ, "", "live_server", false);
    }
}
