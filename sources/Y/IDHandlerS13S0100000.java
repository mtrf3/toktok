package Y;

import X.BZI;
import X.C10740bW;
import X.C10750bX;
import X.C10760bY;
import X.C13E;
import X.C28787BRn;
import X.C29306Beo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.bytedance.android.live.core.monitor.PersistenceReporter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDHandlerS13S0100000 extends Handler {
    public final int $t;
    public Object l0;

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
                handleMessage$3(this, message);
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDHandlerS13S0100000(Looper looper, int i) {
        super(looper);
        this.$t = i;
        this.l0 = new HashMap(10);
    }

    public static final void handleMessage$0(IDHandlerS13S0100000 iDHandlerS13S0100000, Message msg) {
        o.LJIIIZ(msg, "msg");
        PersistenceReporter persistenceReporter = (PersistenceReporter) iDHandlerS13S0100000.l0;
        persistenceReporter.getClass();
        switch (msg.what) {
            case 10000:
                IDHandlerS13S0100000 iDHandlerS13S01000002 = persistenceReporter.LJII;
                if (iDHandlerS13S01000002 == null) {
                    iDHandlerS13S01000002 = persistenceReporter.LJIIIZ();
                }
                iDHandlerS13S01000002.sendEmptyMessageDelayed(10000, persistenceReporter.LIZIZ);
                persistenceReporter.LJI();
                return;
            case 10001:
                Object obj = msg.obj;
                if (!(obj instanceof String)) {
                    return;
                }
                persistenceReporter.LJIIJJI((String) obj, true);
                return;
            case 10002:
                Object obj2 = msg.obj;
                if (!(obj2 instanceof String)) {
                    return;
                }
                persistenceReporter.LJIIJJI((String) obj2, false);
                return;
            case 10003:
            default:
                return;
            case 10004:
                persistenceReporter.LJI();
                return;
            case 10005:
                if (persistenceReporter.LJFF.count() < persistenceReporter.LIZJ) {
                    return;
                }
                persistenceReporter.LJI();
                return;
        }
    }

    public static final void handleMessage$1(IDHandlerS13S0100000 iDHandlerS13S0100000, Message message) {
        int size;
        C10740bW[] c10740bWArr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        C10760bY c10760bY = (C10760bY) iDHandlerS13S0100000.l0;
        while (true) {
            synchronized (c10760bY.LIZIZ) {
                size = c10760bY.LIZLLL.size();
                if (size <= 0) {
                    return;
                }
                c10740bWArr = new C10740bW[size];
                c10760bY.LIZLLL.toArray(c10740bWArr);
                c10760bY.LIZLLL.clear();
            }
            int i = 0;
            do {
                C10740bW c10740bW = c10740bWArr[i];
                int size2 = c10740bW.LIZIZ.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C10750bX c10750bX = (C10750bX) ListProtector.get(c10740bW.LIZIZ, i2);
                    if (!c10750bX.LIZLLL) {
                        c10750bX.LIZIZ.onReceive(c10760bY.LIZ, c10740bW.LIZ);
                    }
                }
                i++;
            } while (i < size);
        }
    }

    public static final void handleMessage$2(IDHandlerS13S0100000 iDHandlerS13S0100000, Message message) {
        int i = message.what;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_performance_anchor_create_room_duration");
            LIZ.LJJIFFI((HashMap) iDHandlerS13S0100000.l0);
            LIZ.LJJIIJZLJL();
            iDHandlerS13S0100000.l0 = new HashMap(10);
            return;
        }
        Pair pair = (Pair) message.obj;
        ((HashMap) iDHandlerS13S0100000.l0).put(pair.first, pair.second);
    }

    public static final void handleMessage$3(IDHandlerS13S0100000 iDHandlerS13S0100000, Message msg) {
        o.LJIIIZ(msg, "msg");
        super.handleMessage(msg);
        if (msg.what == 10) {
            C29306Beo.LJJJJIZL(((C13E) iDHandlerS13S0100000.l0).LIZ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDHandlerS13S0100000(Object obj, Looper looper, int i) {
        super(looper);
        this.$t = i;
        this.l0 = obj;
    }
}
