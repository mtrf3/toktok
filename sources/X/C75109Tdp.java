package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tdp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75109Tdp extends AbstractC76219Tvj {
    public final InterfaceC75134TeE LIZJ;
    public final DataChannel LIZLLL;
    public final boolean LJ;
    public final InterfaceC75135TeF LJFF;

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.dfj, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(\n      …      false\n            )");
        return new C75110Tdq(LLLLIILL, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
    }

    @Override // X.AbstractC31414CUo
    public final void LIZIZ(RecyclerView.ViewHolder viewHolder, Object item, List payloads) {
        C75110Tdq holder = (C75110Tdq) viewHolder;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        o.LJIIIZ(payloads, "payloads");
        holder.LJLIL = this.LIZJ;
        holder.LJLJJI = this.LJFF;
        LIZ(holder, item);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75109Tdp(InterfaceC75134TeE clickListener, DataChannel dataChannel, boolean z, InterfaceC75135TeF switchToFriendBtnClickListener) {
        super(1);
        o.LJIIIZ(clickListener, "clickListener");
        o.LJIIIZ(switchToFriendBtnClickListener, "switchToFriendBtnClickListener");
        this.LIZJ = clickListener;
        this.LIZLLL = dataChannel;
        this.LJ = z;
        this.LJFF = switchToFriendBtnClickListener;
    }
}
