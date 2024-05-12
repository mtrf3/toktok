package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.FollowGuideVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Beu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29312Beu extends CSR {
    public final /* synthetic */ int LIZJ;

    @Override // X.CSR
    public final int LJI() {
        switch (this.LIZJ) {
            case 0:
                return R.layout.d6y;
            default:
                return R.layout.d91;
        }
    }

    @Override // X.CSR
    public final String LJIIIIZZ() {
        switch (this.LIZJ) {
            case 0:
                return "follow_guide";
            default:
                return "extended_qa";
        }
    }

    public /* synthetic */ C29312Beu(int i) {
        this.LIZJ = i;
    }

    @Override // X.CSR, X.AbstractC31414CUo
    public final /* bridge */ /* synthetic */ void LIZLLL(RecyclerView.ViewHolder viewHolder) {
        switch (this.LIZJ) {
            case 0:
                LJIILJJIL((C29311Bet) viewHolder);
                return;
            default:
                super.LIZLLL(viewHolder);
                return;
        }
    }

    @Override // X.CSR, X.AbstractC31414CUo
    public final void LJ(RecyclerView.ViewHolder viewHolder) {
        switch (this.LIZJ) {
            case 0:
                CSF holder = (CSF) viewHolder;
                o.LJIIIZ(holder, "holder");
                holder.onViewDetachedFromWindow();
                DataChannel dataChannel = LJIIIZ().LJIIIIZZ;
                if (dataChannel != null) {
                    dataChannel.rv0(FollowGuideVisibilityChannel.class, Boolean.FALSE);
                    return;
                }
                return;
            default:
                super.LJ(viewHolder);
                return;
        }
    }

    @Override // X.CSR
    public final CSF LJIIJJI(View itemView) {
        switch (this.LIZJ) {
            case 0:
                o.LJIIIZ(itemView, "itemView");
                return new C29311Bet(itemView);
            default:
                o.LJIIIZ(itemView, "itemView");
                return new BWG(itemView);
        }
    }

    @Override // X.CSR
    /* renamed from: LJIIL */
    public final void LIZLLL(CSF holder) {
        switch (this.LIZJ) {
            case 0:
                LJIILJJIL((C29311Bet) holder);
                return;
            default:
                o.LJIIIZ(holder, "holder");
                holder.onViewAttachedToWindow();
                return;
        }
    }

    @Override // X.CSR
    /* renamed from: LJIILIIL */
    public final void LJ(CSF holder) {
        switch (this.LIZJ) {
            case 0:
                o.LJIIIZ(holder, "holder");
                holder.onViewDetachedFromWindow();
                DataChannel dataChannel = LJIIIZ().LJIIIIZZ;
                if (dataChannel != null) {
                    dataChannel.rv0(FollowGuideVisibilityChannel.class, Boolean.FALSE);
                    return;
                }
                return;
            default:
                o.LJIIIZ(holder, "holder");
                holder.onViewDetachedFromWindow();
                return;
        }
    }

    public final void LJIILJJIL(C29311Bet holder) {
        String str;
        Room room;
        User owner;
        MESSAGE message;
        CommonMessageData commonMessageData;
        o.LJIIIZ(holder, "holder");
        holder.onViewAttachedToWindow();
        DataChannel dataChannel = LJIIIZ().LJIIIIZZ;
        if (dataChannel != null) {
            dataChannel.rv0(FollowGuideVisibilityChannel.class, Boolean.TRUE);
        }
        CQO cqo = holder.LJLJI;
        Long l = null;
        if (cqo == null || (message = cqo.LJIJJLI) == 0 || (commonMessageData = message.baseMessage) == null || (str = commonMessageData.logId) == null) {
            str = "";
        }
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_follow_capsule_show");
        LIZ.LJIJJ("live_follow_capsule", "request_page");
        if (room != null && (owner = room.getOwner()) != null) {
            l = Long.valueOf(owner.getId());
        }
        LIZ.LJIJJ(l, "to_user_id");
        LIZ.LJIJJ(str, "notification_request_id");
        LIZ.LJIJJ("follow_guide_chat", "notification_type");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJJIIJZLJL();
    }
}
