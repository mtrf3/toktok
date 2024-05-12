package X;

import com.bytedance.vcloud.vctrace.BuildConfig;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.objectselect.EffectSelectFragment$Adapter$handleClick$2", f = "EffectSelectFragment.kt", l = {BuildConfig.VERSION_CODE, 302}, m = "invokeSuspend")
/* renamed from: X.amB, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94759amB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C94033aaT LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94759amB(String str, C94033aaT c94033aaT, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = str;
        this.LJLJJI = c94033aaT;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94759amB(this.LJLJI, this.LJLJJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r1 = r16
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r15.LJLILLLLZI
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 == r2) goto L5c
            if (r0 != r4) goto L72
            java.lang.Object r0 = r15.LJLIL
            X.aeJ r0 = (X.C94271aeJ) r0
            X.C141335gf.LIZJ(r1)
        L15:
            java.lang.Long r0 = r0.LJLIL
            if (r0 == 0) goto L2d
            long r3 = r0.longValue()
            com.bytedance.effectcreatormobile.ckeapi.api.assetEditor.IAssetEditor r1 = X.C93979aZb.LIZ()
            if (r1 == 0) goto L2d
            r0 = 0
            X.aZc r0 = r1.queryHandler(r3, r0)
            if (r0 == 0) goto L2d
            r0.LIZ(r2)
        L2d:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L30:
            X.C141335gf.LIZJ(r1)
            java.lang.Class<com.bytedance.effectcreatormobile.ckeapi.api.objectselect.IObjectSelect> r0 = com.bytedance.effectcreatormobile.ckeapi.api.objectselect.IObjectSelect.class
            com.bytedance.news.common.service.manager.IService r1 = X.C93745aVp.LIZ(r0)
            com.bytedance.effectcreatormobile.objectselect.impl.ObjectSelectImpl r1 = (com.bytedance.effectcreatormobile.objectselect.impl.ObjectSelectImpl) r1
            X.aeI r5 = new X.aeI
            java.lang.String r9 = ""
            X.aX5 r10 = X.EnumC93823aX5.UnKnow
            java.lang.String r8 = r15.LJLJI
            X.aaT r0 = r15.LJLJJI
            java.lang.String r11 = r0.LJ
            java.lang.String r6 = r0.LIZLLL
            java.lang.String r12 = ""
            java.lang.String r13 = r0.LJII
            java.lang.String r14 = r0.LJIIL
            r7 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.LJLILLLLZI = r2
            java.lang.Object r1 = r1.handleResult(r5, r15)
            if (r1 != r3) goto L5f
            return r3
        L5c:
            X.C141335gf.LIZJ(r1)
        L5f:
            X.aeJ r1 = (X.C94271aeJ) r1
            com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender r0 = X.C93939aYx.LIZ()
            r15.LJLIL = r1
            r15.LJLILLLLZI = r4
            java.lang.Object r0 = r0.awaitAlgorithm(r2, r15)
            if (r0 != r3) goto L70
            return r3
        L70:
            r0 = r1
            goto L15
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94759amB.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
