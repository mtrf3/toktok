package X;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PUL implements PUC {
    public byte LJLIL;
    public final C64532PUi LJLILLLLZI;
    public final Inflater LJLJI;
    public final PUK LJLJJI;
    public final CRC32 LJLJJL;

    @Override // X.PUC, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LJLJJI.close();
    }

    @Override // X.PUC
    public final C64545PUv timeout() {
        return this.LJLILLLLZI.timeout();
    }

    public PUL(PUC source) {
        o.LJIIJ(source, "source");
        C64532PUi c64532PUi = new C64532PUi(source);
        this.LJLILLLLZI = c64532PUi;
        Inflater inflater = new Inflater(true);
        this.LJLJI = inflater;
        this.LJLJJI = new PUK(c64532PUi, inflater);
        this.LJLJJL = new CRC32();
    }

    @Override // X.PUC
    public final long read(C64533PUj sink, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        o.LJIIJ(sink, "sink");
        byte b = 1;
        if (j >= 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.LJLIL == 0) {
                this.LJLILLLLZI.a(10L);
                byte LJ = this.LJLILLLLZI.LJLILLLLZI.LJ(3L);
                if (((LJ >> 1) & 1) == 1) {
                    z = true;
                    LIZIZ(this.LJLILLLLZI.LJLILLLLZI, 0L, 10L);
                } else {
                    z = false;
                }
                LIZ(8075, this.LJLILLLLZI.readShort(), "ID1ID2");
                this.LJLILLLLZI.skip(8L);
                if (((LJ >> 2) & 1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    this.LJLILLLLZI.a(2L);
                    if (z) {
                        LIZIZ(this.LJLILLLLZI.LJLILLLLZI, 0L, 2L);
                    }
                    int readShort = this.LJLILLLLZI.LJLILLLLZI.readShort() & 65535;
                    long j2 = (short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8));
                    this.LJLILLLLZI.a(j2);
                    if (z) {
                        LIZIZ(this.LJLILLLLZI.LJLILLLLZI, 0L, j2);
                    }
                    this.LJLILLLLZI.skip(j2);
                }
                if (((LJ >> 3) & 1) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    long LIZ = this.LJLILLLLZI.LIZ((byte) 0, 0L, Long.MAX_VALUE);
                    if (LIZ != -1) {
                        if (z) {
                            LIZIZ(this.LJLILLLLZI.LJLILLLLZI, 0L, LIZ + 1);
                        }
                        this.LJLILLLLZI.skip(LIZ + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((LJ >> 4) & 1) == 1) {
                    long LIZ2 = this.LJLILLLLZI.LIZ((byte) 0, 0L, Long.MAX_VALUE);
                    if (LIZ2 != -1) {
                        if (z) {
                            b = 1;
                            LIZIZ(this.LJLILLLLZI.LJLILLLLZI, 0L, LIZ2 + 1);
                        } else {
                            b = 1;
                        }
                        this.LJLILLLLZI.skip(LIZ2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z) {
                    C64532PUi c64532PUi = this.LJLILLLLZI;
                    c64532PUi.a(2L);
                    int readShort2 = c64532PUi.LJLILLLLZI.readShort() & 65535;
                    LIZ((short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) this.LJLJJL.getValue(), "FHCRC");
                    this.LJLJJL.reset();
                }
                this.LJLIL = b;
            }
            if (this.LJLIL == b) {
                long j3 = sink.LJLILLLLZI;
                long read = this.LJLJJI.read(sink, j);
                if (read != -1) {
                    LIZIZ(sink, j3, read);
                    return read;
                }
                this.LJLIL = (byte) 2;
            }
            if (this.LJLIL == 2) {
                LIZ(this.LJLILLLLZI.LJIIZILJ(), (int) this.LJLJJL.getValue(), "CRC");
                LIZ(this.LJLILLLLZI.LJIIZILJ(), (int) this.LJLJI.getBytesWritten(), "ISIZE");
                this.LJLIL = (byte) 3;
                if (!this.LJLILLLLZI.LLJ()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        String LIZ3 = C61845OOz.LIZ("byteCount < 0: ", j);
        LIZ3.toString();
        throw new IllegalArgumentException(LIZ3);
    }

    public static void LIZ(int i, int i2, String str) {
        if (i2 == i) {
            return;
        }
        String LLLZ = C16880lQ.LLLZ("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
        o.LJFF(LLLZ, "java.lang.String.format(this, *args)");
        throw new IOException(LLLZ);
    }

    public final void LIZIZ(C64533PUj c64533PUj, long j, long j2) {
        PUR pur = c64533PUj.LJLIL;
        if (pur == null) {
            o.LJIIZILJ();
            throw null;
        }
        do {
            int i = pur.LIZJ;
            int i2 = pur.LIZIZ;
            if (j >= i - i2) {
                j -= i - i2;
                pur = pur.LJFF;
            } else {
                while (j2 > 0) {
                    int min = (int) Math.min(pur.LIZJ - r4, j2);
                    this.LJLJJL.update(pur.LIZ, (int) (pur.LIZIZ + j), min);
                    j2 -= min;
                    pur = pur.LJFF;
                    if (pur != null) {
                        j = 0;
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
                return;
            }
        } while (pur != null);
        o.LJIIZILJ();
        throw null;
    }
}
