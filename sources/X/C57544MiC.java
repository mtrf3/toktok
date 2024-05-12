package X;

import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersDependentService;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersDependentServiceImpl;

/* renamed from: X.MiC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57544MiC implements IRecommendUsersDependentService {
    public static final C57544MiC LIZIZ = new C57544MiC();
    public final /* synthetic */ IRecommendUsersDependentService LIZ;

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersDependentService
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    public C57544MiC() {
        IRecommendUsersDependentService iRecommendUsersDependentServiceImpl;
        Object LIZ = C58096Mr6.LIZ(IRecommendUsersDependentService.class, false);
        if (LIZ != null) {
            iRecommendUsersDependentServiceImpl = (IRecommendUsersDependentService) LIZ;
        } else {
            iRecommendUsersDependentServiceImpl = new IRecommendUsersDependentServiceImpl();
        }
        this.LIZ = iRecommendUsersDependentServiceImpl;
    }
}
