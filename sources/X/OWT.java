package X;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class OWT implements InterfaceC78910Uy2 {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ Context LIZJ;

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LIZ(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LIZJ(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LJ(String str, String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LJFF(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final void LIZIZ(String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("refuse_permission", strArr);
        C0K2.LJII(1, "ttlive_replay_permission", hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        if (r2 == null) goto L13;
     */
    @Override // X.InterfaceC78910Uy2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String... r7) {
        /*
            r6 = this;
            java.io.File r1 = new java.io.File
            java.lang.String r0 = r6.LIZ
            r1.<init>(r0)
            byte[] r4 = X.C31880CfE.LIZIZ(r1)
            java.lang.String r5 = "Failed to save image"
            if (r4 == 0) goto L12
            int r0 = r4.length
            if (r0 != 0) goto L16
        L12:
            X.C30868C9o.LJI(r5)
            return
        L16:
            java.lang.StringBuilder r3 = X.X1D.LIZ()
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r0 = r6.LIZIZ
            r2.append(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r2.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r2)
            java.lang.String r0 = X.C38352F3k.LIZJ(r0)
            r3.append(r0)
            java.lang.String r0 = ".png"
            r3.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r3)
            android.content.Context r0 = r6.LIZJ
            android.net.Uri r3 = X.C268613q.LIZJ(r0, r1)
            r2 = 0
            android.content.Context r0 = r6.LIZJ     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L90
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L90
            java.io.OutputStream r2 = r0.openOutputStream(r3)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L90
            r2.write(r4)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L90
            r2.flush()     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L90
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L90
            java.lang.String r0 = "android.intent.action.MEDIA_SCANNER_SCAN_FILE"
            r1.<init>(r0)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L90
            r1.setData(r3)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L90
            android.content.Context r0 = r6.LIZJ     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L90
            r0.sendBroadcast(r1)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L90
            android.content.Context r1 = r6.LIZJ     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L90
            r0 = 2131847421(0x7f1168fd, float:1.9328319E38)
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L90
            X.C30868C9o.LJI(r0)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L90
            goto L76
        L71:
            X.C30868C9o.LJI(r5)     // Catch: java.lang.Throwable -> L90
            if (r2 == 0) goto L79
        L76:
            r2.close()     // Catch: java.io.IOException -> L79
        L79:
            java.io.File r1 = new java.io.File
            java.lang.String r0 = r6.LIZ
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L8f
            boolean r0 = r1.isFile()
            if (r0 == 0) goto L8f
            X.C16880lQ.LLLZZIL(r1)
        L8f:
            return
        L90:
            r0 = move-exception
            if (r2 == 0) goto L96
            r2.close()     // Catch: java.io.IOException -> L96
        L96:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OWT.LIZLLL(java.lang.String[]):void");
    }

    public OWT(String str, String str2, Context context) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = context;
    }
}
