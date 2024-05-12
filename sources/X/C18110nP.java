package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.o;

/* renamed from: X.0nP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18110nP {
    public static final AtomicLong LIZ = new AtomicLong(0);

    public static C18090nN LIZ(C12450eH po) {
        Activity activity;
        Fragment fragment;
        Object obj;
        Object obj2;
        o.LJIIIZ(po, "po");
        C18090nN c18090nN = new C18090nN(po.LIZ, (int) LIZ.incrementAndGet());
        String str = po.LIZJ;
        o.LJIIIZ(str, "<set-?>");
        c18090nN.LIZJ = str;
        StringBuilder LIZ2 = X1D.LIZ();
        C18080nM.LIZ.getClass();
        LIZ2.append(C18080nM.LIZIZ);
        LIZ2.append('.');
        LIZ2.append(po.LIZJ);
        LIZ2.append(".c0.d0");
        String LIZIZ = X1D.LIZIZ(LIZ2);
        o.LJIIIZ(LIZIZ, "<set-?>");
        c18090nN.LIZLLL = LIZIZ;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(C18080nM.LIZIZ);
        LIZ3.append('.');
        c18090nN.LJII = JBR.LJFF(LIZ3, po.LIZJ, ".c0.d0", LIZ3);
        c18090nN.LJJ = po.LJI;
        int i = C18100nO.LIZ[po.LIZLLL.ordinal()];
        String str2 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        WeakReference<Object> weakReference = po.LJIIIIZZ;
                        if (weakReference != null && (obj2 = weakReference.get()) != null) {
                            str2 = C16880lQ.LJLLJ(obj2.getClass());
                        }
                        c18090nN.LJIIJ = str2;
                        c18090nN.LJJIIJ = true;
                    }
                } else {
                    WeakReference<Object> weakReference2 = po.LJII;
                    if (weakReference2 != null && (obj = weakReference2.get()) != null) {
                        str2 = C16880lQ.LJLLJ(obj.getClass());
                    }
                    c18090nN.LJIIJ = str2;
                    c18090nN.LJJII = true;
                    c18090nN.LJJIII = po.LJIIL;
                }
            } else {
                WeakReference<Fragment> weakReference3 = po.LJFF;
                if (weakReference3 != null && (fragment = weakReference3.get()) != null) {
                    str2 = C16880lQ.LJLLJ(fragment.getClass());
                }
                c18090nN.LJIIJ = str2;
                c18090nN.LJJI = true;
                c18090nN.LJJIFFI = po.LJFF;
            }
        } else {
            WeakReference<Activity> weakReference4 = po.LJI;
            if (weakReference4 != null && (activity = weakReference4.get()) != null) {
                str2 = C16880lQ.LJLLJ(activity.getClass());
            }
            c18090nN.LJIIJ = str2;
            c18090nN.LJIL = true;
        }
        if (po.LJIIIZ) {
            c18090nN.LJJIIZ = true;
            String str3 = po.LJIIJ;
            o.LJIIIZ(str3, "<set-?>");
            c18090nN.LJJIIJZLJL = str3;
        } else {
            String str4 = po.LIZ;
            o.LJIIIZ(str4, "<set-?>");
            c18090nN.LJJIIJZLJL = str4;
        }
        c18090nN.LJJIL = po.LJIIJJI;
        return c18090nN;
    }
}
