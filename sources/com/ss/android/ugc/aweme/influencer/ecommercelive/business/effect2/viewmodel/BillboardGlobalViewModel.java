package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel;

import X.C36576EXc;
import X.C71533S5p;
import X.C71551S6h;
import X.C71556S6m;
import X.C71569S6z;
import X.C86393XvR;
import X.InterfaceC07990Tb;
import X.S5I;
import X.S6S;
import X.S6T;
import X.XKX;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.live.LiveOuterService;

/* loaded from: classes13.dex */
public final class BillboardGlobalViewModel extends AssemViewModel<S6S> implements S5I {
    public final C71556S6m LJLIL = new C71556S6m();
    public final C71533S5p LJLILLLLZI = new C71533S5p();
    public final InterfaceC07990Tb LJLJI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final S6S defaultState() {
        return new S6S(0);
    }

    public final void gv0() {
        this.LJLIL.LIZ.getClass();
        C71569S6z.LIZ().storeBoolean("key_is_first_show_auto_display", false);
        setState(S6T.LJLIL);
    }

    public BillboardGlobalViewModel() {
        InterfaceC07990Tb interfaceC07990Tb;
        C86393XvR LJJIJIL = LiveOuterService.LJJJLL().LJJIJIL();
        if (LJJIJIL != null) {
            interfaceC07990Tb = LJJIJIL.LJJIJIL();
        } else {
            interfaceC07990Tb = null;
        }
        this.LJLJI = interfaceC07990Tb;
    }

    @Override // X.S5I
    public final S6S Rj() {
        return getState();
    }

    public final void hv0(int i) {
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C36576EXc.LIZ, null, new C71551S6h(this, i, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object iv0(boolean r12, X.InterfaceC67352kd<? super X.C76800UCe> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C71553S6j
            if (r0 == 0) goto L9a
            r8 = r13
            X.S6j r8 = (X.C71553S6j) r8
            int r2 = r8.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9a
            int r2 = r2 - r1
            r8.LJLJJLL = r2
        L12:
            java.lang.Object r2 = r8.LJLJJI
            X.NAu r9 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLJJLL
            r7 = 1
            if (r0 == 0) goto L36
            if (r0 != r7) goto La1
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData r3 = r8.LJLJI
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r5 = r8.LJLILLLLZI
            X.0Tb r6 = r8.LJLIL
            X.C141335gf.LIZJ(r2)
        L26:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = r3.authorId
            boolean r0 = r3.isNewUser
            java.lang.String r0 = X.C71557S6n.LIZ(r1, r0)
            X.C71555S6l.LIZ(r6, r5, r7, r2, r0)
        L33:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L36:
            X.C141335gf.LIZJ(r2)
            X.0Tb r6 = r11.LJLJI
            if (r6 != 0) goto L40
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L40:
            java.lang.String r1 = X.C0TY.LIZIZ
            java.lang.String r0 = "STICKER"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r1 = r6.LIZ(r1)
            if (r1 != 0) goto L50
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L50:
            X.33Q r0 = r11.getState()
            X.S6S r0 = (X.S6S) r0
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r5 = r0.LJLJJLL
            if (r5 != 0) goto L5d
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L5d:
            long r2 = r1.effectId
            long r0 = r5.effectId
            r4 = 0
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 != 0) goto L8a
            r1 = 1
        L67:
            X.33Q r0 = r11.getState()
            X.S6S r0 = (X.S6S) r0
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData r3 = r0.LJLILLLLZI
            r2 = 0
            if (r12 == 0) goto L8c
            if (r1 == 0) goto L33
            X.FSJ r1 = X.C36576EXc.LIZ
            X.S6i r0 = new X.S6i
            r0.<init>(r11, r2)
            r8.LJLIL = r6
            r8.LJLILLLLZI = r5
            r8.LJLJI = r3
            r8.LJLJJLL = r7
            java.lang.Object r2 = X.XKX.LJI(r1, r0, r8)
            if (r2 != r9) goto L26
            return r9
        L8a:
            r1 = 0
            goto L67
        L8c:
            if (r1 == 0) goto L33
            java.lang.String r1 = r3.authorId
            boolean r0 = r3.isNewUser
            java.lang.String r0 = X.C71557S6n.LIZ(r1, r0)
            X.C71555S6l.LIZ(r6, r5, r4, r2, r0)
            goto L33
        L9a:
            X.S6j r8 = new X.S6j
            r8.<init>(r11, r13)
            goto L12
        La1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel.iv0(boolean, X.2kd):java.lang.Object");
    }
}
