package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import java.util.LinkedHashMap;

/* loaded from: classes8.dex */
public final class HUW implements IAVEffectService.IAVEffectReadyCallback<InterfaceC84498XEg> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ IFetchEffectListener LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
    public final void finish(InterfaceC84498XEg interfaceC84498XEg) {
        InterfaceC84498XEg interfaceC84498XEg2 = interfaceC84498XEg;
        LinkedHashMap LIZ = C0JU.LIZ("panel", "default");
        if (interfaceC84498XEg2 != null) {
            interfaceC84498XEg2.LJJJIL(C47261Igj.LJJIJIL(this.LJLIL), LIZ, new HUV(this.LJLILLLLZI, interfaceC84498XEg2));
        }
    }

    public HUW(String str, C43704HDg c43704HDg) {
        this.LJLIL = str;
        this.LJLILLLLZI = c43704HDg;
    }
}
