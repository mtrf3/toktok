package com.bytedance.pia.core.plugins;

import X.AbstractC37502Eni;
import X.C37442Emk;
import X.C37499Enf;
import X.C37558Eoc;
import com.bytedance.pia.core.PiaManifest;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PrefetchPlugin extends AbstractC37502Eni {
    public C37442Emk LIZIZ;
    public final PiaManifest LIZJ;

    @Override // X.AbstractC37502Eni
    public final String LIZ() {
        return "prefetch";
    }

    @Override // X.AbstractC37502Eni
    public final void LIZIZ() {
        PiaManifest piaManifest = this.LIZJ;
        C37499Enf runtime = this.LIZ;
        o.LJFF(runtime, "runtime");
        this.LIZIZ = new C37442Emk(runtime, piaManifest);
    }

    @Override // X.AbstractC37502Eni, X.InterfaceC37489EnV
    public final void release() {
        C37558Eoc c37558Eoc;
        C37442Emk c37442Emk = this.LIZIZ;
        if (c37442Emk != null && (c37558Eoc = c37442Emk.LIZ) != null) {
            c37558Eoc.LJI(null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrefetchPlugin(C37499Enf runtime, PiaManifest manifest) {
        super(runtime);
        o.LJIIJ(runtime, "runtime");
        o.LJIIJ(manifest, "manifest");
        this.LIZJ = manifest;
    }
}
