package X;

import androidx.lifecycle.ViewModelProvider;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FeedMultiTabOrderSettings;
import com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.LMj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54133LMj {
    public static boolean LIZIZ() {
        o.LJIIIIZZ(Keva.getRepo("slide_mask_guide_repo"), "getRepo(REPO_NAME)");
        return FeedMultiTabOrderSettings.LIZ().contains("homepage_stem");
    }

    public static SlideGuideViewModel LIZ(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return (SlideGuideViewModel) new ViewModelProvider(activity, new LNE(activity)).get(SlideGuideViewModel.class);
    }
}
