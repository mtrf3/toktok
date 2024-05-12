package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Tcu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75052Tcu extends AbstractC76219Tvj {
    public final InterfaceC65784Pro<C76800UCe> LIZJ;
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;

    public C75052Tcu(C75051Tct c75051Tct, C75037Tcf c75037Tcf) {
        super(1);
        this.LIZJ = c75051Tct;
        this.LIZLLL = c75037Tcf;
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.dfp, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(\n      …      false\n            )");
        return new C75061Td3(LLLLIILL, this.LIZJ, this.LIZLLL);
    }
}
