package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.OlJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62833OlJ implements InterfaceC252619vl {
    public static final C62833OlJ LJLIL = new C62833OlJ();

    @Override // X.InterfaceC252619vl
    public final void t0(int i, User user, User user2) {
        String str;
        String str2;
        String str3;
        String str4;
        if (user2 != null) {
            str = user2.getUid();
        } else {
            str = null;
        }
        if (o.LJ(str, C62834OlK.LIZ)) {
            C7XD.LIZ("NowSessionInstanceStore", "same uid, skip");
            return;
        }
        if (user2 != null) {
            str2 = user2.getUid();
        } else {
            str2 = null;
        }
        C62834OlK.LIZ = str2;
        StringBuilder LJ = C7MY.LJ("on account changed, ", i, ", ");
        if (user != null) {
            str3 = user.getUid();
        } else {
            str3 = null;
        }
        LJ.append(str3);
        LJ.append(", ");
        if (user2 != null) {
            str4 = user2.getUid();
        } else {
            str4 = null;
        }
        LJ.append(str4);
        LJ.append(", ");
        LJ.append((Object) null);
        C7XD.LIZ("NowSessionInstanceStore", X1D.LIZIZ(LJ));
        C62834OlK.LIZIZ.clear();
    }
}
