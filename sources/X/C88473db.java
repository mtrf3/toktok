package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3db, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88473db {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, EnumC88493dd type) {
        o.LJIIIZ(type, "type");
        if (view == null) {
            return;
        }
        final C68322mC c68322mC = new C68322mC();
        int i = C88483dc.LIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                C78897Uxp.LJJJJLI(view, null);
                return;
            }
            C78897Uxp.LJJJJL(view, C32151Nz.LJIIZILJ(28));
            return;
        }
        final float f = 0.0f;
        view.setOnTouchListener(new View.OnTouchListener() { // from class: X.3dU
            /* JADX WARN: Type inference failed for: r0v0, types: [T, android.graphics.drawable.Drawable] */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                Drawable colorDrawable;
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1 && action != 3) {
                        return false;
                    }
                    view2.setBackground(c68322mC.element);
                    return false;
                }
                c68322mC.element = view2.getBackground();
                Integer LIZIZ = C19N.LIZIZ(view2, "v.context", R.attr.dr);
                if (LIZIZ == null) {
                    return false;
                }
                float f2 = f;
                int intValue = LIZIZ.intValue();
                Context context = view2.getContext();
                o.LJIIIIZZ(context, "v.context");
                if (f2 > 0.0f) {
                    C110614Vt c110614Vt = new C110614Vt();
                    c110614Vt.LIZ = Integer.valueOf(intValue);
                    c110614Vt.LIZJ = Float.valueOf(f2);
                    colorDrawable = c110614Vt.LIZ(context);
                } else {
                    colorDrawable = new ColorDrawable(intValue);
                }
                view2.setBackground(colorDrawable);
                return false;
            }
        });
    }
}
