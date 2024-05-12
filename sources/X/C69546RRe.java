package X;

import com.bytedance.im.core.proto.MarkMsgUnreadCountReportRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* renamed from: X.RRe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69546RRe extends Message.Builder<MarkMsgUnreadCountReportRequestBody, C69546RRe> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public Long LJI;
    public java.util.Map<Long, Long> LJII = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    public final MarkMsgUnreadCountReportRequestBody build() {
        return new MarkMsgUnreadCountReportRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
