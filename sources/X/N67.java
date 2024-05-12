package X;

import com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;

/* loaded from: classes11.dex */
public final class N67 extends AbstractC65781Prl implements InterfaceC65784Pro<IVideoPlayTaskManager> {
    public static final N67 LJLIL = new N67();

    public N67() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager] */
    @Override // X.InterfaceC65784Pro
    public final IVideoPlayTaskManager invoke() {
        ?? LIZ = C58096Mr6.LIZ(IVideoPlayTaskManager.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        return new VideoPlayTaskManager();
    }
}
