package X;

import android.view.KeyEvent;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEgg;

/* loaded from: classes11.dex */
public final class NM8 implements GHC {
    public final /* synthetic */ ShakeEgg LJLIL;

    public NM8(ShakeEgg shakeEgg) {
        this.LJLIL = shakeEgg;
    }

    @Override // X.GHC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || this.LJLIL.LIZIZ().getVisibility() == 0) {
            return false;
        }
        this.LJLIL.LJFF();
        return true;
    }
}
