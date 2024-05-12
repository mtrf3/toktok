package X;

import com.bytedance.im.core.proto.GetMessageError;
import com.bytedance.im.core.proto.GetMessagesResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.Ozk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63728Ozk extends Message.Builder<GetMessagesResponseBody, C63728Ozk> {
    public List<MessageBody> LIZLLL = C63685Oz3.LJIIIIZZ();
    public List<GetMessageError> LJ = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessagesResponseBody build() {
        return new GetMessagesResponseBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
