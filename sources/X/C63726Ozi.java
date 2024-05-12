package X;

import com.bytedance.im.core.proto.GetMessageError;
import com.bytedance.im.core.proto.MessageIDIndexEntry;
import com.squareup.wire.Message;

/* renamed from: X.Ozi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63726Ozi extends Message.Builder<GetMessageError, C63726Ozi> {
    public MessageIDIndexEntry LIZLLL;
    public Integer LJ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessageError build() {
        MessageIDIndexEntry messageIDIndexEntry = this.LIZLLL;
        if (messageIDIndexEntry != null && this.LJ != null) {
            return new GetMessageError(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C63685Oz3.LJII(messageIDIndexEntry, "entry", this.LJ, "status_code");
        throw null;
    }
}
