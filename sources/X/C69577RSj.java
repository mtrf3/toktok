package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.PreviewerMessagesInConversationResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.RSj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69577RSj extends Message.Builder<PreviewerMessagesInConversationResponseBody, C69577RSj> {
    public List<MessageBody> LIZLLL = C63685Oz3.LJIIIIZZ();
    public Long LJ;
    public Boolean LJFF;
    public Integer LJI;
    public Long LJII;
    public String LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final PreviewerMessagesInConversationResponseBody build() {
        return new PreviewerMessagesInConversationResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
