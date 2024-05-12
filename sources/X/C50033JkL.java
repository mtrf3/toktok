package X;

import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApi;
import com.ss.android.ugc.aweme.search.pages.result.hashtagsearch.core.model.SearchChallengeList;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* renamed from: X.JkL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50033JkL extends AbstractCallableC49927Jid {
    public final C50031JkJ LJLJI;

    @Override // X.AbstractCallableC49927Jid
    public final Object LIZIZ() {
        C50031JkJ param = this.LJLJI;
        o.LJIIIZ(param, "param");
        try {
            SearchChallengeList searchChallengeList = SearchApi.LIZ().searchChallengeList(param.LJIIIIZZ, param.LIZ, param.LJIIJ, param.LJIIIZ, param.LJ, "challenge", param.LIZJ, param.LJI, param.LJII, param.LJFF, param.LJIJI, param.LJJIIJ, param.LJJIIZ, param.LJJIIZI, param.LJJIJ).get();
            o.LJIIIIZZ(searchChallengeList, "RETROFIT.searchChallenge…ionId\n            ).get()");
            return searchChallengeList;
        } catch (ExecutionException e) {
            RuntimeException compatibleException = AbstractC36908Ee8.getCompatibleException(e);
            o.LJIIIIZZ(compatibleException, "getCompatibleException(e)");
            throw compatibleException;
        }
    }

    public C50033JkL(C50031JkJ c50031JkJ) {
        this.LJLJI = c50031JkJ;
    }
}
