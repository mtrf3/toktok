package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AFN {
    public List<String> LIZ;
    public final Keva LIZIZ;

    public AFN() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("report_aweme");
        AFQ LJFF = KidsAccountServiceImpl.LJIIIIZZ().LJFF();
        if (LJFF != null) {
            str = LJFF.getUserId();
        } else {
            str = null;
        }
        LIZ.append(str);
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(repo, "getRepo(curUserRepoName)");
        this.LIZIZ = repo;
    }
}
