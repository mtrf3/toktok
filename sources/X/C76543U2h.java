package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.U2h, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76543U2h extends AbstractC76219Tvj {
    public C76543U2h() {
        super(0);
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.deu, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(\n      …     false,\n            )");
        return new C76544U2i(LLLLIILL);
    }
}
