package X;

import com.bytedance.retrofit2.RequestBuilder;
import com.bytedance.retrofit2.mime.TypedInput;

/* renamed from: X.QFt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66701QFt implements InterfaceC37346ElC<TypedInput> {
    public C64672PZs LJLIL;
    public long LJLILLLLZI = -1;
    public final /* synthetic */ C66706QFy LJLJI;
    public final /* synthetic */ QGD LJLJJI;
    public final /* synthetic */ C66700QFs LJLJJL;

    @Override // X.InterfaceC36621EYv
    public final void LJII(InterfaceC37276Ek4<TypedInput> interfaceC37276Ek4, C64797Pbt<TypedInput> c64797Pbt) {
    }

    @Override // X.InterfaceC37346ElC
    public final void LJIIIIZZ(RequestBuilder requestBuilder) {
    }

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<TypedInput> interfaceC37276Ek4, Throwable th) {
        Exception exc;
        this.LJLILLLLZI = System.currentTimeMillis();
        C66706QFy c66706QFy = this.LJLJI;
        long j = c66706QFy.LIZJ - c66706QFy.LIZ;
        long j2 = 0;
        if (j <= 0) {
            j2 = System.currentTimeMillis() - this.LJLJI.LIZ;
        }
        this.LJLJJL.LJIIJ(null, this.LJLJI, th, j, j2);
        if (th instanceof Exception) {
            exc = (Exception) th;
        } else {
            exc = new Exception(th.getMessage(), th.getCause());
        }
        LIZ(null, exc, this.LJLIL, j, j2);
        C66700QFs c66700QFs = this.LJLJJL;
        QGD qgd = this.LJLJJI;
        c66700QFs.getClass();
        c66700QFs.LJIIIIZZ(qgd, C66700QFs.LJ(th));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:5:0x0017
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:275)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:68)
        */
    @Override // X.InterfaceC37346ElC
    public final void LJ(com.bytedance.retrofit2.SsHttpCall r19, X.C64797Pbt r20) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66701QFt.LJ(com.bytedance.retrofit2.SsHttpCall, X.Pbt):void");
    }

    public C66701QFt(C66700QFs c66700QFs, C66706QFy c66706QFy, QG6 qg6) {
        this.LJLJJL = c66700QFs;
        this.LJLJI = c66706QFy;
        this.LJLJJI = qg6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0067, code lost:
    
        if (r8 != null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095 A[Catch: all -> 0x00bf, TryCatch #1 {all -> 0x00bf, blocks: (B:45:0x004e, B:47:0x0056, B:49:0x0064, B:51:0x0069, B:55:0x0079, B:26:0x0088, B:27:0x008c, B:29:0x0095, B:31:0x00a3, B:32:0x00a7, B:38:0x00b4), top: B:44:0x004e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C64797Pbt r15, java.lang.Exception r16, X.C64672PZs r17, long r18, long r20) {
        /*
            r14 = this;
            r1 = r16
            r8 = r17
            if (r1 != 0) goto L7
            return
        L7:
            boolean r0 = r1 instanceof X.QG4
            if (r0 == 0) goto L4b
            X.QG4 r1 = (X.QG4) r1
            java.lang.Exception r7 = r1.e
            int r9 = r1.retryCount
        L11:
            boolean r0 = r7 instanceof X.C64802Pby
            r3 = 0
            if (r0 == 0) goto L49
            r0 = r7
            X.Pby r0 = (X.C64802Pby) r0
            if (r0 == 0) goto L49
            int r1 = r0.getStatusCode()
            r0 = 304(0x130, float:4.26E-43)
            if (r1 != r0) goto L49
            r2 = 0
        L24:
            boolean r0 = r7 instanceof X.C64799Pbv
            if (r0 == 0) goto L35
            r1 = r7
            X.Pbv r1 = (X.C64799Pbv) r1
            X.PZo r8 = r1.getRequestInfo()
            boolean r0 = r8 instanceof X.C64672PZs
            if (r0 == 0) goto L3b
            X.PZs r8 = (X.C64672PZs) r8
        L35:
            if (r2 == 0) goto Lbf
            r5 = r15
            if (r8 != 0) goto L74
            goto L4e
        L3b:
            X.PZs r8 = new X.PZs
            r8.<init>()
            r8.LJIJI = r3
            java.lang.String r0 = r1.getRequestLog()
            r8.LJIL = r0
            goto L35
        L49:
            r2 = 1
            goto L24
        L4b:
            r7 = r1
            r9 = -1
            goto L11
        L4e:
            X.QFs r0 = r14.LJLJJL     // Catch: java.lang.Throwable -> Lbf
            X.Ek4<com.bytedance.retrofit2.mime.TypedInput> r0 = r0.LJ     // Catch: java.lang.Throwable -> Lbf
            boolean r0 = r0 instanceof X.InterfaceC48115IuV     // Catch: java.lang.Throwable -> Lbf
            if (r0 == 0) goto L69
            X.QFs r0 = r14.LJLJJL     // Catch: java.lang.Throwable -> Lbf
            X.Ek4<com.bytedance.retrofit2.mime.TypedInput> r0 = r0.LJ     // Catch: java.lang.Throwable -> Lbf
            X.IuV r0 = (X.InterfaceC48115IuV) r0     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r1 = r0.getRequestInfo()     // Catch: java.lang.Throwable -> Lbf
            boolean r0 = r1 instanceof X.C64672PZs     // Catch: java.lang.Throwable -> Lbf
            if (r0 == 0) goto L69
            r8 = r1
            X.PZs r8 = (X.C64672PZs) r8     // Catch: java.lang.Throwable -> Lbf
            if (r8 != 0) goto L74
        L69:
            X.QFs r0 = r14.LJLJJL     // Catch: java.lang.Throwable -> Lbf
            X.Ek4<com.bytedance.retrofit2.mime.TypedInput> r0 = r0.LJ     // Catch: java.lang.Throwable -> Lbf
            boolean r0 = r0 instanceof X.InterfaceC37818Eso     // Catch: java.lang.Throwable -> Lbf
            if (r0 == 0) goto L74
            if (r5 == 0) goto L74
            goto L79
        L74:
            if (r5 == 0) goto L77
            goto L88
        L77:
            r1 = 0
            goto L8c
        L79:
            X.QFs r0 = r14.LJLJJL     // Catch: java.lang.Throwable -> Lbf
            X.Ek4<com.bytedance.retrofit2.mime.TypedInput> r0 = r0.LJ     // Catch: java.lang.Throwable -> Lbf
            X.Eso r0 = (X.InterfaceC37818Eso) r0     // Catch: java.lang.Throwable -> Lbf
            r0.doCollect()     // Catch: java.lang.Throwable -> Lbf
            X.EeA r0 = r5.LIZ     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r8 = r0.LJFF     // Catch: java.lang.Throwable -> Lbf
            X.PZs r8 = (X.C64672PZs) r8     // Catch: java.lang.Throwable -> Lbf
        L88:
            X.EeA r0 = r5.LIZ     // Catch: java.lang.Throwable -> Lbf
            java.util.List<X.EJ6> r1 = r0.LIZLLL     // Catch: java.lang.Throwable -> Lbf
        L8c:
            X.QFs r0 = r14.LJLJJL     // Catch: java.lang.Throwable -> Lbf
            X.QG1 r0 = r0.LJFF     // Catch: java.lang.Throwable -> Lbf
            X.C66700QFs.LJII(r8, r1, r0, r7)     // Catch: java.lang.Throwable -> Lbf
            if (r8 == 0) goto Lb4
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lbf
            r8.LJII = r0     // Catch: java.lang.Throwable -> Lbf
            long r0 = r8.LJI     // Catch: java.lang.Throwable -> Lbf
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 > 0) goto La7
            long r0 = r14.LJLILLLLZI     // Catch: java.lang.Throwable -> Lbf
            r8.LJI = r0     // Catch: java.lang.Throwable -> Lbf
        La7:
            org.json.JSONObject r2 = r8.LJJ     // Catch: java.lang.Throwable -> Lbf
            if (r2 == 0) goto Lb4
            java.lang.String r1 = "ex"
            java.lang.String r0 = r7.getMessage()     // Catch: java.lang.Throwable -> Lb4
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> Lb4
        Lb4:
            X.QFs r4 = r14.LJLJJL     // Catch: java.lang.Throwable -> Lbf
            X.QFy r6 = r14.LJLJI     // Catch: java.lang.Throwable -> Lbf
            r10 = r18
            r12 = r20
            r4.LJIIJJI(r5, r6, r7, r8, r9, r10, r12)     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66701QFt.LIZ(X.Pbt, java.lang.Exception, X.PZs, long, long):void");
    }
}
