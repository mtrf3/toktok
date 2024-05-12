package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes9.dex */
public final class J85 extends JHM {
    public Aweme LJIILJJIL;
    public String LJIILL;

    public J85() {
        super("click_video_play");
        this.LJIILL = "";
    }

    @Override // X.JHM
    public final void LJII() {
        int i;
        LIZLLL("from_page", this.LJIILL);
        LIZLLL("enter_from", this.LIZLLL);
        LJ("group_id", C227768wm.LIZIZ(this.LJIILJJIL), InterfaceC1798974f.LIZIZ);
        Aweme aweme = this.LJIILJJIL;
        if (aweme != null) {
            i = aweme.getAwemeType();
        } else {
            i = 0;
        }
        LIZJ(i, "aweme_type");
        Aweme aweme2 = this.LJIILJJIL;
        if (aweme2 != null) {
            LIZLLL("author_id", aweme2.getAuthorUid());
        }
        String LIZIZ = C3A5.LIZ.LIZIZ(C227768wm.LJIIZILJ(this.LJIILJJIL));
        if (LIZIZ != null) {
            LIZLLL("log_pb", LIZIZ);
        }
        String LIZ = C187677Yd.LIZ(this.LJIILJJIL);
        if (LIZ != null && !LIZ.isEmpty()) {
            LIZLLL("photo_content_type", LIZ);
        }
        LIZJ(C84763XOl.LJIIJJI ? 1 : 0, "is_background");
        Aweme aweme3 = this.LJIILJJIL;
        if (aweme3 != null && aweme3.getPodcastInfo() != null) {
            if (this.LJIILJJIL.getPodcastInfo().isPodcastPreview() != null && this.LJIILJJIL.getPodcastInfo().isPodcastPreview().booleanValue()) {
                LIZJ(1, "is_podcast_preview");
            } else {
                LIZJ(0, "is_podcast_preview");
            }
            if (this.LJIILJJIL.getPodcastInfo().getPlayAddr() != null && this.LJIILJJIL.getPodcastInfo().getPlayAddr().getUrlList() != null && !this.LJIILJJIL.getPodcastInfo().getPlayAddr().getUrlList().isEmpty() && !TextUtils.isEmpty((CharSequence) ListProtector.get(this.LJIILJJIL.getPodcastInfo().getPlayAddr().getUrlList(), 0))) {
                LIZLLL("podcast_rss_feed_url", (String) ListProtector.get(this.LJIILJJIL.getPodcastInfo().getPlayAddr().getUrlList(), 0));
            } else {
                LIZLLL("podcast_rss_feed_url", "");
            }
            if (this.LJIILJJIL.getPodcastInfo().getEpisodeItemId() != null) {
                LIZLLL("podcast_rss_entry_id", this.LJIILJJIL.getPodcastInfo().getEpisodeItemId());
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
}
