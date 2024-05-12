package X;

import Y.ARunnableS29S0200000_10;
import Y.IDcS135S0200000_1;
import android.os.SystemClock;
import com.bytedance.im.core.proto.AckConversationApplyRequestBody;
import com.bytedance.im.core.proto.AckConversationApplyResponseBody;
import com.bytedance.im.core.proto.ConversationApplyInfo;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* renamed from: X.4ns, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C120324ns extends AbstractC63515OwJ<ConversationApplyInfo> {
    public final C116934iP LIZJ;

    static {
        AckConversationApplyRequestBody.registerAdapter();
        AckConversationApplyResponseBody.registerAdapter();
    }

    public C120324ns(IDcS135S0200000_1 iDcS135S0200000_1) {
        super(EnumC63625Oy5.ACK_CONVERSATION_APPLY.getValue(), iDcS135S0200000_1);
        this.LIZJ = new C116934iP("imsdk_group_chat_ack_apply");
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        ResponseBody responseBody;
        Response response = c63622Oy2.LJLJL;
        if (response != null && (responseBody = response.body) != null && responseBody.getExtension(2025) != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        this.LIZJ.LIZJ = SystemClock.elapsedRealtime();
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            AckConversationApplyResponseBody ackConversationApplyResponseBody = (AckConversationApplyResponseBody) c63622Oy2.LJLJL.body.getExtension(2025);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ACKConversationApplyHandler Success, response_status = ");
            LIZ.append(ackConversationApplyResponseBody.status);
            C63322OtC.LIZ(X1D.LIZIZ(LIZ));
            if (ackConversationApplyResponseBody.status.intValue() == EnumC120364nw.APPLY_SUCCESS.getValue()) {
                LIZLLL(ackConversationApplyResponseBody.apply_info);
                this.LIZJ.LIZLLL = SystemClock.elapsedRealtime();
                this.LIZJ.LIZ(true);
                return;
            }
            ConversationApplyInfo conversationApplyInfo = ackConversationApplyResponseBody.apply_info;
            if (conversationApplyInfo != null) {
                c63622Oy2.LJZL = GsonProtectorUtils.toJson(C63682Oz0.LIZ, conversationApplyInfo);
            }
            LIZIZ(c63622Oy2);
            this.LIZJ.LIZLLL = SystemClock.elapsedRealtime();
            this.LIZJ.LIZ(false);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ACKConversationApplyHandler Failed, code = ");
        LIZ2.append(c63622Oy2.LJLL);
        LIZ2.append(" &status = ");
        LIZ2.append(c63622Oy2.LJIIIZ());
        LIZ2.append(" &checkCode = ");
        LIZ2.append(c63622Oy2.LIZLLL());
        LIZ2.append(" &checkMsg = ");
        LIZ2.append(c63622Oy2.LJ());
        LIZ2.append(" &logId = ");
        LIZ2.append(c63622Oy2.LJIIIIZZ());
        C63322OtC.LIZLLL(X1D.LIZIZ(LIZ2));
        C63337OtR.LJII(c63622Oy2, false).LIZ();
        LIZIZ(c63622Oy2);
        this.LIZJ.LIZLLL = SystemClock.elapsedRealtime();
        this.LIZJ.LIZ(false);
    }
}
