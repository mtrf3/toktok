package X;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* renamed from: X.0uR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22470uR {
    public static byte[] LIZ(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static int LJ(InputStream inputStream) {
        return (int) LIZLLL(inputStream, 2);
    }

    public static byte[] LIZIZ(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                throw new IllegalStateException(KMP.LJ("Not enough bytes to read: ", i));
            }
        }
        return bArr;
    }

    public static long LIZLLL(InputStream inputStream, int i) {
        byte[] LIZIZ = LIZIZ(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (LIZIZ[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    public static void LJI(OutputStream outputStream, int i) {
        LJFF(outputStream, i, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r2.finished() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] LIZJ(java.io.InputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r2 = new java.util.zip.Inflater
            r2.<init>()
            byte[] r7 = new byte[r10]     // Catch: java.lang.Throwable -> L86
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r6 = new byte[r0]     // Catch: java.lang.Throwable -> L86
            r5 = 0
            r4 = 0
            r3 = 0
        Le:
            boolean r0 = r2.finished()     // Catch: java.lang.Throwable -> L86
            if (r0 != 0) goto L54
            boolean r0 = r2.needsDictionary()     // Catch: java.lang.Throwable -> L86
            if (r0 != 0) goto L54
            if (r4 >= r9) goto L54
            int r1 = r8.read(r6)     // Catch: java.lang.Throwable -> L86
            if (r1 < 0) goto L39
            r2.setInput(r6, r5, r1)     // Catch: java.lang.Throwable -> L86
            int r0 = r10 - r3
            int r0 = r2.inflate(r7, r3, r0)     // Catch: java.util.zip.DataFormatException -> L2e java.lang.Throwable -> L86
            int r3 = r3 + r0
            int r4 = r4 + r1
            goto Le
        L2e:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()     // Catch: java.lang.Throwable -> L86
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L86
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L86
            throw r0     // Catch: java.lang.Throwable -> L86
        L39:
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r1.append(r0)     // Catch: java.lang.Throwable -> L86
            r1.append(r9)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = " bytes"
            r1.append(r0)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L86
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L86
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L86
            throw r0     // Catch: java.lang.Throwable -> L86
        L54:
            if (r4 != r9) goto L68
            boolean r0 = r2.finished()     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L60
            r2.end()
            return r7
        L60:
            java.lang.String r1 = "Inflater did not finish"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L86
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L86
            throw r0     // Catch: java.lang.Throwable -> L86
        L68:
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = "Didn't read enough bytes during decompression. expected="
            r1.append(r0)     // Catch: java.lang.Throwable -> L86
            r1.append(r9)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = " actual="
            r1.append(r0)     // Catch: java.lang.Throwable -> L86
            r1.append(r4)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L86
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L86
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L86
            throw r0     // Catch: java.lang.Throwable -> L86
        L86:
            r0 = move-exception
            r2.end()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22470uR.LIZJ(java.io.InputStream, int, int):byte[]");
    }

    public static void LJFF(OutputStream outputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }
}
