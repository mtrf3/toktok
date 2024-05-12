package X;

import com.bytedance.im.core.internal.link.handler.CommandMessage;
import com.bytedance.im.core.proto.MessageBody;
import kotlin.jvm.internal.o;

/* renamed from: X.OrK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63206OrK extends AbstractC65781Prl implements InterfaceC88472Yns<MessageBody, Boolean> {
    public static final C63206OrK LJLIL = new C63206OrK();

    public C63206OrK() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(MessageBody messageBody) {
        MessageBody body = messageBody;
        o.LJIIIZ(body, "body");
        return Boolean.valueOf(CommandMessage.LJI(body));
    }
}
