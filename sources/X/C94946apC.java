package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.MainFragment$showSavaDraftDlg$3$onConfirm$1", f = "MainFragment.kt", l = {324, 328}, m = "invokeSuspend")
/* renamed from: X.apC, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94946apC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C68322mC LJLIL;
    public C68322mC LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ C94336afM LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94946apC(C94336afM c94336afM, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c94336afM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94946apC(this.LJLJJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        if (r0 != null) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJI
            r5 = 2
            r2 = 1
            r4 = 0
            if (r0 == 0) goto L43
            if (r0 == r2) goto L3b
            if (r0 != r5) goto L8a
            X.2mC r3 = r7.LJLIL
            X.C141335gf.LIZJ(r8)
        L12:
            com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData r8 = (com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData) r8
            com.bytedance.ugc.effectcreator.main.MainFragment$EffectCreatePipelineService r2 = com.bytedance.ugc.effectcreator.main.MainFragment.EffectCreatePipelineService.INSTANCE
            X.afM r0 = r7.LJLJJI
            com.bytedance.ugc.effectcreator.main.MainFragment r0 = r0.LIZ
            X.1qj r1 = r0.requireActivity()
            java.lang.String r0 = "requireActivity()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            T r0 = r3.element
            com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo r0 = (com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo) r0
            boolean r0 = r2.onExportWhenExit(r1, r0, r8)
            if (r0 == 0) goto L38
            X.afM r0 = r7.LJLJJI
            com.bytedance.ugc.effectcreator.main.MainFragment r0 = r0.LIZ
            X.1qj r0 = r0.requireActivity()
            r0.finish()
        L38:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L3b:
            X.2mC r0 = r7.LJLILLLLZI
            X.2mC r3 = r7.LJLIL
            X.C141335gf.LIZJ(r8)
            goto L60
        L43:
            X.C141335gf.LIZJ(r8)
            X.2mC r3 = new X.2mC
            r3.<init>()
            X.XIA r1 = X.C78613UtF.LIZJ
            X.apA r0 = new X.apA
            r0.<init>(r7, r4)
            r7.LJLIL = r3
            r7.LJLILLLLZI = r3
            r7.LJLJI = r2
            java.lang.Object r8 = X.XKX.LJI(r1, r0, r7)
            if (r8 != r6) goto L5f
            return r6
        L5f:
            r0 = r3
        L60:
            r0.element = r8
            X.2mC r2 = new X.2mC
            r2.<init>()
            T r0 = r3.element
            com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo r0 = (com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo) r0
            if (r0 == 0) goto L87
            java.lang.String r0 = r0.draftID
            if (r0 == 0) goto L87
        L71:
            r2.element = r0
            X.XIA r1 = X.C78613UtF.LIZJ
            X.apB r0 = new X.apB
            r0.<init>(r7, r3, r2, r4)
            r7.LJLIL = r3
            r7.LJLILLLLZI = r4
            r7.LJLJI = r5
            java.lang.Object r8 = X.XKX.LJI(r1, r0, r7)
            if (r8 != r6) goto L12
            return r6
        L87:
            java.lang.String r0 = ""
            goto L71
        L8a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94946apC.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
