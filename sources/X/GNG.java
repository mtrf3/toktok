package X;

import com.ss.android.ugc.aweme.services.draft.DraftListenerAdapter;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.tools.draft.DraftFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GNG extends DraftListenerAdapter {
    public final /* synthetic */ DraftFragment LIZ;

    public GNG(DraftFragment draftFragment) {
        this.LIZ = draftFragment;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.DraftListenerAdapter, com.ss.android.ugc.aweme.services.draft.IDraftListener
    public final void onUpdated(IDraftListener.UpdateParams params) {
        o.LJIIIZ(params, "params");
        this.LIZ.Ml();
    }
}
