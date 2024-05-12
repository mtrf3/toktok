package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;
import com.ss.android.ugc.aweme.services.draft.DraftListenerAdapter;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;

/* renamed from: X.MEz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C56489MEz extends DraftListenerAdapter {
    public final /* synthetic */ AwemeListFragmentImpl LIZ;

    public C56489MEz(AwemeListFragmentImpl awemeListFragmentImpl) {
        this.LIZ = awemeListFragmentImpl;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.DraftListenerAdapter, com.ss.android.ugc.aweme.services.draft.IDraftListener
    public final void onDeleted(AwemeDraft awemeDraft) {
        C189837ch.LIZ("AwemeListFragmentImpl", "onDraftDelete -> delete draft");
        AwemeListFragmentImpl awemeListFragmentImpl = this.LIZ;
        if (!awemeListFragmentImpl.LJLLILLLL || awemeListFragmentImpl.LJLL != 0) {
            return;
        }
        awemeListFragmentImpl.Pm();
    }

    @Override // com.ss.android.ugc.aweme.services.draft.DraftListenerAdapter, com.ss.android.ugc.aweme.services.draft.IDraftListener
    public final void onUpdated(IDraftListener.UpdateParams updateParams) {
        AwemeListFragmentImpl awemeListFragmentImpl = this.LIZ;
        if (!awemeListFragmentImpl.LJLLILLLL || awemeListFragmentImpl.LJLL != 0) {
            return;
        }
        awemeListFragmentImpl.Pm();
    }
}
