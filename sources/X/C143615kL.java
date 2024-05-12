package X;

import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5kL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C143615kL {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new C143615kL();
        C16880lQ.LJLLILLLL(C143615kL.class);
        PThreadExecutorsUtils.newSingleThreadScheduledExecutor(new DefaultThreadFactory("ActivityLifecycleTracker"));
        new AtomicInteger(0);
        new AtomicBoolean(false);
    }
}
