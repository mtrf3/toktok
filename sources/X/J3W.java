package X;

import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes9.dex */
public class J3W {
    public static final ScheduledExecutorService LIZ = PThreadExecutorsUtils.newSingleThreadScheduledExecutor(new DefaultThreadFactory("MLTask$Default$Holder"));
}
