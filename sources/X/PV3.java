package X;

import android.content.Context;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes12.dex */
public final class PV3 implements InterfaceC67086QUo {
    public final Context LJLIL;
    public final PV4 LJLILLLLZI = new PV4();
    public final java.util.Map<String, Long> LJLJI = new HashMap();

    @Override // X.InterfaceC67086QUo
    public final File LJJLIIIJJIZ() {
        return this.LJLIL.getFileStreamPath("bd_sync_sdk");
    }

    public PV3(Context context) {
        this.LJLIL = context;
    }

    @Override // X.InterfaceC67086QUo
    public final void LJJJJLI(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FileCache  delete ");
        LIZ.append(str);
        C66629QCz.LIZJ(X1D.LIZIZ(LIZ));
        try {
            this.LJLILLLLZI.remove(new File(str).getName());
            C38891fp.LJIILJJIL(str);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC67086QUo
    public final void LJJJJZI(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FileCache  deleteAllFiles ");
        LIZ.append(j);
        C66629QCz.LIZJ(X1D.LIZIZ(LIZ));
        Iterator it = ((HashMap) this.LJLJI).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getValue() != null && ((Long) entry.getValue()).longValue() == j) {
                it.remove();
            }
        }
        try {
            C38891fp.LJIILL(new File(this.LJLIL.getFileStreamPath("bd_sync_sdk"), String.valueOf(j)).getAbsolutePath());
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e A[RETURN] */
    @Override // X.InterfaceC67086QUo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJJLL(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "FileCache  readCache "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C66629QCz.LIZJ(r0)
            java.io.File r2 = new java.io.File
            r2.<init>(r7)
            java.lang.String r4 = r2.getName()
            X.PV4 r0 = r6.LJLILLLLZI
            java.lang.Object r1 = r0.get(r4)
            byte[] r1 = (byte[]) r1
            r5 = 0
            if (r1 != 0) goto L68
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "FileCache  real readCache "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C66629QCz.LIZJ(r0)
            boolean r0 = r2.exists()
            if (r0 != 0) goto L42
        L40:
            r1 = r5
            goto L68
        L42:
            X.PUL r1 = new X.PUL     // Catch: java.lang.Throwable -> L54
            X.PUE r0 = X.PU7.LJI(r2)     // Catch: java.lang.Throwable -> L54
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L54
            X.PUi r0 = X.PU7.LIZ(r1)     // Catch: java.lang.Throwable -> L54
            byte[] r1 = r0.LLLLIIL()     // Catch: java.lang.Throwable -> L55
            goto L60
        L54:
            r0 = r5
        L55:
            if (r0 == 0) goto L40
            r0.close()     // Catch: java.io.IOException -> L5b
            goto L40
        L5b:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto L40
        L60:
            r0.close()     // Catch: java.io.IOException -> L64
            goto L68
        L64:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L68:
            java.lang.String r3 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L8a
            java.lang.String r0 = "UTF-8"
            r3.<init>(r1, r0)     // Catch: java.io.UnsupportedEncodingException -> L8a
            java.lang.String r2 = X.C73994T2g.LJIIL(r3)     // Catch: java.io.UnsupportedEncodingException -> L8a
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.io.UnsupportedEncodingException -> L8a
            java.lang.String r0 = "_"
            r1.append(r0)     // Catch: java.io.UnsupportedEncodingException -> L8a
            r1.append(r2)     // Catch: java.io.UnsupportedEncodingException -> L8a
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.io.UnsupportedEncodingException -> L8a
            boolean r0 = r4.endsWith(r0)     // Catch: java.io.UnsupportedEncodingException -> L8a
            if (r0 == 0) goto L8e
            return r3
        L8a:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L8e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PV3.LJJJLL(java.lang.String):java.lang.String");
    }

    @Override // X.InterfaceC67086QUo
    public final String LJIIL(long j, long j2, byte[] bArr) {
        try {
            return LJJI("synclog", C73994T2g.LJIIL(new String(bArr, "UTF-8")), bArr, j, j2);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f5 A[RETURN] */
    @Override // X.InterfaceC67086QUo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJI(java.lang.String r8, java.lang.String r9, byte[] r10, long r11, long r13) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PV3.LJJI(java.lang.String, java.lang.String, byte[], long, long):java.lang.String");
    }
}
