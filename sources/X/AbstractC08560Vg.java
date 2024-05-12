package X;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* renamed from: X.0Vg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC08560Vg {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C0VW.LIZIZ("WorkerFactory");
    }

    public final ListenableWorker LIZ(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker listenableWorker = null;
        try {
            Class<? extends U> asSubclass = Class.forName(str).asSubclass(ListenableWorker.class);
            if (asSubclass != 0) {
                try {
                    ListenableWorker listenableWorker2 = (ListenableWorker) asSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                    listenableWorker = listenableWorker2;
                    if (listenableWorker2 != null && listenableWorker2.LJLJJI) {
                        throw new IllegalStateException(C16880lQ.LLLZ("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", new Object[]{getClass().getName(), str}));
                    }
                } catch (Throwable unused) {
                    C0VW LIZ2 = C0VW.LIZ();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Could not instantiate ");
                    LIZ3.append(str);
                    X1D.LIZIZ(LIZ3);
                    LIZ2.getClass();
                }
            }
        } catch (Throwable unused2) {
            C0VW LIZ4 = C0VW.LIZ();
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("Invalid class: ");
            LIZ5.append(str);
            X1D.LIZIZ(LIZ5);
            LIZ4.getClass();
        }
        return listenableWorker;
    }
}
