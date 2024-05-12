package X;

import Y.ARunnableS45S0100000_9;
import android.os.Handler;
import android.os.Looper;
import com.ss.android.ugc.aweme.legoImp.task.LiveBootFinishSettingTask;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LZI extends C112554bL {
    public final /* synthetic */ LiveBootFinishSettingTask LIZ;

    public LZI(LiveBootFinishSettingTask liveBootFinishSettingTask) {
        this.LIZ = liveBootFinishSettingTask;
    }

    @Override // X.C112554bL, X.InterfaceC86533Xxh
    public final void LJIIJ(EnumC86518XxS trigger, boolean z) {
        o.LJIIIZ(trigger, "trigger");
        if (trigger == EnumC86518XxS.COLD_START || trigger == EnumC86518XxS.WARM_START || trigger == EnumC86518XxS.ACCOUNT_LOGIN) {
            LiveBootFinishSettingTask liveBootFinishSettingTask = this.LIZ;
            liveBootFinishSettingTask.LJLIL = true;
            if (z) {
                Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    myLooper = C16880lQ.LLJJJJ();
                }
                Handler handler = new Handler(myLooper);
                LiveBootFinishSettingTask liveBootFinishSettingTask2 = this.LIZ;
                handler.postDelayed(new ARunnableS45S0100000_9(liveBootFinishSettingTask2, 69), ((Number) liveBootFinishSettingTask2.LJLJI.getValue()).longValue());
                return;
            }
            liveBootFinishSettingTask.LJ(true);
        }
    }
}
