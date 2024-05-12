package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.FOd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38891FOd {
    public final PThreadPoolExecutor LIZ = new PThreadPoolExecutor(3, 5, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC38890FOc());
}
