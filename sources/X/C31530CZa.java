package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentConfig;

/* renamed from: X.CZa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31530CZa extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C31530CZa LJLIL = new C31530CZa();

    public C31530CZa() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(SettingsManager.INSTANCE.getLongValue(LiveStarCommentConfig.class));
    }
}
