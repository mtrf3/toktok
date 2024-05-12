package X;

import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;

/* loaded from: classes9.dex */
public class IL7 implements IXJ<Boolean> {
    public final VideoUrlModel LIZ;

    @Override // X.IXJ
    public final /* synthetic */ Boolean LIZ() {
        return null;
    }

    @Override // X.IXJ
    public final Boolean get() {
        IUZ iuz = IUZ.INSTANCE;
        if (iuz.cacheChecker() == null) {
            return Boolean.FALSE;
        }
        IL8 cacheChecker = iuz.cacheChecker();
        VideoUrlModel videoUrlModel = this.LIZ;
        cacheChecker.getClass();
        return Boolean.valueOf(C47242IgQ.LIZ().isCache(C51029K0z.LJJJJI(videoUrlModel)));
    }

    public IL7(VideoUrlModel videoUrlModel) {
        this.LIZ = videoUrlModel;
    }
}
