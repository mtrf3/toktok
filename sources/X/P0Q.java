package X;

import com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeResponseBody;
import com.bytedance.im.core.proto.MessageInfo;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes11.dex */
public final class P0Q extends Message.Builder<GetMessageInfoByIndexV2RangeResponseBody, P0Q> {
    public List<MessageInfo> LIZLLL = C63685Oz3.LJIIIIZZ();
    public Long LJ;
    public Boolean LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessageInfoByIndexV2RangeResponseBody build() {
        return new GetMessageInfoByIndexV2RangeResponseBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
