package X;

import com.bytedance.im.core.proto.MarkMsgGetUnreadCountResponseBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.RRj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69551RRj extends Message.Builder<MarkMsgGetUnreadCountResponseBody, C69551RRj> {
    public Long LIZLLL;
    public java.util.Map<Long, Long> LJ = new LinkedHashMap();
    public List<Long> LJFF = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MarkMsgGetUnreadCountResponseBody build() {
        return new MarkMsgGetUnreadCountResponseBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
