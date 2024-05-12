package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.Kxm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53414Kxm implements InterfaceC252619vl {
    public static final C53414Kxm LJLIL = new C53414Kxm();
    public static final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C74345TFt.LJLIL);
    public static final Keva LJLJI;
    public static String LJLJJI;

    static {
        Keva repo = Keva.getRepo("friends_feed_list");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        LJLJI = repo;
        LJLJJI = ((RBX) HG3.LJIILL()).getCurUserId();
    }

    public static final String LIZ() {
        Keva keva = LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("page_token_");
        LIZ.append(LJLJJI);
        String string = keva.getString(X1D.LIZIZ(LIZ), "");
        o.LJIIIIZZ(string, "keva.getString(\"${PAGE_TOKEN}_$curUid\", \"\")");
        return string;
    }

    @Override // X.InterfaceC252619vl
    public final void t0(int i, User user, User user2) {
        if (user2 != null) {
            LJLJJI = user2.getUid();
        }
    }
}
