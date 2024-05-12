package X;

import Y.IDAListenerS144S0200000_2;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.65o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1547665o extends AbstractC56012Ht<C152015xt, C152065xy> {
    public Integer LJLJI;
    public int LJLJJL;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 343));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 342));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 341));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 344));

    public final C119464mU LLJILJIL() {
        return (C119464mU) this.LJLJJI.getValue();
    }

    public final C130965Ca LLJILJILJ() {
        return (C130965Ca) this.LJLILLLLZI.getValue();
    }

    public final View LLJJ() {
        return (View) this.LJLIL.getValue();
    }

    public final float LLJJIII() {
        return ((Number) this.LJLJJLL.getValue()).floatValue();
    }

    public final int LLJJI() {
        return LLJJ().getHeight();
    }

    public final void LLJJIJI(float f, float f2) {
        float f3 = f2 + this.LJLJJL;
        int i = (int) f;
        float f4 = 2;
        int i2 = (int) f3;
        LLJILJIL().layout((int) (i - (LLJILJIL().getWidth() / f4)), i2 - ((int) (LLJILJIL().getHeight() / f4)), ((int) (LLJILJIL().getWidth() / f4)) + i, ((int) (LLJILJIL().getHeight() / f4)) + i2);
        if (f3 < LLJJI() / 5) {
            LLJILJILJ().layout(i - ((int) (LLJILJILJ().getWidth() / f4)), (int) (LLJJIII() + (LLJILJIL().getHeight() / 2) + i2), i + ((int) (LLJILJILJ().getWidth() / f4)), (int) (LLJJIII() + (LLJILJIL().getHeight() / 2) + i2 + LLJILJILJ().getHeight()));
            LLJILJILJ().setRotationX(180.0f);
        } else {
            LLJILJILJ().layout(i - ((int) (LLJILJILJ().getWidth() / f4)), (int) (((i2 - (LLJILJIL().getHeight() / 2)) - LLJJIII()) - LLJILJILJ().getHeight()), i + ((int) (LLJILJILJ().getWidth() / f4)), (int) ((i2 - (LLJILJIL().getHeight() / 2)) - LLJJIII()));
            LLJILJILJ().setRotationX(0.0f);
        }
        getUiActions().LJLIL.invoke(new PointF(f, f3));
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        getUiActions().LJLJI.invoke(new C6P6() { // from class: X.65p
            @Override // X.C6P6, X.C6V2
            public final boolean LJJIIZI(MotionEvent event) {
                o.LJIIIZ(event, "event");
                C1547665o.this.getUiActions().LJLILLLLZI.invoke(Float.valueOf(event.getX()), Float.valueOf(event.getY() + C1547665o.this.LJLJJL));
                return true;
            }

            @Override // X.C6P6, X.C6V2
            public final boolean LJLI(C82537WaL c82537WaL) {
                if (c82537WaL == null) {
                    return false;
                }
                C1547665o.this.LLJJIJI(c82537WaL.LJI(), c82537WaL.LJII());
                return true;
            }

            @Override // X.C6P6, X.C6V2
            public final boolean onDown(MotionEvent motionEvent) {
                if (motionEvent == null) {
                    return false;
                }
                C1547665o c1547665o = C1547665o.this;
                c1547665o.getClass();
                if (motionEvent.getX() > 0.0f && motionEvent.getX() < c1547665o.LLJJ().getWidth() && motionEvent.getY() > 0.0f && motionEvent.getY() < c1547665o.LLJJI()) {
                    c1547665o.LLJJIJI(motionEvent.getX(), motionEvent.getY());
                }
                return true;
            }
        });
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5y4
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C152015xt) obj).LIZ;
            }
        }, null, new AqS168S0100000_2(this, 227), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5y1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C152015xt) obj).LIZJ);
            }
        }, null, new AqS168S0100000_2(this, 228), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5y3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C152015xt) obj).LIZIZ;
            }
        }, null, new AqS168S0100000_2(this, 229), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5y2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C152015xt) obj).LIZLLL;
            }
        }, null, new AqS168S0100000_2(this, 230), 2, null);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.jx, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }

    public static void LLJJIJIIJIL(C1547665o c1547665o, float f, float f2, float f3, AqS152S0100000_2 aqS152S0100000_2, AqS152S0100000_2 aqS152S0100000_22, int i) {
        float LLJJIII;
        float width;
        float f4 = f;
        AqS152S0100000_2 aqS152S0100000_23 = aqS152S0100000_2;
        AqS152S0100000_2 aqS152S0100000_24 = null;
        if ((i & 16) != 0) {
            aqS152S0100000_23 = null;
        }
        if ((i & 32) == 0) {
            aqS152S0100000_24 = aqS152S0100000_22;
        }
        if (f4 < 0.0f || f4 > c1547665o.LLJJI()) {
            f4 = c1547665o.LLJJI() / 2;
        }
        if (f4 < c1547665o.LLJJI() / 5) {
            LLJJIII = ((((c1547665o.LLJJIII() + c1547665o.LLJILJILJ().getHeight()) + c1547665o.LLJILJIL().getHeight()) / 2) - c1547665o.LLJILJIL().getWidth()) - c1547665o.LLJJIII();
        } else {
            LLJJIII = ((c1547665o.LLJJIII() + c1547665o.LLJILJILJ().getHeight()) + c1547665o.LLJILJIL().getHeight()) / 2;
        }
        float f5 = 2;
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, c1547665o.LLJILJILJ().getWidth() / f5, LLJJIII);
        scaleAnimation.setInterpolator(C55953Lxd.LJIIIIZZ());
        scaleAnimation.setDuration(200L);
        scaleAnimation.setAnimationListener(new IDAListenerS144S0200000_2(aqS152S0100000_23, aqS152S0100000_24, 0));
        c1547665o.LLJILJILJ().startAnimation(scaleAnimation);
        if (f4 < c1547665o.LLJJI() / 5) {
            width = ((c1547665o.LLJJIII() + c1547665o.LLJILJILJ().getHeight()) + c1547665o.LLJILJIL().getHeight()) / f5;
        } else {
            width = (c1547665o.LLJILJIL().getWidth() / 2) + (-LLJJIII);
        }
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(f2, f3, f2, f3, c1547665o.LLJILJIL().getWidth() / f5, width);
        scaleAnimation2.setInterpolator(C55953Lxd.LJIIIIZZ());
        scaleAnimation2.setDuration(200L);
        c1547665o.LLJILJIL().startAnimation(scaleAnimation2);
    }
}
