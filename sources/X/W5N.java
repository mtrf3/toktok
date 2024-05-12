package X;

/* loaded from: classes15.dex */
public final class W5N implements W6O {
    public static W5N LIZLLL;
    public boolean LIZ;
    public boolean LIZIZ;
    public String[] LIZJ;

    public static synchronized W5N LJI() {
        W5N w5n;
        synchronized (W5N.class) {
            if (LIZLLL == null) {
                LIZLLL = new W5N();
            }
            w5n = LIZLLL;
        }
        return w5n;
    }

    @Override // X.W6O
    public final C61834OOo LIZJ(W5O w5o) {
        return new C61834OOo(w5o.LIZIZ.toString(), w5o.LJIIIIZZ, w5o.LIZJ());
    }

    @Override // X.W6O
    public final C245519kJ LJ(android.net.Uri uri) {
        return new C245519kJ(LJFF(uri));
    }

    public final String LJFF(android.net.Uri uri) {
        if (this.LIZ) {
            if (uri == null) {
                return "";
            }
            if (!"http".equals(uri.getScheme()) && !"https".equals(uri.getScheme())) {
                return uri.toString();
            }
            String[] strArr = this.LIZJ;
            if (strArr == null || strArr.length <= 0) {
                return uri.toString();
            }
            String host = uri.getHost();
            if (host != null) {
                for (String str : this.LIZJ) {
                    if (str != null && host.endsWith(str)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(uri.getScheme());
                        sb.append(":");
                        if (uri.getEncodedAuthority() != null) {
                            sb.append("//");
                        }
                        String encodedPath = uri.getEncodedPath();
                        if (encodedPath != null) {
                            sb.append(encodedPath);
                        }
                        if (this.LIZIZ) {
                            return sb.toString();
                        }
                        String encodedQuery = uri.getEncodedQuery();
                        if (encodedQuery != null) {
                            sb.append("?");
                            sb.append(encodedQuery);
                        }
                        String encodedFragment = uri.getEncodedFragment();
                        if (encodedFragment != null) {
                            sb.append("#");
                            sb.append(encodedFragment);
                        }
                        return sb.toString();
                    }
                }
            }
            return uri.toString();
        }
        return uri.toString();
    }

    @Override // X.W6O
    public final C245519kJ LIZ(W5O w5o, Object obj) {
        return LJ(w5o.LIZIZ);
    }

    @Override // X.W6O
    public final V91 LIZIZ(W5O w5o, Object obj) {
        return new V91(LJFF(w5o.LIZIZ), w5o.LJIIIIZZ, w5o.LJIIIZ, w5o.LJII, null, null, obj);
    }

    @Override // X.W6O
    public final V91 LIZLLL(W5O w5o, Object obj) {
        W6U w6u;
        String str;
        VA3 va3 = w5o.LJIILLIIL;
        if (va3 != null) {
            w6u = va3.getPostprocessorCacheKey();
            str = va3.getClass().getName();
        } else {
            w6u = null;
            str = null;
        }
        return new V91(LJFF(w5o.LIZIZ), w5o.LJIIIIZZ, w5o.LJIIIZ, w5o.LJII, w6u, str, obj);
    }
}
