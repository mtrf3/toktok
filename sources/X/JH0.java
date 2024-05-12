package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.List;

/* loaded from: classes9.dex */
public final class JH0 extends C48894JGw implements InterfaceC207288Bo {
    public boolean LJLJJI;

    @Override // X.C48894JGw, X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
    }

    @Override // X.InterfaceC207288Bo
    public final void LIZ() {
        if (!this.LJLJJI) {
            this.LJLJJI = true;
            LJFF();
        }
    }

    @Override // X.C48894JGw, X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        super.onRenderFirstFrame(it4);
        this.LJLJJI = false;
    }

    public JH0(C48881JGj c48881JGj, C50321Joz c50321Joz) {
        super(c48881JGj, c50321Joz);
    }

    @Override // X.C48894JGw
    public final void LJII(Aweme aweme, JQA jqa, long j) {
        int i;
        Aweme aweme2;
        int i2;
        List<PhotoModeImageUrlModel> imageList;
        if (aweme == null || jqa == null) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("search_id", jqa.LJII);
        c188727au.LJIIIZ("search_result_id", jqa.LJJIIZ.invoke(aweme));
        c188727au.LJIIIZ("search_keyword", jqa.LJ);
        c188727au.LJIIIZ("enter_from", jqa.LJFF);
        C50321Joz c50321Joz = this.LJLILLLLZI;
        if (c50321Joz != null) {
            i = c50321Joz.getTabIndex();
        } else {
            i = -1;
        }
        c188727au.LJIIIZ("search_type", C50676Jui.LIZ(i));
        c188727au.LJIIIZ("group_id", aweme.getAid());
        c188727au.LJIIIZ("author_id", aweme.getAuthorUid());
        InterfaceC88472Yns<? super Aweme, String> interfaceC88472Yns = jqa.LJJIJIL;
        C48881JGj c48881JGj = this.LJLIL;
        if (c48881JGj != null) {
            aweme2 = c48881JGj.LIZJ;
        } else {
            aweme2 = null;
        }
        c188727au.LJIIIZ("list_item_id", interfaceC88472Yns.invoke(aweme2));
        c188727au.LJIIIZ("token_type", jqa.LJIJJLI);
        int i3 = 0;
        c188727au.LIZLLL(0, "is_fullscreen");
        Video video = aweme.getVideo();
        if (video != null) {
            i2 = video.getDuration();
        } else {
            i2 = 0;
        }
        c188727au.LIZLLL(i2, "video_duration");
        c188727au.LIZLLL(aweme.getAwemeType(), "aweme_type");
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            i3 = imageList.size();
        }
        c188727au.LIZLLL(i3, "pic_cnt");
        c188727au.LJ(j, "duration");
        c188727au.LJ(j, "play_duration");
        c188727au.LJ(j, "post_stay_duration");
        FMX.LJIIL("post_stay_time", c188727au.LIZ);
    }
}
