package com.ss.android.ugc.aweme.framework.services.plugin;

import X.C37692Eqm;
import X.X1D;
import com.ss.android.agilelogger.ALog;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class PluginInstaller {
    public static final PluginInstaller INSTANCE = new PluginInstaller();

    private final void logD(String str) {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("SPIPluginInstaller", str);
    }

    public final boolean onPluginInstall(String pluginPackageName) {
        o.LJIIJ(pluginPackageName, "pluginPackageName");
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(pluginPackageName);
            LIZ.append(".SpiPluginBinder");
            Object newInstance = Class.forName(X1D.LIZIZ(LIZ)).newInstance();
            if (newInstance != null) {
                ((IPluginBinder) newInstance).bindPluginSpi();
                logD(a1.LJ("Install service for ", pluginPackageName, " success"));
                return true;
            }
            throw new C37692Eqm("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.plugin.IPluginBinder");
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Install service for ");
            LIZ2.append(pluginPackageName);
            LIZ2.append(" failed with ");
            LIZ2.append(th);
            LIZ2.append(" \n classLoader -> ");
            LIZ2.append(PluginInstaller.class.getClassLoader());
            logD(X1D.LIZIZ(LIZ2));
            return false;
        }
    }
}
