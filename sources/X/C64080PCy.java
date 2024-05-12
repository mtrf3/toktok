package X;

import android.util.Base64;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import kotlin.jvm.internal.o;

/* renamed from: X.PCy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64080PCy {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String publicKeyPem, String info, String signatureHex) {
        o.LJIIJ(publicKeyPem, "publicKeyPem");
        o.LJIIJ(info, "info");
        o.LJIIJ(signatureHex, "signatureHex");
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(new OJD("\\s+").replace(ujb.o.LJJJJZ(ujb.o.LJJJJZ(publicKeyPem, "-----BEGIN PUBLIC KEY-----", "", false), "-----END PUBLIC KEY-----", "", false), ""), 0)));
        if (generatePublic != null) {
            byte[] decode = Base64.decode(signatureHex, 0);
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(generatePublic);
            Charset forName = Charset.forName("UTF-8");
            o.LJFF(forName, "Charset.forName(charsetName)");
            byte[] bytes = info.getBytes(forName);
            o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
            signature.update(bytes);
            return signature.verify(decode);
        }
        throw new C37692Eqm("null cannot be cast to non-null type java.security.PublicKey");
    }
}
