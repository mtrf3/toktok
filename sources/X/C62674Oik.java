package X;

import android.app.Activity;
import com.bytedance.bpea.cert.token.TokenCert;
import kotlin.jvm.internal.o;

/* renamed from: X.Oik, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62674Oik {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Activity activity, android.net.Uri localUri, String str, TokenCert cert) {
        o.LJIIIZ(localUri, "localUri");
        o.LJIIIZ(cert, "cert");
        C1GE.LJIJJ(cert, "Facebook", "shareToMessenger", new Q99(localUri, str, activity));
    }
}
