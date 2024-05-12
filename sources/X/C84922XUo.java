package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import java.util.ArrayList;

/* renamed from: X.XUo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84922XUo implements IAVEffectService.IAVEffectReadyCallback<InterfaceC84498XEg> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C84923XUp LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
    public final void finish(InterfaceC84498XEg interfaceC84498XEg) {
        InterfaceC84498XEg interfaceC84498XEg2 = interfaceC84498XEg;
        if (interfaceC84498XEg2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.LJLIL);
            interfaceC84498XEg2.LJ(arrayList, false, null, new C84921XUn(this));
        }
    }

    public C84922XUo(C84923XUp c84923XUp, String str) {
        this.LJLILLLLZI = c84923XUp;
        this.LJLIL = str;
    }
}
