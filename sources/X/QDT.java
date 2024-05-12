package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes12.dex */
public final class QDT extends InputStream {
    public InputStream LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public int LJLJLLL;
    public int LJLL;
    public boolean LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public long LJLLL;
    public byte[] LJLJJI = new byte[4096];
    public byte[] LJLJLJ = new byte[10240];

    @Override // java.io.InputStream
    public final synchronized int available() {
        LIZ();
        int i = this.LJLJJLL - this.LJLJJL;
        if (i > 0) {
            return i;
        }
        int LIZLLL = LIZLLL(false);
        if (LIZLLL < 0) {
            return 0;
        }
        return LIZLLL;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.LJLLI) {
            return;
        }
        InputStream inputStream = this.LJLIL;
        if (inputStream != null) {
            try {
                C64718Pac.LJ(inputStream);
            } catch (Throwable unused) {
            }
            this.LJLIL = null;
        }
        this.LJLLI = true;
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        LIZ();
        if (this.LJLJJL >= this.LJLJJLL && LIZLLL(true) <= 0) {
            return -1;
        }
        byte[] bArr = this.LJLJJI;
        int i = this.LJLJJL;
        this.LJLJJL = i + 1;
        return bArr[i] & 255;
    }

    public final void LIZ() {
        if (!this.LJLLI) {
        } else {
            throw new IOException("stream is closed");
        }
    }

    public final int LJ() {
        int i;
        if (this.LJLLILLLL == 5) {
            return -1;
        }
        this.LJLLL = System.currentTimeMillis();
        if (this.LJLJJL >= this.LJLJJLL) {
            this.LJLJJLL = 0;
            this.LJLJJL = 0;
        }
        while (this.LJLLILLLL != 5) {
            LIZIZ(32);
            try {
                if (!this.LJLJL) {
                    long currentTimeMillis = System.currentTimeMillis();
                    InputStream inputStream = this.LJLIL;
                    byte[] bArr = this.LJLJLJ;
                    int i2 = this.LJLL;
                    i = inputStream.read(bArr, i2, bArr.length - i2);
                    this.LJLLJ = (int) ((System.currentTimeMillis() - currentTimeMillis) + this.LJLLJ);
                } else {
                    i = this.LJLL - this.LJLJLLL;
                }
                if (i >= 0) {
                    if (!this.LJLJL) {
                        this.LJLL += i;
                    }
                    this.LJLJL = LIZJ(true);
                    int i3 = this.LJLJJLL;
                    if (i3 > 0 && this.LJLLILLLL != 2) {
                        return i3 - this.LJLJJL;
                    }
                } else {
                    throw new IOException("Premature EOF");
                }
            } catch (IOException e) {
                throw e;
            }
        }
        return -1;
    }

    public QDT(InputStream inputStream) {
        this.LJLIL = inputStream;
    }

    public final void LIZIZ(int i) {
        int i2 = this.LJLL;
        int i3 = i2 + i;
        byte[] bArr = this.LJLJLJ;
        if (i3 > bArr.length) {
            int i4 = this.LJLJLLL;
            int i5 = i2 - i4;
            int i6 = i + i5;
            if (i6 > bArr.length) {
                byte[] bArr2 = new byte[i6];
                if (i5 > 0) {
                    System.arraycopy(bArr, i4, bArr2, 0, i5);
                }
                this.LJLJLJ = bArr2;
            } else if (i5 > 0) {
                System.arraycopy(bArr, i4, bArr, 0, i5);
            }
            this.LJLL = i5;
            this.LJLJLLL = 0;
        }
    }

    public final boolean LIZJ(boolean z) {
        int i;
        while (true) {
            int i2 = this.LJLLILLLL;
            if (i2 == 5) {
                return false;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            continue;
                        } else {
                            int i3 = this.LJLJLLL;
                            while (true) {
                                i = this.LJLL;
                                if (i3 >= i || this.LJLJLJ[i3] == 10) {
                                    break;
                                }
                                i3++;
                            }
                            if (i3 >= i) {
                                return false;
                            }
                            int i4 = this.LJLJLLL;
                            if (i3 != i4) {
                                if (this.LJLJLJ[i3 - 1] == 13) {
                                    if (i3 == i4 + 1) {
                                        this.LJLLILLLL = 5;
                                        InputStream inputStream = this.LJLIL;
                                        if (inputStream != null) {
                                            try {
                                                C64718Pac.LJ(inputStream);
                                            } catch (Throwable unused) {
                                            }
                                            this.LJLIL = null;
                                        }
                                        return false;
                                    }
                                    this.LJLJLLL = i3 + 1;
                                } else {
                                    throw new IOException("LF should be proceeded by CR");
                                }
                            } else {
                                throw new IOException("LF should be proceeded by CR");
                            }
                        }
                    } else {
                        int i5 = this.LJLJLLL;
                        int i6 = i5 + 1;
                        if (i6 >= this.LJLL) {
                            return false;
                        }
                        byte[] bArr = this.LJLJLJ;
                        if (bArr[i5] == 13) {
                            if (bArr[i6] == 10) {
                                this.LJLJLLL = i5 + 2;
                                this.LJLLILLLL = 1;
                                if (z) {
                                    return true;
                                }
                            } else {
                                throw new IOException("missing LF");
                            }
                        } else {
                            throw new IOException("missing CR");
                        }
                    }
                } else {
                    int i7 = this.LJLJLLL;
                    int i8 = this.LJLL;
                    if (i7 >= i8) {
                        return false;
                    }
                    int min = Math.min(this.LJLILLLLZI - this.LJLJI, i8 - i7);
                    byte[] bArr2 = this.LJLJJI;
                    int length = bArr2.length;
                    int i9 = this.LJLJJLL;
                    if (length < i9 + min) {
                        int i10 = this.LJLJJL;
                        int i11 = i9 - i10;
                        int i12 = i11 + min;
                        if (bArr2.length < i12) {
                            byte[] bArr3 = new byte[i12];
                            System.arraycopy(bArr2, i10, bArr3, 0, i11);
                            this.LJLJJI = bArr3;
                        } else {
                            System.arraycopy(bArr2, i10, bArr2, 0, i11);
                        }
                        this.LJLJJL = 0;
                        this.LJLJJLL = i11;
                    }
                    System.arraycopy(this.LJLJLJ, this.LJLJLLL, this.LJLJJI, this.LJLJJLL, min);
                    this.LJLJLLL += min;
                    this.LJLJJLL += min;
                    int i13 = this.LJLJI + min;
                    this.LJLJI = i13;
                    if (this.LJLILLLLZI - i13 > 0) {
                        return false;
                    }
                    this.LJLLILLLL = 3;
                }
            } else {
                int i14 = this.LJLJLLL;
                do {
                    int i15 = this.LJLL;
                    if (i14 >= i15 || this.LJLJLJ[i14] == 10) {
                        if (i14 >= i15) {
                            return false;
                        }
                        byte[] bArr4 = this.LJLJLJ;
                        int i16 = this.LJLJLLL;
                        String str = new String(bArr4, i16, (i14 - i16) + 1, "US-ASCII");
                        int i17 = 0;
                        while (i17 < str.length() && Character.digit(str.charAt(i17), 16) != -1) {
                            i17++;
                        }
                        try {
                            int parseInt = CastIntegerProtector.parseInt(str.substring(0, i17), 16);
                            this.LJLILLLLZI = parseInt;
                            this.LJLJLLL = i14 + 1;
                            this.LJLJI = 0;
                            if (parseInt > 0) {
                                this.LJLLILLLL = 2;
                                byte[] bArr5 = this.LJLJJI;
                                if (bArr5.length < parseInt) {
                                    int i18 = this.LJLJJLL;
                                    int i19 = this.LJLJJL;
                                    int i20 = i18 - i19;
                                    byte[] bArr6 = new byte[parseInt + i20];
                                    if (i20 > 0) {
                                        System.arraycopy(bArr5, i19, bArr6, 0, i20);
                                    }
                                    this.LJLJJI = bArr6;
                                    this.LJLJJL = 0;
                                    this.LJLJJLL = i20;
                                }
                            } else {
                                this.LJLLILLLL = 4;
                            }
                        } catch (NumberFormatException unused2) {
                            throw new IOException("Bogus chunk size");
                        }
                    } else {
                        i14++;
                    }
                } while (i14 - this.LJLJLLL < 2050);
                throw new IOException("Chunk header too long");
            }
        }
    }

    public final int LIZLLL(boolean z) {
        if (this.LJLLILLLL == 5) {
            return -1;
        }
        if (this.LJLJJL >= this.LJLJJLL) {
            this.LJLJJLL = 0;
            this.LJLJJL = 0;
        }
        if (!z) {
            int available = this.LJLIL.available();
            if (available > 0) {
                LIZIZ(available);
                try {
                    int read = this.LJLIL.read(this.LJLJLJ, this.LJLL, available);
                    if (read < 0) {
                        return -1;
                    }
                    this.LJLL += read;
                    LIZJ(false);
                } catch (IOException e) {
                    throw e;
                }
            }
            return this.LJLJJLL - this.LJLJJL;
        }
        while (this.LJLLILLLL != 5) {
            LIZIZ(32);
            try {
                InputStream inputStream = this.LJLIL;
                byte[] bArr = this.LJLJLJ;
                int i = this.LJLL;
                int read2 = inputStream.read(bArr, i, bArr.length - i);
                if (read2 >= 0) {
                    this.LJLL += read2;
                    LIZJ(false);
                    int i2 = this.LJLJJLL;
                    if (i2 > 0) {
                        return i2 - this.LJLJJL;
                    }
                } else {
                    throw new IOException("Premature EOF");
                }
            } catch (IOException e2) {
                throw e2;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002b, code lost:
    
        if (r1 > 0) goto L49;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized int read(byte[] r4, int r5, int r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.LIZ()     // Catch: java.lang.Throwable -> L6e
            if (r5 < 0) goto L68
            int r0 = r4.length     // Catch: java.lang.Throwable -> L6e
            if (r5 > r0) goto L68
            if (r6 < 0) goto L68
            int r1 = r5 + r6
            int r0 = r4.length     // Catch: java.lang.Throwable -> L6e
            if (r1 > r0) goto L68
            if (r1 < 0) goto L68
            r2 = 0
            if (r6 != 0) goto L17
            monitor-exit(r3)
            return r2
        L17:
            int r1 = r3.LJLJJLL     // Catch: java.lang.Throwable -> L6e
            int r0 = r3.LJLJJL     // Catch: java.lang.Throwable -> L6e
            int r1 = r1 - r0
            if (r1 > 0) goto L57
            int r1 = r3.LJLLILLLL     // Catch: java.lang.Throwable -> L6e
            r0 = 2
            if (r1 != r0) goto L4d
            int r1 = r3.LJLILLLLZI     // Catch: java.lang.Throwable -> L6e
            int r0 = r3.LJLJI     // Catch: java.lang.Throwable -> L6e
            int r1 = r1 - r0
            if (r1 >= r6) goto L2d
            r6 = r1
            if (r1 <= 0) goto L41
        L2d:
            java.io.InputStream r0 = r3.LJLIL     // Catch: java.io.IOException -> L4b java.lang.Throwable -> L6e
            int r2 = r0.read(r4, r5, r6)     // Catch: java.io.IOException -> L4b java.lang.Throwable -> L6e
            if (r2 <= 0) goto L43
            int r1 = r3.LJLJI     // Catch: java.lang.Throwable -> L6e
            int r1 = r1 + r2
            r3.LJLJI = r1     // Catch: java.lang.Throwable -> L6e
            int r0 = r3.LJLILLLLZI     // Catch: java.lang.Throwable -> L6e
            if (r1 < r0) goto L41
            r0 = 3
            r3.LJLLILLLL = r0     // Catch: java.lang.Throwable -> L6e
        L41:
            monitor-exit(r3)
            return r2
        L43:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L6e
            java.lang.String r0 = "Premature EOF"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L6e
            throw r1     // Catch: java.lang.Throwable -> L6e
        L4b:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L6e
        L4d:
            r0 = 1
            int r1 = r3.LIZLLL(r0)     // Catch: java.lang.Throwable -> L6e
            if (r1 >= 0) goto L57
            monitor-exit(r3)
            r0 = -1
            return r0
        L57:
            if (r1 >= r6) goto L5a
            r6 = r1
        L5a:
            byte[] r1 = r3.LJLJJI     // Catch: java.lang.Throwable -> L6e
            int r0 = r3.LJLJJL     // Catch: java.lang.Throwable -> L6e
            java.lang.System.arraycopy(r1, r0, r4, r5, r6)     // Catch: java.lang.Throwable -> L6e
            int r0 = r3.LJLJJL     // Catch: java.lang.Throwable -> L6e
            int r0 = r0 + r6
            r3.LJLJJL = r0     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r3)
            return r6
        L68:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L6e
            r0.<init>()     // Catch: java.lang.Throwable -> L6e
            throw r0     // Catch: java.lang.Throwable -> L6e
        L6e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDT.read(byte[], int, int):int");
    }
}
