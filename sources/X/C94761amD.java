package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.objectselect.impl.ObjectSelectImpl$AddResultHandler$onHandle$1", f = "ObjectSelectImpl.kt", l = {201}, m = "invokeSuspend")
/* renamed from: X.amD, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94761amD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C94093abR LJLILLLLZI;
    public final /* synthetic */ C94270aeI LJLJI;
    public final /* synthetic */ InterfaceC88472Yns LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94761amD(C94093abR c94093abR, C94270aeI c94270aeI, InterfaceC88472Yns interfaceC88472Yns, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c94093abR;
        this.LJLJI = c94270aeI;
        this.LJLJJI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94761amD(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r14.LJLIL
            r2 = 1
            if (r0 == 0) goto L4c
            if (r0 != r2) goto L83
            X.C141335gf.LIZJ(r15)
        Lc:
            X.aeJ r15 = (X.C94271aeJ) r15
            java.lang.Long r0 = r15.LJLIL
            r3 = 0
            if (r0 == 0) goto L4a
            long r1 = r0.longValue()
            X.aXB r0 = com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext.LJI()
            if (r0 == 0) goto L4a
            com.bytedance.ies.effectcreator.swig.Feature r2 = r0.LJFF(r1)
        L21:
            X.aX2 r1 = r15.LJLILLLLZI
            X.aX2 r0 = X.EnumC93820aX2.SUCCESS
            if (r1 != r0) goto L42
            X.abR r0 = r14.LJLILLLLZI
            com.bytedance.effectcreatormobile.objectselect.impl.ObjectSelectImpl r0 = r0.LIZ
            boolean r0 = r0.needChangeModelWhenAdd(r2)
            if (r0 == 0) goto L42
            java.lang.Long r0 = r15.LJLIL
            if (r0 == 0) goto L42
            long r1 = r0.longValue()
            com.bytedance.effectcreatormobile.ckeapi.api.main.IAutoChangeModel r0 = X.C93722aVS.LIZ()
            if (r0 == 0) goto L42
            r0.autoChangeModelWhenAddNew(r1, r3)
        L42:
            X.Yns r0 = r14.LJLJJI
            r0.invoke(r15)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L4a:
            r2 = r3
            goto L21
        L4c:
            X.C141335gf.LIZJ(r15)
            X.aeI r0 = r14.LJLJI
            java.lang.String r6 = r0.LJLJLJ
            java.lang.String r7 = r0.LJLILLLLZI
            java.lang.String r8 = r0.LJLIL
            java.lang.String r9 = r0.LJLJI
            java.lang.String r5 = r0.LJLJJI
            java.lang.String r10 = r0.LJLJJLL
            java.lang.String r11 = r0.LJLJL
            X.aX5 r4 = r0.LJLJJL
            java.lang.String r12 = r0.LJLJLLL
            java.lang.Object r13 = r0.LJLL
            r14.LJLIL = r2
            X.XKS r3 = new X.XKS
            X.2kd r0 = X.C78555UsJ.LJJII(r14)
            r3.<init>(r2, r0)
            r3.LJIIL()
            X.akc r2 = new X.akc
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext.LIZLLL(r2)
            java.lang.Object r15 = r3.LJIIJJI()
            if (r15 != r1) goto Lc
            return r1
        L83:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94761amD.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
