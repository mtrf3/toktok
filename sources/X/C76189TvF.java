package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.multihost.core.countdown.MultiCoHostCountDownEvent;
import com.bytedance.android.live.liveinteract.multihost.event.ReserveListStateChangeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TvF, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76189TvF extends AbstractC31414CUo<C76013TsP, C76190TvG> {
    public final InterfaceC75964Trc LIZIZ;
    public final InterfaceC75963Trb LIZJ;
    public final DataChannel LIZLLL;

    @Override // X.AbstractC31414CUo
    public final void LJ(C76190TvG c76190TvG) {
        C76190TvG holder = c76190TvG;
        o.LJIIIZ(holder, "holder");
        holder.LJLJJI = false;
        DataChannel dataChannel = holder.LJLJJL.LIZLLL;
        if (dataChannel != null) {
            dataChannel.jv0(holder);
        }
        C73411SrX c73411SrX = holder.LJLILLLLZI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        holder.LJLILLLLZI = null;
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(C76190TvG c76190TvG, C76013TsP c76013TsP) {
        C76190TvG viewHolder = c76190TvG;
        C76013TsP item = c76013TsP;
        o.LJIIIZ(viewHolder, "viewHolder");
        o.LJIIIZ(item, "item");
        CJ2 items = item.LJLIL;
        o.LJIIIZ(items, "items");
        C31413CUn c31413CUn = viewHolder.LJLIL;
        c31413CUn.LJLIL = items;
        viewHolder.LJLJI = items;
        c31413CUn.notifyDataSetChanged();
        viewHolder.LJLJJI = true;
        DataChannel dataChannel = viewHolder.LJLJJL.LIZLLL;
        if (dataChannel != null) {
            dataChannel.mv0(MultiCoHostCountDownEvent.class, viewHolder, new AqS179S0100000_13(viewHolder, 655));
            dataChannel.mv0(ReserveListStateChangeEvent.class, viewHolder, new AqS179S0100000_13(viewHolder, 656));
        }
    }

    @Override // X.AbstractC31414CUo
    public final C76190TvG LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View it = C16880lQ.LLLLIILL(layoutInflater, R.layout.d88, parent, false);
        o.LJIIIIZZ(it, "it");
        return new C76190TvG(this, it);
    }

    public C76189TvF(InterfaceC75964Trc inviteListener, InterfaceC75963Trb applyListener, DataChannel dataChannel) {
        o.LJIIIZ(inviteListener, "inviteListener");
        o.LJIIIZ(applyListener, "applyListener");
        this.LIZIZ = inviteListener;
        this.LIZJ = applyListener;
        this.LIZLLL = dataChannel;
    }
}
