package X;

import android.app.Dialog;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import v5.n;

/* renamed from: X.XUz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84933XUz implements IAVEffectService.IAVEffectReadyCallback<InterfaceC84498XEg> {
    public final /* synthetic */ n LJLIL;
    public final /* synthetic */ C10I LJLILLLLZI;
    public final /* synthetic */ XV0 LJLJI;

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
    public final void finish(InterfaceC84498XEg interfaceC84498XEg) {
        InterfaceC84498XEg interfaceC84498XEg2 = interfaceC84498XEg;
        if (interfaceC84498XEg2 != null) {
            this.LJLJI.LIZ.LIZIZ = interfaceC84498XEg2;
            this.LJLIL.LJ(interfaceC84498XEg2);
            this.LJLIL.LIZ.LIZLLL(this.LJLILLLLZI);
        } else {
            this.LJLJI.LIZ.LJJJJLI.onFail(null, new ExceptionResult(new RuntimeException("effect so fail")));
            Dialog dialog = this.LJLJI.LIZ.LJII;
            if (dialog == null) {
                return;
            }
            dialog.dismiss();
        }
    }

    public C84933XUz(XV0 xv0, n nVar, C84932XUy c84932XUy) {
        this.LJLJI = xv0;
        this.LJLIL = nVar;
        this.LJLILLLLZI = c84932XUy;
    }
}
