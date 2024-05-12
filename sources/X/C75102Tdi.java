package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tdi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75102Tdi extends AbstractC76219Tvj {
    public final InterfaceC65784Pro<C76800UCe> LIZJ;

    public C75102Tdi(AqS163S0100000_13 aqS163S0100000_13) {
        super(1);
        this.LIZJ = aqS163S0100000_13;
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(C75102Tdi.class));
        LIZ.append("_onCreateViewHolder");
        C0NB.LIZIZ("kick_out_all", X1D.LIZIZ(LIZ));
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.bpi, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…eset_tips, parent, false)");
        return new C75115Tdv(LLLLIILL, this.LIZJ);
    }

    @Override // X.AbstractC31414CUo
    public final void LIZIZ(RecyclerView.ViewHolder viewHolder, Object item, List payloads) {
        C75115Tdv holder = (C75115Tdv) viewHolder;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        o.LJIIIZ(payloads, "payloads");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(C75102Tdi.class));
        LIZ.append("_onBindViewHolder");
        C0NB.LIZIZ("kick_out_all", X1D.LIZIZ(LIZ));
        holder.LJLILLLLZI = this.LIZJ;
        LIZ(holder, item);
    }
}
