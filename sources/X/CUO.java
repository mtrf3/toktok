package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CUO extends CUM<C31358CSk, CTR, CV1> {
    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        if (LJI().LJIIZILJ) {
            View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.dcy, parent, false);
            o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…_extended, parent, false)");
            return new CV1(LLLLIILL, LJI());
        }
        if (LJI().LIZLLL) {
            View LLLLIILL2 = C16880lQ.LLLLIILL(layoutInflater, R.layout.dcx, parent, false);
            o.LJIIIIZZ(LLLLIILL2, "inflater.inflate(R.layou…container, parent, false)");
            return new CV1(LLLLIILL2, LJI());
        }
        View LLLLIILL3 = C16880lQ.LLLLIILL(layoutInflater, R.layout.dcz, parent, false);
        o.LJIIIIZZ(LLLLIILL3, "inflater.inflate(R.layou…landscape, parent, false)");
        return new CV1(LLLLIILL3, LJI());
    }
}
