package X;

import com.bytedance.tiktok.homepage.services.MainFragmentCacheExpServiceImpl;
import com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService;

/* loaded from: classes7.dex */
public final class FV5 implements IMainFragmentCacheExpService {
    public static final FV5 LIZIZ = new FV5();
    public final /* synthetic */ IMainFragmentCacheExpService LIZ;

    @Override // com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService
    public final InterfaceC36101EEv LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService
    public final InterfaceC36101EEv LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    public FV5() {
        IMainFragmentCacheExpService mainFragmentCacheExpServiceImpl;
        Object LIZ = C58096Mr6.LIZ(IMainFragmentCacheExpService.class, false);
        if (LIZ != null) {
            mainFragmentCacheExpServiceImpl = (IMainFragmentCacheExpService) LIZ;
        } else {
            mainFragmentCacheExpServiceImpl = new MainFragmentCacheExpServiceImpl();
        }
        this.LIZ = mainFragmentCacheExpServiceImpl;
    }
}
