package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes10.dex */
public final class MWB extends MWY {
    public final /* synthetic */ C56910MVe LIZ;

    @Override // X.MWY, X.InterfaceC51701KQv
    public final String getEnterFrom() {
        C56906MVa.Companion.getClass();
        return "notification_page";
    }

    public MWB(C56910MVe c56910MVe) {
        this.LIZ = c56910MVe;
    }

    @Override // X.MWY, X.InterfaceC51701KQv
    public final void LIZIZ(User user, int i) {
        C56760MPk.LJIIL("follow", "comment", "inbox_interaction_message", user, null);
        C56760MPk.LJIIJJI(user);
    }
}
