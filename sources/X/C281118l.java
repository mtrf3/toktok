package X;

import Y.IDRunnableS1S0400000;
import android.os.SystemClock;
import android.view.MenuItem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* renamed from: X.18l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C281118l implements InterfaceC012303b {
    public final /* synthetic */ ViewOnKeyListenerC39831hL LJLIL;

    public C281118l(ViewOnKeyListenerC39831hL viewOnKeyListenerC39831hL) {
        this.LJLIL = viewOnKeyListenerC39831hL;
    }

    @Override // X.InterfaceC012303b
    public final void LIZJ(C281318n c281318n, MenuItem menuItem) {
        this.LJLIL.LJLJL.removeCallbacksAndMessages(c281318n);
    }

    @Override // X.InterfaceC012303b
    public final void LJ(C281318n c281318n, C281618q c281618q) {
        C02G c02g = null;
        this.LJLIL.LJLJL.removeCallbacksAndMessages(null);
        int size = ((ArrayList) this.LJLIL.LJLJLLL).size();
        for (int i = 0; i < size; i++) {
            if (c281318n == ((C02G) ListProtector.get(this.LJLIL.LJLJLLL, i)).LIZIZ) {
                if (i == -1) {
                    return;
                }
                int i2 = i + 1;
                if (i2 < ((ArrayList) this.LJLIL.LJLJLLL).size()) {
                    c02g = (C02G) ListProtector.get(this.LJLIL.LJLJLLL, i2);
                }
                this.LJLIL.LJLJL.postAtTime(new IDRunnableS1S0400000(c02g, c281618q, c281318n, this, 0), c281318n, SystemClock.uptimeMillis() + 200);
                return;
            }
        }
    }
}
