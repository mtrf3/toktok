package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.StrangerNewMessageNotify;
import com.squareup.wire.Message;

/* loaded from: classes13.dex */
public final class RS1 extends Message.Builder<StrangerNewMessageNotify, RS1> {
    public MessageBody LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final StrangerNewMessageNotify build() {
        return new StrangerNewMessageNotify(this.LIZLLL, buildUnknownFields());
    }
}
