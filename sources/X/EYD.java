package X;

import Y.ARunnableS13S0000000_6;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.reflect.Reflect;

/* loaded from: classes7.dex */
public final class EYD {
    public static volatile boolean LIZ;

    public static void LIZIZ() {
        try {
            Reflect call = Reflect.on(Class.forName("android.app.ActivityThread")).call("currentActivityThread");
            Class<?> cls = Class.forName("android.app.ActivityThread$H");
            if (call != null) {
                synchronized (cls) {
                    Reflect on = Reflect.on(cls);
                    final int intValue = ((Integer) on.field("SCHEDULE_CRASH", new Class[0]).get()).intValue();
                    final int intValue2 = ((Integer) on.field("RECEIVER", new Class[0]).get()).intValue();
                    final int intValue3 = ((Integer) on.field("CREATE_SERVICE", new Class[0]).get()).intValue();
                    final int intValue4 = ((Integer) on.field("BIND_SERVICE", new Class[0]).get()).intValue();
                    final int intValue5 = ((Integer) on.field("SERVICE_ARGS", new Class[0]).get()).intValue();
                    Handler handler = (Handler) call.field("mH", new Class[0]).get();
                    if (handler != null) {
                        Reflect on2 = Reflect.on(handler);
                        final Handler.Callback callback = (Handler.Callback) on2.field("mCallback", Handler.Callback.class).get();
                        on2.set("mCallback", new Handler.Callback() { // from class: X.EXh
                            @Override // android.os.Handler.Callback
                            public final boolean handleMessage(Message message) {
                                int i;
                                int i2 = intValue;
                                int i3 = intValue2;
                                int i4 = intValue3;
                                int i5 = intValue4;
                                int i6 = intValue5;
                                Handler.Callback callback2 = callback;
                                if (message == null) {
                                    return false;
                                }
                                int i7 = message.what;
                                Object obj = message.obj;
                                if (i7 == i2 && Build.VERSION.SDK_INT < 28 && (obj instanceof String)) {
                                    String str = (String) obj;
                                    if (str.contains("Bad notification posted from package")) {
                                        C198517qh c198517qh = new C198517qh();
                                        c198517qh.LIZ.put("message", str);
                                        FUA.LIZJ("type_badnotification_error", c198517qh.LJ());
                                        return true;
                                    }
                                }
                                if (!C36582EXi.LIZJ && ((i = message.what) == i3 || i == i4 || i == i6 || i == i5)) {
                                    try {
                                        String message2 = message.toString();
                                        if (message2.contains("com.ss.android.newmedia.message") || message2.contains("com.amazon") || message2.contains("com.fcm") || message2.contains("com.adm")) {
                                            C36582EXi.LIZ(3);
                                        }
                                    } catch (Exception unused) {
                                        C36582EXi.LIZ(3);
                                    }
                                }
                                if (callback2 == null) {
                                    return false;
                                }
                                return callback2.handleMessage(message);
                            }
                        });
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void LIZ(boolean z) {
        if (z) {
            new Handler(C16880lQ.LLJJJJ()).postAtFrontOfQueue(new ARunnableS13S0000000_6(56));
            C36582EXi.LIZ.execute(new ARunnableS13S0000000_6(57));
        } else {
            LIZIZ();
        }
    }
}
