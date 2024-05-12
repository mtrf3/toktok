package X;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.o;

/* renamed from: X.PUk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64534PUk implements PVU {
    public static final byte[] LJLJJL = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public final C64533PUj LJLIL;
    public final PW6 LJLILLLLZI;
    public final PUJ LJLJI;
    public boolean LJLJJI;

    @Override // X.PVU
    public final long j(PUC puc) {
        return 0L;
    }

    @Override // X.PVU
    public final OutputStream H() {
        return new C64539PUp(this);
    }

    @Override // X.PVU
    public final PVU LLIFFJFJJ() {
        if (!this.LJLJJI) {
            long LIZJ = this.LJLIL.LIZJ();
            if (LIZJ > 0) {
                this.LJLJI.LLIIIL(this.LJLIL, LIZJ);
            }
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.PVU
    public final PVU LLLZIL() {
        if (!this.LJLJJI) {
            C64533PUj c64533PUj = this.LJLIL;
            long j = c64533PUj.LJLILLLLZI;
            if (j > 0) {
                this.LJLJI.LLIIIL(c64533PUj, j);
            }
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.PUJ, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.LJLJJI) {
            return;
        }
        try {
            C64533PUj c64533PUj = this.LJLIL;
            long j = c64533PUj.LJLILLLLZI;
            if (j > 0) {
                this.LJLJI.LLIIIL(c64533PUj, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.LJLJI.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.LJLJJI = true;
        if (th == null) {
        } else {
            throw th;
        }
    }

    @Override // X.PVU, X.PUJ, java.io.Flushable
    public final void flush() {
        if (!this.LJLJJI) {
            C64533PUj c64533PUj = this.LJLIL;
            long j = c64533PUj.LJLILLLLZI;
            if (j > 0) {
                this.LJLJI.LLIIIL(c64533PUj, j);
            }
            this.LJLJI.flush();
            return;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.LJLJJI;
    }

    @Override // X.PUJ
    public final C64545PUv timeout() {
        return this.LJLJI.timeout();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("buffer(");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.PVU
    public final C64533PUj LJJIJ() {
        return this.LJLIL;
    }

    public final boolean LIZ(int i) {
        if (this.LJLILLLLZI.LIZIZ(1L) > 0) {
            this.LJLIL.LJJIII(i);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    @Override // X.PVU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.PVU LJJZZIII(long r13) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64534PUk.LJJZZIII(long):X.PVU");
    }

    @Override // X.PVU
    public final PVU LLIIIZ(String string) {
        char charAt;
        char c;
        o.LJIIIZ(string, "string");
        int length = string.length();
        if (!this.LJLJJI) {
            if (length >= 0) {
                if (length <= string.length()) {
                    int i = 0;
                    while (i < length) {
                        char charAt2 = string.charAt(i);
                        if (charAt2 < 128) {
                            int min = Math.min(length, 4096);
                            byte[] bArr = new byte[min];
                            int i2 = -i;
                            int i3 = i + 1;
                            bArr[i + i2] = (byte) charAt2;
                            while (true) {
                                i = i3;
                                if (i3 >= min || (charAt = string.charAt(i3)) >= 128) {
                                    break;
                                }
                                i3++;
                                bArr[i + i2] = (byte) charAt;
                            }
                            long LIZIZ = this.LJLILLLLZI.LIZIZ(i2 + i3);
                            if (LIZIZ > 0) {
                                this.LJLIL.LJJ(0, bArr, (int) LIZIZ);
                            }
                        } else {
                            if (charAt2 < 2048) {
                                LIZ((charAt2 >> 6) | 192);
                                LIZ((charAt2 & '?') | 128);
                            } else if (charAt2 < 55296 || charAt2 > 57343) {
                                LIZ((charAt2 >> '\f') | 224);
                                LIZ(((charAt2 >> 6) & 63) | 128);
                                LIZ((charAt2 & '?') | 128);
                            } else {
                                int i4 = i + 1;
                                if (i4 < length) {
                                    c = string.charAt(i4);
                                } else {
                                    c = 0;
                                }
                                if (charAt2 > 56319 || c < 56320 || c > 57343) {
                                    LIZ(63);
                                    i = i4;
                                } else {
                                    int i5 = (((charAt2 & 10239) << 10) | (9215 & c)) + 65536;
                                    LIZ((i5 >> 18) | 240);
                                    LIZ(((i5 >> 12) & 63) | 128);
                                    LIZ(((i5 >> 6) & 63) | 128);
                                    LIZ((i5 & 63) | 128);
                                    i += 2;
                                }
                            }
                            i++;
                        }
                    }
                    return this;
                }
                StringBuilder LJ = C7MY.LJ("endIndex > string.length: ", length, " > ");
                LJ.append(string.length());
                String LIZIZ2 = X1D.LIZIZ(LJ);
                LIZIZ2.toString();
                throw new IllegalArgumentException(LIZIZ2);
            }
            String LIZLLL = C48263Iwt.LIZLLL("endIndex < beginIndex: ", length, " < ", 0);
            LIZLLL.toString();
            throw new IllegalArgumentException(LIZLLL);
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.PVU
    public final PVU LLJZIJLIL(long j) {
        long j2 = ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
        if (!this.LJLJJI) {
            long LIZIZ = this.LJLILLLLZI.LIZIZ(8L);
            if (LIZIZ > 0) {
                for (long j3 = 0; j3 < LIZIZ; j3++) {
                    this.LJLIL.LJJIII((byte) ((j2 >> ((int) ((LIZIZ - j3) * 8))) & 255));
                }
            }
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.PVU
    public final PVU LLLLIILL(int i) {
        writeInt(((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8));
        return this;
    }

    @Override // X.PVU
    public final PVU LLLLLILLIL(long j) {
        if (!this.LJLJJI) {
            if (j == 0 && LIZ(48)) {
                LLIFFJFJJ();
                return this;
            }
            long LIZIZ = this.LJLILLLLZI.LIZIZ((Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1);
            if (LIZIZ > 0) {
                for (int i = (int) (LIZIZ - 1); i >= 0; i--) {
                    this.LJLIL.LJJIII(LJLJJL[(int) (15 & j)]);
                    j >>>= 4;
                }
            }
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.PVU
    public final PVU c(C64537PUn byteString) {
        o.LJIIIZ(byteString, "byteString");
        write(byteString.asByteBuffer());
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        o.LJIIIZ(source, "source");
        if (!this.LJLJJI) {
            int LIZIZ = (int) this.LJLILLLLZI.LIZIZ(source.remaining());
            if (LIZIZ > 0) {
                int i = LIZIZ;
                do {
                    int min = Math.min(i, 4096);
                    byte[] bArr = new byte[min];
                    source.get(bArr, 0, min);
                    i -= min;
                    this.LJLIL.m27write(bArr);
                } while (i > 0);
                LLIFFJFJJ();
            }
            return LIZIZ;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.PVU
    public final PVU writeByte(int i) {
        if (!this.LJLJJI) {
            LIZ(i);
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.PVU
    public final PVU writeInt(int i) {
        if (!this.LJLJJI) {
            long LIZIZ = this.LJLILLLLZI.LIZIZ(4L);
            if (LIZIZ > 0) {
                for (long j = 0; j < LIZIZ; j++) {
                    this.LJLIL.LJJIII((byte) ((i >> ((int) ((LIZIZ - j) * 8))) & 255));
                }
            }
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.PVU
    public final PVU writeShort(int i) {
        if (!this.LJLJJI) {
            long LIZIZ = this.LJLILLLLZI.LIZIZ(2L);
            if (LIZIZ > 0) {
                for (long j = 0; j < LIZIZ; j++) {
                    this.LJLIL.LJJIII((byte) ((i >> ((int) ((LIZIZ - j) * 8))) & 255));
                }
            }
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.PVU
    public final PVU write(byte[] source) {
        o.LJIIIZ(source, "source");
        LJJI(0, source, source.length);
        return this;
    }

    public C64534PUk(PUG pug, PW6 manager) {
        o.LJIIIZ(manager, "manager");
        this.LJLIL = new C64533PUj();
        this.LJLJI = pug;
        this.LJLILLLLZI = manager;
    }

    @Override // X.PUJ
    public final void LLIIIL(C64533PUj source, long j) {
        o.LJIIIZ(source, "source");
        if (!this.LJLJJI) {
            long LIZIZ = this.LJLILLLLZI.LIZIZ((int) j);
            if (LIZIZ > 0) {
                this.LJLIL.LLIIIL(source, LIZIZ);
                return;
            }
            return;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.PVU
    public final PVU LJJI(int i, byte[] source, int i2) {
        o.LJIIIZ(source, "source");
        if (!this.LJLJJI) {
            long LIZIZ = this.LJLILLLLZI.LIZIZ(i2);
            if (LIZIZ > 0) {
                this.LJLIL.LJJ(i, source, (int) LIZIZ);
            }
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }
}
