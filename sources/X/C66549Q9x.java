package X;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.Q9x, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66549Q9x {
    public C66540Q9o LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public android.net.Uri LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public java.util.Map<String, String> LJIILIIL = new HashMap();

    public final C66544Q9s LIZ() {
        return new C66544Q9s(this.LIZ, this.LIZIZ, this.LJFF, this.LJI, this.LIZJ, this.LIZLLL, this.LJ, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, Collections.unmodifiableMap(new HashMap(this.LJIILIIL)));
    }

    public final void LIZIZ(String str, String str2, String str3) {
        boolean z;
        if (str != null) {
            C63927P7b.LIZ(str);
            T2R.LJIILL("code verifier challenge cannot be null or empty if verifier is set", str2);
            T2R.LJIILL("code verifier challenge method cannot be null or empty if verifier is set", str3);
        } else {
            boolean z2 = false;
            if (str2 == null) {
                z = true;
            } else {
                z = false;
            }
            T2R.LJIILJJIL("code verifier challenge must be null if verifier is null", z);
            if (str3 == null) {
                z2 = true;
            }
            T2R.LJIILJJIL("code verifier challenge method must be null if verifier is null", z2);
        }
        this.LJIIIZ = str;
        this.LJIIJ = str2;
        this.LJIIJJI = str3;
    }

    public C66549Q9x(C66540Q9o c66540Q9o, String str, String str2, android.net.Uri uri) {
        String str3;
        T2R.LJIILLIIL(c66540Q9o, "configuration cannot be null");
        this.LIZ = c66540Q9o;
        T2R.LJIILL("client ID cannot be null or empty", str);
        this.LIZIZ = str;
        T2R.LJIILL("expected response type cannot be null or empty", str2);
        this.LJFF = str2;
        T2R.LJIILLIIL(uri, "redirect URI cannot be null or empty");
        this.LJI = uri;
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        String encodeToString = Base64.encodeToString(bArr, 11);
        if (encodeToString != null) {
            T2R.LJIILL("state cannot be empty if defined", encodeToString);
        }
        this.LJIIIIZZ = encodeToString;
        byte[] bArr2 = new byte[64];
        new SecureRandom().nextBytes(bArr2);
        String encodeToString2 = Base64.encodeToString(bArr2, 11);
        if (encodeToString2 != null) {
            C63927P7b.LIZ(encodeToString2);
            this.LJIIIZ = encodeToString2;
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(encodeToString2.getBytes("ISO_8859_1"));
                encodeToString2 = Base64.encodeToString(messageDigest.digest(), 11);
            } catch (UnsupportedEncodingException e) {
                Q6T.LIZIZ().LIZJ(6, "ISO-8859-1 encoding not supported on this device!", null, e);
                throw new IllegalStateException("ISO-8859-1 encoding not supported", e);
            } catch (NoSuchAlgorithmException e2) {
                Q6T.LIZLLL("SHA-256 is not supported on this device! Using plain challenge", e2);
            }
            this.LJIIJ = encodeToString2;
            try {
                MessageDigest.getInstance("SHA-256");
                str3 = "S256";
            } catch (NoSuchAlgorithmException unused) {
                str3 = "plain";
            }
            this.LJIIJJI = str3;
            return;
        }
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIIJJI = null;
    }
}
