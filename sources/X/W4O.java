package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes15.dex */
public final class W4O extends W4R<C81392Vwy<W5A>, InterfaceC81599W0t> {
    public static final Class<?> LJJIIZI = W4O.class;
    public final W4M LJIL;
    public final C65767PrX<W4N> LJJ;
    public final W6M<W6U, W5A> LJJI;
    public W6U LJJIFFI;
    public W4P<W4W<C81392Vwy<W5A>>> LJJII;
    public boolean LJJIII;
    public C65767PrX<W4N> LJJIIJ;
    public InterfaceC81391Vwx LJJIIJZLJL;
    public W4Q LJJIIZ;

    public final synchronized UF5 LJJIFFI() {
        C81390Vww c81390Vww;
        InterfaceC81391Vwx interfaceC81391Vwx = this.LJJIIJZLJL;
        if (interfaceC81391Vwx != null) {
            c81390Vww = new C81390Vww(this.LJIIIIZZ, interfaceC81391Vwx);
        } else {
            c81390Vww = null;
        }
        return c81390Vww;
    }

    public final synchronized void LJJIII() {
    }

    @Override // X.W4R
    public final C81392Vwy<W5A> LJFF() {
        W6U w6u;
        C81939WDv.LIZIZ();
        try {
            W6M<W6U, W5A> w6m = this.LJJI;
            if (w6m != null && (w6u = this.LJJIFFI) != null) {
                C81392Vwy<W5A> LJFF = w6m.LJFF(w6u);
                if (LJFF != null && !((W8A) LJFF.LJI().getQualityInfo()).LIZJ) {
                    LJFF.close();
                } else {
                    return LJFF;
                }
            }
            C81939WDv.LIZIZ();
            return null;
        } finally {
            C81939WDv.LIZIZ();
        }
    }

