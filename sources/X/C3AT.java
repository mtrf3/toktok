package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountService;
import kotlin.jvm.internal.o;

/* renamed from: X.3AT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3AT {
    public static Keva LIZ() {
        long j;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("repo_now_limit_allow_items_");
        Long LJJIZ = C38350F3i.LJJIZ(AccountService.LJIJ().LJFF().getCurUserId());
        if (LJJIZ != null) {
            j = LJJIZ.longValue();
        } else {
            j = 0;
        }
        LIZ.append(j);
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(repo, "getRepo(\n               …          )\n            )");
        return repo;
    }
}
