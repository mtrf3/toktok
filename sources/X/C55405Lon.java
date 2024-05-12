package X;

import com.ss.android.ugc.aweme.detail.ui.DetailFragment;

/* renamed from: X.Lon, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55405Lon implements InterfaceC54167LNr {
    public final /* synthetic */ DetailFragment LIZ;

    @Override // X.InterfaceC54167LNr
    public final int getValue() {
        C54206LPe c54206LPe = this.LIZ.LJLIL;
        if (c54206LPe != null) {
            return c54206LPe.getCurrentItem();
        }
        return 0;
    }

    public C55405Lon(DetailFragment detailFragment) {
        this.LIZ = detailFragment;
    }

    @Override // X.InterfaceC54167LNr
    public final void LIZ(int i) {
        C54206LPe c54206LPe = this.LIZ.LJLIL;
        if (c54206LPe != null) {
            c54206LPe.setCurrentItem(i);
        }
    }

    @Override // X.InterfaceC54167LNr
    public final void LIZIZ(int i, boolean z) {
        C54206LPe c54206LPe = this.LIZ.LJLIL;
        if (c54206LPe != null) {
            c54206LPe.setCurrentItem(i, z);
        }
    }
}
