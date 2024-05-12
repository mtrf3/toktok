package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.sdk.chat.controller.preload.IMPreloadConfig;

/* renamed from: X.3Yr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85893Yr extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C85893Yr LJLIL = new C85893Yr();

    public C85893Yr() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        IMPreloadConfig iMPreloadConfig;
        try {
            SettingsManager.LIZLLL().getClass();
            iMPreloadConfig = (IMPreloadConfig) SettingsManager.LJII("im_preload_setting_config", IMPreloadConfig.class);
            if (iMPreloadConfig == null) {
                iMPreloadConfig = C85903Ys.LIZ;
            }
        } catch (Throwable unused) {
            iMPreloadConfig = C85903Ys.LIZ;
        }
        return Integer.valueOf(iMPreloadConfig.maxCountPerConversation);
    }
}
