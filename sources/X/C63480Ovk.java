package X;

import com.bytedance.im.core.proto.GetConversationInfoV2RequestBody;
import com.squareup.wire.Message;

/* renamed from: X.Ovk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63480Ovk extends Message.Builder<GetConversationInfoV2RequestBody, C63480Ovk> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationInfoV2RequestBody build() {
        return new GetConversationInfoV2RequestBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
