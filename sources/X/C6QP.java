package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6QP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6QP implements C6SE {
    public final Context LIZ;
    public final FrameLayout LIZIZ;
    public final LifecycleOwner LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;
    public C6Q6 LJI;
    public final C62822Ol8 LJII;

    @Override // X.C6SE
    public final void LIZ(int i, boolean z) {
    }

    @Override // X.C6SE
    public final void LIZLLL() {
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

    public final C1NS<C6QX> LJI() {
        return (C1NS) this.LJFF.getValue();
    }

    @Override // X.C6SE
    public final void LIZIZ(int i) {
        C6QO LJJJ = C30581Hy.LJJJ(i, (List) this.LJ.getValue());
        if (LJJJ != null && LJJJ.LJIILLIIL()) {
            ((InterfaceC159886Pg) this.LIZLLL.getValue()).LJIILIIL(1);
        }
    }

    @Override // X.C6SE
    public final void LJIIJ(int i) {
        C6QO LJJJ = C30581Hy.LJJJ(i, (List) this.LJ.getValue());
        if (LJJJ != null && LJJJ.LJIILLIIL()) {
            LIZJ(i, 0.0f, 0.0f, false);
            ((InterfaceC159886Pg) this.LIZLLL.getValue()).LJIILJJIL(1);
        }
    }

    @Override // X.C6SE
    public final void LJIILIIL(int i, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
    }

    @Override // X.C6SE
    public final void LJIILL(float f, int i, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
    }

    public C6QP(Context context, FrameLayout stickerHigherContainer, LifecycleOwner lifecycleOwner, C160056Px stickerObjectContainer) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(stickerHigherContainer, "stickerHigherContainer");
        o.LJIIIZ(stickerObjectContainer, "stickerObjectContainer");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = context;
        this.LIZIZ = stickerHigherContainer;
        this.LIZJ = lifecycleOwner;
        this.LIZLLL = C221108m2.LIZIZ(new AqS152S0100000_2(stickerObjectContainer, 900));
        this.LJ = C221108m2.LIZIZ(new AqS152S0100000_2(stickerObjectContainer, 905));
        this.LJFF = C221108m2.LIZIZ(C6QW.LJLIL);
        this.LJII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 903));
    }

    public final void LIZJ(int i, float f, float f2, boolean z) {
        C6Q2 c6q2;
        C6QO LJJJ;
        C6Q2 c6q22;
        C6QO LJJJ2;
        C6Q2 c6q23;
        Object obj;
        this.LJII.getValue();
        if (z) {
            C6QX c6qx = LJI().LJ;
            c6qx.getClass();
            int i2 = c6qx.LJFF;
            int i3 = c6qx.LJI;
            if (new Rect(i2, i3, c6qx.LJII + i2, c6qx.LJIIIIZZ + i3).contains((int) f, (int) f2)) {
                C6Q6 c6q6 = this.LJI;
                if (c6q6 != null && (c6q23 = c6q6.LIZ.LJIIIZ) != null) {
                    Iterator it = ((ArrayList) c6q23.LIZ.LJIIJJI).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((C6QO) obj).LJJLIIIJLJLI() == i) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    C6QO c6qo = (C6QO) obj;
                    if (c6qo != null) {
                        c6qo.setAlpha(0.3137255f);
                    }
                }
                LJI().LJ(C6QS.LJLIL);
                return;
            }
            C6Q6 c6q62 = this.LJI;
            if (c6q62 != null && (c6q22 = c6q62.LIZ.LJIIIZ) != null && (LJJJ2 = C30581Hy.LJJJ(i, c6q22.LIZ.LJIIJJI)) != null) {
                LJJJ2.setAlpha(LJJJ2.LIZLLL());
            }
            LJI().LJ(C6QT.LJLIL);
            return;
        }
        Integer num = LJI().LJ.LIZIZ;
        if (num == null || num.intValue() != 2) {
            C6Q6 c6q63 = this.LJI;
            if (c6q63 != null && (c6q2 = c6q63.LIZ.LJIIIZ) != null && (LJJJ = C30581Hy.LJJJ(i, c6q2.LIZ.LJIIJJI)) != null) {
                LJJJ.setAlpha(LJJJ.LIZLLL());
            }
            LJI().LJ(C6QV.LJLIL);
            return;
        }
        C6Q6 c6q64 = this.LJI;
        if (c6q64 != null) {
            c6q64.LIZ(i, "SLIDE_UP");
        }
        LJI().LJ(C6QU.LJLIL);
    }

    @Override // X.C6SE
    public final void LJ(int i, float f, float f2, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
        C6QO LJJJ = C30581Hy.LJJJ(i, (List) this.LJ.getValue());
        if (LJJJ != null && LJJJ.LJIILLIIL()) {
            LIZJ(i, f, f2, true);
        }
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
