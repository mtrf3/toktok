package X;

import com.bytedance.im.core.proto.GetTicketRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* loaded from: classes13.dex */
public final class RTA extends Message.Builder<GetTicketRequestBody, RTA> {
    public EnumC69900Rc0 LIZLLL;
    public EnumC63506OwA LJ;
    public Long LJFF;
    public Long LJI;
    public java.util.Map<String, String> LJII = new LinkedHashMap();
    public Integer LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    public final GetTicketRequestBody build() {
        return new GetTicketRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
