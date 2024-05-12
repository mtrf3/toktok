package com.ss.android.ugc.aweme.poi.videopublish;

import X.C84661XKn;
import X.C85281XdV;
import X.C85286Xda;
import X.InterfaceC88472Yns;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.poi.PoiData;
import kotlin.jvm.internal.AqS181S0100000_15;

/* loaded from: classes16.dex */
public final class PoiPublishExtensionVM extends AssemViewModel<C85286Xda> {
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public Long LJLJJI;
    public String LJLJJL;
    public C84661XKn LJLJJLL;
    public long LJLJL;
    public long LJLJLJ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C85286Xda defaultState() {
        return new C85286Xda(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(X.InterfaceC67352kd<? super java.lang.Boolean> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C85283XdX
            if (r0 == 0) goto L81
            r4 = r10
            X.XdX r4 = (X.C85283XdX) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L81
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r1 = r4.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r7 = 1
            if (r0 == 0) goto L69
            if (r0 != r7) goto L87
            com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM r8 = r4.LJLIL
            X.C141335gf.LIZJ(r1)
        L22:
            com.ss.android.ugc.aweme.poi.api.PoiSearchApi$PopupEnableResponse r1 = (com.ss.android.ugc.aweme.poi.api.PoiSearchApi.PopupEnableResponse) r1
            long r4 = java.lang.System.currentTimeMillis()
            if (r1 == 0) goto L67
            int r0 = r1.popupRes
            if (r0 != r7) goto L67
        L2e:
            X.M3Z r3 = new X.M3Z
            java.lang.String r2 = "video_post_page"
            r3.<init>(r2)
            java.lang.String r0 = "data_parse"
            r3.LIZLLL = r0
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r4
            r3.LIZ(r0)
            r4 = 2
            r3.LIZIZ(r4)
            X.C56178M3a.LIZ(r3)
            X.M3Z r6 = new X.M3Z
            r6.<init>(r2)
            java.lang.String r0 = "network_data_parse"
            r6.LIZLLL = r0
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r8.LJLJL
            long r2 = r2 - r0
            r6.LIZ(r2)
            r6.LIZIZ(r4)
            X.C56178M3a.LIZ(r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L67:
            r7 = 0
            goto L2e
        L69:
            X.C141335gf.LIZJ(r1)
            X.XdW r2 = new X.XdW
            r0 = 0
            r2.<init>(r9, r0)
            r4.LJLIL = r9
            r4.LJLJJI = r7
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r1 = X.C74209TAn.LIZJ(r0, r2, r4)
            if (r1 != r3) goto L7f
            return r3
        L7f:
            r8 = r9
            goto L22
        L81:
            X.XdX r4 = new X.XdX
            r4.<init>(r9, r10)
            goto L12
        L87:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM.gv0(X.2kd):java.lang.Object");
    }

    public final void iv0(PoiData poiData) {
        setState(new AqS181S0100000_15(poiData, 107));
    }

    public static void hv0(PoiPublishExtensionVM poiPublishExtensionVM, double d, double d2, boolean z, long j, InterfaceC88472Yns interfaceC88472Yns) {
        poiPublishExtensionVM.getClass();
        poiPublishExtensionVM.withState(new C85281XdV(poiPublishExtensionVM, d2, d, null, z, j, interfaceC88472Yns));
    }
}
