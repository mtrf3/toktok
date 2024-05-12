package X;

import com.bytedance.im.core.proto.MarkMsgUnreadCountReportResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.RRl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69553RRl extends Message.Builder<MarkMsgUnreadCountReportResponseBody, C69553RRl> {
    public Boolean LIZLLL;
    public List<Long> LJ = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MarkMsgUnreadCountReportResponseBody build() {
        return new MarkMsgUnreadCountReportResponseBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
