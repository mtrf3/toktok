package X;

import com.bytedance.im.core.proto.MessageKey;
import com.squareup.wire.Message;

/* renamed from: X.OvQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63460OvQ extends Message.Builder<MessageKey, C63460OvQ> {
    public String LIZLLL;
    public Long LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessageKey build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null) {
            return new MessageKey(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C63685Oz3.LJII(str, "conversation_id", this.LJ, "conversation_short_id", this.LJFF, "server_message_id");
        throw null;
    }
}
