package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.story.experiment.StoryPhotoMultiRateConfig;

/* renamed from: X.XFl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84529XFl extends AbstractC65781Prl implements InterfaceC65784Pro<StoryPhotoMultiRateConfig> {
    public static final C84529XFl LJLIL = new C84529XFl();

    public C84529XFl() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.story.experiment.StoryPhotoMultiRateConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final StoryPhotoMultiRateConfig invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        StoryPhotoMultiRateConfig storyPhotoMultiRateConfig = C84528XFk.LIZIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("tt_story_photo_multi_rate_config", StoryPhotoMultiRateConfig.class, storyPhotoMultiRateConfig);
        if (LJIIIIZZ == 0) {
            C84528XFk.LIZ.getClass();
            return storyPhotoMultiRateConfig;
        }
        return LJIIIIZZ;
    }
}
