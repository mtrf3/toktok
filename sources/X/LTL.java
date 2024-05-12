package X;

import com.ss.android.ugc.aweme.global.config.settings.pojo.SpringApiLimitConfig;

/* loaded from: classes10.dex */
public final class LTL extends AbstractC65781Prl implements InterfaceC65784Pro<SpringApiLimitConfig> {
    public static final LTL INSTANCE = new LTL();

    public LTL() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final SpringApiLimitConfig invoke() {
        try {
            return C2YJ.LIZIZ.LIZ.getSpringApiLimitConfig();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
