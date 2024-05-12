package X;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* renamed from: X.0TJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0TJ {
    public static C0TI LIZ(String str, String str2) {
        String replaceAll = str.replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "").replaceAll("\n", "").replaceAll("\t", "");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("entryWithRsaPublicKey:");
        LIZ.append(replaceAll);
        X1D.LIZIZ(LIZ);
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(replaceAll.getBytes(), 0)));
            OAEPParameterSpec oAEPParameterSpec = new OAEPParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), PSource.PSpecified.DEFAULT);
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            cipher.init(1, generatePublic, oAEPParameterSpec);
            return new C0TI(true, Base64.encodeToString(cipher.doFinal(str2.getBytes()), 2));
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("entryWithRsaPublicKey exception: ");
            LIZ2.append(th.getLocalizedMessage());
            return new C0TI(false, X1D.LIZIZ(LIZ2));
        }
    }
}
