package X;

import com.bytedance.im.core.proto.GetConversationInfoListV2RequestBody;
import com.bytedance.im.core.proto.GetConversationInfoV2RequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.Ozb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63719Ozb extends Message.Builder<GetConversationInfoListV2RequestBody, C63719Ozb> {
    public List<GetConversationInfoV2RequestBody> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    public final GetConversationInfoListV2RequestBody build() {
        return new GetConversationInfoListV2RequestBody(this.LIZLLL, buildUnknownFields());
    }
}
