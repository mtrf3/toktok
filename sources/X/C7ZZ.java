package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.7ZZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7ZZ extends JHL<C7ZZ> {
    public String LJJL;
    public String LJJLI;
    public String LJJLIIIIJ;
    public String LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public String LJJLIIIJLJLI;

    public C7ZZ() {
        super("unlogin_follow");
        this.LJI = true;
    }

    @Override // X.JHM
    public final void LJII() {
        String str = this.LJJL;
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        LJ("previous_page", str, c1799074g);
        LJ("previous_page_position", this.LJJLI, c1799074g);
        LJ("enter_method", this.LJJLIIIJJI, c1799074g);
        String str2 = this.LJJLIIIIJ;
        C1798874e c1798874e = InterfaceC1798974f.LIZIZ;
        LJ("to_user_id", str2, c1798874e);
        LJ("group_id", this.LJJLIIIJ, c1798874e);
        LJ("author_id", this.LJJLIIIIJ, c1798874e);
        LJ("aweme_type", this.LJJLIIIJL, c1799074g);
        LJ("request_id", this.LJJLIIIJILLIZJL, c1798874e);
        LJ("enter_type", null, c1799074g);
        LJ("text_post_content", this.LJJLIIIJLJLI, c1799074g);
        if (!TextUtils.isEmpty(null)) {
            LJ("enter_from_request", null, c1798874e);
        }
        if (C227768wm.LJJIIJ(this.LIZLLL) || "homepage_hot".equals(this.LJJL)) {
            LIZIZ(this.LJJLIIIJILLIZJL);
        }
        if (!TextUtils.equals(this.LIZ, "follow_cancel")) {
            TextUtils.equals(this.LIZ, "unlogin_follow");
        }
        if (C1808377v.LIZ().LIZIZ(this.LJJLIIIJ)) {
            LJ("previous_page", "push", c1799074g);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJJIZ)) {
            LJ("impr_type", this.LJJLIIIJJIZ, c1799074g);
        }
    }

    public final void LJJIIZ(int i, Aweme aweme) {
        LJIILL(aweme);
        if (aweme != null) {
            this.LJJLIIIJ = aweme.getAid();
            this.LJJLIIIJILLIZJL = JHM.LJIIJJI(i, aweme);
            this.LJJLIIIIJ = aweme.getAuthorUid();
            this.LJJLIIIJJIZ = C227768wm.LJFF(aweme);
            this.LJJLIIIJL = String.valueOf(aweme.getAwemeType());
            this.LJJLIIIJLJLI = String.valueOf(C227768wm.LJIJJ(aweme));
        }
    }
}
