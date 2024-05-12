package X;

import Y.ARunnableS42S0100000_6;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Fiz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class HandlerC39757Fiz extends Handler {
    public final java.util.Map<String, List<Message>> LIZ;

    public HandlerC39757Fiz(Looper looper) {
        super(looper);
        this.LIZ = new HashMap();
    }

    public static void LIZ(C39761Fj3 c39761Fj3) {
        try {
            C39756Fiy c39756Fiy = C39756Fiy.LJLJJI;
            ((ArrayList) c39756Fiy.LJLIL).add(c39761Fj3);
            if (((ArrayList) c39756Fiy.LJLIL).size() > 100) {
                ((ArrayList) c39756Fiy.LJLIL).subList(0, 50).clear();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        Object obj = message.obj;
        if (obj instanceof Message) {
            Message message2 = (Message) obj;
            if (C39758Fj0.LIZIZ(message2)) {
                C39761Fj3 LIZ = C39761Fj3.LIZ(message2);
                if (TextUtils.isEmpty(LIZ.LIZ)) {
                    List list = (List) ((HashMap) this.LIZ).get(LIZ.LIZLLL);
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(message2);
                    ((HashMap) this.LIZ).put(LIZ.LIZLLL, list);
                    C39749Fir.LIZ();
                    return;
                }
                System.currentTimeMillis();
                InterfaceC39753Fiv interfaceC39753Fiv = RunnableC39754Fiw.LIZIZ().LJLJJL;
                C39758Fj0.LIZ(message2);
                LIZ(LIZ);
                if (interfaceC39753Fiv != null) {
                    System.currentTimeMillis();
                }
                List<Message> list2 = (List) ((HashMap) this.LIZ).get(LIZ.LIZLLL);
                if (list2 != null && message2.what == 114) {
                    for (Message message3 : list2) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Hint reverse message's father = ");
                        LIZ2.append(LIZ);
                        LIZ2.append("so fix it!");
                        X1D.LIZIZ(LIZ2);
                        C39749Fir.LIZ();
                        LIZ = C39761Fj3.LIZ(message3);
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("After father message now service follow bean is ");
                        LIZ3.append(LIZ);
                        X1D.LIZIZ(LIZ3);
                        C39749Fir.LIZ();
                        System.currentTimeMillis();
                        C39758Fj0.LIZ(message3);
                        if (interfaceC39753Fiv != null) {
                            System.currentTimeMillis();
                        }
                        LIZ(LIZ);
                    }
                    list2.clear();
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("Handle message ");
                LIZ4.append(message2);
                X1D.LIZIZ(LIZ4);
                C39749Fir.LIZ();
                return;
            }
            new Handler(C16880lQ.LLJJJJ()).postAtFrontOfQueue(new ARunnableS42S0100000_6(message2, 78));
        }
    }
}
