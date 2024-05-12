package X;

import java.util.Objects;

/* renamed from: X.Pv5, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65987Pv5 {
    public static final InterfaceC39518Ff8[] LJIIJ = new InterfaceC39518Ff8[0];
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String[] LJ;
    public final String[] LJI;
    public String[] LJII;
    public final String LJIIIZ;
    public InterfaceC39518Ff8[] LJIIIIZZ = LJIIJ;
    public final int LJFF = 0;

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.LIZ), this.LIZIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C65987Pv5.class != obj.getClass()) {
            return false;
        }
        C65987Pv5 c65987Pv5 = (C65987Pv5) obj;
        if (this.LIZ == c65987Pv5.LIZ && Objects.equals(this.LIZIZ, c65987Pv5.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C65987Pv5(int i, String str, String str2, String str3, String[] strArr, String[] strArr2, String[] strArr3, String str4) {
        this.LIZ = -1;
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = strArr;
        this.LJI = strArr2;
        this.LJII = strArr3;
        this.LJIIIZ = str4;
    }
}
