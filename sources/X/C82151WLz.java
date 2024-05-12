package X;

import android.view.KeyEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.WLz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82151WLz implements C5HC {
    public final /* synthetic */ ViewOnTouchListenerC82148WLw LJLIL;

    public C82151WLz(ViewOnTouchListenerC82148WLw viewOnTouchListenerC82148WLw) {
        this.LJLIL = viewOnTouchListenerC82148WLw;
    }

    @Override // X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            ViewOnTouchListenerC82148WLw viewOnTouchListenerC82148WLw = this.LJLIL;
            int i2 = viewOnTouchListenerC82148WLw.LJLLLL;
            viewOnTouchListenerC82148WLw.LJLLL = i2;
            WG4 wg4 = viewOnTouchListenerC82148WLw.LJLJJLL;
            if (wg4 != null) {
                wg4.LIZIZ((i2 * 1.0f) / viewOnTouchListenerC82148WLw.LJZ);
                WG4 wg42 = viewOnTouchListenerC82148WLw.LJLJJLL;
                if (wg42 != null) {
                    wg42.setTimeBubble(viewOnTouchListenerC82148WLw.LJLLL);
                    viewOnTouchListenerC82148WLw.LJLLLLLL = viewOnTouchListenerC82148WLw.LJLZ;
                    viewOnTouchListenerC82148WLw.LLJJIII();
                    return true;
                }
                o.LJIJI("cutMusicLayout");
                throw null;
            }
            o.LJIJI("cutMusicLayout");
            throw null;
        }
        return false;
    }
}
