package X;

import com.bytedance.im.core.proto.GetMessageInfoByIndexV2ResponseBody;
import com.bytedance.im.core.proto.MessageInfo;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public final class P18 extends Message.Builder<GetMessageInfoByIndexV2ResponseBody, P18> {
    public java.util.Map<Long, MessageInfo> LIZLLL = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessageInfoByIndexV2ResponseBody build() {
        return new GetMessageInfoByIndexV2ResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
