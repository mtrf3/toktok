package X;

import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.EXv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36595EXv {
    public static final Method LIZ;
    public static final Field LIZIZ;
    public static final Field LIZJ;
    public static final Field LIZLLL;
    public static final Method LJ;
    public static final Field LJFF;

    static {
        try {
            LIZ = C36508EUm.LIZIZ(Message.class, "recycleUnchecked", new Class[0]);
            LIZIZ = C36508EUm.LIZ(Message.class, "flags");
            LIZJ = C36508EUm.LIZ(Message.class, "next");
            LIZLLL = C36508EUm.LIZ(Looper.class, "mLogging");
            LJ = C36508EUm.LIZIZ(MessageQueue.class, "next", new Class[0]);
            LJFF = C36508EUm.LIZ(MessageQueue.class, "mMessages");
            LJFF = C36508EUm.LIZ(MessageQueue.class, "mMessages");
            if (Build.VERSION.SDK_INT >= 29) {
                Class<?> cls = Class.forName(C36508EUm.LIZ(Looper.class, "sObserver").getType().getName());
                C36508EUm.LIZIZ(cls, "messageDispatchStarting", new Class[0]);
                C36508EUm.LIZIZ(cls, "messageDispatched", Object.class, Message.class);
                C36508EUm.LIZIZ(cls, "dispatchingThrewException", Object.class, Message.class, Exception.class);
            }
        } catch (Throwable unused) {
        }
    }
}
