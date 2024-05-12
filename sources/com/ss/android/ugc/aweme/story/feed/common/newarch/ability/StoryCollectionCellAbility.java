package com.ss.android.ugc.aweme.story.feed.common.newarch.ability;

import X.C2K0;
import X.C2MA;
import X.C56992Ln;
import X.C70012ov;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes4.dex */
public interface StoryCollectionCellAbility extends C2K0 {
    void GH(C56992Ln c56992Ln);

    ViewGroup KM();

    Aweme ct0();

    void eR(C70012ov c70012ov);

    void hY(C70012ov c70012ov);

    C2MA jX();

    void onPlayCompleted(String str);

    void onPlayProgressChange(String str, long j, long j2);
}
