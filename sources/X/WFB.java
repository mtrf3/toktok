package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WFB {
    public T0J<OSZ<Integer, Bitmap>> LIZ;
    public boolean LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final C62822Ol8 LJ;
    public final InterfaceC162616Zt LJFF;

    public final T0J LIZ() {
        if (!this.LIZIZ) {
            ((AbstractC73672Svk) this.LJ.getValue()).LIZ(this.LIZ);
            this.LIZIZ = true;
        }
        return this.LIZ;
    }

    public final void LIZIZ() {
        this.LJFF.reset();
        this.LIZIZ = false;
        this.LIZ = T0J.LJJZZI();
    }

    public WFB(InterfaceC162616Zt generator, int i, int i2, int i3) {
        o.LJIIIZ(generator, "generator");
        this.LJFF = generator;
        this.LIZ = T0J.LJJZZI();
        this.LIZJ = i3;
        this.LIZLLL = i;
        this.LJ = C221108m2.LIZIZ(new C82258WQc(this, i, i2, i3));
    }
}
