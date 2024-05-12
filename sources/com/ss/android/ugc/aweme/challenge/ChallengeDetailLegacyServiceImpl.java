package com.ss.android.ugc.aweme.challenge;

import X.ActivityC45651qj;
import X.C2068389v;
import X.C58096Mr6;
import X.M8X;
import X.Z8A;
import X.Z9N;
import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.IChallengeDetailLegacyService;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public class ChallengeDetailLegacyServiceImpl implements IChallengeDetailLegacyService {
    public static IChallengeDetailLegacyService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IChallengeDetailLegacyService.class, false);
        if (LIZ != null) {
            return (IChallengeDetailLegacyService) LIZ;
        }
        if (C58096Mr6.LLJJLIIIJLLLLLLLZ == null) {
            synchronized (IChallengeDetailLegacyService.class) {
                if (C58096Mr6.LLJJLIIIJLLLLLLLZ == null) {
                    C58096Mr6.LLJJLIIIJLLLLLLLZ = new ChallengeDetailLegacyServiceImpl();
                }
            }
        }
        return C58096Mr6.LLJJLIIIJLLLLLLLZ;
    }

    @Override // com.ss.android.ugc.aweme.IChallengeDetailLegacyService
    public final void LJ(String str, boolean z) {
        Z9N.LIZIZ.LJ(str, z);
    }

    @Override // com.ss.android.ugc.aweme.IChallengeDetailLegacyService
    public final void LJFF(Context context, String str) {
        M8X.LIZ(context, str);
    }

    @Override // com.ss.android.ugc.aweme.IChallengeDetailLegacyService
    public final void LJII(ActivityC45651qj activityC45651qj, Bundle bundle) {
        Z8A.LIZIZ.startHeaderDetailActivity(activityC45651qj, bundle);
    }

    @Override // com.ss.android.ugc.aweme.IChallengeDetailLegacyService
    public final void LJI(ImageView imageView, int i, int i2) {
        Context context = imageView.getContext();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_arrow_turn_up_right;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        c2068389v.LIZIZ = i;
        c2068389v.LIZJ = i2;
        imageView.setImageDrawable(c2068389v.LIZ(context));
    }
}
