package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.vision.PhotoSearchFragment;
import com.ss.android.ugc.aweme.vision.result.PhotoSearchBottomPanelViewModel;

/* renamed from: X.KHb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51447KHb extends AbstractC51451KHf {
    public final /* synthetic */ PhotoSearchFragment LIZ;

    @Override // X.AbstractC51451KHf
    public final void LIZ(View view) {
    }

    public C51447KHb(PhotoSearchFragment photoSearchFragment) {
        this.LIZ = photoSearchFragment;
    }

    @Override // X.AbstractC51451KHf
    public final void LIZIZ(int i, View view) {
        PhotoSearchFragment photoSearchFragment = this.LIZ;
        PhotoSearchBottomPanelViewModel photoSearchBottomPanelViewModel = photoSearchFragment.LJLLJ;
        if (photoSearchBottomPanelViewModel != null) {
            photoSearchBottomPanelViewModel.LJLJI = i;
        }
        if (i == 4) {
            ((Fragment) photoSearchFragment.LJLLI.getValue()).setUserVisibleHint(true);
        }
    }
}
