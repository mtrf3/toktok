package X;

import android.os.Message;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.4Mb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108094Mb {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C108134Mf.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C108114Md.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C108124Me.LJLIL);

    /* JADX WARN: Type inference failed for: r0v39, types: [X.4Mg] */
    public static void LIZ(C4MX c4mx) {
        boolean z;
        Boolean bool;
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        c114834f1.i("SendMessageLooper", "sendMessage: " + c4mx.LIZIZ);
        if (C1GE.LJIIL(c4mx.LIZIZ)) {
            if (C1GE.LJIILIIL(c4mx.LIZJ) || (!((ArrayList) c4mx.LIZLLL).isEmpty())) {
                if (c4mx.LJIIIIZZ == null) {
                    c4mx.LJIIIIZZ = new Object() { // from class: X.4Mg
                        {
                            SystemClock.uptimeMillis();
                        }
                    };
                }
                SystemClock.uptimeMillis();
                C4WC c4wc = C4WC.LIZIZ;
                String str = c4mx.LIZIZ;
                o.LJI(str);
                C63120Opw LIZ2 = c4wc.LIZ(str);
                if (LIZ2 == null || LIZ2.isTemp()) {
                    String str2 = c4mx.LIZIZ;
                    o.LJI(str2);
                    if (C81273Gx.LIZLLL(str2) <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    HandlerC108084Ma handlerC108084Ma = (HandlerC108084Ma) LIZ.getValue();
                    handlerC108084Ma.getClass();
                    C4ZL.LIZJ();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("enqueue[");
                    LIZ3.append(c4mx.LIZIZ);
                    LIZ3.append("]: ");
                    LIZ3.append(c4mx);
                    LIZ3.append(", ");
                    Integer num = null;
                    if (LIZ2 != null) {
                        bool = Boolean.valueOf(LIZ2.isTemp());
                    } else {
                        bool = null;
                    }
                    LIZ3.append(bool);
                    c114834f1.i("MsgSender_MQ", X1D.LIZIZ(LIZ3));
                    java.util.Map map = (java.util.Map) handlerC108084Ma.LIZ.getValue();
                    String str3 = c4mx.LIZIZ;
                    o.LJI(str3);
                    synchronized (handlerC108084Ma) {
                        java.util.Set set = (java.util.Set) map.get(str3);
                        C4ZL.LIZJ();
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("putPayload[");
                        LIZ4.append(str3);
                        LIZ4.append("]: ");
                        if (set != null) {
                            num = Integer.valueOf(set.size());
                        }
                        LIZ4.append(num);
                        C114834f1.LJIIJ("MsgSender_MQ", X1D.LIZIZ(LIZ4));
                        if (set == null) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            linkedHashSet.add(c4mx);
                            map.put(str3, linkedHashSet);
                        } else {
                            set.add(c4mx);
                        }
                    }
                    if (LIZ2 != null && LIZ2.isTemp()) {
                        c4mx.LJFF(LIZ2);
                    }
                    C4ZL.LIZJ();
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("bookTimeOut[");
                    LIZ5.append(c4mx.LIZIZ);
                    LIZ5.append(']');
                    C114834f1.LJIIJ("MsgSender_MQ", X1D.LIZIZ(LIZ5));
                    Message message = new Message();
                    message.what = c4mx.LIZ;
                    message.obj = c4mx.LIZIZ;
                    handlerC108084Ma.sendMessageDelayed(message, 10000L);
                    C4WW c4ww = (C4WW) LIZIZ.getValue();
                    String str4 = c4mx.LIZIZ;
                    o.LJI(str4);
                    c4ww.LIZJ(str4, z);
                    return;
                }
                c4mx.LJ(LIZ2);
            }
        }
    }
}
