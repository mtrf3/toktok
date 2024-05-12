package X;

import com.bytedance.im.core.proto.GetMessagesRequestBody;
import com.bytedance.im.core.proto.MessageIDIndexEntry;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.OvG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63450OvG extends Message.Builder<GetMessagesRequestBody, C63450OvG> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public List<MessageIDIndexEntry> LJI = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessagesRequestBody build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null) {
            return new GetMessagesRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C63685Oz3.LJII(str, "conversation_id", this.LJ, "conversation_type", this.LJFF, "conversation_short_id");
        throw null;
    }
}
