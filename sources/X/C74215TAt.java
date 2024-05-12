package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.TAt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74215TAt {
    public static void LIZ(Object obj) {
        boolean z;
        if (!PEI.LJIIJ) {
            return;
        }
        Class<?> cls = obj.getClass();
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.addAll(new ArrayList(Arrays.asList(cls.getDeclaredFields())));
            cls = cls.getSuperclass();
            if (cls.getName().startsWith("android.")) {
                break;
            }
        } while (!cls.getName().startsWith("androidx."));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Field field = (Field) it.next();
            if (!Modifier.isStatic(field.getModifiers())) {
                Class<?> type = field.getType();
                if (type.isAssignableFrom(Collection.class)) {
                    try {
                        ((Collection) field.get(obj)).clear();
                    } catch (Throwable th) {
                        C78983UzD.LJIIZILJ(th);
                    }
                } else if (type.isAssignableFrom(java.util.Map.class)) {
                    try {
                        field.setAccessible(true);
                        ((java.util.Map) field.get(obj)).clear();
                    } catch (Throwable th2) {
                        C78983UzD.LJIIZILJ(th2);
                    }
                } else if (type.isAssignableFrom(View.class)) {
                    try {
                        field.setAccessible(true);
                        field.set(obj, null);
                    } catch (Throwable th3) {
                        C78983UzD.LJIIZILJ(th3);
                    }
                } else if (type.isArray()) {
                    try {
                        field.setAccessible(true);
                        field.set(obj, null);
                    } catch (Throwable th4) {
                        C78983UzD.LJIIZILJ(th4);
                    }
                } else if (PEI.LJIIJJI) {
                    boolean z2 = false;
                    if (type.isAssignableFrom(Integer.TYPE) || type.isAssignableFrom(Long.TYPE) || type.isAssignableFrom(Double.TYPE) || type.isAssignableFrom(Float.TYPE) || type.isAssignableFrom(Short.TYPE) || type.isAssignableFrom(Character.TYPE) || type.isAssignableFrom(Boolean.TYPE)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (type.isAssignableFrom(Integer.class) || type.isAssignableFrom(Long.class) || type.isAssignableFrom(Double.class) || type.isAssignableFrom(Float.class) || type.isAssignableFrom(Short.class) || type.isAssignableFrom(Character.class) || type.isAssignableFrom(Boolean.class)) {
                        z2 = true;
                    }
                    if (!z && !z2) {
                        try {
                            field.setAccessible(true);
                            field.get(obj);
                            field.set(obj, null);
                        } catch (Throwable th5) {
                            C78983UzD.LJIIZILJ(th5);
                        }
                    }
                }
            }
        }
    }

    public static void LIZIZ(C54356LUy c54356LUy) {
        View view;
        Object obj = c54356LUy.LIZ.get();
        if (obj == null) {
            return;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (PEI.LJIIIIZZ && (activity instanceof ActivityC45651qj)) {
                for (Fragment fragment : ((ActivityC45651qj) activity).getSupportFragmentManager().LJJJJLI()) {
                    if (!"androidx.lifecycle.ReportFragment".equalsIgnoreCase(fragment.getClass().getName()) && (view = fragment.getView()) != null) {
                        LIZJ(view);
                    }
                }
            }
            View rootView = activity.getWindow().peekDecorView().getRootView();
            if (rootView != null) {
                LIZJ(rootView);
            }
        } else if (obj instanceof Fragment) {
            View view2 = ((Fragment) obj).getView();
            if (view2 != null) {
                LIZJ(view2);
            }
        } else if (obj instanceof View) {
            LIZJ((View) obj);
        }
        LIZ(obj);
        c54356LUy.LJFF = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:201:0x0070, code lost:
    
        if (r1 >= 23) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(android.view.View r9) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74215TAt.LIZJ(android.view.View):void");
    }
}
