package X;

import com.ss.android.ugc.aweme.feed.api.FeedApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JAO extends AbstractC73672Svk<List<? extends Aweme>> {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super List<? extends Aweme>> observer) {
        List<Aweme> list;
        LogPbBean logPbBean;
        o.LJIIIZ(observer, "observer");
        try {
            FeedItemList LIZIZ = FeedApi.LIZIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
            String str = null;
            if (LIZIZ == null || (list = LIZIZ.getItems()) == null) {
                list = C61878OQg.INSTANCE;
            }
            int size = list.size();
            int i = this.LJLIL;
            if (size > i) {
                observer.onNext(list.subList(0, i));
            } else {
                observer.onNext(list);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("instant feed sid ");
            if (LIZIZ != null && (logPbBean = LIZIZ.logPb) != null) {
                str = logPbBean.getImprId();
            }
            LIZ.append(str);
            C36922EeM.LJ(X1D.LIZIZ(LIZ));
            observer.onComplete();
        } catch (Exception e) {
            observer.onError(e);
        }
    }

    public JAO(int i, String str, String str2) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }
}
