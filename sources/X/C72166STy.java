package X;

import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.ExecutorService;

/* renamed from: X.STy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72166STy extends AbstractC65781Prl implements InterfaceC65784Pro<ExecutorService> {
    public static final C72166STy LJLIL = new C72166STy();

    public C72166STy() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ExecutorService invoke() {
        return PThreadExecutorsUtils.newCachedThreadPool(new DefaultThreadFactory("AIGCPollingTask$Companion$executor$2"));
    }
}
