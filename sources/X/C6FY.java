package X;

import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* renamed from: X.6FY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6FY {
    public C147535qf LIZ;
    public C147535qf LIZIZ;

    public C6FY() {
        this(0);
    }

    public C6FY(int i) {
        this.LIZ = null;
        this.LIZIZ = null;
    }

    public final void LIZIZ(boolean z) {
        C147535qf c147535qf;
        C147535qf c147535qf2 = this.LIZ;
        if (c147535qf2 == null || (c147535qf = this.LIZIZ) == null) {
            return;
        }
        if (z) {
            LIZ(c147535qf2.LIZ, c147535qf.LIZ);
        } else {
            LIZ(c147535qf.LIZ, c147535qf2.LIZ);
        }
    }

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, VideoPublishEditModel videoPublishEditModel2) {
        if (videoPublishEditModel != null && videoPublishEditModel2 != null) {
            videoPublishEditModel2.setMMusicPath(videoPublishEditModel.getMMusicPath());
            videoPublishEditModel2.setMusicId(videoPublishEditModel.getMusicId());
            videoPublishEditModel2.setMusicOrigin(videoPublishEditModel.getMusicOrigin());
            videoPublishEditModel2.setMCurMusicLength(videoPublishEditModel.getMCurMusicLength());
            videoPublishEditModel2.setCommerceMusic(videoPublishEditModel.isCommerceMusic());
            videoPublishEditModel2.isOriginalSound = videoPublishEditModel.isOriginalSound();
            videoPublishEditModel2.setMId3Album(videoPublishEditModel.getMId3Album());
            videoPublishEditModel2.setMId3Title(videoPublishEditModel.getMId3Title());
            videoPublishEditModel2.setMMusicType(videoPublishEditModel.getMMusicType());
            videoPublishEditModel2.commentSetting = videoPublishEditModel.commentSetting;
            videoPublishEditModel2.allowDownloadSetting = videoPublishEditModel.allowDownloadSetting;
            videoPublishEditModel2.isPrivate = videoPublishEditModel.isPrivate;
            MusicBeanUtilKt.updateAVMusic(videoPublishEditModel2.creativeModel.musicBuzModel, MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel));
        }
    }
}
