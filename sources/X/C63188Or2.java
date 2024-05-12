package X;

import android.os.Looper;
import android.text.TextUtils;
import java.util.List;

/* renamed from: X.Or2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63188Or2 implements InterfaceC63352Otg<List<C109544Rq>> {
    public final /* synthetic */ C109544Rq LJLIL;
    public final /* synthetic */ List LJLILLLLZI;
    public final /* synthetic */ C63220OrY LJLJI;

    @Override // X.InterfaceC63352Otg
    public final List<C109544Rq> LIZIZ() {
        C63322OtC.LJFF("MessageModel onGetMessage, onRun");
        C115944go LIZJ = C115944go.LIZJ();
        String str = this.LJLJI.LJLIL;
        C109544Rq c109544Rq = this.LJLIL;
        List<C109544Rq> list = this.LJLILLLLZI;
        synchronized (LIZJ) {
            Long l = null;
            int i = 0;
            if (!TextUtils.isEmpty(str) && !V1B.LJJZZIII(list) && c109544Rq != null) {
                if (C16880lQ.LLJJJJ() == Looper.myLooper() && C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
                    i = 1;
                }
                if (i != 0) {
                    StringBuilder sb = new StringBuilder(100);
                    StackTraceElement[] stackTrace = C16880lQ.LLLLIIIILLL().getStackTrace();
                    for (int i2 = 1; i2 < stackTrace.length; i2++) {
                        sb.append(stackTrace[i2].getClassName());
                        sb.append(".");
                        sb.append(stackTrace[i2].getMethodName());
                        sb.append("  lines = ");
                        sb.append(stackTrace[i2].getLineNumber());
                        sb.append("\n");
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("can not be call in main thread! trace = \n");
                    LIZ.append(sb.toString());
                    C63322OtC.LJI("imsdk", X1D.LIZIZ(LIZ), null);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("can not be call in main thread! trace = ");
                    LIZ2.append(sb.toString());
                    throw new Error(X1D.LIZIZ(LIZ2));
                }
                C63291Osh.LIZ().getClass();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("LeakMsgRepairManager onModelGetMsg no recent mode, cid:");
                LIZ3.append(str);
                C63322OtC.LJFF(X1D.LIZIZ(LIZ3));
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("LeakMsgRepairManager onModelGetMsg invalid, cid:");
            LIZ4.append(str);
            LIZ4.append(", list:");
            if (list != null) {
                i = list.size();
            }
            LIZ4.append(i);
            LIZ4.append(", lastMessage:");
            if (c109544Rq != null) {
                l = Long.valueOf(c109544Rq.getIndexInConversationV2());
            }
            LIZ4.append(l);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ4));
        }
        return list;
    }

    public C63188Or2(C63220OrY c63220OrY, long j, C109544Rq c109544Rq, List list) {
        this.LJLJI = c63220OrY;
        this.LJLIL = c109544Rq;
        this.LJLILLLLZI = list;
    }
}
