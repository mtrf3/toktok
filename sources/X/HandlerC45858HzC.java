package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.HzC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class HandlerC45858HzC extends Handler {
    public HandlerC45858HzC(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        InterfaceC45863HzH poll;
        FAG fag;
        o.LJIIIZ(msg, "msg");
        super.handleMessage(msg);
        int i = msg.what;
        EnumC45861HzF enumC45861HzF = EnumC45861HzF.TASK_EXEC;
        if (i == enumC45861HzF.ordinal()) {
            if (C45866HzK.LIZIZ() && C45857HzB.LIZLLL) {
                return;
            }
            if (C45866HzK.LIZIZ()) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) C45857HzB.LJFF;
                FAG fag2 = (FAG) linkedHashMap.get(EnumC45752HxU.P1);
                if ((fag2 == null || (poll = fag2.poll()) == null) && ((fag = (FAG) linkedHashMap.get(EnumC45752HxU.P2)) == null || (poll = fag.poll()) == null)) {
                    return;
                }
            } else {
                poll = C45857HzB.LJ.poll();
                if (poll == null) {
                    return;
                }
            }
            C79057V0z.LJJIZ(poll);
            HandlerC45858HzC handlerC45858HzC = C45857HzB.LJII;
            Message obtain = Message.obtain();
            obtain.what = enumC45861HzF.ordinal();
            handlerC45858HzC.sendMessageDelayed(obtain, ((Number) C45857HzB.LIZ.getValue()).longValue());
        }
    }
}
