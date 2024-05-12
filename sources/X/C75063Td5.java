package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Td5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75063Td5 extends AbstractC76219Tvj {
    public final InterfaceC75076TdI LIZJ;
    public final int LIZLLL;

    public C75063Td5(InterfaceC75076TdI interfaceC75076TdI, int i) {
        super(1);
        this.LIZJ = interfaceC75076TdI;
        this.LIZLLL = i;
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.dfl, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(\n      …     false,\n            )");
        return new C75071TdD(LLLLIILL, this.LIZJ, this.LIZLLL);
    }
}
