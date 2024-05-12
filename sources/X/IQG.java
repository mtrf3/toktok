package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;

/* loaded from: classes9.dex */
public final class IQG {
    public Aweme LIZ;
    public Aweme LIZIZ;
    public final C47246IgU LIZJ;
    public final OnUIPlayListener LIZLLL;
    public final IQJ LJ;
    public IWF LJFF;

    public final VideoUrlModel LIZ() {
        Video video;
        VideoUrlModel properPlayAddr;
        String aid;
        IQJ iqj = this.LJ;
        Aweme aweme = this.LIZ;
        iqj.getClass();
        if (aweme == null || (video = aweme.getVideo()) == null || (properPlayAddr = video.getProperPlayAddr()) == null) {
            return null;
        }
        Aweme aweme2 = this.LIZ;
        if (aweme2 != null) {
            Aweme aweme3 = this.LIZIZ;
            if (aweme3 == null) {
                aid = aweme2.getAid();
            } else {
                aid = aweme3.getAid();
            }
            video.setRationAndSourceId(aid);
        }
        return properPlayAddr;
    }

    public final boolean LIZIZ() {
        C47246IgU c47246IgU = this.LIZJ;
        if (c47246IgU == null || !c47246IgU.d4()) {
            return false;
        }
        Aweme aweme = this.LIZ;
        if (aweme != null && aweme.getStatus() != null && this.LIZ.getStatus().isDelete()) {
            return false;
        }
        return true;
    }

    public IQG(VideoViewComponent videoViewComponent, OnUIPlayListener onUIPlayListener) {
        UPJ upj = IQJ.LJIL;
        this.LIZJ = videoViewComponent.LJLJI;
        this.LIZLLL = onUIPlayListener;
        this.LJ = upj;
    }
}
