package X;

import java.io.IOException;
import java.util.Random;

/* loaded from: classes12.dex */
public final class PVW {
    public final boolean LIZ;
    public final Random LIZIZ;
    public final PVU LIZJ;
    public final C64533PUj LIZLLL;
    public boolean LJ;
    public final C64533PUj LJFF = new C64533PUj();
    public final PVY LJI = new PVY(this);
    public boolean LJII;
    public final byte[] LJIIIIZZ;
    public final PUT LJIIIZ;

    public final void LIZ(C64537PUn c64537PUn, int i) {
        if (!this.LJ) {
            int size = c64537PUn.size();
            if (size <= 125) {
                this.LIZLLL.LJJIII(i | 128);
                if (this.LIZ) {
                    this.LIZLLL.LJJIII(size | 128);
                    this.LIZIZ.nextBytes(this.LJIIIIZZ);
                    this.LIZLLL.m27write(this.LJIIIIZZ);
                    if (size > 0) {
                        C64533PUj c64533PUj = this.LIZLLL;
                        long j = c64533PUj.LJLILLLLZI;
                        c64537PUn.write$jvm(c64533PUj);
                        this.LIZLLL.LJIIJ(this.LJIIIZ);
                        this.LJIIIZ.LIZIZ(j);
                        PUV.LIZIZ(this.LJIIIZ, this.LJIIIIZZ);
                        this.LJIIIZ.close();
                    }
                } else {
                    this.LIZLLL.LJJIII(size);
                    C64533PUj c64533PUj2 = this.LIZLLL;
                    c64533PUj2.getClass();
                    c64537PUn.write$jvm(c64533PUj2);
                }
                this.LIZJ.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    public PVW(boolean z, PVU pvu, Random random) {
        byte[] bArr;
        if (pvu != null) {
            if (random != null) {
                this.LIZ = z;
                this.LIZJ = pvu;
                this.LIZLLL = pvu.LJJIJ();
                this.LIZIZ = random;
                if (z) {
                    bArr = new byte[4];
                } else {
                    bArr = null;
                }
                this.LJIIIIZZ = bArr;
                this.LJIIIZ = z ? new PUT() : null;
                return;
            }
            throw new NullPointerException("random == null");
        }
        throw new NullPointerException("sink == null");
    }

    public final void LIZIZ(int i, long j, boolean z, boolean z2) {
        if (!this.LJ) {
            int i2 = 0;
            if (!z) {
                i = 0;
            }
            if (z2) {
                i |= 128;
            }
            this.LIZLLL.LJJIII(i);
            if (this.LIZ) {
                i2 = 128;
            }
            if (j <= 125) {
                this.LIZLLL.LJJIII(((int) j) | i2);
            } else if (j <= 65535) {
                this.LIZLLL.LJJIII(i2 | 126);
                this.LIZLLL.LJJIJIL((int) j);
            } else {
                this.LIZLLL.LJJIII(i2 | 127);
                this.LIZLLL.LJJIJIIJIL(j);
            }
            if (this.LIZ) {
                this.LIZIZ.nextBytes(this.LJIIIIZZ);
                this.LIZLLL.m27write(this.LJIIIIZZ);
                if (j > 0) {
                    C64533PUj c64533PUj = this.LIZLLL;
                    long j2 = c64533PUj.LJLILLLLZI;
                    c64533PUj.LLIIIL(this.LJFF, j);
                    this.LIZLLL.LJIIJ(this.LJIIIZ);
                    this.LJIIIZ.LIZIZ(j2);
                    PUV.LIZIZ(this.LJIIIZ, this.LJIIIIZZ);
                    this.LJIIIZ.close();
                }
            } else {
                this.LIZLLL.LLIIIL(this.LJFF, j);
            }
            this.LIZJ.LLLZIL();
            return;
        }
        throw new IOException("closed");
    }
}
