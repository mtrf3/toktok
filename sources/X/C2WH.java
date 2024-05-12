package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.notification.creator.model.TabSortCacheModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.2WH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2WH {
    public static final CopyOnWriteArrayList<TabSortCacheModel> LIZ = new CopyOnWriteArrayList<>();

    public static Keva LIZ() {
        String str;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser == null || (str = curUser.getUid()) == null) {
            str = "";
        }
        String LLLZ = C16880lQ.LLLZ("creator_notification_%s", Arrays.copyOf(new Object[]{str}, 1));
        o.LJIIIIZZ(LLLZ, "format(this, *args)");
        Keva repo = Keva.getRepo(LLLZ);
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME.format(uid))");
        return repo;
    }
}
