package Y;

import X.C115374ft;
import X.C16880lQ;
import X.C2NO;
import X.C3E6;
import X.C62828OlE;
import X.C63308Osy;
import X.C98693u5;
import X.C98843uK;
import X.C99453vJ;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDHandlerS6S0000000_1 extends Handler {
    public final int $t;

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        switch (this.$t) {
            case 3:
                dispatchMessage$0(this, message);
                return;
            default:
                super.dispatchMessage(message);
                return;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                handleMessage$0(this, message);
                return;
            case 1:
                handleMessage$1(this, message);
                return;
            case 2:
                handleMessage$2(this, message);
                return;
            case 3:
            default:
                super.handleMessage(message);
                return;
            case 4:
                handleMessage$3(this, message);
                return;
        }
    }

    public IDHandlerS6S0000000_1(int i) {
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDHandlerS6S0000000_1(Looper looper, int i) {
        super(looper);
        this.$t = i;
    }

    public static final void dispatchMessage$0(IDHandlerS6S0000000_1 iDHandlerS6S0000000_1, Message msg) {
        o.LJIIIZ(msg, "msg");
        try {
            super.dispatchMessage(msg);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static final void handleMessage$0(IDHandlerS6S0000000_1 iDHandlerS6S0000000_1, Message msg) {
        o.LJIIIZ(msg, "msg");
        if (msg.what == 1) {
            List<String> cidList = C115374ft.LIZIZ;
            o.LJIIIZ(cidList, "cidList");
            C63308Osy.LJI().LIZLLL().getClass();
            ((ArrayList) cidList).clear();
        }
    }

    public static final void handleMessage$1(IDHandlerS6S0000000_1 iDHandlerS6S0000000_1, Message msg) {
        o.LJIIIZ(msg, "msg");
        Iterator<C2NO> it = C62828OlE.LJLLILLLL.iterator();
        while (it.hasNext()) {
            it.next().LJLIIIL();
        }
    }

    public static final void handleMessage$2(IDHandlerS6S0000000_1 iDHandlerS6S0000000_1, Message msg) {
        o.LJIIIZ(msg, "msg");
        super.handleMessage(msg);
        if (msg.what == 220) {
            C3E6.LJ();
        }
    }

    public static final void handleMessage$3(IDHandlerS6S0000000_1 iDHandlerS6S0000000_1, Message msg) {
        C98843uK c98843uK;
        o.LJIIIZ(msg, "msg");
        Object obj = msg.obj;
        if (!(obj instanceof C98843uK) || (c98843uK = (C98843uK) obj) == null) {
            return;
        }
        ConcurrentHashMap<String, C98843uK> concurrentHashMap = C98693u5.LIZJ;
        if (concurrentHashMap.containsKey(c98843uK.LIZ)) {
            concurrentHashMap.remove(c98843uK.LIZ);
        }
        Iterator<C99453vJ> it = C98693u5.LJFF.iterator();
        while (it.hasNext()) {
            C99453vJ next = it.next();
            if (o.LJ(c98843uK.LIZ, next.getConversationId())) {
                next.LIZJ = false;
                next.LJ = 0L;
                next.LJFF = 0L;
            }
        }
        C98693u5.LIZIZ(c98843uK.LIZ, false);
    }
}
