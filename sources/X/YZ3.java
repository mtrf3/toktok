package X;

import com.bytedance.scalpel.protos.MethodStack;
import com.bytedance.scalpel.protos.RunnableInfo;
import com.bytedance.scalpel.protos.TimeInfo;
import com.bytedance.scalpel.protos.TimeStampRange;
import com.squareup.wire.Message;

/* loaded from: classes17.dex */
public final class YZ3 extends Message.Builder<RunnableInfo, YZ3> {
    public String LIZLLL;
    public String LJ;
    public TimeInfo LJFF;
    public MethodStack LJI;
    public Integer LJII;
    public Boolean LJIIIIZZ;
    public TimeStampRange LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final RunnableInfo build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null) {
            return new RunnableInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C63685Oz3.LJII(str, "name", this.LJ, "thread_name", this.LJFF, "time_info");
        throw null;
    }
}
