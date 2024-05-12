package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.draft.model.AwemeDraftExtension$loadNowModeCover$1", f = "AwemeDraftExt.kt", l = {157}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class FAX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AwemeDraft LJLILLLLZI;
    public final /* synthetic */ IEffectService.OnVideoCoverCallback LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FAX(AwemeDraft awemeDraft, IEffectService.OnVideoCoverCallback onVideoCoverCallback, InterfaceC67352kd<? super FAX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = awemeDraft;
        this.LJLJI = onVideoCoverCallback;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new FAX(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L8;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLIL
            r6 = -1
            r5 = 1
            if (r0 == 0) goto L19
            if (r0 != r5) goto L49
            X.C141335gf.LIZJ(r9)
        Ld:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L16
        L11:
            com.ss.android.ugc.aweme.services.effect.IEffectService$OnVideoCoverCallback r0 = r8.LJLJI
            r0.onGetVideoCoverFailed(r6)
        L16:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L19:
            X.C141335gf.LIZJ(r9)
            com.ss.android.ugc.aweme.services.now.ICreativeNowService r0 = com.ss.android.ugc.aweme.nows.external.CreativeNowServiceImpl.LIZ()
            com.ss.android.ugc.aweme.services.now.ICreativeNowDataConverter r1 = r0.dataConverter()
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r0 = r8.LJLILLLLZI
            com.ss.android.ugc.aweme.services.now.model.CreativeNowDraft r0 = r1.convert2NowDraft(r0)
            r4 = 0
            if (r0 == 0) goto L11
            com.ss.android.ugc.aweme.services.effect.IEffectService$OnVideoCoverCallback r3 = r8.LJLJI
            android.graphics.Bitmap r2 = r1.getNowCover(r0)
            if (r2 == 0) goto L45
            X.XIF r1 = X.EXX.LIZ
            X.FAW r0 = new X.FAW
            r0.<init>(r3, r2, r4)
            r8.LJLIL = r5
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r8)
            if (r0 != r7) goto Ld
            return r7
        L45:
            r3.onGetVideoCoverFailed(r6)
            goto Ld
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FAX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
