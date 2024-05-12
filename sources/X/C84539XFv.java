package X;

import Y.AfS67S0100000_15;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.XFv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84539XFv extends AbstractC029609s {
    public static final X9Y LJLJJL = new X9Y(0);
    public final C42224Ghg LJLIL;
    public final C73893SzJ<X9Y> LJLILLLLZI;
    public X9Y LJLJI;
    public final C73318Sq2 LJLJJI;

    public C84539XFv(C42224Ghg concatAdapterWrapper) {
        o.LJIIIZ(concatAdapterWrapper, "concatAdapterWrapper");
        this.LJLIL = concatAdapterWrapper;
        C73893SzJ<X9Y> c73893SzJ = new C73893SzJ<>();
        this.LJLILLLLZI = c73893SzJ;
        this.LJLJI = LJLJJL;
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LJLJJI = c73318Sq2;
        C78999UzT.LJFF(c73893SzJ.LJIIJJI(500L, TimeUnit.MILLISECONDS).LJJL(C73969T1h.LIZIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS67S0100000_15(this, 71)), c73318Sq2);
    }

    @Override // X.AbstractC029609s
    public final void LIZLLL(int i, int i2) {
        X9Y x9y = this.LJLJI;
        int min = Math.min(i, x9y.LJLILLLLZI);
        int max = Math.max(x9y.LJLILLLLZI + x9y.LJLJI, i + i2);
        X80 type = X80.CHANGE;
        o.LJIIIZ(type, "type");
        X9Y x9y2 = new X9Y(type, min, max - min);
        this.LJLJI = x9y2;
        this.LJLILLLLZI.onNext(x9y2);
    }

    @Override // X.AbstractC029609s
    public final void LJFF(int i, int i2) {
        X9Y x9y = this.LJLJI;
        int min = Math.min(i, x9y.LJLILLLLZI);
        int max = Math.max(x9y.LJLILLLLZI + x9y.LJLJI, i + i2);
        X80 x80 = x9y.LJLIL;
        X80 type = X80.CHANGE;
        if (x80 != type) {
            type = X80.INSERT;
        }
        o.LJIIIZ(type, "type");
        X9Y x9y2 = new X9Y(type, min, max - min);
        this.LJLJI = x9y2;
        this.LJLILLLLZI.onNext(x9y2);
    }

    @Override // X.AbstractC029609s
    public final void LJI(int i, int i2) {
        this.LJLIL.notifyItemMoved(i, i2);
    }

    @Override // X.AbstractC029609s
    public final void LJII(int i, int i2) {
        this.LJLIL.notifyItemRangeRemoved(i, i2);
    }
}
