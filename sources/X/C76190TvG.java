package X;

import Y.AfS62S0200000_13;
import Y.AfS65S0100000_13;
import Y.IDaS222S0100000_13;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.TvG, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76190TvG extends RecyclerView.ViewHolder implements InterfaceC76193TvJ {
    public final C31413CUn LJLIL;
    public C73411SrX LJLILLLLZI;
    public CJ2 LJLJI;
    public boolean LJLJJI;
    public final /* synthetic */ C76189TvF LJLJJL;

    @Override // X.InterfaceC76193TvJ
    public final void LLLIILIL(C76032Tsi item) {
        Long l;
        long j;
        RivalExtraInfo.ReserveInfo reserveInfo;
        o.LJIIIZ(item, "item");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        Long l2 = null;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        Room room2 = item.LJLIL;
        RivalExtraInfo rivalExtraInfo = item.LJLJJI;
        if (rivalExtraInfo != null && (reserveInfo = rivalExtraInfo.reserveInfo) != null) {
            l2 = Long.valueOf(reserveInfo.reservationId);
        }
        C75642TmQ.LJJIL(valueOf, room2, String.valueOf(l2), ((IInteractService) CN1.LIZ(IInteractService.class)).ta0());
        L(item, 1);
        C65814PsI.LIZ().getClass();
        CoHostApi coHostApi = (CoHostApi) C65814PsI.LIZJ(CoHostApi.class);
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        this.LJLILLLLZI = (C73411SrX) C1EW.LIZ(coHostApi.replyReserve(j, item.LJLIL.getId(), item.LJLIL.getOwnerUserId(), 1)).LJJJLL(new AfS65S0100000_13(item, 234), new AfS62S0200000_13(this, item, 74), new IDaS222S0100000_13(this, 19));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76190TvG(C76189TvF c76189TvF, View view) {
        super(view);
        this.LJLJJL = c76189TvF;
        C31413CUn c31413CUn = new C31413CUn();
        this.LJLIL = c31413CUn;
        RunnableC31065CHd runnableC31065CHd = (RunnableC31065CHd) view.findViewById(R.id.iyc);
        this.LJLJI = new CJ2();
        this.LJLJJI = true;
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.LLJJIII(0);
        c31413CUn.LJLZ(C76032Tsi.class, new C76201TvR(c76189TvF.LIZIZ, c76189TvF.LIZJ, this, c76189TvF.LIZLLL));
        c31413CUn.LJLZ(C76009TsL.class, new C76197TvN(c76189TvF.LIZIZ, c76189TvF.LIZJ, c76189TvF.LIZLLL));
        runnableC31065CHd.setAdapter(c31413CUn);
        new C75975Trn(runnableC31065CHd, null, true, false);
        runnableC31065CHd.setLayoutManager(linearLayoutManager);
        runnableC31065CHd.LJII(new C119684mq(0), -1);
    }

    public final void L(C76032Tsi c76032Tsi, int i) {
        RivalExtraInfo.ReserveInfo reserveInfo;
        if (!this.LJLJJI) {
            return;
        }
        Iterator<Object> it = this.LJLJI.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next instanceof C76032Tsi) && ((C75981Trt) next).LJLIL.getId() == c76032Tsi.LJLIL.getId()) {
                if (next == null || !(next instanceof C76032Tsi)) {
                    return;
                }
                RivalExtraInfo rivalExtraInfo = ((C75981Trt) next).LJLJJI;
                if (rivalExtraInfo != null && (reserveInfo = rivalExtraInfo.reserveInfo) != null) {
                    reserveInfo.replyStatus = i;
                }
                this.LJLIL.notifyItemChanged(this.LJLJI.indexOf(next));
                return;
            }
        }
    }
}
