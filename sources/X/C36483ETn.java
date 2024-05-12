package X;

import com.ss.android.ugc.gamora.recorder.navi.featureflags.TiktokAvatarLokiConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.ETn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36483ETn extends AbstractC65781Prl implements InterfaceC65784Pro<TiktokAvatarLokiConfig.TiktokAvatarLokiConfigData> {
    public static final C36483ETn LJLIL = new C36483ETn();

    public C36483ETn() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final TiktokAvatarLokiConfig.TiktokAvatarLokiConfigData invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        TiktokAvatarLokiConfig.TiktokAvatarLokiConfigData tiktokAvatarLokiConfigData = TiktokAvatarLokiConfig.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "tiktok_avatar_loki_config", 31744, TiktokAvatarLokiConfig.TiktokAvatarLokiConfigData.class, tiktokAvatarLokiConfigData);
        if (LJIJ != 0) {
            tiktokAvatarLokiConfigData = LJIJ;
        }
        o.LJIIIIZZ(tiktokAvatarLokiConfigData, "ABManager.getInstance().…g::class.java) ?: DEFAULT");
        return tiktokAvatarLokiConfigData;
    }
}
