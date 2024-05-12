package Y;

import X.C61522OCo;
import X.C61526OCs;
import X.C61527OCt;
import X.C62825OlB;
import X.C62826OlC;
import X.OAR;
import X.OC6;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class IDHandlerS22S0100000_10 extends Handler {
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

    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void handleMessage$0(Y.IDHandlerS22S0100000_10 r8, android.os.Message r9) {
        /*
            java.lang.String r0 = "msg"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            int r1 = r9.what
            java.lang.Object r7 = r8.l0
            X.Org r7 = (X.C63228Org) r7
            int r0 = r7.LIZIZ
            if (r1 != r0) goto L95
            java.util.List<? extends X.4Rq> r0 = r7.LIZLLL
            java.util.Iterator r6 = r0.iterator()
            r4 = 0
        L17:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r3 = r6.next()
            X.4Rq r3 = (X.C109544Rq) r3
            boolean r0 = r3.isSelf()
            if (r0 == 0) goto L17
            long r1 = r3.getIndex()
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L17
            long r4 = r3.getIndex()
            goto L17
        L36:
            java.lang.String r1 = r7.LIZ
            java.lang.String r0 = "cid"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.Long, X.OqO>> r0 = X.C115374ft.LIZ
            java.lang.Object r0 = r0.get(r1)
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            if (r0 == 0) goto L54
            java.util.Collection r0 = r0.values()
            if (r0 == 0) goto L54
            java.util.List r0 = X.ORZ.LLJI(r0)
            if (r0 != 0) goto L96
        L54:
            r2 = 1
        L55:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = " ConvReadInfoHelperSingleConReadInfoHelper cid = "
            r1.append(r0)
            java.lang.Object r0 = r8.l0
            X.Org r0 = (X.C63228Org) r0
            java.lang.String r0 = r0.LIZ
            r1.append(r0)
            java.lang.String r0 = " shouldQueryMsg = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C63322OtC.LIZ(r0)
            if (r2 == 0) goto L8a
            java.lang.Object r0 = r8.l0
            X.Org r0 = (X.C63228Org) r0
            r0.getClass()
            X.Osy r0 = X.C63308Osy.LJI()
            X.4eO r0 = r0.LIZLLL()
            r0.getClass()
        L8a:
            java.lang.Object r0 = r8.l0
            X.Org r0 = (X.C63228Org) r0
            int r2 = r0.LIZIZ
            long r0 = r0.LIZJ
            r8.sendEmptyMessageDelayed(r2, r0)
        L95:
            return
        L96:
            java.util.Iterator r3 = r0.iterator()
        L9a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lad
            java.lang.Object r0 = r3.next()
            X.OqO r0 = (X.C63148OqO) r0
            long r1 = r0.LJLJJI
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L9a
            goto L54
        Lad:
            r2 = 0
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDHandlerS22S0100000_10.handleMessage$0(Y.IDHandlerS22S0100000_10, android.os.Message):void");
    }

    public static final void handleMessage$1(IDHandlerS22S0100000_10 iDHandlerS22S0100000_10, Message message) {
        super.handleMessage(message);
        if (message.arg1 == 3) {
            OC6.LIZ("gecko-debug-tag", "[loop]loop msg.what:", Integer.valueOf(message.what), "interval:", Integer.valueOf(((C61522OCo) iDHandlerS22S0100000_10.l0).LIZLLL), "time:", Long.valueOf(System.currentTimeMillis()));
            Map<String, C61526OCs> map = ((C61522OCo) iDHandlerS22S0100000_10.l0).LJ;
            if (map == null || ((ConcurrentHashMap) map).isEmpty()) {
                return;
            }
            C61522OCo c61522OCo = (C61522OCo) iDHandlerS22S0100000_10.l0;
            C61527OCt c61527OCt = c61522OCo.LJFF;
            if (c61527OCt != null) {
                OAR.LIZ.LIZ().execute(new ARunnableS29S0200000_10(c61522OCo.LJ, c61527OCt, 60));
            }
            C61522OCo c61522OCo2 = (C61522OCo) iDHandlerS22S0100000_10.l0;
            c61522OCo2.LIZJ.set(true);
            Message obtainMessage = c61522OCo2.LIZ.obtainMessage();
            obtainMessage.what = c61522OCo2.LIZLLL;
            obtainMessage.arg1 = 3;
            c61522OCo2.LIZ.sendMessageDelayed(obtainMessage, r0 * 1000);
        }
    }

    public static final void handleMessage$2(IDHandlerS22S0100000_10 iDHandlerS22S0100000_10, Message msg) {
        o.LJIIIZ(msg, "msg");
        if (msg.what == 1) {
            ((C62826OlC) iDHandlerS22S0100000_10.l0).LIZJ(false);
        }
        super.handleMessage(msg);
    }

    public static final void handleMessage$3(IDHandlerS22S0100000_10 iDHandlerS22S0100000_10, Message msg) {
        o.LJIIIZ(msg, "msg");
        if (msg.what == 1) {
            ((C62825OlB) iDHandlerS22S0100000_10.l0).LIZIZ(false);
        }
        super.handleMessage(msg);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDHandlerS22S0100000_10(Object obj, Looper looper, int i) {
        super(looper);
        this.$t = i;
        this.l0 = obj;
    }
}
