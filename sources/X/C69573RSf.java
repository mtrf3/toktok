package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.PreviewerGetConversationInfoListResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.RSf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69573RSf extends Message.Builder<PreviewerGetConversationInfoListResponseBody, C69573RSf> {
    public List<ConversationInfoV2> LIZLLL = C63685Oz3.LJIIIIZZ();
    public Integer LJ;
    public Long LJFF;
    public String LJI;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final PreviewerGetConversationInfoListResponseBody build() {
        return new PreviewerGetConversationInfoListResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
