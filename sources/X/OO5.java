package X;

import com.ss.android.ugc.aweme.feed.experiment.FeedDescSeeMoreConfig;

/* loaded from: classes11.dex */
public final class OO5 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(OO6.LJLIL);

    public static final boolean LIZ() {
        FeedDescSeeMoreConfig feedDescSeeMoreConfig;
        try {
            feedDescSeeMoreConfig = (FeedDescSeeMoreConfig) LIZ.getValue();
        } catch (Exception unused) {
            feedDescSeeMoreConfig = new FeedDescSeeMoreConfig(0, 0.18f);
        }
        if (feedDescSeeMoreConfig != null) {
            return feedDescSeeMoreConfig.getGroupId() == 3;
        }
        return false;
    }
}
