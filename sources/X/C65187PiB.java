package X;

import android.content.Context;
import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.scribe.ScribeFilesSender;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.PiB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65187PiB {
    public final ConcurrentHashMap<Long, C65191PiF> LIZ = new ConcurrentHashMap<>(2);
    public final Context LIZIZ;
    public final ScheduledExecutorService LIZJ;
    public final C65077PgP LIZLLL;
    public final C65192PiG LJ;
    public final TwitterAuthConfig LJFF;
    public final InterfaceC65283Pjj<? extends Session<TwitterAuthToken>> LJI;
    public final C65254PjG LJII;
    public final C65266PjS LJIIIIZZ;

    public final C65191PiF LIZ(long j) {
        if (!this.LIZ.containsKey(Long.valueOf(j))) {
            ConcurrentHashMap<Long, C65191PiF> concurrentHashMap = this.LIZ;
            Long valueOf = Long.valueOf(j);
            Context context = this.LIZIZ;
            File LLIIJLIL = C16880lQ.LLIIJLIL((Context) new C56330M8w(context, 3).LIZ);
            if (LLIIJLIL != null) {
                if (!LLIIJLIL.exists() && !LLIIJLIL.mkdirs()) {
                    C65265PjR.LIZIZ().getClass();
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(j);
                LIZ.append("_se.tap");
                String LIZIZ = X1D.LIZIZ(LIZ);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(j);
                LIZ2.append("_se_to_send");
                C65188PiC c65188PiC = new C65188PiC(context, LIZIZ, LLIIJLIL, X1D.LIZIZ(LIZ2));
                Context context2 = this.LIZIZ;
                C65192PiG c65192PiG = this.LJ;
                C54845Lfl c54845Lfl = new C54845Lfl();
                this.LIZLLL.getClass();
                C65190PiE c65190PiE = new C65190PiE(context2, c65192PiG, c54845Lfl, c65188PiC);
                Context context3 = this.LIZIZ;
                this.LIZLLL.getClass();
                C78841Uwv.LJJ(this.LIZIZ);
                Context context4 = this.LIZIZ;
                ScheduledExecutorService scheduledExecutorService = this.LIZJ;
                C65077PgP c65077PgP = this.LIZLLL;
                concurrentHashMap.putIfAbsent(valueOf, new C65191PiF(context3, new C65186PiA(context4, scheduledExecutorService, c65190PiE, c65077PgP, new ScribeFilesSender(context4, c65077PgP, j, this.LJFF, this.LJI, this.LJII, scheduledExecutorService, this.LJIIIIZZ)), c65190PiE, this.LIZJ));
            } else {
                C65265PjR.LIZIZ().getClass();
            }
            LLIIJLIL = null;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(j);
            LIZ3.append("_se.tap");
            String LIZIZ2 = X1D.LIZIZ(LIZ3);
            StringBuilder LIZ22 = X1D.LIZ();
            LIZ22.append(j);
            LIZ22.append("_se_to_send");
            C65188PiC c65188PiC2 = new C65188PiC(context, LIZIZ2, LLIIJLIL, X1D.LIZIZ(LIZ22));
            Context context22 = this.LIZIZ;
            C65192PiG c65192PiG2 = this.LJ;
            C54845Lfl c54845Lfl2 = new C54845Lfl();
            this.LIZLLL.getClass();
            C65190PiE c65190PiE2 = new C65190PiE(context22, c65192PiG2, c54845Lfl2, c65188PiC2);
            Context context32 = this.LIZIZ;
            this.LIZLLL.getClass();
            C78841Uwv.LJJ(this.LIZIZ);
            Context context42 = this.LIZIZ;
            ScheduledExecutorService scheduledExecutorService2 = this.LIZJ;
            C65077PgP c65077PgP2 = this.LIZLLL;
            concurrentHashMap.putIfAbsent(valueOf, new C65191PiF(context32, new C65186PiA(context42, scheduledExecutorService2, c65190PiE2, c65077PgP2, new ScribeFilesSender(context42, c65077PgP2, j, this.LJFF, this.LJI, this.LJII, scheduledExecutorService2, this.LJIIIIZZ)), c65190PiE2, this.LIZJ));
        }
        return this.LIZ.get(Long.valueOf(j));
    }

    public C65187PiB(C43862HJi c43862HJi, ScheduledExecutorService scheduledExecutorService, C65077PgP c65077PgP, C65192PiG c65192PiG, TwitterAuthConfig twitterAuthConfig, C65264PjQ c65264PjQ, C65254PjG c65254PjG, C65266PjS c65266PjS) {
        this.LIZIZ = c43862HJi;
        this.LIZJ = scheduledExecutorService;
        this.LIZLLL = c65077PgP;
        this.LJ = c65192PiG;
        this.LJFF = twitterAuthConfig;
        this.LJI = c65264PjQ;
        this.LJII = c65254PjG;
        this.LJIIIIZZ = c65266PjS;
    }
}
