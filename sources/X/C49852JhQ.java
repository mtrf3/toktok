package X;

import defpackage.a1;
import defpackage.q;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.JhQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49852JhQ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C49847JhL stream, String str) {
        String str2;
        String str3;
        C49849JhN c49849JhN;
        o.LJIIIZ(stream, "stream");
        C49849JhN c49849JhN2 = stream.LIZ;
        String str4 = stream.LIZJ;
        C49848JhM c49848JhM = stream.LJ;
        if (c49848JhM != null && (c49849JhN = c49848JhM.LIZJ) != null) {
            c49849JhN.LJIL();
            str2 = c49849JhN.LJIIIIZZ;
        } else {
            str2 = null;
        }
        String LJ = a1.LJ("Stream State when ", str, ": \r\n ... \r\n");
        int i = 0;
        int i2 = 0;
        while (c49849JhN2 != null) {
            i++;
            if (!c49849JhN2.LIZJ) {
                c49849JhN2 = c49849JhN2.LIZLLL;
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LJ);
                LIZ2.append("id: ");
                c49849JhN2.LJIL();
                String LIZIZ = q.LIZIZ(LIZ2, c49849JhN2.LJIIIIZZ, ' ', LIZ2);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(LIZIZ);
                LIZ3.append("inner: [");
                String LIZIZ2 = X1D.LIZIZ(LIZ3);
                c49849JhN2.LJIL();
                Iterator it = ((ArrayList) c49849JhN2.LJIIJ).iterator();
                while (it.hasNext()) {
                    C49848JhM c49848JhM2 = (C49848JhM) it.next();
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(LIZIZ2);
                    LIZIZ2 = q.LIZIZ(LIZ4, c49848JhM2.LIZ, ' ', LIZ4);
                    i2++;
                }
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(LIZIZ2);
                c49849JhN2.LJIL();
                if (o.LJ(str2, c49849JhN2.LJIIIIZZ)) {
                    str3 = "] <--- backCursor \r\n";
                } else {
                    c49849JhN2.LJIL();
                    if (o.LJ(str4, c49849JhN2.LJIIIIZZ)) {
                        str3 = "] <--- entryCursor \r\n";
                    } else {
                        str3 = "]\r\n";
                    }
                }
                LIZ5.append(str3);
                LJ = X1D.LIZIZ(LIZ5);
                c49849JhN2 = c49849JhN2.LIZLLL;
            }
        }
        String LIZIZ3 = YE1.LIZIZ(LJ, "out count: ", i);
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append(LIZIZ3);
        LIZ6.append("expanded inner count: ");
        LIZ6.append(i2);
        X1D.LIZIZ(LIZ6);
    }

    public static void LIZIZ(C49847JhL stream, String str) {
        C49849JhN c49849JhN;
        String str2;
        C49848JhM LJIJI;
        o.LJIIIZ(stream, "stream");
        C49848JhM c49848JhM = stream.LJ;
        String str3 = null;
        if (c49848JhM != null && (LJIJI = c49848JhM.LJIJI()) != null) {
            c49849JhN = LJIJI.LIZJ;
            if (c49849JhN != null) {
                c49849JhN.LJIL();
                str3 = c49849JhN.LJIIIIZZ;
            }
        } else {
            c49849JhN = null;
        }
        String LJ = a1.LJ("Stream inner when ", str, ": \r\n ... \r\n");
        while (c49849JhN != null && c49849JhN.LJ != null) {
            c49849JhN = c49849JhN.LJ;
        }
        int i = 0;
        int i2 = 0;
        while (c49849JhN != null) {
            i++;
            if (!c49849JhN.LIZJ) {
                c49849JhN = c49849JhN.LIZLLL;
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LJ);
                LIZ2.append("id: ");
                c49849JhN.LJIL();
                String LIZIZ = q.LIZIZ(LIZ2, c49849JhN.LJIIIIZZ, ' ', LIZ2);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(LIZIZ);
                LIZ3.append("inner: [");
                String LIZIZ2 = X1D.LIZIZ(LIZ3);
                c49849JhN.LJIL();
                Iterator it = ((ArrayList) c49849JhN.LJIIJ).iterator();
                while (it.hasNext()) {
                    C49848JhM c49848JhM2 = (C49848JhM) it.next();
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(LIZIZ2);
                    LIZIZ2 = q.LIZIZ(LIZ4, c49848JhM2.LIZ, ' ', LIZ4);
                    i2++;
                }
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(LIZIZ2);
                c49849JhN.LJIL();
                if (o.LJ(c49849JhN.LJIIIIZZ, str3)) {
                    str2 = "] <--- CurrentCursor \r\n";
                } else {
                    str2 = "]\r\n";
                }
                LIZ5.append(str2);
                LJ = X1D.LIZIZ(LIZ5);
                c49849JhN = c49849JhN.LIZLLL;
            }
        }
        String LIZIZ3 = YE1.LIZIZ(LJ, "out count: ", i);
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append(LIZIZ3);
        LIZ6.append("expanded inner count: ");
        LIZ6.append(i2);
        X1D.LIZIZ(LIZ6);
    }
}
