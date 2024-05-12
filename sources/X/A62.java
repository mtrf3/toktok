package X;

import com.ss.android.ugc.aweme.api.IPaidSeriesLiveApiService;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.service.PaidSeriesLiveApiService;

/* loaded from: classes5.dex */
public final class A62 extends AbstractC65781Prl implements InterfaceC65784Pro<IPaidSeriesLiveApiService> {
    public static final A62 LJLIL = new A62();

    public A62() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IPaidSeriesLiveApiService invoke() {
        return PaidSeriesLiveApiService.LIZJ();
    }
}
