package X;

import com.bytedance.ugc.effectcreator.main.CKEffectEditorActivity;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.CKEffectEditorActivity$onCreate$1", f = "CKEffectEditorActivity.kt", l = {58}, m = "invokeSuspend")
/* renamed from: X.amZ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94783amZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C68322mC LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ CKEffectEditorActivity LJLJI;
    public final /* synthetic */ C68322mC LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94783amZ(CKEffectEditorActivity cKEffectEditorActivity, C68322mC c68322mC, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = cKEffectEditorActivity;
        this.LJLJJI = c68322mC;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94783amZ(this.LJLJI, this.LJLJJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.String] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLILLLLZI
            r1 = 1
            if (r0 == 0) goto L66
            if (r0 != r1) goto L96
            X.2mC r5 = r7.LJLIL
            X.C141335gf.LIZJ(r8)
        Le:
            com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo r8 = (com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo) r8
            if (r8 == 0) goto L29
            java.lang.String r0 = r8.modelId
            if (r0 == 0) goto L1c
            int r0 = r0.length()
            if (r0 != 0) goto L4f
        L1c:
            com.bytedance.ugc.effectcreator.main.CKEffectEditorActivity r0 = r7.LJLJI
            android.content.Intent r1 = r0.getIntent()
            if (r1 == 0) goto L29
            java.lang.String r0 = "Intent_Draft"
            r1.putExtra(r0, r8)
        L29:
            X.aZS r1 = X.C93971aZT.LIZ()
            java.lang.Class<com.bytedance.effectcreatormobile.ckeapi.api.main.IMain> r0 = com.bytedance.effectcreatormobile.ckeapi.api.main.IMain.class
            java.lang.Object r3 = r1.LIZ(r0)
            com.bytedance.effectcreatormobile.ckeapi.api.main.IMain r3 = (com.bytedance.effectcreatormobile.ckeapi.api.main.IMain) r3
            if (r3 == 0) goto L4c
            com.bytedance.ugc.effectcreator.main.CKEffectEditorActivity r0 = r7.LJLJI
            androidx.fragment.app.FragmentManager r2 = r0.getSupportFragmentManager()
            java.lang.String r0 = "supportFragmentManager"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            T r1 = r5.element
            java.lang.String r1 = (java.lang.String) r1
            r0 = 2131364850(0x7f0a0bf2, float:1.8349549E38)
            r3.open(r2, r0, r1)
        L4c:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L4f:
            com.bytedance.effectcreatormobile.ckeapi.api.modelselect.IModelSelect r1 = X.C93797aWf.LIZ()
            com.bytedance.effectcreatormobile.ckeapi.api.IRecovery r0 = X.C93943aZ1.LIZ()
            if (r0 == 0) goto L63
            java.lang.String r0 = r0.getModelPictureId()
            if (r0 == 0) goto L63
        L5f:
            r1.setSelectedModel(r0)
            goto L1c
        L63:
            java.lang.String r0 = r8.modelId
            goto L5f
        L66:
            X.C141335gf.LIZJ(r8)
            X.2mC r5 = new X.2mC
            r5.<init>()
            java.lang.String r0 = ""
            r5.element = r0
            X.2mC r0 = r7.LJLJJI
            T r0 = r0.element
            com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo r0 = (com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo) r0
            if (r0 == 0) goto L29
            java.lang.String r4 = r0.draftPath
            r5.element = r4
            com.bytedance.ugc.effectcreator.main.CKEffectEditorActivity r3 = r7.LJLJI
            r7.LJLIL = r5
            r7.LJLILLLLZI = r1
            r3.getClass()
            X.XIA r2 = X.C78613UtF.LIZJ
            X.aoV r1 = new X.aoV
            r0 = 0
            r1.<init>(r3, r4, r0)
            java.lang.Object r8 = X.XKX.LJI(r2, r1, r7)
            if (r8 != r6) goto Le
            return r6
        L96:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94783amZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
