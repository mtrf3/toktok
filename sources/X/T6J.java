package X;

import com.ss.android.ugc.aweme.question.QuestionDetailAwemeListFragment;
import com.ss.android.ugc.aweme.question.QuestionDetailFragment;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T6J implements InterfaceC56522MGg {
    public final /* synthetic */ QuestionDetailFragment LIZ;

    public T6J(QuestionDetailFragment questionDetailFragment) {
        this.LIZ = questionDetailFragment;
    }

    @Override // X.InterfaceC56522MGg
    public final void LIZ(boolean z) {
        if (z) {
            QuestionDetailAwemeListFragment questionDetailAwemeListFragment = this.LIZ.LJLLJ;
            if (questionDetailAwemeListFragment != null) {
                o.LJIIIIZZ(questionDetailAwemeListFragment.Il().toString(), "mHotFragment.requestId.toString()");
            } else {
                o.LJIJI("mHotFragment");
                throw null;
            }
        }
        if (!NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable() && !z && this.LIZ.Hl().LLIIIZ) {
            this.LIZ.Hl().setRefreshing(false);
        }
    }
}
