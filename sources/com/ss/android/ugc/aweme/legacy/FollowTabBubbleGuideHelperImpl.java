package com.ss.android.ugc.aweme.legacy;

import X.C54391LWh;
import X.C58096Mr6;
import com.ss.android.ugc.aweme.main.guide.IFollowTabBubbleGuideHelper;

/* loaded from: classes10.dex */
public class FollowTabBubbleGuideHelperImpl implements IFollowTabBubbleGuideHelper {
    public final C54391LWh LIZ = C54391LWh.LIZ;

    public static IFollowTabBubbleGuideHelper LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IFollowTabBubbleGuideHelper.class, false);
        if (LIZ != null) {
            return (IFollowTabBubbleGuideHelper) LIZ;
        }
        if (C58096Mr6.b2 == null) {
            synchronized (IFollowTabBubbleGuideHelper.class) {
                if (C58096Mr6.b2 == null) {
                    C58096Mr6.b2 = new FollowTabBubbleGuideHelperImpl();
                }
            }
        }
        return C58096Mr6.b2;
    }

    @Override // com.ss.android.ugc.aweme.main.guide.IFollowTabBubbleGuideHelper
    public final void LIZ() {
        this.LIZ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.main.guide.IFollowTabBubbleGuideHelper
    public final void LIZIZ() {
        this.LIZ.getClass();
    }
}