    @Override // X.W4R
    public final W4W<C81392Vwy<W5A>> LJII() {
        C81939WDv.LIZIZ();
        if (W58.LJIIJ(2)) {
            W58.LJIIJJI(LJJIIZI, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        W4W<C81392Vwy<W5A>> w4w = this.LJJII.get();
        C81939WDv.LIZIZ();
        return w4w;
    }

    @Override // X.W4R
    public final String toString() {
        C81254Vuk LIZIZ = C81256Vum.LIZIZ(this);
        LIZIZ.LIZIZ(super.toString(), "super");
        LIZIZ.LIZIZ(this.LJJII, "dataSourceSupplier");
        return LIZIZ.toString();
    }

    @Override // X.W4R, X.InterfaceC81252Vui
    public final void LIZIZ(InterfaceC81253Vuj interfaceC81253Vuj) {
        super.LIZIZ(interfaceC81253Vuj);
        LJJIIJZLJL(null);
    }

    @Override // X.W4R
    public final Drawable LJ(C81392Vwy<W5A> c81392Vwy) {
        C81392Vwy<W5A> c81392Vwy2 = c81392Vwy;
        try {
            C81939WDv.LIZIZ();
            C32151Nz.LJIIIZ(C81392Vwy.LJIIJJI(c81392Vwy2));
            W5A LJI = c81392Vwy2.LJI();
            LJJIIJZLJL(LJI);
            Drawable LJJIIJ = LJJIIJ(this.LJJIIJ, LJI);
            if (LJJIIJ == null && (LJJIIJ = LJJIIJ(this.LJJ, LJI)) == null) {
                if (!W5I.LIZ().LJIILIIL.LIZ) {
                    LJI.setSourceUri(null);
                }
                LJJIIJ = this.LJIL.LIZ(LJI, this.LJIIZILJ);
                if (LJJIIJ == null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Unrecognized image class: ");
                    LIZ.append(LJI);
                    throw new UnsupportedOperationException(X1D.LIZIZ(LIZ));
                }
            }
            return LJJIIJ;
        } finally {
            C81939WDv.LIZIZ();
        }
    }

    @Override // X.W4R
    public final int LJIIIZ(C81392Vwy<W5A> c81392Vwy) {
        C81392Vwy<W5A> c81392Vwy2 = c81392Vwy;
        if (c81392Vwy2 != null && c81392Vwy2.LJIIJ()) {
            return System.identityHashCode(c81392Vwy2.LJLILLLLZI.get());
        }
        return 0;
    }

    @Override // X.W4R
    public final InterfaceC81599W0t LJIIJ(Object obj) {
        C81392Vwy c81392Vwy = (C81392Vwy) obj;
        C32151Nz.LJIIIZ(C81392Vwy.LJIIJJI(c81392Vwy));
        return (InterfaceC81599W0t) c81392Vwy.LJI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.W4R
    public final void LJIJ(Drawable drawable) {
        if (drawable instanceof InterfaceC208628Gs) {
            ((InterfaceC208628Gs) drawable).LIZ();
        }
    }

    @Override // X.W4R
    public final void LJIJJ(C81392Vwy<W5A> c81392Vwy) {
        C81392Vwy.LJ(c81392Vwy);
    }

    public final synchronized void LJJI(InterfaceC81391Vwx interfaceC81391Vwx) {
        InterfaceC81391Vwx interfaceC81391Vwx2 = this.LJJIIJZLJL;
        if (interfaceC81391Vwx2 instanceof C81395Vx1) {
            ((C81395Vx1) interfaceC81391Vwx2).LIZIZ(interfaceC81391Vwx);
        } else if (interfaceC81391Vwx2 != null) {
            this.LJJIIJZLJL = new C81395Vx1(interfaceC81391Vwx2, interfaceC81391Vwx);
        } else {
            this.LJJIIJZLJL = interfaceC81391Vwx;
        }
    }

    public final void LJJIIJZLJL(W5A w5a) {
        InterfaceC78716Uuu interfaceC78716Uuu;
        String str;
        C79265V8z LIZ;
        if (!this.LJJIII) {
            return;
        }
        if (this.LJII == null) {
            C72766Sh8 c72766Sh8 = new C72766Sh8();
            C72767Sh9 c72767Sh9 = new C72767Sh9(c72766Sh8);
            this.LJJIIZ = new W4Q();
            LIZLLL(c72767Sh9);
            this.LJII = c72766Sh8;
            InterfaceC81691W4h interfaceC81691W4h = this.LJI;
            if (interfaceC81691W4h != null) {
                interfaceC81691W4h.LIZJ(c72766Sh8);
            }
        }
        if (this.LJJIIJZLJL == null) {
            LJJI(this.LJJIIZ);
        }
        Drawable drawable = this.LJII;
        if (drawable instanceof C72766Sh8) {
            C72766Sh8 c72766Sh82 = (C72766Sh8) drawable;
            String str2 = this.LJIIIIZZ;
            c72766Sh82.getClass();
            if (str2 == null) {
                str2 = LiveGiftNewGifterBadgeSetting.DEFAULT;
            }
            c72766Sh82.LJLIL = str2;
            c72766Sh82.invalidateSelf();
            InterfaceC81691W4h interfaceC81691W4h2 = this.LJI;
            if (interfaceC81691W4h2 != null && (LIZ = C79078V1u.LIZ(interfaceC81691W4h2.LIZ())) != null) {
                interfaceC78716Uuu = LIZ.LJLJJL;
            } else {
                interfaceC78716Uuu = null;
            }
            c72766Sh82.LJLJJL = interfaceC78716Uuu;
            int i = this.LJJIIZ.LIZ;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 6) {
                                str = "unknown";
                            } else {
                                str = "local";
                            }
                        } else {
                            str = "memory_bitmap";
                        }
                    } else {
                        str = "memory_encoded";
                    }
                } else {
                    str = "disk";
                }
            } else {
                str = "network";
            }
            c72766Sh82.LJZI = str;
            c72766Sh82.invalidateSelf();
            if (w5a != null) {
                int width = w5a.getWidth();
                int height = w5a.getHeight();
                c72766Sh82.LJLILLLLZI = width;
                c72766Sh82.LJLJI = height;
                c72766Sh82.invalidateSelf();
                c72766Sh82.LJLJJI = w5a.getSizeInBytes();
                return;
            }
            c72766Sh82.LJLILLLLZI = -1;
            c72766Sh82.LJLJI = -1;
            c72766Sh82.LJLJJI = -1;
            c72766Sh82.LJLJJLL = -1;
            c72766Sh82.LJLJL = -1;
            c72766Sh82.LJLIL = LiveGiftNewGifterBadgeSetting.DEFAULT;
            c72766Sh82.invalidateSelf();
            c72766Sh82.LJZ = -1L;
            c72766Sh82.LJZI = null;
            c72766Sh82.invalidateSelf();
        }
    }

    public static Drawable LJJIIJ(C65767PrX c65767PrX, W5A w5a) {
        Drawable LIZIZ;
        if (c65767PrX == null) {
            return null;
        }
        Iterator<E> it = c65767PrX.iterator();
        while (it.hasNext()) {
            W4N w4n = (W4N) it.next();
            if (w4n.LIZJ(w5a) && (LIZIZ = w4n.LIZIZ(w5a)) != null) {
                return LIZIZ;
            }
        }
        return null;
    }

    @Override // X.W4R
    public final void LJIILLIIL(Object obj, String str) {
        synchronized (this) {
            InterfaceC81391Vwx interfaceC81391Vwx = this.LJJIIJZLJL;
            if (interfaceC81391Vwx != null) {
                interfaceC81391Vwx.LIZ(5, str, true);
            }
            C81753W6r LJI = W8E.LJII().LJI().LJI(this.LJIJI, LJJIFFI());
            LJI.LJIIJ(this.LJIJI, null, "-1", false);
            LJI.LJIIIIZZ(this.LJIJI, "-1", false);
        }
    }

    public final void LJJII(W4P w4p, String str, W6U w6u, Object obj, W5O w5o) {
        C81939WDv.LIZIZ();
        this.LJIJI = w5o;
        LJIIJJI(obj, str);
        this.LJIJ = false;
        this.LJJII = w4p;
        LJJIIJZLJL(null);
        this.LJJIFFI = w6u;
        this.LJJIIJ = null;
        synchronized (this) {
            this.LJJIIJZLJL = null;
        }
        LJJIIJZLJL(null);
        LJJI(null);
        C81939WDv.LIZIZ();
    }

    public W4O(Resources resources, W4T w4t, W4N w4n, Executor executor, W6M<W6U, W5A> w6m, C65767PrX<W4N> c65767PrX) {
        super(w4t, executor);
        this.LJIL = new W4M(resources, w4n);
        this.LJJ = c65767PrX;
        this.LJJI = w6m;
    }
}
