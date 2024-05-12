package X;

import com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFeatureData;
import com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel$updateLiquefyData$1", f = "LiquefyViewModel.kt", l = {257, 264}, m = "invokeSuspend")
/* renamed from: X.apn, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94983apn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ LiquefyViewModel LJLILLLLZI;
    public final /* synthetic */ LiquefyFeatureData LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94983apn(LiquefyViewModel liquefyViewModel, LiquefyFeatureData liquefyFeatureData, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = liquefyViewModel;
        this.LJLJI = liquefyFeatureData;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94983apn(this.LJLILLLLZI, this.LJLJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLIL
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L7c
            if (r0 == r4) goto L9b
            if (r0 != r3) goto Ldb
            X.C141335gf.LIZJ(r7)
        Lf:
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel r0 = r6.LJLILLLLZI
            X.aiI r0 = r0.LJLIL
            if (r0 == 0) goto L44
            com.bytedance.ies.effectcreator.swig.UIAnnotationTransform3D r4 = r0.LJFF
            if (r4 == 0) goto L44
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFeatureData r3 = r6.LJLJI
            com.bytedance.ies.effectcreator.swig.EEPoint r2 = new com.bytedance.ies.effectcreator.swig.EEPoint
            r2.<init>()
            double r0 = r3.centerX
            r2.setX(r0)
            double r0 = r3.centerY
            r2.setY(r0)
            r4.updateValue(r2)
            com.bytedance.ies.effectcreator.swig.EESize r2 = new com.bytedance.ies.effectcreator.swig.EESize
            r2.<init>()
            double r0 = r3.width
            r2.setWidth(r0)
            double r0 = r3.height
            r2.setHeight(r0)
            r4.updateValue(r2)
            double r0 = r3.rotate
            r4.updateValue(r0)
        L44:
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel r3 = r6.LJLILLLLZI
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFeatureData r0 = r6.LJLJI
            float r2 = r0.verticalDistortion
            r3.getClass()
            X.2pa r1 = androidx.lifecycle.ViewModelKt.getViewModelScope(r3)
            X.apo r0 = new X.apo
            r5 = 0
            r0.<init>(r3, r2, r5)
            r4 = 3
            X.XKX.LIZLLL(r1, r5, r5, r0, r4)
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel r3 = r6.LJLILLLLZI
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFeatureData r0 = r6.LJLJI
            float r2 = r0.horizontalDistortion
            r3.getClass()
            X.2pa r1 = androidx.lifecycle.ViewModelKt.getViewModelScope(r3)
            X.apm r0 = new X.apm
            r0.<init>(r3, r2, r5)
            X.XKX.LIZLLL(r1, r5, r5, r0, r4)
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel r0 = r6.LJLILLLLZI
            X.aiI r0 = r0.LJLIL
            if (r0 == 0) goto L79
            r0.LJIIJJI()
        L79:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L7c:
            X.C141335gf.LIZJ(r7)
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel r0 = r6.LJLILLLLZI
            X.aiI r1 = r0.LJLIL
            if (r1 == 0) goto L8c
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFeatureData r0 = r6.LJLJI
            java.lang.String r0 = r0.mainTransformName
            r1.LJIIJ(r0)
        L8c:
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel r1 = r6.LJLILLLLZI
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFeatureData r0 = r6.LJLJI
            boolean r0 = r0.mirror
            r6.LJLIL = r4
            java.lang.Object r0 = r1.kv0(r0, r6)
            if (r0 != r2) goto L9e
            return r2
        L9b:
            X.C141335gf.LIZJ(r7)
        L9e:
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFeatureData r0 = r6.LJLJI
            java.lang.Boolean r0 = r0.mainVisible
            if (r0 == 0) goto Lb5
            boolean r1 = r0.booleanValue()
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel r0 = r6.LJLILLLLZI
            X.aiI r0 = r0.LJLIL
            if (r0 == 0) goto Lb5
            com.bytedance.ies.effectcreator.swig.UIAnnotationTransform3D r0 = r0.LJFF
            if (r0 == 0) goto Lb5
            r0.setVisible(r1)
        Lb5:
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFeatureData r0 = r6.LJLJI
            java.lang.Boolean r0 = r0.subVisible
            if (r0 == 0) goto Lcc
            boolean r1 = r0.booleanValue()
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel r0 = r6.LJLILLLLZI
            X.aiI r0 = r0.LJLIL
            if (r0 == 0) goto Lcc
            com.bytedance.ies.effectcreator.swig.UIAnnotationTransform3D r0 = r0.LJI
            if (r0 == 0) goto Lcc
            r0.setVisible(r1)
        Lcc:
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel r1 = r6.LJLILLLLZI
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFeatureData r0 = r6.LJLJI
            boolean r0 = r0.followFace
            r6.LJLIL = r3
            java.lang.Object r0 = r1.hv0(r0, r6)
            if (r0 != r2) goto Lf
            return r2
        Ldb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94983apn.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
