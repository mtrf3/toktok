package X;

import com.ss.android.ugc.aweme.innerpush.settings.InnerPushConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YBP extends AbstractC65781Prl implements InterfaceC65784Pro<InnerPushConfig.MetaData> {
    public static final YBP LJLIL = new YBP();

    public YBP() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final InnerPushConfig.MetaData invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        InnerPushConfig.MetaData metaData = InnerPushConfig.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "in_app_push_config", 31744, InnerPushConfig.MetaData.class, metaData);
        if (LJIJ != 0) {
            metaData = LJIJ;
        }
        o.LJIIIIZZ(metaData, "ABManager.getInstance().…g::class.java) ?: DEFAULT");
        return metaData;
    }
}
