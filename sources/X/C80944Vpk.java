package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vpk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80944Vpk {
    public static void LIZJ(View view) {
        try {
            if (C47316Ihc.LIZ != null) {
                if (!C80946Vpm.LJFF) {
                    try {
                        if (!C80946Vpm.LIZIZ) {
                            try {
                                C80946Vpm.LIZ = Class.forName("android.view.GhostView");
                            } catch (ClassNotFoundException unused) {
                            }
                            C80946Vpm.LIZIZ = true;
                        }
                        Method declaredMethod = C80946Vpm.LIZ.getDeclaredMethod("removeGhost", View.class);
                        C80946Vpm.LJ = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException unused2) {
                    }
                    C80946Vpm.LJFF = true;
                }
                Method method = C80946Vpm.LJ;
                if (method != null) {
                    try {
                        C47315Ihb.LIZ(method, new Object[]{view});
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException(e.getCause());
                    }
                }
            } else if (Build.VERSION.SDK_INT == 28) {
                if (!QLB.LJII) {
                    try {
                        if (!QLB.LIZLLL) {
                            try {
                                QLB.LIZJ = Class.forName("android.view.GhostView");
                            } catch (ClassNotFoundException unused3) {
                            }
                            QLB.LIZLLL = true;
                        }
                        Method declaredMethod2 = QLB.LIZJ.getDeclaredMethod("removeGhost", View.class);
                        QLB.LJI = declaredMethod2;
                        declaredMethod2.setAccessible(true);
                    } catch (NoSuchMethodException unused4) {
                    }
                    QLB.LJII = true;
                }
                Method method2 = QLB.LJI;
                if (method2 != null) {
                    try {
                        QLB.LIZ(method2, new Object[]{view});
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException(e2.getCause());
                    }
                }
            } else {
                C80943Vpj c80943Vpj = (C80943Vpj) view.getTag(R.id.drz);
                if (c80943Vpj != null) {
                    int i = c80943Vpj.LJLILLLLZI - 1;
                    c80943Vpj.LJLILLLLZI = i;
                    if (i <= 0) {
                        ViewGroup viewGroup = (ViewGroup) c80943Vpj.getParent();
                        if (C78996UzQ.LJJIIJZLJL(c80943Vpj)) {
                            C78996UzQ.LJI();
                        }
                        viewGroup.removeView(c80943Vpj);
                    }
                }
            }
        } catch (IllegalAccessException unused5) {
        }
    }

    public static List<PIA<String, View>> LJ(C1HQ<String, View> c1hq) {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        while (!c1hq.isEmpty()) {
            for (int i = c1hq.LJLJI - 1; i >= 0; i--) {
                View LJIIJJI = c1hq.LJIIJJI(i);
                String LJIIIIZZ = c1hq.LJIIIIZZ(i);
                if (z && (LJIIJJI == null || !LJIIJJI.isAttachedToWindow() || LJIIIIZZ == null)) {
                    c1hq.LJIIIZ(i);
                } else {
                    Object parent = LJIIJJI.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (c1hq.containsValue(view)) {
                                break;
                            }
                            parent = view.getParent();
                        } else {
                            arrayList.add(new PIA(LJIIIIZZ, LJIIJJI));
                            c1hq.LJIIIZ(i);
                            break;
                        }
                    }
                }
            }
            z = false;
        }
        return arrayList;
    }

    public static PIA<List<View>, List<View>> LJFF(List<View> list) {
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        Rect rect = new Rect();
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                View view = (View) ListProtector.get(arrayList, size);
                if (!view.getGlobalVisibleRect(rect)) {
                    ListProtector.remove(arrayList, size);
                    arrayList2.add(view);
                }
            } else {
                return new PIA<>(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x01a5, code lost:
    
        if (r10.size() == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0236, code lost:
    
        if (r2 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019b, code lost:
    
        if (r14.getZ() > r13.getZ()) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01bb, code lost:
    
        r9 = r12 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(android.view.View r16, android.view.ViewGroup r17) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80944Vpk.LIZLLL(android.view.View, android.view.ViewGroup):void");
    }

    public static void LIZ(View view, View view2, List<View> list) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.isTransitionGroup() && view != view2) {
                ((ArrayList) list).add(viewGroup);
                return;
            }
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                LIZ(viewGroup.getChildAt(i), view2, list);
            }
            return;
        }
        if (view.getVisibility() != 0) {
            return;
        }
        ((ArrayList) list).add(view);
    }

    public static View LIZIZ(View view, String str, boolean z) {
        View LIZIZ;
        if (str.equals(C16360ka.LJIIJ(view))) {
            return view;
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i < viewGroup.getChildCount()) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt.getVisibility() == 0 || !z) && (LIZIZ = LIZIZ(childAt, str, z)) != null) {
                        return LIZIZ;
                    }
                    i++;
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }
}
