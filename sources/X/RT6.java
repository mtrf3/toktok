package X;

import com.bytedance.im.core.proto.BlockConversationRequestBody;
import com.squareup.wire.Message;

/* loaded from: classes13.dex */
public final class RT6 extends Message.Builder<BlockConversationRequestBody, RT6> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public EnumC63751P0h LJI;
    public Boolean LJII;

    @Override // com.squareup.wire.Message.Builder
    public final BlockConversationRequestBody build() {
        return new BlockConversationRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
