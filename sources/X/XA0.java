package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes16.dex */
public final class XA0 implements Closeable {
    public final InputStream LJLIL;
    public final Charset LJLILLLLZI;
    public byte[] LJLJI;
    public int LJLJJI;
    public int LJLJJL;

    public final void LIZ() {
        byte[] bArr;
        InputStream inputStream = this.LJLIL;
        if (inputStream == null || (bArr = this.LJLJI) == null) {
            return;
        }
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.LJLJJI = 0;
            this.LJLJJL = read;
            return;
        }
        throw new EOFException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0028, code lost:
    
        if (r5[r2] == 13) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZIZ() {
        /*
            r8 = this;
            java.io.InputStream r4 = r8.LJLIL
            monitor-enter(r4)
            byte[] r0 = r8.LJLJI     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L81
            int r1 = r8.LJLJJI     // Catch: java.lang.Throwable -> L89
            int r0 = r8.LJLJJL     // Catch: java.lang.Throwable -> L89
            if (r1 < r0) goto L10
            r8.LIZ()     // Catch: java.lang.Throwable -> L89
        L10:
            int r7 = r8.LJLJJI     // Catch: java.lang.Throwable -> L89
        L12:
            int r0 = r8.LJLJJL     // Catch: java.lang.Throwable -> L89
            r6 = 10
            if (r7 == r0) goto L42
            byte[] r5 = r8.LJLJI     // Catch: java.lang.Throwable -> L89
            r0 = r5[r7]     // Catch: java.lang.Throwable -> L89
            if (r0 != r6) goto L3e
            int r3 = r8.LJLJJI     // Catch: java.lang.Throwable -> L89
            if (r7 == r3) goto L3c
            int r2 = r7 + (-1)
            r1 = r5[r2]     // Catch: java.lang.Throwable -> L89
            r0 = 13
            if (r1 != r0) goto L3c
        L2a:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L89
            int r2 = r2 - r3
            java.nio.charset.Charset r0 = r8.LJLILLLLZI     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = r0.name()     // Catch: java.lang.Throwable -> L89
            r1.<init>(r5, r3, r2, r0)     // Catch: java.lang.Throwable -> L89
            int r0 = r7 + 1
            r8.LJLJJI = r0     // Catch: java.lang.Throwable -> L89
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L89
            goto L41
        L3c:
            r2 = r7
            goto L2a
        L3e:
            int r7 = r7 + 1
            goto L12
        L41:
            return r1
        L42:
            X.XA1 r5 = new X.XA1     // Catch: java.lang.Throwable -> L89
            int r1 = r8.LJLJJL     // Catch: java.lang.Throwable -> L89
            int r0 = r8.LJLJJI     // Catch: java.lang.Throwable -> L89
            int r1 = r1 - r0
            int r0 = r1 + 80
            r5.<init>(r8, r0)     // Catch: java.lang.Throwable -> L89
        L4e:
            byte[] r2 = r8.LJLJI     // Catch: java.lang.Throwable -> L89
            int r1 = r8.LJLJJI     // Catch: java.lang.Throwable -> L89
            int r0 = r8.LJLJJL     // Catch: java.lang.Throwable -> L89
            int r0 = r0 - r1
            r5.write(r2, r1, r0)     // Catch: java.lang.Throwable -> L89
            r0 = -1
            r8.LJLJJL = r0     // Catch: java.lang.Throwable -> L89
            r8.LIZ()     // Catch: java.lang.Throwable -> L89
            int r3 = r8.LJLJJI     // Catch: java.lang.Throwable -> L89
        L60:
            int r0 = r8.LJLJJL     // Catch: java.lang.Throwable -> L89
            if (r3 == r0) goto L4e
            byte[] r2 = r8.LJLJI     // Catch: java.lang.Throwable -> L89
            r0 = r2[r3]     // Catch: java.lang.Throwable -> L89
            if (r0 != r6) goto L7d
            int r1 = r8.LJLJJI     // Catch: java.lang.Throwable -> L89
            if (r3 == r1) goto L73
            int r0 = r3 - r1
            r5.write(r2, r1, r0)     // Catch: java.lang.Throwable -> L89
        L73:
            int r0 = r3 + 1
            r8.LJLJJI = r0     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L89
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L89
            goto L80
        L7d:
            int r3 = r3 + 1
            goto L60
        L80:
            return r0
        L81:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = "LineReader is closed"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L89
            throw r1     // Catch: java.lang.Throwable -> L89
        L89:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L89
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XA0.LIZIZ():java.lang.String");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.LJLIL) {
            if (this.LJLJI != null) {
                this.LJLJI = null;
                this.LJLIL.close();
            }
        }
    }

    public XA0(InputStream inputStream, Charset charset) {
        if (charset != null) {
            if (charset.equals(C84377X9p.LIZ)) {
                this.LJLIL = inputStream;
                this.LJLILLLLZI = charset;
                this.LJLJI = new byte[FileUtils.BUFFER_SIZE];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw null;
    }
}
