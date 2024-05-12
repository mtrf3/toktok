package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;

/* loaded from: classes8.dex */
public final class H6T implements IAVEffectService.IAVEffectReadyCallback<InterfaceC84498XEg> {
    public final /* synthetic */ InterfaceC67352kd<InterfaceC84498XEg> LJLIL;

    public H6T(C84654XKg c84654XKg) {
        this.LJLIL = c84654XKg;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
    public final void finish(InterfaceC84498XEg interfaceC84498XEg) {
        if (interfaceC84498XEg == null) {
            InterfaceC67352kd<InterfaceC84498XEg> interfaceC67352kd = this.LJLIL;
            C3C4 LIZ = C141335gf.LIZ(new RuntimeException("effect so fail"));
            C3C5.m7constructorimpl(LIZ);
            interfaceC67352kd.resumeWith(LIZ);
            return;
        }
        InterfaceC67352kd<InterfaceC84498XEg> interfaceC67352kd2 = this.LJLIL;
        C3C5.m7constructorimpl(interfaceC84498XEg);
        interfaceC67352kd2.resumeWith(interfaceC84498XEg);
    }
}
