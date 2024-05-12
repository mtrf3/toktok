package X;

import Y.IDRunnableS65S0000000;
import android.content.Context;
import com.benchmark.bytemonitor.BatteryMonitor;
import com.benchmark.bytemonitor.nativePort.ByteMonitorPort;
import com.benchmark.network.BXNetWorkController;
import com.benchmark.port.nativePort.ApplogUtilsInvoker;
import com.benchmark.port.nativePort.LogcatInvoker;
import com.benchmark.runtime.nativePort.ByteBenchContextPort;
import com.benchmark.strategy.BXPitayaHandler;
import com.benchmark.strategy.BXVmsdkHandler;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.OkHttp3SecurityFactorInterceptor;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaBuilder;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0Zf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09590Zf {
    public static volatile C09590Zf LJIILLIIL;
    public Context LIZ;
    public String LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public String LJ;
    public long LJFF;
    public String LJI;
    public String LJII;
    public java.util.Map<String, String> LJIIIIZZ;
    public boolean LJIIIZ = true;
    public final AtomicBoolean LJIIJ = new AtomicBoolean(false);
    public final ByteBenchContextPort LJIIJJI = new ByteBenchContextPort();
    public boolean LJIIL;
    public byte LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;

    static {
        C32771Qj.LIZ();
        if (!C32771Qj.LIZIZ) {
            C32771Qj.LIZ();
        }
        LJIILLIIL = new C09590Zf();
    }

    public C09590Zf() {
        new AtomicBoolean(false);
        this.LJIIL = true;
        this.LJIILIIL = (byte) 7;
    }

    public final boolean LIZIZ() {
        if (!C09220Xu.LIZ()) {
            return false;
        }
        if (this.LJIIJ.get()) {
            return true;
        }
        synchronized (this) {
            if (!this.LJIIJ.get()) {
                C264211y c264211y = C09220Xu.LIZIZ;
                if (c264211y == null) {
                    return false;
                }
                LIZ(c264211y);
                this.LJIIJ.set(true);
            }
            return true;
        }
    }

    public final void LIZ(C264211y c264211y) {
        this.LIZ = c264211y.LIZ;
        this.LIZIZ = c264211y.LIZJ;
        this.LIZJ = c264211y.LIZLLL;
        this.LIZLLL = c264211y.LJ;
        this.LJ = c264211y.LJFF;
        this.LJFF = c264211y.LJI;
        this.LJI = c264211y.LJII;
        this.LJII = c264211y.LJIIIIZZ;
        this.LJIILIIL = c264211y.LJIIIZ;
        this.LJIIL = c264211y.LJIIJ;
        this.LJIILJJIL = c264211y.LJIIJJI;
        this.LJIILL = c264211y.LIZIZ;
        this.LJIIIIZZ = c264211y.LJIIL;
        this.LJIIIZ = c264211y.LJIILIIL;
        this.LJIIJJI.LIZ(this);
        KevaBuilder.getInstance().setContext(this.LIZ);
        Keva.forceInit();
        C0TB LIZIZ = C0TB.LIZIZ();
        String str = this.LJIILL;
        LIZIZ.getClass();
        LIZIZ.LIZ = C65083PgV.LJIIL(str);
        C64601PWz c64601PWz = new C64601PWz();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c64601PWz.connectTimeout(60000L, timeUnit);
        c64601PWz.readTimeout(60000L, timeUnit);
        c64601PWz.retryOnConnectionFailure(true);
        c64601PWz.addNetworkInterceptor(new OkHttp3SecurityFactorInterceptor());
        c64601PWz.protocols(Collections.singletonList(EnumC64572PVw.HTTP_1_1));
        if (!new C03880Dg(2).LIZJ(400100, "okhttp3/OkHttpClient$Builder", "build", c64601PWz, new Object[0], "okhttp3.OkHttpClient", new C65300Pk0(false, "()Lokhttp3/OkHttpClient;", "-3005211928576661510")).LIZ) {
            c64601PWz.build();
        }
        BXVmsdkHandler.LIZ();
        C47261Igj.LJJJI("ByteBench", this.LJIILIIL);
        LogcatInvoker.LIZ(this.LJIILIIL);
        BXNetWorkController.init();
        ApplogUtilsInvoker.Init();
        Context context = this.LIZ;
        if (C269013u.LIZ == null) {
            synchronized (C269013u.class) {
                if (C269013u.LIZ == null) {
                    C269013u.LIZ = new BatteryMonitor(context);
                }
            }
        }
        BatteryMonitor batteryMonitor = C269013u.LIZ;
        if (batteryMonitor != null) {
            ByteMonitorPort.nativeInit(batteryMonitor);
        }
        BXPitayaHandler.InitPitayaHandler();
        C1FP.LJLIL = C16880lQ.LLLLZLLIL();
        C1FP.LJLILLLLZI = new HashSet();
        C1FP.LJLIL.execute(new IDRunnableS65S0000000(1));
        C47261Igj.LJJIIJ("ByteBench");
    }
}
