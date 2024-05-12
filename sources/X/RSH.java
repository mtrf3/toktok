package X;

import com.bytedance.im.core.proto.SendUserActionRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* loaded from: classes13.dex */
public final class RSH extends Message.Builder<SendUserActionRequestBody, RSH> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public EnumC69902Rc2 LJI;
    public java.util.Map<String, String> LJII = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    public final SendUserActionRequestBody build() {
        return new SendUserActionRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
