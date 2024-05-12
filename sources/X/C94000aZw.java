package X;

import android.app.Activity;
import com.spotify.sdk.android.auth.AuthorizationRequest;

/* renamed from: X.aZw, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94000aZw {
    public static final String[] LIZJ = {".debug", ".canary", ".partners", ""};
    public static final String[] LIZLLL = {"25a9b2d2745c098361edaa3b87936dc29a28e7f1", "80abdd17dcc4cb3a33815d354355bf87c9378624", "88df4d670ed5e01fc7b3eff13b63258628ff5a00", "d834ae340d1e854c5f4092722f9788216d9221e5", "1cbedd9e7345f64649bad2b493a20d9eea955352", "4b3d76a2de89033ea830f476a1f815692938e33b"};
    public final Activity LIZ;
    public final AuthorizationRequest LIZIZ;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        r5 = r5 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(X.C93999aZv r8, android.content.pm.Signature[] r9) {
        /*
            r7 = 0
            if (r9 == 0) goto L6
            int r0 = r9.length
            if (r0 != 0) goto L7
        L6:
            return r7
        L7:
            int r6 = r9.length
            r5 = 0
        L9:
            r0 = 1
            if (r5 >= r6) goto L44
            r0 = r9[r5]
            java.lang.String r1 = r0.toCharsString()
            r8.getClass()
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "UTF-8"
            byte[] r1 = r1.getBytes(r0)     // Catch: java.lang.Throwable -> L2e
            int r0 = r1.length     // Catch: java.lang.Throwable -> L2e
            r2.update(r1, r7, r0)     // Catch: java.lang.Throwable -> L2e
            byte[] r0 = r2.digest()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r8.LIZ(r0)     // Catch: java.lang.Throwable -> L2e
            goto L2f
        L2e:
            r4 = 0
        L2f:
            java.lang.String[] r3 = X.C94000aZw.LIZLLL
            int r2 = r3.length
            r1 = 0
        L33:
            if (r1 >= r2) goto L43
            r0 = r3[r1]
            boolean r0 = r0.equalsIgnoreCase(r4)
            if (r0 == 0) goto L40
            int r5 = r5 + 1
            goto L9
        L40:
            int r1 = r1 + 1
            goto L33
        L43:
            return r7
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94000aZw.LIZ(X.aZv, android.content.pm.Signature[]):boolean");
    }

    public C94000aZw(Activity activity, AuthorizationRequest authorizationRequest, C93999aZv c93999aZv) {
        this.LIZ = activity;
        this.LIZIZ = authorizationRequest;
    }
}
