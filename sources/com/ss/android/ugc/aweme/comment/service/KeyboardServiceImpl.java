package com.ss.android.ugc.aweme.comment.service;

import X.C7EL;
import X.C7EP;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.comment.services.IKeyboardService;

/* loaded from: classes4.dex */
public final class KeyboardServiceImpl implements IKeyboardService {
    @Override // com.ss.android.ugc.aweme.comment.services.IKeyboardService
    public final int LIZJ() {
        return C7EP.LIZJ(true);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.IKeyboardService
    public final void LIZ(int i) {
        C7EP.LIZLLL(i);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.IKeyboardService
    public final C7EL LIZIZ(Context context, View view) {
        if (context == null || view == null) {
            return null;
        }
        return new C7EL(context, view);
    }
}
