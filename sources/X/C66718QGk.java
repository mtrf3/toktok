package X;

import android.content.SharedPreferences;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: X.QGk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66718QGk {
    public static final String[] LIZJ = {"*", "FCM", "GCM", ""};
    public final SharedPreferences LIZ;
    public final String LIZIZ;

    public final String LIZ() {
        String string;
        synchronized (this.LIZ) {
            string = this.LIZ.getString("|S|id", null);
        }
        return string;
    }

    public final String LIZIZ() {
        PublicKey publicKey;
        synchronized (this.LIZ) {
            String str = null;
            String string = this.LIZ.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused) {
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused2) {
            }
            return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r2.isEmpty() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C66718QGk(X.C67195QYt r5) {
        /*
            r4 = this;
            r4.<init>()
            r5.LIZ()
            android.content.Context r2 = r5.LIZ
            java.lang.String r1 = "com.google.android.gms.appid"
            r0 = 0
            android.content.SharedPreferences r0 = X.F9J.LIZIZ(r2, r0, r1)
            r4.LIZ = r0
            r5.LIZ()
            X.QH4 r0 = r5.LIZJ
            java.lang.String r2 = r0.LJ
            if (r2 == 0) goto L1d
        L1a:
            r4.LIZIZ = r2
            return
        L1d:
            r5.LIZ()
            X.QH4 r0 = r5.LIZJ
            java.lang.String r2 = r0.LIZIZ
            java.lang.String r0 = "1:"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L35
            java.lang.String r0 = "2:"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L35
            goto L1a
        L35:
            java.lang.String r0 = ":"
            java.lang.String[] r3 = r2.split(r0)
            int r2 = r3.length
            r0 = 4
            r1 = 0
            if (r2 == r0) goto L42
        L40:
            r2 = r1
            goto L1a
        L42:
            r0 = 1
            r2 = r3[r0]
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L1a
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66718QGk.<init>(X.QYt):void");
    }
}
