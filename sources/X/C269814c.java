package X;

import defpackage.b1;

/* renamed from: X.14c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C269814c implements Comparable {
    public C270014e LJLIL;
    public final /* synthetic */ C44651p7 LJLILLLLZI;

    public final String toString() {
        String str = "[ ";
        if (this.LJLIL != null) {
            int i = 0;
            do {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append(this.LJLIL.LJIIIIZZ[i]);
                LIZ.append(" ");
                str = X1D.LIZIZ(LIZ);
                i++;
            } while (i < 9);
        }
        StringBuilder LIZJ = b1.LIZJ(str, "] ");
        LIZJ.append(this.LJLIL);
        return X1D.LIZIZ(LIZJ);
    }

    public C269814c(C44651p7 c44651p7) {
        this.LJLILLLLZI = c44651p7;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.LJLIL.LIZJ - ((C270014e) obj).LIZJ;
    }
}
