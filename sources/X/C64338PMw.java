package X;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.PMw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64338PMw {
    public final LinkedList<C64339PMx> LIZ = new LinkedList<>();
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;

    public final String toString() {
        String LIZIZ;
        String LIZIZ2;
        int i = this.LIZLLL;
        if (i == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZIZ = C08380Uo.LIZ(LIZ, this.LIZIZ, ",0", LIZ);
        } else if (i == 1) {
            LIZIZ = Integer.toString(this.LIZIZ + 1);
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this.LIZIZ + 1);
            LIZ2.append(",");
            LIZ2.append(this.LIZLLL);
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        int i2 = this.LJ;
        if (i2 == 0) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZIZ2 = C08380Uo.LIZ(LIZ3, this.LIZJ, ",0", LIZ3);
        } else if (i2 == 1) {
            LIZIZ2 = Integer.toString(this.LIZJ + 1);
        } else {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(this.LIZJ + 1);
            LIZ4.append(",");
            LIZ4.append(this.LJ);
            LIZIZ2 = X1D.LIZIZ(LIZ4);
        }
        StringBuilder sb = new StringBuilder("@@ -");
        sb.append(LIZIZ);
        sb.append(" +");
        sb.append(LIZIZ2);
        sb.append(" @@\n");
        Iterator<C64339PMx> it = this.LIZ.iterator();
        while (it.hasNext()) {
            C64339PMx next = it.next();
            int i3 = C64340PMy.LIZ[next.LIZ.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        sb.append(' ');
                    }
                } else {
                    sb.append('-');
                }
            } else {
                sb.append('+');
            }
            try {
                sb.append(URLEncoder.encode(next.LIZIZ, "UTF-8").replace('+', ' '));
                sb.append("\n");
            } catch (UnsupportedEncodingException e) {
                throw new Error("This system does not support UTF-8.", e);
            }
        }
        return sb.toString().replace("%21", "!").replace("%7E", "~").replace("%27", "'").replace("%28", "(").replace("%29", ")").replace("%3B", ";").replace("%2F", "/").replace("%3F", "?").replace("%3A", ":").replace("%40", "@").replace("%26", "&").replace("%3D", "=").replace("%2B", "+").replace("%24", "$").replace("%2C", ",").replace("%23", "#");
    }
}
