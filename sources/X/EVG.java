package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes7.dex */
public final class EVG {
    public final Handler LIZ;

    public EVG() {
        Handler handler;
        Looper LLJJJJ = C16880lQ.LLJJJJ();
        if (Build.VERSION.SDK_INT >= 28) {
            handler = Handler.createAsync(LLJJJJ);
        } else {
            try {
                handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(LLJJJJ, null, Boolean.TRUE);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
                handler = new Handler(LLJJJJ);
            } catch (InvocationTargetException unused2) {
                handler = new Handler(LLJJJJ);
            }
        }
        this.LIZ = handler;
    }
}
