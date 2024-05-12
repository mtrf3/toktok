package com.ss.android.ugc.aweme.explore.service;

import X.AbstractC53764L8e;
import X.C206928Ae;
import X.C206978Aj;
import X.C207038Ap;
import X.C3C8;
import X.C53989LGv;
import X.C58096Mr6;
import X.C8BH;
import X.C8DG;
import X.C8W0;
import android.os.SystemClock;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.aweme.explore.assem.ExploreAssem;
import com.ss.android.ugc.aweme.explore.assem.ExploreFeedAssem;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ExploreFeedServiceImpl implements IExploreFeedService {
    public static IExploreFeedService LJII() {
        Object LIZ = C58096Mr6.LIZ(IExploreFeedService.class, false);
        if (LIZ != null) {
            return (IExploreFeedService) LIZ;
        }
        if (C58096Mr6.u0 == null) {
            synchronized (IExploreFeedService.class) {
                if (C58096Mr6.u0 == null) {
                    C58096Mr6.u0 = new ExploreFeedServiceImpl();
                }
            }
        }
        return C58096Mr6.u0;
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final ReusedAssem<? extends C3C8> LIZIZ() {
        return new ExploreFeedAssem();
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final AbstractC53764L8e LJ() {
        return new C53989LGv();
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final C8W0 LJI() {
        return new ExploreAssem();
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final boolean LIZ() {
        return C8DG.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final void LIZJ(String str) {
        C206978Aj.LIZJ("publish_landing", "video_post_page", str, 4);
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final boolean LJFF(PublishModel publishModel) {
        o.LJIIIZ(publishModel, "publishModel");
        if (C206928Ae.LIZ != 0 && !publishModel.isStoryPublish) {
            int i = C8BH.LIZ;
            if (i == 1) {
                if (o.LJ(AVExternalServiceImpl.LIZ().enterFromService().getShootEnterFromOnEditModel(publishModel), "homepage_explore")) {
                    return true;
                }
            } else if (i == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final void LIZLLL(String enterFrom, String enterMethod, Map<String, String> map) {
        boolean z;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(map, "map");
        C206978Aj.LJFF = enterFrom;
        C206978Aj.LJI = enterMethod;
        long elapsedRealtime = SystemClock.elapsedRealtime() - C206978Aj.LIZJ;
        boolean z2 = C206978Aj.LJII;
        if (C206928Ae.LIZ == 2) {
            z = true;
        } else {
            z = false;
        }
        ((HashMap) map).putAll(new C207038Ap(elapsedRealtime, enterMethod, enterFrom, "", z2, z).LLIL());
        C206978Aj.LJII = false;
    }
}
