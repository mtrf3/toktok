package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.7tl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200417tl extends JHL<C200417tl> {
    public String LJJL;
    public String LJJLI;
    public String LJJLIIIIJ;
    public String LJJLIIIJ;
    public int LJJLIIIJILLIZJL;
    public int LJJLIIIJJI;
    public int LJJLIIIJJIZ;

    public C200417tl() {
        super("unlogin_like");
        this.LJI = true;
    }

    @Override // X.JHM
    public final void LJII() {
        String str = this.LJJL;
        C1798874e c1798874e = InterfaceC1798974f.LIZIZ;
        LJ("group_id", str, c1798874e);
        LJ("author_id", this.LJJLI, c1798874e);
        LJ("request_id", this.LJJLIIIIJ, c1798874e);
        if (C227768wm.LJJIIJ(this.LIZLLL)) {
            LIZIZ(this.LJJLIIIIJ);
        }
        if (!TextUtils.equals(this.LIZ, "like_cancel")) {
            TextUtils.equals(this.LIZ, "unlogin_like");
        }
        if (C1808377v.LIZ().LIZIZ(this.LJJL)) {
            LJ("previous_page", "push", InterfaceC1798974f.LIZ);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJ)) {
            LJ("enter_method", this.LJJLIIIJ, InterfaceC1798974f.LIZ);
        }
        String valueOf = String.valueOf(this.LJJLIIIJILLIZJL);
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        LJ("is_first", valueOf, c1799074g);
        LJ("is_login_notify", String.valueOf(this.LJJLIIIJJI), c1799074g);
    }

    public final void LJJIIZ(Aweme aweme) {
        String LJIILL;
        LJIILL(aweme);
        if (aweme != null) {
            this.LJJL = aweme.getAid();
            this.LJJLI = JHM.LJIIIZ(aweme);
            if (TextUtils.isEmpty(C227768wm.LJIILL(this.LJJLIIIJJIZ, aweme))) {
                LJIILL = aweme.getRequestId();
            } else {
                LJIILL = C227768wm.LJIILL(this.LJJLIIIJJIZ, aweme);
            }
            this.LJJLIIIIJ = LJIILL;
        }
    }
}
