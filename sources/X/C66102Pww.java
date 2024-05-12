package X;

import java.io.BufferedInputStream;

/* renamed from: X.Pww, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66102Pww {
    public final BufferedInputStream LIZ;
    public final StringBuilder LIZIZ = new StringBuilder();
    public final C66109Px3 LIZJ = new C66109Px3();

    public final String LIZ() {
        while (true) {
            int read = this.LIZ.read();
            if (read < 0) {
                return null;
            }
            char c = (char) read;
            C66109Px3 c66109Px3 = this.LIZJ;
            int i = c66109Px3.LIZ;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (c == '\r') {
                            c66109Px3.LIZ = 2;
                        } else {
                            c66109Px3.LIZ = 1;
                        }
                    } else {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Unknown state: ");
                        LIZ.append(c66109Px3.LIZ);
                        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
                    }
                } else if (c == '\n') {
                    c66109Px3.LIZ = 3;
                } else {
                    c66109Px3.LIZ = 1;
                }
            } else if (c == '\r') {
                c66109Px3.LIZ = 2;
            }
            int i2 = c66109Px3.LIZ;
            if (i2 != 1) {
                if (i2 == 3) {
                    String sb = this.LIZIZ.toString();
                    this.LIZIZ.setLength(0);
                    return sb;
                }
            } else {
                this.LIZIZ.append(c);
            }
        }
    }

    public C66102Pww(C66103Pwx c66103Pwx) {
        this.LIZ = c66103Pwx;
    }
}
