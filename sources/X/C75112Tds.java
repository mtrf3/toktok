package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tds, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75112Tds extends AbstractC76219Tvj {
    public final InterfaceC75126Te6 LIZJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75112Tds(InterfaceC75126Te6 viewMoreListener) {
        super(1);
        o.LJIIIZ(viewMoreListener, "viewMoreListener");
        this.LIZJ = viewMoreListener;
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.dfv, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…load_more, parent, false)");
        return new C75117Tdx(LLLLIILL, this.LIZJ);
    }

    @Override // X.AbstractC31414CUo
    public final void LIZIZ(RecyclerView.ViewHolder viewHolder, Object item, List payloads) {
        C75117Tdx holder = (C75117Tdx) viewHolder;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        o.LJIIIZ(payloads, "payloads");
        holder.LJLILLLLZI = this.LIZJ;
        LIZ(holder, item);
    }
}
