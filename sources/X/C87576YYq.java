package X;

import com.bytedance.scalpel.protos.PerfData;
import com.squareup.wire.Message;

/* renamed from: X.YYq, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87576YYq extends Message.Builder<PerfData, C87576YYq> {
    public Long LIZLLL;
    public Integer LJ;
    public C64537PUn LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final PerfData build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new PerfData(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C63685Oz3.LJII(l, "timestamp", this.LJ, "data_type");
        throw null;
    }
}
