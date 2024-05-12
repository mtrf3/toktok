package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tdf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75099Tdf extends AbstractC76219Tvj {
    public final DataChannel LIZJ;
    public final InterfaceC75125Te5 LIZLLL;
    public final MultiGuestDataHolder LJ;

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return new C75094Tda(CZB.LIZ.LIZIZ(R.layout.dfs, parent, false), this.LIZJ, this.LIZLLL, this.LJ);
    }

    public C75099Tdf(DataChannel dataChannel, InterfaceC75125Te5 interfaceC75125Te5, MultiGuestDataHolder multiGuestDataHolder) {
        super(1);
        this.LIZJ = dataChannel;
        this.LIZLLL = interfaceC75125Te5;
        this.LJ = multiGuestDataHolder;
    }

    @Override // X.AbstractC31414CUo
    public final void LIZIZ(RecyclerView.ViewHolder viewHolder, Object obj, List payloads) {
        C75094Tda holder = (C75094Tda) viewHolder;
        LinkPlayerInfo item = (LinkPlayerInfo) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        o.LJIIIZ(payloads, "payloads");
        holder.LJLILLLLZI = this.LIZLLL;
        MultiGuestDataHolder multiGuestDataHolder = this.LJ;
        o.LJIIIZ(multiGuestDataHolder, "<set-?>");
        holder.LJLJI = multiGuestDataHolder;
        if (!payloads.isEmpty()) {
            holder.M(item);
        } else {
            LIZ(holder, item);
        }
    }
}
