package X;

import com.bytedance.common.wschannel.model.Frame;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.Q8k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66510Q8k extends Message.Builder<Frame, C66510Q8k> {
    public Long LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Integer LJI;
    public List<C66507Q8h> LJII = C63685Oz3.LJIIIIZZ();
    public String LJIIIIZZ;
    public String LJIIIZ;
    public C64537PUn LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final Frame build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new Frame(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, buildUnknownFields());
        }
        C63685Oz3.LJII(l, "seqid", this.LJ, "logid", this.LJFF, "service", this.LJI, "method");
        throw null;
    }
}
