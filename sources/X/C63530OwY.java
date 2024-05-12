package X;

import com.bytedance.im.core.proto.GetStrangerConversationListRequestBody;
import com.squareup.wire.Message;

/* renamed from: X.OwY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63530OwY extends Message.Builder<GetStrangerConversationListRequestBody, C63530OwY> {
    public Long LIZLLL;
    public Long LJ;
    public Boolean LJFF;
    public String LJI;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetStrangerConversationListRequestBody build() {
        return new GetStrangerConversationListRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
