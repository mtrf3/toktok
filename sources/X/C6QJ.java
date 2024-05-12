package X;

import android.graphics.RectF;
import android.view.MotionEvent;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6QJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6QJ extends C6P6 implements C6SE {
    public final InterfaceC88472Yns<Integer, C76800UCe> LIZ;
    public long LIZIZ;

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

    @Override // X.C6SE
    public final void LJJI(int i) {
    }

    public C6QJ(AqS168S0100000_2 aqS168S0100000_2) {
        this.LIZ = aqS168S0100000_2;
    }

    @Override // X.C6SE
    public final void LJIILIIL(int i, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
    }

    @Override // X.C6SE
    public final void LJIILL(float f, int i, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
    }

    @Override // X.C6SE
    public final void LJ(int i, float f, float f2, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
    }

    @Override // X.C6SE
    public final void LJFF(int i, EnumC157656Gr enumC157656Gr, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LJFF(enumC157656Gr, rectF);
    }

    @Override // X.C6SE
    public final void LJIILLIIL(int i, EnumC157656Gr stickerType, float f, float f2, RectF visibleRect, float f3) {
        o.LJIIIZ(stickerType, "stickerType");
        o.LJIIIZ(visibleRect, "visibleRect");
        if (System.currentTimeMillis() - this.LIZIZ > 500) {
            this.LIZ.invoke(Integer.valueOf(i));
            this.LIZIZ = System.currentTimeMillis();
        }
    }

    @Override // X.C6SE
    public final void LJIL(int i, EnumC157656Gr stickerType, float f, float f2, RectF visibleRect, float f3) {
        o.LJIIIZ(stickerType, "stickerType");
        o.LJIIIZ(visibleRect, "visibleRect");
        if (System.currentTimeMillis() - this.LIZIZ > 500) {
            this.LIZ.invoke(Integer.valueOf(i));
            this.LIZIZ = System.currentTimeMillis();
        }
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
