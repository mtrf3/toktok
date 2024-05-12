package X;

import com.ss.android.ugc.aweme.experiment.ExtAppLogConfig;

/* loaded from: classes9.dex */
public final class IEF extends AbstractC65781Prl implements InterfaceC65784Pro<ExtAppLogConfig> {
    public static final IEF LJLIL = new IEF();

    public IEF() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.ss.android.ugc.aweme.experiment.ExtAppLogConfig] */
    @Override // X.InterfaceC65784Pro
    public final ExtAppLogConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        ExtAppLogConfig extAppLogConfig = IEE.LIZ;
        LJIIIZ.getClass();
        ?? LJIJ = FFL.LJIJ(true, "player_ext_app_log", 31744, ExtAppLogConfig.class, extAppLogConfig);
        if (LJIJ == 0) {
            return extAppLogConfig;
        }
        return LJIJ;
    }
}
