package X;

import java.io.Closeable;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PUT implements Closeable {
    public C64533PUj LJLIL;
    public boolean LJLILLLLZI;
    public PUR LJLJI;
    public byte[] LJLJJL;
    public long LJLJJI = -1;
    public int LJLJJLL = -1;
    public int LJLJL = -1;

    public final int LIZ() {
        long j;
        long j2 = this.LJLJJI;
        C64533PUj c64533PUj = this.LJLIL;
        if (c64533PUj != null) {
            if (j2 != c64533PUj.LJLILLLLZI) {
                if (j2 == -1) {
                    j = 0;
                } else {
                    j = j2 + (this.LJLJL - this.LJLJJLL);
                }
                return LIZIZ(j);
            }
            "no more bytes".toString();
            throw new IllegalStateException("no more bytes");
        }
        o.LJIIZILJ();
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.LJLIL != null) {
            this.LJLIL = null;
            this.LJLJI = null;
            this.LJLJJI = -1L;
            this.LJLJJL = null;
            this.LJLJJLL = -1;
            this.LJLJL = -1;
            return;
        }
        "not attached to a buffer".toString();
        throw new IllegalStateException("not attached to a buffer");
    }

    public final int LIZIZ(long j) {
        C64533PUj c64533PUj = this.LJLIL;
        if (c64533PUj != null) {
            if (j >= -1) {
                long j2 = c64533PUj.LJLILLLLZI;
                if (j <= j2) {
                    if (j == -1 || j == j2) {
                        this.LJLJI = null;
                        this.LJLJJI = j;
                        this.LJLJJL = null;
                        this.LJLJJLL = -1;
                        this.LJLJL = -1;
                        return -1;
                    }
                    PUR pur = c64533PUj.LJLIL;
                    PUR pur2 = this.LJLJI;
                    long j3 = 0;
                    if (pur2 != null) {
                        long j4 = this.LJLJJI - (this.LJLJJLL - pur2.LIZIZ);
                        if (j4 > j) {
                            j2 = j4;
                        } else {
                            j3 = j4;
                            pur2 = pur;
                            pur = pur2;
                        }
                    } else {
                        pur2 = pur;
                    }
                    if (j2 - j > j - j3) {
                        while (pur != null) {
                            long j5 = (pur.LIZJ - pur.LIZIZ) + j3;
                            if (j >= j5) {
                                pur = pur.LJFF;
                                j3 = j5;
                            }
                        }
                        o.LJIIZILJ();
                        throw null;
                    }
                    while (j2 > j) {
                        if (pur2 != null) {
                            pur2 = pur2.LJI;
                            if (pur2 != null) {
                                j2 -= pur2.LIZJ - pur2.LIZIZ;
                            } else {
                                o.LJIIZILJ();
                                throw null;
                            }
                        } else {
                            o.LJIIZILJ();
                            throw null;
                        }
                    }
                    j3 = j2;
                    pur = pur2;
                    if (this.LJLILLLLZI) {
                        if (pur != null) {
                            if (pur.LIZLLL) {
                                byte[] bArr = pur.LIZ;
                                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                                o.LJFF(copyOf, "java.util.Arrays.copyOf(this, size)");
                                PUR pur3 = new PUR(copyOf, pur.LIZIZ, pur.LIZJ, false, true);
                                if (c64533PUj.LJLIL == pur) {
                                    c64533PUj.LJLIL = pur3;
                                }
                                pur.LIZIZ(pur3);
                                PUR pur4 = pur3.LJI;
                                if (pur4 != null) {
                                    pur4.LIZ();
                                    pur = pur3;
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
                    this.LJLJI = pur;
                    this.LJLJJI = j;
                    if (pur != null) {
                        this.LJLJJL = pur.LIZ;
                        int i = pur.LIZIZ + ((int) (j - j3));
                        this.LJLJJLL = i;
                        int i2 = pur.LIZJ;
                        this.LJLJL = i2;
                        return i2 - i;
                    }
                    o.LJIIZILJ();
                    throw null;
                }
            }
            String LLLZ = C16880lQ.LLLZ("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(c64533PUj.LJLILLLLZI)}, 2));
            o.LJFF(LLLZ, "java.lang.String.format(format, *args)");
            throw new ArrayIndexOutOfBoundsException(LLLZ);
        }
        "not attached to a buffer".toString();
        throw new IllegalStateException("not attached to a buffer");
    }
}
