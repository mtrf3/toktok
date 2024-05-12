package X;

import android.os.Handler;
import android.os.Message;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.HzD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class HandlerC45859HzD extends Handler {
    public HandlerC45859HzD() {
        super(C16880lQ.LLJJJJ());
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        super.handleMessage(msg);
        int i = msg.what;
        EnumC45860HzE enumC45860HzE = EnumC45860HzE.RECORD_ON_FIRST_FRAME;
        if (i == enumC45860HzE.ordinal()) {
            HandlerC45858HzC handlerC45858HzC = C45857HzB.LJII;
            Message obtain = Message.obtain();
            obtain.what = EnumC45861HzF.TASK_EXEC.ordinal();
            handlerC45858HzC.sendMessageDelayed(obtain, 200L);
            return;
        }
        if (i == EnumC45860HzE.RECORD_ON_RESUME.ordinal()) {
            if (!C45866HzK.LIZIZ()) {
                return;
            }
            C45857HzB.LIZLLL = false;
            if (C45857HzB.LIZJ.ordinal() != enumC45860HzE.ordinal()) {
                return;
            }
            HandlerC45858HzC handlerC45858HzC2 = C45857HzB.LJII;
            Message obtain2 = Message.obtain();
            obtain2.what = EnumC45861HzF.TASK_EXEC.ordinal();
            handlerC45858HzC2.sendMessageDelayed(obtain2, 200L);
            return;
        }
        if (i == EnumC45860HzE.RECORD_ON_PAUSE.ordinal()) {
            if (!C45866HzK.LIZIZ()) {
                return;
            }
            C45857HzB.LIZLLL = true;
            C45857HzB.LJI.removeCallbacksAndMessages(null);
            C45857HzB.LJII.removeCallbacksAndMessages(null);
            return;
        }
        if (i != EnumC45860HzE.RECORD_ON_DESTROY.ordinal()) {
            return;
        }
        C45857HzB.LIZJ = EnumC45860HzE.RECORD_ON_NONE;
        if (C45866HzK.LIZIZ()) {
            ((LinkedHashMap) C45857HzB.LJFF).clear();
        } else {
            C45857HzB.LJ.clear();
        }
        C45857HzB.LJI.removeCallbacksAndMessages(null);
        C45857HzB.LJII.removeCallbacksAndMessages(null);
    }
}
