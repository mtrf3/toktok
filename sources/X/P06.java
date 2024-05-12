package X;

import com.bytedance.im.core.proto.GetMessageByIdResponseBody;
import com.bytedance.im.core.proto.MessageInfo;
import com.squareup.wire.Message;

/* loaded from: classes11.dex */
public final class P06 extends Message.Builder<GetMessageByIdResponseBody, P06> {
    public MessageInfo LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessageByIdResponseBody build() {
        return new GetMessageByIdResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
