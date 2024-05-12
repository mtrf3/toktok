package X;

import com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment;

/* loaded from: classes13.dex */
public final class SKG extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final SKG LJLIL = new SKG();

    public SKG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        if (BetaAppExperiment.LJII) {
            return "//googleplay";
        }
        return "//setting/beta_register_internal";
    }
}
