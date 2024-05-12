package X;

import android.view.KeyEvent;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;

/* renamed from: X.JJv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48971JJv implements GHC {
    public final /* synthetic */ SearchVideoHolder LJLIL;

    public C48971JJv(SearchVideoHolder searchVideoHolder) {
        this.LJLIL = searchVideoHolder;
    }

    @Override // X.GHC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        JGI core;
        J1M j1m;
        J1M j1m2;
        C48887JGp w0 = this.LJLIL.w0();
        if (w0 != null && (core = w0.getCore()) != null && core.isPlaying() && JYH.LIZIZ.LJIIJ() && (i == 24 || i == 25)) {
            if (C78540Us4.LJIILIIL(this.LJLIL.LJLIL)) {
                SearchVideoHolder searchVideoHolder = this.LJLIL;
                if (i == 24) {
                    j1m2 = J1M.TURN_UP_VOLUME;
                } else {
                    j1m2 = J1M.TURN_DOWN_VOLUME;
                }
                searchVideoHolder.h0(j1m2);
            } else {
                SearchVideoHolder searchVideoHolder2 = this.LJLIL;
                if (i == 24) {
                    j1m = J1M.TURN_UP_VOLUME;
                } else {
                    j1m = J1M.TURN_DOWN_VOLUME;
                }
                searchVideoHolder2.D0(j1m);
            }
        }
        return false;
    }
}
