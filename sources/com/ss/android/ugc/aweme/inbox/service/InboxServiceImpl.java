package com.ss.android.ugc.aweme.inbox.service;

import X.C1DI;
import X.C85999Xp5;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* loaded from: classes10.dex */
public final class InboxServiceImpl implements IInboxService {
    @Override // com.ss.android.ugc.aweme.inbox.service.IInboxService
    public final String LIZ() {
        String LIZIZ = C85999Xp5.LIZIZ();
        if (LIZIZ == null) {
            return "";
        }
        return LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.service.IInboxService
    public final View LIZIZ(ViewGroup viewGroup, boolean z) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.b_s, viewGroup, z, "from(parent.context)\n   …on, parent, attachToRoot)");
    }
}
