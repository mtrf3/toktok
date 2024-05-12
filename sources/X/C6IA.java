package X;

import Y.ALAdapterS1S0200000_2;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.6IA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6IA {
    public static final float LIZ = C74275TDb.LIZ(18.0f);
    public static final int LIZIZ = (int) C74275TDb.LIZ(18.0f);

    public static int LIZJ(Context context) {
        int LIZLLL;
        float LIZIZ2;
        int i = C6IB.LIZJ;
        if (i >= 0) {
            return i;
        }
        int LIZIZ3 = C81184Vtc.LIZIZ(context);
        if (AnonymousClass668.LIZ()) {
            LIZLLL = C157226Fa.LIZ.LIZLLL();
        } else {
            LIZLLL = C157236Fb.LIZ.LIZLLL();
        }
        if (C81184Vtc.LJ(context) / (LIZIZ3 - LIZLLL) < 0.5625f) {
            if (C6IB.LIZLLL(context) >= C74275TDb.LIZ(52.0f) + C81184Vtc.LJFF(context)) {
                LIZIZ2 = C74275TDb.LIZIZ(context, 16.0f);
                int i2 = (int) LIZIZ2;
                C6IB.LIZJ = i2;
                return i2;
            }
        }
        LIZIZ2 = C74275TDb.LIZIZ(context, 62.0f);
        int i22 = (int) LIZIZ2;
        C6IB.LIZJ = i22;
        return i22;
    }

    public static int LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        return C6IB.LIZLLL(context);
    }

    public static void LJ(View view, boolean z) {
        int LIZJ;
        o.LJIIIZ(view, "view");
        float width = view.getWidth() * 0.67f;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) width, (int) (width / 0.75f));
        if (z) {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            int LIZJ2 = LIZJ(context);
            Context context2 = view.getContext();
            o.LJIIIIZZ(context2, "view.context");
            LIZJ = C6IB.LIZLLL(context2) + LIZJ2 + ((int) C74275TDb.LIZ(2.0f));
        } else {
            Context context3 = view.getContext();
            o.LJIIIIZZ(context3, "view.context");
            LIZJ = LIZJ(context3) + ((int) C74275TDb.LIZ(2.0f));
        }
        layoutParams.topMargin = LIZJ;
        if (C90193gN.LIZIZ(view.getContext())) {
            layoutParams.rightMargin = LIZIZ;
        } else {
            layoutParams.leftMargin = LIZIZ;
        }
        view.setLayoutParams(layoutParams);
        UC0.LJJJZ(view, LIZ);
        view.setVisibility(0);
    }

    public static void LJFF(View view, boolean z) {
        int i;
        o.LJIIIZ(view, "view");
        if (z) {
            i = (int) (C81184Vtc.LJ(view.getContext()) / 0.75f);
        } else {
            i = -1;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, i);
        if (z) {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            layoutParams.topMargin = C6IB.LIZLLL(context);
        }
        view.setLayoutParams(layoutParams);
        UC0.LJJJLZIJ(view, 0.08f);
    }

    public static void LJII(Context context, View layout) {
        o.LJIIIZ(layout, "layout");
        o.LJIIIZ(context, "context");
        ViewGroup.LayoutParams layoutParams = layout.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(0, C6IB.LIZLLL(context), 0, 0);
        layout.setLayoutParams(marginLayoutParams);
    }

    public static void LIZ(View view, long j, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(view, "<this>");
        if (view.getAlpha() > 0.0f) {
            view.setAlpha(0.0f);
        }
        C09K.LIZ(view, 1.0f, j).setListener(new ALAdapterS1S0200000_2(view, interfaceC65784Pro, 3)).start();
    }

    public static void LIZIZ(View view, long j, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(view, "<this>");
        if (view.getAlpha() < 1.0f) {
            view.setAlpha(1.0f);
        }
        C09K.LIZ(view, 0.0f, j).setListener(new ALAdapterS1S0200000_2(view, interfaceC65784Pro, 4)).start();
    }

    public static final void LJI(Context context, View surfaceView, boolean z) {
        o.LJIIIZ(surfaceView, "surfaceView");
        o.LJIIIZ(context, "context");
        int LIZLLL = C81184Vtc.LIZLLL(context);
        int LJ = C81184Vtc.LJ(context);
        float f = LJ / 0.75f;
        float LIZ2 = C74275TDb.LIZ(52.0f) + C81184Vtc.LJFF(context);
        if (z) {
            LIZ2 = (LIZLLL - f) / 2;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LJ, (int) f);
        layoutParams.setMargins(0, (int) LIZ2, 0, 0);
        surfaceView.setLayoutParams(layoutParams);
    }

    public static void LJIIIIZZ(Context context, View view, float f, int i, int i2, int i3, float f2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(view, "view");
        int i4 = ((int) f) + i3;
        int i5 = ((int) (f / 0.75f)) + i3;
        if (view.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            marginLayoutParams = new FrameLayout.LayoutParams(i4, i5);
        } else if (view.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            marginLayoutParams = new RelativeLayout.LayoutParams(i4, i5);
        } else {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(i4, i5);
        }
        marginLayoutParams.topMargin = i;
        if (C90193gN.LIZIZ(context)) {
            marginLayoutParams.rightMargin = i2;
        } else {
            marginLayoutParams.leftMargin = i2;
        }
        view.setLayoutParams(marginLayoutParams);
        UC0.LJJJZ(view, f2);
    }
}
