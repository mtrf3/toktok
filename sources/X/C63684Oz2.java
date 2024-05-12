package X;

import com.bytedance.im.core.proto.MessageIDIndexEntry;
import com.squareup.wire.Message;

/* renamed from: X.Oz2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63684Oz2 extends Message.Builder<MessageIDIndexEntry, C63684Oz2> {
    public Long LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessageIDIndexEntry build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new MessageIDIndexEntry(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C63685Oz3.LJII(l, "server_message_id", this.LJ, "index_in_conversation");
        throw null;
    }
}
