package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.assem.review.VideoReviewStatusBarAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.OriginalAudioStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HWe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44196HWe extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoReviewStatusBarAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C44196HWe LJLIL = new C44196HWe();

    public C44196HWe() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoReviewStatusBarAssem videoReviewStatusBarAssem, C43I<? extends Integer> c43i) {
        int i;
        UrlModel urlModel;
        List<String> urlList;
        VideoReviewStatusBarAssem selectSubscribe = videoReviewStatusBarAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            String str = "photo_mode";
            String str2 = null;
            if (((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).isMyProfile) {
                Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
                o.LJIIIIZZ(aweme, "item.aweme");
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "personal_homepage");
                c188727au.LJIIIZ("group_id", aweme.getAid());
                Music music = aweme.getMusic();
                if (music != null) {
                    str2 = music.getIdStr();
                }
                c188727au.LJIIIZ("music_id", str2);
                Video video = aweme.getVideo();
                int i2 = 0;
                if (video != null && video.isLongVideo()) {
                    i = 1;
                } else {
                    i = 0;
                }
                c188727au.LIZLLL(i, "is_long_video");
                OriginalAudioStruct originalAudioStruct = aweme.originalAudio;
                if (originalAudioStruct != null && (urlModel = originalAudioStruct.playUrl) != null && (urlList = urlModel.getUrlList()) != null && (!urlList.isEmpty())) {
                    i2 = 1;
                }
                c188727au.LIZLLL(i2, "video_has_original_sound");
                if (!aweme.isPhotoMode()) {
                    str = "video";
                }
                c188727au.LJIIIZ("replace_music_content_type", str);
                FMX.LJIIL("replace_bar_show", c188727au.LIZ);
            } else {
                Aweme aweme2 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
                o.LJIIIIZZ(aweme2, "item.aweme");
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("enter_from", "others_homepage");
                c188727au2.LJIIIZ("group_id", aweme2.getAid());
                Music music2 = aweme2.getMusic();
                if (music2 != null) {
                    str2 = music2.getIdStr();
                }
                c188727au2.LJIIIZ("music_id", str2);
                if (!aweme2.isPhotoMode()) {
                    str = "video";
                }
                c188727au2.LJIIIZ("replace_music_content_type", str);
                FMX.LJIIL("music_removed_bar_show", c188727au2.LIZ);
            }
        }
        return C76800UCe.LIZ;
    }
}
