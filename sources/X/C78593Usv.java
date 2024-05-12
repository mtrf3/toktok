package X;

import java.nio.charset.StandardCharsets;

/* renamed from: X.Usv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78593Usv {
    public final String LIZ;
    public EnumC46485IMf LIZIZ;
    public C73952vH LIZJ;
    public C73952vH LIZLLL;
    public final StringBuilder LJ;
    public int LJFF;
    public int LJI;
    public C78606Ut8 LJII;
    public int LJIIIIZZ;

    public final int LIZ() {
        return this.LJ.length();
    }

    public final char LIZIZ() {
        return this.LIZ.charAt(this.LJFF);
    }

    public final boolean LIZJ() {
        if (this.LJFF < this.LIZ.length() - this.LJIIIIZZ) {
            return true;
        }
        return false;
    }

    public C78593Usv(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c != '?' || str.charAt(i) == '?') {
                sb.append(c);
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.LIZ = sb.toString();
        this.LIZIZ = EnumC46485IMf.FORCE_NONE;
        this.LJ = new StringBuilder(str.length());
        this.LJI = -1;
    }

    public final void LIZLLL(int i) {
        C78606Ut8 c78606Ut8 = this.LJII;
        if (c78606Ut8 == null || i > c78606Ut8.LIZIZ) {
            this.LJII = C78606Ut8.LJFF(i, this.LIZIZ, this.LIZJ, this.LIZLLL);
        }
    }

    public final void LJ(char c) {
        this.LJ.append(c);
    }
}
