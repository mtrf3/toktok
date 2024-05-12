package X;

import com.bytedance.im.core.proto.MessageByInitRequestBody;
import com.squareup.wire.Message;

/* loaded from: classes13.dex */
public final class RQC extends Message.Builder<MessageByInitRequestBody, RQC> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    public final MessageByInitRequestBody build() {
        return new MessageByInitRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
