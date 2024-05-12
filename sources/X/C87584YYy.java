package X;

import com.bytedance.scalpel.protos.BinderInfo;
import com.bytedance.scalpel.protos.GCRecord;
import com.bytedance.scalpel.protos.IoInfo;
import com.bytedance.scalpel.protos.LockInfo;
import com.bytedance.scalpel.protos.MsgInfo;
import com.bytedance.scalpel.protos.PerformanceInfo;
import com.bytedance.scalpel.protos.RunnableInfo;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.YYy, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87584YYy extends Message.Builder<PerformanceInfo, C87584YYy> {
    public List<GCRecord> LIZLLL = C63685Oz3.LJIIIIZZ();
    public List<BinderInfo> LJ = C63685Oz3.LJIIIIZZ();
    public List<LockInfo> LJFF = C63685Oz3.LJIIIIZZ();
    public List<MsgInfo> LJI = C63685Oz3.LJIIIIZZ();
    public List<RunnableInfo> LJII = C63685Oz3.LJIIIIZZ();
    public List<IoInfo> LJIIIIZZ = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final PerformanceInfo build() {
        return new PerformanceInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
