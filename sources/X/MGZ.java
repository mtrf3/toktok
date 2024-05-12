package X;

import android.content.Intent;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;

/* loaded from: classes10.dex */
public final class MGZ implements OnActivityResultCallback {
    public final /* synthetic */ DetailAwemeListFragment LJLIL;

    public MGZ(DetailAwemeListFragment detailAwemeListFragment) {
        this.LJLIL = detailAwemeListFragment;
    }

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (intent != null) {
            this.LJLIL.LLIIIZ = intent.getLongExtra("TIME_PAUSED_IN_DETAIL_ACTIVITY", 0L);
        }
    }
}
