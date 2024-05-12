package X;

import com.ugc.effectcreator.effectcore.sdk.model.EditorModelImpl;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ugc.effectcreator.effectcore.sdk.model.EditorModelImpl$selectAndChangeModel$1", f = "EditorModelImpl.kt", l = {33, 36, 38}, m = "invokeSuspend")
/* renamed from: X.anB, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94821anB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ EditorModelImpl LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94821anB(EditorModelImpl editorModelImpl, long j, boolean z, InterfaceC88472Yns interfaceC88472Yns, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = editorModelImpl;
        this.LJLJJI = j;
        this.LJLJJL = z;
        this.LJLJJLL = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94821anB(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLILLLLZI
            r4 = 3
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L32
            if (r0 == r6) goto L6b
            if (r0 == r5) goto L9c
            if (r0 != r4) goto Lcd
            java.lang.Object r2 = r7.LJLIL
            com.bytedance.ies.effectcreator.swig.Feature r2 = (com.bytedance.ies.effectcreator.swig.Feature) r2
            X.C141335gf.LIZJ(r8)
        L16:
            r2.willBeSelected()
            com.ugc.effectcreator.effectcore.sdk.model.EditorModelImpl r0 = r7.LJLJI
            r0.selectIfNeed(r2)
            X.aZ2 r1 = X.EnumC93944aZ2.SUCCESS
        L20:
            X.Yns r0 = r7.LJLJJLL
            r0.invoke(r1)
            com.bytedance.effectcreatormobile.ckeapi.api.main.IMain r1 = X.C93723aVT.LIZ()
            if (r1 == 0) goto L2f
            r0 = 0
            r1.mainLoading(r0)
        L2f:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L32:
            X.C141335gf.LIZJ(r8)
            com.bytedance.effectcreatormobile.ckeapi.api.main.IMain r0 = X.C93723aVT.LIZ()
            if (r0 == 0) goto L3e
            r0.mainLoading(r6)
        L3e:
            X.aXB r2 = com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext.LJI()
            if (r2 == 0) goto Lc9
            long r0 = r7.LJLJJI
            com.bytedance.ies.effectcreator.swig.Feature r2 = r2.LJFF(r0)
            if (r2 == 0) goto Lc9
            com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender r0 = X.C93939aYx.LIZ()
            androidx.lifecycle.LiveData r0 = r0.getRenderModeData()
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof X.C94339afP
            if (r0 == 0) goto Lc0
            com.ugc.effectcreator.effectcore.sdk.model.EditorModelImpl r1 = r7.LJLJI
            boolean r0 = r7.LJLJJL
            r7.LJLIL = r2
            r7.LJLILLLLZI = r6
            java.lang.Object r8 = r1.isFeatureCompatible(r2, r0, r7)
            if (r8 != r3) goto L72
            return r3
        L6b:
            java.lang.Object r2 = r7.LJLIL
            com.bytedance.ies.effectcreator.swig.Feature r2 = (com.bytedance.ies.effectcreator.swig.Feature) r2
            X.C141335gf.LIZJ(r8)
        L72:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r0 = r8.booleanValue()
            if (r0 != 0) goto Lc0
            r0 = 0
            com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext.LJIILJJIL(r0)
            com.bytedance.ies.effectcreator.swig.EEStdStringList r1 = r2.getModelCategoryKeys()
            java.lang.String r0 = "feature.modelCategoryKeys"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Object r1 = X.ORZ.LJLLLL(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Lbc
            com.ugc.effectcreator.effectcore.sdk.model.EditorModelImpl r0 = r7.LJLJI
            r7.LJLIL = r2
            r7.LJLILLLLZI = r5
            java.lang.Object r8 = r0.changeModelByCategoryKey(r1, r7)
            if (r8 != r3) goto La3
            return r3
        L9c:
            java.lang.Object r2 = r7.LJLIL
            com.bytedance.ies.effectcreator.swig.Feature r2 = (com.bytedance.ies.effectcreator.swig.Feature) r2
            X.C141335gf.LIZJ(r8)
        La3:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r0 = r8.booleanValue()
            if (r0 != 0) goto Laf
            X.aZ2 r1 = X.EnumC93944aZ2.FAIL
            goto L20
        Laf:
            com.ugc.effectcreator.effectcore.sdk.model.EditorModelImpl r0 = r7.LJLJI
            r7.LJLIL = r2
            r7.LJLILLLLZI = r4
            java.lang.Object r0 = r0.waitForRenderEnvStable(r7)
            if (r0 != r3) goto L16
            return r3
        Lbc:
            X.aZ2 r1 = X.EnumC93944aZ2.FAIL
            goto L20
        Lc0:
            com.ugc.effectcreator.effectcore.sdk.model.EditorModelImpl r0 = r7.LJLJI
            r0.selectIfNeed(r2)
            X.aZ2 r1 = X.EnumC93944aZ2.SKIP
            goto L20
        Lc9:
            X.aZ2 r1 = X.EnumC93944aZ2.FAIL
            goto L20
        Lcd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94821anB.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
