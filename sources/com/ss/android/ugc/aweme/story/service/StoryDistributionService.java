package com.ss.android.ugc.aweme.story.service;

import X.AbstractC53477Kyn;
import X.AbstractC53585L1h;
import X.C2304092m;
import X.C53511KzL;
import X.C53578L1a;
import X.C53580L1c;
import X.C53592L1o;
import X.JBV;
import X.L6O;
import com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService;

/* loaded from: classes10.dex */
public final class StoryDistributionService implements IStoryDistributionService {
    @Override // com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService
    public final boolean LIZ() {
        C53578L1a.LIZ.getClass();
        if (!C53578L1a.LIZ() || !((Boolean) JBV.LIZIZ.getValue()).booleanValue() || C2304092m.LIZ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService
    public final L6O LIZJ() {
        return (L6O) C53580L1c.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService
    public final AbstractC53585L1h<AbstractC53477Kyn, C53592L1o> LIZIZ() {
        return C53511KzL.LIZ;
    }
}
