package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.viewmodel.VideoStickerContentViewModel$updateVideoStickerStatus$1", f = "VideoStickerContentViewModel.kt", l = {239, 241}, m = "invokeSuspend")
/* renamed from: X.2hv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65672hv extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65672hv(long j, int i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C65672hv> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = j;
        this.LJLJJI = i;
        this.LJLJJL = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65672hv(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLILLLLZI
            r6 = 2
            r4 = 1
            if (r0 == 0) goto L1f
            if (r0 == r4) goto L33
            if (r0 != r6) goto L61
            java.lang.Object r4 = r7.LJLIL
            X.C141335gf.LIZJ(r8)
        L11:
            java.lang.Throwable r1 = X.C3C5.m10exceptionOrNullimpl(r4)
            if (r1 == 0) goto L1c
            java.lang.String r0 = "StickerContentViewModel"
            X.C34B.LJ(r0, r1)
        L1c:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L1f:
            X.C141335gf.LIZJ(r8)
            long r2 = r7.LJLJI
            int r1 = r7.LJLJJI
            com.ss.android.ugc.aweme.emoji.stickerstore.api.StickerStoreApi r0 = X.C74722wW.LIZ()     // Catch: java.lang.Throwable -> L3d
            r7.LJLILLLLZI = r4     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r8 = r0.uploadStickerStatus(r2, r1, r7)     // Catch: java.lang.Throwable -> L3d
            if (r8 != r5) goto L36
            goto L69
        L33:
            X.C141335gf.LIZJ(r8)     // Catch: java.lang.Throwable -> L3d
        L36:
            r4 = r8
            com.ss.android.ugc.aweme.base.api.BaseResponse r4 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r4     // Catch: java.lang.Throwable -> L3d
            X.C3C5.m7constructorimpl(r4)     // Catch: java.lang.Throwable -> L3d
            goto L45
        L3d:
            r0 = move-exception
            X.3C4 r4 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r4)
        L45:
            X.Pro<X.UCe> r3 = r7.LJLJJL
            boolean r0 = X.C3C5.m13isSuccessimpl(r4)
            if (r0 == 0) goto L11
        L4e:
            X.UtN r2 = X.C36636EZk.LIZ
            X.2hu r1 = new X.2hu
            r0 = 0
            r1.<init>(r3, r0)
            r7.LJLIL = r4
            r7.LJLILLLLZI = r6
            java.lang.Object r0 = X.XKX.LJI(r2, r1, r7)
            if (r0 != r5) goto L11
            return r5
        L61:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L69:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65672hv.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
