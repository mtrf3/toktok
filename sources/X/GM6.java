package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.tools.draft.DraftFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GM6 implements IDraftListener {
    public final /* synthetic */ DraftFragment LIZ;

    public GM6(DraftFragment draftFragment) {
        this.LIZ = draftFragment;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftListener
    public final void onDeleted(AwemeDraft draft) {
        o.LJIIIZ(draft, "draft");
        if (draft.LJJJ) {
            DraftFragment draftFragment = this.LIZ;
            XKX.LIZLLL(draftFragment.LLFFF, null, null, new GM4(draftFragment, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftListener
    public final void onUpdated(IDraftListener.UpdateParams updateParams) {
        IDraftListener.DefaultImpls.onUpdated(this, updateParams);
    }
}
