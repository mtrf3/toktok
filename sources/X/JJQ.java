package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.model.VideoTag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;

/* loaded from: classes9.dex */
public final class JJQ {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(Aweme aweme) {
        VideoTag videoTag;
        String englishTitle;
        if (aweme != null) {
            if (aweme.getNewLabel() == 1) {
                return "New";
            }
            Video video = aweme.getVideo();
            if (video != null && (videoTag = video.getVideoTag()) != null && (englishTitle = videoTag.getEnglishTitle()) != null) {
                return englishTitle;
            }
        }
        return "";
    }

    public static final void LIZIZ(Aweme aweme) {
        String str;
        String str2;
        Video video;
        VideoTag videoTag;
        if (aweme.getNewLabel() == 1) {
            str = "New";
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            Video video2 = aweme.getVideo();
            if (video2 != null && (videoTag = video2.getVideoTag()) != null) {
                str2 = videoTag.getTitle();
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2) || (video = aweme.getVideo()) == null) {
                return;
            }
            VideoTag videoTag2 = new VideoTag();
            videoTag2.setTitle(str);
            video.setVideoTag(videoTag2);
        }
    }
}
