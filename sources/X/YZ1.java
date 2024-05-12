package X;

import com.bytedance.scalpel.protos.GCRecord;
import com.bytedance.scalpel.protos.TimeInfo;
import com.bytedance.scalpel.protos.TimeStampRange;
import com.squareup.wire.Message;

/* loaded from: classes17.dex */
public final class YZ1 extends Message.Builder<GCRecord, YZ1> {
    public Integer LIZLLL;
    public Long LJ;
    public Long LJFF;
    public Long LJI;
    public String LJII;
    public TimeInfo LJIIIIZZ;
    public TimeStampRange LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GCRecord build() {
        Integer num = this.LIZLLL;
        if (num != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new GCRecord(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C63685Oz3.LJII(num, "gc_type", this.LJ, "alloc_size", this.LJFF, "start_time", this.LJI, "end_time");
        throw null;
    }
}
