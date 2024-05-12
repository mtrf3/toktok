package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;

/* loaded from: classes9.dex */
public final class J8I extends JHL<J8I> {
    public String LJJL;
    public String LJJLI;
    public String LJJLIIIIJ;
    public Aweme LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public int LJJLIIIJJI;
    public String LJJLIIIJJIZ;

    public J8I() {
        super("video_pause");
        this.LJJLIIIJILLIZJL = "";
        this.LJJLIIIJJIZ = "";
    }

    @Override // X.JHM
    public final void LJII() {
        int i;
        String str;
        PhotoModeImageInfo photoModeImageInfo;
        LIZLLL("pause_method", this.LJJLIIIJJIZ);
        String LIZJ = C227768wm.LIZJ(this.LJJLIIIJ);
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        LJ("author_id", LIZJ, c1799074g);
        LJ("group_id", this.LJJLI, InterfaceC1798974f.LIZIZ);
        LIZIZ(this.LJJLIIIIJ);
        LJ("enter_from", this.LJJL, c1799074g);
        LIZJ(this.LJJLIIIJJI, "is_long");
        LIZJ(this.LJJLIIIJ.getAwemeType(), "aweme_type");
        LIZJ(C227768wm.LJIJJ(this.LJJLIIIJ), "text_post_content");
        LIZLLL("from_page", this.LJJLIIIJILLIZJL);
        Aweme aweme = this.LJJLIIIJ;
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && photoModeImageInfo.hasTitle()) {
            i = 1;
        } else {
            i = 0;
        }
        LIZJ(i, "has_title");
        String LIZ = C187677Yd.LIZ(this.LJJLIIIJ);
        if (LIZ != null && !LIZ.isEmpty()) {
            LIZLLL("photo_content_type", LIZ);
        }
        String str2 = "1";
        if (this.LJJLIIIJ.isOnThisDayVideo().booleanValue()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZLLL("is_on_this_day", str);
        if (!C84763XOl.LJIIJJI) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZLLL("is_background", str2);
        LIZLLL("is_floating_window", CardStruct.IStatusCode.DEFAULT);
        Aweme aweme2 = this.LJJLIIIJ;
        if (aweme2 != null && aweme2.getPodcastInfo() != null) {
            if (this.LJJLIIIJ.getPodcastInfo().isPodcastPreview() != null && this.LJJLIIIJ.getPodcastInfo().isPodcastPreview().booleanValue()) {
                LIZJ(1, "is_podcast_preview");
            } else {
                LIZJ(0, "is_podcast_preview");
            }
            if (this.LJJLIIIJ.getPodcastInfo().getPlayAddr() != null && this.LJJLIIIJ.getPodcastInfo().getPlayAddr().getUrlList() != null && !this.LJJLIIIJ.getPodcastInfo().getPlayAddr().getUrlList().isEmpty() && !TextUtils.isEmpty((CharSequence) ListProtector.get(this.LJJLIIIJ.getPodcastInfo().getPlayAddr().getUrlList(), 0))) {
                LIZLLL("podcast_rss_feed_url", (String) ListProtector.get(this.LJJLIIIJ.getPodcastInfo().getPlayAddr().getUrlList(), 0));
            } else {
                LIZLLL("podcast_rss_feed_url", "");
            }
            if (this.LJJLIIIJ.getPodcastInfo().getEpisodeItemId() != null) {
                LIZLLL("podcast_rss_entry_id", this.LJJLIIIJ.getPodcastInfo().getEpisodeItemId());
                return;
            } else {
                LIZLLL("podcast_rss_entry_id", "");
                return;
            }
        }
        LIZJ(0, "is_podcast_preview");
        LIZLLL("podcast_rss_feed_url", "");
        LIZLLL("podcast_rss_entry_id", "");
    }

    public final void LJJIIZ(int i, Aweme aweme) {
        this.LJJLIIIJ = aweme;
        this.LJJLIIIIJ = RequestIdService.LJ().LIZIZ(i, aweme);
        this.LJJLI = C227768wm.LIZIZ(aweme);
        if (!TextUtils.isEmpty(aweme.partN)) {
            this.LJJLIIIJJI = 2;
        } else {
            if (aweme.getVideo() == null || !aweme.getVideo().isLongVideo()) {
                return;
            }
            this.LJJLIIIJJI = 1;
        }
    }
}
