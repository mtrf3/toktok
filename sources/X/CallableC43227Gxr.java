package X;

import com.ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.ss.android.ugc.aweme.challenge.model.SearchSugChallengeList;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Gxr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC43227Gxr implements Callable<Object> {
    public final C43226Gxq LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final Integer LJLJJI;
    public boolean LJLJJL;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.LJLIL.mIsLoading = false;
        if (!this.LJLJJL) {
            String str = this.LJLILLLLZI;
            SearchSugChallengeList searchSugChallengeList = ChallengeApi.LJII.searchSugChallenge(str, this.LJLJI, this.LJLJJI).get();
            searchSugChallengeList.setKeyword(str);
            if (!this.LJLJJL) {
                return searchSugChallengeList;
            }
            throw new C43228Gxs();
        }
        throw new C43228Gxs();
    }

    public CallableC43227Gxr(C43226Gxq model, Object[] params) {
        Integer num;
        o.LJIIIZ(model, "model");
        o.LJIIIZ(params, "params");
        this.LJLIL = model;
        Object obj = params[0];
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
        this.LJLILLLLZI = (String) obj;
        Object obj2 = params[1];
        o.LJII(obj2, "null cannot be cast to non-null type kotlin.String");
        this.LJLJI = (String) obj2;
        if (a.LJFF().LJJJJI()) {
            num = 1;
        } else {
            num = null;
        }
        this.LJLJJI = num;
    }
}
