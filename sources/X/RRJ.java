package X;

import com.bytedance.im.core.proto.CheckMessagePerUserRequestBody;
import com.bytedance.im.core.proto.InboxMessagesPerUser;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes13.dex */
public final class RRJ extends Message.Builder<CheckMessagePerUserRequestBody, RRJ> {
    public List<InboxMessagesPerUser> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CheckMessagePerUserRequestBody build() {
        return new CheckMessagePerUserRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
