package Y;

import X.C31012CFc;
import X.C76129TuH;
import X.InterfaceC64592gB;
import X.J7I;
import X.OSZ;
import X.U7T;
import X.U7W;
import X.U85;
import X.UA9;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteData;
import com.bytedance.android.livesdk.model.message.linkcore.PermitResponse;

/* loaded from: classes14.dex */
public class AfS2S0200200_13 implements InterfaceC64592gB {
    public final int $t;
    public long j2;
    public long j3;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS2S0200200_13 afS2S0200200_13, Object obj) {
        PermitResponse permitResponse;
        String str;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (permitResponse = (PermitResponse) baseResponse.data) != null) {
            PermitApplyData permitApplyData = (PermitApplyData) afS2S0200200_13.l0;
            U7T u7t = (U7T) afS2S0200200_13.l1;
            long j = afS2S0200200_13.j3;
            String linkMicId = permitApplyData.getApplicant().getLinkMicId();
            String str2 = permitResponse.linkMicId;
            String str3 = "";
            UA9.LJJIIZ(permitApplyData.getPermitStatus(), j, C31012CFc.LIZIZ(), u7t, linkMicId, str2, baseResponse.LIZIZ, new OSZ(0L, ""), true);
            U7W u7w = u7t.LJJIII;
            long LIZIZ = C31012CFc.LIZIZ() - j;
            String str4 = baseResponse.LIZIZ;
            if (str4 != null) {
                str3 = str4;
            }
            if (permitApplyData.getPermitStatus() == 1) {
                str = "agree";
            } else {
                str = "reject";
            }
            J7I.LJIIIZ(u7w, u7t, "permit_apply", LIZIZ, str3, 0, new OSZ("permit_status", str), false, permitApplyData.getApplicant().getLinkMicId(), 64);
        }
        if (((PermitApplyData) afS2S0200200_13.l0).getPermitStatus() == 1) {
            ((U7T) afS2S0200200_13.l1).LJJIII.LIZ(U85.HANDLER, ((PermitApplyData) afS2S0200200_13.l0).getApplicant().getLinkMicId(), Long.valueOf(afS2S0200200_13.j2));
        }
    }

    public static final void accept$1(AfS2S0200200_13 afS2S0200200_13, Object obj) {
        String str;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && baseResponse.data != 0) {
            U7T u7t = (U7T) afS2S0200200_13.l1;
            ReplyInviteData replyInviteData = (ReplyInviteData) afS2S0200200_13.l0;
            long j = afS2S0200200_13.j3;
            String valueOf = String.valueOf(replyInviteData.getInviter().getUserId());
            int replyStatus = replyInviteData.getReplyStatus();
            String str2 = "";
            OSZ osz = new OSZ(0L, "");
            UA9.LJJIJIL(replyStatus, j, C31012CFc.LIZIZ(), u7t, valueOf, baseResponse.LIZIZ, osz, true);
            U7W u7w = u7t.LJJIII;
            long LIZIZ = C31012CFc.LIZIZ() - j;
            String str3 = baseResponse.LIZIZ;
            if (str3 != null) {
                str2 = str3;
            }
            if (replyInviteData.getReplyStatus() == 1) {
                str = "agree";
            } else {
                str = "reject";
            }
            J7I.LJIIIZ(u7w, u7t, "reply_invite", LIZIZ, str2, 0, new OSZ("reply_status", str), false, null, 192);
        }
        if (((ReplyInviteData) afS2S0200200_13.l0).getReplyStatus() == 2) {
            C76129TuH.LIZJ();
            return;
        }
        if (((ReplyInviteData) afS2S0200200_13.l0).getReplyStatus() != 1) {
            return;
        }
        U7T u7t2 = (U7T) afS2S0200200_13.l1;
        u7t2.LJJIII.LIZ(U85.INVITEE, u7t2.LJJI, Long.valueOf(afS2S0200200_13.j2));
        U7W u7w2 = ((U7T) afS2S0200200_13.l1).LJJIII;
        u7w2.getClass();
        u7w2.LIZLLL = System.currentTimeMillis();
    }

    public AfS2S0200200_13(Object obj, Object obj2, long j, long j2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.j2 = j;
        this.j3 = j2;
    }
}
