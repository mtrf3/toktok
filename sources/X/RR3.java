package X;

import com.bytedance.im.core.proto.RecallMessageRequestBody;
import com.squareup.wire.Message;

/* loaded from: classes13.dex */
public final class RR3 extends Message.Builder<RecallMessageRequestBody, RR3> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Long LJI;

    @Override // com.squareup.wire.Message.Builder
    public final RecallMessageRequestBody build() {
        return new RecallMessageRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
