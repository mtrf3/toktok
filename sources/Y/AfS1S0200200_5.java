package Y;

import X.B83;
import X.C05630Jz;
import X.C09650Zl;
import X.C29374Bfu;
import X.C30929CBx;
import X.C31084CHw;
import X.C31086CHy;
import X.C31309CQn;
import X.CI5;
import X.CN1;
import X.InterfaceC64592gB;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.chatroom.model.EmoteChatResult;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class AfS1S0200200_5 implements InterfaceC64592gB {
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
    public static final void accept$0(AfS1S0200200_5 afS1S0200200_5, Object obj) {
        C31086CHy c31086CHy = (C31086CHy) afS1S0200200_5.l0;
        C31084CHw c31084CHw = (C31084CHw) afS1S0200200_5.l1;
        long j = afS1S0200200_5.j2;
        long j2 = afS1S0200200_5.j3;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (c31086CHy.mView == 0 || baseResponse.data == 0) {
            return;
        }
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).ue0(c31086CHy.LJLILLLLZI.getId(), j, C31309CQn.LJIIZILJ(c31086CHy.LJLILLLLZI.getId(), c31084CHw.LIZ, ((EmoteChatResult) baseResponse.data).msgId, ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ, ((EmoteChatResult) baseResponse.data).user));
        ((CI5) c31086CHy.mView).qO((EmoteChatResult) baseResponse.data);
        String json = GsonProtectorUtils.toJson(C09650Zl.LIZJ, baseResponse.data);
        JSONObject jSONObject = new JSONObject();
        if (json == null) {
            json = "";
        }
        C05630Jz.LJI(jSONObject, "response", json);
        C05630Jz.LJFF(jSONObject, "cost", System.currentTimeMillis() - j2);
        C30929CBx.LJIIZILJ("subscription_send_emote_chat_succeed", jSONObject);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0128, code lost:
    
        if (r13 != null) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$1(Y.AfS1S0200200_5 r21, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS1S0200200_5.accept$1(Y.AfS1S0200200_5, java.lang.Object):void");
    }

    public AfS1S0200200_5(Object obj, Object obj2, long j, long j2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.j2 = j;
        this.j3 = j2;
    }
}
