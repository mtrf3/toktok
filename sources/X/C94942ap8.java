package X;

import fjb.a;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.MainFragment$showSavaDraftDlg$1$1", f = "MainFragment.kt", l = {271, 277}, m = "invokeSuspend")
/* renamed from: X.ap8, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94942ap8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ IDqS423S0100000_42 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94942ap8(IDqS423S0100000_42 iDqS423S0100000_42, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = iDqS423S0100000_42;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94942ap8(this.LJLJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (r0 != null) goto L20;
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
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLILLLLZI
            r6 = 0
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L3d
            if (r0 == r2) goto L50
            if (r0 != r4) goto La3
            java.lang.Object r3 = r7.LJLIL
            com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo r3 = (com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo) r3
            X.C141335gf.LIZJ(r8)
        L14:
            com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData r8 = (com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData) r8
            com.bytedance.ugc.effectcreator.main.MainFragment$EffectCreatePipelineService r2 = com.bytedance.ugc.effectcreator.main.MainFragment.EffectCreatePipelineService.INSTANCE
            kotlin.jvm.internal.IDqS423S0100000_42 r0 = r7.LJLJI
            java.lang.Object r0 = r0.l0
            com.bytedance.ugc.effectcreator.main.MainFragment r0 = (com.bytedance.ugc.effectcreator.main.MainFragment) r0
            X.1qj r1 = r0.requireActivity()
            java.lang.String r0 = "requireActivity()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            boolean r0 = r2.onExportWhenExit(r1, r3, r8)
            if (r0 == 0) goto L3a
            kotlin.jvm.internal.IDqS423S0100000_42 r0 = r7.LJLJI
            java.lang.Object r0 = r0.l0
            com.bytedance.ugc.effectcreator.main.MainFragment r0 = (com.bytedance.ugc.effectcreator.main.MainFragment) r0
            X.1qj r0 = r0.requireActivity()
            r0.finish()
        L3a:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L3d:
            X.C141335gf.LIZJ(r8)
            X.XIA r1 = X.C78613UtF.LIZJ
            X.ap6 r0 = new X.ap6
            r0.<init>(r7, r6)
            r7.LJLILLLLZI = r2
            java.lang.Object r8 = X.XKX.LJI(r1, r0, r7)
            if (r8 != r5) goto L53
            return r5
        L50:
            X.C141335gf.LIZJ(r8)
        L53:
            com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo r8 = (com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo) r8
            X.2mC r3 = new X.2mC
            r3.<init>()
            java.lang.String r1 = ""
            if (r8 == 0) goto L9d
            java.lang.String r0 = r8.draftPath
            if (r0 == 0) goto L9d
        L62:
            r3.element = r0
            X.2mC r2 = new X.2mC
            r2.<init>()
            if (r8 == 0) goto L70
            java.lang.String r0 = r8.draftID
            if (r0 == 0) goto L70
            r1 = r0
        L70:
            r2.element = r1
            T r0 = r3.element
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L3a
            java.io.File r1 = new java.io.File
            T r0 = r3.element
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L3a
            X.XIA r1 = X.C78613UtF.LIZJ
            X.ap7 r0 = new X.ap7
            r0.<init>(r7, r3, r2, r6)
            r7.LJLIL = r8
            r7.LJLILLLLZI = r4
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r7)
            if (r0 != r5) goto L9f
            return r5
        L9d:
            r0 = r1
            goto L62
        L9f:
            r3 = r8
            r8 = r0
            goto L14
        La3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94942ap8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
