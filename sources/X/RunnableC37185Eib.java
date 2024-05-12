package X;

import Y.ACallableS109S0100000_6;
import Y.ARunnableS13S0000000_6;
import android.content.Context;
import android.os.Build;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: X.Eib, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37185Eib implements Runnable {
    public final boolean LJLIL = true;
    public final Runnable LJLILLLLZI;

    public final void LIZ() {
        if (this.LJLIL) {
            this.LJLILLLLZI.run();
            C37181EiX c37181EiX = C37179EiV.LJII;
            Context LIZIZ = EF7.LIZIZ();
            if (Build.VERSION.SDK_INT <= 23) {
                if (c37181EiX.LIZIZ) {
                    return;
                }
                ArrayList arrayList = c37181EiX.LIZ;
                if (arrayList != null && arrayList.size() > 0) {
                    C79004UzY.LJI(c37181EiX.LIZ);
                    return;
                }
                if (c37181EiX.LIZJ || c37181EiX.LIZ != null) {
                    return;
                }
                try {
                    new TextView(LIZIZ).post(new ARunnableS13S0000000_6(48));
                    try {
                        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
                        Field declaredField = Thread.class.getDeclaredField("localValues");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(LLLLIIIILLL);
                        Field declaredField2 = Class.forName("java.lang.ThreadLocal$Values").getDeclaredField("table");
                        declaredField2.setAccessible(true);
                        for (Object obj2 : (Object[]) declaredField2.get(obj)) {
                            if (obj2 != null && obj2.getClass().getName().equals("android.view.ViewRootImpl$RunQueue")) {
                                Field declaredField3 = Class.forName("android.view.ViewRootImpl$RunQueue").getDeclaredField("mActions");
                                declaredField3.setAccessible(true);
                                C79004UzY.LJI(declaredField3.get(obj2));
                                c37181EiX.LIZ = (ArrayList) declaredField3.get(obj2);
                                c37181EiX.LIZJ = true;
                                return;
                            }
                        }
                        return;
                    } catch (Exception unused) {
                        c37181EiX.LIZIZ = true;
                        return;
                    }
                } catch (Exception unused2) {
                    return;
                }
            }
            c37181EiX.getClass();
            return;
        }
        C10K.LIZIZ(new ACallableS109S0100000_6(this, 24), C10K.LJIIIIZZ, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC37185Eib(Runnable runnable) {
        this.LJLILLLLZI = runnable;
    }
}
