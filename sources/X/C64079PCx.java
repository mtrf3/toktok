package X;

import Y.ARunnableS3S1400000_11;
import android.util.Base64;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import m43.u;
import ujb.o;

/* renamed from: X.PCx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64079PCx {
    public static URLConnection LIZ(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "-5818140978557105037"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    public static final PublicKey LIZIZ(String str) {
        byte[] decode = Base64.decode(o.LJJJJZ(o.LJJJJZ(o.LJJJJZ(str, "\n", "", false), "-----BEGIN PUBLIC KEY-----", "", false), "-----END PUBLIC KEY-----", "", false), 0);
        kotlin.jvm.internal.o.LJIIIIZZ(decode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        kotlin.jvm.internal.o.LJIIIIZZ(generatePublic, "kf.generatePublic(x509publicKey)");
        return generatePublic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String LIZJ(String kid) {
        kotlin.jvm.internal.o.LJIIIZ(kid, "kid");
        java.net.URL url = new java.net.URL("https", kotlin.jvm.internal.o.LJIILLIIL(u.LJIILLIIL, "www."), "/.well-known/oauth/openid/keys/");
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        C68322mC c68322mC = new C68322mC();
        u.LJ().execute(new ARunnableS3S1400000_11(url, c68322mC, kid, reentrantLock, newCondition, 0));
        reentrantLock.lock();
        try {
            newCondition.await(5000L, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) c68322mC.element;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final boolean LIZLLL(PublicKey publicKey, String data, String signature) {
        kotlin.jvm.internal.o.LJIIIZ(data, "data");
        kotlin.jvm.internal.o.LJIIIZ(signature, "signature");
        try {
            Signature signature2 = Signature.getInstance("SHA256withRSA");
            signature2.initVerify(publicKey);
            byte[] bytes = data.getBytes(PVC.LIZ);
            kotlin.jvm.internal.o.LJIIIIZZ(bytes, "(this as java.lang.String).getBytes(charset)");
            signature2.update(bytes);
            byte[] decode = Base64.decode(signature, 8);
            kotlin.jvm.internal.o.LJIIIIZZ(decode, "decode(signature, Base64.URL_SAFE)");
            return signature2.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }
}
