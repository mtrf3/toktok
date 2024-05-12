package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;

/* renamed from: X.Loo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55406Loo extends JHL<C55406Loo> {
    public String LJJL;
    public Aweme LJJLI;
    public String LJJLIIIIJ;
    public String LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public int LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;

    public C55406Loo() {
        super("stay_time");
        this.LJI = true;
    }

    @Override // X.JHM
    public final void LJII() {
        String valueOf = String.valueOf(this.LJJLIIIJLLLLLLLZ);
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        LJ("video_consumed", valueOf, c1799074g);
        LJ("duration", this.LJJL, c1799074g);
        LJ("enter_from", this.LIZLLL, c1799074g);
        LJ("enter_method", this.LJJLIIJ, c1799074g);
        LJ("group_id", this.LJJLIIIIJ, c1799074g);
        LJ("author_id", C227768wm.LIZJ(this.LJJLI), c1799074g);
        LJ("city_info", "", c1799074g);
        LJ("page_uid", this.LJJLIIIJJI, c1799074g);
        if (!TextUtils.isEmpty(this.LJJLIIIJILLIZJL)) {
            LJ("previous_page", this.LJJLIIIJILLIZJL, c1799074g);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("page_type", null, c1799074g);
        }
        if (TextUtils.equals(this.LJJLIIIJILLIZJL, "homepage_hot") || TextUtils.equals(this.LJJLIIIJILLIZJL, "homepage_follow")) {
            int i = !TextUtils.equals(this.LJJLIIIJILLIZJL, "homepage_hot") ? 1 : 0;
            LJ("feeds_group_id", this.LJJLIIIJ, c1799074g);
            LJ("log_pb", C3A5.LIZ.LIZIZ(C227768wm.LJIILLIIL(i, this.LJJLIIIJ)), c1799074g);
        }
        if (C227768wm.LJJII(this.LIZLLL)) {
            LIZLLL("notice_type", "");
            LIZLLL("show_cnt", String.valueOf(0));
            LIZLLL("yellow_dot_logid", "");
        }
        if (C227768wm.LJJI(this.LIZLLL)) {
            String str = this.LJJLIIIJJIZ;
            String str2 = this.LJJLIIIJL;
            LIZLLL("process_id", str);
            LIZLLL("tag_id", str2);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJLJLI)) {
            LIZLLL("playlist_id", this.LJJLIIIJLJLI);
        }
        if (TextUtils.equals("homepage_nearby", this.LIZLLL)) {
            Context LIZIZ = EF7.LIZIZ();
            OHI.LIZ.getClass();
            LIZJ(OHI.LJ(LIZIZ, "android.permission.ACCESS_COARSE_LOCATION") ? 1 : 0, "enable_location");
        }
    }

    public final void LJJIIZ(Aweme aweme) {
        PlayListInfo playListInfo;
        LJIILL(aweme);
        this.LJJLI = aweme;
        this.LJJLIIIIJ = C227768wm.LIZIZ(aweme);
        if (aweme != null && (playListInfo = aweme.playlist_info) != null && playListInfo.getMixId() != null) {
            this.LJJLIIIJLJLI = aweme.playlist_info.getMixId();
        }
    }
}
