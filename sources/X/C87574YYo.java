package X;

import com.bytedance.scalpel.protos.PerfData;
import com.bytedance.scalpel.protos.PerfDataRequest;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.YYo, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87574YYo extends Message.Builder<PerfDataRequest, C87574YYo> {
    public List<PerfData> LIZLLL = C63685Oz3.LJIIIIZZ();
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final PerfDataRequest build() {
        return new PerfDataRequest(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
