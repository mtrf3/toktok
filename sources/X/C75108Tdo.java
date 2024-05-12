package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tdo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75108Tdo extends AbstractC76219Tvj {
    public final InterfaceC75136TeG LIZJ;
    public final DataChannel LIZLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75108Tdo(C29079Bb9 clickListener, DataChannel dataChannel) {
        super(1);
        o.LJIIIZ(clickListener, "clickListener");
        this.LIZJ = clickListener;
        this.LIZLLL = dataChannel;
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.dfq, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(\n      …      false\n            )");
        return new C75111Tdr(LLLLIILL, this.LIZJ, this.LIZLLL);
    }

    @Override // X.AbstractC31414CUo
    public final void LIZIZ(RecyclerView.ViewHolder viewHolder, Object item, List payloads) {
        C75111Tdr holder = (C75111Tdr) viewHolder;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        o.LJIIIZ(payloads, "payloads");
        holder.LJLIL = this.LIZJ;
        LIZ(holder, item);
    }
}
