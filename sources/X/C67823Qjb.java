package X;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.TelemetryData;

/* renamed from: X.Qjb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67823Qjb extends AbstractC67791Qj5<C67911Ql1> {
    public static final C67718Qhu<C67911Ql1> LJIIJ = new C67718Qhu<>("ClientTelemetry.API", new C67857Qk9(), new C67728Qi4());

    public C67823Qjb(Context context) {
        super(context, LJIIJ, C67911Ql1.LJLILLLLZI, C67795Qj9.LIZJ);
    }

    public final C67646Qgk LJ(TelemetryData telemetryData) {
        C67887Qkd c67887Qkd = new C67887Qkd();
        c67887Qkd.LIZJ = new Feature[]{C67933QlN.LIZ};
        c67887Qkd.LIZIZ = false;
        c67887Qkd.LIZ = new C67821QjZ(telemetryData);
        return LIZLLL(2, c67887Qkd.LIZ());
    }
}
