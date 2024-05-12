package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.WeakHashMap;

/* renamed from: X.Aue, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27740Aue {
    public static final WeakHashMap<View, Long> LIZ = new WeakHashMap<>();

    public static Activity LIZ(Context context) {
        while (context != null) {
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            if (LJIJJ != null) {
                return LJIJJ;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static Activity LIZIZ(View view) {
        if (view != null) {
            for (Context context = view.getContext(); context != null; context = ((ContextWrapper) context).getBaseContext()) {
                Activity LJIJJ = C45804HyK.LJIJJ(context);
                if (LJIJJ != null) {
                    return LJIJJ;
                }
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
            }
        }
        return null;
    }

    public static Rect LIZLLL(View view) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
        return rect;
    }

    public static Boolean LJ(View view) {
        boolean z;
        if (view == null) {
            return Boolean.FALSE;
        }
        WeakHashMap<View, Long> weakHashMap = LIZ;
        Long l = weakHashMap.get(view);
        long nanoTime = System.nanoTime() / 1000000;
        if (l == null) {
            weakHashMap.put(view, Long.valueOf(nanoTime));
            return Boolean.FALSE;
        }
        if (nanoTime - l.longValue() <= 400) {
            z = true;
        } else {
            z = false;
            weakHashMap.put(view, Long.valueOf(nanoTime));
        }
        return Boolean.valueOf(z);
    }

    public static boolean LJFF(View view) {
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public static boolean LJI(View view) {
        Rect rect = new Rect();
        if (view != null && C16330kX.LIZIZ(view)) {
            View view2 = view;
            while (view2.getVisibility() == 0 && view2.getAlpha() >= 1.0E-6f) {
                if (view2.getId() != 16908290) {
                    Object parent = view2.getParent();
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    }
                }
                if (view.getGlobalVisibleRect(rect) && !rect.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void LJII(Activity activity) {
        if (Build.VERSION.SDK_INT >= 23) {
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | FileUtils.BUFFER_SIZE);
        }
    }

    public static void LJIIIIZZ(Activity activity) {
        Window window = activity.getWindow();
        if (window.getStatusBarColor() == 0) {
            return;
        }
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
        window.setStatusBarColor(0);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.8RM, android.graphics.drawable.GradientDrawable] */
    public static C8RM LIZJ(float f, int i) {
        float[] fArr = {f, f, f, f};
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float[] fArr2 = {f, fArr[0], f2, f2, f3, f3, f4, f4};
        ?? r0 = new GradientDrawable() { // from class: X.8RM
            @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }
        };
        r0.setColor(i);
        r0.setCornerRadii(fArr2);
        return r0;
    }

    public static void LJIIIZ(int i, View view) {
        if (view == null || view.getVisibility() == i) {
            return;
        }
        if (i == 0 && view.getAlpha() < Float.MIN_VALUE) {
            view.setAlpha(1.0f);
        }
        view.setVisibility(i);
    }

    public static void LJIIJ(boolean z, View... viewArr) {
        int i;
        for (View view : viewArr) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            LJIIIZ(i, view);
        }
    }

    public static void LJIIJJI(boolean z, View... viewArr) {
        int i;
        for (View view : viewArr) {
            if (view != null) {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }
    }
}
