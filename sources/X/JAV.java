package X;

import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdCellComponent;

/* loaded from: classes9.dex */
public final class JAV implements JAT {
    public final /* synthetic */ MidAdCellComponent LIZ;

    @Override // X.JAT
    public final void LJIIIIZZ() {
        IWF.LJJLIIIIJ().LJIIIIZZ();
        MidAdCellComponent midAdCellComponent = this.LIZ;
        IWH iwh = midAdCellComponent.LLIL;
        if (iwh != null) {
            iwh.setSurface(null);
        }
        IWH iwh2 = midAdCellComponent.LLIL;
        if (iwh2 != null) {
            iwh2.release();
        }
        midAdCellComponent.LLIL = null;
    }

    public JAV(MidAdCellComponent midAdCellComponent) {
        this.LIZ = midAdCellComponent;
    }
}
