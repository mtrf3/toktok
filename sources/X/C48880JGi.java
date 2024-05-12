package X;

import android.text.TextUtils;
import defpackage.a1;

/* renamed from: X.JGi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48880JGi {
    public int LIZ;
    public final OUP LIZIZ;
    public boolean LIZLLL;
    public InterfaceC46330IGg LJFF;
    public int LJI;
    public final String LJIIIIZZ;
    public long LIZJ = -1;
    public int LJ = -1;
    public boolean LJII = false;

    public final int hashCode() {
        return this.LJIIIIZZ.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj || ((obj instanceof C48880JGi) && TextUtils.equals(this.LJIIIIZZ, ((C48880JGi) obj).LJIIIIZZ))) {
            return true;
        }
        return false;
    }

    public C48880JGi(OUP oup, String str) {
        this.LIZIZ = new OUP();
        this.LIZIZ = oup;
        this.LJIIIIZZ = str;
    }

    public static String LIZ(String str, String str2) {
        return a1.LJ(str, "_", str2);
    }
}
