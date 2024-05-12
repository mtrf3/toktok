package X;

import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteContent;
import kotlin.jvm.internal.o;

/* renamed from: X.Tqo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75914Tqo implements UB4 {
    public static final C75914Tqo LIZ = new C75914Tqo();

    @Override // X.UB4
    public final void LIZJ(long j, LinkMessage linkMessage) {
        long j2;
        C75878TqE c75878TqE = new C75878TqE();
        if (linkMessage != null) {
            j2 = linkMessage.channelId;
        } else {
            j2 = 0;
        }
        c75878TqE.LJJJJL(j, j2, linkMessage);
    }

    @Override // X.UB4
    public final void LIZ(int i, long j, long j2, String logId) {
        o.LJIIIZ(logId, "logId");
        new C75878TqE().LJJJJI(i, j, j2, logId);
    }

    @Override // X.UB4
    public final void LIZIZ(int i, long j, long j2, Throwable th) {
        new C75878TqE().LJJJI(i, j, j2, th);
    }

    @Override // X.UB4
    public final void LIZLLL(long j, int i, long j2, LinkMessage linkMessage) {
        long j3;
        LinkerInviteContent linkerInviteContent;
        if (linkMessage != null && (linkerInviteContent = linkMessage.inviteContent) != null) {
            j3 = linkerInviteContent.fromUserId;
        } else {
            j3 = 0;
        }
        C75724Tnk.LIZJ(false, i, j3, linkMessage);
        new C75878TqE().LJJJJ(j, j2, i, false);
    }
}
