package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Tai, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74916Tai extends AbstractC76219Tvj {
    public final InterfaceC88472Yns<Integer, Long> LIZJ;

    public C74916Tai(C53389KxN c53389KxN) {
        super(1);
        this.LIZJ = c53389KxN;
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.df9, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(\n      …     false,\n            )");
        return new C75389TiL(LLLLIILL, this.LIZJ);
    }
}
