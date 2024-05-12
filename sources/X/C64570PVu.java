package X;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.PVu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64570PVu implements Closeable {
    public static final Logger LJLJL = Logger.getLogger(PPI.class.getName());
    public final PVU LJLIL;
    public final boolean LJLILLLLZI;
    public final C64533PUj LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;
    public final C64571PVv LJLJJLL;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.LJLJJL = true;
        this.LJLIL.close();
    }

    public final synchronized void flush() {
        if (!this.LJLJJL) {
            this.LJLIL.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void LIZ(C64579PWd c64579PWd) {
        int i;
        int i2;
        if (!this.LJLJJL) {
            int i3 = this.LJLJJI;
            int i4 = c64579PWd.LIZ;
            if ((i4 & 32) != 0) {
                i3 = c64579PWd.LIZIZ[5];
            }
            this.LJLJJI = i3;
            if ((i4 & 2) != 0) {
                i = c64579PWd.LIZIZ[1];
            } else {
                i = -1;
            }
            if (i != -1) {
                C64571PVv c64571PVv = this.LJLJJLL;
                if ((i4 & 2) != 0) {
                    i2 = c64579PWd.LIZIZ[1];
                } else {
                    i2 = -1;
                }
                c64571PVv.getClass();
                int min = Math.min(i2, 16384);
                int i5 = c64571PVv.LIZLLL;
                if (i5 != min) {
                    if (min < i5) {
                        c64571PVv.LIZIZ = Math.min(c64571PVv.LIZIZ, min);
                    }
                    c64571PVv.LIZJ = true;
                    c64571PVv.LIZLLL = min;
                    int i6 = c64571PVv.LJII;
                    if (min < i6) {
                        if (min == 0) {
                            Arrays.fill(c64571PVv.LJ, (Object) null);
                            c64571PVv.LJFF = c64571PVv.LJ.length - 1;
                            c64571PVv.LJI = 0;
                            c64571PVv.LJII = 0;
                        } else {
                            c64571PVv.LIZ(i6 - min);
                        }
                    }
                }
            }
            LIZJ(0, 0, (byte) 4, (byte) 1);
            this.LJLIL.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void LJIIJ(C64579PWd c64579PWd) {
        int i;
        if (!this.LJLJJL) {
            LIZJ(0, Integer.bitCount(c64579PWd.LIZ) * 6, (byte) 4, (byte) 0);
            int i2 = 0;
            do {
                if (((1 << i2) & c64579PWd.LIZ) != 0) {
                    if (i2 == 4) {
                        i = 3;
                    } else if (i2 == 7) {
                        i = 4;
                    } else {
                        i = i2;
                    }
                    this.LJLIL.writeShort(i);
                    this.LJLIL.writeInt(c64579PWd.LIZIZ[i2]);
                }
                i2++;
            } while (i2 < 10);
            this.LJLIL.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public C64570PVu(PVU pvu, boolean z) {
        this.LJLIL = pvu;
        this.LJLILLLLZI = z;
        C64533PUj c64533PUj = new C64533PUj();
        this.LJLJI = c64533PUj;
        this.LJLJJLL = new C64571PVv(c64533PUj);
        this.LJLJJI = 16384;
    }

    public final synchronized void LJI(int i, PWT pwt) {
        if (!this.LJLJJL) {
            if (pwt.httpCode != -1) {
                LIZJ(i, 4, (byte) 3, (byte) 0);
                this.LJLIL.writeInt(pwt.httpCode);
                this.LJLIL.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void LJIIL(int i, long j) {
        if (!this.LJLJJL) {
            if (j != 0 && j <= 2147483647L) {
                LIZJ(i, 4, (byte) 8, (byte) 0);
                this.LJLIL.writeInt((int) j);
                this.LJLIL.flush();
            } else {
                throw new IllegalArgumentException(PVA.LJIIJJI("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j)));
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void LJIILIIL(int i, long j) {
        byte b;
        while (j > 0) {
            int min = (int) Math.min(this.LJLJJI, j);
            long j2 = min;
            j -= j2;
            if (j == 0) {
                b = 4;
            } else {
                b = 0;
            }
            LIZJ(i, min, (byte) 9, b);
            this.LJLIL.LLIIIL(this.LJLJI, j2);
        }
    }

    public final synchronized void LIZLLL(int i, PWT pwt, byte[] bArr) {
        if (!this.LJLJJL) {
            if (pwt.httpCode != -1) {
                LIZJ(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.LJLIL.writeInt(i);
                this.LJLIL.writeInt(pwt.httpCode);
                if (bArr.length > 0) {
                    this.LJLIL.write(bArr);
                }
                this.LJLIL.flush();
            } else {
                throw new IllegalArgumentException(PVA.LJIIJJI("errorCode.httpCode == -1", new Object[0]));
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void LJ(int i, boolean z, List list) {
        byte b;
        if (!this.LJLJJL) {
            this.LJLJJLL.LIZLLL(list);
            long j = this.LJLJI.LJLILLLLZI;
            int min = (int) Math.min(this.LJLJJI, j);
            long j2 = min;
            if (j == j2) {
                b = 4;
            } else {
                b = 0;
            }
            if (z) {
                b = (byte) (b | 1);
            }
            LIZJ(i, min, (byte) 1, b);
            this.LJLIL.LLIIIL(this.LJLJI, j2);
            if (j > j2) {
                LJIILIIL(i, j - j2);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public final synchronized void LJFF(int i, int i2, boolean z) {
        byte b;
        if (!this.LJLJJL) {
            if (z) {
                b = 1;
            } else {
                b = 0;
            }
            LIZJ(0, 8, (byte) 6, b);
            this.LJLIL.writeInt(i);
            this.LJLIL.writeInt(i2);
            this.LJLIL.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void LJIIJJI(List list, int i, boolean z) {
        if (!this.LJLJJL) {
            LJ(i, z, list);
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void LIZIZ(boolean z, int i, C64533PUj c64533PUj, int i2) {
        byte b;
        if (!this.LJLJJL) {
            if (z) {
                b = (byte) 1;
            } else {
                b = 0;
            }
            LIZJ(i, i2, (byte) 0, b);
            if (i2 > 0) {
                this.LJLIL.LLIIIL(c64533PUj, i2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void LIZJ(int i, int i2, byte b, byte b2) {
        Logger logger = LJLJL;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(PPI.LIZ(false, i, i2, b, b2));
        }
        int i3 = this.LJLJJI;
        if (i2 <= i3) {
            if ((Integer.MIN_VALUE & i) == 0) {
                PVU pvu = this.LJLIL;
                pvu.writeByte((i2 >>> 16) & 255);
                pvu.writeByte((i2 >>> 8) & 255);
                pvu.writeByte(i2 & 255);
                this.LJLIL.writeByte(b & 255);
                this.LJLIL.writeByte(b2 & 255);
                this.LJLIL.writeInt(i & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(PVA.LJIIJJI("reserved bit set: %s", Integer.valueOf(i)));
        }
        throw new IllegalArgumentException(PVA.LJIIJJI("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2)));
    }
}
