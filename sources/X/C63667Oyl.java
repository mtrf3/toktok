package X;

import com.bytedance.im.core.proto.ClientMetric;
import com.bytedance.im.core.proto.ReportClientMetricsRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.Oyl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63667Oyl extends Message.Builder<ReportClientMetricsRequestBody, C63667Oyl> {
    public List<ClientMetric> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ReportClientMetricsRequestBody build() {
        return new ReportClientMetricsRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
