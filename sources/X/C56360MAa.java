package X;

import android.content.Context;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.MAa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56360MAa implements InterfaceC252619vl {
    public final /* synthetic */ Context LJLIL;

    public C56360MAa(Context context) {
        this.LJLIL = context;
    }

    @Override // X.InterfaceC252619vl
    public final void t0(int i, User user, User user2) {
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 11) {
            return;
        }
        if (MAX.LIZ(this.LJLIL)) {
            MAR.LIZLLL(MAR.LIZ, this.LJLIL);
        }
        boolean LIZJ = C40683Fxv.LIZJ();
        C40683Fxv.LIZ(this.LJLIL, LIZJ);
        if (!MAX.LIZIZ(this.LJLIL) || !LIZJ) {
            return;
        }
        MAR.LIZJ(this.LJLIL, "widget_preinstall_blank_page");
    }
}
