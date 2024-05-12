package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tdn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75107Tdn extends AbstractC76219Tvj {
    public final InterfaceC75137TeH LIZJ;

    public C75107Tdn(DataChannel dataChannel, InterfaceC75137TeH interfaceC75137TeH) {
        super(1);
        this.LIZJ = interfaceC75137TeH;
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.dfk, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(\n      …      false\n            )");
        return new C75114Tdu(LLLLIILL, this.LIZJ);
    }

    @Override // X.AbstractC31414CUo
    public final void LIZIZ(RecyclerView.ViewHolder viewHolder, Object item, List payloads) {
        C75114Tdu holder = (C75114Tdu) viewHolder;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        o.LJIIIZ(payloads, "payloads");
        holder.LJLIL = this.LIZJ;
        LIZ(holder, item);
    }
}
