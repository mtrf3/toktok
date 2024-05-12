package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0EY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0EY {
    public static final /* synthetic */ int LIZLLL = 0;
    public final int LIZ;
    public final boolean LIZIZ;
    public final List<C279917z> LIZJ;

    public C0EY() {
        throw null;
    }

    public final C0EY LIZ(C279917z songInfo) {
        o.LJIIIZ(songInfo, "songInfo");
        if (!this.LIZJ.contains(songInfo)) {
            return this;
        }
        return C0EX.LIZ(this.LIZ, this.LIZIZ, ORZ.LLIIIJ(songInfo, this.LIZJ));
    }

    public final C0EY LIZIZ(C279917z songInfo) {
        o.LJIIIZ(songInfo, "songInfo");
        List LLJILJILJ = ORZ.LLJILJILJ(ORZ.LLIIIJ(songInfo, this.LIZJ));
        if (((ArrayList) LLJILJILJ).size() > 1) {
            ListProtector.add(LLJILJILJ, 1, songInfo);
        }
        return C0EX.LIZ(this.LIZ, this.LIZIZ, LLJILJILJ);
    }

    public C0EY(List list, boolean z, int i) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = list;
    }

    public final C0EY LIZJ(int i, boolean z, List<C279917z> songInfo) {
        o.LJIIIZ(songInfo, "songInfo");
        return C0EX.LIZ(i, z, ORZ.LLIIIZ(songInfo, this.LIZJ));
    }
}
