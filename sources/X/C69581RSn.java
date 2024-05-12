package X;

import com.bytedance.im.core.proto.BatchGetMessagesResponseBody;
import com.bytedance.im.core.proto.GetMessageByKeyError;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.RSn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69581RSn extends Message.Builder<BatchGetMessagesResponseBody, C69581RSn> {
    public List<MessageBody> LIZLLL = C63685Oz3.LJIIIIZZ();
    public List<GetMessageByKeyError> LJ = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchGetMessagesResponseBody build() {
        return new BatchGetMessagesResponseBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
