package X;

import android.content.Context;
import android.content.res.Resources;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.PjR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65265PjR {
    public static final C44432HcC LJII = new C44432HcC();
    public static volatile C65265PjR LJIIIIZZ;
    public final Context LIZ;
    public final C65266PjS LIZIZ;
    public final PThreadPoolExecutor LIZJ;
    public final TwitterAuthConfig LIZLLL;
    public final C65272PjY LJ;
    public final C44432HcC LJFF;
    public final boolean LJI;

    public static C65265PjR LIZ() {
        try {
            KFD kfd = new KFD(AppLog.getInstallId());
            C66501Q8b c66501Q8b = C66501Q8b.LIZ;
            Context LIZIZ = EF7.LIZIZ();
            c66501Q8b.getClass();
            C66501Q8b.LIZ(LIZIZ, kfd);
        } catch (Exception unused) {
        }
        if (LJIIIIZZ == null) {
            throw new IllegalStateException("Must initialize Twitter before using getInstance()");
        }
        return LJIIIIZZ;
    }

    public static C44432HcC LIZIZ() {
        if (LJIIIIZZ == null) {
            return LJII;
        }
        return LJIIIIZZ.LJFF;
    }

    public C65265PjR(C65273PjZ c65273PjZ) {
        String str;
        int LJIJI;
        int LJIJI2;
        Context context = c65273PjZ.LIZ;
        this.LIZ = context;
        this.LIZIZ = new C65266PjS(context);
        this.LJ = new C65272PjY(context);
        TwitterAuthConfig twitterAuthConfig = c65273PjZ.LIZIZ;
        if (twitterAuthConfig == null) {
            Resources resources = context.getResources();
            String str2 = "";
            if (resources == null || (LJIJI2 = C78841Uwv.LJIJI(context, "com.twitter.sdk.android.CONSUMER_KEY", "string")) <= 0) {
                str = "";
            } else {
                str = resources.getString(LJIJI2);
            }
            Resources resources2 = context.getResources();
            if (resources2 != null && (LJIJI = C78841Uwv.LJIJI(context, "com.twitter.sdk.android.CONSUMER_SECRET", "string")) > 0) {
                str2 = resources2.getString(LJIJI);
            }
            this.LIZLLL = new TwitterAuthConfig(str, str2);
        } else {
            this.LIZLLL = twitterAuthConfig;
        }
        PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(FSG.LIZ, FSG.LIZIZ, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC39009FSr("twitter-worker", new AtomicLong(1L)));
        FSG.LIZ("twitter-worker", pThreadPoolExecutor);
        this.LIZJ = pThreadPoolExecutor;
        this.LJFF = LJII;
        Boolean bool = c65273PjZ.LIZJ;
        if (bool == null) {
            this.LJI = false;
        } else {
            this.LJI = bool.booleanValue();
        }
    }
}
