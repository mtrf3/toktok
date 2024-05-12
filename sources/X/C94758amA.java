package X;

import com.bytedance.effectcreatormobile.objectselect.AssetsFragment;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.objectselect.AssetsFragment$handleResult$1", f = "AssetsFragment.kt", l = {389}, m = "invokeSuspend")
/* renamed from: X.amA, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94758amA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AssetsFragment LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ C94270aeI LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94758amA(AssetsFragment assetsFragment, boolean z, C94270aeI c94270aeI, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = assetsFragment;
        this.LJLJI = z;
        this.LJLJJI = c94270aeI;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94758amA(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLIL
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L24
            if (r0 != r4) goto La0
            X.C141335gf.LIZJ(r10)
        Ld:
            X.aeJ r10 = (X.C94271aeJ) r10
            X.aX2 r1 = r10.LJLILLLLZI
            X.aX2 r0 = X.EnumC93820aX2.ASSET_INCOMPATIBLE
            if (r1 != r0) goto La8
            com.bytedance.effectcreatormobile.objectselect.AssetsFragment r1 = r9.LJLILLLLZI
            r0 = 2131829684(0x7f1123b4, float:1.9292344E38)
            java.lang.String r2 = r1.getString(r0)
            java.lang.String r0 = "getString(effect_tool_toast_gif_incompatible)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            goto L8b
        L24:
            X.C141335gf.LIZJ(r10)
            com.bytedance.effectcreatormobile.objectselect.AssetsFragment r0 = r9.LJLILLLLZI
            r0.Ll()
            com.bytedance.effectcreatormobile.objectselect.AssetsFragment r6 = r9.LJLILLLLZI
            boolean r0 = r6.LJLJJI
            if (r0 != 0) goto Lb7
            r6.LJLJJI = r4
            boolean r0 = r9.LJLJI
            if (r0 == 0) goto L78
            X.aeI r0 = r9.LJLJJI
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L72
            java.lang.String r0 = r0.LJLJJI     // Catch: java.lang.Exception -> L72
            r1.<init>(r0)     // Catch: java.lang.Exception -> L72
            long r7 = r1.length()     // Catch: java.lang.Exception -> L72
            r0 = 3145728(0x300000, float:4.408104E-39)
            long r1 = (long) r0     // Catch: java.lang.Exception -> L72
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L70
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L72
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L72
            r1[r3] = r0     // Catch: java.lang.Exception -> L72
            r0 = 2131829683(0x7f1123b3, float:1.9292342E38)
            java.lang.String r2 = r6.getString(r0, r1)     // Catch: java.lang.Exception -> L72
            java.lang.String r0 = "getString(effect_tool_toast_gif_importfailed, 3)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)     // Catch: java.lang.Exception -> L72
            android.content.Context r1 = r6.requireContext()     // Catch: java.lang.Exception -> L66
            goto L68
        L66:
            android.content.Context r1 = X.C93901aYL.LIZ     // Catch: java.lang.Exception -> L72
        L68:
            if (r1 == 0) goto L72
            com.bytedance.effectcreatormobile.ckeapi.api.foundation.toast.ToastService r0 = com.bytedance.effectcreatormobile.ckeapi.api.foundation.toast.ToastService.INSTANCE     // Catch: java.lang.Exception -> L72
            r0.showToast(r1, r2)     // Catch: java.lang.Exception -> L72
            goto L72
        L70:
            r0 = 1
            goto L73
        L72:
            r0 = 0
        L73:
            if (r0 != 0) goto L78
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L78:
            java.lang.Class<com.bytedance.effectcreatormobile.ckeapi.api.objectselect.IObjectSelect> r0 = com.bytedance.effectcreatormobile.ckeapi.api.objectselect.IObjectSelect.class
            com.bytedance.news.common.service.manager.IService r1 = X.C93745aVp.LIZ(r0)
            com.bytedance.effectcreatormobile.objectselect.impl.ObjectSelectImpl r1 = (com.bytedance.effectcreatormobile.objectselect.impl.ObjectSelectImpl) r1
            X.aeI r0 = r9.LJLJJI
            r9.LJLIL = r4
            java.lang.Object r10 = r1.handleResult(r0, r9)
            if (r10 != r5) goto Ld
            return r5
        L8b:
            android.content.Context r1 = r1.requireContext()     // Catch: java.lang.Exception -> L90
            goto L92
        L90:
            android.content.Context r1 = X.C93901aYL.LIZ
        L92:
            if (r1 == 0) goto L99
            com.bytedance.effectcreatormobile.ckeapi.api.foundation.toast.ToastService r0 = com.bytedance.effectcreatormobile.ckeapi.api.foundation.toast.ToastService.INSTANCE
            r0.showToast(r1, r2)
        L99:
            com.bytedance.effectcreatormobile.objectselect.AssetsFragment r0 = r9.LJLILLLLZI
            r0.LJLJJI = r3
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        La0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La8:
            com.bytedance.effectcreatormobile.objectselect.AssetsFragment r1 = r9.LJLILLLLZI
            X.aZD r0 = r1.LJLIL
            if (r0 == 0) goto Lb2
            boolean r3 = r0.LIZIZ()
        Lb2:
            if (r3 != 0) goto Lb7
            r1.vl()
        Lb7:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94758amA.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
