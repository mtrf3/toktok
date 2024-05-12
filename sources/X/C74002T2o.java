package X;

import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import kotlin.jvm.internal.o;

/* renamed from: X.T2o, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74002T2o extends C70839Rr9 {
    public final String LIZJ;
    public final SearchApiResult LIZLLL;

    public C74002T2o() {
        this(0);
    }

    public /* synthetic */ C74002T2o(int i) {
        this("", true, 0, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74002T2o(String searchId, boolean z, int i, SearchApiResult searchApiResult) {
        super(z, i);
        o.LJIIIZ(searchId, "searchId");
        this.LIZJ = searchId;
        this.LIZLLL = searchApiResult;
    }
}
