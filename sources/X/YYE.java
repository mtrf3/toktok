package X;

import com.bytedance.im.core.proto.PreviewerMessagesInConversationRequestBody;
import com.squareup.wire.Message;

/* loaded from: classes17.dex */
public final class YYE extends Message.Builder<PreviewerMessagesInConversationRequestBody, YYE> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public EnumC63513OwH LJI;
    public Long LJII;
    public Integer LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    public final PreviewerMessagesInConversationRequestBody build() {
        return new PreviewerMessagesInConversationRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
