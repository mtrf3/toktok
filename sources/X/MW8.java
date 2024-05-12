package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes10.dex */
public final class MW8 extends MWY {
    public final /* synthetic */ C56909MVd LIZ;

    @Override // X.MWY, X.InterfaceC51701KQv
    public final String getEnterFrom() {
        C56906MVa.Companion.getClass();
        return "notification_page";
    }

    public MW8(C56909MVd c56909MVd) {
        this.LIZ = c56909MVd;
    }

    @Override // X.MWY, X.InterfaceC51701KQv
    public final void LIZIZ(User user, int i) {
        C56760MPk.LJIIL("follow", "like", "inbox_interaction_message", user, null);
        C56760MPk.LJIIJJI(user);
    }
}
