package X;

import android.view.KeyEvent;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoHolder;

/* loaded from: classes9.dex */
public final class J1Y implements GHC {
    public final /* synthetic */ SearchPhotoHolder LJLIL;

    public J1Y(SearchPhotoHolder searchPhotoHolder) {
        this.LJLIL = searchPhotoHolder;
    }

    @Override // X.GHC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        JGI core;
        J1M j1m;
        JHC i0 = this.LJLIL.i0();
        if (i0 != null && (core = i0.getCore()) != null && core.isPlaying() && JYH.LIZIZ.LJIIJ() && (i == 24 || i == 25)) {
            SearchPhotoHolder searchPhotoHolder = this.LJLIL;
            if (i == 24) {
                j1m = J1M.TURN_UP_VOLUME;
            } else {
                j1m = J1M.TURN_DOWN_VOLUME;
            }
            searchPhotoHolder.n0(j1m);
        }
        return false;
    }
}
