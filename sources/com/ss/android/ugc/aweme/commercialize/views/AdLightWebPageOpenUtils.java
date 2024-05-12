package com.ss.android.ugc.aweme.commercialize.views;

import X.C2U8;
import X.C89O;
import android.app.Activity;
import com.ss.android.ugc.aweme.ad.feed.IAdLightWebPageOpen;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AdLightWebPageOpenUtils implements IAdLightWebPageOpen {
    @Override // com.ss.android.ugc.aweme.ad.feed.IAdLightWebPageOpen
    public final void LIZ(Activity activity, String url) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(url, "url");
        C2U8.LIZ(new C89O(url));
    }
}
