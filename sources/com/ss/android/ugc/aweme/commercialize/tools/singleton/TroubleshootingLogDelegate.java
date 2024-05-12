package com.ss.android.ugc.aweme.commercialize.tools.singleton;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TroubleshootingLogDelegate {
    public static final TroubleshootingLogDelegate INSTANCE = new TroubleshootingLogDelegate();

    public final void awesomeSplashLog(String log) {
        o.LJIIIZ(log, "log");
        awesomeSplashLog$default(this, log, null, 2, null);
    }

    public final void awesomeSplashLog(String log, String str) {
        o.LJIIIZ(log, "log");
    }

    public final void ordinarySplashLog(String log) {
        o.LJIIIZ(log, "log");
        ordinarySplashLog$default(this, log, null, 2, null);
    }

    public final void ordinarySplashLog(String log, String str) {
        o.LJIIIZ(log, "log");
    }

    public static /* synthetic */ void awesomeSplashLog$default(TroubleshootingLogDelegate troubleshootingLogDelegate, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        troubleshootingLogDelegate.awesomeSplashLog(str, str2);
    }

    public static /* synthetic */ void ordinarySplashLog$default(TroubleshootingLogDelegate troubleshootingLogDelegate, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        troubleshootingLogDelegate.ordinarySplashLog(str, str2);
    }
}
