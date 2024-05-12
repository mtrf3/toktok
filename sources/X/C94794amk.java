package X;

import com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo;
import com.ss.android.ugc.aweme.effectcreator.services.TiktokEffectCreatePipelineImpl;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.effectcreator.services.TiktokEffectCreatePipelineImpl$cropAndSaveDraft$2", f = "TiktokEffectCreatePipelineImpl.kt", l = {341}, m = "invokeSuspend")
/* renamed from: X.amk, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94794amk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ CKEDraftInfo LJLILLLLZI;
    public final /* synthetic */ TiktokEffectCreatePipelineImpl LJLJI;
    public final /* synthetic */ ActivityC45651qj LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94794amk(CKEDraftInfo cKEDraftInfo, TiktokEffectCreatePipelineImpl tiktokEffectCreatePipelineImpl, ActivityC45651qj activityC45651qj, boolean z, InterfaceC67352kd<? super C94794amk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = cKEDraftInfo;
        this.LJLJI = tiktokEffectCreatePipelineImpl;
        this.LJLJJI = activityC45651qj;
        this.LJLJJL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94794amk(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLIL
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L5e
            if (r0 != r3) goto L94
            X.C141335gf.LIZJ(r7)
        Ld:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L18
            com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo r0 = r6.LJLILLLLZI
            r0.getClass()
            r0.iconPath = r7
        L18:
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            X.HQ7 r0 = r0.getAccountService()
            X.Hc3 r0 = r0.getCurrentUser()
            if (r0 == 0) goto L2c
            java.lang.String r2 = r0.getUid()
            if (r2 != 0) goto L2e
        L2c:
            java.lang.String r2 = ""
        L2e:
            X.1qj r0 = r6.LJLJJI
            android.content.Context r1 = X.C16880lQ.LLLLLILLIL(r0)
            java.lang.String r0 = "activity.applicationContext"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            com.bytedance.effectcreatormobile.ckeapi.api.draft.ICKDraftManager r2 = X.C93925aYj.LIZ(r1, r2)
            boolean r0 = r6.LJLJJL
            if (r0 == 0) goto L4b
            if (r2 == 0) goto L48
            com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo r0 = r6.LJLILLLLZI
            r2.updateDraftInfo(r0)
        L48:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L4b:
            java.lang.String r1 = "AMESDK"
            java.lang.String r0 = "saveOneDraft"
            X.H78.LIZIZ(r1, r0)
            if (r2 == 0) goto L48
            com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo r0 = r6.LJLILLLLZI
            int r0 = r2.saveOneDraft(r0, r4, r4)
            X.C78857UxB.LJIIL(r0)
            goto L48
        L5e:
            X.C141335gf.LIZJ(r7)
            com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo r0 = r6.LJLILLLLZI
            if (r0 == 0) goto L48
            java.lang.String r1 = r0.iconPath
            java.lang.String r0 = "_crop"
            boolean r0 = ujb.s.LJJJLZIJ(r1, r0, r4)
            if (r0 != 0) goto L18
            java.io.File r1 = new java.io.File
            com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo r0 = r6.LJLILLLLZI
            java.lang.String r0 = r0.draftPath
            r1.<init>(r0)
            com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo r0 = r6.LJLILLLLZI
            java.lang.String r0 = r0.iconPath
            java.io.File r0 = X.OR7.LLLILZJ(r1, r0)
            java.lang.String r2 = r0.getAbsolutePath()
            com.ss.android.ugc.aweme.effectcreator.services.TiktokEffectCreatePipelineImpl r1 = r6.LJLJI
            java.lang.String r0 = "iconPath"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            r6.LJLIL = r3
            java.lang.Object r7 = r1.cropIconAndRename(r2, r6)
            if (r7 != r5) goto Ld
            return r5
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94794amk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
