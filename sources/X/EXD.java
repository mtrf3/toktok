package X;

import android.os.Handler;
import java.lang.reflect.Field;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EXD {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(cls, new Object[0]);
            Field declaredField = invoke.getClass().getDeclaredField("mH");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(invoke);
            o.LJII(obj, "null cannot be cast to non-null type android.os.Handler");
            Handler handler = (Handler) obj;
            Field declaredField2 = Handler.class.getDeclaredField("mCallback");
            declaredField2.setAccessible(true);
            declaredField2.set(handler, new EXE((Handler.Callback) declaredField2.get(handler)));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            PEH.LIZLLL(e, "ChildBroadcastReceiverHook.startHook");
        }
    }
}
