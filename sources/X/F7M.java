package X;

import com.tiktok.zero.rating.manager.ZeroRatingApi;

/* loaded from: classes7.dex */
public final class F7M extends AbstractC65781Prl implements InterfaceC65784Pro<ZeroRatingApi.FetchMsisdnApi> {
    public static final F7M LJLIL = new F7M();

    public F7M() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.tiktok.zero.rating.manager.ZeroRatingApi$FetchMsisdnApi] */
    @Override // X.InterfaceC65784Pro
    public final ZeroRatingApi.FetchMsisdnApi invoke() {
        F7E.LJI.getClass();
        InterfaceC36336ENw interfaceC36336ENw = F7E.LIZIZ;
        if (interfaceC36336ENw != null) {
            return interfaceC36336ENw.create(ZeroRatingApi.FetchMsisdnApi.class);
        }
        return null;
    }
}
