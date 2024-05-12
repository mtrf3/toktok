package X;

import android.view.KeyEvent;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;

/* renamed from: X.LnW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55326LnW implements GHC {
    public final /* synthetic */ DetailFragmentPanel LJLIL;

    public C55326LnW(DetailFragmentPanel detailFragmentPanel) {
        this.LJLIL = detailFragmentPanel;
    }

    @Override // X.GHC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!this.LJLIL.LJLLLL && 4 == i) {
            return true;
        }
        return false;
    }
}
