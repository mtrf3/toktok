package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LikeOptModel;
import com.bytedance.android.livesdk.livesetting.performance.LiveLikeOptSetting;

/* renamed from: X.Ce8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31812Ce8 extends AbstractC65781Prl implements InterfaceC65784Pro<LikeOptModel> {
    public static final C31812Ce8 LJLIL = new C31812Ce8();

    public C31812Ce8() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.performance.LikeOptModel, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LikeOptModel invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveLikeOptSetting.class);
        if (valueSafely == 0) {
            return LiveLikeOptSetting.DEFAULT;
        }
        return valueSafely;
    }
}
