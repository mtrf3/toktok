package X;

import com.bytedance.im.core.proto.SendInputStatusResponseBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* loaded from: classes13.dex */
public final class RTE extends Message.Builder<SendInputStatusResponseBody, RTE> {
    public EnumC69908Rc8 LIZLLL;
    public java.util.Map<String, String> LJ = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final SendInputStatusResponseBody build() {
        return new SendInputStatusResponseBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
