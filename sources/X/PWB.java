package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class PWB {
    public final C64532PUi LIZIZ;
    public final List<PWL> LIZ = new ArrayList();
    public PWL[] LJ = new PWL[8];
    public int LJFF = 7;
    public int LJI = 0;
    public int LJII = 0;
    public final int LIZJ = 4096;
    public int LIZLLL = 4096;

    public final C64537PUn LIZLLL() {
        boolean z;
        int readByte = this.LIZIZ.readByte() & 255;
        if ((readByte & 128) == 128) {
            z = true;
        } else {
            z = false;
        }
        int LJ = LJ(readByte, 127);
        if (z) {
            PWZ pwz = PWZ.LIZLLL;
            C64532PUi c64532PUi = this.LIZIZ;
            long j = LJ;
            c64532PUi.a(j);
            byte[] LJIIJJI = c64532PUi.LJLILLLLZI.LJIIJJI(j);
            pwz.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C64578PWc c64578PWc = pwz.LIZ;
            int i = 0;
            int i2 = 0;
            for (byte b : LJIIJJI) {
                i = (i << 8) | (b & 255);
                i2 += 8;
                while (i2 >= 8) {
                    int i3 = i2 - 8;
                    c64578PWc = c64578PWc.LIZ[(i >>> i3) & 255];
                    if (c64578PWc.LIZ == null) {
                        byteArrayOutputStream.write(c64578PWc.LIZIZ);
                        i2 -= c64578PWc.LIZJ;
                        c64578PWc = pwz.LIZ;
                    } else {
                        i2 = i3;
                    }
                }
            }
            while (i2 > 0) {
                C64578PWc c64578PWc2 = c64578PWc.LIZ[(i << (8 - i2)) & 255];
                if (c64578PWc2.LIZ != null || c64578PWc2.LIZJ > i2) {
                    break;
                }
                byteArrayOutputStream.write(c64578PWc2.LIZIZ);
                i2 -= c64578PWc2.LIZJ;
                c64578PWc = pwz.LIZ;
            }
            return C64537PUn.of(byteArrayOutputStream.toByteArray());
        }
        return this.LIZIZ.LJLIIIL(LJ);
    }

    public PWB(PW4 pw4) {
        this.LIZIZ = PU7.LIZ(pw4);
    }

    public final int LIZ(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.LJ.length - 1;
            while (true) {
                i2 = this.LJFF;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.LJ[length].LIZJ;
                i -= i4;
                this.LJII -= i4;
                this.LJI--;
                i3++;
                length--;
            }
            PWL[] pwlArr = this.LJ;
            System.arraycopy(pwlArr, i2 + 1, pwlArr, i2 + 1 + i3, this.LJI);
            this.LJFF += i3;
        }
        return i3;
    }

    public final C64537PUn LIZIZ(int i) {
        if (i >= 0 && i <= PWM.LIZ.length - 1) {
            return PWM.LIZ[i].LIZ;
        }
        int length = this.LJFF + 1 + (i - PWM.LIZ.length);
        if (length >= 0) {
            PWL[] pwlArr = this.LJ;
            if (length < pwlArr.length) {
                return pwlArr[length].LIZ;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Header index too large ");
        LIZ.append(i + 1);
        throw new IOException(X1D.LIZIZ(LIZ));
    }

    public final void LIZJ(PWL pwl) {
        ((ArrayList) this.LIZ).add(pwl);
        int i = pwl.LIZJ;
        int i2 = this.LIZLLL;
        if (i > i2) {
            Arrays.fill(this.LJ, (Object) null);
            this.LJFF = this.LJ.length - 1;
            this.LJI = 0;
            this.LJII = 0;
            return;
        }
        LIZ((this.LJII + i) - i2);
        int i3 = this.LJI + 1;
        PWL[] pwlArr = this.LJ;
        if (i3 > pwlArr.length) {
            PWL[] pwlArr2 = new PWL[pwlArr.length * 2];
            System.arraycopy(pwlArr, 0, pwlArr2, pwlArr.length, pwlArr.length);
            this.LJFF = this.LJ.length - 1;
            this.LJ = pwlArr2;
        }
        int i4 = this.LJFF;
        this.LJFF = i4 - 1;
        this.LJ[i4] = pwl;
        this.LJI++;
        this.LJII += i;
    }

    public final int LJ(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            int readByte = this.LIZIZ.readByte() & 255;
            if ((readByte & 128) != 0) {
                i2 += (readByte & 127) << i4;
                i4 += 7;
            } else {
                return i2 + (readByte << i4);
            }
        }
    }
}
