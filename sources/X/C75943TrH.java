package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.MultiCoHostAcceptInvitationEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinBizContent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TrH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75943TrH extends AbstractViewOnClickListenerC76629U5p {
    public final /* synthetic */ MultiCoHostBeInvitedFragment LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75943TrH(MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment) {
        super(1000L);
        this.LJLJJL = multiCoHostBeInvitedFragment;
    }

    @Override // X.AbstractViewOnClickListenerC76629U5p
    public final void LIZ(View view) {
        int i;
        Room room;
        User owner;
        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment = this.LJLJJL;
        int i2 = multiCoHostBeInvitedFragment.LJLLL;
        if (i2 != 1) {
            if (i2 == 2) {
                multiCoHostBeInvitedFragment.Jl(1);
            }
        } else {
            multiCoHostBeInvitedFragment.Jl(1);
        }
        if (this.LJLJJL.Hl().isChecked()) {
            if (this.LJLJJL.LJLLL == 2) {
                C30868C9o.LIZJ(R.string.kac);
                return;
            } else {
                C30868C9o.LIZJ(R.string.lz_);
                return;
            }
        }
        DataChannel dataChannel = this.LJLJJL.LJLLJ;
        if (dataChannel != null) {
            dataChannel.qv0(MultiCoHostAcceptInvitationEvent.class, C76800UCe.LIZ);
        }
        DataChannel dataChannel2 = this.LJLJJL.LJLLJ;
        if (dataChannel2 != null && (room = (Room) dataChannel2.kv0(RoomChannel.class)) != null && (owner = room.getOwner()) != null) {
            i = owner.getSecret();
        } else {
            i = 0;
        }
        PunishEventInfo punishEventInfo = null;
        if (i == 1) {
            Context context = this.LJLJJL.getContext();
            if (context != null) {
                C75970Tri.LIZ(context, EnumC75949TrN.ACCEPT, null, new AqS163S0100000_13(this.LJLJJL, 135));
            }
        } else {
            MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment2 = this.LJLJJL;
            int i3 = multiCoHostBeInvitedFragment2.LJLLL;
            if (i3 != 1) {
                if (i3 == 2) {
                    multiCoHostBeInvitedFragment2.Al(1);
                }
            } else {
                multiCoHostBeInvitedFragment2.Dl(1);
            }
        }
        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment3 = this.LJLJJL;
        if (multiCoHostBeInvitedFragment3.LJLZ) {
            multiCoHostBeInvitedFragment3.LJLLLLLL = "accept";
            C75678Tn0 c75678Tn0 = multiCoHostBeInvitedFragment3.LJLLILLLL;
            if (c75678Tn0 != null) {
                MHJoinBizContent mHJoinBizContent = c75678Tn0.LJI;
                if (mHJoinBizContent != null) {
                    punishEventInfo = mHJoinBizContent.punishInfo;
                }
                C75017TcL.LIZLLL("accept", punishEventInfo);
                return;
            }
            LinkerInviteContent linkerInviteContent = multiCoHostBeInvitedFragment3.LJLLI;
            if (linkerInviteContent != null) {
                C75017TcL.LIZLLL("accept", linkerInviteContent.punishEventInfo);
            } else {
                o.LJIJI("inviteContent");
                throw null;
            }
        }
    }
}
