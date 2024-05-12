package X;

import com.bytedance.im.core.proto.ConversationMessagePreViewRequestBody;
import com.squareup.wire.Message;

/* loaded from: classes13.dex */
public final class RRD extends Message.Builder<ConversationMessagePreViewRequestBody, RRD> {
    public Long LIZLLL;
    public Long LJ;
    public Long LJFF;
    public Integer LJI;

    @Override // com.squareup.wire.Message.Builder
    public final ConversationMessagePreViewRequestBody build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new ConversationMessagePreViewRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C63685Oz3.LJII(l, "conv_short_id", this.LJ, "message_id", this.LJFF, "conversation_index", this.LJI, "inbox_type");
        throw null;
    }
}
