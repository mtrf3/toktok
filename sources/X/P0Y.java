package X;

import com.bytedance.im.core.proto.ConversationBadgeCountInfo;
import com.squareup.wire.Message;

/* loaded from: classes11.dex */
public final class P0Y extends Message.Builder<ConversationBadgeCountInfo, P0Y> {
    public Long LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public String LJI;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationBadgeCountInfo build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new ConversationBadgeCountInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C63685Oz3.LJII(l, "conversation_short_id", this.LJ, "badge_count", this.LJFF, "conversation_index_v2", this.LJI, "conversation_id");
        throw null;
    }
}
