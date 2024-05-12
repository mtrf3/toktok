package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentMaxConfig;

/* renamed from: X.CZb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31531CZb extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C31531CZb LJLIL = new C31531CZb();

    public C31531CZb() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveStarCommentMaxConfig.class));
    }
}
