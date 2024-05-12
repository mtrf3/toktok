package X;

import java.util.List;

/* loaded from: classes13.dex */
public final class SLK implements C0AK {
    public final /* synthetic */ SLJ LJLIL;
    public final /* synthetic */ C03150Al LJLILLLLZI;
    public final /* synthetic */ List<OSZ<SLJ, SKZ>> LJLJI;
    public final /* synthetic */ List<SKZ> LJLJJI;
    public final /* synthetic */ List<SKZ> LJLJJL;

    @Override // X.C0AK
    public final void LJJIJLIJ(int i, int i2) {
        int LIZ;
        this.LJLIL.notifyItemRangeRemoved(i, i2);
        int i3 = i2 + i;
        if (i3 > C47261Igj.LJJI(this.LJLJJI)) {
            LIZ = C47261Igj.LJJI(this.LJLJJL) + 1;
        } else {
            LIZ = this.LJLILLLLZI.LIZ(i3);
        }
        int i4 = -1;
        int i5 = i - 1;
        if (i5 >= 0) {
            i4 = this.LJLILLLLZI.LIZ(i5);
        }
        OSZ<SLJ, SKZ> LJZI = this.LJLIL.LJZI(LIZ);
        List<OSZ<SLJ, SKZ>> list = this.LJLJI;
        SLJ first = LJZI.getFirst();
        SKZ second = LJZI.getSecond();
        if (first != null && (second instanceof SLP)) {
            list.add(new OSZ<>(first, second));
        }
        OSZ<SLJ, SKZ> LJZ = this.LJLIL.LJZ(i4);
        List<OSZ<SLJ, SKZ>> list2 = this.LJLJI;
        SLJ first2 = LJZ.getFirst();
        SKZ second2 = LJZ.getSecond();
        if (first2 != null && (second2 instanceof SLP)) {
            list2.add(new OSZ<>(first2, second2));
        }
    }

    @Override // X.C0AK
    public final void LJLIIIL(int i, int i2) {
        int LIZ;
        this.LJLIL.notifyItemRangeInserted(i, i2);
        int i3 = i - 1;
        if (i3 < 0) {
            LIZ = 0;
        } else {
            LIZ = this.LJLILLLLZI.LIZ(i3) + 1;
        }
        int i4 = (i2 + LIZ) - 1;
        OSZ<SLJ, SKZ> LJZI = this.LJLIL.LJZI(LIZ);
        List<OSZ<SLJ, SKZ>> list = this.LJLJI;
        SLJ first = LJZI.getFirst();
        SKZ second = LJZI.getSecond();
        if (first != null && (second instanceof SLP)) {
            list.add(new OSZ<>(first, second));
        }
        OSZ<SLJ, SKZ> LJZ = this.LJLIL.LJZ(i4);
        List<OSZ<SLJ, SKZ>> list2 = this.LJLJI;
        SLJ first2 = LJZ.getFirst();
        SKZ second2 = LJZ.getSecond();
        if (first2 != null && (second2 instanceof SLP)) {
            list2.add(new OSZ<>(first2, second2));
        }
    }

    @Override // X.C0AK
    public final void LJLJLLL(int i, int i2) {
        this.LJLIL.notifyItemMoved(i, i2);
    }

    @Override // X.C0AK
    public final void LJJLIIIJILLIZJL(int i, int i2, Object obj) {
        this.LJLIL.notifyItemRangeChanged(i, i2, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SLK(SLJ slj, C03150Al c03150Al, List<OSZ<SLJ, SKZ>> list, List<? extends SKZ> list2, List<? extends SKZ> list3) {
        this.LJLIL = slj;
        this.LJLILLLLZI = c03150Al;
        this.LJLJI = list;
        this.LJLJJI = list2;
        this.LJLJJL = list3;
    }
}
