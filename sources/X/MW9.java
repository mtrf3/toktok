package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes10.dex */
public final class MW9 extends MWY {
    public final /* synthetic */ C56911MVf LIZ;

    @Override // X.MWY, X.InterfaceC51701KQv
    public final String getEnterFrom() {
        C56906MVa.Companion.getClass();
        return "notification_page";
    }

    public MW9(C56911MVf c56911MVf) {
        this.LIZ = c56911MVf;
    }

    @Override // X.MWY, X.InterfaceC51701KQv
    public final void LIZIZ(User user, int i) {
        C56760MPk.LJIIL("follow", "at", "inbox_interaction_message", user, null);
        C56760MPk.LJIIJJI(user);
    }
}
