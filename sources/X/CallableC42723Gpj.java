package X;

import com.ss.android.ugc.aweme.api.AnchorApi;
import com.ss.android.ugc.aweme.api.AnchorSearchResponse;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.Gpj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC42723Gpj<V> implements Callable {
    public final /* synthetic */ C42780Gqe LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public CallableC42723Gpj(C42780Gqe c42780Gqe, String str, int i) {
        this.LJLIL = c42780Gqe;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.LJLIL.LJLIL;
        String keyword = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        o.LJIIIZ(keyword, "keyword");
        AnchorSearchResponse anchorSearchResponse = ((AnchorApi.RealApi) AnchorApi.LIZ.create(AnchorApi.RealApi.class)).getAnchorSearchResponse(i, keyword, i2, 20).get();
        o.LJIIIIZZ(anchorSearchResponse, "RETROFIT\n            .cr…eSize)\n            .get()");
        return anchorSearchResponse;
    }
}
