package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.util.HashMap;

/* loaded from: classes15.dex */
public final class W7L {
    public final ContentResolver LIZ;
    public final Resources LIZIZ;
    public final AssetManager LIZJ;
    public final WB4 LIZLLL;
    public final InterfaceC81842WAc LJ;
    public final W8B LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final W87 LJIIIZ;
    public final W84 LJIIJ;
    public final C81808W8u LJIIJJI;
    public final C81808W8u LJIIL;
    public final HashMap<String, C81808W8u> LJIILIIL;
    public final W6M<W6U, InterfaceC81378Vwk> LJIILJJIL;
    public final W6M<W6U, W5A> LJIILL;
    public final W6O LJIILLIIL;
    public final AbstractC78853Ux7 LJIIZILJ;
    public final int LJIJJLI;
    public final boolean LJIL;
    public final boolean LJIIIIZZ = false;
    public final int LJIJ = 0;
    public final int LJIJI = 0;
    public final boolean LJIJJ = false;

    public final C81764W7c LIZ(InterfaceC81759W6x<W8X> interfaceC81759W6x, boolean z, InterfaceC79240V8a interfaceC79240V8a) {
        return new C81764W7c(this.LJIIIZ.LIZ(), this.LJIIJ, interfaceC81759W6x, z, interfaceC79240V8a);
    }

    public W7L(Context context, WB4 wb4, InterfaceC81842WAc interfaceC81842WAc, W8B w8b, boolean z, boolean z2, W87 w87, W84 w84, W6K w6k, W6K w6k2, C81808W8u c81808W8u, C81808W8u c81808W8u2, HashMap hashMap, W6O w6o, AbstractC78853Ux7 abstractC78853Ux7, int i, boolean z3) {
        this.LIZ = C16880lQ.LLLLL(context).getContentResolver();
        this.LIZIZ = C16880lQ.LLLLL(context).getResources();
        this.LIZJ = C16880lQ.LLLLL(context).getAssets();
        this.LIZLLL = wb4;
        this.LJ = interfaceC81842WAc;
        this.LJFF = w8b;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIZ = w87;
        this.LJIIJ = w84;
        this.LJIILL = w6k;
        this.LJIILJJIL = w6k2;
        this.LJIIJJI = c81808W8u;
        this.LJIIL = c81808W8u2;
        this.LJIILIIL = hashMap;
        this.LJIILLIIL = w6o;
        this.LJIIZILJ = abstractC78853Ux7;
        this.LJIJJLI = i;
        this.LJIL = z3;
    }
}
