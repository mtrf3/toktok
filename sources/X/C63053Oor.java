package X;

import android.content.Context;
import com.bytedance.bpea.cert.token.TokenCert;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.AqS66S0110000_11;
import kotlin.jvm.internal.o;

/* renamed from: X.Oor, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63053Oor {
    public static final C63052Ooq LIZIZ = new C63052Ooq();
    public static volatile C63053Oor LIZJ;
    public final FirebaseAnalytics LIZ;

    public C63053Oor(Context context) {
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
        o.LJIIIIZZ(firebaseAnalytics, "getInstance(context)");
        this.LIZ = firebaseAnalytics;
    }

    public final void LIZ(TokenCert cert, boolean z) {
        o.LJIIIZ(cert, "cert");
        C1GE.LJIJJ(cert, "Firebase", "setAnalyticsCollectionEnabled", new AqS66S0110000_11(this, z, 3));
    }
}
