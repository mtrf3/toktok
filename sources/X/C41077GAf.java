package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.GAf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41077GAf extends AbstractC65781Prl implements InterfaceC88471Ynr<Boolean, Boolean, C76800UCe> {
    public final /* synthetic */ C41076GAe LJLIL;
    public final /* synthetic */ C41078GAg LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ InterfaceC41079GAh LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41077GAf(C41076GAe c41076GAe, C41078GAg c41078GAg, int i, InterfaceC41079GAh interfaceC41079GAh) {
        super(2);
        this.LJLIL = c41076GAe;
        this.LJLILLLLZI = c41078GAg;
        this.LJLJI = i;
        this.LJLJJI = interfaceC41079GAh;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Boolean bool, Boolean bool2) {
        RecyclerView.ViewHolder viewHolder;
        C41078GAg c41078GAg;
        AI8 ai8;
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        C41076GAe c41076GAe = this.LJLIL;
        RecyclerView recyclerView = c41076GAe.LJLJJL;
        AI9 ai9 = null;
        if (recyclerView != null) {
            viewHolder = recyclerView.LJJIZ(c41076GAe.LJLILLLLZI);
        } else {
            viewHolder = null;
        }
        if ((viewHolder instanceof C41078GAg) && (c41078GAg = (C41078GAg) viewHolder) != null && (ai8 = c41078GAg.LJLIL) != null) {
            ai9 = ai8.getAccessory();
        }
        o.LJII(ai9, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Radio");
        ((AEY) ai9).LJIILIIL(!booleanValue2);
        AI9 accessory = this.LJLILLLLZI.LJLIL.getAccessory();
        o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Radio");
        ((AEY) accessory).LJIILIIL(booleanValue2);
        if (booleanValue) {
            C41076GAe c41076GAe2 = this.LJLIL;
            int i = this.LJLJI;
            c41076GAe2.LJLILLLLZI = i;
            this.LJLJJI.M7(i);
            this.LJLJJI.LLILL();
        }
        return C76800UCe.LIZ;
    }
}
