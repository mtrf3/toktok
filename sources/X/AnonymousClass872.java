package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import defpackage.g0;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.872, reason: invalid class name */
/* loaded from: classes4.dex */
public class AnonymousClass872 extends X3I {
    public static final /* synthetic */ int LJIILIIL = 0;
    public View LIZIZ;
    public View LIZJ;
    public View LIZLLL;
    public View LJ;
    public View LJFF;
    public View LJI;
    public View LJII;
    public View LJIIIIZZ;
    public View LJIIIZ;
    public View LJIIJ;
    public View LJIIJJI;
    public View LJIIL;

    public AnonymousClass872() {
        super(1);
    }

    static {
        int i;
        if (!C8D3.LIZJ()) {
            i = 16;
        } else {
            i = 12;
        }
        O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i)));
    }

    public static void LIZIZ(View view) {
        if (view == null) {
            return;
        }
        int i = view.getLayoutParams().width;
        int i2 = view.getLayoutParams().height;
        if (i > 0 && i % 2 == 0) {
            i++;
        }
        if (i2 > 0 && i2 % 2 == 0) {
            i2++;
        }
        g0.LJJIJIIJI(i, i2, view);
    }

    public final void LIZ(InterfaceC88472Yns<? super View, C76800UCe> block) {
        o.LJIIIZ(block, "block");
        View view = this.LJI;
        if (view != null) {
            block.invoke(view);
        }
        View view2 = this.LJIIL;
        if (view2 != null) {
            block.invoke(view2);
        }
    }

    public void LIZJ(C202067wQ itemSize) {
        View view;
        Context context;
        o.LJIIIZ(itemSize, "itemSize");
        if (C202677xP.LIZIZ()) {
            C204257zx.LJI("avatar helper, hot changed, has setOnTouchListener");
            View view2 = this.LIZIZ;
            if (view2 != null) {
                view2.setOnTouchListener(new View.OnTouchListener() { // from class: X.876
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view3, MotionEvent motionEvent) {
                        return true;
                    }
                });
            }
        }
        if (itemSize.LJLJL) {
            C204257zx.LJI("avatar helper, small screen");
            View view3 = this.LIZJ;
            if (view3 != null) {
                g0.LJJIJIIJI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(itemSize.LJLIL))), -2, view3);
                C26338AVi.LJI(view3, C65429Pm5.LIZIZ(itemSize.LJLJI), null, C65429Pm5.LIZIZ(itemSize.LJLJJI), null, false, 26);
            }
            View view4 = this.LJII;
            if (view4 != null) {
                g0.LJJIJIIJI(C7MY.LIZIZ(45), O6R.LJJIIZ(C32151Nz.LJIIZILJ(45)), view4);
                C26338AVi.LJIIIZ(view4, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(2.5f)))), C65429Pm5.LIZIZ(2.5f), C65429Pm5.LIZIZ(2.5f), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(2.5f)))), 16);
            }
            View view5 = this.LJIIJJI;
            if (view5 != null) {
                g0.LJJIJIIJI(C7MY.LIZIZ(45), O6R.LJJIIZ(C32151Nz.LJIIZILJ(45)), view5);
            }
            View view6 = this.LJIIIIZZ;
            if (view6 != null) {
                g0.LJJIJIIJI(C7MY.LIZIZ(53), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(26.5f))), view6);
            }
            View view7 = this.LJIIIZ;
            if (view7 != null) {
                g0.LJJIJIIJI(C7MY.LIZIZ(40), O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)), view7);
            }
            View view8 = this.LJIIJ;
            if (view8 != null) {
                g0.LJJIJIIJI(C278817o.LIZ(41.5f), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(37.5f))), view8);
            }
            View view9 = this.LJ;
            if (view9 != null) {
                g0.LJJIJIIJI(C7MY.LIZIZ(20), O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)), view9);
            }
            LIZ(new AqS169S0100000_3(itemSize, 690));
            View view10 = this.LJFF;
            if (view10 != null) {
                g0.LJJIJIIJI(C278817o.LIZ(itemSize.LJLIL), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(itemSize.LJLIL))), view10);
                C26338AVi.LJI(view10, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(3))), null, null, false, 29);
            }
            if (AnonymousClass878.LIZ()) {
                View view11 = this.LIZLLL;
                if (view11 != null) {
                    C26338AVi.LJIIIZ(view11, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(itemSize.LJLJJL)))), 23);
                    g0.LJJIJIIJI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(52)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(30)), view11);
                    C26338AVi.LJI(view11, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(40))), null, null, false, 29);
                }
            } else {
                int LIZIZ = C7MY.LIZIZ(50);
                if (this.LIZ && !C202677xP.LIZ()) {
                    LIZIZ = C7MY.LIZIZ(52);
                }
                View view12 = this.LIZLLL;
                if (view12 != null) {
                    C26338AVi.LJIIIZ(view12, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(itemSize.LJLJJL)))), 23);
                    g0.LJJIJIIJI(LIZIZ, -2, view12);
                    C26338AVi.LJI(view12, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(40))), null, null, false, 29);
                }
            }
        } else {
            C204257zx.LJI("avatar helper, big screen");
            View view13 = this.LIZJ;
            if (view13 != null) {
                C26338AVi.LJI(view13, C65429Pm5.LIZIZ(itemSize.LJLJI), null, C65429Pm5.LIZIZ(itemSize.LJLJJI), null, false, 26);
                if (!C202677xP.LIZ()) {
                    g0.LJJIJIIJI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(60)), -2, view13);
                }
            }
            LIZ(new AqS169S0100000_3(itemSize, 689));
            View view14 = this.LJFF;
            if (view14 != null) {
                g0.LJJIJIIJI(C278817o.LIZ(itemSize.LJLIL), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(itemSize.LJLIL))), view14);
            }
            View view15 = this.LJI;
            if (view15 != null && (context = view15.getContext()) != null && !C79004UzY.LJJIJIIJI(context)) {
                View view16 = this.LJIIL;
                if (view16 != null) {
                    C26338AVi.LJI(view16, null, null, null, AnonymousClass391.LIZJ(10), false, 23);
                }
                View view17 = this.LJIIJJI;
                if (view17 != null) {
                    C26338AVi.LJI(view17, null, null, null, AnonymousClass391.LIZJ(7), false, 23);
                }
            }
            if (!C202677xP.LIZ()) {
                float f = itemSize.LJLILLLLZI;
                float f2 = (f / 48.0f) * 54.0f;
                float f3 = 48.0f - f;
                View view18 = this.LJIIIZ;
                if (view18 != null) {
                    g0.LJJIJIIJI(C278817o.LIZ(f), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(itemSize.LJLILLLLZI))), view18);
                }
                View view19 = this.LJII;
                if (view19 != null) {
                    g0.LJJIJIIJI(C278817o.LIZ(f2), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(f2))), view19);
                }
                View view20 = this.LJIIJJI;
                if (view20 != null) {
                    g0.LJJIJIIJI(C278817o.LIZ(f2), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(f2))), view20);
                }
                View view21 = this.LJIIIIZZ;
                if (view21 != null) {
                    g0.LJJIJIIJI(C278817o.LIZ(itemSize.LJLIL), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(itemSize.LJLIL))) / 2, view21);
                }
                if (C202677xP.LIZIZ() && (view = this.LJIIIIZZ) != null) {
                    C26338AVi.LJIIIZ(view, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(3))), null, null, 29);
                }
                View view22 = this.LJFF;
                if (view22 != null) {
                    C26338AVi.LJI(view22, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(4 + f3)))), null, null, false, 29);
                }
            }
            if (AnonymousClass878.LIZ()) {
                View view23 = this.LJ;
                if (view23 != null) {
                    C26338AVi.LJI(view23, 0, AnonymousClass391.LIZJ(2), 0, 0, false, 16);
                }
                View view24 = this.LIZLLL;
                if (view24 != null) {
                    C26338AVi.LJIIIZ(view24, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(itemSize.LJLJJL)))), 23);
                    g0.LJJIJIIJI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(60)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)), view24);
                    C26338AVi.LJI(view24, 0, AnonymousClass391.LIZJ(46), 0, AnonymousClass391.LIZJ(1), false, 16);
                }
            } else {
                View view25 = this.LIZLLL;
                if (view25 != null) {
                    C26338AVi.LJIIIZ(view25, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(itemSize.LJLJJL)))), 23);
                }
            }
        }
        LIZIZ(this.LIZJ);
        LIZIZ(this.LJFF);
        LIZIZ(this.LJI);
        LIZIZ(this.LJIIL);
        LIZIZ(this.LJIIJJI);
        LIZIZ(this.LJII);
        LIZIZ(this.LJIIIZ);
        LIZIZ(this.LJIIJ);
        LIZIZ(this.LIZLLL);
        LIZIZ(this.LJ);
        LIZIZ(this.LJIIIIZZ);
    }
}
