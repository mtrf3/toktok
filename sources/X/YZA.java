package X;

import com.bytedance.scalpel.protos.LockInfo;
import com.bytedance.scalpel.protos.MethodStack;
import com.bytedance.scalpel.protos.TimeInfo;
import com.bytedance.scalpel.protos.TimeStampRange;
import com.squareup.wire.Message;

/* loaded from: classes17.dex */
public final class YZA extends Message.Builder<LockInfo, YZA> {
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public TimeInfo LJI;
    public String LJII;
    public MethodStack LJIIIIZZ;
    public TimeStampRange LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final LockInfo build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new LockInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C63685Oz3.LJII(str, "waiter_stack", this.LJ, "owner_thread", this.LJFF, "owner_stack", this.LJI, "time_info");
        throw null;
    }
}
