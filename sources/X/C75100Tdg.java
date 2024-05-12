package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.linkroom.dataholder.LinkControlDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tdg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C75100Tdg extends AbstractC76219Tvj {
    public final DataChannel LIZJ;
    public final InterfaceC75119Tdz LIZLLL;
    public final MultiGuestDataHolder LJ;
    public final LinkControlDataHolder LJFF;
    public final int LJI;
    public final InterfaceC88472Yns<Long, Long> LJII;
    public final InterfaceC88472Yns<Long, Integer> LJIIIIZZ;
    public final String LJIIIZ;
    public final C75066Td8 LJIIJ;

    @Override // X.AbstractC31414CUo
    /* renamed from: LJI, reason: merged with bridge method [inline-methods] */
    public C75093TdZ LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        View LIZIZ;
        o.LJIIIZ(parent, "parent");
        if (LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
            Context context = layoutInflater.getContext();
            o.LJIIIIZZ(context, "inflater.context");
            LIZIZ = C20780ri.LIZIZ(R.layout.dfo, context, parent, false);
        } else {
            LIZIZ = CZB.LIZ.LIZIZ(R.layout.dfo, parent, false);
        }
        return new C75093TdZ(LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ);
    }

    @Override // X.AbstractC31414CUo
    public final void LIZIZ(RecyclerView.ViewHolder viewHolder, Object obj, List payloads) {
        C75093TdZ holder = (C75093TdZ) viewHolder;
        LinkPlayerInfo item = (LinkPlayerInfo) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        o.LJIIIZ(payloads, "payloads");
        holder.LJLILLLLZI = this.LIZLLL;
        MultiGuestDataHolder multiGuestDataHolder = this.LJ;
        o.LJIIIZ(multiGuestDataHolder, "<set-?>");
        holder.LJLJI = multiGuestDataHolder;
        holder.LJLJJI = this.LJFF;
        if (!payloads.isEmpty()) {
            holder.M(item);
        } else {
            LIZ(holder, item);
        }
    }

    public /* synthetic */ C75100Tdg(DataChannel dataChannel, InterfaceC75119Tdz interfaceC75119Tdz, MultiGuestDataHolder multiGuestDataHolder, LinkControlDataHolder linkControlDataHolder, int i, String str, int i2) {
        this(dataChannel, interfaceC75119Tdz, multiGuestDataHolder, linkControlDataHolder, i, null, null, (i2 & 128) != 0 ? null : str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C75100Tdg(DataChannel dataChannel, InterfaceC75119Tdz interfaceC75119Tdz, MultiGuestDataHolder multiGuestDataHolder, LinkControlDataHolder linkControlDataHolder, int i, InterfaceC88472Yns<? super Long, Long> interfaceC88472Yns, InterfaceC88472Yns<? super Long, Integer> interfaceC88472Yns2, String str, C75066Td8 c75066Td8) {
        super(1);
        this.LIZJ = dataChannel;
        this.LIZLLL = interfaceC75119Tdz;
        this.LJ = multiGuestDataHolder;
        this.LJFF = linkControlDataHolder;
        this.LJI = i;
        this.LJII = interfaceC88472Yns;
        this.LJIIIIZZ = interfaceC88472Yns2;
        this.LJIIIZ = str;
        this.LJIIJ = c75066Td8;
    }
}
