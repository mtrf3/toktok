package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessageInfo;
import com.squareup.wire.Message;

/* loaded from: classes11.dex */
public final class P03 extends Message.Builder<MessageInfo, P03> {
    public EnumC109604Rw LIZLLL;
    public MessageBody LJ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessageInfo build() {
        return new MessageInfo(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
