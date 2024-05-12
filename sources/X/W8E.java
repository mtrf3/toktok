package X;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes15.dex */
public final class W8E {
    public static final Class<?> LJIJJLI = W8E.class;
    public static W8E LJIL;
    public static InterfaceC81842WAc LJJ;
    public final C81773W7l LIZ;
    public final W85 LIZIZ;
    public final W8C LIZJ;
    public W6X<W6U, W5A> LIZLLL;
    public W6K LJ;
    public W6X<W6U, InterfaceC81378Vwk> LJFF;
    public W6K LJI;
    public C81808W8u LJII;
    public InterfaceC81714W5e LJIIIIZZ;
    public InterfaceC81842WAc LJIIIZ;
    public W6J LJIIJ;
    public V8Z LJIIJJI;
    public W7L LJIIL;
    public W7K LJIILIIL;
    public C81808W8u LJIILJJIL;
    public HashMap<String, C81808W8u> LJIILL;
    public InterfaceC81714W5e LJIILLIIL;
    public HashMap<String, InterfaceC81714W5e> LJIIZILJ;
    public W8G LJIJ;
    public W8W LJIJI;
    public W86 LJIJJ;

    static {
        WCX.LJJIJ.getClass();
        LJIL = (W8E) WCX.LIZIZ.getValue();
    }

    public static W8E LJII() {
        W8E w8e = LJIL;
        C32151Nz.LJIIIIZZ(w8e, "ImagePipelineFactory was not initialized!");
        return w8e;
    }

    public final W86 LIZ() {
        if (this.LJIJJ == null) {
            LJIILLIIL();
            this.LJIJJ = W8P.LIZ(LJIIJ(), this.LIZIZ.LIZ().LIZ(), LIZIZ());
        }
        return this.LJIJJ;
    }

    public final W6X<W6U, W5A> LIZIZ() {
        if (this.LIZLLL == null) {
            LJIILLIIL();
            W4P w4p = (W4P) this.LIZIZ.LIZ().LIZ.LIZIZ.LIZ();
            WB6 wb6 = (WB6) this.LIZIZ.LIZ().LIZ.LJIILL.LIZ();
            W6X<W6U, W5A> w6x = new W6X<>(new C81741W6f(), (InterfaceC81739W6d) this.LIZIZ.LIZ().LIZ.LIZJ.LIZ(), w4p);
            wb6.LIZ(w6x);
            this.LIZLLL = w6x;
        }
        return this.LIZLLL;
    }

    public final W6K LIZJ() {
        if (this.LJ == null) {
            LJIILLIIL();
            W6X<W6U, W5A> LIZIZ = LIZIZ();
            InterfaceC81819W9f LIZLLL = this.LIZIZ.LIZ().LIZLLL();
            LIZLLL.LJI();
            this.LJ = new W6K(LIZIZ, new C81820W9g(LIZLLL));
        }
        return this.LJ;
    }

