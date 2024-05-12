package com.ss.android.ugc.aweme.app.host;

import X.C09190Xr;
import X.C0CU;
import X.C0CV;
import X.C0CW;
import X.C1FP;
import X.C35527Dwx;
import X.C35820E4a;
import X.C36583EXj;
import X.C38646FEs;
import X.C38668FFo;
import X.C40905G3p;
import X.C46982IcE;
import X.C56672Kh;
import X.C65427Pm3;
import X.EHW;
import X.FAJ;
import X.FAK;
import X.FAU;
import X.FAV;
import X.FCD;
import X.FFE;
import X.FFP;
import X.FKB;
import X.FKC;
import X.FKD;
import X.FKE;
import X.FKH;
import X.FKK;
import X.FKM;
import X.FKR;
import X.FQU;
import X.IXR;
import X.K0N;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.apm.agent.v2.instrumentation.AppAgent;
import com.bytedance.keva.KevaCacheManager;
import com.ss.android.ugc.AwemeAppBuildConfig;
import com.ss.android.ugc.aweme.legoImp.task.NpthCoreInitTask;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class AwemeHostApplication extends FKC implements C0CV {
    public final FKD LJLILLLLZI;

    @Override // X.FKC, android.app.Application
    public final void onCreate() {
        FKH.LIZ.getClass();
        if (C46982IcE.LIZ == null) {
            IXR.LIZ = this;
            C46982IcE.LIZ = this;
            registerActivityLifecycleCallbacks(new K0N());
        }
        AppAgent.onTrace("onCreate", true);
        FAJ.LJFF("cold_boot_application_attach_to_create", true);
        FAJ.LIZ("cold_boot_application_create_duration", true);
        boolean LIZIZ = C35820E4a.LIZIZ(this, "optimize_apprefactor", false);
        if (!LIZIZ) {
            FAJ.LIZ("application_create_begin_to_super", true);
            C56672Kh.LIZ().LJJIIJZLJL(EHW.APPLICATION_BEFORE_CREATE);
            this.LJLILLLLZI.LIZJ();
            FAJ.LJFF("application_create_begin_to_super", true);
        }
        FAJ.LIZ("application_create_super_duration", true);
        super.onCreate();
        FAJ.LJFF("application_create_super_duration", true);
        if (LIZIZ) {
            FAJ.LIZ("application_create_begin_to_super", true);
            C56672Kh.LIZ().LJJIIJZLJL(EHW.APPLICATION_BEFORE_CREATE);
            this.LJLILLLLZI.LIZJ();
            FAJ.LJFF("application_create_begin_to_super", true);
        }
        FAJ.LIZ("application_create_super_to_end", true);
        C56672Kh.LIZ().LJJIIJZLJL(EHW.APPLICATION_AFTER_CREATE);
        this.LJLILLLLZI.onCreate();
        setTheme(R.style.ul);
        KevaCacheManager.init(this, FKE.LJ, FKE.LIZIZ, FKE.LIZJ, FKE.LIZLLL);
        FAJ.LJFF("application_create_super_to_end", true);
        FAJ.LJFF("cold_boot_application_create_duration", true);
        FAJ.LIZ("cold_boot_application_to_main", true);
        AppAgent.onTrace("onCreate", false);
    }

    @Override // X.C0CV
    public final C0CW LIZ() {
        C0CU c0cu = new C0CU();
        c0cu.LIZ = 3;
        return new C0CW(c0cu);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        FKD fkd = this.LJLILLLLZI;
        Resources origin = super.getResources();
        fkd.LJ(origin);
        o.LJIIIZ(origin, "origin");
        if (!FKR.LIZ()) {
            return origin;
        }
        Configuration configuration = origin.getConfiguration();
        if (C40905G3p.LJFF == null) {
            return origin;
        }
        if (C40905G3p.LJI == null) {
            synchronized (C40905G3p.LIZ) {
                if (C40905G3p.LJI == null) {
                    FQU LIZ = FKK.LIZ(origin, C40905G3p.LIZLLL);
                    if (configuration == null) {
                        configuration = LIZ.getConfiguration();
                    }
                    configuration.setLocale(C40905G3p.LIZIZ());
                    LIZ.updateConfiguration(configuration, origin.getDisplayMetrics());
                    C40905G3p.LJI = LIZ;
                }
            }
        }
        return C40905G3p.LJI;
    }

    public AwemeHostApplication() {
        AppAgent.onTrace("<init>", true);
        FKB.LJ = SystemClock.uptimeMillis();
        FKB.LJFF = SystemClock.elapsedRealtime();
        FKB.LIZLLL = SystemClock.currentThreadTimeMillis();
        FKM.LIZ = new C65427Pm3(this);
        if (C36583EXj.LIZJ()) {
            this.LJLILLLLZI = new FFP(this, new AwemeAppBuildConfig(), new C38668FFo());
        } else {
            String LIZ = FCD.LIZ(this);
            if (LIZ != null && ujb.o.LJJJJ(LIZ, ":error_activity", false)) {
                this.LJLILLLLZI = new FFE(this, new AwemeAppBuildConfig());
            } else {
                this.LJLILLLLZI = new C38646FEs(this, new AwemeAppBuildConfig(), new C38668FFo());
            }
        }
        AppAgent.onTrace("<init>", false);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        AppAgent.onTrace("attachBaseContext", true);
        o.LJIIIZ(context, "context");
        C09190Xr.LIZ = context;
        FKB.LJI = SystemClock.uptimeMillis();
        try {
            C35820E4a.LIZJ(this, context);
        } catch (Throwable unused) {
        }
        FAJ.LIZ("cold_boot_application_attach_duration", true);
        FAK LIZ = C56672Kh.LIZ();
        FAV stage = FAV.APPLICATION;
        LIZ.getClass();
        o.LJIIIZ(stage, "stage");
        LIZ.LJJIJIIJI = stage;
        FAK LIZ2 = C56672Kh.LIZ();
        LIZ2.getClass();
        LIZ2.LJJIIZ = SystemClock.elapsedRealtime();
        if (Build.VERSION.SDK_INT >= 24) {
            ((ConcurrentHashMap) FAU.LJLJL).put("before_attach_duration", Long.valueOf(SystemClock.uptimeMillis() - Process.getStartUptimeMillis()));
        }
        boolean LIZIZ = C35820E4a.LIZIZ(context, "optimize_apprefactor", false);
        if (!LIZIZ) {
            FAJ.LIZ("application_attach_begin_to_super", true);
            C56672Kh.LIZ().LJJIIJZLJL(EHW.APPLICATION_BEFORE_ATTACH);
            try {
                this.LJLILLLLZI.LJI(context);
            } catch (Throwable th) {
                NpthCoreInitTask.LJLIL = th;
            }
            FAJ.LJFF("application_attach_begin_to_super", true);
        }
        FAJ.LIZ("application_attach_super_duration", true);
        super.attachBaseContext(context);
        FAJ.LJFF("application_attach_super_duration", true);
        if (LIZIZ) {
            FAJ.LIZ("application_attach_begin_to_super", true);
            C56672Kh.LIZ().LJJIIJZLJL(EHW.APPLICATION_BEFORE_ATTACH);
            try {
                this.LJLILLLLZI.LJI(context);
            } catch (Throwable th2) {
                NpthCoreInitTask.LJLIL = th2;
            }
            FAJ.LJFF("application_attach_begin_to_super", true);
        }
        FAJ.LIZ("application_attach_super_to_end", true);
        C56672Kh.LIZ().LJJIIJZLJL(EHW.APPLICATION_AFTER_ATTACH);
        this.LJLILLLLZI.LIZ(context);
        FAJ.LJFF("application_attach_super_to_end", true);
        FAJ.LJFF("cold_boot_application_attach_duration", true);
        FAJ.LIZ("cold_boot_application_attach_to_create", true);
        AppAgent.onTrace("attachBaseContext", false);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.LJLILLLLZI.LIZLLL();
        super.onConfigurationChanged(configuration);
        this.LJLILLLLZI.LIZIZ();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.LJLILLLLZI.LJII();
        super.onTrimMemory(i);
        this.LJLILLLLZI.onTrimMemory(i);
    }

    @Override // X.FKC, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        C1FP.LJIJI(C35527Dwx.LJLIL);
        super.startActivity(intent);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        return super.openOrCreateDatabase(this.LJLILLLLZI.LJFF(str), i, cursorFactory);
    }
}
