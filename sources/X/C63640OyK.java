package X;

import com.bytedance.im.core.proto.AckMessage;
import com.bytedance.im.core.proto.BatchAckMessageRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.OyK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63640OyK extends Message.Builder<BatchAckMessageRequestBody, C63640OyK> {
    public List<AckMessage> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchAckMessageRequestBody build() {
        return new BatchAckMessageRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
