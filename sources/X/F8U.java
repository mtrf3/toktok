package X;

import android.app.Application;
import java.lang.Thread;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class F8U {
    public static final F8U INSTANCE;
    public static final /* synthetic */ F8U[] LJLILLLLZI;
    public F8V LJLIL;

    static {
        F8U f8u = new F8U();
        INSTANCE = f8u;
        LJLILLLLZI = new F8U[]{f8u};
        new HashMap();
    }

    public static F8U[] values() {
        return (F8U[]) LJLILLLLZI.clone();
    }

    public void destroy() {
        F8V f8v = this.LJLIL;
        if (f8v != null) {
            synchronized (f8v.LIZJ) {
                ((LinkedList) f8v.LIZJ).clear();
            }
        }
    }

    public static F8U valueOf(String str) {
        return (F8U) V0N.LJJJ(F8U.class, str);
    }

    public void addUncaughtExceptionConsumer(F8Z f8z) {
        if (this.LJLIL == null) {
            F8V f8v = new F8V();
            this.LJLIL = f8v;
            if (!f8v.LIZ) {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                f8v.LIZIZ = defaultUncaughtExceptionHandler;
                if (defaultUncaughtExceptionHandler != f8v) {
                    Thread.setDefaultUncaughtExceptionHandler(f8v);
                } else {
                    f8v.LIZIZ = null;
                }
                f8v.LIZ = true;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init mConsumeExceptionHandler:");
        LIZ.append(this.LJLIL);
        X1D.LIZIZ(LIZ);
        F8W f8w = F8W.INFO;
        F8X.LIZIZ(f8w);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("add consumer:");
        LIZ2.append(f8z);
        X1D.LIZIZ(LIZ2);
        F8X.LIZIZ(f8w);
        F8V f8v2 = this.LJLIL;
        synchronized (f8v2.LIZJ) {
            ((LinkedList) f8v2.LIZJ).add(f8z);
        }
    }

    public void removeUncaughtExceptionConsumer(F8Z f8z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("remove consumer:");
        LIZ.append(f8z);
        X1D.LIZIZ(LIZ);
        F8X.LIZIZ(F8W.INFO);
        F8V f8v = this.LJLIL;
        synchronized (f8v.LIZJ) {
            ((LinkedList) f8v.LIZJ).remove(f8z);
        }
    }

    public void init(Application application, InterfaceC38479F8h interfaceC38479F8h, F8W f8w) {
        if (interfaceC38479F8h != null) {
            F8X.LIZJ = interfaceC38479F8h;
        }
        if (f8w != null) {
            F8X.LIZ = f8w;
            if (f8w == F8W.DEBUG) {
                F8X.LIZIZ = true;
            }
        }
    }
}
