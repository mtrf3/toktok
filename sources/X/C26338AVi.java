package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AVi */
/* loaded from: classes5.dex */
public final class C26338AVi {
    public static final Rect LIZ = new Rect();

    public static final void LIZIZ(View view) {
        View.OnLayoutChangeListener onLayoutChangeListener;
        Object tag = view.getTag(R.id.lu3);
        if ((tag instanceof View.OnLayoutChangeListener) && (onLayoutChangeListener = (View.OnLayoutChangeListener) tag) != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        view.getOverlay().clear();
    }

    public static final boolean LIZJ(Context context) {
        o.LJIIIZ(context, "<this>");
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL(View view) {
        o.LJIIIZ(view, "<this>");
        if (C16310kV.LIZLLL(view) == 1) {
            return true;
        }
        return false;
    }

    public static final LayerDrawable LJIIJ(Drawable drawable, Drawable backgroundDrawable) {
        o.LJIIIZ(drawable, "<this>");
        o.LJIIIZ(backgroundDrawable, "backgroundDrawable");
        return new LayerDrawable(new Drawable[]{backgroundDrawable, drawable});
    }

    public static final void LIZ(View view, int i, int i2, int i3, float f, float f2) {
        float LJIIZILJ;
        float width;
        view.getOverlay().clear();
        Context context = view.getContext();
        o.LJIIIIZZ(context, "context");
        C72769ShB LJJIJIIJI = C78977Uz7.LJJIJIIJI(context, null, 62);
        LJJIJIIJI.LIZJ = i2;
        String LJJJLZIJ = C78977Uz7.LJJJLZIJ(i, 2, i3);
        o.LJIIIZ(LJJJLZIJ, "<set-?>");
        LJJIJIIJI.LJFF = LJJJLZIJ;
        LJJIJIIJI.LIZ();
        if (i == 0) {
            LJIIZILJ = i2 / 2.0f;
        } else {
            LJIIZILJ = C32151Nz.LJIIZILJ(6);
        }
        LJJIJIIJI.LJII = f - LJIIZILJ;
        if (LIZLLL(view)) {
            width = f2 - LJIIZILJ;
        } else {
            view.getDrawingRect(LIZ);
            width = ((r0.width() - f2) - LJJIJIIJI.LJ) + LJIIZILJ;
        }
        LJJIJIIJI.LJI = width;
        View.OnLayoutChangeListener viewOnLayoutChangeListenerC26339AVj = new ViewOnLayoutChangeListenerC26339AVj(LJJIJIIJI, view, f2, LJIIZILJ);
        view.setTag(R.id.lu3, viewOnLayoutChangeListenerC26339AVj);
        view.addOnLayoutChangeListener(viewOnLayoutChangeListenerC26339AVj);
        view.getOverlay().add(LJJIJIIJI);
    }

    public static final void LJ(View view, Integer num, Integer num2, Integer num3, Integer num4, boolean z) {
        o.LJIIIZ(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "context");
            LJFF((ViewGroup.MarginLayoutParams) layoutParams, context, num, num2, num3, num4, z);
        }
        view.setLayoutParams(layoutParams);
    }

    public static final void LJIIIIZZ(View view, Integer num, Integer num2, Integer num3, Integer num4, boolean z) {
        boolean z2;
        int paddingLeft;
        int paddingTop;
        int paddingRight;
        int paddingBottom;
        o.LJIIIZ(view, "<this>");
        if ((num != null || num3 != null) && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (num != null) {
            paddingLeft = num.intValue();
        } else {
            paddingLeft = view.getPaddingLeft();
        }
        if (num2 != null) {
            paddingTop = num2.intValue();
        } else {
            paddingTop = view.getPaddingTop();
        }
        if (num3 != null) {
            paddingRight = num3.intValue();
        } else {
            paddingRight = view.getPaddingRight();
        }
        if (num4 != null) {
            paddingBottom = num4.intValue();
        } else {
            paddingBottom = view.getPaddingBottom();
        }
        if (z2 && C72704Sg8.LIZIZ(view, "context")) {
            view.setPadding(paddingRight, paddingTop, paddingLeft, paddingBottom);
        } else {
            view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
    }

    public static /* synthetic */ void LJIIIZ(View view, Integer num, Integer num2, Integer num3, Integer num4, int i) {
        boolean z;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        if ((i & 8) != 0) {
            num4 = null;
        }
        if ((i & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        LJIIIIZZ(view, num, num2, num3, num4, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(android.view.ViewGroup.MarginLayoutParams r2, android.content.Context r3, java.lang.Integer r4, java.lang.Integer r5, java.lang.Integer r6, java.lang.Integer r7, boolean r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            java.lang.String r0 = "ctx"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            if (r4 != 0) goto Le
            if (r6 == 0) goto L5f
        Le:
            if (r8 == 0) goto L5f
            r1 = 1
            boolean r0 = LIZJ(r3)
            if (r0 == 0) goto L60
            if (r4 == 0) goto L1f
            int r0 = r4.intValue()
            r2.rightMargin = r0
        L1f:
            if (r6 == 0) goto L27
            int r0 = r6.intValue()
            r2.leftMargin = r0
        L27:
            if (r5 == 0) goto L2f
            int r0 = r5.intValue()
            r2.topMargin = r0
        L2f:
            if (r7 == 0) goto L37
            int r0 = r7.intValue()
            r2.bottomMargin = r0
        L37:
            if (r1 == 0) goto L4c
            if (r4 == 0) goto L42
            int r0 = r4.intValue()
            r2.setMarginStart(r0)
        L42:
            if (r6 == 0) goto L4b
            int r0 = r6.intValue()
            r2.setMarginEnd(r0)
        L4b:
            return
        L4c:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == 0) goto L56
            r4.intValue()
            r2.setMarginStart(r0)
        L56:
            if (r6 == 0) goto L4b
            r6.intValue()
            r2.setMarginEnd(r0)
            goto L4b
        L5f:
            r1 = 0
        L60:
            if (r4 == 0) goto L68
            int r0 = r4.intValue()
            r2.leftMargin = r0
        L68:
            if (r6 == 0) goto L27
            int r0 = r6.intValue()
            r2.rightMargin = r0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26338AVi.LJFF(android.view.ViewGroup$MarginLayoutParams, android.content.Context, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, boolean):void");
    }

    public static /* synthetic */ void LJI(View view, Integer num, Integer num2, Integer num3, Integer num4, boolean z, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        if ((i & 8) != 0) {
            num4 = null;
        }
        if ((i & 16) != 0) {
            z = true;
        }
        LJ(view, num, num2, num3, num4, z);
    }

    public static /* synthetic */ void LJII(ViewGroup.MarginLayoutParams marginLayoutParams, Context context, Integer num, Integer num2, Integer num3, Integer num4, int i) {
        boolean z;
        Integer num5 = num3;
        Integer num6 = num;
        Integer num7 = num2;
        Integer num8 = null;
        if ((i & 2) != 0) {
            num6 = null;
        }
        if ((i & 4) != 0) {
            num7 = null;
        }
        if ((i & 8) != 0) {
            num5 = null;
        }
        if ((i & 16) == 0) {
            num8 = num4;
        }
        if ((i & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        LJFF(marginLayoutParams, context, num6, num7, num5, num8, z);
    }
}
