package X;

import com.bytedance.im.core.proto.GetStrangerMessagesRequestBody;
import com.squareup.wire.Message;

/* renamed from: X.4oF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C120554oF extends Message.Builder<GetStrangerMessagesRequestBody, C120554oF> {
    public Long LIZLLL;
    public Boolean LJ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetStrangerMessagesRequestBody build() {
        return new GetStrangerMessagesRequestBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
