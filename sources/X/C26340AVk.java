package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AVk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26340AVk {
    public static final Rect LIZ = new Rect();

    public static final void LIZIZ(View view) {
        View.OnLayoutChangeListener onLayoutChangeListener;
        Object tag = view.getTag(R.id.lu3);
        if ((tag instanceof View.OnLayoutChangeListener) && (onLayoutChangeListener = (View.OnLayoutChangeListener) tag) != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        view.getOverlay().clear();
    }

    public static void LIZ(View view, int i) {
        String valueOf;
        float width;
        view.getOverlay().clear();
        Context context = view.getContext();
        o.LJIIIIZZ(context, "context");
        int LIZIZ = C7MY.LIZIZ(8);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.axg, R.attr.axh, R.attr.axi, R.attr.axj, R.attr.axk, R.attr.axl, R.attr.axm}, 0, R.style.ik);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…yle.LiveBadgeStyle,\n    )");
        C72770ShC c72770ShC = new C72770ShC(obtainStyledAttributes.getColor(5, -1), obtainStyledAttributes.getColor(0, -16777216), obtainStyledAttributes.getDimensionPixelSize(2, LIZIZ));
        obtainStyledAttributes.recycle();
        c72770ShC.LIZJ = 0;
        int i2 = 1;
        char c = 1;
        while (true) {
            i2 *= 10;
            if (c == 2) {
                break;
            } else {
                c = 2;
            }
        }
        int i3 = i2 - 1;
        if (i > i3) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(i3);
            LIZ2.append('+');
            valueOf = X1D.LIZIZ(LIZ2);
        } else {
            valueOf = String.valueOf(i);
        }
        o.LJIIIZ(valueOf, "<set-?>");
        c72770ShC.LJFF = valueOf;
        int length = valueOf.length();
        if (length != 0) {
            if (length != 1) {
                c72770ShC.LIZLLL = (int) Math.ceil(c72770ShC.LJIIL);
                c72770ShC.LJ = (int) Math.ceil((c72770ShC.LJIIL * 0.6666666666666666d) + c72770ShC.LJIIIIZZ.measureText(c72770ShC.LJFF));
            } else {
                c72770ShC.LJ = (int) Math.ceil(c72770ShC.LJIIL);
                c72770ShC.LIZLLL = (int) Math.ceil(c72770ShC.LJIIL);
            }
        } else {
            int i4 = c72770ShC.LIZJ;
            c72770ShC.LJ = i4;
            c72770ShC.LIZLLL = i4;
        }
        float LJIIZILJ = C32151Nz.LJIIZILJ(8);
        c72770ShC.LJII = 0.0f - LJIIZILJ;
        if (C26338AVi.LIZLLL(view)) {
            width = 0.0f - LJIIZILJ;
        } else {
            view.getDrawingRect(LIZ);
            width = ((r0.width() - 0.0f) - c72770ShC.LJ) + LJIIZILJ;
        }
        c72770ShC.LJI = width;
        View.OnLayoutChangeListener viewOnLayoutChangeListenerC26341AVl = new ViewOnLayoutChangeListenerC26341AVl(c72770ShC, view, 0.0f, LJIIZILJ);
        view.setTag(R.id.lu3, viewOnLayoutChangeListenerC26341AVl);
        view.addOnLayoutChangeListener(viewOnLayoutChangeListenerC26341AVl);
        view.getOverlay().add(c72770ShC);
    }
}
