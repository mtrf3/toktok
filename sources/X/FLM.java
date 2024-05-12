package X;

import android.content.Context;
import com.bytedance.bpea.cert.token.TokenCert;
import kotlin.jvm.internal.AqS66S1200000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FLM {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, String str, java.util.Map map, TokenCert cert) {
        o.LJIIIZ(cert, "cert");
        C1GE.LJIJJ(cert, "AppsFlyer", "logEvent", new AqS66S1200000_11(context, str, map, 3));
    }
}
