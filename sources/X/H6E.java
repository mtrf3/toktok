package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H6E {
    public final List<Object> LIZ;
    public final List<Object> LIZIZ;
    public H6B LIZJ;
    public H6B LIZLLL;
    public H6B LJ;
    public final String LJFF;
    public final C87612Ya0[] LJI;

    public final C87614Ya2 LIZ() {
        Executor executor;
        Executor executor2;
        String str = this.LJFF;
        C87612Ya0[] c87612Ya0Arr = this.LJI;
        C87614Ya2 c87614Ya2 = new C87614Ya2(str, (C87612Ya0[]) Arrays.copyOf(c87612Ya0Arr, c87612Ya0Arr.length));
        ((ArrayList) c87614Ya2.LJ).addAll(this.LIZ);
        ((ArrayList) c87614Ya2.LJFF).addAll(this.LIZIZ);
        H6B h6b = this.LIZJ;
        H6C h6c = H6C.LIZ;
        Executor executor3 = null;
        if (o.LJ(h6b, h6c)) {
            executor = C16880lQ.LLLLZI(1, H6F.LJLIL);
        } else if (o.LJ(h6b, H6D.LIZ)) {
            executor = null;
        } else if (h6b instanceof C43400H1o) {
            executor = ((C43400H1o) h6b).LIZ;
        } else {
            throw new C162476Zf();
        }
        c87614Ya2.LIZIZ = executor;
        H6B h6b2 = this.LIZLLL;
        if (o.LJ(h6b2, h6c)) {
            executor2 = C16880lQ.LLLLLZL(H6G.LJLIL);
        } else if (o.LJ(h6b2, H6D.LIZ)) {
            executor2 = null;
        } else if (h6b2 instanceof C43400H1o) {
            executor2 = ((C43400H1o) h6b2).LIZ;
        } else {
            throw new C162476Zf();
        }
        c87614Ya2.LIZJ = executor2;
        H6B h6b3 = this.LJ;
        if (o.LJ(h6b3, h6c)) {
            executor3 = C16880lQ.LLLLZI(1, H6H.LJLIL);
        } else if (!o.LJ(h6b3, H6D.LIZ)) {
            if (h6b3 instanceof C43400H1o) {
                executor3 = ((C43400H1o) h6b3).LIZ;
            } else {
                throw new C162476Zf();
            }
        }
        c87614Ya2.LIZLLL = executor3;
        return c87614Ya2;
    }

    public H6E(String str, C87612Ya0... startNodes) {
        o.LJIIIZ(startNodes, "startNodes");
        this.LJFF = str;
        this.LJI = startNodes;
        this.LIZ = new ArrayList();
        this.LIZIZ = new ArrayList();
        H6C h6c = H6C.LIZ;
        this.LIZJ = h6c;
        this.LIZLLL = h6c;
        this.LJ = h6c;
    }
}
