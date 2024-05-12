package X;

import com.bytedance.im.core.proto.MessagesPerUserInitComboInboxTypeResponseBody;
import com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.RRp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69557RRp extends Message.Builder<MessagesPerUserInitComboInboxTypeResponseBody, C69557RRp> {
    public List<Integer> LIZLLL = C63685Oz3.LJIIIIZZ();
    public java.util.Map<Integer, MessagesPerUserInitV2ResponseBody> LJ = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessagesPerUserInitComboInboxTypeResponseBody build() {
        return new MessagesPerUserInitComboInboxTypeResponseBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
