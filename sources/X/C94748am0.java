package X;

import com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFeatureData;
import com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel$load$3", f = "LiquefyViewModel.kt", l = {73, 74, 75, 76}, m = "invokeSuspend")
/* renamed from: X.am0, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94748am0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ LiquefyViewModel LJLILLLLZI;
    public final /* synthetic */ LiquefyFeatureData LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94748am0(LiquefyViewModel liquefyViewModel, LiquefyFeatureData liquefyFeatureData, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = liquefyViewModel;
        this.LJLJI = liquefyFeatureData;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94748am0(this.LJLILLLLZI, this.LJLJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLIL
            r4 = 4
            r5 = 3
            r2 = 2
            r6 = 1
            if (r0 == 0) goto L18
            if (r0 == r6) goto L31
            if (r0 == r2) goto L4a
            if (r0 == r5) goto L64
            if (r0 != r4) goto L7e
            X.C141335gf.LIZJ(r8)
        L15:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L18:
            X.C141335gf.LIZJ(r8)
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel r0 = r7.LJLILLLLZI
            X.XLM r1 = r0.LJLILLLLZI
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFeatureData r0 = r7.LJLJI
            boolean r0 = r0.mirror
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.LJLIL = r6
            r1.setValue(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != r3) goto L34
            return r3
        L31:
            X.C141335gf.LIZJ(r8)
        L34:
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel r0 = r7.LJLILLLLZI
            X.XLM r1 = r0.LJLJJI
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFeatureData r0 = r7.LJLJI
            boolean r0 = r0.followFace
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.LJLIL = r2
            r1.setValue(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != r3) goto L4d
            return r3
        L4a:
            X.C141335gf.LIZJ(r8)
        L4d:
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel r0 = r7.LJLILLLLZI
            X.XLM r2 = r0.LJLJJLL
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFeatureData r0 = r7.LJLJI
            float r1 = r0.horizontalDistortion
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r1)
            r7.LJLIL = r5
            r2.setValue(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != r3) goto L67
            return r3
        L64:
            X.C141335gf.LIZJ(r8)
        L67:
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel r0 = r7.LJLILLLLZI
            X.XLM r2 = r0.LJLJLJ
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFeatureData r0 = r7.LJLJI
            float r1 = r0.verticalDistortion
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r1)
            r7.LJLIL = r4
            r2.setValue(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != r3) goto L15
            return r3
        L7e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94748am0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
