package X;

import android.app.Application;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X8O {
    public boolean LIZ;
    public final X8I LIZIZ;
    public InterfaceC65784Pro<? extends ExecutorService> LIZJ;
    public final HashMap<Class<?>, X8R<?>> LIZLLL;
    public final Application LJ;

    public X8O(AwemeHostApplication app) {
        o.LJIIJ(app, "app");
        this.LJ = app;
        this.LIZIZ = new X8I();
        this.LIZLLL = new HashMap<>();
    }
}
