package X;

import com.bytedance.im.core.proto.ConvCountReport;
import com.squareup.wire.Message;

/* loaded from: classes13.dex */
public final class RT8 extends Message.Builder<ConvCountReport, RT8> {
    public Long LIZLLL;
    public Long LJ;
    public EnumC63506OwA LJFF;
    public Integer LJI;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConvCountReport build() {
        return new ConvCountReport(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
