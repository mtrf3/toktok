package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.0P1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0P1 {
    public static C0PI LIZ(View view) {
        C0PI c0pi = null;
        if (Build.VERSION.SDK_INT >= 23) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C0PI LIZJ = C0PI.LIZJ(null, rootWindowInsets);
            LIZJ.LIZ.LJIILL(LIZJ);
            LIZJ.LIZ.LIZLLL(view.getRootView());
            return LIZJ;
        }
        if (!C0PB.LIZLLL || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = C0PB.LIZ.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) C0PB.LIZIZ.get(obj);
            Rect rect2 = (Rect) C0PB.LIZJ.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            C0PC c0pc = new C0PC();
            c0pc.LIZ.LJ(C06920Oy.LIZJ(rect));
            c0pc.LIZ.LJI(C06920Oy.LIZJ(rect2));
            C0PI LIZIZ = c0pc.LIZ.LIZIZ();
            LIZIZ.LIZ.LJIILL(LIZIZ);
            LIZIZ.LIZ.LIZLLL(view.getRootView());
            c0pi = LIZIZ;
            return c0pi;
        } catch (IllegalAccessException unused) {
            return c0pi;
        }
    }

    public static void LIZIZ(final View view, final C0PF c0pf) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.l09, c0pf);
        }
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: X.0P0
            public C0PI LIZ;

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                C0PI LIZJ = C0PI.LIZJ(view2, windowInsets);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    View view3 = view;
                    View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view3.getTag(R.id.l0m);
                    if (onApplyWindowInsetsListener != null) {
                        onApplyWindowInsetsListener.onApplyWindowInsets(view3, windowInsets);
                    }
                    if (LIZJ.equals(this.LIZ)) {
                        return c0pf.LIZ(view2, LIZJ).LIZIZ();
                    }
                }
                this.LIZ = LIZJ;
                C0PI LIZ = c0pf.LIZ(view2, LIZJ);
                if (i >= 30) {
                    return LIZ.LIZIZ();
                }
                view2.requestApplyInsets();
                return LIZ.LIZIZ();
            }
        });
    }

    public static void LIZJ(View view, final C0P4 c0p4) {
        WindowInsetsAnimation.Callback callback = null;
        if (Build.VERSION.SDK_INT >= 30) {
            if (c0p4 != null) {
                callback = new WindowInsetsAnimation.Callback(c0p4) { // from class: X.0P8
                    public final C0P4 LIZ;
                    public List<C0PA> LIZIZ;
                    public ArrayList<C0PA> LIZJ;
                    public final HashMap<WindowInsetsAnimation, C0PA> LIZLLL;

                    {
                        super(c0p4.LIZIZ);
                        this.LIZLLL = new HashMap<>();
                        this.LIZ = c0p4;
                    }

                    public final C0PA LIZ(WindowInsetsAnimation windowInsetsAnimation) {
                        C0PA c0pa = this.LIZLLL.get(windowInsetsAnimation);
                        if (c0pa == null) {
                            C0PA c0pa2 = new C0PA(windowInsetsAnimation);
                            this.LIZLLL.put(windowInsetsAnimation, c0pa2);
                            return c0pa2;
                        }
                        return c0pa;
                    }

                    @Override // android.view.WindowInsetsAnimation.Callback
                    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                        this.LIZ.LIZIZ(LIZ(windowInsetsAnimation));
                        this.LIZLLL.remove(windowInsetsAnimation);
                    }

                    @Override // android.view.WindowInsetsAnimation.Callback
                    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                        this.LIZ.LIZJ(LIZ(windowInsetsAnimation));
                    }

                    @Override // android.view.WindowInsetsAnimation.Callback
                    public final WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                        ArrayList<C0PA> arrayList = this.LIZJ;
                        if (arrayList == null) {
                            ArrayList<C0PA> arrayList2 = new ArrayList<>(list.size());
                            this.LIZJ = arrayList2;
                            this.LIZIZ = Collections.unmodifiableList(arrayList2);
                        } else {
                            arrayList.clear();
                        }
                        for (int size = list.size() - 1; size >= 0; size--) {
                            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) ListProtector.get(list, size);
                            C0PA LIZ = LIZ(windowInsetsAnimation);
                            LIZ.LIZIZ(windowInsetsAnimation.getFraction());
                            this.LIZJ.add(LIZ);
                        }
                        C0P4 c0p42 = this.LIZ;
                        C0PI LIZJ = C0PI.LIZJ(null, windowInsets);
                        c0p42.LIZLLL(LIZJ, this.LIZIZ);
                        return LIZJ.LIZIZ();
                    }

                    @Override // android.view.WindowInsetsAnimation.Callback
                    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                        C0P4 c0p42 = this.LIZ;
                        C0PA LIZ = LIZ(windowInsetsAnimation);
                        C0P3 c0p3 = new C0P3(bounds);
                        c0p42.LJ(LIZ, c0p3);
                        c0p3.getClass();
                        return new WindowInsetsAnimation.Bounds(c0p3.LIZ.LJ(), c0p3.LIZIZ.LJ());
                    }
                };
            }
            view.setWindowInsetsAnimationCallback(callback);
            return;
        }
        Object tag = view.getTag(R.id.l09);
        if (c0p4 == null) {
            view.setTag(R.id.l0m, null);
            if (tag != null) {
                return;
            }
            view.setOnApplyWindowInsetsListener(null);
            return;
        }
        View.OnApplyWindowInsetsListener c0p7 = new C0P7(view, c0p4);
        view.setTag(R.id.l0m, c0p7);
        if (tag != null) {
            return;
        }
        view.setOnApplyWindowInsetsListener(c0p7);
    }
}
