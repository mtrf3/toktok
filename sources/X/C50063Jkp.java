package X;

import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApiNew;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* renamed from: X.Jkp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50063Jkp implements InterfaceC50066Jks {
    @Override // X.InterfaceC50066Jks
    public final AbstractC73672Svk<String> LLFZ(C50062Jko param) {
        o.LJIIIZ(param, "param");
        try {
            return SearchApiNew.LIZ().horizontalLoadmore(param.LIZIZ, param.LIZJ, param.LIZLLL, param.LJ, param.LJFF, param.LJI, Long.valueOf(param.LJII));
        } catch (ExecutionException e) {
            RuntimeException compatibleException = AbstractC36908Ee8.getCompatibleException(e);
            o.LJIIIIZZ(compatibleException, "getCompatibleException(e)");
            throw compatibleException;
        }
    }
}
