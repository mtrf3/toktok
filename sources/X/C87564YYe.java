package X;

import com.bytedance.im.core.proto.ConversationCoreInfo;
import com.bytedance.im.core.proto.SetConversationCoreInfoResponseBody;
import com.squareup.wire.Message;

/* renamed from: X.YYe, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87564YYe extends Message.Builder<SetConversationCoreInfoResponseBody, C87564YYe> {
    public ConversationCoreInfo LIZLLL;
    public Integer LJ;
    public String LJFF;
    public Long LJI;
    public String LJII;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final SetConversationCoreInfoResponseBody build() {
        return new SetConversationCoreInfoResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
