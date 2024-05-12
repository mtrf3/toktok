package X;

import java.util.Collections;
import java.util.LinkedHashMap;

/* loaded from: classes12.dex */
public final class QA0 {
    public C66540Q9o LIZ;
    public String LIZIZ;
    public String LIZJ;
    public android.net.Uri LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public java.util.Map<String, String> LJIIIIZZ;

    public final C65474Pmo LIZ() {
        String str = this.LIZJ;
        if (str == null) {
            if (this.LJFF != null) {
                str = "authorization_code";
            } else if (this.LJI != null) {
                str = "refresh_token";
            } else {
                throw new IllegalStateException("grant type not specified and cannot be inferred");
            }
        }
        if ("authorization_code".equals(str)) {
            T2R.LJIILLIIL(this.LJFF, "authorization code must be specified for grant_type = authorization_code");
        }
        if ("refresh_token".equals(str)) {
            T2R.LJIILLIIL(this.LJI, "refresh token must be specified for grant_type = refresh_token");
        }
        if (!str.equals("authorization_code") || this.LIZLLL != null) {
            return new C65474Pmo(this.LIZ, this.LIZIZ, str, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, Collections.unmodifiableMap(this.LJIIIIZZ));
        }
        throw new IllegalStateException("no redirect URI specified on token request for code exchange");
    }

    public QA0(C66540Q9o c66540Q9o, String str) {
        c66540Q9o.getClass();
        this.LIZ = c66540Q9o;
        T2R.LJIILL("clientId cannot be null or empty", str);
        this.LIZIZ = str;
        this.LJIIIIZZ = new LinkedHashMap();
    }
}
