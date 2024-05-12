package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CJC extends AbstractC76212Tvc {
    public final int LIZJ;
    public final InterfaceC28316B9k LIZLLL;
    public final CJO LJ;
    public final CJN LJFF;

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.d8u, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…_emote_v2, parent, false)");
        CJJ cjj = new CJJ(LLLLIILL, this.LIZLLL, this.LJ, this.LJFF);
        ViewGroup.LayoutParams layoutParams = cjj.itemView.getLayoutParams();
        int i = this.LIZJ;
        layoutParams.height = i;
        layoutParams.width = i;
        cjj.itemView.setLayoutParams(layoutParams);
        return cjj;
    }

    public CJC(int i, CJ0 cj0, CJ0 cj02, CJ0 cj03) {
        super(1);
        this.LIZJ = i;
        this.LIZLLL = cj0;
        this.LJ = cj02;
        this.LJFF = cj03;
    }
}
