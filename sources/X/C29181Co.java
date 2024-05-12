package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;

/* renamed from: X.1Co, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29181Co extends C0CJ {
    public final LinearLayoutManager LJLIL;
    public C0CK LJLILLLLZI;

    @Override // X.C0CJ
    public final void LIZ(int i) {
    }

    @Override // X.C0CJ
    public final void LIZJ(int i) {
    }

    public C29181Co(LinearLayoutManager linearLayoutManager) {
        this.LJLIL = linearLayoutManager;
    }

    @Override // X.C0CJ
    public final void LIZIZ(int i, float f, int i2) {
        if (this.LJLILLLLZI == null) {
            return;
        }
        float f2 = -f;
        for (int i3 = 0; i3 < this.LJLIL.LJJJI(); i3++) {
            View LJJJ = this.LJLIL.LJJJ(i3);
            if (LJJJ != null) {
                this.LJLIL.getClass();
                this.LJLILLLLZI.LIZ(LJJJ, (C0A2.LJJJLL(LJJJ) - i) + f2);
            } else {
                throw new IllegalStateException(C16880lQ.LLLZI(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", new Object[]{Integer.valueOf(i3), Integer.valueOf(this.LJLIL.LJJJI())}));
            }
        }
    }
}
