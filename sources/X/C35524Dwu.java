package X;

import com.ss.android.ugc.aweme.video.experiment.JatoBoostConfig;
import com.ss.android.ugc.aweme.video.experiment.JatoPlayConfig;

/* renamed from: X.Dwu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35524Dwu extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C35524Dwu LJLIL = new C35524Dwu();

    public C35524Dwu() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        JatoBoostConfig jatoBoostConfig;
        JatoPlayConfig jatoPlayConfig = (JatoPlayConfig) C35171DrD.LIZ.getValue();
        if (jatoPlayConfig != null && (jatoBoostConfig = jatoPlayConfig.playConfig) != null && jatoBoostConfig.L()) {
            C35532Dx2.LIZ(jatoBoostConfig);
        }
        return C76800UCe.LIZ;
    }
}
