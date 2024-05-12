package X;

import com.bytedance.im.core.proto.UnReadCountReportResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.RRn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69555RRn extends Message.Builder<UnReadCountReportResponseBody, C69555RRn> {
    public Boolean LIZLLL;
    public List<Long> LJ = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UnReadCountReportResponseBody build() {
        Boolean bool = this.LIZLLL;
        if (bool != null) {
            return new UnReadCountReportResponseBody(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C63685Oz3.LJII(bool, "set_total_status");
        throw null;
    }
}
