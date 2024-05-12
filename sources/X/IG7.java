package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;

/* loaded from: classes9.dex */
public final class IG7 implements InterfaceC59389NSn {
    public static final IG7 LIZ = new IG7();

    @Override // X.InterfaceC59389NSn
    public final long getCurrentPosition() {
        return IWF.LJJLIIIIJ().getCurrentPosition();
    }

    public static long LIZ(Aweme aweme) {
        Video video;
        long duration = IWF.LJJLIIIIJ().getDuration();
        if (duration > 0) {
            return duration;
        }
        if (aweme != null && (video = aweme.getVideo()) != null && Integer.valueOf(video.getDuration()) != null && aweme.getVideo().getDuration() > 0) {
            return aweme.getVideo().getDuration();
        }
        return 1L;
    }
}
