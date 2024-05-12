package X;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS112S0300000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JYZ<T> extends C0AD {
    public final RecyclerView LIZ;
    public final InterfaceC49350JYk<T> LIZIZ;
    public final JYX LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final long LJFF;
    public final ConcurrentHashMap<Integer, C49344JYe<T>> LJI;
    public final ConcurrentHashMap<Integer, C49344JYe<T>> LJII;
    public Field LJIIIIZZ;

    public final void LIZIZ() {
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = (T) JYT.LIZ(this.LIZ);
        C68322mC c68322mC2 = new C68322mC();
        T t = (T) JYT.LIZIZ(this.LIZ);
        c68322mC2.element = t;
        T t2 = c68322mC.element;
        if (t2 != null && t != null) {
            c68322mC.element = (T) Integer.valueOf(((Number) t2).intValue() - this.LIZLLL);
            c68322mC2.element = (T) Integer.valueOf(((Number) c68322mC2.element).intValue() + this.LIZLLL);
            AqS112S0300000_8 aqS112S0300000_8 = new AqS112S0300000_8(c68322mC, (C68322mC<Integer>) c68322mC2, (C68322mC<Integer>) this, 0);
            aqS112S0300000_8.invoke(this.LJI);
            aqS112S0300000_8.invoke(this.LJII);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0152  */
    @Override // X.C0AD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LIZ(X.C0A7 r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JYZ.LIZ(X.0A7, int, int):android.view.View");
    }

    public JYZ(RecyclerView recyclerView, InterfaceC49350JYk<T> dataManager, JYX jyx, int i) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(dataManager, "dataManager");
        this.LIZ = recyclerView;
        this.LIZIZ = dataManager;
        this.LIZJ = jyx;
        this.LIZLLL = i;
        this.LJ = "AsyncCacheExtension";
        this.LJFF = JWC.LIZ.timeOut;
        this.LJI = new ConcurrentHashMap<>();
        this.LJII = new ConcurrentHashMap<>();
    }
}
