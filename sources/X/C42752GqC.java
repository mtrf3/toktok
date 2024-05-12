package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.ss.android.ugc.aweme.api.model.AnchorModule;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.GqC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42752GqC extends AbstractC42769GqT<AnchorModule, C42753GqD> {
    public final C31413CUn LIZLLL;

    public C42752GqC(InterfaceC42726Gpm interfaceC42726Gpm) {
        super(interfaceC42726Gpm);
        C31413CUn c31413CUn = new C31413CUn();
        this.LIZLLL = c31413CUn;
        c31413CUn.LJLZ(AnchorCell.class, new C42743Gq3(interfaceC42726Gpm));
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(RecyclerView.ViewHolder holder, Object obj) {
        AnchorModule module = (AnchorModule) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(module, "module");
        ArrayList<AnchorCell> arrayList = module.cells;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        C31413CUn c31413CUn = this.LIZLLL;
        ArrayList<AnchorCell> arrayList2 = module.cells;
        o.LJI(arrayList2);
        c31413CUn.LJLIL = arrayList2;
        C31413CUn c31413CUn2 = this.LIZLLL;
        c31413CUn2.notifyItemRangeChanged(0, c31413CUn2.LJLIL.size());
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.bb2, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…ollection, parent, false)");
        return new C42753GqD(this, LLLLIILL);
    }
}
