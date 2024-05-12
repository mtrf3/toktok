package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.CreateConversationV2ResponseBody;
import com.squareup.wire.Message;

/* renamed from: X.Ozn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63731Ozn extends Message.Builder<CreateConversationV2ResponseBody, C63731Ozn> {
    public ConversationInfoV2 LIZLLL;
    public Long LJ;
    public String LJFF;
    public String LJI;
    public Integer LJII;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CreateConversationV2ResponseBody build() {
        return new CreateConversationV2ResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
