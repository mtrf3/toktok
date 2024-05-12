package com.ss.android.ugc.aweme.share.viewmodel;

import X.ActivityC45651qj;
import X.C54258LRe;
import X.InterfaceC54249LQv;
import android.content.Context;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.main.service.IFeedPanelStateVMService;

/* loaded from: classes10.dex */
public final class FeedStateVMServiceImpl implements IFeedPanelStateVMService {
    @Override // com.ss.android.ugc.aweme.main.service.IFeedPanelStateVMService
    public final InterfaceC54249LQv LIZ(Context context) {
        if (context instanceof ActivityC45651qj) {
            return (InterfaceC54249LQv) ViewModelProviders.of((ActivityC45651qj) context, C54258LRe.LIZJ).get(FeedPanelStateViewModel.class);
        }
        return null;
    }
}
