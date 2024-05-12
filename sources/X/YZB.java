package X;

import com.bytedance.scalpel.protos.IoInfo;
import com.bytedance.scalpel.protos.MethodStack;
import com.bytedance.scalpel.protos.TimeInfo;
import com.bytedance.scalpel.protos.TimeStampRange;
import com.squareup.wire.Message;

/* loaded from: classes17.dex */
public final class YZB extends Message.Builder<IoInfo, YZB> {
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public TimeInfo LJI;
    public MethodStack LJII;
    public TimeStampRange LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final IoInfo build() {
        String str = this.LIZLLL;
        if (str != null && this.LJI != null) {
            return new IoInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C63685Oz3.LJII(str, "name", this.LJI, "time_info");
        throw null;
    }
}
