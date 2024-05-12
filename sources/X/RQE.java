package X;

import com.bytedance.im.core.proto.ConversationsPerUserByFavoriteV2RequestBody;
import com.squareup.wire.Message;

/* loaded from: classes13.dex */
public final class RQE extends Message.Builder<ConversationsPerUserByFavoriteV2RequestBody, RQE> {
    public Long LIZLLL;
    public Integer LJ;

    @Override // com.squareup.wire.Message.Builder
    public final ConversationsPerUserByFavoriteV2RequestBody build() {
        return new ConversationsPerUserByFavoriteV2RequestBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
