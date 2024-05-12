package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public final class PXK {
    public final boolean LIZ;
    public final PW3 LIZIZ;
    public final PXV LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public long LJFF;
    public boolean LJI;
    public boolean LJII;
    public final C64533PUj LJIIIIZZ = new C64533PUj();
    public final C64533PUj LJIIIZ = new C64533PUj();
    public final byte[] LJIIJ;
    public final PUT LJIIJJI;

    public final void LIZ() {
        short s;
        long j = this.LJFF;
        if (j > 0) {
            this.LIZIZ.LLFZ(this.LJIIIIZZ, j);
            if (!this.LIZ) {
                this.LJIIIIZZ.LJIIJ(this.LJIIJJI);
                this.LJIIJJI.LIZIZ(0L);
                PUW.LIZIZ(this.LJIIJJI, this.LJIIJ);
                this.LJIIJJI.close();
            }
        }
        switch (this.LJ) {
            case 8:
                String str = "";
                C64533PUj c64533PUj = this.LJIIIIZZ;
                long j2 = c64533PUj.LJLILLLLZI;
                if (j2 != 1) {
                    if (j2 != 0) {
                        s = c64533PUj.readShort();
                        str = this.LJIIIIZZ.LJIILL();
                        String LIZ = PUW.LIZ(s);
                        if (LIZ != null) {
                            throw new ProtocolException(LIZ);
                        }
                    } else {
                        s = 1005;
                    }
                    ((PXH) this.LIZJ).LJI(s, str);
                    this.LIZLLL = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                PXV pxv = this.LIZJ;
                C64537PUn LJIIL = this.LJIIIIZZ.LJIIL();
                PXH pxh = (PXH) pxv;
                synchronized (pxh) {
                    if (!pxh.LJIJ && (!pxh.LJIILJJIL || !pxh.LJIIL.isEmpty())) {
                        pxh.LJIIJJI.add(LJIIL);
                        PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor = pxh.LJIIIZ;
                        if (pThreadScheduledThreadPoolExecutor != null) {
                            pThreadScheduledThreadPoolExecutor.execute(pxh.LJI);
                        }
                        return;
                    }
                    return;
                }
            case 10:
                ((PXH) this.LIZJ).LJII(this.LJIIIIZZ.LJIIL());
                return;
            default:
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Unknown control opcode: ");
                LIZ2.append(Integer.toHexString(this.LJ));
                throw new ProtocolException(X1D.LIZIZ(LIZ2));
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void LIZIZ() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        if (!this.LIZLLL) {
            long LJII = this.LIZIZ.timeout().LJII();
            this.LIZIZ.timeout().LIZIZ();
            try {
                int readByte = this.LIZIZ.readByte() & 255;
                this.LIZIZ.timeout().LJI(LJII, TimeUnit.NANOSECONDS);
                this.LJ = readByte & 15;
                boolean z6 = true;
                if ((readByte & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.LJI = z;
                if ((readByte & 8) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.LJII = z2;
                if (!z2 || z) {
                    if ((readByte & 64) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((readByte & 32) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if ((readByte & 16) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z3 && !z4 && !z5) {
                        int readByte2 = this.LIZIZ.readByte() & 255;
                        if ((readByte2 & 128) == 0) {
                            z6 = false;
                        }
                        if (z6 == this.LIZ) {
                            if (this.LIZ) {
                                str = "Server-sent frames must not be masked.";
                            } else {
                                str = "Client-sent frames must be masked.";
                            }
                            throw new ProtocolException(str);
                        }
                        long j = readByte2 & 127;
                        this.LJFF = j;
                        if (j == 126) {
                            this.LJFF = this.LIZIZ.readShort() & 65535;
                        } else if (j == 127) {
                            long readLong = this.LIZIZ.readLong();
                            this.LJFF = readLong;
                            if (readLong < 0) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("Frame length 0x");
                                LIZ.append(Long.toHexString(this.LJFF));
                                LIZ.append(" > 0x7FFFFFFFFFFFFFFF");
                                throw new ProtocolException(X1D.LIZIZ(LIZ));
                            }
                        }
                        if (!this.LJII || this.LJFF <= 125) {
                            if (z6) {
                                this.LIZIZ.readFully(this.LJIIJ);
                                return;
                            }
                            return;
                        }
                        throw new ProtocolException("Control frame must be less than 125B.");
                    }
                    throw new ProtocolException("Reserved flags are unsupported.");
                }
                throw new ProtocolException("Control frames must be final.");
            } catch (Throwable th) {
                this.LIZIZ.timeout().LJI(LJII, TimeUnit.NANOSECONDS);
                throw th;
            }
        }
        throw new IOException("closed");
    }

    public PXK(boolean z, PW3 pw3, PXH pxh) {
        byte[] bArr;
        if (pw3 != null) {
            if (pxh != null) {
                this.LIZ = z;
                this.LIZIZ = pw3;
                this.LIZJ = pxh;
                if (z) {
                    bArr = null;
                } else {
                    bArr = new byte[4];
                }
                this.LJIIJ = bArr;
                this.LJIIJJI = z ? null : new PUT();
                return;
            }
            throw new NullPointerException("frameCallback == null");
        }
        throw new NullPointerException("source == null");
    }
}
