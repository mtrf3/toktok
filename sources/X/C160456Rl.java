package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS3S0200001_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Rl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160456Rl extends C6P6 implements C6SE {
    public final Context LIZ;
    public final FrameLayout LIZIZ;
    public final FrameLayout LIZJ;
    public final LifecycleOwner LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public XKQ LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;

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

    public final C1NS<C160496Rp> LJJIFFI() {
        return (C1NS) this.LJFF.getValue();
    }

    public final void LJJII() {
        LJJIFFI().LJ(new AqS7S0010000_2(51));
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onDown(MotionEvent event) {
        o.LJIIIZ(event, "event");
        this.LJIIIIZZ = LJJIFFI().LJ.LJLJJI;
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        XKQ xkq = this.LJII;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        LJJIFFI().LJ(C160506Rq.LJLIL);
        return this.LJIIIIZZ;
    }

    @Override // X.C6SE
    public final void LJIILIIL(int i, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
        XKQ xkq = this.LJII;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        LJJIFFI().LJ(C160596Rz.LJLIL);
    }

    @Override // X.C6SE
    public final void LJIILL(float f, int i, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
        XKQ xkq = this.LJII;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        LJJIFFI().LJ(C160586Ry.LJLIL);
    }

    @Override // X.C6SE
    public final void LJ(int i, float f, float f2, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
        XKQ xkq = this.LJII;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        LJJIFFI().LJ(C160576Rx.LJLIL);
    }

    public C160456Rl(Context context, FrameLayout stickerContainer, FrameLayout stickerHigherContainer, LifecycleOwner lifecycleOwner, C160056Px stickerObjectContainer) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(stickerContainer, "stickerContainer");
        o.LJIIIZ(stickerHigherContainer, "stickerHigherContainer");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(stickerObjectContainer, "stickerObjectContainer");
        this.LIZ = context;
        this.LIZIZ = stickerContainer;
        this.LIZJ = stickerHigherContainer;
        this.LIZLLL = lifecycleOwner;
        this.LJ = C221108m2.LIZIZ(new AqS152S0100000_2(stickerObjectContainer, 899));
        this.LJFF = C221108m2.LIZIZ(C160486Ro.LJLIL);
        this.LJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 898));
        this.LJIIIZ = -1;
        LJJIFFI().LIZ(new TBT() { // from class: X.6Rn
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C160496Rp) obj).LJLJJI);
            }
        }).LJIIIIZZ(lifecycleOwner, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 540));
    }

    @Override // X.C6SE
    public final void LJFF(int i, EnumC157656Gr enumC157656Gr, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LJFF(enumC157656Gr, rectF);
    }

    @Override // X.C6SE
    public final void LJIILLIIL(int i, EnumC157656Gr stickerType, float f, float f2, RectF visibleRect, float f3) {
        o.LJIIIZ(stickerType, "stickerType");
        o.LJIIIZ(visibleRect, "visibleRect");
        C6QO LJJJ = C30581Hy.LJJJ(i, (List) this.LJ.getValue());
        if (LJJJ != null && LJJJ.LJIIIIZZ()) {
            this.LJI.getValue();
            this.LJIIIZ = i;
            Rect rect = new Rect(this.LIZIZ.getLeft(), this.LIZIZ.getTop(), this.LIZJ.getRight() - this.LIZIZ.getRight(), this.LIZJ.getBottom() - this.LIZIZ.getBottom());
            visibleRect.left -= C74275TDb.LIZ(2.0f) + this.LIZIZ.getLeft();
            visibleRect.right = (C74275TDb.LIZ(2.0f) - this.LIZIZ.getLeft()) + visibleRect.right;
            visibleRect.top -= C74275TDb.LIZ(2.0f) + this.LIZIZ.getTop();
            visibleRect.bottom = (C74275TDb.LIZ(2.0f) - this.LIZIZ.getTop()) + visibleRect.bottom;
            LJJIFFI().LJ(new AqS3S0200001_2(rect, visibleRect, f3, 2));
            XKQ xkq = this.LJII;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            this.LJII = XKX.LIZLLL(C48841JEv.LIZIZ(), null, null, new C160466Rm(this, null), 3);
        }
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
