package X;

import com.bytedance.effectcreatormobile.objectselect.viewmodel.StickerViewModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.objectselect.viewmodel.StickerViewModel$loadCategoryStickers$1", f = "StickerViewModel.kt", l = {27, 29, 29, 31}, m = "invokeSuspend")
/* renamed from: X.anZ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94845anZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public XLM LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ StickerViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94845anZ(StickerViewModel stickerViewModel, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = stickerViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94845anZ(this.LJLJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r13.LJLILLLLZI
            r6 = 4
            r10 = 3
            r3 = 2
            r2 = 1
            r5 = 0
            if (r0 == 0) goto L24
            if (r0 == r2) goto L20
            if (r0 == r3) goto L1d
            if (r0 == r10) goto L19
            if (r0 != r6) goto La2
            X.C141335gf.LIZJ(r14)
        L16:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L19:
            X.C141335gf.LIZJ(r14)     // Catch: java.lang.Exception -> L8c
            goto L16
        L1d:
            X.XLM r9 = r13.LJLIL
            goto L79
        L20:
            X.C141335gf.LIZJ(r14)
            goto L3a
        L24:
            X.C141335gf.LIZJ(r14)
            com.bytedance.effectcreatormobile.objectselect.viewmodel.StickerViewModel r0 = r13.LJLJI
            X.XLM r1 = r0.LJLIL
            X.aat r0 = new X.aat
            r0.<init>(r5)
            r13.LJLILLLLZI = r2
            r1.setValue(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != r4) goto L3a
            return r4
        L3a:
            com.bytedance.effectcreatormobile.objectselect.viewmodel.StickerViewModel r12 = r13.LJLJI     // Catch: java.lang.Exception -> L8c
            X.XLM r9 = r12.LJLIL     // Catch: java.lang.Exception -> L8c
            java.lang.String r11 = r12.LJLJI     // Catch: java.lang.Exception -> L8c
            java.lang.String r8 = r12.LJLJJI     // Catch: java.lang.Exception -> L8c
            r13.LJLIL = r9     // Catch: java.lang.Exception -> L8c
            r13.LJLILLLLZI = r3     // Catch: java.lang.Exception -> L8c
            X.XKS r7 = new X.XKS     // Catch: java.lang.Exception -> L8c
            X.2kd r0 = X.C78555UsJ.LJJII(r13)     // Catch: java.lang.Exception -> L8c
            r7.<init>(r2, r0)     // Catch: java.lang.Exception -> L8c
            r7.LJIIL()     // Catch: java.lang.Exception -> L8c
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L8c
            X.aZS r1 = X.C93971aZT.LIZ()     // Catch: java.lang.Exception -> L8c
            if (r1 == 0) goto L77
            java.lang.Class<com.bytedance.effectcreatormobile.objectselect.api.IAssetsLibResProvider> r0 = com.bytedance.effectcreatormobile.objectselect.api.IAssetsLibResProvider.class
            java.lang.Object r1 = r1.LIZ(r0)     // Catch: java.lang.Exception -> L8c
            com.bytedance.news.common.service.manager.IService r1 = (com.bytedance.news.common.service.manager.IService) r1     // Catch: java.lang.Exception -> L8c
        L64:
            com.bytedance.effectcreatormobile.objectselect.api.IAssetsLibResProvider r1 = (com.bytedance.effectcreatormobile.objectselect.api.IAssetsLibResProvider) r1     // Catch: java.lang.Exception -> L8c
            if (r1 == 0) goto L70
            X.adP r0 = new X.adP     // Catch: java.lang.Exception -> L8c
            r0.<init>(r7, r2, r12)     // Catch: java.lang.Exception -> L8c
            r1.getResourceCategoryList(r11, r8, r0)     // Catch: java.lang.Exception -> L8c
        L70:
            java.lang.Object r14 = r7.LJIIJJI()     // Catch: java.lang.Exception -> L8c
            if (r14 != r4) goto L7c
            goto Laa
        L77:
            r1 = r5
            goto L64
        L79:
            X.C141335gf.LIZJ(r14)     // Catch: java.lang.Exception -> L8c
        L7c:
            X.aau r0 = new X.aau     // Catch: java.lang.Exception -> L8c
            r0.<init>(r14)     // Catch: java.lang.Exception -> L8c
            r13.LJLIL = r5     // Catch: java.lang.Exception -> L8c
            r13.LJLILLLLZI = r10     // Catch: java.lang.Exception -> L8c
            java.lang.Object r0 = r9.emit(r0, r13)     // Catch: java.lang.Exception -> L8c
            if (r0 != r4) goto L16
            goto Lab
        L8c:
            r2 = move-exception
            com.bytedance.effectcreatormobile.objectselect.viewmodel.StickerViewModel r0 = r13.LJLJI
            X.XLM r1 = r0.LJLIL
            X.aas r0 = new X.aas
            r0.<init>(r2)
            r13.LJLIL = r5
            r13.LJLILLLLZI = r6
            r1.setValue(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != r4) goto L16
            return r4
        La2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Laa:
            return r4
        Lab:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94845anZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
