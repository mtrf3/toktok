package X;

import android.content.Context;
import com.bytedance.bpea.cert.token.TokenCert;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* renamed from: X.Q8b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66501Q8b {
    public static final C66501Q8b LIZ = new C66501Q8b();

    public static void LIZ(Context context, KFD kfd) {
        C66503Q8d c66503Q8d = new C66503Q8d(context);
        String secret = kfd.LIZ;
        o.LJIIIZ(secret, "secret");
        c66503Q8d.LIZJ = secret;
        String consumerSecret = kfd.LIZIZ;
        o.LJIIIZ(consumerSecret, "consumerSecret");
        c66503Q8d.LIZLLL = consumerSecret;
        C66502Q8c c66502Q8c = new C66502Q8c(c66503Q8d);
        TokenCert cert = TokenCert.Companion.with("bpea-twitter_androidsdk_2008");
        o.LJIIIZ(cert, "cert");
        C1GE.LJIJJ(cert, "Twitter", "initialize", new AqS161S0100000_11(c66502Q8c, 111));
    }
}
