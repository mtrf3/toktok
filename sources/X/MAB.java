package X;

import android.content.Context;
import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes10.dex */
public final class MAB implements InterfaceC252619vl {
    public final /* synthetic */ Context LJLIL;

    public MAB(Context context) {
        this.LJLIL = context;
    }

    @Override // X.InterfaceC252619vl
    public final void t0(int i, User user, User user2) {
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            return;
        }
        MAA.LIZIZ(this.LJLIL, "on user change");
    }
}
