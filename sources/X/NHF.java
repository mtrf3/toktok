package X;

import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;

/* loaded from: classes11.dex */
public final class NHF extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final NHF LJLIL = new NHF();

    public NHF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
        if (LJJI != null) {
            return LJJI.LJIIL("dynamic_ad_feed");
        }
        return null;
    }
}
