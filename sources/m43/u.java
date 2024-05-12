package m43;

import X.C16880lQ;
import X.C24730y5;
import X.C40699FyB;
import X.C40700FyC;
import X.C56672Kh;
import X.C64343PNb;
import X.C65819PsN;
import X.C65840Psi;
import X.C66371Q3b;
import X.C66373Q3d;
import X.C66382Q3m;
import X.C77275UUl;
import X.EnumC66383Q3n;
import X.EnumC88128YiK;
import X.FAK;
import X.Q4J;
import X.Q4K;
import X.Q4W;
import X.Q5A;
import X.Q5C;
import X.Q7K;
import X.Q8U;
import Y.ACallableS41S0000000_6;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.facebook.AccessToken;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import defpackage.s1;
import defpackage.t1;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class u {
    public static final HashSet<EnumC66383Q3n> LIZ;
    public static Executor LIZIZ;
    public static volatile String LIZJ;
    public static volatile String LIZLLL;
    public static volatile String LJ;
    public static volatile Boolean LJFF;
    public static final AtomicLong LJI;
    public static Context LJII;
    public static int LJIIIIZZ;
    public static final ReentrantLock LJIIIZ;
    public static final String LJIIJ;
    public static boolean LJIIJJI;
    public static boolean LJIIL;
    public static boolean LJIILIIL;
    public static final AtomicBoolean LJIILJJIL;
    public static volatile String LJIILL;
    public static volatile String LJIILLIIL;
    public static boolean LJIIZILJ;

    public static final synchronized void LJIIJ(Context context) {
        synchronized (u.class) {
            LIZIZ(context);
        }
    }

    public static final synchronized void LJIIJJI(Context context) {
        synchronized (u.class) {
            LIZ(context);
        }
    }

    static {
        new u();
        C16880lQ.LJLLILLLL(u.class);
        LIZ = C77275UUl.LIZLLL(EnumC66383Q3n.DEVELOPER_ERRORS);
        LJI = new AtomicLong(65536L);
        LJIIIIZZ = 64206;
        LJIIIZ = new ReentrantLock();
        LJIIJ = "v13.0";
        LJIILJJIL = new AtomicBoolean(false);
        LJIILL = "instagram.com";
        LJIILLIIL = "facebook.com";
    }

    public static final Executor LJ() {
        ReentrantLock reentrantLock = LJIIIZ;
        reentrantLock.lock();
        try {
            if (LIZIZ == null) {
                LIZIZ = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            reentrantLock.unlock();
            Executor executor = LIZIZ;
            if (executor != null) {
                return executor;
            }
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String LJFF() {
        String str;
        AccessToken.Companion.getClass();
        AccessToken LIZIZ2 = C66382Q3m.LIZIZ();
        if (LIZIZ2 != null) {
            str = LIZIZ2.graphDomain;
        } else {
            str = null;
        }
        String str2 = LJIILLIIL;
        if (str == null) {
            return str2;
        }
        if (o.LJ(str, "gaming")) {
            return ujb.o.LJJJJZ(str2, "facebook.com", "fb.gg", false);
        }
        if (!o.LJ(str, "instagram")) {
            return str2;
        }
        return ujb.o.LJJJJZ(str2, "facebook.com", "instagram.com", false);
    }

    public static final synchronized boolean LJI() {
        boolean z;
        synchronized (u.class) {
            z = LJIIZILJ;
        }
        return z;
    }

    public static final boolean LJII() {
        return LJIILJJIL.get();
    }

    public static final Context LIZJ() {
        Q4J.LJI();
        Context context = LJII;
        if (context != null) {
            return context;
        }
        o.LJIJI("applicationContext");
        throw null;
    }

    public static final String LIZLLL() {
        Q4J.LJI();
        String str = LIZJ;
        if (str != null) {
            return str;
        }
        throw new Q4W("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static void LIZ(Context applicationContext) {
        int i = 0;
        if (C64343PNb.LIZIZ.compareAndSet(false, true)) {
            PThreadPoolExecutor executor = C64343PNb.LIZ;
            o.LJIIIZ(executor, "executor");
            ReentrantLock reentrantLock = LJIIIZ;
            reentrantLock.lock();
            try {
                LIZIZ = executor;
            } finally {
                reentrantLock.unlock();
            }
        }
        synchronized (u.class) {
            o.LJIIIZ(applicationContext, "applicationContext");
            AtomicBoolean atomicBoolean = LJIILJJIL;
            if (!atomicBoolean.get()) {
                try {
                    Q4J.LIZ(applicationContext, false);
                } catch (Exception unused) {
                }
                Q4J.LIZJ(applicationContext, false);
                Context LLLLL = C16880lQ.LLLLL(applicationContext);
                o.LJIIIIZZ(LLLLL, "applicationContext.applicationContext");
                LJII = LLLLL;
                Context context = LJII;
                Object obj = null;
                if (context != null) {
                    LJIIIZ(context);
                    if (!C66373Q3d.LJIJJ(LIZJ)) {
                        atomicBoolean.set(true);
                        if (!C40700FyC.LIZ(C66371Q3b.class)) {
                            try {
                                C66371Q3b.LIZ.LIZLLL();
                                if (C66371Q3b.LIZLLL.LIZ()) {
                                    LJIIZILJ = true;
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                        Context context2 = LJII;
                        if (context2 != null) {
                            if ((context2 instanceof Application) && C66371Q3b.LIZIZ()) {
                                Context context3 = LJII;
                                if (context3 != null) {
                                } else {
                                    o.LJIJI("applicationContext");
                                    throw null;
                                }
                            }
                            C65819PsN.LIZJ();
                            Q5A.LJIIZILJ();
                            Context context4 = LJII;
                            if (context4 != null) {
                                C40699FyB.LIZ(context4);
                                new C24730y5(new ACallableS41S0000000_6(7));
                                C65840Psi.LIZ(new s1(), EnumC88128YiK.Instrument);
                                C65840Psi.LIZ(new t1(), EnumC88128YiK.AppEvents);
                                C65840Psi.LIZ(new Q8U(), EnumC88128YiK.ChromeCustomTabsPrefetching);
                                C65840Psi.LIZ(new Q7K(), EnumC88128YiK.IgnoreAppSwitchToLoggedOut);
                                C65840Psi.LIZ(new Q4K(), EnumC88128YiK.BypassAppSwitch);
                                LJ().execute(new FutureTask(new Q5C(i, obj)));
                                return;
                            }
                            o.LJIJI("applicationContext");
                            throw null;
                        }
                        o.LJIJI("applicationContext");
                        throw null;
                    }
                    throw new Q4W("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
                }
                o.LJIJI("applicationContext");
                throw null;
            }
        }
    }

    public static void LIZIZ(Context applicationContext) {
        C56672Kh.LIZ().LIZLLL("FacebookSdk");
        synchronized (u.class) {
            o.LJIIIZ(applicationContext, "applicationContext");
            LJIIJJI(applicationContext);
        }
        FAK LIZ2 = C56672Kh.LIZ();
        LIZ2.getClass();
        FAK.LJI(LIZ2, "FacebookSdk");
    }

    public static final void LJIIIIZZ(EnumC66383Q3n behavior) {
        o.LJIIIZ(behavior, "behavior");
        synchronized (LIZ) {
        }
    }

    public static final void LJIIIZ(Context context) {
        try {
            ApplicationInfo LLLLLLLLL = C16880lQ.LLLLLLLLL(context.getPackageManager(), context.getPackageName(), 128);
            if (LLLLLLLLL.metaData == null) {
                return;
            }
            if (LIZJ == null) {
                Object LLJJIII = C16880lQ.LLJJIII(LLLLLLLLL.metaData, "com.facebook.sdk.ApplicationId");
                if (LLJJIII instanceof String) {
                    String str = (String) LLJJIII;
                    Locale ROOT = Locale.ROOT;
                    o.LJIIIIZZ(ROOT, "ROOT");
                    String lowerCase = str.toLowerCase(ROOT);
                    o.LJIIIIZZ(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (ujb.o.LJJJLIIL(lowerCase, "fb", false)) {
                        String substring = str.substring(2);
                        o.LJIIIIZZ(substring, "(this as java.lang.String).substring(startIndex)");
                        LIZJ = substring;
                    } else {
                        LIZJ = str;
                    }
                } else if (LLJJIII instanceof Number) {
                    throw new Q4W("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (LIZLLL == null) {
                LIZLLL = LLLLLLLLL.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (LJ == null) {
                LJ = LLLLLLLLL.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (LJIIIIZZ == 64206) {
                LJIIIIZZ = LLLLLLLLL.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (LJFF == null) {
                LJFF = Boolean.valueOf(LLLLLLLLL.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
