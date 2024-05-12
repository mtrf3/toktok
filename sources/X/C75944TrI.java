package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinBizContent;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteContent;
import kotlin.jvm.internal.o;

/* renamed from: X.TrI, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75944TrI extends AbstractViewOnClickListenerC76629U5p {
    public final /* synthetic */ MultiCoHostBeInvitedFragment LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75944TrI(MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment) {
        super(1000L);
        this.LJLJJL = multiCoHostBeInvitedFragment;
    }

    @Override // X.AbstractViewOnClickListenerC76629U5p
    public final void LIZ(View view) {
        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment = this.LJLJJL;
        int i = multiCoHostBeInvitedFragment.LJLLL;
        if (i != 1) {
            if (i == 2) {
                multiCoHostBeInvitedFragment.Jl(2);
                this.LJLJJL.Al(2);
            }
        } else {
            multiCoHostBeInvitedFragment.Jl(2);
            this.LJLJJL.Dl(2);
        }
        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment2 = this.LJLJJL;
        if (multiCoHostBeInvitedFragment2.LJLZ) {
            multiCoHostBeInvitedFragment2.LJLLLLLL = "decline";
            C75678Tn0 c75678Tn0 = multiCoHostBeInvitedFragment2.LJLLILLLL;
            PunishEventInfo punishEventInfo = null;
            if (c75678Tn0 != null) {
                MHJoinBizContent mHJoinBizContent = c75678Tn0.LJI;
                if (mHJoinBizContent != null) {
                    punishEventInfo = mHJoinBizContent.punishInfo;
                }
                C75017TcL.LIZLLL("decline", punishEventInfo);
                return;
            }
            LinkerInviteContent linkerInviteContent = multiCoHostBeInvitedFragment2.LJLLI;
            if (linkerInviteContent != null) {
                C75017TcL.LIZLLL("decline", linkerInviteContent.punishEventInfo);
            } else {
                o.LJIJI("inviteContent");
                throw null;
            }
        }
    }
}
