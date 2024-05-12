package X;

import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KCI extends F9E implements C33Q {
    public final AbstractC72932td<SearchLiveList> LJLIL;
    public final AbstractC72932td<SearchLiveList> LJLILLLLZI;

    public KCI() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ KCI(int r2) {
        /*
            r1 = this;
            X.33X r0 = X.C33X.LIZ
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KCI.<init>(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KCI(AbstractC72932td<? extends SearchLiveList> request, AbstractC72932td<? extends SearchLiveList> loadMore) {
        o.LJIIIZ(request, "request");
        o.LJIIIZ(loadMore, "loadMore");
        this.LJLIL = request;
        this.LJLILLLLZI = loadMore;
    }

    public static KCI L(KCI kci, AbstractC72932td request, AbstractC72932td loadMore, int i) {
        if ((i & 1) != 0) {
            request = kci.LJLIL;
        }
        if ((i & 2) != 0) {
            loadMore = kci.LJLILLLLZI;
        }
        kci.getClass();
        o.LJIIIZ(request, "request");
        o.LJIIIZ(loadMore, "loadMore");
        return new KCI(request, loadMore);
    }
}
