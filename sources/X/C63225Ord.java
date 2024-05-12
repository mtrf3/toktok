package X;

import Y.ARunnableS29S0200000_10;
import com.bytedance.im.core.proto.ResponseBody;

/* renamed from: X.Ord, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63225Ord extends AbstractC63515OwJ {
    @Override // X.AbstractC63515OwJ
    public final boolean LJFF() {
        return true;
    }

    public C63225Ord() {
        super(EnumC63625Oy5.GET_MESSAGES_BY_CONVERSATION.getValue());
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        ResponseBody responseBody = c63622Oy2.LJLJL.body;
        if (responseBody != null && responseBody.messages_in_conversation_body != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            String str = (String) c63622Oy2.LJLJJL[0];
            RunnableC63345OtZ.LIZLLL(new C63191Or5(c63622Oy2.LJLJL.body.messages_in_conversation_body, c63622Oy2, str), new C63189Or3(str), C63346Ota.LIZJ());
            C63337OtR.LJII(c63622Oy2, true).LIZ();
            return;
        }
        C63337OtR.LJII(c63622Oy2, false).LIZ();
    }
}
