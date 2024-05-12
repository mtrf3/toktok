package X;

import android.content.Intent;
import android.os.Build;
import android.os.Message;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes7.dex */
public final class EUM {
    public static Intent LIZ(Message message) {
        Intent intent;
        Object obj;
        Object obj2;
        int i = message.what;
        String str = "intent";
        Intent intent2 = null;
        if (i != 100) {
            if (i != 121) {
                if (i != 159) {
                    switch (i) {
                        case 113:
                            if ("intent".isEmpty() || (obj2 = message.obj) == null) {
                                return null;
                            }
                            try {
                                return (Intent) EUN.LIZIZ(obj2, "intent");
                            } catch (Throwable unused) {
                                return null;
                            }
                        case 114:
                        case 115:
                            break;
                        default:
                            return null;
                    }
                }
            }
            if (i != 114 && i != 121) {
                str = i == 115 ? "args" : "";
            }
            if (str.isEmpty() || (obj = message.obj) == null) {
                return null;
            }
            try {
                return (Intent) EUN.LIZIZ(obj, str);
            } catch (Throwable unused2) {
                return null;
            }
        }
        Object obj3 = message.obj;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28 && i == 100) {
            try {
                intent2 = (Intent) EUN.LIZIZ(obj3, "intent");
                return intent2;
            } catch (IllegalAccessException e) {
                C16880lQ.LLLLIIL(e);
                return intent2;
            }
        }
        if (i2 < 28 || i != 159) {
            return null;
        }
        try {
            List list = (List) EUN.LIZIZ(obj3, "mActivityCallbacks");
            if (list == null) {
                return null;
            }
            for (int i3 = 0; i3 < list.size(); i3++) {
                Object obj4 = ListProtector.get(list, i3);
                if (obj4 != null && (intent = (Intent) EUN.LIZIZ(obj4, "mIntent")) != null) {
                    return intent;
                }
            }
            return null;
        } catch (IllegalAccessException e2) {
            C16880lQ.LLLLIIL(e2);
            return null;
        }
    }
}
