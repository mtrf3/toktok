package X;

import com.ss.android.ugc.aweme.model.PaidSeriesLiveListResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A5L extends AbstractC65781Prl implements InterfaceC88472Yns<A5R, A5R> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A5L(long j, boolean z) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC88472Yns
    public final A5R invoke(A5R a5r) {
        C43I<PaidSeriesLiveListResponse> c43i;
        A5R setState = a5r;
        o.LJIIIZ(setState, "$this$setState");
        C72912tb c72912tb = new C72912tb(Long.valueOf(this.LJLIL));
        if (this.LJLILLLLZI) {
            c43i = new C43I<>(new PaidSeriesLiveListResponse(null, null, null, 7, null));
        } else {
            c43i = setState.LJLILLLLZI;
        }
        return A5R.LIZ(setState, null, c43i, null, c72912tb, null, null, null, 117);
    }
}
