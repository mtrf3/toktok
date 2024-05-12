package com.ss.android.ugc.aweme.service;

import X.C211568Sa;
import X.C38995FSd;
import Y.ARunnableS7S0201000_4;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS170S0100000_4;

/* loaded from: classes5.dex */
public final class PaidContentPreviewTagServiceImpl implements IPaidContentPreviewTagService {
    @Override // com.ss.android.ugc.aweme.service.IPaidContentPreviewTagService
    public final View LIZ(View view) {
        return view.findViewById(R.id.i3s);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentPreviewTagService
    public final boolean LIZIZ(Aweme aweme) {
        PaidContentInfo paidContentInfo;
        if (!C211568Sa.LIZ() || aweme == null || (paidContentInfo = aweme.mPaidContentInfo) == null || !paidContentInfo.getShouldShowPreview()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentPreviewTagService
    public final void LIZJ(Aweme aweme, View view, View view2, AqS170S0100000_4 aqS170S0100000_4) {
        if (LIZIZ(aweme)) {
            if (view2 == null) {
                C38995FSd.LIZJ().execute(new ARunnableS7S0201000_4(view, aqS170S0100000_4, 3));
                return;
            } else {
                view2.setVisibility(0);
                return;
            }
        }
        if (view2 == null) {
            return;
        }
        view2.setVisibility(8);
    }
}
