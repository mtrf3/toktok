package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PQZ extends F9E {
    public final String LJLIL;
    public final double LJLILLLLZI;
    public final List<C64421PQb> LJLJI;
    public final long LJLJJI;
    public final long LJLJJL;
    public final long LJLJJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Double.valueOf(this.LJLILLLLZI), this.LJLJI, Long.valueOf(this.LJLJJI), Long.valueOf(this.LJLJJL), Long.valueOf(this.LJLJJLL)};
    }

    public PQZ(String scene, double d, List<C64421PQb> droppedFrameList, long j, long j2, long j3) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(droppedFrameList, "droppedFrameList");
        this.LJLIL = scene;
        this.LJLILLLLZI = d;
        this.LJLJI = droppedFrameList;
        this.LJLJJI = j;
        this.LJLJJL = j2;
        this.LJLJJLL = j3;
    }
}
