package X;

import com.bytedance.im.core.proto.MessagesPerUserComboInboxTypeRequestBody;
import com.bytedance.im.core.proto.MessagesPerUserPaginationInfo;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes13.dex */
public final class RRW extends Message.Builder<MessagesPerUserComboInboxTypeRequestBody, RRW> {
    public List<Integer> LIZLLL = C63685Oz3.LJIIIIZZ();
    public java.util.Map<Integer, MessagesPerUserPaginationInfo> LJ = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    public final MessagesPerUserComboInboxTypeRequestBody build() {
        return new MessagesPerUserComboInboxTypeRequestBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
