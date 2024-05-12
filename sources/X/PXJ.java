package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public final class PXJ {
    public final long LIZ;
    public final boolean LIZIZ;
    public final PW3 LIZJ;
    public final PXU LIZLLL;
    public boolean LJ;
    public int LJFF;
    public long LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public final C64533PUj LJIIIZ = new C64533PUj();
    public final C64533PUj LJIIJ = new C64533PUj();
    public final byte[] LJIIJJI;
    public final PUT LJIIL;

    public final void LIZ() {
        short s;
        long j = this.LJI;
        if (j > 0) {
            this.LIZJ.LLFZ(this.LJIIIZ, j);
            if (!this.LIZIZ) {
                this.LJIIIZ.LJIIJ(this.LJIIL);
                this.LJIIL.LIZIZ(0L);
                PUV.LIZIZ(this.LJIIL, this.LJIIJJI);
                this.LJIIL.close();
            }
        }
        int i = this.LJFF;
        if (i == 9) {
            PXU pxu = this.LIZLLL;
            C64537PUn LJIIL = this.LJIIIZ.LJIIL();
            PXI pxi = (PXI) pxu;
            synchronized (pxi) {
                if (!pxi.LJIJ && (!pxi.LJIILJJIL || !pxi.LJI.isEmpty())) {
                    pxi.LJFF.add(LJIIL);
                    PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor = pxi.LJIIJJI;
                    if (pThreadScheduledThreadPoolExecutor != null) {
                        pThreadScheduledThreadPoolExecutor.execute(pxi.LJ);
                    }
                    return;
                }
                return;
            }
        }
        if (i == 10) {
            ((PXI) this.LIZLLL).LJII(this.LJIIIZ.LJIIL());
            return;
        }
        if (i == 8) {
            String str = "";
            C64533PUj c64533PUj = this.LJIIIZ;
            long j2 = c64533PUj.LJLILLLLZI;
            if (j2 != 1) {
                if (j2 != 0) {
                    s = c64533PUj.readShort();
                    str = this.LJIIIZ.LJIILL();
                    String LIZ = PUV.LIZ(s);
                    if (LIZ != null) {
                        throw new ProtocolException(LIZ);
                    }
                } else {
                    s = 1005;
                }
                ((PXI) this.LIZLLL).LJI(s, str);
                this.LJ = true;
                return;
            }
            throw new ProtocolException("Malformed close payload length of 1.");
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Unknown control opcode: ");
        LIZ2.append(Integer.toHexString(this.LJFF));
        throw new ProtocolException(X1D.LIZIZ(LIZ2));
    }

    /* JADX WARN: Finally extract failed */
    public final void LIZIZ() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        if (!this.LJ) {
            long LJII = this.LIZJ.timeout().LJII();
            this.LIZJ.timeout().LIZIZ();
            try {
                int readByte = this.LIZJ.readByte() & 255;
                this.LIZJ.timeout().LJI(LJII, TimeUnit.NANOSECONDS);
                this.LJFF = readByte & 15;
                boolean z6 = true;
                if ((readByte & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.LJII = z;
                if ((readByte & 8) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.LJIIIIZZ = z2;
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
                        int readByte2 = this.LIZJ.readByte() & 255;
                        if ((readByte2 & 128) == 0) {
                            z6 = false;
                        }
                        if (z6 == this.LIZIZ) {
                            if (this.LIZIZ) {
                                str = "Server-sent frames must not be masked.";
                            } else {
                                str = "Client-sent frames must be masked.";
                            }
                            throw new ProtocolException(str);
                        }
                        long j = readByte2 & 127;
                        this.LJI = j;
                        if (j == 126) {
                            this.LJI = this.LIZJ.readShort() & 65535;
                        } else if (j == 127) {
                            long readLong = this.LIZJ.readLong();
                            this.LJI = readLong;
                            if (readLong < 0) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("Frame length 0x");
                                LIZ.append(Long.toHexString(this.LJI));
                                LIZ.append(" > 0x7FFFFFFFFFFFFFFF");
                                throw new ProtocolException(X1D.LIZIZ(LIZ));
                            }
                        }
                        if (!this.LJIIIIZZ || this.LJI <= 125) {
                            if (z6) {
                                this.LIZJ.readFully(this.LJIIJJI);
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
                this.LIZJ.timeout().LJI(LJII, TimeUnit.NANOSECONDS);
                throw th;
            }
        }
        throw new IOException("closed");
    }

    public PXJ(boolean z, PW3 pw3, PXI pxi, long j) {
        byte[] bArr;
        if (pw3 != null) {
            if (pxi != null) {
                this.LIZIZ = z;
                this.LIZJ = pw3;
                this.LIZLLL = pxi;
                this.LIZ = j;
                if (z) {
                    bArr = null;
                } else {
                    bArr = new byte[4];
                }
                this.LJIIJJI = bArr;
                this.LJIIL = z ? null : new PUT();
                return;
            }
            throw new NullPointerException("frameCallback == null");
        }
        throw new NullPointerException("source == null");
    }
}
