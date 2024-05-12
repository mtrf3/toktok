package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: X.XVr, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84951XVr implements IAVEffectService.IAVEffectReadyCallback<InterfaceC84498XEg> {
    public final /* synthetic */ Effect LJLIL;
    public final /* synthetic */ IAVEffectService LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ java.util.Map<String, String> LJLJJI;
    public final /* synthetic */ AbstractC73851Syd<C84768XOq> LJLJJL;
    public final /* synthetic */ InterfaceC73573Su9<C84767XOp> LJLJJLL;

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
    public final void finish(InterfaceC84498XEg interfaceC84498XEg) {
        InterfaceC84498XEg interfaceC84498XEg2 = interfaceC84498XEg;
        if (interfaceC84498XEg2 != null) {
            Effect effect = this.LJLIL;
            IAVEffectService iAVEffectService = this.LJLILLLLZI;
            String str = this.LJLJI;
            java.util.Map<String, String> map = this.LJLJJI;
            AbstractC73851Syd<C84768XOq> abstractC73851Syd = this.LJLJJL;
            InterfaceC73573Su9<C84767XOp> interfaceC73573Su9 = this.LJLJJLL;
            if (interfaceC84498XEg2.LJJIJLIJ(effect) || (effect != null && effect.getEffectType() == 1)) {
                C84952XVs.LIZIZ(abstractC73851Syd, interfaceC73573Su9, effect, true);
                return;
            }
            C84959XVz c84959XVz = new C84959XVz(abstractC73851Syd, interfaceC73573Su9);
            if (str != null) {
                iAVEffectService.fetchEffectResource(str, true, map, interfaceC84498XEg2, c84959XVz);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    public C84951XVr(Effect effect, IAVEffectService iAVEffectService, String str, java.util.Map<String, String> map, AbstractC73851Syd<C84768XOq> abstractC73851Syd, InterfaceC73573Su9<C84767XOp> interfaceC73573Su9) {
        this.LJLIL = effect;
        this.LJLILLLLZI = iAVEffectService;
        this.LJLJI = str;
        this.LJLJJI = map;
        this.LJLJJL = abstractC73851Syd;
        this.LJLJJLL = interfaceC73573Su9;
    }
}
