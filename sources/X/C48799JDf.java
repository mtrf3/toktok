package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.JDf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48799JDf implements InterfaceC87433YTd {
    public final /* synthetic */ JGI LIZ;

    @Override // X.InterfaceC87433YTd
    public final String LIZIZ() {
        return "search_video_card";
    }

    @Override // X.InterfaceC87433YTd
    public final void LIZ() {
        String str;
        if (this.LIZ.LJLZ) {
            YTW.LIZLLL("search_video_card");
            this.LIZ.LLLJIL();
            YTW.LIZJ(Boolean.valueOf(this.LIZ.isPlaying()), "search_video_card");
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "general_search");
            Aweme mAweme = this.LIZ.getMAweme();
            String str2 = null;
            if (mAweme != null) {
                str = mAweme.getAid();
            } else {
                str = null;
            }
            c188727au.LJIIIZ("group_id", str);
            Aweme mAweme2 = this.LIZ.getMAweme();
            if (mAweme2 != null) {
                str2 = mAweme2.getAuthorUid();
            }
            c188727au.LJIIIZ("author_id", str2);
            FMX.LJIIL("earphone_play_continue", c188727au.LIZ);
            this.LIZ.setPausedByDisconnection(false);
        }
    }

    public C48799JDf(JGI jgi) {
        this.LIZ = jgi;
    }
}
