package X;

import Y.ARunnableS32S0200000_13;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Tot, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75795Tot extends AbstractC75784Toi {
    public final String LIZLLL = "";
    public final String LJ;

    @Override // X.AbstractC75784Toi
    public final int LIZIZ() {
        return R.layout.dn6;
    }

    @Override // X.AbstractC75784Toi
    public final String LIZ() {
        return this.LIZLLL;
    }

    public C75795Tot(String str) {
        this.LJ = str;
    }

    @Override // X.AbstractC75784Toi
    public final void LIZJ(ViewGroup viewGroup) {
        if (viewGroup != null) {
            TV3.LJIILL(viewGroup, new ARunnableS32S0200000_13(viewGroup, this, 10));
        }
    }
}
