package X;

import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.Fh6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39640Fh6 {
    public static final byte[] LJIIJ = {Byte.MAX_VALUE, 69, 76, 70};
    public final RandomAccessFile LIZ;
    public final byte[] LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;

    public final int LIZIZ() {
        return (int) LIZLLL(2);
    }

    public final void finalize() {
        try {
            this.LIZ.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
        super.finalize();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        if (r10 == 1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01b8, code lost:
    
        r0 = X.C06460Ne.LIZJ("Invalid e_machine/EI_CLASS ELF combination: ", r9, "/", r10, ": ");
        r0.append(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01cc, code lost:
    
        throw new java.io.IOException(X.X1D.LIZIZ(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0179, code lost:
    
        if (r10 == 1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017d, code lost:
    
        if (r10 == 2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0181, code lost:
    
        if (r10 == 2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0185, code lost:
    
        if (r10 == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C39640Fh6(java.io.File r20) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39640Fh6.<init>(java.io.File):void");
    }

    public static boolean LIZ(File file) {
        int read;
        String str;
        int i;
        int i2;
        C39640Fh6 c39640Fh6 = new C39640Fh6(file);
        boolean z = true;
        if (Math.max(c39640Fh6.LJFF, c39640Fh6.LJIIIZ) <= 200000) {
            HashSet hashSet = new HashSet();
            byte[] bArr = new byte[(int) Math.max(c39640Fh6.LJFF, c39640Fh6.LJIIIZ)];
            c39640Fh6.LIZ.seek(c39640Fh6.LJ);
            c39640Fh6.LIZ.readFully(bArr, 0, (int) c39640Fh6.LJFF);
            int i3 = 0;
            while (i3 < c39640Fh6.LJFF) {
                if (c39640Fh6.LIZJ == 1) {
                    int i4 = 3;
                    i = 0;
                    do {
                        i = (i << 8) | (bArr[i4 + i3] & 255);
                        i4--;
                    } while (i4 >= 0);
                } else {
                    int i5 = 0;
                    i = 0;
                    do {
                        i = (i << 8) | (bArr[i5 + i3] & 255);
                        i5++;
                    } while (i5 <= 3);
                }
                long j = i;
                int i6 = i3 + 4;
                int i7 = c39640Fh6.LIZLLL;
                if (i7 == 8) {
                    i2 = bArr[i6] & 255;
                    i3 = AnonymousClass036.LIZIZ(i7, 3, i7, i6 + 1);
                } else {
                    int i8 = i7 + 4 + i6;
                    i2 = bArr[i8] & 255;
                    i3 = i8 + 1 + 3;
                }
                if (j != 0 && (i2 & 15) == 2) {
                    hashSet.add(Long.valueOf(j));
                }
            }
            c39640Fh6.LIZ.seek(c39640Fh6.LJIIIIZZ);
            c39640Fh6.LIZ.readFully(bArr, 0, (int) c39640Fh6.LJIIIZ);
            byte[] bytes = "je_malloc".getBytes();
            int length = bytes.length;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Long l = (Long) it.next();
                int i9 = 0;
                while (i9 < length) {
                    int longValue = (int) (l.longValue() + i9);
                    if (longValue >= c39640Fh6.LJIIIZ || bArr[longValue] != bytes[i9]) {
                        break;
                    }
                    i9++;
                }
                if (i9 == length) {
                    if (bArr[(int) (l.longValue() + i9)] != 0) {
                    }
                }
            }
            z = false;
        } else {
            c39640Fh6.LIZ.seek(c39640Fh6.LJ);
            while (c39640Fh6.LIZ.getFilePointer() < c39640Fh6.LJ + c39640Fh6.LJFF) {
                long LIZLLL = c39640Fh6.LIZLLL(4);
                int i10 = c39640Fh6.LIZLLL;
                if (i10 == 8) {
                    read = c39640Fh6.LIZ.read() & 255;
                    c39640Fh6.LIZ.read();
                    c39640Fh6.LIZIZ();
                    c39640Fh6.LIZLLL(c39640Fh6.LIZLLL);
                    c39640Fh6.LIZLLL(c39640Fh6.LIZLLL);
                } else {
                    c39640Fh6.LIZLLL(i10);
                    c39640Fh6.LIZLLL(4);
                    read = c39640Fh6.LIZ.read() & 255;
                    c39640Fh6.LIZ.read();
                    c39640Fh6.LIZIZ();
                }
                if (LIZLLL != 0) {
                    long j2 = c39640Fh6.LJIIIIZZ;
                    long j3 = c39640Fh6.LJIIIZ;
                    if (j2 == 0 || LIZLLL < 0 || LIZLLL >= j3) {
                        str = null;
                    } else {
                        str = c39640Fh6.LIZJ(j2 + LIZLLL);
                    }
                    if (!TextUtils.equals("je_malloc", str)) {
                        continue;
                    } else if (new C39641Fh7(str, read).LIZJ != 2) {
                    }
                }
            }
            z = false;
        }
        try {
            c39640Fh6.LIZ.close();
        } catch (IOException unused) {
        }
        return z;
    }

    public final String LIZJ(long j) {
        long filePointer = this.LIZ.getFilePointer();
        this.LIZ.seek(j);
        RandomAccessFile randomAccessFile = this.LIZ;
        randomAccessFile.readFully(this.LIZIZ, 0, (int) Math.min(r7.length, randomAccessFile.length() - j));
        this.LIZ.seek(filePointer);
        int i = 0;
        while (true) {
            byte[] bArr = this.LIZIZ;
            if (i < bArr.length) {
                if (bArr[i] == 0) {
                    return new String(bArr, 0, i);
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public final long LIZLLL(int i) {
        int i2 = 0;
        this.LIZ.readFully(this.LIZIZ, 0, i);
        if (this.LIZJ == 1) {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                i2 = (i2 << 8) | (this.LIZIZ[i3] & 255);
            }
        } else {
            int i4 = i - 1;
            int i5 = 0;
            while (i2 <= i4) {
                i5 = (i5 << 8) | (this.LIZIZ[i2] & 255);
                i2++;
            }
            i2 = i5;
        }
        return i2;
    }
}
