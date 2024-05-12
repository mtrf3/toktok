package X;

import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.apm.core.ActivityLifeObserver;
import java.lang.reflect.Field;
import java.util.HashSet;

/* renamed from: X.EXs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36592EXs {
    public static void LIZ() {
        int i;
        int i2;
        try {
            MessageQueue messageQueue = (MessageQueue) EUN.LIZIZ(C16880lQ.LLJJJJ(), "mQueue");
            synchronized (messageQueue) {
                Message message = (Message) EUN.LIZIZ(messageQueue, "mMessages");
                if (message != null && message.getTarget() == C36591EXr.LIZLLL()) {
                    if (((HashSet) C36591EXr.LJ).contains(Integer.valueOf(message.what)) && (((i2 = message.what) == 100 || i2 == 159) && EUM.LIZ(message) != null)) {
                    }
                }
                Field LIZ = EUN.LIZ(Message.class, "next");
                LIZ.setAccessible(true);
                if (message != null) {
                    while (true) {
                        if (!LIZ.isAccessible()) {
                            LIZ.setAccessible(true);
                        }
                        message = (Message) LIZ.get(message);
                        if (message == null) {
                            break;
                        }
                        if (message.getTarget() == C36591EXr.LIZLLL()) {
                            if (((HashSet) C36591EXr.LJ).contains(Integer.valueOf(message.what)) && ((i = message.what) == 100 || i == 159)) {
                                if (EUM.LIZ(message) != null) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        ActivityLifeObserver.getInstance().register(new C36593EXt());
    }
}