    public final HashMap<String, C81808W8u> LIZLLL() {
        if (this.LJIILL == null) {
            this.LJIILL = new HashMap<>();
            HashMap<String, InterfaceC81714W5e> LJ = LJ();
            for (String str : LJ.keySet()) {
                C81808W8u c81808W8u = new C81808W8u(LJ.get(str), this.LIZIZ.LIZ().LJI().LIZIZ(this.LIZIZ.LIZ().LJFF()), this.LIZIZ.LIZ().LJI().LIZJ(), this.LIZIZ.LIZ().LIZ().LIZIZ(), this.LIZIZ.LIZ().LIZ().LIZJ(), this.LIZIZ.LIZ().LIZLLL());
                ((HashMap) this.LIZIZ.LIZ().LIZ.LJJIIJ.LIZ()).get(str);
                this.LJIILL.put(str, c81808W8u);
            }
        }
        return this.LJIILL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final HashMap<String, InterfaceC81714W5e> LJ() {
        if (this.LJIIZILJ == null) {
            this.LJIIZILJ = new HashMap<>();
            HashMap hashMap = (HashMap) this.LIZIZ.LIZ().LIZ.LJJIIJ.LIZ();
            for (Object obj : hashMap.keySet()) {
                this.LJIIZILJ.put(obj, this.LIZIZ.LIZ().LIZJ().LIZ((W9L) hashMap.get(obj)));
            }
        }
        return this.LJIIZILJ;
    }

    public final W6K LJFF() {
        if (this.LJI == null) {
            LJIILLIIL();
            if (this.LJFF == null) {
                LJIILLIIL();
                W4P w4p = (W4P) this.LIZIZ.LIZ().LIZ.LJII.LIZ();
                WB6 wb6 = (WB6) this.LIZIZ.LIZ().LIZ.LJIILL.LIZ();
                W6X<W6U, InterfaceC81378Vwk> w6x = new W6X<>(new C78855Ux9(), new C81747W6l(), w4p);
                wb6.LIZ(w6x);
                this.LJFF = w6x;
            }
            W6X<W6U, InterfaceC81378Vwk> w6x2 = this.LJFF;
            InterfaceC81819W9f LIZLLL = this.LIZIZ.LIZ().LIZLLL();
            LIZLLL.LJIIIZ();
            this.LJI = new W6K(w6x2, new C81821W9h(LIZLLL));
        }
        return this.LJI;
    }

    public final W6J LJI() {
        InterfaceC81842WAc interfaceC81842WAc;
        InterfaceC81842WAc interfaceC81842WAc2;
        InterfaceC81842WAc interfaceC81842WAc3;
        InterfaceC81842WAc interfaceC81842WAc4;
        if (this.LJIIJ == null) {
            LJIILLIIL();
            LJIILLIIL();
            if (Build.VERSION.SDK_INT >= 24) {
                this.LIZIZ.LIZ().LIZIZ().getClass();
            }
            if (this.LJIILIIL == null) {
                ContentResolver contentResolver = C16880lQ.LLLLL((Context) this.LIZIZ.LIZ().LIZ.LJ.LIZ()).getContentResolver();
                if (this.LJIIL == null) {
                    LJIILLIIL();
                    C81865WAz c81865WAz = this.LIZIZ.LIZ().LIZIZ().LIZIZ;
                    Context context = (Context) this.LIZIZ.LIZ().LIZ.LJ.LIZ();
                    W8K LJI = this.LIZIZ.LIZ().LJI();
                    if (LJI.LJI == null) {
                        W8L w8l = LJI.LIZ;
                        LJI.LJI = new W8M(w8l.LIZLLL, w8l.LJI, w8l.LJII);
                    }
                    W8M w8m = LJI.LJI;
                    if (this.LJIIIZ == null) {
                        LJIILLIIL();
                        if (this.LIZIZ.LIZ().LIZ.LJIIJ.LIZ() != null) {
                            this.LJIIIZ = (InterfaceC81842WAc) this.LIZIZ.LIZ().LIZ.LJIIJ.LIZ();
                        } else {
                            W86 LIZ = LIZ();
                            if (LJJ == null) {
                                try {
                                    LJJ = (InterfaceC81842WAc) Class.forName("com.bytedance.fresco.heif.HeifDecoder$HeifFormatDecoder").getConstructor(W84.class).newInstance(this.LIZIZ.LIZ().LJI().LIZIZ(0));
                                } catch (Throwable unused) {
                                    interfaceC81842WAc = null;
                                }
                            }
                            interfaceC81842WAc = LJJ;
                            if (LIZ != null) {
                                interfaceC81842WAc2 = LIZ.getGifDecoder(Bitmap.Config.RGB_565);
                                interfaceC81842WAc3 = LIZ.getWebPDecoder(Bitmap.Config.RGB_565);
                                interfaceC81842WAc4 = LIZ.getHeifDecoder(Bitmap.Config.ARGB_8888);
                            } else {
                                interfaceC81842WAc2 = null;
                                interfaceC81842WAc3 = null;
                                interfaceC81842WAc4 = null;
                            }
                            if (this.LIZIZ.LIZ().LJ() == null) {
                                this.LJIIIZ = new C81792W8e(interfaceC81842WAc2, interfaceC81842WAc3, interfaceC81842WAc4, interfaceC81842WAc, LJIIJJI(), null);
                            } else {
                                this.LJIIIZ = new C81792W8e(interfaceC81842WAc2, interfaceC81842WAc3, interfaceC81842WAc4, interfaceC81842WAc, LJIIJJI(), this.LIZIZ.LIZ().LJ().LIZ);
                                C81802W8o LIZIZ = C81802W8o.LIZIZ();
                                LIZIZ.LIZIZ = this.LIZIZ.LIZ().LJ().LIZIZ;
                                LIZIZ.LIZJ();
                            }
                        }
                    }
                    InterfaceC81842WAc interfaceC81842WAc5 = this.LJIIIZ;
                    W8B w8b = (W8B) this.LIZIZ.LIZ().LIZ.LJIJJLI.LIZ();
                    boolean booleanValue = ((Boolean) this.LIZIZ.LIZ().LIZ.LJFF.LIZ()).booleanValue();
                    boolean booleanValue2 = ((Boolean) this.LIZIZ.LIZ().LIZ.LJJ.LIZ()).booleanValue();
                    this.LIZIZ.LIZ().LIZIZ().getClass();
                    W87 LIZ2 = this.LIZIZ.LIZ().LIZ();
                    W84 LIZIZ2 = this.LIZIZ.LIZ().LJI().LIZIZ(this.LIZIZ.LIZ().LJFF());
                    W6K LIZJ = LIZJ();
                    W6K LJFF = LJFF();
                    C81808W8u LJIIIIZZ = LJIIIIZZ();
                    C81808W8u LJIIL = LJIIL();
                    HashMap<String, C81808W8u> LIZLLL = LIZLLL();
                    W6O w6o = (W6O) this.LIZIZ.LIZ().LIZ.LIZLLL.LIZ();
                    AbstractC78853Ux7 LJIIJ = LJIIJ();
                    this.LIZIZ.LIZ().LIZIZ().getClass();
                    this.LIZIZ.LIZ().LIZIZ().getClass();
                    this.LIZIZ.LIZ().LIZIZ().getClass();
                    int i = this.LIZIZ.LIZ().LIZIZ().LIZ;
                    boolean z = this.LIZIZ.LIZ().LIZIZ().LIZLLL;
                    c81865WAz.getClass();
                    this.LJIIL = new W7L(context, w8m, interfaceC81842WAc5, w8b, booleanValue, booleanValue2, LIZ2, LIZIZ2, LIZJ, LJFF, LJIIIIZZ, LJIIL, LIZLLL, w6o, LJIIJ, i, z);
                }
                W7L w7l = this.LJIIL;
                QGQ qgq = (QGQ) this.LIZIZ.LIZ().LIZ.LJIIZILJ.LIZ();
                boolean booleanValue3 = ((Boolean) this.LIZIZ.LIZ().LIZ.LJJ.LIZ()).booleanValue();
                this.LIZIZ.LIZ().LIZIZ().getClass();
                W6T LIZ3 = this.LIZ.LIZ();
                boolean booleanValue4 = ((Boolean) this.LIZIZ.LIZ().LIZ.LJFF.LIZ()).booleanValue();
                this.LIZIZ.LIZ().LIZIZ().getClass();
                boolean booleanValue5 = ((Boolean) this.LIZIZ.LIZ().LIZ.LJJIII.LIZ()).booleanValue();
                if (this.LJIIJJI == null) {
                    LJIILLIIL();
                    if (this.LIZIZ.LIZ().LIZ.LJIIJJI.LIZ() == null && this.LIZIZ.LIZ().LIZ.LJIIL.LIZ() == null) {
                        this.LIZIZ.LIZ().LIZIZ().getClass();
                    }
                    int i2 = this.LIZIZ.LIZ().LIZIZ().LIZ;
                    this.LIZIZ.LIZ().LIZIZ().getClass();
                    this.LJIIJJI = new V8Z(i2, (InterfaceC79240V8a) this.LIZIZ.LIZ().LIZ.LJIIJJI.LIZ(), (Integer) this.LIZIZ.LIZ().LIZ.LJIIL.LIZ());
                }
                this.LJIILIIL = new W7K(contentResolver, w7l, qgq, booleanValue3, LIZ3, booleanValue4, booleanValue5, this.LJIIJJI);
            }
            W7K w7k = this.LJIILIIL;
            java.util.Set unmodifiableSet = Collections.unmodifiableSet((java.util.Set) this.LIZIZ.LIZ().LIZ.LJIL.LIZ());
            W4P w4p = (W4P) this.LIZIZ.LIZ().LIZ.LJIILIIL.LIZ();
            W6K LIZJ2 = LIZJ();
            W6K LJFF2 = LJFF();
            C81808W8u LJIIIIZZ2 = LJIIIIZZ();
            C81808W8u LJIIL2 = LJIIL();
            HashMap<String, C81808W8u> LIZLLL2 = LIZLLL();
            W6O w6o2 = (W6O) this.LIZIZ.LIZ().LIZ.LIZLLL.LIZ();
            W6T LIZ4 = this.LIZ.LIZ();
            C61094NyM c61094NyM = new C61094NyM(Boolean.FALSE);
            this.LIZIZ.LIZ().LIZIZ().getClass();
            this.LJIIJ = new W6J(w7k, unmodifiableSet, w4p, LIZJ2, LJFF2, LJIIIIZZ2, LJIIL2, LIZLLL2, w6o2, LIZ4, c61094NyM);
        }
        return this.LJIIJ;
    }

    public final C81808W8u LJIIIIZZ() {
        if (this.LJII == null) {
            LJIILLIIL();
            this.LJII = new C81808W8u(LJIIIZ(), this.LIZIZ.LIZ().LJI().LIZIZ(this.LIZIZ.LIZ().LJFF()), this.LIZIZ.LIZ().LJI().LIZJ(), this.LIZIZ.LIZ().LIZ().LIZIZ(), this.LIZIZ.LIZ().LIZ().LIZJ(), this.LIZIZ.LIZ().LIZLLL());
            this.LIZIZ.LIZ().LIZ.LJIILJJIL.LIZ().getClass();
            C81808W8u c81808W8u = this.LJII;
            this.LIZIZ.LIZ().LIZ.LJIILJJIL.LIZ().getClass();
            c81808W8u.getClass();
        }
        return this.LJII;
    }

    public final InterfaceC81714W5e LJIIIZ() {
        if (this.LJIIIIZZ == null) {
            LJIILLIIL();
            this.LJIIIIZZ = this.LIZIZ.LIZ().LIZJ().LIZ((W9L) this.LIZIZ.LIZ().LIZ.LJIILJJIL.LIZ());
        }
        return this.LJIIIIZZ;
    }

    public final AbstractC78853Ux7 LJIIJ() {
        if (this.LJIJ == null) {
            LJIILLIIL();
            W8K LJI = this.LIZIZ.LIZ().LJI();
            LJIIJJI();
            this.LJIJ = new W8G(LJI.LIZ());
        }
        return this.LJIJ;
    }

    public final W95 LJIIJJI() {
        W8W w9c;
        if (this.LJIJI == null) {
            LJIILLIIL();
            W8K LJI = this.LIZIZ.LIZ().LJI();
            this.LIZIZ.LIZ().LIZIZ().getClass();
            boolean z = this.LIZIZ.LIZ().LIZIZ().LIZJ;
            int i = Build.VERSION.SDK_INT;
            if (i == 28) {
                if (z) {
                    int i2 = LJI.LIZ.LIZJ.LIZLLL;
                    w9c = new W8O(LJI.LIZ(), i2, new C43051mX(i2));
                    this.LJIJI = w9c;
                }
                int i3 = LJI.LIZ.LIZJ.LIZLLL;
                w9c = new W8V(LJI.LIZ(), i3, new C43051mX(i3));
                this.LJIJI = w9c;
            } else {
                if (i < 26) {
                    int i4 = LJI.LIZ.LIZJ.LIZLLL;
                    w9c = new W9C(LJI.LIZ(), i4, new C43051mX(i4));
                    this.LJIJI = w9c;
                }
                int i32 = LJI.LIZ.LIZJ.LIZLLL;
                w9c = new W8V(LJI.LIZ(), i32, new C43051mX(i32));
                this.LJIJI = w9c;
            }
        }
        return this.LJIJI;
    }

    public final C81808W8u LJIIL() {
        if (this.LJIILJJIL == null) {
            LJIILLIIL();
            this.LJIILJJIL = new C81808W8u(LJIILIIL(), this.LIZIZ.LIZ().LJI().LIZIZ(this.LIZIZ.LIZ().LJFF()), this.LIZIZ.LIZ().LJI().LIZJ(), this.LIZIZ.LIZ().LIZ().LIZIZ(), this.LIZIZ.LIZ().LIZ().LIZJ(), this.LIZIZ.LIZ().LIZLLL());
            this.LIZIZ.LIZ().LIZ.LJIILJJIL.LIZ().getClass();
            C81808W8u c81808W8u = this.LJIILJJIL;
            this.LIZIZ.LIZ().LIZ.LJIILJJIL.LIZ().getClass();
            c81808W8u.getClass();
        }
        return this.LJIILJJIL;
    }

    public final InterfaceC81714W5e LJIILIIL() {
        if (this.LJIILLIIL == null) {
            LJIILLIIL();
            this.LJIILLIIL = this.LIZIZ.LIZ().LIZJ().LIZ((W9L) this.LIZIZ.LIZ().LIZ.LJJI.LIZ());
        }
        return this.LJIILLIIL;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.W6T, T] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.W9G, T, java.lang.Object] */
    public final void LJIILLIIL() {
        if (this.LIZIZ != null) {
            return;
        }
        synchronized (this) {
            if (this.LIZIZ != null) {
                return;
            }
            C81939WDv.LIZIZ();
            ?? LIZ = this.LIZJ.LIZ();
            LIZ.getClass();
            this.LIZ.LIZIZ = new W6T(LIZ.LIZ().LIZLLL());
            C81939WDv.LIZIZ();
            this.LIZIZ.LIZIZ = LIZ;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.W6T, T] */
    public W8E(W9G w9g) {
        C81773W7l c81773W7l = new C81773W7l(this);
        this.LIZ = c81773W7l;
        W85 w85 = new W85(this);
        this.LIZIZ = w85;
        C81939WDv.LIZIZ();
        w9g.getClass();
        w85.LIZIZ = w9g;
        c81773W7l.LIZIZ = new W6T(w9g.LIZ().LIZLLL());
        C81939WDv.LIZIZ();
    }

    public static synchronized void LJIILJJIL(Context context) {
        synchronized (W8E.class) {
            C81939WDv.LIZIZ();
            LJIILL(new W9G(W9G.LJII(context)));
            C81939WDv.LIZIZ();
        }
    }

    public static synchronized void LJIILL(W9G w9g) {
        synchronized (W8E.class) {
            if (LJIL != null) {
                W58.LJIILL(LJIJJLI, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            LJIL = new W8E(w9g);
        }
    }

    public W8E(C81716W5g c81716W5g) {
        this.LIZ = new C81773W7l(this);
        this.LIZIZ = new W85(this);
        this.LIZJ = c81716W5g;
    }
}
