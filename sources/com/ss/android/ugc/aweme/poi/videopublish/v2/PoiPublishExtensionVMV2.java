package com.ss.android.ugc.aweme.poi.videopublish.v2;

import X.AbstractC85354Xeg;
import X.C184077Kh;
import X.C214188as;
import X.C214378bB;
import X.C214528bQ;
import X.C65352Pkq;
import X.C78404Ups;
import X.C78926UyI;
import X.C85257Xd7;
import X.C85288Xdc;
import X.C85291Xdf;
import X.C85313Xe1;
import X.C85333XeL;
import X.C85335XeN;
import X.C85339XeR;
import X.C85342XeU;
import X.InterfaceC85336XeO;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;
import kotlin.jvm.internal.AqS181S0100000_15;

/* loaded from: classes16.dex */
public final class PoiPublishExtensionVMV2 extends AssemViewModel<C85333XeL> {
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public Long LJLJJI;
    public String LJLJJL;
    public long LJLJL;
    public AbstractC85354Xeg LJLJLJ;
    public final C214378bB LJLLI;
    public String LJLJJLL = "";
    public final C85339XeR LJLJLLL = C85342XeU.LIZ();
    public final C214188as LJLL = C78404Ups.LIZJ(this, C85288Xdc.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C85333XeL defaultState() {
        return new C85333XeL(0);
    }

    public PoiPublishExtensionVMV2() {
        C85313Xe1 c85313Xe1 = C85313Xe1.LJLIL;
        this.LJLLI = new C214378bB(C65352Pkq.LIZ(PoiSearchVM.class), c85313Xe1, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, C85291Xdf.INSTANCE, null, null);
    }

    public final void gv0(LifecycleOwner lifecycleOwner) {
        if (this.LJLJLLL.LIZJ()) {
            ((InterfaceC85336XeO) this.LJLL.getValue().getOperator()).LL(new C85257Xd7(this, lifecycleOwner));
        } else {
            hv0(null, lifecycleOwner);
        }
    }

    public final void jv0(PoiData poiData) {
        setState(new AqS181S0100000_15(poiData, 113));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006d, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hv0(com.bytedance.bdlocation.BDLocation r14, androidx.lifecycle.LifecycleOwner r15) {
        /*
            r13 = this;
            if (r15 == 0) goto Le
            androidx.lifecycle.Lifecycle r0 = r15.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r1 != r0) goto Lf
        Le:
            return
        Lf:
            r5 = r13
            X.Xeg r0 = r5.LJLJLJ
            if (r0 == 0) goto Lb2
            boolean r1 = r0.LJIIJ()
            r0 = 1
            if (r1 != r0) goto Lb2
            kotlin.jvm.internal.AqS181S0100000_15 r1 = new kotlin.jvm.internal.AqS181S0100000_15
            r0 = 229(0xe5, float:3.21E-43)
            r1.<init>(r5, r0)
            r5.setState(r1)
            X.XeR r0 = r5.LJLJLLL
            boolean r10 = r0.LIZJ()
            r4 = 41
            r1 = 40
            java.lang.String r3 = ")-("
            if (r14 == 0) goto L6f
            double r6 = r14.getLatitude()
            double r8 = r14.getLongitude()
            kotlin.jvm.internal.AqS181S0100000_15 r2 = new kotlin.jvm.internal.AqS181S0100000_15
            r0 = 112(0x70, float:1.57E-43)
            r2.<init>(r14, r0)
            r5.setState(r2)
            java.lang.StringBuilder r0 = X.X1D.LIZ()
            r0.append(r1)
            r0.append(r6)
            r0.append(r3)
            r0.append(r8)
            r0.append(r3)
            java.lang.String r0 = X.C48339Iy7.LIZJ(r0, r10, r4, r0)
            r5.LJLJJLL = r0
            X.8bB r0 = r5.LJLLI
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.poi.search.PoiSearchVM r0 = (com.ss.android.ugc.aweme.poi.search.PoiSearchVM) r0
            long r11 = r0.LJLZ
            iv0(r5, r6, r8, r10, r11)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L9f
        L6f:
            X.XeP r0 = X.C85337XeP.LJLIL
            r5.setState(r0)
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            r2.append(r1)
            r0 = 0
            r2.append(r0)
            r2.append(r3)
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = X.C48339Iy7.LIZJ(r2, r10, r4, r2)
            r5.LJLJJLL = r0
            X.8bB r0 = r5.LJLLI
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.poi.search.PoiSearchVM r0 = (com.ss.android.ugc.aweme.poi.search.PoiSearchVM) r0
            long r11 = r0.LJLZ
            r6 = 0
            r8 = r6
            iv0(r5, r6, r8, r10, r11)
        L9f:
            X.8as r0 = r5.LJLL
            java.lang.Object r0 = r0.getValue()
            X.8aw r0 = (X.InterfaceC214228aw) r0
            X.3e4 r0 = r0.getOperator()
            X.XeO r0 = (X.InterfaceC85336XeO) r0
            r0.LJIIZILJ()
            goto Le
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionVMV2.hv0(com.bytedance.bdlocation.BDLocation, androidx.lifecycle.LifecycleOwner):void");
    }

    public static void iv0(PoiPublishExtensionVMV2 poiPublishExtensionVMV2, double d, double d2, boolean z, long j) {
        poiPublishExtensionVMV2.getClass();
        poiPublishExtensionVMV2.withState(new C85335XeN(poiPublishExtensionVMV2, d, d2, null, z, j));
    }
}
