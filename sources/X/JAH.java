package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class JAH extends AbstractC65781Prl implements InterfaceC65784Pro<AbstractC73946T0k> {
    public static final JAH LJLIL = new JAH();

    public JAH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final AbstractC73946T0k invoke() {
        JAG.LJFF.getClass();
        return new C73950T0o(new PThreadPoolExecutor(((Number) JAG.LIZJ.getValue()).intValue(), ((Number) JAG.LIZLLL.getValue()).intValue(), 0L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new DefaultThreadFactory("Schedulers$defaultScheduler$2")));
    }
}
