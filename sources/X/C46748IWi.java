package X;

import Y.ARunnableS10S0101000_6;
import Y.ARunnableS11S0201000_8;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS17S0101000_13;
import Y.ARunnableS1S0100001_8;
import Y.ARunnableS1S0111000_8;
import Y.ARunnableS7S0210000_8;
import Y.ARunnableS8S0201000_5;
import Y.ARunnableS9S0101000_5;
import Y.ARunnableS9S0201000_6;
import Y.IDRunnableS6S0101000;
import android.os.Handler;
import android.view.Surface;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.IWi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46748IWi extends IXL {
    public static final /* synthetic */ int LJJIIJ = 0;
    public final C62822Ol8 LJJ;
    public final C62822Ol8 LJJI;
    public final C62822Ol8 LJJIFFI;
    public final C62822Ol8 LJJII;
    public final C62822Ol8 LJJIII;

    public final boolean LJJIII() {
        if (!((Boolean) this.LJJIFFI.getValue()).booleanValue() || !IZA.LIZLLL) {
            return true;
        }
        return false;
    }

    public final Handler LJJIIJ() {
        return (Handler) this.LJJI.getValue();
    }

    @Override // X.AbstractC46746IWg, X.IWH
    public final InterfaceC46645ISj LIZJ() {
        if (LJJIII()) {
            return (InterfaceC46645ISj) this.LJJIII.getValue();
        }
        IUE iue = this.LJIIJ;
        o.LJIIIIZZ(iue, "{\n            super.getV…oInfoProvider()\n        }");
        return iue;
    }

    @Override // X.AbstractC46746IWg, X.IWH
    public final IWK LIZLLL() {
        if (LJJIII()) {
            return (IWK) this.LJJII.getValue();
        }
        IWK iwk = this.LJIIJJI;
        o.LJIIIIZZ(iwk, "{\n            super.getConfigSetter()\n        }");
        return iwk;
    }

    @Override // X.AbstractC46746IWg, X.IWH
    public final void LJIILIIL() {
        if (LJJIII()) {
            LJJIIJ().post(new ARunnableS1S0111000_8(this, 2, true, 2));
        } else {
            this.LIZJ = true;
        }
    }

    @Override // X.AbstractC46746IWg, X.IWH
    public final void LJJL() {
        if (LJJIII()) {
            LJJIIJ().post(new ARunnableS10S0101000_6(6, this, 2));
        } else {
            super.LJJL();
        }
    }

    @Override // X.AbstractC46746IWg, X.IWH
    public final void pause() {
        if (LJJIII()) {
            LJJIIJ().post(new ARunnableS9S0101000_5(5, this, 8));
        } else {
            super.pause();
        }
    }

    @Override // X.AbstractC46746IWg, X.IWH
    public final void release() {
        if (LJJIII()) {
            LJJIIJ().post(new IDRunnableS6S0101000(6, this, 12));
        } else {
            super.release();
        }
    }

    @Override // X.AbstractC46746IWg, X.IWH
    public final void reset() {
        if (LJJIII()) {
            LJJIIJ().post(new ARunnableS12S0101000_8(8, this, 2));
        } else {
            super.reset();
        }
    }

    @Override // X.AbstractC46746IWg, X.IWH
    public final void resume() {
        if (LJJIII()) {
            LJJIIJ().post(new ARunnableS17S0101000_13(5, this, 12));
        } else {
            super.resume();
        }
    }

    @Override // X.AbstractC46746IWg, X.IWH
    public final void stop() {
        if (LJJIII()) {
            LJJIIJ().post(new RunnableC51616KNo(7, this));
        } else {
            super.stop();
        }
    }

    public static void LJJIIJZLJL(C46748IWi this$0) {
        o.LJIIIZ(this$0, "this$0");
        super.pause();
    }

    public static void LJJIJIIJI(C46748IWi this$0) {
        o.LJIIIZ(this$0, "this$0");
        super.release();
    }

    public static void LJJIJIIJIL(C46748IWi this$0) {
        o.LJIIIZ(this$0, "this$0");
        super.reset();
    }

    public static void LJJIJIL(C46748IWi this$0) {
        o.LJIIIZ(this$0, "this$0");
        super.resume();
    }

    public static void LJJIZ(C46748IWi this$0) {
        o.LJIIIZ(this$0, "this$0");
        super.LJJL();
    }

    public static void LJJJ(C46748IWi this$0) {
        o.LJIIIZ(this$0, "this$0");
        super.stop();
    }

    @Override // X.IXL, X.AbstractC46746IWg, X.IWH
    public final void LJI(float f) {
        if (LJJIII()) {
            LJJIIJ().post(new ARunnableS1S0100001_8(this, f, 1));
        } else {
            super.LJI(f);
        }
    }

    @Override // X.AbstractC46746IWg, X.IWH
    public final void LJIIIIZZ(C46745IWf c46745IWf) {
        if (LJJIII()) {
            LJJIIJ().post(new ARunnableS9S0201000_6(2, this, c46745IWf, 8));
        } else {
            super.LJIIIIZZ(c46745IWf);
        }
    }

    @Override // X.AbstractC46746IWg, X.IWH
    public final void LJIIL(C46745IWf c46745IWf) {
        if (LJJIII()) {
            LJJIIJ().post(new ARunnableS11S0201000_8(4, this, c46745IWf, 3));
        } else {
            super.LJIIL(c46745IWf);
        }
    }

    @Override // X.AbstractC46746IWg
    public final void LJJ(IX4 ix4) {
        if (LJJIII()) {
            LJJIIJ().post(new ARunnableS9S0201000_6(3, this, ix4, 10));
        } else {
            super.LJJ(ix4);
        }
    }

    @Override // X.AbstractC46746IWg, X.IWH
    public final void setSurface(Surface surface) {
        if (LJJIII()) {
            LJJIIJ().post(new ARunnableS8S0201000_5(3, this, surface, 4));
        } else {
            super.setSurface(surface);
        }
    }

    public C46748IWi(IXF ixf, C46780IXo c46780IXo) {
        super(ixf, c46780IXo);
        this.LJJ = C221108m2.LIZIZ(C47031Id1.LJLIL);
        this.LJJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 668));
        this.LJJIFFI = C221108m2.LIZIZ(C60372Yn.LJLIL);
        this.LJJII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 666));
        this.LJJIII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 667));
    }

    public static void LJJIIZ(C46748IWi this$0, C46745IWf c46745IWf) {
        o.LJIIIZ(this$0, "this$0");
        super.LJIIL(c46745IWf);
    }

    public static void LJJIIZI(C46748IWi this$0, IX4 ix4) {
        o.LJIIIZ(this$0, "this$0");
        super.LJJ(ix4);
    }

    public static void LJJIJ(C46748IWi this$0, C46745IWf c46745IWf) {
        o.LJIIIZ(this$0, "this$0");
        super.LJIIIIZZ(c46745IWf);
    }

    public static void LJJIJL(C46748IWi this$0, float f) {
        o.LJIIIZ(this$0, "this$0");
        super.LJI(f);
    }

    public static void LJJIJLIJ(C46748IWi this$0, Surface surface) {
        o.LJIIIZ(this$0, "this$0");
        super.setSurface(surface);
    }

    @Override // X.AbstractC46746IWg, X.IWH
    public final void LJII(Surface surface, boolean z) {
        if (LJJIII()) {
            LJJIIJ().post(new ARunnableS7S0210000_8(this, surface, 8));
        } else {
            super.LJII(surface, true);
        }
    }

    public static void LJJIL(C46748IWi this$0, Surface surface, boolean z) {
        o.LJIIIZ(this$0, "this$0");
        super.LJII(surface, z);
    }
}
