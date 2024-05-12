package X;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes12.dex */
public final class PWC implements Closeable {
    public static final Logger LJLJJL = Logger.getLogger(PPI.class.getName());
    public final PW3 LJLIL;
    public final PW4 LJLILLLLZI;
    public final boolean LJLJI;
    public final PWB LJLJJI;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LJLIL.close();
    }

    public final void LIZJ(InterfaceC64581PWf interfaceC64581PWf) {
        if (this.LJLJI) {
            if (LIZIZ(true, interfaceC64581PWf)) {
                return;
            }
            PPI.LIZIZ("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        PW3 pw3 = this.LJLIL;
        C64537PUn c64537PUn = PPI.LIZ;
        C64537PUn LJLIIIL = pw3.LJLIIIL(c64537PUn.size());
        Logger logger = LJLJJL;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(PVA.LJIIJJI("<< CONNECTION %s", LJLIIIL.hex()));
        }
        if (c64537PUn.equals(LJLIIIL)) {
            return;
        }
        PPI.LIZIZ("Expected a connection header but was %s", LJLIIIL.utf8());
        throw null;
    }

    public PWC(PW3 pw3, boolean z) {
        this.LJLIL = pw3;
        this.LJLJI = z;
        PW4 pw4 = new PW4(pw3);
        this.LJLILLLLZI = pw4;
        this.LJLJJI = new PWB(pw4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x0240, code lost:
    
        if (r18 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0242, code lost:
    
        r9.LJI();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(boolean r20, X.InterfaceC64581PWf r21) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PWC.LIZIZ(boolean, X.PWf):boolean");
    }

    public static int LIZ(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        PPI.LIZIZ("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    public final void LIZLLL(InterfaceC64581PWf interfaceC64581PWf, int i, int i2) {
        PWF[] pwfArr;
        if (i >= 8) {
            if (i2 == 0) {
                int readInt = this.LJLIL.readInt();
                int readInt2 = this.LJLIL.readInt();
                int i3 = i - 8;
                if (PWT.fromHttp2(readInt2) != null) {
                    C64537PUn c64537PUn = C64537PUn.EMPTY;
                    if (i3 > 0) {
                        c64537PUn = this.LJLIL.LJLIIIL(i3);
                    }
                    PWO pwo = (PWO) interfaceC64581PWf;
                    pwo.getClass();
                    c64537PUn.size();
                    synchronized (pwo.LJLJJI) {
                        pwfArr = (PWF[]) ((LinkedHashMap) pwo.LJLJJI.LJLJI).values().toArray(new PWF[pwo.LJLJJI.LJLJI.size()]);
                        pwo.LJLJJI.LJLJL = true;
                    }
                    for (PWF pwf : pwfArr) {
                        if (pwf.LIZJ > readInt && pwf.LJ()) {
                            pwf.LJIIIIZZ(PWT.REFUSED_STREAM);
                            pwo.LJLJJI.LJ(pwf.LIZJ);
                        }
                    }
                    return;
                }
                PPI.LIZIZ("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
                throw null;
            }
            PPI.LIZIZ("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
        PPI.LIZIZ("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
        throw null;
    }

    public final void LJIIJJI(InterfaceC64581PWf interfaceC64581PWf, int i, int i2) {
        if (i == 4) {
            long readInt = this.LJLIL.readInt() & 2147483647L;
            if (readInt != 0) {
                PWO pwo = (PWO) interfaceC64581PWf;
                if (i2 == 0) {
                    synchronized (pwo.LJLJJI) {
                        PWE pwe = pwo.LJLJJI;
                        pwe.LJLZ += readInt;
                        pwe.notifyAll();
                    }
                    return;
                }
                PWF LIZIZ = pwo.LJLJJI.LIZIZ(i2);
                if (LIZIZ != null) {
                    synchronized (LIZIZ) {
                        LIZIZ.LIZIZ += readInt;
                        if (readInt > 0) {
                            LIZIZ.notifyAll();
                        }
                    }
                    return;
                }
                return;
            }
            PPI.LIZIZ("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
        PPI.LIZIZ("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        throw null;
    }

    public final List<PWL> LJ(int i, short s, byte b, int i2) {
        PW4 pw4 = this.LJLILLLLZI;
        pw4.LJLJJL = i;
        pw4.LJLILLLLZI = i;
        pw4.LJLJJLL = s;
        pw4.LJLJI = b;
        pw4.LJLJJI = i2;
        PWB pwb = this.LJLJJI;
        while (!pwb.LIZIZ.LLJ()) {
            int readByte = pwb.LIZIZ.readByte() & 255;
            if (readByte != 128) {
                if ((readByte & 128) == 128) {
                    int LJ = pwb.LJ(readByte, 127) - 1;
                    if (LJ >= 0 && LJ <= PWM.LIZ.length - 1) {
                        ((ArrayList) pwb.LIZ).add(PWM.LIZ[LJ]);
                    } else {
                        int length = pwb.LJFF + 1 + (LJ - PWM.LIZ.length);
                        if (length >= 0) {
                            PWL[] pwlArr = pwb.LJ;
                            if (length < pwlArr.length) {
                                ((ArrayList) pwb.LIZ).add(pwlArr[length]);
                            }
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Header index too large ");
                        LIZ.append(LJ + 1);
                        throw new IOException(X1D.LIZIZ(LIZ));
                    }
                } else if (readByte == 64) {
                    C64537PUn LIZLLL = pwb.LIZLLL();
                    PWM.LIZ(LIZLLL);
                    pwb.LIZJ(new PWL(LIZLLL, pwb.LIZLLL()));
                } else if ((readByte & 64) == 64) {
                    pwb.LIZJ(new PWL(pwb.LIZIZ(pwb.LJ(readByte, 63) - 1), pwb.LIZLLL()));
                } else if ((readByte & 32) == 32) {
                    int LJ2 = pwb.LJ(readByte, 31);
                    pwb.LIZLLL = LJ2;
                    if (LJ2 >= 0 && LJ2 <= pwb.LIZJ) {
                        int i3 = pwb.LJII;
                        if (LJ2 < i3) {
                            if (LJ2 == 0) {
                                Arrays.fill(pwb.LJ, (Object) null);
                                pwb.LJFF = pwb.LJ.length - 1;
                                pwb.LJI = 0;
                                pwb.LJII = 0;
                            } else {
                                pwb.LIZ(i3 - LJ2);
                            }
                        }
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Invalid dynamic table size update ");
                        LIZ2.append(pwb.LIZLLL);
                        throw new IOException(X1D.LIZIZ(LIZ2));
                    }
                } else if (readByte == 16 || readByte == 0) {
                    C64537PUn LIZLLL2 = pwb.LIZLLL();
                    PWM.LIZ(LIZLLL2);
                    ((ArrayList) pwb.LIZ).add(new PWL(LIZLLL2, pwb.LIZLLL()));
                } else {
                    ((ArrayList) pwb.LIZ).add(new PWL(pwb.LIZIZ(pwb.LJ(readByte, 15) - 1), pwb.LIZLLL()));
                }
            } else {
                throw new IOException("index == 0");
            }
        }
        PWB pwb2 = this.LJLJJI;
        pwb2.getClass();
        ArrayList arrayList = new ArrayList(pwb2.LIZ);
        ((ArrayList) pwb2.LIZ).clear();
        return arrayList;
    }

    public final void LJFF(InterfaceC64581PWf interfaceC64581PWf, int i, byte b, int i2) {
        boolean z;
        short s;
        boolean z2;
        int i3 = i;
        if (i2 != 0) {
            if ((b & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((b & 8) != 0) {
                s = (short) (this.LJLIL.readByte() & 255);
            } else {
                s = 0;
            }
            if ((b & 32) != 0) {
                this.LJLIL.readInt();
                this.LJLIL.readByte();
                interfaceC64581PWf.getClass();
                i3 -= 5;
            }
            List<PWL> LJ = LJ(LIZ(i3, b, s), s, b, i2);
            PWO pwo = (PWO) interfaceC64581PWf;
            pwo.LJLJJI.getClass();
            if ((i2 & 1) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                PWE pwe = pwo.LJLJJI;
                pwe.getClass();
                try {
                    pwe.LIZLLL(new PWR(pwe, new Object[]{pwe.LJLJJI, Integer.valueOf(i2)}, i2, LJ, z));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (pwo.LJLJJI) {
                PWF LIZIZ = pwo.LJLJJI.LIZIZ(i2);
                if (LIZIZ == null) {
                    PWE pwe2 = pwo.LJLJJI;
                    if (!pwe2.LJLJL) {
                        if (i2 > pwe2.LJLJJL) {
                            if (i2 % 2 != pwe2.LJLJJLL % 2) {
                                PWF pwf = new PWF(i2, pwo.LJLJJI, false, z, PVA.LJIL(LJ));
                                PWE pwe3 = pwo.LJLJJI;
                                pwe3.LJLJJL = i2;
                                pwe3.LJLJI.put(Integer.valueOf(i2), pwf);
                                PWE.LLFF.execute(new PWK(pwo, new Object[]{pwo.LJLJJI.LJLJJI, Integer.valueOf(i2)}, pwf));
                            }
                        }
                    }
                } else {
                    LIZIZ.LJII(LJ);
                    if (z) {
                        LIZIZ.LJI();
                    }
                }
            }
            return;
        }
        PPI.LIZIZ("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        throw null;
    }

    public final void LJI(InterfaceC64581PWf interfaceC64581PWf, int i, byte b, int i2) {
        boolean z = false;
        if (i == 8) {
            if (i2 == 0) {
                int readInt = this.LJLIL.readInt();
                int readInt2 = this.LJLIL.readInt();
                if ((b & 1) != 0) {
                    z = true;
                }
                PWO pwo = (PWO) interfaceC64581PWf;
                pwo.getClass();
                if (z) {
                    synchronized (pwo.LJLJJI) {
                        if (readInt != 1) {
                            if (readInt == 2) {
                                pwo.LJLJJI.LJLLL++;
                            } else if (readInt == 3) {
                                PWE pwe = pwo.LJLJJI;
                                pwe.getClass();
                                pwe.notifyAll();
                            }
                        } else {
                            pwo.LJLJJI.LJLLILLLL++;
                        }
                    }
                    return;
                }
                try {
                    PWE pwe2 = pwo.LJLJJI;
                    pwe2.LJLJLJ.execute(new PWS(pwe2, readInt, readInt2));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            PPI.LIZIZ("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
        PPI.LIZIZ("TYPE_PING length != 8: %s", Integer.valueOf(i));
        throw null;
    }

    public final void LJIIJ(InterfaceC64581PWf interfaceC64581PWf, int i, byte b, int i2) {
        short s;
        if (i2 != 0) {
            if ((b & 8) != 0) {
                s = (short) (this.LJLIL.readByte() & 255);
            } else {
                s = 0;
            }
            int readInt = this.LJLIL.readInt() & Integer.MAX_VALUE;
            List<PWL> LJ = LJ(LIZ(i - 4, b, s), s, b, i2);
            PWE pwe = ((PWO) interfaceC64581PWf).LJLJJI;
            synchronized (pwe) {
                if (pwe.LLF.contains(Integer.valueOf(readInt))) {
                    pwe.LJIIJJI(readInt, PWT.PROTOCOL_ERROR);
                    return;
                }
                pwe.LLF.add(Integer.valueOf(readInt));
                try {
                    pwe.LIZLLL(new PWQ(pwe, new Object[]{pwe.LJLJJI, Integer.valueOf(readInt)}, readInt, LJ));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
        }
        PPI.LIZIZ("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        throw null;
    }
}
