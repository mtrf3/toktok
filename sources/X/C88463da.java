package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3da */
/* loaded from: classes2.dex */
public final class C88463da {
    public static final C88463da LIZ = new C88463da();

    public final void LIZ(View view, EnumC1796673i type) {
        o.LJIIIZ(type, "type");
        LIZIZ(view, type, 0.0f, null);
    }

    public static void LIZIZ(View view, EnumC1796673i type, final float f, final InterfaceC88471Ynr interfaceC88471Ynr) {
        float f2;
        o.LJIIIZ(type, "type");
        if (view == null) {
            return;
        }
        final C68322mC c68322mC = new C68322mC();
        int i = C1796573h.LIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    if (i != 5) {
                        return;
                    }
                    Context context = view.getContext();
                    o.LJIIIIZZ(context, "context");
                    Float LJIIIZ = C79045V0n.LJIIIZ(context);
                    if (LJIIIZ != null) {
                        f2 = LJIIIZ.floatValue();
                    } else {
                        f2 = 0.2f;
                    }
                    view.setOnTouchListener(new View.OnTouchListener(f2, interfaceC88471Ynr) { // from class: X.2zV
                        public final float LJLIL;
                        public final InterfaceC88471Ynr<View, MotionEvent, Boolean> LJLILLLLZI;
                        public float LJLJI = 1.0f;

                        {
                            this.LJLIL = f2;
                            this.LJLILLLLZI = interfaceC88471Ynr;
                        }

                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View v, MotionEvent event) {
                            o.LJIIIZ(v, "v");
                            o.LJIIIZ(event, "event");
                            int action = event.getAction();
                            if (action != 0) {
                                if (action == 1 || action == 3) {
                                    v.animate().alpha(this.LJLJI).setDuration(0L).start();
                                }
                            } else {
                                this.LJLJI = v.getAlpha();
                                v.animate().alpha(this.LJLIL).setDuration(0L).start();
                            }
                            InterfaceC88471Ynr<View, MotionEvent, Boolean> interfaceC88471Ynr2 = this.LJLILLLLZI;
                            if (interfaceC88471Ynr2 != null) {
                                return interfaceC88471Ynr2.invoke(v, event).booleanValue();
                            }
                            return false;
                        }
                    });
                    return;
                }
                C78897Uxp.LJJJJLI(view, interfaceC88471Ynr);
                return;
            }
            if (f <= 0.0f) {
                f = C32151Nz.LJIIZILJ(36);
            }
            C78897Uxp.LJJJJL(view, f);
            return;
        }
        view.setOnTouchListener(new View.OnTouchListener() { // from class: X.3dZ
            /* JADX WARN: Type inference failed for: r0v0, types: [T, android.graphics.drawable.Drawable] */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View v, MotionEvent motionEvent) {
                Drawable colorDrawable;
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        v.setBackground(c68322mC.element);
                    }
                } else {
                    c68322mC.element = v.getBackground();
                    Integer LIZIZ = C19N.LIZIZ(v, "v.context", R.attr.dr);
                    if (LIZIZ != null) {
                        float f3 = f;
                        int intValue = LIZIZ.intValue();
                        Context context2 = v.getContext();
                        o.LJIIIIZZ(context2, "v.context");
                        if (f3 > 0.0f) {
                            C110614Vt c110614Vt = new C110614Vt();
                            c110614Vt.LIZ = Integer.valueOf(intValue);
                            c110614Vt.LIZJ = Float.valueOf(f3);
                            colorDrawable = c110614Vt.LIZ(context2);
                        } else {
                            colorDrawable = new ColorDrawable(intValue);
                        }
                        v.setBackground(colorDrawable);
                    }
                }
                InterfaceC88471Ynr<View, MotionEvent, Boolean> interfaceC88471Ynr2 = interfaceC88471Ynr;
                if (interfaceC88471Ynr2 != null) {
                    o.LJIIIIZZ(v, "v");
                    return interfaceC88471Ynr2.invoke(v, motionEvent).booleanValue();
                }
                return false;
            }
        });
    }

    public static /* synthetic */ void LIZJ(C88463da c88463da, View view, EnumC1796673i enumC1796673i, float f, int i) {
        if ((i & 4) != 0) {
            f = 0.0f;
        }
        c88463da.getClass();
        LIZIZ(view, enumC1796673i, f, null);
    }
}
