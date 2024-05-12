package com.ss.android.ugc.aweme.services.draft;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public abstract class DraftListenerAdapter implements IDraftListener {
    @Override // com.ss.android.ugc.aweme.services.draft.IDraftListener
    public void onDeleted(AwemeDraft draft) {
        o.LJIIIZ(draft, "draft");
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftListener
    public void onUpdated(IDraftListener.UpdateParams params) {
        o.LJIIIZ(params, "params");
    }
}
