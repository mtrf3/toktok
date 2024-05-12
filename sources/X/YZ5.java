package X;

import com.bytedance.scalpel.protos.MsgInfo;
import com.bytedance.scalpel.protos.TimeInfo;
import com.squareup.wire.Message;

/* loaded from: classes17.dex */
public final class YZ5 extends Message.Builder<MsgInfo, YZ5> {
    public String LIZLLL;
    public Integer LJ;
    public TimeInfo LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MsgInfo build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null) {
            return new MsgInfo(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C63685Oz3.LJII(str, "name", this.LJ, "what", this.LJFF, "time_info");
        throw null;
    }
}
