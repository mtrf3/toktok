package X;

import Y.IDcS364S0100000_1;
import com.ss.android.ugc.aweme.im.message.template.card.AnswerStatusComponent;
import com.ss.android.ugc.aweme.im.message.template.card.BotAnswerCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessage;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS132S0200000_1;

/* renamed from: X.3ep, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89233ep {
    public final String LIZ;
    public final List<String> LIZIZ;
    public int LIZLLL;
    public final int LIZJ = 1807;
    public final C73318Sq2 LJ = new C73318Sq2();

    public final void LIZ(int i) {
        String str;
        long j;
        List<String> list = this.LIZIZ;
        if (list == null || (str = (String) ORZ.LJLLLLLL(i, list)) == null) {
            return;
        }
        String str2 = this.LIZ;
        int i2 = this.LIZJ;
        IDcS364S0100000_1 iDcS364S0100000_1 = new IDcS364S0100000_1(this, 29);
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C63120Opw LIZ = C4WC.LIZIZ.LIZ(str2);
        FakeMessage.Builder builder = new FakeMessage.Builder();
        TextComponent textComponent = new TextComponent(str);
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        PreviewHintComponent previewHintComponent = new PreviewHintComponent(new TextComponent(""), new TextComponent(str), new TextComponent(""));
        AnswerStatusComponent answerStatusComponent = AnswerStatusComponent.ANSWER_NORMAL;
        BaseRequestComponent.Companion.getClass();
        builder.contentPB(new BotAnswerCardTemplate(-1, c61878OQg, c61878OQg, textComponent, c61878OQg, answerStatusComponent, c61878OQg, previewHintComponent, C69650RVe.LIZ(), new BaseResponseComponent(0L, 15)).encode());
        builder.msgType(i2);
        if (LIZ != null) {
            j = LIZ.getLastMessageOrderIndex();
        } else {
            j = -1;
        }
        builder.orderIndex(j + 1);
        int i3 = 0;
        HashMap LJJJLZIJ = C113554cx.LJJJLZIJ(new OSZ("is_welcome_msg", "1"));
        int i4 = this.LIZLLL;
        List<String> list2 = this.LIZIZ;
        if (list2 != null) {
            i3 = list2.size();
        }
        if (i4 == i3 - 1) {
            LJJJLZIJ.put("#IS_LAST_WELCOME_MSG", "1");
        }
        builder.localExt(LJJJLZIJ);
        C109544Rq build = builder.build();
        try {
            build.setSender(C81273Gx.LIZLLL(str2));
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        build.setConversationId(str2);
        C106884Hk c106884Hk = new C106884Hk();
        C96963rI.LJII().getClass();
        C78999UzT.LJFF(C73542Ste.LIZLLL(c106884Hk.LJ(C97353rv.LIZLLL()).LJJIIJ(T16.LIZ()), C89243eq.LJLIL, new AqS132S0200000_1(iDcS364S0100000_1, build, 105)), this.LJ);
    }

    public C89233ep(String str, List list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }
}
