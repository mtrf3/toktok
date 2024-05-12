package X;

import com.facebook.common.time.RealtimeSinceBootClock;

/* loaded from: classes14.dex */
public final class V91 implements W6U {
    public final String LIZ;
    public final C79238V7y LIZIZ;
    public final V85 LIZJ;
    public final C81810W8w LIZLLL;
    public final W6U LJ;
    public final String LJFF;
    public final int LJI;
    public final Object LJII;

    @Override // X.W6U
    public final String toString() {
        return C16880lQ.LLLZI(null, "%s_%s_%s_%s_%s_%s_%d", new Object[]{this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, Integer.valueOf(this.LJI)});
    }

    @Override // X.W6U
    public final String LIZ() {
        return this.LIZ;
    }

    @Override // X.W6U
    public final int hashCode() {
        return this.LJI;
    }

    @Override // X.W6U
    public final boolean LIZIZ(android.net.Uri uri) {
        return this.LIZ.contains(uri.toString());
    }

    @Override // X.W6U
    public final boolean equals(Object obj) {
        if (!(obj instanceof V91)) {
            return false;
        }
        V91 v91 = (V91) obj;
        if (this.LJI != v91.LJI || !this.LIZ.equals(v91.LIZ) || !C81256Vum.LIZ(this.LIZIZ, v91.LIZIZ) || !C81256Vum.LIZ(this.LIZJ, v91.LIZJ) || !C81256Vum.LIZ(this.LIZLLL, v91.LIZLLL) || !C81256Vum.LIZ(this.LJ, v91.LJ) || !C81256Vum.LIZ(this.LJFF, v91.LJFF)) {
            return false;
        }
        return true;
    }

    public V91(String str, C79238V7y c79238V7y, V85 v85, C81810W8w c81810W8w, W6U w6u, String str2, Object obj) {
        int i;
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        str.getClass();
        this.LIZ = str;
        this.LIZIZ = c79238V7y;
        this.LIZJ = v85;
        this.LIZLLL = c81810W8w;
        this.LJ = w6u;
        this.LJFF = str2;
        Integer valueOf = Integer.valueOf(str.hashCode());
        if (c79238V7y != null) {
            i = c79238V7y.hashCode();
        } else {
            i = 0;
        }
        Integer valueOf2 = Integer.valueOf(i);
        Integer valueOf3 = Integer.valueOf(v85.hashCode());
        if (valueOf == null) {
            hashCode = 0;
        } else {
            hashCode = valueOf.hashCode();
        }
        if (valueOf2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = valueOf2.hashCode();
        }
        if (valueOf3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = valueOf3.hashCode();
        }
        if (c81810W8w == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c81810W8w.hashCode();
        }
        if (w6u == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = w6u.hashCode();
        }
        this.LJI = ((((((((((hashCode + 31) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
        this.LJII = obj;
        RealtimeSinceBootClock.get().now();
    }
}
