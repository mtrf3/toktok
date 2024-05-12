package o3;

import X.C16080k8;
import X.C16110kB;
import X.C16120kC;
import X.C16190kJ;
import X.C16300kU;
import X.C16330kX;
import X.C16340kY;
import X.C16360ka;
import X.C16370kb;
import X.C16380kc;
import X.C16400ke;
import X.C16410kf;
import X.C16430kh;
import X.C16460kk;
import X.C16650l3;
import X.C16800lI;
import X.C16880lQ;
import X.C17720mm;
import X.C33911Ut;
import X.C33931Uv;
import X.C33941Uw;
import X.C33951Ux;
import X.InterfaceC16730lB;
import X.InterfaceC16810lJ;
import X.InterfaceC17830mx;
import X.ViewTreeObserverOnGlobalLayoutListenerC16270kR;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class h0 {
    public static WeakHashMap<View, C16650l3> LIZ;
    public static Method LIZIZ;
    public static Field LIZJ;
    public static boolean LIZLLL;
    public static ThreadLocal<Rect> LJ;
    public static final int[] LJFF;
    public static final C33911Ut LJI;
    public static final ViewTreeObserverOnGlobalLayoutListenerC16270kR LJII;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1Ut] */
    static {
        new AtomicInteger(1);
        LIZ = null;
        LIZLLL = false;
        LJFF = new int[]{R.id.lz, R.id.m0, R.id.ma, R.id.ml, R.id.mo, R.id.mp, R.id.mq, R.id.mr, R.id.f170ms, R.id.mt, R.id.m1, R.id.m2, R.id.m3, R.id.m4, R.id.m5, R.id.m6, R.id.m7, R.id.m8, R.id.m9, R.id.m_, R.id.mb, R.id.mc, R.id.md, R.id.me, R.id.mf, R.id.mg, R.id.mh, R.id.mi, R.id.mj, R.id.mk, R.id.mm, R.id.mn};
        LJI = new InterfaceC16810lJ() { // from class: X.1Ut
            @Override // X.InterfaceC16810lJ
            public final C16190kJ LIZLLL(C16190kJ c16190kJ) {
                return c16190kJ;
            }
        };
        LJII = new ViewTreeObserverOnGlobalLayoutListenerC16270kR();
    }

    public static Rect LJII() {
        if (LJ == null) {
            LJ = new ThreadLocal<>();
        }
        Rect rect = LJ.get();
        if (rect == null) {
            rect = new Rect();
            LJ.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static C16650l3 LIZ(View view) {
        if (LIZ == null) {
            LIZ = new WeakHashMap<>();
        }
        C16650l3 c16650l3 = LIZ.get(view);
        if (c16650l3 == null) {
            C16650l3 c16650l32 = new C16650l3(view);
            LIZ.put(view, c16650l32);
            return c16650l32;
        }
        return c16650l3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r0 == null) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(android.view.View r2) {
        /*
            android.view.View$AccessibilityDelegate r1 = LJ(r2)
            if (r1 != 0) goto Lf
        L6:
            X.0kC r0 = new X.0kC
            r0.<init>()
        Lb:
            LJIJI(r2, r0)
            return
        Lf:
            boolean r0 = r1 instanceof X.C16080k8
            if (r0 == 0) goto L1a
            X.0k8 r1 = (X.C16080k8) r1
            X.0kC r0 = r1.LIZ
            if (r0 != 0) goto Lb
            goto L6
        L1a:
            X.0kC r0 = new X.0kC
            r0.<init>(r1)
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.h0.LIZLLL(android.view.View):void");
    }

    public static View.AccessibilityDelegate LJ(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C16410kf.LIZ(view);
        }
        View.AccessibilityDelegate accessibilityDelegate = null;
        if (LIZLLL) {
            return null;
        }
        if (LIZJ == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                LIZJ = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                LIZLLL = true;
                return null;
            }
        }
        try {
            Object obj = LIZJ.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            accessibilityDelegate = (View.AccessibilityDelegate) obj;
            return accessibilityDelegate;
        } catch (Throwable unused2) {
            LIZLLL = true;
            return accessibilityDelegate;
        }
    }

    public static CharSequence LJFF(View view) {
        return new C33931Uv(CharSequence.class).LIZLLL(view);
    }

    public static List<C17720mm> LJI(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.kzp);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.kzp, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static String[] LJIIIIZZ(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C16430kh.LIZ(view);
        }
        return (String[]) view.getTag(R.id.l0a);
    }

    public static C16800lI LJIIIZ(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C16370kb.LIZ(view);
        }
        return C16360ka.LJIIIZ(view);
    }

    public static void LJJI(ViewGroup viewGroup) {
        if (LIZIZ == null) {
            try {
                LIZIZ = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            LIZIZ.setAccessible(true);
        }
        try {
            LIZIZ.invoke(viewGroup, Boolean.TRUE);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
        }
    }

    public static void LJJIII(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(null);
            return;
        }
        Object tag = view.getTag(R.id.l09);
        view.setTag(R.id.l0m, null);
        if (tag != null) {
            return;
        }
        view.setOnApplyWindowInsetsListener(null);
    }

    public static void LJJIIJ(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static C16800lI LIZIZ(View view, C16800lI c16800lI) {
        WindowInsets LJIIIZ = c16800lI.LJIIIZ();
        if (LJIIIZ != null) {
            WindowInsets LIZ2 = C16340kY.LIZ(view, LJIIIZ);
            if (!LIZ2.equals(LJIIIZ)) {
                return C16800lI.LJIIJ(view, LIZ2);
            }
        }
        return c16800lI;
    }

    public static boolean LIZJ(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        C16460kk c16460kk = (C16460kk) view.getTag(R.id.l0j);
        if (c16460kk == null) {
            c16460kk = new C16460kk();
            view.setTag(R.id.l0j, c16460kk);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = c16460kk.LIZ;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = C16460kk.LIZLLL;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (c16460kk.LIZ == null) {
                        c16460kk.LIZ = new WeakHashMap<>();
                    }
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList2 = C16460kk.LIZLLL;
                        View view2 = arrayList2.get(size).get();
                        if (view2 == null) {
                            arrayList2.remove(size);
                        } else {
                            c16460kk.LIZ.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                c16460kk.LIZ.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View LIZ2 = c16460kk.LIZ(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (LIZ2 == null) {
                return false;
            }
            if (!KeyEvent.isModifierKey(keyCode)) {
                if (c16460kk.LIZIZ == null) {
                    c16460kk.LIZIZ = new SparseArray<>();
                }
                c16460kk.LIZIZ.put(keyCode, new WeakReference<>(LIZ2));
            }
        } else if (LIZ2 == null) {
            return false;
        }
        return true;
    }

    public static void LJIIJ(int i, View view) {
        boolean z;
        AccessibilityManager accessibilityManager = (AccessibilityManager) C16880lQ.LLILL(view.getContext(), "accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        if (LJFF(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = 32;
        if (C16330kX.LIZ(view) != 0 || z) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            if (!z) {
                i2 = 2048;
            }
            obtain.setEventType(i2);
            C16330kX.LJI(obtain, i);
            if (z) {
                obtain.getText().add(LJFF(view));
                if (C16300kU.LIZJ(view) == 0) {
                    C16300kU.LJIJ(view, 1);
                }
                ViewParent parent = view.getParent();
                while (true) {
                    if (!(parent instanceof View)) {
                        break;
                    }
                    if (C16300kU.LIZJ((View) parent) == 4) {
                        C16300kU.LJIJ(view, 2);
                        break;
                    }
                    parent = parent.getParent();
                }
            }
            view.sendAccessibilityEventUnchecked(obtain);
            return;
        }
        if (i == 32) {
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            C16330kX.LJI(obtain2, i);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(LJFF(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
            return;
        }
        if (view.getParent() == null) {
            return;
        }
        try {
            C16330kX.LJ(view.getParent(), view, view, i);
        } catch (AbstractMethodError unused) {
        }
    }

    public static void LJIIJJI(int i, View view) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect LJII2 = LJII();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            LJII2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !LJII2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            LJJIIJ(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                LJJIIJ((View) parent2);
            }
        }
        if (!z || !LJII2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            return;
        }
        ((View) parent).invalidate(LJII2);
    }

    public static void LJIIL(int i, View view) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect LJII2 = LJII();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            LJII2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !LJII2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            LJJIIJ(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                LJJIIJ((View) parent2);
            }
        }
        if (!z || !LJII2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            return;
        }
        ((View) parent).invalidate(LJII2);
    }

    public static C16800lI LJIILIIL(View view, C16800lI c16800lI) {
        WindowInsets LJIIIZ = c16800lI.LJIIIZ();
        if (LJIIIZ != null) {
            WindowInsets LIZIZ2 = C16340kY.LIZIZ(view, LJIIIZ);
            if (!LIZIZ2.equals(LJIIIZ)) {
                return C16800lI.LJIIJ(view, LIZIZ2);
            }
        }
        return c16800lI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C16190kJ LJIILJJIL(View view, C16190kJ c16190kJ) {
        InterfaceC16810lJ interfaceC16810lJ;
        InterfaceC16810lJ interfaceC16810lJ2;
        if (Build.VERSION.SDK_INT >= 31) {
            return C16430kh.LIZIZ(view, c16190kJ);
        }
        InterfaceC16730lB interfaceC16730lB = (InterfaceC16730lB) view.getTag(R.id.l0_);
        if (interfaceC16730lB != null) {
            C16190kJ LIZ2 = interfaceC16730lB.LIZ(view, c16190kJ);
            if (LIZ2 == null) {
                return null;
            }
            if (view instanceof InterfaceC16810lJ) {
                interfaceC16810lJ2 = (InterfaceC16810lJ) view;
            } else {
                interfaceC16810lJ2 = LJI;
            }
            return interfaceC16810lJ2.LIZLLL(LIZ2);
        }
        if (view instanceof InterfaceC16810lJ) {
            interfaceC16810lJ = (InterfaceC16810lJ) view;
        } else {
            interfaceC16810lJ = LJI;
        }
        return interfaceC16810lJ.LIZLLL(c16190kJ);
    }

    public static void LJIILL(int i, View view) {
        List<C17720mm> LJI2 = LJI(view);
        for (int i2 = 0; i2 < LJI2.size(); i2++) {
            if (((C17720mm) ListProtector.get(LJI2, i2)).LIZ() == i) {
                ListProtector.remove(LJI2, i2);
                return;
            }
        }
    }

    public static View LJIIZILJ(int i, View view) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) C16400ke.LJI(view, i);
        }
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static void LJIJI(View view, C16120kC c16120kC) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (c16120kC == null) {
            if (LJ(view) instanceof C16080k8) {
                c16120kC = new C16120kC();
            } else {
                accessibilityDelegate = null;
                view.setAccessibilityDelegate(accessibilityDelegate);
            }
        }
        accessibilityDelegate = c16120kC.mBridge;
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static void LJIJJ(View view, boolean z) {
        new C33951Ux(Boolean.class).LJ(view, Boolean.valueOf(z));
    }

    public static void LJIJJLI(View view, CharSequence charSequence) {
        boolean z;
        new C33931Uv(CharSequence.class).LJ(view, charSequence);
        if (charSequence != null) {
            ViewTreeObserverOnGlobalLayoutListenerC16270kR viewTreeObserverOnGlobalLayoutListenerC16270kR = LJII;
            WeakHashMap<View, Boolean> weakHashMap = viewTreeObserverOnGlobalLayoutListenerC16270kR.LJLIL;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC16270kR);
            if (C16330kX.LIZIZ(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC16270kR);
                return;
            }
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC16270kR viewTreeObserverOnGlobalLayoutListenerC16270kR2 = LJII;
        viewTreeObserverOnGlobalLayoutListenerC16270kR2.LJLIL.remove(view);
        view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC16270kR2);
        C16300kU.LJIILJJIL(view.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC16270kR2);
    }

    public static void LJIL(View view, ColorStateList colorStateList) {
        boolean z;
        C16360ka.LJIILLIIL(view, colorStateList);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            if (C16360ka.LJI(view) != null || C16360ka.LJII(view) != null) {
                z = true;
            } else {
                z = false;
            }
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                C16300kU.LJIILLIIL(view, background);
            }
        }
    }

    public static void LJJ(View view, PorterDuff.Mode mode) {
        boolean z;
        C16360ka.LJIIZILJ(view, mode);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            if (C16360ka.LJI(view) != null || C16360ka.LJII(view) != null) {
                z = true;
            } else {
                z = false;
            }
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                C16300kU.LJIILLIIL(view, background);
            }
        }
    }

    public static void LJJIFFI(View view, C16110kB c16110kB) {
        PointerIcon pointerIcon;
        if (Build.VERSION.SDK_INT >= 24) {
            if (c16110kB != null) {
                pointerIcon = c16110kB.LIZ;
            } else {
                pointerIcon = null;
            }
            C16380kc.LIZLLL(view, pointerIcon);
        }
    }

    public static void LJJII(View view, CharSequence charSequence) {
        new C33941Uw(CharSequence.class).LJ(view, charSequence);
    }

    public static void LJIILLIIL(View view, C17720mm c17720mm, CharSequence charSequence, InterfaceC17830mx interfaceC17830mx) {
        if (interfaceC17830mx == null && charSequence == null) {
            LJIILL(c17720mm.LIZ(), view);
            LJIIJ(0, view);
            return;
        }
        c17720mm.getClass();
        C17720mm c17720mm2 = new C17720mm(null, c17720mm.LIZIZ, charSequence, interfaceC17830mx, c17720mm.LIZJ);
        LIZLLL(view);
        LJIILL(c17720mm2.LIZ(), view);
        LJI(view).add(c17720mm2);
        LJIIJ(0, view);
    }

    public static void LJIJ(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C16410kf.LIZJ(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }
}
