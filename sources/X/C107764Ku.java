package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.camera.files.MediaLocalCacheHelper$clearMessageLocalMediaFile$1", f = "MediaLocalFile.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4Ku, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107764Ku extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C109544Rq LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C107764Ku(C109544Rq c109544Rq, InterfaceC67352kd<? super C107764Ku> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c109544Rq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C107764Ku(this.LJLIL, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        if (0 == 0) goto L7;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            X.C141335gf.LIZJ(r4)
            X.4Rq r0 = r3.LJLIL
            java.lang.String r1 = r0.getUuid()
            java.lang.String r0 = "msg.uuid"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2 = 0
            com.ss.android.ugc.aweme.services.dm.DMPath r0 = new com.ss.android.ugc.aweme.services.dm.DMPath     // Catch: java.lang.Exception -> L27
            r0.<init>(r1)     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = r0.getCacheResourceDirPath(r2)     // Catch: java.lang.Exception -> L27
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L27
            r0.<init>(r1)     // Catch: java.lang.Exception -> L27
            boolean r0 = r0.exists()     // Catch: java.lang.Exception -> L27
            if (r0 == 0) goto L29
            X.C38891fp.LJIILL(r1)     // Catch: java.lang.Exception -> L27
            goto L37
        L27:
            if (r2 != 0) goto L37
        L29:
            X.4Rq r0 = r3.LJLIL
            java.lang.String r0 = r0.getCreationUuid()
            if (r0 != 0) goto L34
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L34:
            X.C4XK.LIZ(r0)
        L37:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107764Ku.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
