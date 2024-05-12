package com.ss.android.ugc.aweme.challenge;

import X.AbstractC51036K1g;
import X.C16880lQ;
import X.C58096Mr6;
import X.EF7;
import X.MH1;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService;
import com.ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ChallengeDetailServiceImpl implements IChallengeDetailService {
    public static IChallengeDetailService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(IChallengeDetailService.class, false);
        if (LIZ != null) {
            return (IChallengeDetailService) LIZ;
        }
        if (C58096Mr6.LLJL == null) {
            synchronized (IChallengeDetailService.class) {
                if (C58096Mr6.LLJL == null) {
                    C58096Mr6.LLJL = new ChallengeDetailServiceImpl();
                }
            }
        }
        return C58096Mr6.LLJL;
    }

    @Override // com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    public final AbstractC51036K1g<Aweme, ?> LIZJ() {
        return new MH1();
    }

    @Override // com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    public final Fragment LIZ(Intent intent) {
        o.LJIIIZ(intent, "intent");
        if (MSAdaptionService.LJIIL().LIZLLL(EF7.LIZIZ())) {
            ChallengeDetailFragment challengeDetailFragment = new ChallengeDetailFragment();
            challengeDetailFragment.setArguments(C16880lQ.LLJJIJI(intent));
            return challengeDetailFragment;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    public final void LIZIZ(AbstractC51036K1g<Aweme, ?> abstractC51036K1g, List<? extends Aweme> list) {
        if (abstractC51036K1g instanceof MH1) {
            abstractC51036K1g.getClass();
            abstractC51036K1g.setItems(new ArrayList(list));
            ((ChallengeAwemeList) abstractC51036K1g.mData).cursor = list.size();
        }
    }
}
