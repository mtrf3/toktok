package X;

import java.io.IOException;

/* renamed from: X.IsN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47983IsN implements PX8 {
    public final /* synthetic */ InterfaceC47420IjI LIZ;
    public final /* synthetic */ C47985IsP LIZIZ;

    public C47983IsN(C47985IsP c47985IsP, InterfaceC47420IjI interfaceC47420IjI) {
        this.LIZIZ = c47985IsP;
        this.LIZ = interfaceC47420IjI;
    }

    @Override // X.PX8
    public final void onFailure(InterfaceC48133Iun interfaceC48133Iun, IOException iOException) {
        this.LIZIZ.LIZIZ = 2;
        this.LIZ.LIZIZ(null, new C47789IpF("", -9994, 0, iOException.toString()));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049 A[Catch: all -> 0x0067, TryCatch #2 {all -> 0x0067, blocks: (B:15:0x0015, B:18:0x001e, B:19:0x0043, B:21:0x0049, B:35:0x003a), top: B:14:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.PX8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResponse(X.InterfaceC48133Iun r10, X.C64598PWw r11) {
        /*
            r9 = this;
            java.lang.Class<X.IsP> r3 = X.C47985IsP.class
            monitor-enter(r3)
            X.IsP r2 = r9.LIZIZ     // Catch: java.lang.Throwable -> L70
            int r1 = r2.LIZIZ     // Catch: java.lang.Throwable -> L70
            r0 = 3
            if (r1 != r0) goto Lc
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L70
            return
        Lc:
            r0 = 2
            r2.LIZIZ = r0     // Catch: java.lang.Throwable -> L70
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L70
            r8 = 0
            X.PVM r7 = r11.LJLJL     // Catch: java.lang.Throwable -> L6e
            r6 = -9994(0xffffffffffffd8f6, float:NaN)
            java.lang.String r3 = r7.string()     // Catch: java.lang.Exception -> L38 java.lang.Throwable -> L67
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L38 java.lang.Throwable -> L67
            r5.<init>(r3)     // Catch: java.lang.Exception -> L38 java.lang.Throwable -> L67
            java.lang.String r2 = "TTHTTPNetwork"
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L67
            java.lang.String r0 = "startTask onResponse body:"
            r1.append(r0)     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L67
            r1.append(r3)     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L67
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L67
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r2, r0)     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L67
            r4 = -1
            r3 = r8
            goto L43
        L36:
            r0 = move-exception
            goto L3a
        L38:
            r0 = move-exception
            r5 = r8
        L3a:
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L67
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L67
            r4 = -9994(0xffffffffffffd8f6, float:NaN)
        L43:
            boolean r0 = r11.LIZIZ()     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L4d
            java.lang.String r3 = r11.LJLJJI     // Catch: java.lang.Throwable -> L67
            int r4 = r11.LJLJI     // Catch: java.lang.Throwable -> L67
        L4d:
            if (r7 == 0) goto L52
            r7.close()     // Catch: java.lang.Exception -> L52
        L52:
            if (r3 != 0) goto L5a
            X.IjI r0 = r9.LIZ
            r0.LIZIZ(r5, r8)
        L59:
            return
        L5a:
            X.IjI r2 = r9.LIZ
            X.IpF r1 = new X.IpF
            java.lang.String r0 = ""
            r1.<init>(r0, r6, r4, r3)
            r2.LIZIZ(r5, r1)
            goto L59
        L67:
            r0 = move-exception
            if (r7 == 0) goto L6f
            r7.close()     // Catch: java.lang.Exception -> L6f
            goto L6f
        L6e:
            r0 = move-exception
        L6f:
            throw r0
        L70:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L70
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47983IsN.onResponse(X.Iun, X.PWw):void");
    }
}
