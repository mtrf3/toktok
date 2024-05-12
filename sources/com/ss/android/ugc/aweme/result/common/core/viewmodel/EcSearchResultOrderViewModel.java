package com.ss.android.ugc.aweme.result.common.core.viewmodel;

import X.C35652Dyy;
import X.C36036ECi;
import X.C51366KDy;
import X.KE0;
import X.KE1;
import X.KFQ;
import X.XKQ;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EcSearchResultOrderViewModel extends AssemViewModel<C35652Dyy> {
    public final C51366KDy LJLIL;
    public final C36036ECi LJLILLLLZI;
    public final KE1 LJLJI;
    public final KFQ LJLJJI;
    public final KE0 LJLJJL;
    public final Gson LJLJJLL;
    public XKQ LJLJL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C35652Dyy defaultState() {
        return new C35652Dyy(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Integer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gv0(com.ss.android.ugc.aweme.search.model.SearchResultParam r6) {
        /*
            r5 = this;
            X.KFQ r1 = r5.LJLJJI
            if (r1 == 0) goto L9
            java.lang.String r0 = "request_start"
            r1.LJ(r0)
        L9:
            X.KE0 r0 = r5.LJLJJL
            r4 = 0
            if (r0 == 0) goto L1a
            com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData r0 = r0.LJI()
        L12:
            X.2mC r3 = new X.2mC
            r3.<init>()
            if (r0 == 0) goto L1c
            goto L1e
        L1a:
            r0 = r4
            goto L12
        L1c:
            r0 = r4
            goto L36
        L1e:
            java.lang.String r0 = r0.getOrderSearchRegion()     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L1c
            java.lang.Integer r0 = X.C38350F3i.LJJIL(r0)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L1c
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L3a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L3a
            r3.element = r0     // Catch: java.lang.Throwable -> L3a
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L3a
        L36:
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L3a
            goto L42
        L3a:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        L42:
            java.lang.Throwable r0 = X.C3C5.m10exceptionOrNullimpl(r0)
            if (r0 == 0) goto L4b
            X.C78983UzD.LJIIZILJ(r0)
        L4b:
            X.XKQ r0 = r5.LJLJL
            if (r0 == 0) goto L52
            r0.LIZIZ(r4)
        L52:
            X.2pa r2 = r5.getAssemVMScope()
            X.EBj r1 = new X.EBj
            r1.<init>(r5, r6, r3, r4)
            r0 = 3
            X.XKQ r0 = X.XKX.LIZLLL(r2, r4, r4, r1, r0)
            r5.LJLJL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.result.common.core.viewmodel.EcSearchResultOrderViewModel.gv0(com.ss.android.ugc.aweme.search.model.SearchResultParam):void");
    }

    public EcSearchResultOrderViewModel(C51366KDy buildFeInitParamsUseCase, C36036ECi buildSearchRequestParamsUseCase, KE1 handleNativeFetchResultUseCase, KFQ kfq, KE0 ke0) {
        o.LJIIIZ(buildFeInitParamsUseCase, "buildFeInitParamsUseCase");
        o.LJIIIZ(buildSearchRequestParamsUseCase, "buildSearchRequestParamsUseCase");
        o.LJIIIZ(handleNativeFetchResultUseCase, "handleNativeFetchResultUseCase");
        this.LJLIL = buildFeInitParamsUseCase;
        this.LJLILLLLZI = buildSearchRequestParamsUseCase;
        this.LJLJI = handleNativeFetchResultUseCase;
        this.LJLJJI = kfq;
        this.LJLJJL = ke0;
        Gson LIZ = GsonHolder.LIZLLL().LIZ();
        o.LJIIIIZZ(LIZ, "get().gson");
        this.LJLJJLL = LIZ;
    }
}
