package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteData;

/* loaded from: classes14.dex */
public final class U7P<T> implements InterfaceC64592gB {
    public final /* synthetic */ U7F LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ ReplyInviteData LJLJJL;
    public final /* synthetic */ long LJLJJLL;

    public U7P(U7F u7f, long j, int i, long j2, ReplyInviteData replyInviteData, long j3) {
        this.LJLIL = u7f;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
        this.LJLJJI = j2;
        this.LJLJJL = replyInviteData;
        this.LJLJJLL = j3;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        String str2;
        U7F u7f;
        String str3;
        BaseResponse baseResponse = (BaseResponse) obj;
        U7F u7f2 = this.LJLIL;
        String valueOf = String.valueOf(this.LJLILLLLZI);
        int i = this.LJLJI;
        String str4 = "";
        OSZ osz = new OSZ(0L, "");
        String str5 = null;
        if (baseResponse != null) {
            str5 = baseResponse.LIZIZ;
        }
        UA9.LJJIJIL(i, this.LJLJJI, C31012CFc.LIZIZ(), u7f2, valueOf, str5, osz, true);
        if (this.LJLJJL.getReplyStatus() == 1 && (str3 = (u7f = this.LJLIL).LJIIJ) != null) {
            long j = this.LJLJJLL;
            String str6 = u7f.LJJIIZ().LJLZ;
            if (str6 != null) {
                u7f.LJIJ.LIZIZ(U85.INVITEE, str3, str6, Long.valueOf(j));
            }
        }
        U7F u7f3 = this.LJLIL;
        U7W u7w = u7f3.LJIJ;
        long LIZIZ = C31012CFc.LIZIZ() - this.LJLJJI;
        if (baseResponse != null && (str2 = baseResponse.LIZIZ) != null) {
            str4 = str2;
        }
        if (this.LJLJJL.getReplyStatus() == 1) {
            str = "agree";
        } else {
            str = "reject";
        }
        J7I.LJIIIZ(u7w, u7f3, "reply_invite", LIZIZ, str4, 0, new OSZ("reply_status", str), false, null, 192);
    }
}
