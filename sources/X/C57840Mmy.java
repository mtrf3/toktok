package X;

import android.view.View;
import com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell;
import kotlin.jvm.internal.o;

/* renamed from: X.Mmy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57840Mmy implements InterfaceC19530ph {
    public final /* synthetic */ BasePowerCell<ITEM> LIZ;

    public C57840Mmy(BasePowerCell<ITEM> basePowerCell) {
        this.LIZ = basePowerCell;
    }

    @Override // X.InterfaceC19530ph
    public final void LIZ(View view, String itemID) {
        o.LJIIIZ(itemID, "itemID");
        InterfaceC57784Mm4 item = this.LIZ.getItem();
        if (item != null) {
            BasePowerCell<ITEM> basePowerCell = this.LIZ;
            basePowerCell.P(basePowerCell.M(), item, true);
        }
    }
}
