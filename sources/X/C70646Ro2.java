package X;

import Y.ARunnableS48S0100000_12;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ro2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70646Ro2 {
    public static final HashMap<String, C70646Ro2> LJIIL = new HashMap<>();
    public final String LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public final Handler LJFF;
    public final List<InterfaceC88473Ynt<Integer, Integer, Long, C76800UCe>> LJI;
    public long LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public final ARunnableS48S0100000_12 LJIIJJI;

    public C70646Ro2(String productId) {
        o.LJIIIZ(productId, "productId");
        this.LIZ = productId;
        this.LIZIZ = -1L;
        this.LJFF = new Handler(C16880lQ.LLJJJJ());
        this.LJI = new ArrayList();
        this.LJII = 1000L;
        this.LJIIJJI = new ARunnableS48S0100000_12(this, 67);
    }
}
