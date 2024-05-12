package X;

import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import java.lang.reflect.Field;

/* renamed from: X.EUt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36515EUt {
    public static MessageQueue LIZ;
    public static Field LIZIZ;
    public static Field LIZJ;

    public static MessageQueue LIZ() {
        if (LIZ == null && C16880lQ.LLJJJJ() != null) {
            Looper LLJJJJ = C16880lQ.LLJJJJ();
            if (LLJJJJ == Looper.myLooper()) {
                LIZ = Looper.myQueue();
            } else if (Build.VERSION.SDK_INT >= 23) {
                LIZ = LLJJJJ.getQueue();
            } else {
                try {
                    Field declaredField = LLJJJJ.getClass().getDeclaredField("mQueue");
                    declaredField.setAccessible(true);
                    LIZ = (MessageQueue) declaredField.get(LLJJJJ);
                } catch (Throwable unused) {
                }
            }
        }
        return LIZ;
    }

    public static Message LIZIZ(MessageQueue messageQueue) {
        Field field = LIZIZ;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
                LIZIZ = declaredField;
                declaredField.setAccessible(true);
                return (Message) LIZIZ.get(messageQueue);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            return (Message) field.get(messageQueue);
        } catch (Exception unused2) {
            return null;
        }
    }
}
