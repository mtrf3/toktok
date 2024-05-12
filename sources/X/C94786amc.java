package X;

import com.bytedance.ugc.effectcreator.main.MainFragment;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.MainFragment$gotoPublishPage$1", f = "MainFragment.kt", l = {1374, 1382}, m = "invokeSuspend")
/* renamed from: X.amc, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94786amc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ MainFragment LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94786amc(MainFragment mainFragment, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = mainFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94786amc(this.LJLJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (r0 != null) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
            if (r0 == 0) goto L30
            if (r0 == r2) goto L43
            if (r0 != r4) goto Lb1
            java.lang.Object r4 = r7.LJLIL
            com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo r4 = (com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo) r4
            X.C141335gf.LIZJ(r8)
        L14:
            com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData r8 = (com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData) r8
            com.bytedance.ugc.effectcreator.main.MainFragment$EffectCreatePipelineService r3 = com.bytedance.ugc.effectcreator.main.MainFragment.EffectCreatePipelineService.INSTANCE
            com.bytedance.ugc.effectcreator.main.MainFragment r0 = r7.LJLJI
            X.1qj r2 = r0.requireActivity()
            java.lang.String r0 = "requireActivity()"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            kotlin.jvm.internal.IDqS419S0100000_42 r1 = new kotlin.jvm.internal.IDqS419S0100000_42
            r0 = 16
            r1.<init>(r7, r0)
            r3.onExportEffectSuccess(r2, r4, r8, r1)
        L2d:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L30:
            X.C141335gf.LIZJ(r8)
            X.XIA r1 = X.C78613UtF.LIZJ
            X.ama r0 = new X.ama
            r0.<init>(r7, r6)
            r7.LJLILLLLZI = r2
            java.lang.Object r8 = X.XKX.LJI(r1, r0, r7)
            if (r8 != r5) goto L46
            return r5
        L43:
            X.C141335gf.LIZJ(r8)
        L46:
            com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo r8 = (com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo) r8
            X.2mC r3 = new X.2mC
            r3.<init>()
            java.lang.String r1 = ""
            if (r8 == 0) goto Lab
            java.lang.String r0 = r8.draftPath
            if (r0 == 0) goto Lab
        L55:
            r3.element = r0
            X.2mC r2 = new X.2mC
            r2.<init>()
            if (r8 == 0) goto L63
            java.lang.String r0 = r8.draftID
            if (r0 == 0) goto L63
            r1 = r0
        L63:
            r2.element = r1
            com.bytedance.ugc.effectcreator.main.MainFragment r0 = r7.LJLJI
            com.bytedance.effectcreatormobile.camera.viewmodel.EffectHintViewModel r0 = r0.Ll()
            r0.jv0()
            if (r8 == 0) goto L80
            com.bytedance.ugc.effectcreator.main.MainFragment r0 = r7.LJLJI
            com.bytedance.effectcreatormobile.camera.viewmodel.EffectHintViewModel r0 = r0.Ll()
            androidx.lifecycle.MutableLiveData<com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectHint> r0 = r0.LJLJJL
            java.lang.Object r0 = r0.getValue()
            com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectHint r0 = (com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectHint) r0
            r8.effectHint = r0
        L80:
            T r0 = r3.element
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L2d
            java.io.File r1 = new java.io.File
            T r0 = r3.element
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L2d
            X.XIA r1 = X.C78613UtF.LIZJ
            X.amb r0 = new X.amb
            r0.<init>(r7, r3, r2, r6)
            r7.LJLIL = r8
            r7.LJLILLLLZI = r4
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r7)
            if (r0 != r5) goto Lad
            return r5
        Lab:
            r0 = r1
            goto L55
        Lad:
            r4 = r8
            r8 = r0
            goto L14
        Lb1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94786amc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
