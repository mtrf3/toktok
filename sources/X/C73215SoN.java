package X;

import androidx.recyclerview.widget.GridLayoutManager;

/* renamed from: X.SoN, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73215SoN extends AbstractC028509h {
    public final /* synthetic */ InterfaceC73219SoR LJ;
    public final /* synthetic */ GridLayoutManager LJFF;
    public final /* synthetic */ AbstractC028509h LJI;

    @Override // X.AbstractC028509h
    public final int LJFF(int i) {
        InterfaceC73219SoR interfaceC73219SoR = this.LJ;
        GridLayoutManager gridLayoutManager = this.LJFF;
        AbstractC028509h abstractC028509h = this.LJI;
        C73217SoP c73217SoP = (C73217SoP) interfaceC73219SoR;
        int itemViewType = c73217SoP.LIZ.getItemViewType(i);
        if (c73217SoP.LIZ.LJLIL.LJ(itemViewType, null) != null) {
            return gridLayoutManager.LLIIIL;
        }
        if (c73217SoP.LIZ.LJLILLLLZI.LJ(itemViewType, null) != null) {
            return gridLayoutManager.LLIIIL;
        }
        if (abstractC028509h != null) {
            return abstractC028509h.LJFF(i - c73217SoP.LIZ.LJLLLLLL());
        }
        return 1;
    }

    public C73215SoN(C73217SoP c73217SoP, GridLayoutManager gridLayoutManager, AbstractC028509h abstractC028509h) {
        this.LJ = c73217SoP;
        this.LJFF = gridLayoutManager;
        this.LJI = abstractC028509h;
    }
}
