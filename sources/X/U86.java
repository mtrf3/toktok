package X;

import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U86 {
    public final U7T LIZ;
    public final C73318Sq2 LIZIZ;
    public volatile java.util.Set<String> LIZJ;
    public final ConcurrentHashSet<String> LIZLLL;
    public C73546Sti LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;

    public U86(U7T linker) {
        o.LJIIIZ(linker, "linker");
        this.LIZ = linker;
        this.LIZIZ = new C73318Sq2();
        this.LIZJ = OQY.INSTANCE;
        this.LIZLLL = new ConcurrentHashSet<>();
        this.LJFF = C221108m2.LIZIZ(UBD.LJLIL);
        this.LJI = C221108m2.LIZIZ(UBB.LJLIL);
        this.LJII = C221108m2.LIZIZ(UBC.LJLIL);
    }
}
