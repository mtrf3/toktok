package X;

import com.bytedance.im.core.proto.MessagesPerUserComboInboxTypeResponseBody;
import com.bytedance.im.core.proto.MessagesPerUserResponseBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.RSr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69585RSr extends Message.Builder<MessagesPerUserComboInboxTypeResponseBody, C69585RSr> {
    public List<Integer> LIZLLL = C63685Oz3.LJIIIIZZ();
    public java.util.Map<Integer, MessagesPerUserResponseBody> LJ = new LinkedHashMap();
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessagesPerUserComboInboxTypeResponseBody build() {
        return new MessagesPerUserComboInboxTypeResponseBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
