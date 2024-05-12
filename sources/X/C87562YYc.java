package X;

import com.bytedance.im.core.proto.ConversationCoreInfo;
import com.bytedance.im.core.proto.UpsertConversationCoreExtInfoResponseBody;
import com.squareup.wire.Message;

/* renamed from: X.YYc, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87562YYc extends Message.Builder<UpsertConversationCoreExtInfoResponseBody, C87562YYc> {
    public ConversationCoreInfo LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public String LJI;
    public String LJII;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UpsertConversationCoreExtInfoResponseBody build() {
        return new UpsertConversationCoreExtInfoResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
