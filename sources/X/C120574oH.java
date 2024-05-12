package X;

import com.bytedance.im.core.proto.ConvCountReport;
import com.bytedance.im.core.proto.UnReadCountReportRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.4oH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C120574oH extends Message.Builder<UnReadCountReportRequestBody, C120574oH> {
    public Long LIZLLL;
    public List<ConvCountReport> LJ = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UnReadCountReportRequestBody build() {
        return new UnReadCountReportRequestBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
