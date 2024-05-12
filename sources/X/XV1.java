package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import v5.n;

/* loaded from: classes16.dex */
public final class XV1 implements IAVEffectService.IAVEffectReadyCallback<InterfaceC84498XEg> {
    public final /* synthetic */ XV2 LJLIL;
    public final /* synthetic */ n<InterfaceC84498XEg> LJLILLLLZI;
    public final /* synthetic */ C10I<InterfaceC84498XEg, Void> LJLJI;

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
    public final void finish(InterfaceC84498XEg interfaceC84498XEg) {
        InterfaceC84498XEg interfaceC84498XEg2 = interfaceC84498XEg;
        this.LJLIL.LIZIZ = interfaceC84498XEg2;
        this.LJLILLLLZI.LJ(interfaceC84498XEg2);
        this.LJLILLLLZI.LIZ.LIZLLL(this.LJLJI);
    }

    public XV1(XV2 xv2, n<InterfaceC84498XEg> nVar, C10I<InterfaceC84498XEg, Void> c10i) {
        this.LJLIL = xv2;
        this.LJLILLLLZI = nVar;
        this.LJLJI = c10i;
    }
}
