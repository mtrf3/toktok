package X;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Request;

/* renamed from: X.PXa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64602PXa implements OEB {
    public final C64600PWy LIZ;
    public final C64600PWy LIZIZ;

    public static C64598PWw LJ(C64587PWl c64587PWl) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400102, "okhttp3/Call", "execute", c64587PWl, new Object[0], "okhttp3.Response", new C65300Pk0(false, "()Lokhttp3/Response;", "5559370813840941197"));
        return LIZJ.LIZ ? (C64598PWw) LIZJ.LIZIZ : c64587PWl.execute();
    }

    public static C64600PWy LJFF(C64601PWz c64601PWz) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400100, "okhttp3/OkHttpClient$Builder", "build", c64601PWz, new Object[0], "okhttp3.OkHttpClient", new C65300Pk0(false, "()Lokhttp3/OkHttpClient;", "5559370813840941197"));
        return LIZJ.LIZ ? (C64600PWy) LIZJ.LIZIZ : c64601PWz.build();
    }

    public C64602PXa() {
        C64601PWz c64601PWz = new C64601PWz();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c64601PWz.connectTimeout(10L, timeUnit);
        c64601PWz.readTimeout(10L, timeUnit);
        c64601PWz.writeTimeout(10L, timeUnit);
        this.LIZ = LJFF(c64601PWz);
        C64601PWz c64601PWz2 = new C64601PWz();
        c64601PWz2.connectTimeout(10L, timeUnit);
        c64601PWz2.readTimeout(30L, timeUnit);
        c64601PWz2.writeTimeout(30L, timeUnit);
        this.LIZIZ = LJFF(c64601PWz2);
    }

    public static void LIZLLL(java.util.Map<String, String> map, C64618PXq c64618PXq) {
        if (map != null) {
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                c64618PXq.LIZ((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    @Override // X.InterfaceC61566OEg
    public final OEI LIZ(String str, String str2) {
        return doPost(str, str2, null);
    }

    @Override // X.InterfaceC61566OEg
    public final void LIZJ(String str, long j, C61538ODe c61538ODe) {
        LIZIZ(str, j, c61538ODe, null, 0L);
    }

    @Override // X.OEB
    public final OEI doPost(String str, String str2, java.util.Map<String, String> map) {
        HashMap hashMap;
        PVJ LIZJ = PVP.LIZJ(C39745Fin.LIZJ("application/json; charset=utf-8"), str2);
        C64618PXq c64618PXq = new C64618PXq();
        c64618PXq.LJII(str);
        c64618PXq.LJ("POST", LIZJ);
        LIZLLL(map, c64618PXq);
        Request LIZIZ = c64618PXq.LIZIZ();
        C64600PWy c64600PWy = this.LIZ;
        c64600PWy.getClass();
        C64598PWw LJ = LJ(C64587PWl.LIZJ(c64600PWy, LIZIZ, false));
        C64606PXe c64606PXe = LJ.LJLJJLL;
        String str3 = null;
        if (c64606PXe == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            for (String str4 : c64606PXe.LJFF()) {
                hashMap.put(str4, c64606PXe.LIZLLL(str4));
            }
        }
        if (LJ.LJLJI == 200) {
            str3 = LJ.LJLJL.string();
        }
        return new OEI(hashMap, str3, LJ.LJLJI, LJ.LJLJJI);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0084 A[Catch: all -> 0x008c, Exception -> 0x008e, LOOP:0: B:18:0x007d->B:20:0x0084, LOOP_END, TRY_LEAVE, TryCatch #5 {Exception -> 0x008e, all -> 0x008c, blocks: (B:17:0x007b, B:18:0x007d, B:20:0x0084), top: B:16:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088 A[SYNTHETIC] */
    @Override // X.OEB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(java.lang.String r14, long r15, X.C61538ODe r17, java.util.Map<java.lang.String, java.lang.String> r18, long r19) {
        /*
            r13 = this;
            r4 = 0
            r5 = 0
            X.PXq r1 = new X.PXq     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lcc
            r1.<init>()     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lcc
            java.lang.String r0 = "GET"
            r1.LJ(r0, r4)     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lcc
            r1.LJII(r14)     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lcc
            r0 = r18
            LIZLLL(r0, r1)     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lcc
            okhttp3.Request r1 = r1.LIZIZ()     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lcc
            X.PWy r0 = r13.LIZIZ     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lcc
            r0.getClass()     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lcc
            X.PWl r0 = X.C64587PWl.LIZJ(r0, r1, r5)     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lcc
            X.PWw r10 = LJ(r0)     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lcc
            int r6 = r10.LJLJI     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lcc
            r12 = 1
            r0 = 0
            r2 = r19
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L31
            goto L33
        L31:
            r7 = 0
            goto L34
        L33:
            r7 = 1
        L34:
            java.lang.String r9 = "response code error, code: "
            r11 = 200(0xc8, float:2.8E-43)
            r8 = r17
            if (r7 == 0) goto L67
            r7 = 206(0xce, float:2.89E-43)
            if (r6 != r7) goto L41
            goto L6b
        L41:
            if (r6 != r11) goto L53
            java.lang.String r3 = "gecko-debug-tag"
            java.lang.String r2 = "partial request with code 200, reset position"
            X.OC6.LIZLLL(r3, r2)     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lcc
            X.OEF r2 = r8.LJLIL     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lcc
            r2.LJJIFFI()     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lcc
            r8.LIZIZ(r0)     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lcc
            goto L69
        L53:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lcc
            java.lang.StringBuilder r0 = X.X1D.LIZ()     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lcc
            r0.append(r9)     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lcc
            r0.append(r6)     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lcc
            java.lang.String r0 = X.X1D.LIZIZ(r0)     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lcc
            r1.<init>(r0)     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lcc
            throw r1     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lcc
        L67:
            if (r6 != r11) goto L92
        L69:
            r12 = 0
            goto L6e
        L6b:
            r8.LIZIZ(r2)     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lcc
        L6e:
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lcc
            X.PVM r0 = r10.LJLJL     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lcc
            java.io.InputStream r0 = r0.byteStream()     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lcc
            r7.<init>(r0)     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lcc
            r3 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r3]     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
        L7d:
            int r1 = r7.read(r2, r5, r3)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            r0 = -1
            if (r1 == r0) goto L88
            r8.write(r2, r5, r1)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            goto L7d
        L88:
            X.C78609UtB.LJJIIZI(r7)
            return r12
        L8c:
            r0 = move-exception
            goto Lce
        L8e:
            r3 = move-exception
            r5 = r6
            r4 = r7
            goto Laa
        L92:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lcc
            java.lang.StringBuilder r0 = X.X1D.LIZ()     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lcc
            r0.append(r9)     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lcc
            r0.append(r6)     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lcc
            java.lang.String r0 = X.X1D.LIZIZ(r0)     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lcc
            r1.<init>(r0)     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lcc
            throw r1     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lcc
        La6:
            r3 = move-exception
            r5 = r6
            goto Laa
        La9:
            r3 = move-exception
        Laa:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Lcc
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r0 = "downloadFile failed, code: "
            r1.append(r0)     // Catch: java.lang.Throwable -> Lcc
            r1.append(r5)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r0 = ", caused by:"
            r1.append(r0)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r0 = r3.getMessage()     // Catch: java.lang.Throwable -> Lcc
            r1.append(r0)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lcc
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> Lcc
            throw r2     // Catch: java.lang.Throwable -> Lcc
        Lcc:
            r0 = move-exception
            r7 = r4
        Lce:
            X.C78609UtB.LJJIIZI(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64602PXa.LIZIZ(java.lang.String, long, X.ODe, java.util.Map, long):boolean");
    }
}
