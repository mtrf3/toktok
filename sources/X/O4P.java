package X;

import com.bytedance.forest.chain.fetchers.CDNFetcher;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class O4P {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public volatile File LIZ;
    public int LIZIZ;
    public volatile RandomAccessFile LIZJ;
    public volatile int LIZLLL;
    public volatile boolean LJ;
    public boolean LJFF;
    public volatile int LJI;
    public int LJII;

    public synchronized void LIZJ() {
        Boolean bool;
        C76800UCe c76800UCe;
        try {
            RandomAccessFile randomAccessFile = this.LIZJ;
            if (randomAccessFile != null) {
                randomAccessFile.close();
                c76800UCe = C76800UCe.LIZ;
            } else {
                c76800UCe = null;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        try {
            File file = this.LIZ;
            if (file != null) {
                bool = Boolean.valueOf(C16880lQ.LLLZZIL(file));
            } else {
                bool = null;
            }
            C3C5.m7constructorimpl(bool);
        } catch (Throwable th2) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th2));
        }
        this.LIZ = null;
        this.LIZJ = null;
        this.LJ = false;
        this.LIZLLL = -1;
    }

    public abstract void LJ(int i);

    public abstract void LJFF(int i);

    public abstract void LJII();

    public abstract byte[] LJIIIZ();

    public abstract int LJIIJ(int i, int i2, byte[] bArr, int i3);

    public abstract void LJIIJJI(int i, byte b);

    public abstract void LJIIL(int i, int i2, byte[] bArr, int i3);

    public abstract int LJIILIIL(InputStream inputStream, int i);

    public final void LIZLLL() {
        C76800UCe c76800UCe;
        if (this.LJ || this.LIZIZ == this.LIZLLL) {
            try {
                RandomAccessFile randomAccessFile = this.LIZJ;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                    c76800UCe = C76800UCe.LIZ;
                } else {
                    c76800UCe = null;
                }
                C3C5.m7constructorimpl(c76800UCe);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
            this.LIZJ = null;
        }
    }

    public O4P(boolean z) {
        File file;
        if (z) {
            CDNFetcher.Companion.getClass();
            File LIZ = O4E.LIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(String.valueOf(System.currentTimeMillis()));
            LIZ2.append("-");
            LIZ2.append(UUID.randomUUID().toString());
            LIZ2.append("_tmp");
            LIZ2.append("");
            file = new File(LIZ, X1D.LIZIZ(LIZ2));
            file.createNewFile();
        } else {
            file = null;
        }
        this.LIZ = file;
        this.LIZIZ = Integer.MAX_VALUE;
        this.LIZJ = z ? new RandomAccessFile(this.LIZ, "rw") : null;
    }

    public final boolean LIZ(int i) {
        if (this.LIZ != null) {
            if (i <= this.LIZLLL) {
                if (i == this.LIZLLL) {
                    return true;
                }
                StringBuilder LJ = C7MY.LJ("filePtr not match, startPos ", i, " filePtr ");
                LJ.append(this.LIZLLL);
                C39930Flm.LIZJ("META", X1D.LIZIZ(LJ), null, true);
                return false;
            }
            StringBuilder LJ2 = C7MY.LJ("filePtr is illegal, startPos ", i, ", filePtr ");
            LJ2.append(this.LIZLLL);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(X1D.LIZIZ(LJ2));
            C39930Flm.LIZJ("META", "filePtr is illegal", illegalArgumentException, true);
            throw illegalArgumentException;
        }
        IOException iOException = new IOException(KMP.LJ("meta does not support disk cache, startPos ", i));
        C39930Flm.LIZJ("META", "meta does not support disk cache", iOException, true);
        throw iOException;
    }

    public final void LIZIZ(int i) {
        if (i == this.LJI) {
            return;
        }
        StringBuilder LJ = C7MY.LJ("startPos not match, startPos ", i, ", ptr ");
        LJ.append(this.LJI);
        throw new IllegalArgumentException(X1D.LIZIZ(LJ));
    }

    public final boolean LJIIIIZZ(File file) {
        C76800UCe c76800UCe;
        o.LJIIJ(file, "file");
        if (this.LJ) {
            return true;
        }
        synchronized (this) {
            if (this.LJ) {
                return true;
            }
            if (this.LIZ != null) {
                try {
                    if (this.LIZLLL != this.LIZIZ) {
                        LJII();
                    }
                    if (this.LIZLLL == this.LIZIZ) {
                        try {
                            RandomAccessFile randomAccessFile = this.LIZJ;
                            if (randomAccessFile != null) {
                                randomAccessFile.close();
                                c76800UCe = C76800UCe.LIZ;
                            } else {
                                c76800UCe = null;
                            }
                            C3C5.m7constructorimpl(c76800UCe);
                        } catch (Throwable th) {
                            C3C5.m7constructorimpl(C141335gf.LIZ(th));
                        }
                        this.LIZJ = null;
                        try {
                            File file2 = this.LIZ;
                            if (file2 != null) {
                                if (!file2.renameTo(file)) {
                                    C39930Flm.LIZJ("META", "rename failed", null, true);
                                    return false;
                                }
                                this.LIZ = file;
                                this.LJ = true;
                                return true;
                            }
                            o.LJIIZILJ();
                            throw null;
                        } catch (Throwable th2) {
                            C39930Flm.LIZJ("META", "rename failed", th2, true);
                            return false;
                        }
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("flush finished with unexpected file length, filePtr ");
                    LIZ.append(this.LIZLLL);
                    LIZ.append(" endPos ");
                    LIZ.append(this.LIZIZ);
                    throw new IOException(X1D.LIZIZ(LIZ));
                } catch (Throwable th3) {
                    C39930Flm.LIZJ("META", "flush failed", th3, true);
                    return false;
                }
            }
            byte[] LJIIIZ = LJIIIZ();
            if (LJIIIZ != null) {
                if (!O4C.LJFF(this, file, LJIIIZ)) {
                    return false;
                }
                this.LIZ = file;
                this.LIZLLL += LJIIIZ.length;
                this.LJ = true;
                return true;
            }
            C39930Flm.LIZJ("META", "unexpected code reached", null, true);
            this.LJFF = true;
            return false;
        }
    }

    public final void LJI(int i, byte[] bytes, int i2) {
        String str;
        Boolean bool;
        o.LJIIJ(bytes, "bytes");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start flush file ");
        File file = this.LIZ;
        if (file != null) {
            str = file.getName();
        } else {
            str = null;
        }
        C0EH.LIZLLL(LIZ, str, " at startPos ", i2, " len ");
        LIZ.append(i);
        LIZ.append(" filePoint ");
        LIZ.append(this.LIZLLL);
        C39930Flm.LJI("META", X1D.LIZIZ(LIZ), false, 4);
        if (i == 0 || this.LJ || !LIZ(i2)) {
            return;
        }
        if (this.LIZ != null) {
            synchronized (this) {
                if (!this.LJ && LIZ(i2)) {
                    if (this.LIZ != null) {
                        RandomAccessFile randomAccessFile = this.LIZJ;
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.write(bytes, 0, i);
                                this.LIZLLL += i;
                                if (this.LIZLLL == this.LIZIZ) {
                                    C39930Flm.LJI("META", "load to endPos", false, 4);
                                    try {
                                        randomAccessFile.close();
                                        C3C5.m7constructorimpl(C76800UCe.LIZ);
                                    } catch (Throwable th) {
                                        C3C5.m7constructorimpl(C141335gf.LIZ(th));
                                    }
                                    this.LIZJ = null;
                                    this.LJFF = false;
                                    return;
                                }
                                if (this.LIZLLL > this.LIZIZ) {
                                    this.LJFF = true;
                                    try {
                                        File file2 = this.LIZ;
                                        if (file2 != null) {
                                            bool = Boolean.valueOf(C16880lQ.LLLZZIL(file2));
                                        } else {
                                            bool = null;
                                        }
                                        C3C5.m7constructorimpl(bool);
                                    } catch (Throwable th2) {
                                        C3C5.m7constructorimpl(C141335gf.LIZ(th2));
                                    }
                                    throw new IOException("unexpected length of file");
                                }
                                this.LJFF = false;
                                return;
                            } finally {
                            }
                        }
                        this.LJFF = true;
                        IOException iOException = new IOException("failed to attain random access file");
                        C39930Flm.LIZJ("META", "failed to attain random access file", iOException, true);
                        throw iOException;
                    }
                    this.LJFF = true;
                    IOException iOException2 = new IOException("failed to attain cache file");
                    C39930Flm.LIZJ("META", "failed to attain cache file", iOException2, true);
                    throw iOException2;
                }
                return;
            }
        }
        this.LJFF = true;
        IOException iOException3 = new IOException("failed to attain cache file");
        C39930Flm.LIZJ("META", "failed to attain cache file", iOException3, true);
        throw iOException3;
    }
}
