package com.ss.android.ugc.aweme.launcher.serviceimpl.crashsdk;

import X.C03880Dg;
import X.C16880lQ;
import X.C38795FKl;
import X.C58096Mr6;
import X.C65300Pk0;
import X.EUO;
import X.EXB;
import X.FKM;
import X.PJZ;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CrashSdkImpl implements ICrashSdkApi {
    public static ICrashSdkApi LJ() {
        Object LIZ = C58096Mr6.LIZ(ICrashSdkApi.class, false);
        if (LIZ != null) {
            return (ICrashSdkApi) LIZ;
        }
        if (C58096Mr6.X1 == null) {
            synchronized (ICrashSdkApi.class) {
                if (C58096Mr6.X1 == null) {
                    C58096Mr6.X1 = new CrashSdkImpl();
                }
            }
        }
        return C58096Mr6.X1;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    public final void LIZ() {
        if (C38795FKl.LIZLLL == null) {
            synchronized (C38795FKl.class) {
                C38795FKl.LIZLLL = new C38795FKl();
            }
        }
        C38795FKl.LIZLLL.getClass();
        C38795FKl.LIZJ = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (r1.equals("create") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        r4 = X.C84763XOl.LIZLLL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r1.equals("resume") == false) goto L18;
     */
    @Override // com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r6 = this;
            X.FKl r0 = X.C38795FKl.LIZLLL
            if (r0 != 0) goto L13
            java.lang.Class<X.FKl> r1 = X.C38795FKl.class
            monitor-enter(r1)
            X.FKl r0 = new X.FKl     // Catch: java.lang.Throwable -> L10
            r0.<init>()     // Catch: java.lang.Throwable -> L10
            X.C38795FKl.LIZLLL = r0     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
        L13:
            X.FKl r5 = X.C38795FKl.LIZLLL
            r5.getClass()
            X.FFL r0 = X.FFL.LJIIIZ()
            java.lang.String r3 = "trim_memory_in_activity_settings"
            java.lang.Class<com.ss.android.ugc.aweme.experiment.TrimMemorySettingParam> r2 = com.ss.android.ugc.aweme.experiment.TrimMemorySettingParam.class
            r0.getClass()
            r1 = 1
            r0 = 31744(0x7c00, float:4.4483E-41)
            r4 = 0
            java.lang.Object r3 = X.FFL.LJIJ(r1, r3, r0, r2, r4)
            com.ss.android.ugc.aweme.experiment.TrimMemorySettingParam r3 = (com.ss.android.ugc.aweme.experiment.TrimMemorySettingParam) r3
            if (r3 == 0) goto L4e
            boolean r0 = r3.enable
            if (r0 == 0) goto L4e
            java.lang.String r1 = r3.activity_phase
            r1.getClass()
            int r0 = r1.hashCode()
            switch(r0) {
                case -1352294148: goto L4f;
                case -934426579: goto L58;
                case 109757538: goto L66;
                case 1557372922: goto L74;
                default: goto L3f;
            }
        L3f:
            X.Sq2 r2 = r5.LIZ
            Y.AfS55S0200000_6 r1 = new Y.AfS55S0200000_6
            r0 = 7
            r1.<init>(r5, r3, r0)
            X.3kP r0 = r4.LJJJJZI(r1)
            r2.LIZ(r0)
        L4e:
            return
        L4f:
            java.lang.String r0 = "create"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L61
            goto L3f
        L58:
            java.lang.String r0 = "resume"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L61
            goto L3f
        L61:
            X.T06 r4 = X.C84763XOl.LIZLLL()
            goto L3f
        L66:
            java.lang.String r0 = "start"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L6f
            goto L3f
        L6f:
            X.T06 r4 = X.C84763XOl.LJ()
            goto L3f
        L74:
            java.lang.String r0 = "destroy"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7d
            goto L3f
        L7d:
            X.T06 r4 = X.C84763XOl.LIZIZ()
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.launcher.serviceimpl.crashsdk.CrashSdkImpl.LIZIZ():void");
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    public final Application.ActivityLifecycleCallbacks LIZJ() {
        return new EUO();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    public final void LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        if (FKM.LIZ() != null || C16880lQ.LLLLL(context) == null || context.getApplicationInfo() == null || !TextUtils.equals(Application.class.getName(), context.getApplicationInfo().className)) {
            return;
        }
        Application application = (Application) C16880lQ.LLLLL(context);
        try {
            try {
                EXB.LIZ = (Application) Class.forName(context.getApplicationInfo().className).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            EXB.LIZJ(application, application, EXB.LIZ);
            Context baseContext = application.getBaseContext();
            Application application2 = EXB.LIZ;
            if (application2 == null) {
                return;
            }
            try {
                Object[] objArr = {baseContext};
                Method declaredMethod = Application.class.getDeclaredMethod("attach", Context.class);
                declaredMethod.setAccessible(true);
                if (!new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", declaredMethod, new Object[]{application2, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-4060319795633319368")).LIZ) {
                    declaredMethod.invoke(application2, objArr);
                }
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
            EXB.LIZ.onCreate();
        } catch (Exception e3) {
            C16880lQ.LLLLIIL(e3);
        }
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    public final void ensureNotReachHere(Throwable throwable, String str) {
        o.LJIIIZ(throwable, "throwable");
        PJZ.LIZIZ(throwable, str);
    }
}
