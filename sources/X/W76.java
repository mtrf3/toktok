package X;

import android.graphics.Bitmap;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes15.dex */
public class W76 extends W90<C81392Vwy<W5A>, C81392Vwy<W5A>> {
    public final InterfaceC81754W6s LIZJ;
    public final String LIZLLL;
    public final VA3 LJ;
    public final InterfaceC81770W7i LJFF;
    public boolean LJI;
    public C81392Vwy<W5A> LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public final /* synthetic */ W77 LJIIJJI;

    public final void LJIIJJI() {
        boolean LJIILLIIL;
        synchronized (this) {
            this.LJIIJ = false;
            LJIILLIIL = LJIILLIIL();
        }
        if (LJIILLIIL) {
            this.LJIIJJI.LIZJ.execute(new W7A(this, W92.getIntPriorityValue(this.LJFF.getPriority())));
        }
    }

    public final boolean LJIIL() {
        synchronized (this) {
            if (this.LJI) {
                return false;
            }
            C81392Vwy<W5A> c81392Vwy = this.LJII;
            this.LJII = null;
            this.LJI = true;
            C81392Vwy.LJ(c81392Vwy);
            return true;
        }
    }

    public final synchronized boolean LJIILLIIL() {
        if (!this.LJI && this.LJIIIZ && !this.LJIIJ && C81392Vwy.LJIIJJI(this.LJII)) {
            this.LJIIJ = true;
            return true;
        }
        return false;
    }

    @Override // X.W90, X.AbstractC81756W6u
    public final void LJFF() {
        if (LJIIL()) {
            this.LIZIZ.LIZJ();
        }
    }

    @Override // X.W90, X.AbstractC81756W6u
    public final void LJI(Throwable th) {
        if (LJIIL()) {
            this.LIZIZ.onFailure(th);
        }
    }

    @Override // X.AbstractC81756W6u
    public final void LJII(int i, Object obj) {
        C81392Vwy c81392Vwy = (C81392Vwy) obj;
        if (!C81392Vwy.LJIIJJI(c81392Vwy)) {
            if (AbstractC81756W6u.LIZLLL(i)) {
                LJIILJJIL(null, i);
                return;
            }
            return;
        }
        synchronized (this) {
            if (!this.LJI) {
                C81392Vwy<W5A> c81392Vwy2 = this.LJII;
                this.LJII = C81392Vwy.LIZJ(c81392Vwy);
                this.LJIIIIZZ = i;
                this.LJIIIZ = true;
                boolean LJIILLIIL = LJIILLIIL();
                C81392Vwy.LJ(c81392Vwy2);
                if (LJIILLIIL) {
                    this.LJIIJJI.LIZJ.execute(new W7A(this, W92.getIntPriorityValue(this.LJFF.getPriority())));
                }
            }
        }
    }

    public final void LJIILIIL(C81392Vwy<W5A> c81392Vwy, int i) {
        java.util.Map unmodifiableMap;
        C81392Vwy<W5A> LJIILL;
        C32151Nz.LJI(C81392Vwy.LJIIJJI(c81392Vwy));
        if (!(c81392Vwy.LJI() instanceof W5C)) {
            LJIILJJIL(c81392Vwy, i);
            return;
        }
        HashMap hashMap = new HashMap();
        this.LIZJ.LIZ(this.LIZLLL, "PostprocessorProducer");
        C81392Vwy<W5A> c81392Vwy2 = null;
        java.util.Map unmodifiableMap2 = null;
        c81392Vwy2 = null;
        try {
            try {
                LJIILL = LJIILL(c81392Vwy.LJI(), hashMap);
            } catch (Throwable th) {
                th = th;
            }
            try {
                InterfaceC81754W6s interfaceC81754W6s = this.LIZJ;
                String str = this.LIZLLL;
                VA3 va3 = this.LJ;
                if (interfaceC81754W6s.LJIIIZ(str)) {
                    hashMap.put("Postprocessor", va3.getName());
                    unmodifiableMap2 = Collections.unmodifiableMap(hashMap);
                }
                interfaceC81754W6s.LIZIZ(str, "PostprocessorProducer", unmodifiableMap2);
                LJIILJJIL(LJIILL, i);
                C81392Vwy.LJ(LJIILL);
            } catch (Throwable th2) {
                th = th2;
                c81392Vwy2 = LJIILL;
                C81392Vwy.LJ(c81392Vwy2);
                throw th;
            }
        } catch (Exception e) {
            InterfaceC81754W6s interfaceC81754W6s2 = this.LIZJ;
            String str2 = this.LIZLLL;
            VA3 va32 = this.LJ;
            try {
                if (!interfaceC81754W6s2.LJIIIZ(str2)) {
                    unmodifiableMap = null;
                } else {
                    hashMap.put("Postprocessor", va32.getName());
                    unmodifiableMap = Collections.unmodifiableMap(hashMap);
                }
                interfaceC81754W6s2.LJI(str2, "PostprocessorProducer", e, unmodifiableMap);
                if (LJIIL()) {
                    this.LIZIZ.onFailure(e);
                }
            } catch (Throwable th3) {
                th = th3;
                C81392Vwy.LJ(c81392Vwy2);
                throw th;
            }
        }
    }

    public final void LJIILJJIL(C81392Vwy<W5A> c81392Vwy, int i) {
        boolean z;
        if (!AbstractC81756W6u.LIZLLL(i)) {
            synchronized (this) {
                z = this.LJI;
            }
            if (z) {
                return;
            }
        } else if (!LJIIL()) {
            return;
        }
        this.LIZIZ.LIZIZ(i, c81392Vwy);
    }

    public final C81392Vwy<W5A> LJIILL(W5A w5a, java.util.Map<String, String> map) {
        C81392Vwy<Bitmap> process;
        W5C w5c = (W5C) w5a;
        Bitmap underlyingBitmap = w5c.getUnderlyingBitmap();
        VA3 va3 = this.LJ;
        if (va3 instanceof AbstractC78749UvR) {
            process = ((AbstractC78749UvR) va3).process(underlyingBitmap, this.LJIIJJI.LIZIZ, map);
        } else {
            process = va3.process(underlyingBitmap, this.LJIIJJI.LIZIZ);
        }
        try {
            return C81392Vwy.LJIIL(new W5C(process, w5a.getQualityInfo(), w5c.mRotationAngle, w5c.mExifOrientation, w5c.getRegionToDecode(), w5c.getSmartCrop(), w5c.getSampleSize()));
        } finally {
            C81392Vwy.LJ(process);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W76(W77 w77, W7F<C81392Vwy<W5A>> w7f, InterfaceC81754W6s interfaceC81754W6s, String str, VA3 va3, InterfaceC81770W7i interfaceC81770W7i) {
        super(w7f);
        this.LJIIJJI = w77;
        this.LIZJ = interfaceC81754W6s;
        this.LIZLLL = str;
        this.LJ = va3;
        this.LJFF = interfaceC81770W7i;
        interfaceC81770W7i.LIZLLL(new W7B(this));
    }
}
