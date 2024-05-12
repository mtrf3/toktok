package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TcW, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75028TcW extends AbstractC76219Tvj {
    public C75028TcW() {
        super(1);
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.dfr, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(\n      …      false\n            )");
        return new C75064Td6(LLLLIILL);
    }
}
