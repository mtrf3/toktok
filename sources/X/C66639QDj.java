package X;

import com.squareup.wire.Message;
import com.ss.android.websocket.internal.proto.Frame;
import java.util.List;

/* renamed from: X.QDj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66639QDj extends Message.Builder<Frame, C66639QDj> {
    public Long LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Integer LJI;
    public List<C66640QDk> LJII = C63685Oz3.LJIIIIZZ();
    public String LJIIIIZZ;
    public String LJIIIZ;
    public C64537PUn LJIIJ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final Frame build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new Frame(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, buildUnknownFields());
        }
        C63685Oz3.LJII(l, "seqid", this.LJ, "logid", this.LJFF, "service", this.LJI, "method");
        throw null;
    }
}
