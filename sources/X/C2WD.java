package X;

import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2WD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2WD {
    public static final List<String> LIZ = new ArrayList();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C2WE.LJLIL);

    public static Keva LIZ() {
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        String LLLZ = C16880lQ.LLLZ("inbox_repost_record_%s_repo_v2", Arrays.copyOf(new Object[]{curUserId}, 1));
        o.LJIIIIZZ(LLLZ, "format(this, *args)");
        Keva repo = Keva.getRepo(LLLZ);
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME_FORMAT.format(uid))");
        return repo;
    }
}
