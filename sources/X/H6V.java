package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;

/* loaded from: classes8.dex */
public final class H6V implements IAVEffectService.IAVEffectReadyCallback<InterfaceC84498XEg> {
    public final /* synthetic */ XJL<InterfaceC84498XEg> LJLIL;

    public H6V(XKS xks) {
        this.LJLIL = xks;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
    public final void finish(InterfaceC84498XEg interfaceC84498XEg) {
        if (interfaceC84498XEg == null) {
            XJL<InterfaceC84498XEg> xjl = this.LJLIL;
            C3C4 LIZ = C141335gf.LIZ(new RuntimeException("effect so fail"));
            C3C5.m7constructorimpl(LIZ);
            xjl.resumeWith(LIZ);
            return;
        }
        XJL<InterfaceC84498XEg> xjl2 = this.LJLIL;
        C3C5.m7constructorimpl(interfaceC84498XEg);
        xjl2.resumeWith(interfaceC84498XEg);
    }
}
