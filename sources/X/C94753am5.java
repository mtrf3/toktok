package X;

import com.bytedance.effectcreatormobile.camera.face.FaceDistortionFragment;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.camera.face.FaceDistortionFragment$exit$1", f = "FaceDistortionFragment.kt", l = {360, 362}, m = "invokeSuspend")
/* renamed from: X.am5, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94753am5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ FaceDistortionFragment LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94753am5(FaceDistortionFragment faceDistortionFragment, boolean z, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = faceDistortionFragment;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94753am5(this.LJLILLLLZI, this.LJLJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLIL
            r5 = 2
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 == r3) goto L74
            if (r0 != r5) goto La5
            X.C141335gf.LIZJ(r10)
        Lf:
            boolean r0 = r9.LJLJI
            if (r0 == 0) goto L21
            com.bytedance.effectcreatormobile.camera.face.FaceDistortionFragment r0 = r9.LJLILLLLZI
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            if (r0 == 0) goto L1e
            r0.LJJLIIIJL()
        L1e:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L21:
            com.bytedance.effectcreatormobile.camera.face.FaceDistortionFragment r0 = r9.LJLILLLLZI
            androidx.fragment.app.FragmentManager r1 = r0.getFragmentManager()
            if (r1 == 0) goto L1e
            r0 = 0
            r1.LJJLIIIJJIZ(r3, r0)
            goto L1e
        L2e:
            X.C141335gf.LIZJ(r10)
            com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender r0 = X.C93939aYx.LIZ()
            r0.manualBindTexture()
            com.bytedance.effectcreatormobile.camera.face.FaceDistortionFragment r1 = r9.LJLILLLLZI
            boolean r0 = r1.LJLLLLLL
            if (r0 == 0) goto L46
            X.aY6 r1 = r1.xl()
            r0 = 0
            r1.LJFF(r0)
        L46:
            com.bytedance.effectcreatormobile.camera.face.FaceDistortionFragment r8 = r9.LJLILLLLZI
            r9.LJLIL = r3
            r8.getClass()
            X.XKS r7 = new X.XKS
            X.2kd r0 = X.C78555UsJ.LJJII(r9)
            r7.<init>(r3, r0)
            r7.LJIIL()
            kotlin.jvm.internal.IDqS423S0100000_42 r6 = new kotlin.jvm.internal.IDqS423S0100000_42
            r0 = 138(0x8a, float:1.93E-43)
            r6.<init>(r7, r0)
            com.bytedance.effectcreatormobile.ckeapi.api.modelselect.IModelSelect r2 = X.C93797aWf.LIZ()
            kotlin.jvm.internal.IDqS191S0200000_42 r1 = new kotlin.jvm.internal.IDqS191S0200000_42
            r0 = 1
            r1.<init>(r8, r6, r0)
            r2.fetchDefaultModel(r1)
            java.lang.Object r0 = r7.LJIIJJI()
            if (r0 != r4) goto L77
            return r4
        L74:
            X.C141335gf.LIZJ(r10)
        L77:
            com.bytedance.effectcreatormobile.camera.face.FaceDistortionFragment r0 = r9.LJLILLLLZI
            com.bytedance.effectcreatormobile.camera.face.FaceDistortionViewModel r0 = r0.Al()
            com.bytedance.ies.effectcreator.swig.Feature r0 = r0.LJLLLLLL
            if (r0 == 0) goto L98
            X.aXB r0 = com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext.LJI()
            if (r0 == 0) goto L98
            com.bytedance.ies.effectcreator.swig.Project r0 = r0.LIZJ
            com.bytedance.ies.effectcreator.swig.Model r0 = r0.getWorkingModel()
            if (r0 == 0) goto L98
            com.bytedance.ies.effectcreator.swig.FeatureManager r0 = r0.featureManager()
            if (r0 == 0) goto L98
            r0.recoverFeatureVisibleStates()
        L98:
            com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender r0 = X.C93939aYx.LIZ()
            r9.LJLIL = r5
            java.lang.Object r0 = r0.awaitAlgorithm(r3, r9)
            if (r0 != r4) goto Lf
            return r4
        La5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94753am5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
