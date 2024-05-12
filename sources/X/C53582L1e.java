package X;

import com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService;
import com.ss.android.ugc.aweme.story.service.StoryDistributionService;

/* renamed from: X.L1e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53582L1e implements IStoryDistributionService {
    public static final C53582L1e LIZIZ = new C53582L1e();
    public final /* synthetic */ IStoryDistributionService LIZ;

    @Override // com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService
    public final AbstractC53585L1h<AbstractC53477Kyn, C53592L1o> LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService
    public final L6O LIZJ() {
        return this.LIZ.LIZJ();
    }

    public C53582L1e() {
        IStoryDistributionService iStoryDistributionService;
        Object LIZ = C58096Mr6.LIZ(IStoryDistributionService.class, false);
        if (LIZ != null) {
            iStoryDistributionService = (IStoryDistributionService) LIZ;
        } else {
            if (C58096Mr6.q7 == null) {
                synchronized (IStoryDistributionService.class) {
                    if (C58096Mr6.q7 == null) {
                        C58096Mr6.q7 = new StoryDistributionService();
                    }
                }
            }
            iStoryDistributionService = C58096Mr6.q7;
        }
        this.LIZ = iStoryDistributionService;
    }
}
