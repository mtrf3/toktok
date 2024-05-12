package X;

import Y.ARunnableS16S0400000_13;
import Y.ARunnableS24S0300000_13;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.model.message.linkcore.InviteResponse;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.U7g, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76672U7g implements InterfaceC76767UAx<InviteResponse> {
    public final /* synthetic */ U7T LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ InviteData LIZJ;
    public final /* synthetic */ InterfaceC76768UAy<InviteResult> LIZLLL;

    @Override // X.InterfaceC76767UAx
    public final void LIZIZ(InviteResponse inviteResponse, String str) {
        String str2 = str;
        U7T u7t = this.LIZ;
        U7W u7w = u7t.LJJIII;
        long LIZIZ = C31012CFc.LIZIZ() - this.LIZIZ;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = inviteResponse.inviteeLinkMicId;
        if (str3 == null) {
            str3 = "";
        }
        J7I.LJIIIZ(u7w, u7t, "invite", LIZIZ, str2, 0, null, true, str3, 32);
        U7T u7t2 = this.LIZ;
        InviteData inviteData = this.LIZJ;
        u7t2.getClass();
        long j = inviteResponse.channelId;
        String LJJJJI = U7T.LJJJJI(2605);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onModeratorInviteSucceeded start cur channel id ");
        LIZ.append(u7t2.LJI);
        LIZ.append(", response id ");
        LIZ.append(j);
        C32014ChO.LJFF(LJJJJI, X1D.LIZIZ(LIZ));
        U7B u7b = new U7B();
        C76732U9o c76732U9o = new C76732U9o();
        c76732U9o.LIZLLL = false;
        c76732U9o.LJ = j;
        c76732U9o.LIZJ = inviteResponse.inviteeLinkMicId;
        c76732U9o.LIZ = inviteData.getInvitee().getRoomId();
        c76732U9o.LIZIZ = inviteData.getInvitee().getUserId();
        u7b.LIZ = c76732U9o.LIZ();
        u7b.LIZIZ = U7V.LJIIIZ(inviteResponse.rtcInfo, u7t2.LJI);
        U7A u7a = new U7A(u7b);
        Iterator<InterfaceC76675U7j> it = u7t2.LJIIIIZZ.iterator();
        while (it.hasNext()) {
            it.next().LJJJJL(u7t2, u7a);
        }
        C15610jN.LIZIZ(new ARunnableS24S0300000_13(this.LIZ, this.LIZLLL, inviteResponse, 17));
        this.LIZJ.getInvitee().setLinkMicId(String.valueOf(inviteResponse.inviteeLinkMicId));
    }

    @Override // X.InterfaceC76767UAx
    public final void LIZ(LinkCoreError error, Throwable th, String str) {
        String str2 = str;
        o.LJIIIZ(error, "error");
        U7T u7t = this.LIZ;
        U7W u7w = u7t.LJJIII;
        long LIZIZ = C31012CFc.LIZIZ() - this.LIZIZ;
        if (str2 == null) {
            str2 = "";
        }
        J7I.LJIIIZ(u7w, u7t, "invite", LIZIZ, str2, error.getErrorCode(), null, true, null, 160);
        C15610jN.LIZIZ(new ARunnableS16S0400000_13(this.LIZ, this.LIZLLL, error, th, 7));
    }

    public C76672U7g(long j, C76595U4h c76595U4h, InviteData inviteData, U7T u7t) {
        this.LIZ = u7t;
        this.LIZIZ = j;
        this.LIZJ = inviteData;
        this.LIZLLL = c76595U4h;
    }
}
