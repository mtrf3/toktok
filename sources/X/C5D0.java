package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.ugc.android.editor.track.frame.VideoFrameCache$executeLoadFromFile$1", f = "VideoFrameCache.kt", l = {208}, m = "invokeSuspend")
/* renamed from: X.5D0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5D0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C5D1 LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C131235Db LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5D0(C131235Db c131235Db, InterfaceC67352kd<? super C5D0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c131235Db;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5D0(this.LJLJI, interfaceC67352kd);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:29:0x00ae
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3 A[Catch: Exception -> 0x00ab, TRY_LEAVE, TryCatch #3 {Exception -> 0x00ab, blocks: (B:9:0x009f, B:35:0x00a3), top: B:8:0x009f }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x00a1 -> B:11:0x003a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a3 -> B:11:0x003a). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLILLLLZI
            r4 = 1
            if (r0 == 0) goto L18
            if (r0 != r4) goto L10
            X.5D1 r6 = r9.LJLIL
            X.C141335gf.LIZJ(r10)     // Catch: java.lang.Exception -> L1c
            goto L9f
        L10:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L18:
            X.C141335gf.LIZJ(r10)
            goto L3a
        L1c:
            r3 = move-exception
        L1d:
            java.lang.String r2 = "VideoFrameCache"
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "decode file cache failed: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ".path "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C131935Ft.LIZLLL(r2, r0)
        L3a:
            X.5Db r2 = r9.LJLJI
            java.util.LinkedList<X.5D1> r1 = r2.LJLJJLL
            monitor-enter(r1)
            java.util.LinkedList<X.5D1> r0 = r2.LJLJJLL     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r6 = r0.poll()     // Catch: java.lang.Throwable -> Lb2
            r0 = r6
            X.5D1 r0 = (X.C5D1) r0     // Catch: java.lang.Throwable -> Lb2
            if (r0 != 0) goto L50
            int r0 = r2.LJLJL     // Catch: java.lang.Throwable -> Lb2
            int r0 = r0 + (-1)
            r2.LJLJL = r0     // Catch: java.lang.Throwable -> Lb2
        L50:
            X.5D1 r6 = (X.C5D1) r6     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r1)
            if (r6 != 0) goto L58
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L58:
            X.5CG r8 = X.C5CG.LIZ     // Catch: java.lang.Exception -> Lae
            android.content.Context r7 = X.C58S.LIZ()     // Catch: java.lang.Exception -> Lae
            java.lang.String r3 = r6.LIZIZ     // Catch: java.lang.Exception -> Lae
            X.5CV r2 = new X.5CV     // Catch: java.lang.Exception -> Lae
            r2.<init>()     // Catch: java.lang.Exception -> Lae
            X.5Db r0 = r9.LJLJI     // Catch: java.lang.Exception -> Lae
            android.util.Size r0 = r0.LJLIL     // Catch: java.lang.Exception -> Lae
            int r0 = r0.getWidth()     // Catch: java.lang.Exception -> Lae
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> Lae
            r2.LIZ = r0     // Catch: java.lang.Exception -> Lae
            X.5Db r0 = r9.LJLJI     // Catch: java.lang.Exception -> Lae
            android.util.Size r0 = r0.LJLIL     // Catch: java.lang.Exception -> Lae
            int r0 = r0.getHeight()     // Catch: java.lang.Exception -> Lae
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> Lae
            r2.LIZIZ = r0     // Catch: java.lang.Exception -> Lae
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.Exception -> Lae
            java.lang.String r0 = "format"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)     // Catch: java.lang.Exception -> Lae
            r2.LIZJ = r1     // Catch: java.lang.Exception -> Lae
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch: java.lang.Exception -> Lae
            r2.LIZ(r0)     // Catch: java.lang.Exception -> Lae
            X.5CW r0 = new X.5CW     // Catch: java.lang.Exception -> Lae
            r0.<init>(r2)     // Catch: java.lang.Exception -> Lae
            r9.LJLIL = r6     // Catch: java.lang.Exception -> Lae
            r9.LJLILLLLZI = r4     // Catch: java.lang.Exception -> Lae
            java.lang.Object r10 = r8.LIZIZ(r7, r3, r0, r9)     // Catch: java.lang.Exception -> Lae
            if (r10 != r5) goto L9f
            goto Lb1
        L9f:
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10     // Catch: java.lang.Exception -> Lab
            if (r10 == 0) goto L3a
            X.5Db r1 = r9.LJLJI     // Catch: java.lang.Exception -> Lab
            X.5DY r0 = r6.LIZ     // Catch: java.lang.Exception -> Lab
            r1.LIZ(r0, r10)     // Catch: java.lang.Exception -> Lab
            goto L3a
        Lab:
            r3 = move-exception
            goto L1d
        Lae:
            r3 = move-exception
            goto L1d
        Lb1:
            return r5
        Lb2:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5D0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
