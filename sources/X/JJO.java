package X;

import android.view.KeyEvent;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.photo.UserPhotoHolder;

/* loaded from: classes9.dex */
public final class JJO implements GHC {
    public final /* synthetic */ UserPhotoHolder LJLIL;

    public JJO(UserPhotoHolder userPhotoHolder) {
        this.LJLIL = userPhotoHolder;
    }

    @Override // X.GHC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        J1M j1m;
        if (this.LJLIL.isPlaying() && JYH.LIZIZ.LJIIJ()) {
            if (i == 24 || i == 25) {
                UserPhotoHolder userPhotoHolder = this.LJLIL;
                if (i == 24) {
                    j1m = J1M.TURN_UP_VOLUME;
                } else {
                    j1m = J1M.TURN_DOWN_VOLUME;
                }
                userPhotoHolder.P(j1m);
                return false;
            }
            return false;
        }
        return false;
    }
}
