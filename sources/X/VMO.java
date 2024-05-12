package X;

import com.bytedance.ttnet.TTNetInit;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VMO implements InterfaceC79629VMz {
    public final /* synthetic */ VM9 LIZ;
    public final /* synthetic */ VMQ LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ VM4 LIZLLL;
    public final /* synthetic */ WeakReference LJ;

    @Override // X.InterfaceC79629VMz
    public final void LIZ(C79611VMh c79611VMh) {
        VMQ vmq = this.LIZIZ;
        C79608VMe c79608VMe = c79611VMh.LIZJ;
        vmq.LJLILLLLZI = c79608VMe.LIZ;
        vmq.LJLLLLLL = c79608VMe.LJFF;
        try {
            vmq.LJLLI = TTNetInit.getNetworkQuality().LIZIZ;
            this.LIZIZ.LJLLILLLL = TTNetInit.getNetworkQuality().LIZ;
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
        VMQ vmq2 = this.LIZIZ;
        vmq2.LJLLL = c79611VMh.LIZJ.LIZIZ;
        vmq2.LJLLJ = this.LIZ.LJLJJL.LJLJL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("effective_percentage", Integer.valueOf((int) (c79611VMh.LIZJ.LIZ * 10000)));
        C40048Fng.LIZJ(this.LIZ.LJIILL(), "blank_result", null, linkedHashMap, 4);
        VMQ vmq3 = this.LIZIZ;
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.LIZJ;
        vmq3.LJLJJL = currentTimeMillis - j;
        VMQ vmq4 = this.LIZIZ;
        vmq4.LJLJJLL = c79611VMh.LIZ;
        vmq4.LJLJL = c79611VMh.LIZIZ;
        vmq4.LJLJLLL = this.LIZ.LJLJJL.LJLIL;
        vmq4.LJLL = j;
        this.LIZLLL.LJIIL = vmq4;
        if (VMS.blankBitmap.isEnabled()) {
            VMQ vmq5 = this.LIZIZ;
            String str = c79611VMh.LIZJ.LIZJ;
            vmq5.getClass();
            o.LJIIJ(str, "<set-?>");
            vmq5.LJLZ = str;
            VMQ vmq6 = this.LIZIZ;
            C79608VMe c79608VMe2 = c79611VMh.LIZJ;
            vmq6.LJZ = c79608VMe2.LIZLLL;
            vmq6.LJZI = c79608VMe2.LJ;
        }
        if (this.LJ.get() != null) {
            C38045EwT.LIZ(new AqS164S0100000_14(this, c79611VMh, 439));
        }
        VM9 vm9 = this.LIZ;
        VM4 event = this.LIZLLL;
        vm9.getClass();
        o.LJIIJ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reportBlank: ");
        LIZ.append(vm9.LJLLI);
        LIZ.append(", view: ");
        LIZ.append(vm9.LJIILJJIL());
        X1D.LIZIZ(LIZ);
        long j2 = vm9.LJLJJL.LJLIL;
        AbstractC38228EzQ abstractC38228EzQ = event.LJIIL;
        if (abstractC38228EzQ != null) {
            ((VMQ) abstractC38228EzQ).LJLJLLL = j2;
            VMH vmh = vm9.LJLLILLLL;
            vmh.getClass();
            vmh.LIZ.LIZ(event);
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.android.monitorV2.lynx.data.entity.LynxBlankData");
    }

    public VMO(VM9 vm9, VMQ vmq, long j, VM4 vm4, WeakReference weakReference) {
        this.LIZ = vm9;
        this.LIZIZ = vmq;
        this.LIZJ = j;
        this.LIZLLL = vm4;
        this.LJ = weakReference;
    }
}
