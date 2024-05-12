package X;

import android.app.Application;
import com.bytedance.helios.api.config.ApiStatistics;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import java.util.ArrayList;
import java.util.Properties;
import kotlin.jvm.internal.o;

/* renamed from: X.Pwe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC66084Pwe implements Runnable {
    public final /* synthetic */ Throwable LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ Long LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ C66120PxE LJLJJLL;
    public final /* synthetic */ C66085Pwf LJLJL;
    public final /* synthetic */ String LJLJLJ;

    public RunnableC66084Pwe(Throwable th, String str, String str2, Long l, String str3, C66120PxE c66120PxE, C66085Pwf c66085Pwf, String str4) {
        this.LJLIL = th;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = l;
        this.LJLJJL = str3;
        this.LJLJJLL = c66120PxE;
        this.LJLJL = c66085Pwf;
        this.LJLJLJ = str4;
    }

    public final void LIZ() {
        long j;
        String userId;
        int i;
        try {
            if (C66083Pwd.LJI == null) {
                HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
                o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
                Application ctx = heliosEnvImpl.LJIIIIZZ;
                Properties properties = new Properties();
                o.LJIIIIZZ(ctx, "ctx");
                properties.load(ctx.getAssets().open("slardar.properties"));
                C66083Pwd.LJI = String.valueOf(properties.get("release_build"));
            }
            if (C66083Pwd.LJII == null) {
                HeliosEnvImpl heliosEnvImpl2 = HeliosEnvImpl.get();
                o.LJIIIIZZ(heliosEnvImpl2, "HeliosEnvImpl.get()");
                Application ctx2 = heliosEnvImpl2.LJIIIIZZ;
                Properties properties2 = new Properties();
                o.LJIIIIZZ(ctx2, "ctx");
                properties2.load(ctx2.getAssets().open("ss.properties"));
                C66083Pwd.LJII = String.valueOf(properties2.get("commit"));
                System.out.println(properties2.get("commit"));
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        String LIZIZ = C37115EhT.LIZIZ(this.LJLIL);
        C66085Pwf c66085Pwf = new C66085Pwf(this.LJLILLLLZI, this.LJLJI);
        Long callTime = this.LJLJJI;
        o.LJIIIIZZ(callTime, "callTime");
        c66085Pwf.LIZ(callTime.longValue(), this.LJLJJL, this.LJLJJLL.LJLLI, LIZIZ);
        ApiStatistics apiStatistics = C66083Pwd.LIZLLL;
        if (apiStatistics != null) {
            j = apiStatistics.factTimeOut;
        } else {
            j = 30000;
        }
        C66085Pwf c66085Pwf2 = this.LJLJL;
        if (c66085Pwf2 != null) {
            String str = c66085Pwf2.LIZ;
            HeliosEnvImpl heliosEnvImpl3 = HeliosEnvImpl.get();
            o.LJIIIIZZ(heliosEnvImpl3, "HeliosEnvImpl.get()");
            InterfaceC66086Pwg interfaceC66086Pwg = heliosEnvImpl3.LIZIZ;
            if (interfaceC66086Pwg == null) {
                userId = "null";
            } else {
                userId = interfaceC66086Pwg.getUserId();
            }
            boolean z = true;
            if (!(!o.LJ(str, userId))) {
                C66085Pwf c66085Pwf3 = this.LJLJL;
                c66085Pwf3.getClass();
                if (c66085Pwf3.LIZJ == c66085Pwf.LIZJ) {
                    z = false;
                }
                if (!z) {
                    C66085Pwf c66085Pwf4 = this.LJLJL;
                    Long callTime2 = this.LJLJJI;
                    o.LJIIIIZZ(callTime2, "callTime");
                    c66085Pwf4.LIZ(callTime2.longValue(), this.LJLJJL, this.LJLJJLL.LJLLI, LIZIZ);
                    int size = ((ArrayList) this.LJLJL.LJFF).size();
                    ApiStatistics apiStatistics2 = C66083Pwd.LIZLLL;
                    if (apiStatistics2 != null) {
                        i = apiStatistics2.factQueueSize;
                    } else {
                        i = 100;
                    }
                    if (size >= i) {
                        C66083Pwd.LJ(this.LJLJLJ, "oversize", this.LJLJL, 0L);
                        return;
                    } else {
                        C66083Pwd.LJ(this.LJLJLJ, "timeout", this.LJLJL, j);
                        return;
                    }
                }
                C66083Pwd.LJ(this.LJLJLJ, "change", this.LJLJL, 0L);
                C66083Pwd.LJ.put(this.LJLJLJ, c66085Pwf);
                return;
            }
        }
        C66083Pwd.LJ.put(this.LJLJLJ, c66085Pwf);
        C66083Pwd.LJ(this.LJLJLJ, "timeout", c66085Pwf, j);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
