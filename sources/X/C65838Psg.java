package X;

import android.util.Base64;
import java.security.MessageDigest;
import kotlin.jvm.internal.o;

/* renamed from: X.Psg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65838Psg {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZIZ(String str) {
        if (str == null || str.length() == 0 || str.length() < 43 || str.length() > 128) {
            return false;
        }
        return new OJD("^[-._~A-Za-z0-9]+$").matches(str);
    }

    public static final String LIZ(String codeVerifier, EnumC65839Psh codeChallengeMethod) {
        o.LJIIIZ(codeVerifier, "codeVerifier");
        o.LJIIIZ(codeChallengeMethod, "codeChallengeMethod");
        if (LIZIZ(codeVerifier)) {
            if (codeChallengeMethod == EnumC65839Psh.PLAIN) {
                return codeVerifier;
            }
            try {
                byte[] bytes = codeVerifier.getBytes(PVC.LIZIZ);
                o.LJIIIIZZ(bytes, "(this as java.lang.String).getBytes(charset)");
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(bytes, 0, bytes.length);
                String encodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                o.LJIIIIZZ(encodeToString, "{\n      // try to generate challenge with S256\n      val bytes: ByteArray = codeVerifier.toByteArray(Charsets.US_ASCII)\n      val messageDigest = MessageDigest.getInstance(\"SHA-256\")\n      messageDigest.update(bytes, 0, bytes.size)\n      val digest = messageDigest.digest()\n\n      Base64.encodeToString(digest, Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP)\n    }");
                return encodeToString;
            } catch (Exception e) {
                throw new Q4W(e);
            }
        }
        throw new Q4W("Invalid Code Verifier.");
    }
}
