package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import java.util.HashMap;

/* renamed from: X.7vU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201487vU extends AbstractC49253JUr<C201487vU> {
    public String LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public Aweme LJJLIIJ;
    public String LJJLIL;
    public String LJJLJ;
    public String LJJLJLI;
    public String LJJLL;
    public String LJJZ;
    public boolean LJJZZI;
    public String LJJZZIII;
    public String LJL;
    public String LJLI;
    public String LJLIIIL;
    public String LJLIIL;
    public boolean LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public int LJLJJLL;

    public C201487vU() {
        super("enter_tag_detail");
        this.LJJZZIII = "";
        this.LJLJJLL = -1;
        this.LJI = true;
    }

    @Override // X.JHM
    public final void LJII() {
        String str;
        String str2 = this.LJJLIIIJ;
        C1798874e c1798874e = InterfaceC1798974f.LIZIZ;
        LJ("group_id", str2, c1798874e);
        LJ("author_id", this.LJJLIIIJILLIZJL, c1798874e);
        LJ("tag_id", this.LJJLIIIJJI, c1798874e);
        String str3 = this.LJJLIIIJJIZ;
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        LJ("request_id", str3, c1799074g);
        LJ("category_name", this.LJLJJI, c1799074g);
        if (!C38354F3m.LJ(this.LJJLIIIJL)) {
            LJ("content_type", this.LJJLIIIJL, c1799074g);
        }
        if (C1808377v.LIZ().LIZIZ(this.LJJLIIIJ)) {
            LJ("previous_page", "push", c1799074g);
        } else if (!TextUtils.isEmpty(this.LJLIIIL)) {
            LJ("previous_page", this.LJLIIIL, c1799074g);
            LJ("previous_page_position", this.LJLIIL, c1799074g);
        }
        if (this.LJLIL) {
            LJ("is_instructive", "1", c1799074g);
            LJ("bottom_bar_show", "1", c1799074g);
        }
        if (C227768wm.LJJIIJ(this.LIZLLL)) {
            LIZIZ(this.LJJLIIIJJIZ);
        }
        if (!TextUtils.isEmpty(this.LJJLJ)) {
            LJ(this.LJJLJ, this.LJJLJLI, c1799074g);
        }
        if (TextUtils.equals(this.LIZLLL, "homepage_fresh") || TextUtils.equals(this.LIZLLL, "homepage_channel")) {
            C2UL.LIZ();
        }
        if (!TextUtils.isEmpty(this.LJJLIL)) {
            LJ("playlist_type", this.LJJLIL, c1799074g);
        }
        if (!TextUtils.isEmpty(this.LJJLL)) {
            LJ("impr_type", this.LJJLL, c1799074g);
        }
        if (!TextUtils.isEmpty(this.LJJZ)) {
            LJ("compilation_id", this.LJJZ, c1799074g);
        }
        LIZLLL("impr_id", this.LJJLIIIJJIZ);
        if (IG2.LIZ) {
            LIZLLL("is_fullscreen", "1");
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("search_keyword", null, c1799074g);
        }
        if (C227768wm.LJJIFFI(this.LIZLLL)) {
            if (this.LJJZZI) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            LIZLLL("relation_type", str);
            LIZLLL("video_type", this.LJL);
            LIZLLL("rec_uid", this.LJLI);
        }
        String str4 = this.LJJLIIIJLJLI;
        if (!TextUtils.isEmpty(str4)) {
            LIZLLL("process_id", str4);
        }
        if (!TextUtils.isEmpty(this.LJIILL)) {
            LIZLLL("tab_name", this.LJIILL);
        }
        if (!TextUtils.isEmpty(this.LJLJI)) {
            LIZLLL("hashtag", this.LJLJI);
        }
        if (!TextUtils.isEmpty(this.LJLILLLLZI)) {
            LIZLLL("parent_tag_id", this.LJLILLLLZI);
        }
        if (!TextUtils.isEmpty(null)) {
            LIZLLL("search_type", null);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJLLLLLLLZ)) {
            LIZLLL("tag_line", this.LJJLIIIJLLLLLLLZ);
        }
        if (!TextUtils.isEmpty(this.LJIILLIIL)) {
            LIZLLL("order", this.LJIILLIIL);
        }
        LIZJ(!TextUtils.isEmpty(null) ? 1 : 0, "is_bundled");
        if (!TextUtils.isEmpty(null)) {
            LIZLLL("prop_id", null);
        }
        if ("general_search".equals(this.LIZLLL) || "search_result".equals(this.LIZLLL)) {
            LIZLLL("last_from_group_id", this.LJLJJL);
        }
        LIZLLL("follow_status", this.LJJZZIII);
        Aweme aweme = this.LJJLIIJ;
        if (aweme != null) {
            LIZJ(aweme.getAwemeType(), "aweme_type");
            LIZJ(C227768wm.LJIJJ(this.LJJLIIJ), "text_post_content");
            LIZJ(C227768wm.LJIILIIL(this.LJJLIIJ), "pic_cnt");
            if (this.LJJJJJ.getMobParams() != null) {
                LIZ(this.LJJLIIJ.getMobParams());
            }
            CommonFeedApiService.LIZ().LJIJJLI(this.LJJJJJ, this);
            LQA.LIZIZ.LJII(this.LIZLLL, (HashMap) this.LIZIZ, this.LJJJJJ, true);
            C51556KLg.LIZ.getClass();
            java.util.Map LJIIJJI = C51556KLg.LIZ().LJIIJJI(this.LJJJJJ, null);
            if (!LJIIJJI.isEmpty()) {
                LIZ(LJIIJJI);
            }
            int i = this.LJLJJLL;
            if (i != -1) {
                LIZJ(i, "music_name");
            }
        }
    }

    public final void LJJIIZI(Aweme aweme) {
        String str;
        LJIILL(aweme);
        if (aweme != null) {
            this.LJJLIIJ = aweme;
            this.LJJLIIIJ = aweme.getAid();
            if (TextUtils.isEmpty(this.LJJLIIIJJIZ)) {
                this.LJJLIIIJJIZ = aweme.getRequestId();
            }
            if (aweme.getAuthor() != null) {
                str = aweme.getAuthor().getUid();
            } else {
                str = "";
            }
            this.LJJLIIIJILLIZJL = str;
            this.LJJLIIIJL = C227768wm.LJ(aweme);
            this.LJJLL = C227768wm.LJFF(aweme);
            if (aweme.getMixInfo() != null) {
                this.LJJZ = aweme.getMixInfo().mixId;
            }
            this.LJJZZI = AV1.LJIILJJIL(aweme);
            this.LJJZZIII = C227768wm.LJIJ(aweme.getAuthor());
            this.LJL = C227768wm.LJII(aweme);
            this.LJLI = C227768wm.LJI(aweme);
        }
    }

    public final void LJJIJ(String str) {
        if (!C38354F3m.LJ(str)) {
            this.LJJLIIIJJIZ = str;
        }
    }
}
