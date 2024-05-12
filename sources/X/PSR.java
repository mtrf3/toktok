package X;

import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.ExecutorService;

/* loaded from: classes12.dex */
public final class PSR {
    public static final ExecutorService LIZIZ = PThreadExecutorsUtils.newCachedThreadPool(new DefaultThreadFactory("EventBusBuilder"));
    public final ExecutorService LIZ = LIZIZ;
}
