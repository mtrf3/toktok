package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.speechtosong.handlers.UploadAudioHandler$handleData$2", f = "UploadAudioHandler.kt", l = {28}, m = "invokeSuspend")
/* renamed from: X.6gb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166776gb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C166856gj LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C166776gb(C166856gj c166856gj, InterfaceC67352kd<? super C166776gb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c166856gj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C166776gb c166776gb = new C166776gb(this.LJLJI, interfaceC67352kd);
        c166776gb.LJLILLLLZI = obj;
        return c166776gb;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c0  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r12.LJLIL
            java.lang.String r6 = ""
            r5 = 1
            if (r0 == 0) goto L5e
            if (r0 != r5) goto Lc3
            X.C141335gf.LIZJ(r13)
        Le:
            X.6gE r13 = (X.C166546gE) r13
            boolean r0 = r13.LIZ
            if (r0 == 0) goto L3a
            X.6gj r1 = r12.LJLJI
            java.lang.String r0 = r13.LIZIZ
            r1.LJII = r0
            java.lang.String r2 = r1.LJI
            if (r2 == 0) goto L2a
            if (r0 == 0) goto L2a
            X.6fm r1 = new X.6fm
            r1.<init>(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.6fm> r0 = X.C166726gW.LIZIZ
            r0.put(r2, r1)
        L2a:
            X.6gj r1 = r12.LJLJI
            java.lang.String r0 = r1.LJII
            if (r0 == 0) goto Lc0
            X.6gr r1 = r1.LJIIIZ
            r0 = 0
            r1.LJI = r0
            r1.LJII = r6
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L3a:
            X.6gj r0 = r12.LJLJI
            X.6gr r3 = r0.LJIIIZ
            com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader$VideoUploadInfo r0 = r13.LIZJ
            if (r0 == 0) goto L5b
            long r1 = r0.getMErrorCode()
            int r0 = (int) r1
        L47:
            r3.LJI = r0
            X.6gj r0 = r12.LJLJI
            X.6gr r1 = r0.LJIIIZ
            com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader$VideoUploadInfo r0 = r13.LIZJ
            if (r0 == 0) goto L57
            java.lang.String r0 = r0.getMExtra()
            if (r0 != 0) goto L58
        L57:
            r0 = r6
        L58:
            r1.LJII = r0
            goto L2a
        L5b:
            r0 = -20
            goto L47
        L5e:
            X.C141335gf.LIZJ(r13)
            java.lang.Object r8 = r12.LJLILLLLZI
            X.2pa r8 = (X.InterfaceC70422pa) r8
            X.6gj r1 = r12.LJLJI
            X.6fP r0 = r1.LJFF
            if (r0 == 0) goto L6f
            com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig r9 = r0.LIZIZ
            if (r9 != 0) goto L72
        L6f:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L72:
            X.6gr r2 = r1.LJIIIZ
            java.lang.String r0 = r1.LJI
            long r0 = X.C44687HgJ.LJIIIIZZ(r0)
            r2.LJ = r0
            X.6gj r0 = r12.LJLJI
            java.lang.String r1 = r0.LJI
            r10 = 0
            if (r1 == 0) goto L8d
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.6fm> r0 = X.C166726gW.LIZIZ
            java.lang.Object r11 = r0.get(r1)
            X.6fm r11 = (X.C166266fm) r11
            if (r11 != 0) goto La2
        L8d:
            X.6ge r1 = new X.6ge
            X.6gj r0 = r12.LJLJI
            r1.<init>(r0, r9, r10)
            r0 = 3
            X.XKn r0 = X.XKX.LIZIZ(r8, r10, r10, r1, r0)
            r12.LJLIL = r5
            java.lang.Object r13 = r0.LJJIJ(r12)
            if (r13 != r7) goto Le
            return r7
        La2:
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r11.LJLILLLLZI
            long r3 = r3 - r0
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lb1
            goto L8d
        Lb1:
            java.lang.String r2 = r11.LJLIL
            if (r2 != 0) goto Lb6
            goto L8d
        Lb6:
            X.6gj r1 = r12.LJLJI
            X.6gr r0 = r1.LJIIIZ
            r0.LIZIZ = r5
            r1.LJII = r2
            goto L2a
        Lc0:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        Lc3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166776gb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
