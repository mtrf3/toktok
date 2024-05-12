package X;

import com.bytedance.im.core.proto.BlockMembersResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes13.dex */
public final class RR5 extends Message.Builder<BlockMembersResponseBody, RR5> {
    public List<Long> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BlockMembersResponseBody build() {
        return new BlockMembersResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
