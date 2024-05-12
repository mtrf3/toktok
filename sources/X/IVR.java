package X;

import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import com.ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.Collections;

/* loaded from: classes9.dex */
public class IVR {
    public static final PreloadStrategyConfig LIZ;

    static {
        PreloadStrategyConfig preloadStrategyConfig = new PreloadStrategyConfig();
        LIZ = preloadStrategyConfig;
        preloadStrategyConfig.tasks = Collections.singletonList(new PreloadTask());
    }
}
