package X;

import com.bytedance.im.core.proto.MarkMsgGetUnreadCountRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes13.dex */
public final class RQS extends Message.Builder<MarkMsgGetUnreadCountRequestBody, RQS> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public Boolean LJI;
    public List<Long> LJII = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    public final MarkMsgGetUnreadCountRequestBody build() {
        return new MarkMsgGetUnreadCountRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
