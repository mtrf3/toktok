package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentSchemaConfig;

/* renamed from: X.BJz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28591BJz extends AbstractC65781Prl implements InterfaceC65784Pro<LiveStarCommentSchemaConfig.Config> {
    public static final C28591BJz LJLIL = new C28591BJz();

    public C28591BJz() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentSchemaConfig$Config, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LiveStarCommentSchemaConfig.Config invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveStarCommentSchemaConfig.class);
        if (valueSafely == 0) {
            return LiveStarCommentSchemaConfig.DEFAULT;
        }
        return valueSafely;
    }
}
