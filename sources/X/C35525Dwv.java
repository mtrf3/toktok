package X;

import com.ss.android.ugc.aweme.video.experiment.JatoBoostConfig;
import com.ss.android.ugc.aweme.video.experiment.JatoPlayConfig;

/* renamed from: X.Dwv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35525Dwv extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C35525Dwv LJLIL = new C35525Dwv();

    public C35525Dwv() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        JatoBoostConfig jatoBoostConfig;
        JatoPlayConfig jatoPlayConfig = (JatoPlayConfig) C35171DrD.LIZ.getValue();
        if (jatoPlayConfig != null && (jatoBoostConfig = jatoPlayConfig.preRenderConfig) != null && jatoBoostConfig.L()) {
            C35532Dx2.LIZ(jatoBoostConfig);
        }
        return C76800UCe.LIZ;
    }
}
