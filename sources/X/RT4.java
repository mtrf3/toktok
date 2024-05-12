package X;

import com.bytedance.im.core.proto.BlockMembersRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* loaded from: classes13.dex */
public final class RT4 extends Message.Builder<BlockMembersRequestBody, RT4> {
    public EnumC63751P0h LIZLLL;
    public Long LJFF;
    public Integer LJI;
    public String LJII;
    public java.util.Map<Long, Long> LJ = new LinkedHashMap();
    public java.util.Map<String, String> LJIIIIZZ = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    public final BlockMembersRequestBody build() {
        return new BlockMembersRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
