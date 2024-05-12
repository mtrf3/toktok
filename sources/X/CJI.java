package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CJI extends AbstractC76212Tvc {
    public final CJP LIZJ;

    public CJI(CJ0 cj0) {
        super(1);
        this.LIZJ = cj0;
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.d8t, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…ader_emotes,parent,false)");
        return new CJF(LLLLIILL, this.LIZJ);
    }
}
