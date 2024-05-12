package X;

import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.FGq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38696FGq {
    public static final ScheduledExecutorService LIZ = PThreadExecutorsUtils.newSingleThreadScheduledExecutor(new DefaultThreadFactory("atform/Worker"));

    public static Future LIZ(Runnable runnable) {
        return LIZ.submit(runnable);
    }
}
