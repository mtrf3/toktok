package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: X.IBc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46196IBc implements IAVEffectService.IAVEffectReadyCallback<InterfaceC84498XEg> {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ Effect LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
    public final void finish(InterfaceC84498XEg interfaceC84498XEg) {
        InterfaceC84498XEg interfaceC84498XEg2 = interfaceC84498XEg;
        if (interfaceC84498XEg2 != null) {
            this.LJLIL.element = interfaceC84498XEg2.LJJIL(this.LJLILLLLZI);
        }
    }

    public C46196IBc(C34K c34k, Effect effect) {
        this.LJLIL = c34k;
        this.LJLILLLLZI = effect;
    }
}
