package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessage;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessageContent;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.FakeMessageViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.33y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC779033y<T extends FakeMessageContent> extends AbstractC1041546x {
    public FakeMessageViewModel LLIIIILZ;

    public abstract void m0(FakeMessage fakeMessage, FakeMessageContent fakeMessageContent);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC779033y(View itemView, EnumC110124Tw type) {
        super(itemView, type);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(type, "type");
    }

    @Override // X.AbstractC1041546x
    public final void P(C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2, int i) {
        o.LJIIIZ(msg, "msg");
        super.P(msg, c109544Rq, c109544Rq2, i);
        if (!(msg instanceof FakeMessage)) {
            C34B.LIZJ("BaseFakeMessageViewHolder", "bind: fake message is not a FakeMessage");
            return;
        }
        FakeMessage fakeMessage = (FakeMessage) msg;
        FakeMessageContent fakeContent = fakeMessage.getFakeContent();
        if (fakeContent == null) {
            C34B.LIZJ("BaseFakeMessageViewHolder", "bind: fake content is null");
        } else {
            m0(fakeMessage, fakeContent);
        }
    }
}
