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

/* renamed from: X.TvE, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76188TvE extends RecyclerView.ViewHolder implements InterfaceC76194TvK {
    public final C31413CUn LJLIL;
    public C73411SrX LJLILLLLZI;
    public CJ2 LJLJI;
    public boolean LJLJJI;
    public final /* synthetic */ C76187TvD LJLJJL;

    @Override // X.InterfaceC76194TvK
    public final void LLLLLLLLLL(C75984Trw item) {
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
        this.LJLILLLLZI = (C73411SrX) C1EW.LIZ(coHostApi.replyReserve(j, item.LJLIL.getId(), item.LJLIL.getOwnerUserId(), 1)).LJJJLL(new AfS65S0100000_13(item, 235), new AfS62S0200000_13(this, item, 75), new IDaS222S0100000_13(this, 20));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76188TvE(C76187TvD c76187TvD, View view) {
        super(view);
        this.LJLJJL = c76187TvD;
        C31413CUn c31413CUn = new C31413CUn();
        this.LJLIL = c31413CUn;
        RunnableC31065CHd recyclerView = (RunnableC31065CHd) view.findViewById(R.id.iyc);
        this.LJLJI = new CJ2();
        this.LJLJJI = true;
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.LLJJIII(0);
        c31413CUn.LJLZ(C75984Trw.class, new C76200TvQ(c76187TvD.LIZIZ, c76187TvD.LIZJ, this, c76187TvD.LIZLLL));
        o.LJIIIIZZ(recyclerView, "recyclerView");
        new C75975Trn(recyclerView, null, true, true);
        recyclerView.setAdapter(c31413CUn);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    public final void L(C75984Trw c75984Trw, int i) {
        RivalExtraInfo.ReserveInfo reserveInfo;
        if (!this.LJLJJI) {
            return;
        }
        Iterator<Object> it = this.LJLJI.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next instanceof C75984Trw) && ((C75981Trt) next).LJLIL.getId() == c75984Trw.LJLIL.getId()) {
                if (next == null || !(next instanceof C75984Trw)) {
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
