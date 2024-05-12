package com.bytedance.pia.core.plugins;

import X.AbstractC37502Eni;
import X.C37360ElQ;
import X.C37463En5;
import X.C37499Enf;
import X.C37613EpV;
import X.RunnableC37381Ell;
import com.bytedance.pia.core.PiaManifest;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SnapshotPlugin extends AbstractC37502Eni {
    @Override // X.AbstractC37502Eni
    public final String LIZ() {
        return "snapshot";
    }

    @Override // X.AbstractC37502Eni
    public final void LIZIZ() {
        C37360ElQ c37360ElQ = C37360ElQ.LIZIZ;
        o.LJFF(C37463En5.LJIILLIIL, "PiaContext.getApplicationContext()");
        c37360ElQ.getClass();
        C37613EpV.LIZ().post(RunnableC37381Ell.LJLIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotPlugin(C37499Enf runtime, PiaManifest manifest) {
        super(runtime);
        o.LJIIJ(runtime, "runtime");
        o.LJIIJ(manifest, "manifest");
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x020d, code lost:
    
        if (r0 > r9) goto L91;
     */
    @Override // X.AbstractC37502Eni
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC37464En6 LIZJ(X.InterfaceC37454Emw r23, X.InterfaceC37464En6 r24) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pia.core.plugins.SnapshotPlugin.LIZJ(X.Emw, X.En6):X.En6");
    }
}
