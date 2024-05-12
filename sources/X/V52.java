package X;

import android.os.Handler;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.port.in.ISchedulerService;
import java.util.concurrent.Callable;

/* loaded from: classes14.dex */
public final /* synthetic */ class V52 implements ISchedulerService, InterfaceC46754IWo {
    @Override // com.ss.android.ugc.aweme.port.in.ISchedulerService
    public void schedule(Handler handler, Callable callable, int i) {
        AVServiceProxyImpl.lambda$getSchedulerService$0(handler, callable, i);
    }

    public static void LIZ(C35931b3 c35931b3, boolean z, boolean z2, boolean z3, boolean z4) {
        c35931b3.LJJJJJ(z);
        c35931b3.LJJJJJ(z2);
        c35931b3.LJIJ();
        c35931b3.LJJJJJ(z3);
        c35931b3.LJJJJJ(z4);
    }
}
