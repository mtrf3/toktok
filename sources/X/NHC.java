package X;

import com.ss.android.ugc.aweme.commercialize.service.TcmOutService;
import com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmOutService;

/* loaded from: classes11.dex */
public final class NHC extends AbstractC65781Prl implements InterfaceC65784Pro<NH9> {
    public static final NHC LJLIL = new NHC();

    public NHC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final NH9 invoke() {
        ITcmOutService tcmOutService;
        Object LIZ = C58096Mr6.LIZ(ITcmOutService.class, false);
        if (LIZ != null) {
            tcmOutService = (ITcmOutService) LIZ;
        } else {
            tcmOutService = new TcmOutService();
        }
        return tcmOutService.LIZ();
    }
}
