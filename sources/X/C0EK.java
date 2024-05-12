package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: X.0EK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0EK implements Closeable {
    public final InputStream LJLIL;
    public final Charset LJLILLLLZI;
    public byte[] LJLJI;
    public int LJLJJI;
    public int LJLJJL;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
    
        if (r5[r2] == 13) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ() {
        /*
            r10 = this;
            java.io.InputStream r3 = r10.LJLIL
            monitor-enter(r3)
            byte[] r2 = r10.LJLJI     // Catch: java.lang.Throwable -> Laf
            if (r2 == 0) goto La7
            int r1 = r10.LJLJJI     // Catch: java.lang.Throwable -> Laf
            int r0 = r10.LJLJJL     // Catch: java.lang.Throwable -> Laf
            r8 = 0
            r7 = -1
            if (r1 < r0) goto L1c
            java.io.InputStream r1 = r10.LJLIL     // Catch: java.lang.Throwable -> Laf
            int r0 = r2.length     // Catch: java.lang.Throwable -> Laf
            int r0 = r1.read(r2, r8, r0)     // Catch: java.lang.Throwable -> Laf
            if (r0 == r7) goto La1
            r10.LJLJJI = r8     // Catch: java.lang.Throwable -> Laf
            r10.LJLJJL = r0     // Catch: java.lang.Throwable -> Laf
        L1c:
            int r9 = r10.LJLJJI     // Catch: java.lang.Throwable -> Laf
        L1e:
            int r0 = r10.LJLJJL     // Catch: java.lang.Throwable -> Laf
            r6 = 10
            if (r9 == r0) goto L4e
            byte[] r5 = r10.LJLJI     // Catch: java.lang.Throwable -> Laf
            r0 = r5[r9]     // Catch: java.lang.Throwable -> Laf
            if (r0 != r6) goto L4a
            int r4 = r10.LJLJJI     // Catch: java.lang.Throwable -> Laf
            if (r9 == r4) goto L48
            int r2 = r9 + (-1)
            r1 = r5[r2]     // Catch: java.lang.Throwable -> Laf
            r0 = 13
            if (r1 != r0) goto L48
        L36:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> Laf
            int r2 = r2 - r4
            java.nio.charset.Charset r0 = r10.LJLILLLLZI     // Catch: java.lang.Throwable -> Laf
            java.lang.String r0 = r0.name()     // Catch: java.lang.Throwable -> Laf
            r1.<init>(r5, r4, r2, r0)     // Catch: java.lang.Throwable -> Laf
            int r0 = r9 + 1
            r10.LJLJJI = r0     // Catch: java.lang.Throwable -> Laf
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Laf
            goto L4d
        L48:
            r2 = r9
            goto L36
        L4a:
            int r9 = r9 + 1
            goto L1e
        L4d:
            return r1
        L4e:
            X.0EJ r5 = new X.0EJ     // Catch: java.lang.Throwable -> Laf
            int r1 = r10.LJLJJL     // Catch: java.lang.Throwable -> Laf
            int r0 = r10.LJLJJI     // Catch: java.lang.Throwable -> Laf
            int r1 = r1 - r0
            int r0 = r1 + 80
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Laf
        L5a:
            byte[] r2 = r10.LJLJI     // Catch: java.lang.Throwable -> Laf
            int r1 = r10.LJLJJI     // Catch: java.lang.Throwable -> Laf
            int r0 = r10.LJLJJL     // Catch: java.lang.Throwable -> Laf
            int r0 = r0 - r1
            r5.write(r2, r1, r0)     // Catch: java.lang.Throwable -> Laf
            r10.LJLJJL = r7     // Catch: java.lang.Throwable -> Laf
            byte[] r2 = r10.LJLJI     // Catch: java.lang.Throwable -> Laf
            if (r2 != 0) goto L8c
        L6a:
            int r4 = r10.LJLJJI     // Catch: java.lang.Throwable -> Laf
        L6c:
            int r0 = r10.LJLJJL     // Catch: java.lang.Throwable -> Laf
            if (r4 == r0) goto L5a
            byte[] r2 = r10.LJLJI     // Catch: java.lang.Throwable -> Laf
            r0 = r2[r4]     // Catch: java.lang.Throwable -> Laf
            if (r0 != r6) goto L89
            int r1 = r10.LJLJJI     // Catch: java.lang.Throwable -> Laf
            if (r4 == r1) goto L7f
            int r0 = r4 - r1
            r5.write(r2, r1, r0)     // Catch: java.lang.Throwable -> Laf
        L7f:
            int r0 = r4 + 1
            r10.LJLJJI = r0     // Catch: java.lang.Throwable -> Laf
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> Laf
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Laf
            goto L9a
        L89:
            int r4 = r4 + 1
            goto L6c
        L8c:
            java.io.InputStream r1 = r10.LJLIL     // Catch: java.lang.Throwable -> Laf
            int r0 = r2.length     // Catch: java.lang.Throwable -> Laf
            int r0 = r1.read(r2, r8, r0)     // Catch: java.lang.Throwable -> Laf
            if (r0 == r7) goto L9b
            r10.LJLJJI = r8     // Catch: java.lang.Throwable -> Laf
            r10.LJLJJL = r0     // Catch: java.lang.Throwable -> Laf
            goto L6a
        L9a:
            return r0
        L9b:
            java.io.EOFException r0 = new java.io.EOFException     // Catch: java.lang.Throwable -> Laf
            r0.<init>()     // Catch: java.lang.Throwable -> Laf
            throw r0     // Catch: java.lang.Throwable -> Laf
        La1:
            java.io.EOFException r0 = new java.io.EOFException     // Catch: java.lang.Throwable -> Laf
            r0.<init>()     // Catch: java.lang.Throwable -> Laf
            throw r0     // Catch: java.lang.Throwable -> Laf
        La7:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> Laf
            java.lang.String r0 = "LineReader is closed"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Laf
            throw r1     // Catch: java.lang.Throwable -> Laf
        Laf:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Laf
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EK.LIZ():java.lang.String");
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

    public C0EK(InputStream inputStream, Charset charset) {
        if (charset != null) {
            if (charset.equals(C0EI.LIZ)) {
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
