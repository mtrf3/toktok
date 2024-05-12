package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.consumption.FeedConsumeParamsWithRequestConfig;

/* renamed from: X.Y9o, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86924Y9o extends AbstractC65781Prl implements InterfaceC65784Pro<FeedConsumeParamsWithRequestConfig> {
    public static final C86924Y9o LJLIL = new C86924Y9o();

    public C86924Y9o() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.experiment.consumption.FeedConsumeParamsWithRequestConfig] */
    @Override // X.InterfaceC65784Pro
    public final FeedConsumeParamsWithRequestConfig invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        FeedConsumeParamsWithRequestConfig feedConsumeParamsWithRequestConfig = C86921Y9l.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("use_real_time_feed_consume_info_settings", FeedConsumeParamsWithRequestConfig.class, feedConsumeParamsWithRequestConfig);
        if (LJIIIIZZ == 0) {
            return feedConsumeParamsWithRequestConfig;
        }
        return LJIIIIZZ;
    }
}
