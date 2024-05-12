package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel;

import X.C71533S5p;
import X.C71562S6s;
import X.C71583S7n;
import X.C86393XvR;
import X.InterfaceC07990Tb;
import X.S5I;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.live.LiveOuterService;

/* loaded from: classes13.dex */
public final class TemplateEditBottomAreaViewModel extends AssemViewModel<C71583S7n> {
    public final C71533S5p LJLIL = new C71533S5p();
    public final InterfaceC07990Tb LJLILLLLZI;
    public final C71562S6s LJLJI;
    public S5I LJLJJI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C71583S7n defaultState() {
        return new C71583S7n(0);
    }

    public TemplateEditBottomAreaViewModel() {
        InterfaceC07990Tb interfaceC07990Tb;
        C86393XvR LJJIJIL = LiveOuterService.LJJJLL().LJJIJIL();
        if (LJJIJIL != null) {
            interfaceC07990Tb = LJJIJIL.LJJIJIL();
        } else {
            interfaceC07990Tb = null;
        }
        this.LJLILLLLZI = interfaceC07990Tb;
        this.LJLJI = new C71562S6s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem r9, com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem r10, X.InterfaceC67352kd<? super X.S7Z> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.S7U
            if (r0 == 0) goto L74
            r7 = r11
            X.S7U r7 = (X.S7U) r7
            int r2 = r7.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r7.LJLJJI = r2
        L12:
            java.lang.Object r1 = r7.LJLILLLLZI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJI
            java.lang.String r5 = ""
            r4 = 0
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L53
            if (r0 != r3) goto L7a
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem r10 = r7.LJLIL
            X.C141335gf.LIZJ(r1)
        L26:
            X.Pbt r1 = (X.C64797Pbt) r1
            if (r1 == 0) goto L36
            T r0 = r1.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0
            if (r0 == 0) goto L36
            T r3 = r0.data
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.SaveTemplateResponse r3 = (com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.SaveTemplateResponse) r3
            if (r3 != 0) goto L3c
        L36:
            X.S7Z r1 = new X.S7Z
            r1.<init>(r4, r10, r4, r5)
        L3b:
            return r1
        L3c:
            int r2 = r3.reviewStatus
            r0 = 2
            if (r2 != r0) goto L47
            X.S7Z r1 = new X.S7Z
            r1.<init>(r10)
            goto L3b
        L47:
            X.S7Z r1 = new X.S7Z
            java.lang.String r0 = r3.reviewMsg
            if (r0 != 0) goto L51
        L4d:
            r1.<init>(r4, r10, r2, r5)
            goto L3b
        L51:
            r5 = r0
            goto L4d
        L53:
            X.C141335gf.LIZJ(r1)
            boolean r0 = r9.areContentsTheSame(r10)
            if (r0 == 0) goto L62
            X.S7Z r0 = new X.S7Z
            r0.<init>(r3, r10, r4, r5)
            return r0
        L62:
            X.FSJ r1 = X.C36576EXc.LIZIZ
            X.S7K r0 = new X.S7K
            r0.<init>(r8, r10, r2)
            r7.LJLIL = r10
            r7.LJLJJI = r3
            java.lang.Object r1 = X.XKX.LJI(r1, r0, r7)
            if (r1 != r6) goto L26
            return r6
        L74:
            X.S7U r7 = new X.S7U
            r7.<init>(r8, r11)
            goto L12
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateEditBottomAreaViewModel.gv0(com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem, com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0138 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hv0(com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem r25, com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem r26, java.lang.String r27, X.InterfaceC67352kd<? super X.C71584S7o> r28) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateEditBottomAreaViewModel.hv0(com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem, com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem, java.lang.String, X.2kd):java.lang.Object");
    }
}
