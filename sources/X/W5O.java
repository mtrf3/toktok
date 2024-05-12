package X;

import android.text.TextUtils;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes15.dex */
public class W5O {
    public final QGT LIZ;
    public final android.net.Uri LIZIZ;
    public final int LIZJ;
    public File LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final C81810W8w LJII;
    public final C79238V7y LJIIIIZZ;
    public final V85 LJIIIZ;
    public final C81787W7z LJIIJ;
    public final W92 LJIIJJI;
    public final W50 LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public final VA3 LJIILLIIL;
    public final InterfaceC81754W6s LJIIZILJ;
    public final String LJIJ;
    public VAA LJIJI;
    public final boolean LJIJJ;
    public boolean LJIJJLI;
    public final java.util.Map<String, String> LJIL;
    public final int LJJ;
    public boolean LJJI;

    public final synchronized File LIZJ() {
        if (this.LIZLLL == null) {
            this.LIZLLL = new File(this.LIZIZ.getPath());
        }
        return this.LIZLLL;
    }

    public final boolean LIZLLL() {
        if (this.LJIILJJIL && this.LJIIIIZZ != null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        W6U w6u;
        VA3 va3 = this.LJIILLIIL;
        if (va3 != null) {
            w6u = va3.getPostprocessorCacheKey();
        } else {
            w6u = null;
        }
        return Arrays.hashCode(new Object[]{this.LIZ, this.LIZIZ, this.LIZLLL, this.LJIIJ, this.LJII, this.LJIIIIZZ, this.LJIIIZ, w6u});
    }

    public final String toString() {
        C81254Vuk LIZIZ = C81256Vum.LIZIZ(this);
        LIZIZ.LIZIZ(this.LIZIZ, "uri");
        LIZIZ.LIZIZ(this.LIZ, "cacheChoice");
        LIZIZ.LIZIZ(this.LJII, "decodeOptions");
        LIZIZ.LIZIZ(this.LJIILLIIL, "postprocessor");
        LIZIZ.LIZIZ(this.LJIIJJI, "priority");
        LIZIZ.LIZIZ(this.LJIIIIZZ, "resizeOptions");
        LIZIZ.LIZIZ(this.LJIIIZ, "rotationOptions");
        LIZIZ.LIZIZ(this.LJIIJ, "bytesRange");
        return LIZIZ.toString();
    }

    public W5O(W5P w5p) {
        String substring;
        this.LIZ = w5p.LJFF;
        android.net.Uri uri = w5p.LIZ;
        this.LIZIZ = uri;
        boolean z = false;
        int i = -1;
        if (uri != null) {
            if (C78964Uyu.LJFF(uri)) {
                i = 0;
            } else if ("file".equals(C78964Uyu.LIZIZ(uri))) {
                String path = uri.getPath();
                int lastIndexOf = path.lastIndexOf(46);
                if (lastIndexOf >= 0 && lastIndexOf != path.length() - 1 && (substring = path.substring(lastIndexOf + 1)) != null) {
                    String lowerCase = substring.toLowerCase(Locale.US);
                    String str = C81211Vu3.LIZJ.get(lowerCase);
                    str = str == null ? C81211Vu3.LIZ.getMimeTypeFromExtension(lowerCase) : str;
                    if ((str != null || (str = C81210Vu2.LIZ.get(lowerCase)) != null) && str.startsWith("video/")) {
                        i = 2;
                    }
                }
                i = 3;
            } else if (C78964Uyu.LJ(uri)) {
                TextUtils.isEmpty(null);
                i = 4;
            } else if ("asset".equals(C78964Uyu.LIZIZ(uri))) {
                i = 5;
            } else if ("res".equals(C78964Uyu.LIZIZ(uri))) {
                i = 6;
            } else if ("data".equals(C78964Uyu.LIZIZ(uri))) {
                i = 7;
            } else if ("android.resource".equals(C78964Uyu.LIZIZ(uri))) {
                i = 8;
            }
        }
        this.LIZJ = i;
        this.LJ = w5p.LJI;
        this.LJFF = w5p.LJII;
        this.LJI = w5p.LJIIIIZZ;
        this.LJII = w5p.LJ;
        this.LJIIIIZZ = w5p.LIZJ;
        V85 v85 = w5p.LIZLLL;
        this.LJIIIZ = v85 == null ? V85.LIZJ : v85;
        this.LJIIJ = w5p.LJIILL;
        this.LJIIJJI = w5p.LJIIIZ;
        this.LJIIL = w5p.LIZIZ;
        if (w5p.LJIIJJI && C78964Uyu.LJFF(w5p.LIZ)) {
            z = true;
        }
        this.LJIILIIL = z;
        this.LJIILJJIL = w5p.LJIIL;
        this.LJIILL = w5p.LJIILIIL;
        this.LJIILLIIL = w5p.LJIIJ;
        this.LJIIZILJ = w5p.LJIILJJIL;
        this.LJIJ = w5p.LJIILLIIL;
        this.LJIJJ = w5p.LJIJ;
        w5p.getClass();
        this.LJIL = null;
        this.LJJ = w5p.LJIIZILJ;
    }

    public static W5O LIZ(android.net.Uri uri) {
        if (uri == null) {
            return null;
        }
        return W5P.LIZLLL(uri).LIZ();
    }

    public static W5O LIZIZ(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return LIZ(android.net.Uri.parse(str));
    }

    public final boolean equals(Object obj) {
        W6U w6u;
        if (!(obj instanceof W5O)) {
            return false;
        }
        W5O w5o = (W5O) obj;
        if (!C81256Vum.LIZ(this.LIZIZ, w5o.LIZIZ) || !C81256Vum.LIZ(this.LIZ, w5o.LIZ) || !C81256Vum.LIZ(this.LIZLLL, w5o.LIZLLL) || !C81256Vum.LIZ(this.LJIIJ, w5o.LJIIJ) || !C81256Vum.LIZ(this.LJII, w5o.LJII) || !C81256Vum.LIZ(this.LJIIIIZZ, w5o.LJIIIIZZ) || !C81256Vum.LIZ(this.LJIIIZ, w5o.LJIIIZ)) {
            return false;
        }
        VA3 va3 = this.LJIILLIIL;
        W6U w6u2 = null;
        if (va3 != null) {
            w6u = va3.getPostprocessorCacheKey();
        } else {
            w6u = null;
        }
        VA3 va32 = w5o.LJIILLIIL;
        if (va32 != null) {
            w6u2 = va32.getPostprocessorCacheKey();
        }
        return C81256Vum.LIZ(w6u, w6u2);
    }
}
