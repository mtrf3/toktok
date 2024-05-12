package X;

import Y.ARunnableS16S0400000_13;
import Y.ARunnableS24S0300000_13;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.model.message.linkcore.InviteResponse;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.U7h, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76673U7h implements InterfaceC76767UAx<InviteResponse> {
    public final /* synthetic */ U7T LIZ;
    public final /* synthetic */ InviteData LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ InterfaceC76768UAy<InviteResult> LIZLLL;

    @Override // X.InterfaceC76767UAx
    public final void LIZIZ(InviteResponse inviteResponse, String str) {
        String str2 = "";
        UA9.LJIJ(this.LIZJ, C31012CFc.LIZIZ(), this.LIZ, String.valueOf(this.LIZIZ.getInvitee().getUserId()), String.valueOf(inviteResponse.inviterLinkMicId), String.valueOf(inviteResponse.inviteeLinkMicId), str, new OSZ(0L, ""), true);
        U7T u7t = this.LIZ;
        U7W u7w = u7t.LJJIII;
        long LIZIZ = C31012CFc.LIZIZ() - this.LIZJ;
        if (str != null) {
            str2 = str;
        }
        J7I.LJIIIZ(u7w, u7t, "invite", LIZIZ, str2, 0, null, false, null, 224);
        U7T u7t2 = this.LIZ;
        InviteData inviteData = this.LIZIZ;
        String LJJJJI = U7T.LJJJJI(1658);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onInviteSucceeded start cur channel id ");
        LIZ.append(u7t2.LJI);
        LIZ.append(", response id ");
        C72972SkS.LJI(LIZ, inviteResponse.channelId, LIZ, LJJJJI);
        String str3 = inviteResponse.inviteeLinkMicId;
        if (str3 != null) {
            u7t2.LJJIIZ.put(str3, Long.valueOf(inviteData.getInvitee().getUserId()));
        }
        u7t2.LJJI = inviteResponse.inviterLinkMicId;
        if (u7t2.LJI <= 0 && inviteResponse.channelId > 0) {
            u7t2.LJJII = true;
        }
        long j = inviteResponse.channelId;
        if (j > 0) {
            u7t2.LJJJJLL(j);
        }
        u7t2.LJIIJ = U7V.LJIIIZ(inviteResponse.rtcInfo, u7t2.LJI);
        U7B u7b = new U7B();
        u7b.LIZ = u7t2.LLZL();
        u7b.LIZIZ = u7t2.LJIIJ;
        U7A u7a = new U7A(u7b);
        u7t2.LJJJLL(2);
        Iterator<InterfaceC76675U7j> it = u7t2.LJIIIIZZ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(u7t2, u7a);
        }
        C15610jN.LIZIZ(new ARunnableS24S0300000_13(this.LIZ, this.LIZLLL, inviteResponse, 16));
        this.LIZIZ.getInvitee().setLinkMicId(String.valueOf(inviteResponse.inviteeLinkMicId));
    }

    @Override // X.InterfaceC76767UAx
    public final void LIZ(LinkCoreError error, Throwable th, String str) {
        String str2 = str;
        o.LJIIIZ(error, "error");
        UA9.LJIJ(this.LIZJ, C31012CFc.LIZIZ(), this.LIZ, String.valueOf(this.LIZIZ.getInvitee().getUserId()), null, null, str2, UC0.LJIILL(th), false);
        U7T u7t = this.LIZ;
        U7W u7w = u7t.LJJIII;
        long LIZIZ = C31012CFc.LIZIZ() - this.LIZJ;
        if (str2 == null) {
            str2 = "";
        }
        J7I.LJIIIZ(u7w, u7t, "invite", LIZIZ, str2, error.getErrorCode(), null, false, null, 224);
        C15610jN.LIZIZ(new ARunnableS16S0400000_13(this.LIZ, this.LIZLLL, error, th, 4));
    }

    public C76673U7h(long j, InterfaceC76768UAy interfaceC76768UAy, InviteData inviteData, U7T u7t) {
        this.LIZ = u7t;
        this.LIZIZ = inviteData;
        this.LIZJ = j;
        this.LIZLLL = interfaceC76768UAy;
    }
}
