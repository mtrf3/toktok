package X;

import com.bytedance.im.core.proto.GetConversationsCheckInfoV2RequestBody;
import com.squareup.wire.Message;

/* renamed from: X.Oyp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63671Oyp extends Message.Builder<GetConversationsCheckInfoV2RequestBody, C63671Oyp> {
    public Integer LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationsCheckInfoV2RequestBody build() {
        return new GetConversationsCheckInfoV2RequestBody(this.LIZLLL, buildUnknownFields());
    }
}
