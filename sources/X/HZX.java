package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HZX {
    public final Keva LIZ;

    public HZX() {
        Keva repo = Keva.getRepo("record_bottom_tab_keva");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        this.LIZ = repo;
    }

    public final boolean LIZ(String uid) {
        o.LJIIIZ(uid, "uid");
        String string = this.LIZ.getString(uid, "");
        o.LJIIIIZZ(string, "keva.getString(uid, \"\")");
        if (!o.LJ(string, "")) {
            String string2 = this.LIZ.getString(uid, "");
            o.LJIIIIZZ(string2, "keva.getString(uid, \"\")");
            if (!o.LJ(string2, "RecordAlbum")) {
                return false;
            }
        }
        return true;
    }
}
