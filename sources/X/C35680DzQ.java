package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.CommentSampleRateSetting;

/* renamed from: X.DzQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35680DzQ extends AbstractC65781Prl implements InterfaceC65784Pro<CommentSampleRateSetting.Config> {
    public static final C35680DzQ LJLIL = new C35680DzQ();

    public C35680DzQ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final CommentSampleRateSetting.Config invoke() {
        CommentSampleRateSetting.Config config;
        try {
            SettingsManager.LIZLLL().getClass();
            config = (CommentSampleRateSetting.Config) SettingsManager.LJII("comment_event_sample_rate", CommentSampleRateSetting.Config.class);
        } catch (Throwable unused) {
            config = CommentSampleRateSetting.LIZ;
        }
        if (config == null) {
            return CommentSampleRateSetting.LIZ;
        }
        return config;
    }
}
