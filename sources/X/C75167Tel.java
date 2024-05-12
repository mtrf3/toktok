package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Tel, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75167Tel extends AbstractC76219Tvj {
    public final InterfaceC88471Ynr<String, String, C76800UCe> LIZJ;
    public final InterfaceC88472Yns<Integer, C76800UCe> LIZLLL;

    public C75167Tel(C75169Ten c75169Ten, C75171Tep c75171Tep) {
        super(1);
        this.LIZJ = c75171Tep;
        this.LIZLLL = c75169Ten;
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.dfh, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(\n      …     false,\n            )");
        return new U28(LLLLIILL, this.LIZJ, this.LIZLLL);
    }
}
