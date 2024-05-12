package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentProtectSetting;

/* renamed from: X.Boa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29912Boa extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C29912Boa LJLIL = new C29912Boa();

    public C29912Boa() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveStarCommentProtectSetting.class));
    }
}
