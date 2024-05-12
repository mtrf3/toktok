package X;

import com.bytedance.im.core.proto.GetMessageInfoByIndexV2RequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes13.dex */
public final class RQQ extends Message.Builder<GetMessageInfoByIndexV2RequestBody, RQQ> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public List<Long> LJI = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    public final GetMessageInfoByIndexV2RequestBody build() {
        return new GetMessageInfoByIndexV2RequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
