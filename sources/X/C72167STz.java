package X;

import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.STz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72167STz extends AbstractC65781Prl implements InterfaceC65784Pro<ScheduledExecutorService> {
    public static final C72167STz LJLIL = new C72167STz();

    public C72167STz() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ScheduledExecutorService invoke() {
        return PThreadExecutorsUtils.newSingleThreadScheduledExecutor(new DefaultThreadFactory("AIGCAvatarServiceImpl$executor$2"));
    }
}
