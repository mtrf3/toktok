package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.jvm.internal.o;

/* renamed from: X.PUj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64533PUj implements PW3, PVU, Cloneable, ByteChannel {
    public static final byte[] LJLJI;
    public PUR LJLIL;
    public long LJLILLLLZI;

    @Override // X.PW3
    public final C64533PUj LJJIJ() {
        return this;
    }

    @Override // X.PVU
    public final PVU LLIFFJFJJ() {
        return this;
    }

    @Override // X.PVU
    public final PVU LLLZIL() {
        return this;
    }

    @Override // X.PUC, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // X.PVU, X.PUJ, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    static {
        byte[] bytes = "0123456789abcdef".getBytes(PVC.LIZ);
        o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
        LJLJI = bytes;
    }

    @Override // X.PVU
    public final OutputStream H() {
        return new C64540PUq(this);
    }

    @Override // X.PW3
    public final InputStream K() {
        return new C64531PUh(this);
    }

    public final void LIZ() {
        skip(this.LJLILLLLZI);
    }

    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C64533PUj clone() {
        C64533PUj c64533PUj = new C64533PUj();
        if (this.LJLILLLLZI == 0) {
            return c64533PUj;
        }
        PUR pur = this.LJLIL;
        if (pur != null) {
            PUR LIZJ = pur.LIZJ();
            c64533PUj.LJLIL = LIZJ;
            LIZJ.LJI = LIZJ;
            LIZJ.LJFF = LIZJ;
            PUR pur2 = this.LJLIL;
            if (pur2 != null) {
                for (PUR pur3 = pur2.LJFF; pur3 != this.LJLIL; pur3 = pur3.LJFF) {
                    PUR pur4 = c64533PUj.LJLIL;
                    if (pur4 != null) {
                        PUR pur5 = pur4.LJI;
                        if (pur5 != null) {
                            if (pur3 != null) {
                                pur5.LIZIZ(pur3.LIZJ());
                            } else {
                                o.LJIIZILJ();
                                throw null;
                            }
                        } else {
                            o.LJIIZILJ();
                            throw null;
                        }
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
                c64533PUj.LJLILLLLZI = this.LJLILLLLZI;
                return c64533PUj;
            }
            o.LJIIZILJ();
            throw null;
        }
        o.LJIIZILJ();
        throw null;
    }

    public final long LIZJ() {
        long j = this.LJLILLLLZI;
        if (j == 0) {
            return 0L;
        }
        PUR pur = this.LJLIL;
        if (pur != null) {
            PUR pur2 = pur.LJI;
            if (pur2 != null) {
                if (pur2.LIZJ < 8192 && pur2.LJ) {
                    return j - (r1 - pur2.LIZIZ);
                }
                return j;
            }
            o.LJIIZILJ();
            throw null;
        }
        o.LJIIZILJ();
        throw null;
    }

    public final C64537PUn LJIIL() {
        return new C64537PUn(LLLLIIL());
    }

    public final String LJIILL() {
        return LJIILIIL(this.LJLILLLLZI, PVC.LIZ);
    }

    public final int LJIJ() {
        int i;
        int i2;
        int i3;
        if (this.LJLILLLLZI != 0) {
            byte LJ = LJ(0L);
            if ((LJ & 128) == 0) {
                i = LJ & Byte.MAX_VALUE;
                i2 = 1;
                i3 = 0;
            } else if ((LJ & 224) == 192) {
                i = LJ & 31;
                i2 = 2;
                i3 = 128;
            } else if ((LJ & 240) == 224) {
                i = LJ & 15;
                i2 = 3;
                i3 = 2048;
            } else if ((LJ & 248) == 240) {
                i = LJ & 7;
                i2 = 4;
                i3 = 65536;
            } else {
                skip(1L);
                return 65533;
            }
            long j = i2;
            if (this.LJLILLLLZI >= j) {
                for (int i4 = 1; i4 < i2; i4++) {
                    long j2 = i4;
                    byte LJ2 = LJ(j2);
                    if ((LJ2 & 192) == 128) {
                        i = (i << 6) | (LJ2 & 63);
                    } else {
                        skip(j2);
                        return 65533;
                    }
                }
                skip(j);
                if (i > 1114111) {
                    return 65533;
                }
                if ((55296 <= i && 57343 >= i) || i < i3) {
                    return 65533;
                }
                return i;
            }
            StringBuilder LJ3 = C7MY.LJ("size < ", i2, ": ");
            LJ3.append(this.LJLILLLLZI);
            LJ3.append(" (to read code point prefixed 0x");
            LJ3.append(Integer.toHexString(LJ));
            LJ3.append(")");
            throw new EOFException(X1D.LIZIZ(LJ3));
        }
        throw new EOFException();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0064 A[EDGE_INSN: B:41:0x0064->B:38:0x0064 BREAK  A[LOOP:0: B:4:0x000c->B:40:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006b  */
    @Override // X.PW3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJLZ() {
        /*
            r15 = this;
            long r1 = r15.LJLILLLLZI
            r13 = 0
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto Lb2
            r7 = 0
            r4 = 0
            r12 = 0
        Lc:
            X.PUR r8 = r15.LJLIL
            if (r8 == 0) goto Lad
            byte[] r9 = r8.LIZ
            int r3 = r8.LIZIZ
            int r2 = r8.LIZJ
        L16:
            if (r3 >= r2) goto L53
            r6 = r9[r3]
            r0 = 48
            byte r1 = (byte) r0
            if (r6 < r1) goto L36
            r0 = 57
            byte r0 = (byte) r0
            if (r6 > r0) goto L36
            int r1 = r6 - r1
        L26:
            r10 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r10 = r10 & r4
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 != 0) goto L6e
            r0 = 4
            long r4 = r4 << r0
            long r0 = (long) r1
            long r4 = r4 | r0
            int r3 = r3 + 1
            int r7 = r7 + 1
            goto L16
        L36:
            r0 = 97
            byte r1 = (byte) r0
            if (r6 < r1) goto L45
            r0 = 102(0x66, float:1.43E-43)
            byte r0 = (byte) r0
            if (r6 > r0) goto L45
        L40:
            int r0 = r6 - r1
            int r1 = r0 + 10
            goto L26
        L45:
            r0 = 65
            byte r1 = (byte) r0
            if (r6 < r1) goto L50
            r0 = 70
            byte r0 = (byte) r0
            if (r6 > r0) goto L50
            goto L40
        L50:
            if (r7 == 0) goto L93
            r12 = 1
        L53:
            if (r3 != r2) goto L6b
            X.PUR r0 = r8.LIZ()
            r15.LJLIL = r0
            X.PUS.LIZ(r8)
        L5e:
            if (r12 != 0) goto L64
            X.PUR r0 = r15.LJLIL
            if (r0 != 0) goto Lc
        L64:
            long r2 = r15.LJLILLLLZI
            long r0 = (long) r7
            long r2 = r2 - r0
            r15.LJLILLLLZI = r2
            return r4
        L6b:
            r8.LIZIZ = r3
            goto L5e
        L6e:
            X.PUj r3 = new X.PUj
            r3.<init>()
            r3.LJJIIJZLJL(r4)
            r3.LJJIII(r6)
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Number too large: "
            r1.append(r0)
            java.lang.String r0 = r3.LJIILL()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        L93:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r6)
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        Lad:
            kotlin.jvm.internal.o.LJIIZILJ()
            r0 = 0
            throw r0
        Lb2:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64533PUj.LJLZ():long");
    }

    @Override // X.PW3
    public final boolean LLJ() {
        if (this.LJLILLLLZI == 0) {
            return true;
        }
        return false;
    }

    @Override // X.PW3
    public final byte[] LLLLIIL() {
        return LJIIJJI(this.LJLILLLLZI);
    }

    public final int hashCode() {
        PUR pur = this.LJLIL;
        if (pur != null) {
            int i = 1;
            do {
                int i2 = pur.LIZJ;
                for (int i3 = pur.LIZIZ; i3 < i2; i3++) {
                    i = (i * 31) + pur.LIZ[i3];
                }
                pur = pur.LJFF;
                if (pur == null) {
                    o.LJIIZILJ();
                    throw null;
                }
            } while (pur != this.LJLIL);
            return i;
        }
        return 0;
    }

    @Override // X.PW3
    public final byte readByte() {
        long j = this.LJLILLLLZI;
        if (j != 0) {
            PUR pur = this.LJLIL;
            if (pur != null) {
                int i = pur.LIZIZ;
                int i2 = pur.LIZJ;
                int i3 = i + 1;
                byte b = pur.LIZ[i];
                this.LJLILLLLZI = j - 1;
                if (i3 == i2) {
                    this.LJLIL = pur.LIZ();
                    PUS.LIZ(pur);
                } else {
                    pur.LIZIZ = i3;
                }
                return b;
            }
            o.LJIIZILJ();
            throw null;
        }
        throw new EOFException();
    }

    @Override // X.PW3
    public final int readInt() {
        long j = this.LJLILLLLZI;
        if (j >= 4) {
            PUR pur = this.LJLIL;
            if (pur != null) {
                int i = pur.LIZIZ;
                int i2 = pur.LIZJ;
                if (i2 - i < 4) {
                    return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
                }
                byte[] bArr = pur.LIZ;
                int i3 = i + 1;
                int i4 = (bArr[i] & 255) << 24;
                int i5 = i3 + 1;
                int i6 = i4 | ((bArr[i3] & 255) << 16);
                int i7 = i5 + 1;
                int i8 = i6 | ((bArr[i5] & 255) << 8);
                int i9 = i7 + 1;
                int i10 = i8 | (bArr[i7] & 255);
                this.LJLILLLLZI = j - 4;
                if (i9 == i2) {
                    this.LJLIL = pur.LIZ();
                    PUS.LIZ(pur);
                } else {
                    pur.LIZIZ = i9;
                }
                return i10;
            }
            o.LJIIZILJ();
            throw null;
        }
        throw new EOFException();
    }

    @Override // X.PW3
    public final long readLong() {
        long j = this.LJLILLLLZI;
        if (j >= 8) {
            PUR pur = this.LJLIL;
            if (pur != null) {
                int i = pur.LIZIZ;
                int i2 = pur.LIZJ;
                if (i2 - i < 8) {
                    return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
                }
                byte[] bArr = pur.LIZ;
                long j2 = (bArr[i] & 255) << 56;
                long j3 = ((bArr[r3] & 255) << 48) | j2 | ((bArr[r11] & 255) << 40) | ((bArr[r10] & 255) << 32);
                long j4 = j3 | ((bArr[r9] & 255) << 24) | ((bArr[r10] & 255) << 16);
                int i3 = i + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
                long j5 = j4 | ((bArr[r11] & 255) << 8) | (bArr[r10] & 255);
                this.LJLILLLLZI = j - 8;
                if (i3 == i2) {
                    this.LJLIL = pur.LIZ();
                    PUS.LIZ(pur);
                } else {
                    pur.LIZIZ = i3;
                }
                return j5;
            }
            o.LJIIZILJ();
            throw null;
        }
        throw new EOFException();
    }

    @Override // X.PW3
    public final short readShort() {
        long j = this.LJLILLLLZI;
        if (j >= 2) {
            PUR pur = this.LJLIL;
            if (pur != null) {
                int i = pur.LIZIZ;
                int i2 = pur.LIZJ;
                if (i2 - i < 2) {
                    return (short) (((readByte() & 255) << 8) | (readByte() & 255));
                }
                byte[] bArr = pur.LIZ;
                int i3 = i + 1;
                int i4 = i3 + 1;
                int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
                this.LJLILLLLZI = j - 2;
                if (i4 == i2) {
                    this.LJLIL = pur.LIZ();
                    PUS.LIZ(pur);
                } else {
                    pur.LIZIZ = i4;
                }
                return (short) i5;
            }
            o.LJIIZILJ();
            throw null;
        }
        throw new EOFException();
    }

    public final String toString() {
        C64537PUn c64536PUm;
        long j = this.LJLILLLLZI;
        if (j <= Integer.MAX_VALUE) {
            int i = (int) j;
            if (i == 0) {
                c64536PUm = C64537PUn.EMPTY;
            } else {
                c64536PUm = new C64536PUm(this, i);
            }
            return c64536PUm.toString();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("size > Integer.MAX_VALUE: ");
        LIZ.append(this.LJLILLLLZI);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalStateException(LIZIZ);
    }

    @Override // X.PW3
    public final long LJIIIIZZ() {
        return C30581Hy.LJJIZ(readLong());
    }

    @Override // X.PW3
    public final int LJIIZILJ() {
        int readInt = readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // X.PW3
    public final String LLIIZ() {
        return LLIIIILZ(Long.MAX_VALUE);
    }

    @Override // X.PUC
    public final C64545PUv timeout() {
        return C64545PUv.LIZLLL;
    }

    public final byte LJ(long j) {
        C30581Hy.LJIIIIZZ(this.LJLILLLLZI, j, 1L);
        PUR pur = this.LJLIL;
        if (pur != null) {
            long j2 = this.LJLILLLLZI;
            if (j2 - j < j) {
                while (j2 > j) {
                    pur = pur.LJI;
                    if (pur != null) {
                        j2 -= pur.LIZJ - pur.LIZIZ;
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
                return pur.LIZ[(int) ((pur.LIZIZ + j) - j2)];
            }
            long j3 = 0;
            while (true) {
                int i = pur.LIZJ;
                int i2 = pur.LIZIZ;
                long j4 = (i - i2) + j3;
                if (j4 > j) {
                    return pur.LIZ[(int) ((i2 + j) - j3)];
                }
                pur = pur.LJFF;
                if (pur != null) {
                    j3 = j4;
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
        } else {
            o.LJIIZILJ();
            throw null;
        }
    }

    public final long LJI(C64537PUn targetBytes) {
        int i;
        int i2;
        o.LJIIJ(targetBytes, "targetBytes");
        PUR pur = this.LJLIL;
        if (pur == null) {
            return -1L;
        }
        long j = this.LJLILLLLZI;
        long j2 = 0;
        if (j - 0 < 0) {
            while (j > 0) {
                pur = pur.LJI;
                if (pur != null) {
                    j -= pur.LIZJ - pur.LIZIZ;
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
            if (targetBytes.size() == 2) {
                byte b = targetBytes.getByte(0);
                byte b2 = targetBytes.getByte(1);
                while (j < this.LJLILLLLZI) {
                    byte[] bArr = pur.LIZ;
                    i = (int) ((pur.LIZIZ + j2) - j);
                    int i3 = pur.LIZJ;
                    while (i < i3) {
                        byte b3 = bArr[i];
                        if (b3 != b && b3 != b2) {
                            i++;
                        }
                        i2 = pur.LIZIZ;
                    }
                    j2 = (pur.LIZJ - pur.LIZIZ) + j;
                    pur = pur.LJFF;
                    if (pur != null) {
                        j = j2;
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
                return -1L;
            }
            byte[] internalArray$jvm = targetBytes.internalArray$jvm();
            while (j < this.LJLILLLLZI) {
                byte[] bArr2 = pur.LIZ;
                i = (int) ((pur.LIZIZ + j2) - j);
                int i4 = pur.LIZJ;
                while (i < i4) {
                    byte b4 = bArr2[i];
                    for (byte b5 : internalArray$jvm) {
                        if (b4 == b5) {
                            i2 = pur.LIZIZ;
                        }
                    }
                    i++;
                }
                j2 = (pur.LIZJ - pur.LIZIZ) + j;
                pur = pur.LJFF;
                if (pur != null) {
                    j = j2;
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j3 = (pur.LIZJ - pur.LIZIZ) + j;
            if (j3 > 0) {
                if (targetBytes.size() == 2) {
                    byte b6 = targetBytes.getByte(0);
                    byte b7 = targetBytes.getByte(1);
                    while (j < this.LJLILLLLZI) {
                        byte[] bArr3 = pur.LIZ;
                        i = (int) ((pur.LIZIZ + j2) - j);
                        int i5 = pur.LIZJ;
                        while (i < i5) {
                            byte b8 = bArr3[i];
                            if (b8 != b6 && b8 != b7) {
                                i++;
                            }
                        }
                        j2 = (pur.LIZJ - pur.LIZIZ) + j;
                        pur = pur.LJFF;
                        if (pur != null) {
                            j = j2;
                        } else {
                            o.LJIIZILJ();
                            throw null;
                        }
                    }
                    return -1L;
                }
                byte[] internalArray$jvm2 = targetBytes.internalArray$jvm();
                while (j < this.LJLILLLLZI) {
                    byte[] bArr4 = pur.LIZ;
                    i = (int) ((pur.LIZIZ + j2) - j);
                    int i6 = pur.LIZJ;
                    while (i < i6) {
                        byte b9 = bArr4[i];
                        for (byte b10 : internalArray$jvm2) {
                            if (b9 != b10) {
                            }
                        }
                        i++;
                    }
                    j2 = (pur.LIZJ - pur.LIZIZ) + j;
                    pur = pur.LJFF;
                    if (pur != null) {
                        j = j2;
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
                return -1L;
            }
            pur = pur.LJFF;
            if (pur != null) {
                j = j3;
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        return (i - i2) + j;
    }

    public final void LJIIJ(PUT unsafeCursor) {
        o.LJIIJ(unsafeCursor, "unsafeCursor");
        if (unsafeCursor.LJLIL == null) {
            unsafeCursor.LJLIL = this;
            unsafeCursor.LJLILLLLZI = true;
        } else {
            "already attached to a buffer".toString();
            throw new IllegalStateException("already attached to a buffer");
        }
    }

    public final byte[] LJIIJJI(long j) {
        if (j >= 0 && j <= Integer.MAX_VALUE) {
            if (this.LJLILLLLZI >= j) {
                byte[] bArr = new byte[(int) j];
                readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        String LIZ = C61845OOz.LIZ("byteCount: ", j);
        LIZ.toString();
        throw new IllegalArgumentException(LIZ);
    }

    public final String LJIJI(long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (LJ(j2) == ((byte) 13)) {
                String LJJIFFI = LJJIFFI(j2);
                skip(2L);
                return LJJIFFI;
            }
        }
        String LJJIFFI2 = LJJIFFI(j);
        skip(1L);
        return LJJIFFI2;
    }

    public final PUR LJIJJ(int i) {
        if (i >= 1 && i <= 8192) {
            PUR pur = this.LJLIL;
            if (pur == null) {
                PUR LIZIZ = PUS.LIZIZ();
                this.LJLIL = LIZIZ;
                LIZIZ.LJI = LIZIZ;
                LIZIZ.LJFF = LIZIZ;
                return LIZIZ;
            }
            PUR pur2 = pur.LJI;
            if (pur2 != null) {
                if (pur2.LIZJ + i > 8192 || !pur2.LJ) {
                    PUR LIZIZ2 = PUS.LIZIZ();
                    pur2.LIZIZ(LIZIZ2);
                    return LIZIZ2;
                }
                return pur2;
            }
            o.LJIIZILJ();
            throw null;
        }
        "unexpected capacity".toString();
        throw new IllegalArgumentException("unexpected capacity");
    }

    @Override // X.PW3
    public final String LJJIFFI(long j) {
        return LJIILIIL(j, PVC.LIZ);
    }

    public final void LJJIII(int i) {
        PUR LJIJJ = LJIJJ(1);
        byte[] bArr = LJIJJ.LIZ;
        int i2 = LJIJJ.LIZJ;
        LJIJJ.LIZJ = i2 + 1;
        bArr[i2] = (byte) i;
        this.LJLILLLLZI++;
    }

    public final C64533PUj LJJIIJ(long j) {
        boolean z;
        if (j == 0) {
            LJJIII(48);
            return this;
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                LJJJI("-9223372036854775808");
                return this;
            }
            z = true;
        } else {
            z = false;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j < 100) {
                    if (j >= 10) {
                        i = 2;
                    }
                } else if (j < 1000) {
                    i = 3;
                } else {
                    i = 4;
                }
            } else if (j < 1000000) {
                if (j < 100000) {
                    i = 5;
                } else {
                    i = 6;
                }
            } else if (j < 10000000) {
                i = 7;
            } else {
                i = 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                if (j < 1000000000) {
                    i = 9;
                } else {
                    i = 10;
                }
            } else if (j < 100000000000L) {
                i = 11;
            } else {
                i = 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i = 13;
            } else if (j < 100000000000000L) {
                i = 14;
            } else {
                i = 15;
            }
        } else if (j < 100000000000000000L) {
            if (j < 10000000000000000L) {
                i = 16;
            } else {
                i = 17;
            }
        } else if (j < 1000000000000000000L) {
            i = 18;
        } else {
            i = 19;
        }
        if (z) {
            i++;
        }
        PUR LJIJJ = LJIJJ(i);
        byte[] bArr = LJIJJ.LIZ;
        int i2 = LJIJJ.LIZJ + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr[i2] = LJLJI[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = (byte) 45;
        }
        LJIJJ.LIZJ += i;
        this.LJLILLLLZI += i;
        return this;
    }

    public final C64533PUj LJJIIJZLJL(long j) {
        if (j == 0) {
            LJJIII(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        PUR LJIJJ = LJIJJ(numberOfTrailingZeros);
        byte[] bArr = LJIJJ.LIZ;
        int i = LJIJJ.LIZJ;
        int i2 = i + numberOfTrailingZeros;
        while (true) {
            i2--;
            if (i2 >= i) {
                bArr[i2] = LJLJI[(int) (15 & j)];
                j >>>= 4;
            } else {
                LJIJJ.LIZJ += numberOfTrailingZeros;
                this.LJLILLLLZI += numberOfTrailingZeros;
                return this;
            }
        }
    }

    public final void LJJIIZI(int i) {
        PUR LJIJJ = LJIJJ(4);
        byte[] bArr = LJIJJ.LIZ;
        int i2 = LJIJJ.LIZJ;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        LJIJJ.LIZJ = i5 + 1;
        this.LJLILLLLZI += 4;
    }

    public final void LJJIJIIJIL(long j) {
        PUR LJIJJ = LJIJJ(8);
        byte[] bArr = LJIJJ.LIZ;
        int i = LJIJJ.LIZJ;
        int i2 = i + 1;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        bArr[i8] = (byte) (j & 255);
        LJIJJ.LIZJ = i8 + 1;
        this.LJLILLLLZI += 8;
    }

    public final void LJJIJIL(int i) {
        PUR LJIJJ = LJIJJ(2);
        byte[] bArr = LJIJJ.LIZ;
        int i2 = LJIJJ.LIZJ;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        LJIJJ.LIZJ = i3 + 1;
        this.LJLILLLLZI += 2;
    }

    public final void LJJJI(String string) {
        o.LJIIJ(string, "string");
        LJJIZ(0, string.length(), string);
    }

    public final void LJJJIL(int i) {
        if (i < 128) {
            LJJIII(i);
            return;
        }
        if (i < 2048) {
            LJJIII((i >> 6) | 192);
            LJJIII((i & 63) | 128);
            return;
        }
        if (55296 <= i) {
            if (57343 >= i) {
                LJJIII(63);
                return;
            }
            if (i >= 65536) {
                if (i <= 1114111) {
                    LJJIII((i >> 18) | 240);
                    LJJIII(((i >> 12) & 63) | 128);
                    LJJIII(((i >> 6) & 63) | 128);
                    LJJIII((i & 63) | 128);
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Unexpected code point: ");
                LIZ.append(Integer.toHexString(i));
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
        }
        LJJIII((i >> 12) | 224);
        LJJIII(((i >> 6) & 63) | 128);
        LJJIII((i & 63) | 128);
    }

    @Override // X.PW3
    public final boolean LJJLJ(C64537PUn bytes) {
        o.LJIIJ(bytes, "bytes");
        int size = bytes.size();
        if (size < 0 || this.LJLILLLLZI - 0 < size || bytes.size() < size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (LJ(i + 0) != bytes.getByte(i)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.PVU
    public final /* bridge */ /* synthetic */ PVU LJJZZIII(long j) {
        LJJIIJ(j);
        return this;
    }

    @Override // X.PW3
    public final C64537PUn LJLIIIL(long j) {
        return new C64537PUn(LJIIJJI(j));
    }

    @Override // X.PW3
    public final String LLIIIILZ(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long LJFF = LJFF(b, 0L, j2);
            if (LJFF != -1) {
                return LJIJI(LJFF);
            }
            if (j2 < this.LJLILLLLZI && LJ(j2 - 1) == ((byte) 13) && LJ(j2) == b) {
                return LJIJI(j2);
            }
            C64533PUj c64533PUj = new C64533PUj();
            LIZLLL(c64533PUj, 0L, Math.min(32, this.LJLILLLLZI));
            throw new EOFException("\\n not found: limit=" + Math.min(this.LJLILLLLZI, j) + " content=" + c64533PUj.LJIIL().hex() + (char) 8230);
        }
        String LIZ = C61845OOz.LIZ("limit < 0: ", j);
        LIZ.toString();
        throw new IllegalArgumentException(LIZ);
    }

    @Override // X.PVU
    public final /* bridge */ /* synthetic */ PVU LLIIIZ(String str) {
        LJJJI(str);
        return this;
    }

    @Override // X.PW3
    public final long LLJJLIIIJLLLLLLLZ(C64533PUj c64533PUj) {
        long j = this.LJLILLLLZI;
        if (j > 0) {
            c64533PUj.LLIIIL(this, j);
        }
        return j;
    }

    @Override // X.PVU
    public final PVU LLJZIJLIL(long j) {
        LJJIJIIJIL(C30581Hy.LJJIZ(j));
        return this;
    }

    @Override // X.PVU
    public final PVU LLLLIILL(int i) {
        LJJIIZI(((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8));
        return this;
    }

    @Override // X.PW3
    public final String LLLLL(Charset charset) {
        o.LJIIJ(charset, "charset");
        return LJIILIIL(this.LJLILLLLZI, charset);
    }

    @Override // X.PVU
    public final /* bridge */ /* synthetic */ PVU LLLLLILLIL(long j) {
        LJJIIJZLJL(j);
        return this;
    }

    @Override // X.PW3
    public final void a(long j) {
        if (this.LJLILLLLZI >= j) {
        } else {
            throw new EOFException();
        }
    }

    @Override // X.PVU
    public final PVU c(C64537PUn byteString) {
        o.LJIIJ(byteString, "byteString");
        byteString.write$jvm(this);
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64533PUj)) {
            return false;
        }
        long j = this.LJLILLLLZI;
        C64533PUj c64533PUj = (C64533PUj) obj;
        if (j != c64533PUj.LJLILLLLZI) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        PUR pur = this.LJLIL;
        if (pur != null) {
            PUR pur2 = c64533PUj.LJLIL;
            if (pur2 != null) {
                int i = pur.LIZIZ;
                int i2 = pur2.LIZIZ;
                long j2 = 0;
                while (j2 < this.LJLILLLLZI) {
                    long min = Math.min(pur.LIZJ - i, pur2.LIZJ - i2);
                    long j3 = 0;
                    while (j3 < min) {
                        int i3 = i + 1;
                        int i4 = i2 + 1;
                        if (pur.LIZ[i] != pur2.LIZ[i2]) {
                            return false;
                        }
                        j3++;
                        i = i3;
                        i2 = i4;
                    }
                    if (i == pur.LIZJ) {
                        pur = pur.LJFF;
                        if (pur != null) {
                            i = pur.LIZIZ;
                        } else {
                            o.LJIIZILJ();
                            throw null;
                        }
                    }
                    if (i2 == pur2.LIZJ) {
                        pur2 = pur2.LJFF;
                        if (pur2 != null) {
                            i2 = pur2.LIZIZ;
                        } else {
                            o.LJIIZILJ();
                            throw null;
                        }
                    }
                    j2 += min;
                }
                return true;
            }
            o.LJIIZILJ();
            throw null;
        }
        o.LJIIZILJ();
        throw null;
    }

    @Override // X.PVU
    public final long j(PUC source) {
        o.LJIIJ(source, "source");
        long j = 0;
        while (true) {
            long read = source.read(this, FileUtils.BUFFER_SIZE);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        o.LJIIJ(sink, "sink");
        PUR pur = this.LJLIL;
        if (pur != null) {
            int min = Math.min(sink.remaining(), pur.LIZJ - pur.LIZIZ);
            sink.put(pur.LIZ, pur.LIZIZ, min);
            int i = pur.LIZIZ + min;
            pur.LIZIZ = i;
            this.LJLILLLLZI -= min;
            if (i == pur.LIZJ) {
                this.LJLIL = pur.LIZ();
                PUS.LIZ(pur);
            }
            return min;
        }
        return -1;
    }

    @Override // X.PW3
    public final void readFully(byte[] sink) {
        o.LJIIJ(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int read = read(sink, i, sink.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // X.PW3
    public final boolean request(long j) {
        if (this.LJLILLLLZI >= Long.MAX_VALUE) {
            return true;
        }
        return false;
    }

    @Override // X.PW3
    public final void skip(long j) {
        while (j > 0) {
            PUR pur = this.LJLIL;
            if (pur != null) {
                int min = (int) Math.min(j, pur.LIZJ - pur.LIZIZ);
                long j2 = min;
                this.LJLILLLLZI -= j2;
                j -= j2;
                int i = pur.LIZIZ + min;
                pur.LIZIZ = i;
                if (i == pur.LIZJ) {
                    this.LJLIL = pur.LIZ();
                    PUS.LIZ(pur);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        o.LJIIJ(source, "source");
        int remaining = source.remaining();
        int i = remaining;
        while (i > 0) {
            PUR LJIJJ = LJIJJ(1);
            int min = Math.min(i, 8192 - LJIJJ.LIZJ);
            source.get(LJIJJ.LIZ, LJIJJ.LIZJ, min);
            i -= min;
            LJIJJ.LIZJ += min;
        }
        this.LJLILLLLZI += remaining;
        return remaining;
    }

    @Override // X.PVU
    public final /* bridge */ /* synthetic */ PVU writeByte(int i) {
        LJJIII(i);
        return this;
    }

    @Override // X.PVU
    public final /* bridge */ /* synthetic */ PVU writeInt(int i) {
        LJJIIZI(i);
        return this;
    }

    @Override // X.PVU
    public final /* bridge */ /* synthetic */ PVU writeShort(int i) {
        LJJIJIL(i);
        return this;
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m27write(byte[] source) {
        o.LJIIJ(source, "source");
        LJJ(0, source, source.length);
    }

    @Override // X.PVU
    public final /* bridge */ /* synthetic */ PVU write(byte[] bArr) {
        m27write(bArr);
        return this;
    }

    public final String LJIILIIL(long j, Charset charset) {
        o.LJIIJ(charset, "charset");
        if (j >= 0 && j <= Integer.MAX_VALUE) {
            if (this.LJLILLLLZI >= j) {
                if (j == 0) {
                    return "";
                }
                PUR pur = this.LJLIL;
                if (pur != null) {
                    int i = pur.LIZIZ;
                    if (i + j > pur.LIZJ) {
                        return new String(LJIIJJI(j), charset);
                    }
                    int i2 = (int) j;
                    String str = new String(pur.LIZ, i, i2, charset);
                    int i3 = pur.LIZIZ + i2;
                    pur.LIZIZ = i3;
                    this.LJLILLLLZI -= j;
                    if (i3 == pur.LIZJ) {
                        this.LJLIL = pur.LIZ();
                        PUS.LIZ(pur);
                    }
                    return str;
                }
                o.LJIIZILJ();
                throw null;
            }
            throw new EOFException();
        }
        String LIZ = C61845OOz.LIZ("byteCount: ", j);
        LIZ.toString();
        throw new IllegalArgumentException(LIZ);
    }

    @Override // X.PW3
    public final void LLFZ(C64533PUj sink, long j) {
        o.LJIIJ(sink, "sink");
        long j2 = this.LJLILLLLZI;
        if (j2 >= j) {
            sink.LLIIIL(this, j);
        } else {
            sink.LLIIIL(this, j2);
            throw new EOFException();
        }
    }

    @Override // X.PUJ
    public final void LLIIIL(C64533PUj source, long j) {
        int i;
        PUR LIZIZ;
        PUR pur;
        int i2;
        long j2 = j;
        o.LJIIJ(source, "source");
        if (source != this) {
            C30581Hy.LJIIIIZZ(source.LJLILLLLZI, 0L, j2);
            while (j2 > 0) {
                PUR pur2 = source.LJLIL;
                if (pur2 != null) {
                    int i3 = pur2.LIZJ;
                    int i4 = pur2.LIZIZ;
                    if (j2 < i3 - i4) {
                        PUR pur3 = this.LJLIL;
                        if (pur3 != null && (pur = pur3.LJI) != null && pur.LJ) {
                            long j3 = pur.LIZJ + j2;
                            if (pur.LIZLLL) {
                                i2 = 0;
                            } else {
                                i2 = pur.LIZIZ;
                            }
                            if (j3 - i2 <= FileUtils.BUFFER_SIZE) {
                                pur2.LIZLLL(pur, (int) j2);
                                source.LJLILLLLZI -= j2;
                                this.LJLILLLLZI += j2;
                                return;
                            }
                        }
                        int i5 = (int) j2;
                        if (i5 > 0 && i5 <= i3 - i4) {
                            if (i5 >= 1024) {
                                LIZIZ = pur2.LIZJ();
                            } else {
                                LIZIZ = PUS.LIZIZ();
                                V1M.LIZJ(pur2.LIZ, pur2.LIZIZ, 0, LIZIZ.LIZ, i5);
                            }
                            LIZIZ.LIZJ = LIZIZ.LIZIZ + i5;
                            pur2.LIZIZ += i5;
                            PUR pur4 = pur2.LJI;
                            if (pur4 != null) {
                                pur4.LIZIZ(LIZIZ);
                                source.LJLIL = LIZIZ;
                            } else {
                                o.LJIIZILJ();
                                throw null;
                            }
                        } else {
                            "byteCount out of range".toString();
                            throw new IllegalArgumentException("byteCount out of range");
                        }
                    }
                    PUR pur5 = source.LJLIL;
                    if (pur5 != null) {
                        long j4 = pur5.LIZJ - pur5.LIZIZ;
                        source.LJLIL = pur5.LIZ();
                        PUR pur6 = this.LJLIL;
                        if (pur6 == null) {
                            this.LJLIL = pur5;
                            pur5.LJI = pur5;
                            pur5.LJFF = pur5;
                        } else {
                            PUR pur7 = pur6.LJI;
                            if (pur7 != null) {
                                pur7.LIZIZ(pur5);
                                PUR pur8 = pur5.LJI;
                                if (pur8 != pur5) {
                                    if (pur8 != null) {
                                        if (pur8.LJ) {
                                            int i6 = pur5.LIZJ - pur5.LIZIZ;
                                            int i7 = FileUtils.BUFFER_SIZE - pur8.LIZJ;
                                            if (pur8.LIZLLL) {
                                                i = 0;
                                            } else {
                                                i = pur8.LIZIZ;
                                            }
                                            if (i6 <= i7 + i) {
                                                pur5.LIZLLL(pur8, i6);
                                                pur5.LIZ();
                                                PUS.LIZ(pur5);
                                            }
                                        }
                                    } else {
                                        o.LJIIZILJ();
                                        throw null;
                                    }
                                } else {
                                    "cannot compact".toString();
                                    throw new IllegalStateException("cannot compact");
                                }
                            } else {
                                o.LJIIZILJ();
                                throw null;
                            }
                        }
                        source.LJLILLLLZI -= j4;
                        this.LJLILLLLZI += j4;
                        j2 -= j4;
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
            return;
        }
        "source == this".toString();
        throw new IllegalArgumentException("source == this");
    }

    @Override // X.PUC
    public final long read(C64533PUj sink, long j) {
        o.LJIIJ(sink, "sink");
        if (j >= 0) {
            long j2 = this.LJLILLLLZI;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            sink.LLIIIL(this, j);
            return j;
        }
        String LIZ = C61845OOz.LIZ("byteCount < 0: ", j);
        LIZ.toString();
        throw new IllegalArgumentException(LIZ);
    }

    public final void LIZLLL(C64533PUj out, long j, long j2) {
        long j3 = j2;
        long j4 = j;
        o.LJIIJ(out, "out");
        C30581Hy.LJIIIIZZ(this.LJLILLLLZI, j4, j3);
        if (j3 == 0) {
            return;
        }
        out.LJLILLLLZI += j3;
        PUR pur = this.LJLIL;
        while (pur != null) {
            long j5 = pur.LIZJ - pur.LIZIZ;
            if (j4 >= j5) {
                j4 -= j5;
                pur = pur.LJFF;
            } else {
                while (j3 > 0) {
                    if (pur != null) {
                        PUR LIZJ = pur.LIZJ();
                        int i = LIZJ.LIZIZ + ((int) j4);
                        LIZJ.LIZIZ = i;
                        LIZJ.LIZJ = Math.min(i + ((int) j3), LIZJ.LIZJ);
                        PUR pur2 = out.LJLIL;
                        if (pur2 == null) {
                            LIZJ.LJI = LIZJ;
                            LIZJ.LJFF = LIZJ;
                            out.LJLIL = LIZJ;
                        } else {
                            PUR pur3 = pur2.LJI;
                            if (pur3 != null) {
                                pur3.LIZIZ(LIZJ);
                            } else {
                                o.LJIIZILJ();
                                throw null;
                            }
                        }
                        j3 -= LIZJ.LIZJ - LIZJ.LIZIZ;
                        pur = pur.LJFF;
                        j4 = 0;
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
                return;
            }
        }
        o.LJIIZILJ();
        throw null;
    }

    public final long LJFF(byte b, long j, long j2) {
        PUR pur;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 > j3 || j4 < j3) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("size=");
            LIZ.append(this.LJLILLLLZI);
            C0MT.LIZLLL(LIZ, " fromIndex=", j3, " toIndex=");
            LIZ.append(j4);
            String LIZIZ = X1D.LIZIZ(LIZ);
            LIZIZ.toString();
            throw new IllegalArgumentException(LIZIZ);
        }
        long j6 = this.LJLILLLLZI;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 == j4 || (pur = this.LJLIL) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                pur = pur.LJI;
                if (pur != null) {
                    j6 -= pur.LIZJ - pur.LIZIZ;
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
            while (j6 < j4) {
                byte[] bArr = pur.LIZ;
                int min = (int) Math.min(pur.LIZJ, (pur.LIZIZ + j4) - j6);
                for (int i = (int) ((pur.LIZIZ + j3) - j6); i < min; i++) {
                    if (bArr[i] == b) {
                        return (i - pur.LIZIZ) + j6;
                    }
                }
                j6 += pur.LIZJ - pur.LIZIZ;
                pur = pur.LJFF;
                if (pur != null) {
                    j7 = -1;
                    j3 = j6;
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
            return j7;
        }
        while (true) {
            long j8 = (pur.LIZJ - pur.LIZIZ) + j5;
            if (j8 > j3) {
                while (j5 < j4) {
                    byte[] bArr2 = pur.LIZ;
                    int min2 = (int) Math.min(pur.LIZJ, (pur.LIZIZ + j4) - j5);
                    for (int i2 = (int) ((pur.LIZIZ + j3) - j5); i2 < min2; i2++) {
                        if (bArr2[i2] == b) {
                            return (i2 - pur.LIZIZ) + j5;
                        }
                    }
                    j5 += pur.LIZJ - pur.LIZIZ;
                    pur = pur.LJFF;
                    if (pur != null) {
                        j3 = j5;
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
                return -1L;
            }
            pur = pur.LJFF;
            if (pur != null) {
                j5 = j8;
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
    }

    public final void LJJ(int i, byte[] source, int i2) {
        o.LJIIJ(source, "source");
        long j = i2;
        C30581Hy.LJIIIIZZ(source.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            PUR LJIJJ = LJIJJ(1);
            int min = Math.min(i3 - i, 8192 - LJIJJ.LIZJ);
            System.arraycopy(source, i, LJIJJ.LIZ, LJIJJ.LIZJ, min);
            i += min;
            LJIJJ.LIZJ += min;
        }
        this.LJLILLLLZI += j;
    }

    @Override // X.PVU
    public final /* bridge */ /* synthetic */ PVU LJJI(int i, byte[] bArr, int i2) {
        LJJ(i, bArr, i2);
        return this;
    }

    public final void LJJIZ(int i, int i2, String string) {
        char charAt;
        char c;
        o.LJIIJ(string, "string");
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= string.length()) {
                    while (i < i2) {
                        char charAt2 = string.charAt(i);
                        if (charAt2 < 128) {
                            PUR LJIJJ = LJIJJ(1);
                            byte[] bArr = LJIJJ.LIZ;
                            int i3 = LJIJJ.LIZJ - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt2;
                            while (true) {
                                i = i4;
                                if (i4 >= min || (charAt = string.charAt(i4)) >= 128) {
                                    break;
                                }
                                i4++;
                                bArr[i + i3] = (byte) charAt;
                            }
                            int i5 = LJIJJ.LIZJ;
                            int i6 = (i3 + i4) - i5;
                            LJIJJ.LIZJ = i5 + i6;
                            this.LJLILLLLZI += i6;
                        } else {
                            if (charAt2 < 2048) {
                                LJJIII((charAt2 >> 6) | 192);
                                LJJIII((charAt2 & '?') | 128);
                            } else if (charAt2 < 55296 || charAt2 > 57343) {
                                LJJIII((charAt2 >> '\f') | 224);
                                LJJIII(((charAt2 >> 6) & 63) | 128);
                                LJJIII((charAt2 & '?') | 128);
                            } else {
                                int i7 = i + 1;
                                if (i7 < i2) {
                                    c = string.charAt(i7);
                                } else {
                                    c = 0;
                                }
                                if (charAt2 > 56319 || 56320 > c || 57343 < c) {
                                    LJJIII(63);
                                    i = i7;
                                } else {
                                    int i8 = (((charAt2 & 10239) << 10) | (9215 & c)) + 65536;
                                    LJJIII((i8 >> 18) | 240);
                                    LJJIII(((i8 >> 12) & 63) | 128);
                                    LJJIII(((i8 >> 6) & 63) | 128);
                                    LJJIII((i8 & 63) | 128);
                                    i += 2;
                                }
                            }
                            i++;
                        }
                    }
                    return;
                }
                StringBuilder LJ = C7MY.LJ("endIndex > string.length: ", i2, " > ");
                LJ.append(string.length());
                String LIZIZ = X1D.LIZIZ(LJ);
                LIZIZ.toString();
                throw new IllegalArgumentException(LIZIZ);
            }
            String LIZLLL = C48263Iwt.LIZLLL("endIndex < beginIndex: ", i2, " < ", i);
            LIZLLL.toString();
            throw new IllegalArgumentException(LIZLLL);
        }
        String LJ2 = KMP.LJ("beginIndex < 0: ", i);
        LJ2.toString();
        throw new IllegalArgumentException(LJ2);
    }

    public final int read(byte[] sink, int i, int i2) {
        o.LJIIJ(sink, "sink");
        C30581Hy.LJIIIIZZ(sink.length, i, i2);
        PUR pur = this.LJLIL;
        if (pur != null) {
            int min = Math.min(i2, pur.LIZJ - pur.LIZIZ);
            System.arraycopy(pur.LIZ, pur.LIZIZ, sink, i, min);
            int i3 = pur.LIZIZ + min;
            pur.LIZIZ = i3;
            this.LJLILLLLZI -= min;
            if (i3 == pur.LIZJ) {
                this.LJLIL = pur.LIZ();
                PUS.LIZ(pur);
            }
            return min;
        }
        return -1;
    }

    public final C64533PUj LJJIL(String string, int i, int i2, Charset charset) {
        o.LJIIJ(string, "string");
        o.LJIIJ(charset, "charset");
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= string.length()) {
                    if (o.LJ(charset, PVC.LIZ)) {
                        LJJIZ(i, i2, string);
                        return this;
                    }
                    String substring = string.substring(i, i2);
                    o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    byte[] bytes = substring.getBytes(charset);
                    o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
                    LJJ(0, bytes, bytes.length);
                    return this;
                }
                StringBuilder LJ = C7MY.LJ("endIndex > string.length: ", i2, " > ");
                LJ.append(string.length());
                String LIZIZ = X1D.LIZIZ(LJ);
                LIZIZ.toString();
                throw new IllegalArgumentException(LIZIZ);
            }
            String LIZLLL = C48263Iwt.LIZLLL("endIndex < beginIndex: ", i2, " < ", i);
            LIZLLL.toString();
            throw new IllegalArgumentException(LIZLLL);
        }
        String LJ2 = KMP.LJ("beginIndex < 0: ", i);
        LJ2.toString();
        throw new IllegalArgumentException(LJ2);
    }
}
