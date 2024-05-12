package X;

import Y.IDComparatorS41S0000000_13;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.TreeMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS163S0100000_13;

/* renamed from: X.TlD, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75567TlD {
    public final C75568TlE LIZ;
    public long LIZIZ;
    public String LIZJ;
    public boolean LJI;
    public boolean LJII;
    public FrameLayout LJIIIZ;
    public View LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public boolean LJIILIIL;
    public final HashSet<String> LJIILJJIL;
    public final TreeMap<Integer, C75377Ti9> LJIILL;
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 473));
    public final C62822Ol8 LJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1214));
    public final TreeMap<String, C75377Ti9> LJFF = new TreeMap<>();
    public final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(C234299Hl.LJLIL);

    public final InterfaceC75569TlF LIZ() {
        return (InterfaceC75569TlF) this.LJ.getValue();
    }

    public C75567TlD(C75568TlE c75568TlE) {
        this.LIZ = c75568TlE;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pageType =  ");
        LIZ.append(c75568TlE.LIZLLL);
        C0NB.LJIIIZ("GameLinkMicFeedHandler", X1D.LIZIZ(LIZ));
        IDComparatorS41S0000000_13 iDComparatorS41S0000000_13 = new IDComparatorS41S0000000_13(13);
        this.LJIILJJIL = new HashSet<>();
        this.LJIILL = new TreeMap<>(iDComparatorS41S0000000_13);
    }
}
