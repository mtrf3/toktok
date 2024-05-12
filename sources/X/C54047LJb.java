package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.aweme.explore.service.ExploreFeedServiceImpl;
import com.ss.android.ugc.aweme.explore.service.IExploreFeedService;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.o;

/* renamed from: X.LJb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54047LJb implements IExploreFeedService {
    public static final C54047LJb LIZIZ = new C54047LJb();
    public final /* synthetic */ IExploreFeedService LIZ = ExploreFeedServiceImpl.LJII();

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final ReusedAssem<? extends C3C8> LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final void LIZJ(String str) {
        this.LIZ.LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final void LIZLLL(String enterFrom, String enterMethod, java.util.Map<String, String> map) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(map, "map");
        this.LIZ.LIZLLL(enterFrom, enterMethod, map);
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final AbstractC53764L8e LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final boolean LJFF(PublishModel publishModel) {
        o.LJIIIZ(publishModel, "publishModel");
        return this.LIZ.LJFF(publishModel);
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final C8W0 LJI() {
        return this.LIZ.LJI();
    }
}
