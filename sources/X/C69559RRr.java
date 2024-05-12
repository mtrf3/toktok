package X;

import com.bytedance.im.core.proto.CheckMessagesPerUserResponseBody;
import com.bytedance.im.core.proto.InboxMessagesPerUserResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.RRr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69559RRr extends Message.Builder<CheckMessagesPerUserResponseBody, C69559RRr> {
    public List<InboxMessagesPerUserResponseBody> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CheckMessagesPerUserResponseBody build() {
        return new CheckMessagesPerUserResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
