package X;

import android.content.Context;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.J5q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48602J5q {
    public static boolean LIZ;
    public static Context LIZIZ;
    public static ScheduledExecutorService LIZJ;

    public static ScheduledExecutorService LIZ() {
        if (LIZJ == null) {
            LIZJ = PThreadExecutorsUtils.newSingleThreadScheduledExecutor(new DefaultThreadFactory("PortraitUtils"));
        }
        return LIZJ;
    }
}
