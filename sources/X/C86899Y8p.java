package X;

import android.view.KeyEvent;
import java.util.LinkedHashMap;

/* renamed from: X.Y8p, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86899Y8p implements LHW {
    public final /* synthetic */ C86894Y8k LJLIL;

    public C86899Y8p(C86894Y8k c86894Y8k) {
        this.LJLIL = c86894Y8k;
    }

    @Override // X.InterfaceC54357LUz
    public final void LIZ(C78856UxA c78856UxA) {
        KeyEvent.Callback callback;
        for (C79236V7w c79236V7w : ((LinkedHashMap) this.LJLIL.LJLJI).values()) {
            if (c79236V7w != null) {
                c79236V7w.LIZ();
            }
        }
        C86894Y8k c86894Y8k = this.LJLIL;
        Y4F y4f = null;
        if (c78856UxA != null) {
            callback = c78856UxA.LJFF;
        } else {
            callback = null;
        }
        if (callback instanceof Y4F) {
            y4f = (Y4F) callback;
        }
        c86894Y8k.LJI(y4f);
    }

    @Override // X.InterfaceC54357LUz
    public final void LIZIZ(C78856UxA c78856UxA) {
        KeyEvent.Callback callback;
        C86898Y8o LIZ;
        for (C79236V7w c79236V7w : ((LinkedHashMap) this.LJLIL.LJLJI).values()) {
            if (c79236V7w != null && (LIZ = c79236V7w.LIZ()) != null) {
                LIZ.LIZLLL();
            }
        }
        C86894Y8k c86894Y8k = this.LJLIL;
        Y4F y4f = null;
        if (c78856UxA != null) {
            callback = c78856UxA.LJFF;
        } else {
            callback = null;
        }
        if (callback instanceof Y4F) {
            y4f = (Y4F) callback;
        }
        c86894Y8k.LJFF(y4f);
    }

    @Override // X.InterfaceC54357LUz
    public final void LIZJ(C78856UxA c78856UxA) {
        for (C79236V7w c79236V7w : ((LinkedHashMap) this.LJLIL.LJLJI).values()) {
            if (c79236V7w != null) {
                c79236V7w.LIZ();
            }
        }
    }
}
