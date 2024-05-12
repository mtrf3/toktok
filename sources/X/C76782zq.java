package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.service.appsettings.RecommendedChatDelaySettingsModel;

/* renamed from: X.2zq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76782zq extends AbstractC65781Prl implements InterfaceC65784Pro<RecommendedChatDelaySettingsModel> {
    public static final C76782zq LJLIL = new C76782zq();

    public C76782zq() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.im.service.appsettings.RecommendedChatDelaySettingsModel] */
    @Override // X.InterfaceC65784Pro
    public final RecommendedChatDelaySettingsModel invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        RecommendedChatDelaySettingsModel recommendedChatDelaySettingsModel = C76772zp.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("im_recommended_chat_delay_config", RecommendedChatDelaySettingsModel.class, recommendedChatDelaySettingsModel);
        if (LJIIIIZZ == 0) {
            return recommendedChatDelaySettingsModel;
        }
        return LJIIIIZZ;
    }
}
