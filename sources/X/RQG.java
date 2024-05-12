package X;

import com.bytedance.im.core.proto.ConversationsPerUserByTopV2RequestBody;
import com.squareup.wire.Message;

/* loaded from: classes13.dex */
public final class RQG extends Message.Builder<ConversationsPerUserByTopV2RequestBody, RQG> {
    public Long LIZLLL;
    public Integer LJ;

    @Override // com.squareup.wire.Message.Builder
    public final ConversationsPerUserByTopV2RequestBody build() {
        return new ConversationsPerUserByTopV2RequestBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
