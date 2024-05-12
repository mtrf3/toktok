package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CJD extends AbstractC76212Tvc {
    public final CJP LIZJ;
    public final String LIZLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJD(CJP subBtnClickListener, String str) {
        super(1);
        o.LJIIIZ(subBtnClickListener, "subBtnClickListener");
        this.LIZJ = subBtnClickListener;
        this.LIZLLL = str;
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.d78, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…og_footer, parent, false)");
        return new CJE(LLLLIILL, this.LIZJ, this.LIZLLL);
    }
}
