package X;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.0ED, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0ED {
    public final C0EE LIZ;
    public final boolean[] LIZIZ;
    public boolean LIZJ;
    public final /* synthetic */ C0EG LIZLLL;

    public final void LIZ() {
        this.LIZLLL.LIZ(this, false);
    }

    public final void LIZIZ() {
        if (this.LIZJ) {
            this.LIZLLL.LIZ(this, false);
            this.LIZLLL.LJIILIIL(this.LIZ.LIZ);
        } else {
            this.LIZLLL.LIZ(this, true);
        }
    }

    public final OutputStream LIZJ() {
        final FileOutputStream fileOutputStream;
        FilterOutputStream filterOutputStream;
        C0EG c0eg = this.LIZLLL;
        if (c0eg.LJLJL > 0) {
            synchronized (c0eg) {
                C0EE c0ee = this.LIZ;
                if (c0ee.LIZLLL == this) {
                    if (!c0ee.LIZJ) {
                        this.LIZIZ[0] = true;
                    }
                    File LIZIZ = c0ee.LIZIZ(0);
                    try {
                        fileOutputStream = new FileOutputStream(LIZIZ);
                    } catch (FileNotFoundException unused) {
                        this.LIZLLL.LJLIL.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(LIZIZ);
                        } catch (FileNotFoundException unused2) {
                            return C0EG.LJLLLLLL;
                        }
                    }
                    filterOutputStream = new FilterOutputStream(fileOutputStream) { // from class: X.0EC
                        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                        public final void close() {
                            try {
                                ((FilterOutputStream) this).out.close();
                            } catch (IOException unused3) {
                                C0ED.this.LIZJ = true;
                            }
                        }

                        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
                        public final void flush() {
                            try {
                                ((FilterOutputStream) this).out.flush();
                            } catch (IOException unused3) {
                                C0ED.this.LIZJ = true;
                            }
                        }

                        @Override // java.io.FilterOutputStream, java.io.OutputStream
                        public final void write(int i) {
                            try {
                                ((FilterOutputStream) this).out.write(i);
                            } catch (IOException unused3) {
                                C0ED.this.LIZJ = true;
                            }
                        }

                        @Override // java.io.FilterOutputStream, java.io.OutputStream
                        public final void write(byte[] bArr, int i, int i2) {
                            try {
                                ((FilterOutputStream) this).out.write(bArr, i, i2);
                            } catch (IOException unused3) {
                                C0ED.this.LIZJ = true;
                            }
                        }
                    };
                } else {
                    throw new IllegalStateException();
                }
            }
            return filterOutputStream;
        }
        StringBuilder LJ = C7MY.LJ("Expected index ", 0, " to be greater than 0 and less than the maximum value count of ");
        LJ.append(this.LIZLLL.LJLJL);
        throw new IllegalArgumentException(X1D.LIZIZ(LJ));
    }

    public C0ED(C0EG c0eg, C0EE c0ee) {
        boolean[] zArr;
        this.LIZLLL = c0eg;
        this.LIZ = c0ee;
        if (c0ee.LIZJ) {
            zArr = null;
        } else {
            zArr = new boolean[c0eg.LJLJL];
        }
        this.LIZIZ = zArr;
    }
}
