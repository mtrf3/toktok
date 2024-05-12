package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;

/* renamed from: X.XUv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84929XUv implements IAVEffectService.IAVEffectReadyCallback<InterfaceC84498XEg> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ Effect LJLILLLLZI;
    public final /* synthetic */ C84943XVj LJLJI;

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
    public final void finish(InterfaceC84498XEg interfaceC84498XEg) {
        InterfaceC84498XEg interfaceC84498XEg2 = interfaceC84498XEg;
        if (interfaceC84498XEg2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.LJLIL);
            interfaceC84498XEg2.LJ(arrayList, false, this.LJLJI.LIZ.LJ(), new C84928XUu(this));
        }
    }

    public C84929XUv(C84943XVj c84943XVj, String str, Effect effect) {
        this.LJLJI = c84943XVj;
        this.LJLIL = str;
        this.LJLILLLLZI = effect;
    }
}
