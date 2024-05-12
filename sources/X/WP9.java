package X;

import android.view.KeyEvent;
import kotlin.jvm.internal.AqS164S0100000_14;

/* loaded from: classes15.dex */
public final class WP9 implements C5HC {
    public final /* synthetic */ AqS164S0100000_14 LJLIL;

    public WP9(AqS164S0100000_14 aqS164S0100000_14) {
        this.LJLIL = aqS164S0100000_14;
    }

    @Override // X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            WP7 wp7 = (WP7) this.LJLIL.l0;
            WP8 wp8 = wp7.LJ;
            if (wp8 == WP8.FILTER_BOX_SHOW) {
                wp7.LIZ(WP8.FILTER_VIEW_SHOW);
                return true;
            }
            if (wp8 != WP8.FILTER_VIEW_SHOW) {
                return true;
            }
            wp7.LIZ(WP8.HIDE);
            return true;
        }
        return false;
    }
}
