package X;

import Y.ARunnableS14S1100000_13;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.GroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.Ttk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76096Ttk extends AbstractC74627TQp {
    public final /* synthetic */ C76278Twg LJLIL;

    @Override // X.U62
    public final void LJIILL(U65 session, LeaveGroupMessage leaveGroupMessage) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LJJL(U65 session, CancelInviteGroupMessage cancelInviteGroupMessage) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LJJLIIJ(U65 session, InviteGroupMessage inviteGroupMessage) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LJJLJ(U65 session, ReplyInviteGroupMessage replyInviteGroupMessage) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LJLIIIL(U65 session, GroupChangeMessage groupChangeMessage) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LJLLLL(U65 session, ApplyGroupMessage applyGroupMessage) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LLFF(U65 session, PermitApplyGroupMessage permitApplyGroupMessage) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LLIIJI(U65 session, CancelApplyGroupMessage cancelApplyGroupMessage) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LLILIL(U65 session, P2PGroupChangeMessage p2PGroupChangeMessage) {
        o.LJIIIZ(session, "session");
    }

    public C76096Ttk(C76278Twg c76278Twg) {
        this.LJLIL = c76278Twg;
    }

    @Override // X.U62
    public final void LJLLI(InterfaceC75441TjB session, String linkMicId, String messageContent) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(messageContent, "messageContent");
        C15610jN.LIZIZ(new ARunnableS14S1100000_13(this.LJLIL, messageContent, 5));
    }
}
