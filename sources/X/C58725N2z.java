package X;

import android.app.Application;
import com.ss.android.ugc.aweme.IAccountInitializer;
import com.ss.android.ugc.aweme.app.accountsdk.AccountInitializer;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.N2z, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58725N2z {
    public static Application LIZ;
    public static InterfaceC36484ETo LIZIZ;
    public static InterfaceC252619vl LIZJ;
    public static ConcurrentHashMap<Class<?>, ServiceProvider<?>> LIZLLL;
    public static InterfaceC58114MrO LJ;

    static {
        IAccountInitializer iAccountInitializer;
        Object LIZ2 = C58096Mr6.LIZ(IAccountInitializer.class, false);
        if (LIZ2 != null) {
            iAccountInitializer = (IAccountInitializer) LIZ2;
        } else {
            if (C58096Mr6.LLIILZL == null) {
                synchronized (IAccountInitializer.class) {
                    if (C58096Mr6.LLIILZL == null) {
                        C58096Mr6.LLIILZL = new AccountInitializer();
                    }
                }
            }
            iAccountInitializer = C58096Mr6.LLIILZL;
        }
        o.LJI(iAccountInitializer);
        AwemeHostApplication LIZ3 = FKM.LIZ();
        o.LJI(LIZ3);
        iAccountInitializer.LIZ(LIZ3);
    }

    public static Application LIZ() {
        Application application = LIZ;
        if (application != null) {
            return application;
        }
        o.LJIJI("sContext");
        throw null;
    }

    public static final <T> T LIZIZ(Class<T> cls) {
        ConcurrentHashMap<Class<?>, ServiceProvider<?>> concurrentHashMap = LIZLLL;
        if (concurrentHashMap != null) {
            if (concurrentHashMap.contains(cls)) {
                ConcurrentHashMap<Class<?>, ServiceProvider<?>> concurrentHashMap2 = LIZLLL;
                if (concurrentHashMap2 != null) {
                    ServiceProvider<?> serviceProvider = concurrentHashMap2.get(cls);
                    o.LJI(serviceProvider);
                    return (T) serviceProvider.get();
                }
                o.LJIJI("sNeedServices");
                throw null;
            }
            InterfaceC58114MrO interfaceC58114MrO = LJ;
            if (interfaceC58114MrO != null) {
                ServiceProvider<T> service = interfaceC58114MrO.getService(cls);
                if (service != null) {
                    ConcurrentHashMap<Class<?>, ServiceProvider<?>> concurrentHashMap3 = LIZLLL;
                    if (concurrentHashMap3 != null) {
                        concurrentHashMap3.put(cls, service);
                        return service.get();
                    }
                    o.LJIJI("sNeedServices");
                    throw null;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("You are not init and register ");
                LIZ2.append(C16880lQ.LJLLILLLL(cls));
                LIZ2.append(" in AccountSdkInitializer");
                throw new RuntimeException(X1D.LIZIZ(LIZ2));
            }
            o.LJIJI("sServiceProvider");
            throw null;
        }
        o.LJIJI("sNeedServices");
        throw null;
    }
}
