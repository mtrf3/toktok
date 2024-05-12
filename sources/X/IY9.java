package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LongVideo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import java.util.List;

/* loaded from: classes9.dex */
public final class IY9 implements IY4 {
    @Override // X.IY4
    public final /* synthetic */ boolean LIZ() {
        return true;
    }

    @Override // X.IY4
    public final String getName() {
        return "SplashAdLocalUrlHook";
    }

    @Override // X.IY4
    public final /* synthetic */ boolean isValid() {
        return true;
    }

    @Override // X.IY4
    public final IY0 LIZIZ(IY5 iy5) {
        IYI iyi = iy5.LIZJ;
        VideoUrlModel LJJJJLL = C51029K0z.LJJJJLL(iyi.LIZ);
        String LJI = C55511LqV.LJI(LJJJJLL.getSourceId(), C55511LqV.LJFF(LJJJJLL));
        if (!TextUtils.isEmpty(LJI)) {
            return new IY0(LJI);
        }
        return iy5.LIZIZ(iyi);
    }

    @Override // X.IY4
    public final IY0 LIZJ(IY5 iy5) {
        Aweme i6;
        List<LongVideo> longVideos;
        Video video;
        IYH iyh = iy5.LIZIZ;
        VideoUrlModel LJJJJZ = C51029K0z.LJJJJZ(iyh.LIZ);
        String sourceId = LJJJJZ.getSourceId();
        double duration = LJJJJZ.getDuration();
        if (!TextUtils.isEmpty(sourceId) && (i6 = AwemeService.LIZ().i6(sourceId)) != null && (longVideos = i6.getLongVideos()) != null && !longVideos.isEmpty()) {
            for (LongVideo longVideo : longVideos) {
                if (longVideo != null && (video = longVideo.getVideo()) != null && video.getDuration() == duration) {
                    return iy5.LIZ(iyh);
                }
            }
        }
        String LJI = C55511LqV.LJI(LJJJJZ.getSourceId(), C55511LqV.LJFF(LJJJJZ));
        if (!TextUtils.isEmpty(LJI)) {
            return new IY0(LJI);
        }
        return iy5.LIZ(iyh);
    }
}
