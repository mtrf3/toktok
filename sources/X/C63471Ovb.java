package X;

import com.bytedance.im.core.proto.BatchGetMessagesRequestBody;
import com.bytedance.im.core.proto.MessageKey;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.Ovb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63471Ovb extends Message.Builder<BatchGetMessagesRequestBody, C63471Ovb> {
    public List<MessageKey> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchGetMessagesRequestBody build() {
        return new BatchGetMessagesRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
