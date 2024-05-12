package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.viewmodel.PaidSeriesAddedSeriesViewModel;

/* loaded from: classes5.dex */
public final class A5M<T> implements InterfaceC64592gB {
    public final /* synthetic */ PaidSeriesAddedSeriesViewModel LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public A5M(PaidSeriesAddedSeriesViewModel paidSeriesAddedSeriesViewModel, long j, boolean z) {
        this.LJLIL = paidSeriesAddedSeriesViewModel;
        this.LJLILLLLZI = j;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        if (((BaseResponse) obj).status_code == 0) {
            this.LJLIL.setState(new A5L(this.LJLILLLLZI, this.LJLJI));
        }
    }
}
