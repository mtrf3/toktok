package X;

import com.bytedance.scalpel.protos.BigJankMsg;
import com.bytedance.scalpel.protos.MethodStack;
import com.bytedance.scalpel.protos.PerformanceInfo;
import com.bytedance.scalpel.protos.TimeInfo;
import com.bytedance.scalpel.protos.TimeStampRange;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.YYs, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87578YYs extends Message.Builder<BigJankMsg.MessageDispatch, C87578YYs> {
    public List<MethodStack> LIZLLL = C63685Oz3.LJIIIIZZ();
    public Long LJ;
    public String LJFF;
    public PerformanceInfo LJI;
    public TimeInfo LJII;
    public String LJIIIIZZ;
    public TimeStampRange LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BigJankMsg.MessageDispatch build() {
        Long l = this.LJ;
        if (l != null) {
            return new BigJankMsg.MessageDispatch(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C63685Oz3.LJII(l, "interval_time");
        throw null;
    }
}
