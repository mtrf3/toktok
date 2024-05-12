package X;

import android.graphics.RectF;
import android.view.MotionEvent;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6QN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6QN extends C6P6 implements C6SJ, C6SE {
    public final InterfaceC88472Yns<Integer, C76800UCe> LIZ;
    public final C62822Ol8 LIZIZ;
    public long LIZJ;
    public Integer LIZLLL;

    @Override // X.C6SE
    public final void LIZ(int i, boolean z) {
    }

    @Override // X.C6SE
    public final void LIZIZ(int i) {
    }

    @Override // X.C6SE
    public final void LIZLLL() {
    }

    @Override // X.C6SE
    public final void LJIIJ(int i) {
    }

    @Override // X.C6SE
    public final void LJIIJJI(int i) {
    }

    @Override // X.C6SE
    public final void LJIIL() {
    }

    @Override // X.C6SJ
    public final boolean LJIJ() {
        return true;
    }

    @Override // X.C6SE
    public final void LJJI(int i) {
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.LIZJ = 0L;
        return false;
    }

    public C6QN(C160056Px stickerObjectContainer, AqS168S0100000_2 aqS168S0100000_2) {
        o.LJIIIZ(stickerObjectContainer, "stickerObjectContainer");
        this.LIZ = aqS168S0100000_2;
        this.LIZIZ = C221108m2.LIZIZ(new AqS152S0100000_2(stickerObjectContainer, 933));
    }

    @Override // X.C6SE
    public final void LJIILIIL(int i, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
    }

    @Override // X.C6SJ
    public final boolean LJI(float f, int i, RectF targetRect) {
        o.LJIIIZ(targetRect, "targetRect");
        return false;
    }

    @Override // X.C6SJ
    public final boolean LJII(float f, int i, RectF targetRect) {
        o.LJIIIZ(targetRect, "targetRect");
        return false;
    }

    @Override // X.C6SE
    public final void LJIILL(float f, int i, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
    }

    @Override // X.C6SE
    public final void LJ(int i, float f, float f2, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
    }

    @Override // X.C6SJ
    public final boolean LIZJ(float f, float f2, int i, RectF rectF, EnumC157656Gr stickerType) {
        o.LJIIIZ(stickerType, "stickerType");
        C6QO LJJJ = C30581Hy.LJJJ(i, (List) this.LIZIZ.getValue());
        if (LJJJ == null || !LJJJ.LJ()) {
            return false;
        }
        this.LIZ.invoke(Integer.valueOf(i));
        return true;
    }

    @Override // X.C6SJ
    public final boolean LJIILJJIL(float f, float f2, int i, RectF rectF, EnumC157656Gr stickerType) {
        long currentTimeMillis;
        Integer num;
        o.LJIIIZ(stickerType, "stickerType");
        C6QO LJJJ = C30581Hy.LJJJ(i, (List) this.LIZIZ.getValue());
        if (LJJJ == null || !LJJJ.LJIIJ()) {
            return false;
        }
        if (System.currentTimeMillis() - this.LIZJ >= 3000 || (num = this.LIZLLL) == null || num.intValue() != i) {
            this.LIZLLL = Integer.valueOf(i);
            currentTimeMillis = System.currentTimeMillis();
        } else {
            this.LIZLLL = null;
            this.LIZ.invoke(Integer.valueOf(i));
            currentTimeMillis = 0;
        }
        this.LIZJ = currentTimeMillis;
        if (currentTimeMillis == 0) {
            return true;
        }
        return false;
    }

    @Override // X.C6SJ
    public final boolean LJIJJLI(float f, float f2, int i, RectF targetRect, EnumC157656Gr stickerType) {
        o.LJIIIZ(stickerType, "stickerType");
        o.LJIIIZ(targetRect, "targetRect");
        return false;
    }

    @Override // X.C6SE
    public final void LJFF(int i, EnumC157656Gr enumC157656Gr, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LJFF(enumC157656Gr, rectF);
    }

    @Override // X.C6SE
    public final void LJIILLIIL(int i, EnumC157656Gr enumC157656Gr, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LIZJ(enumC157656Gr, rectF);
    }

    @Override // X.C6SE
    public final void LJIL(int i, EnumC157656Gr enumC157656Gr, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LIZLLL(enumC157656Gr, rectF);
    }

    @Override // X.C6SE
    public final void LJJ(int i, EnumC157656Gr enumC157656Gr, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LJ(enumC157656Gr, rectF);
    }

    @Override // X.C6SE
    public final void LJIIIZ(int i, EnumC157656Gr enumC157656Gr, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LIZIZ(enumC157656Gr, motionEvent, motionEvent2, rectF);
    }

    @Override // X.C6SE
    public final void LJIJI(int i, EnumC157656Gr enumC157656Gr, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LIZ(enumC157656Gr, motionEvent, motionEvent2, rectF);
    }
}
