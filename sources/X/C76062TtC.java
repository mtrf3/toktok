package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TtC, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76062TtC extends AbstractC76212Tvc {
    public final RecyclerView LIZJ;
    public final InterfaceC76066TtG LIZLLL;

    public C76062TtC(RunnableC31065CHd runnableC31065CHd, InterfaceC76066TtG interfaceC76066TtG) {
        super(0);
        this.LIZJ = runnableC31065CHd;
        this.LIZLLL = interfaceC76066TtG;
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.d98, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…nce_large, parent, false)");
        return new C76065TtF(this, LLLLIILL);
    }
}
