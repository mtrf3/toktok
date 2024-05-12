package X;

import Y.ARunnableS29S0200000_10;
import Y.IDcS364S0100000_1;
import com.bytedance.im.core.proto.GetConversationAuditSwitchRequestBody;
import com.bytedance.im.core.proto.GetConversationAuditSwitchResponseBody;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.HashMap;

/* renamed from: X.40C, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C40C {
    public static final java.util.Map<Long, Boolean> LIZ = new HashMap();

    public static void LIZ(Long l) {
        if (l != null) {
            l.longValue();
            C63378Ou6 LIZIZ = C63378Ou6.LIZIZ();
            long longValue = l.longValue();
            int i = AbstractC63505Ow9.LIZIZ;
            final IDcS364S0100000_1 iDcS364S0100000_1 = new IDcS364S0100000_1(l, 12);
            LIZIZ.getClass();
            AbstractC63515OwJ<Boolean> abstractC63515OwJ = new AbstractC63515OwJ<Boolean>(iDcS364S0100000_1) { // from class: X.4nt
                static {
                    GetConversationAuditSwitchRequestBody.registerAdapter();
                    GetConversationAuditSwitchResponseBody.registerAdapter();
                }

                {
                    int value = EnumC63625Oy5.GET_CONVERSATION_AUDIT_SWITCH.getValue();
                }

                @Override // X.AbstractC63515OwJ
                public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
                    ResponseBody responseBody;
                    Response response = c63622Oy2.LJLJL;
                    if (response != null && (responseBody = response.body) != null && responseBody.getExtension(2022) != null) {
                        return true;
                    }
                    return false;
                }

                @Override // X.AbstractC63515OwJ
                public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
                    if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
                        GetConversationAuditSwitchResponseBody getConversationAuditSwitchResponseBody = (GetConversationAuditSwitchResponseBody) c63622Oy2.LJLJL.body.getExtension(2022);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("GetConversationAuditSwitchHandler Success, switch_status = ");
                        LIZ2.append(getConversationAuditSwitchResponseBody.switch_status);
                        C63322OtC.LIZ(X1D.LIZIZ(LIZ2));
                        LIZLLL(getConversationAuditSwitchResponseBody.switch_status);
                        return;
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("GetConversationAuditSwitchHandler Failed, code = ");
                    LIZ3.append(c63622Oy2.LJLL);
                    LIZ3.append(" &status = ");
                    LIZ3.append(c63622Oy2.LJIIIZ());
                    LIZ3.append(" &checkCode = ");
                    LIZ3.append(c63622Oy2.LIZLLL());
                    LIZ3.append(" &checkMsg = ");
                    LIZ3.append(c63622Oy2.LJ());
                    LIZ3.append(" &logId = ");
                    LIZ3.append(c63622Oy2.LJIIIIZZ());
                    C63322OtC.LIZLLL(X1D.LIZIZ(LIZ3));
                    C63337OtR.LJII(c63622Oy2, false).LIZ();
                    LIZIZ(c63622Oy2);
                }
            };
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("GetConversationAuditSwitchHandler, conversationShortId = ");
            LIZ2.append(longValue);
            LIZ2.append(" &conversationType = ");
            LIZ2.append(i);
            C63322OtC.LIZ(X1D.LIZIZ(LIZ2));
            C120544oE c120544oE = new C120544oE();
            c120544oE.LIZLLL = Long.valueOf(longValue);
            c120544oE.LJ = Integer.valueOf(i);
            GetConversationAuditSwitchRequestBody build = c120544oE.build();
            C89453Z8v c89453Z8v = new C89453Z8v();
            c89453Z8v.LIZIZ(2022, GetConversationAuditSwitchRequestBody.ADAPTER, build);
            abstractC63515OwJ.LJIIJJI(0, c89453Z8v.build(), null, new Object[0]);
        }
    }
}
