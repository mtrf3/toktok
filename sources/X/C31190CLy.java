package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePlayerMuteSetting;

/* renamed from: X.CLy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31190CLy extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C31190CLy LJLIL = new C31190CLy();

    public C31190CLy() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(GameLivePlayerMuteSetting.class));
    }
}
