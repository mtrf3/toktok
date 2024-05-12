package com.ss.android.ugc.aweme.download.component_api;

import X.C221108m2;
import X.C41850Gbe;
import X.C5H3;
import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DownloadServiceManager {
    public static final DownloadServiceManager INSTANCE = new DownloadServiceManager();
    public static final C5H3 downloadService$delegate = C221108m2.LIZIZ(C41850Gbe.LJLIL);
    public static final boolean isAutoRemoveListener;
    public static final int retryExpCount;

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|2|3|(6:5|6|7|8|9|10)|15|6|7|8|9|10) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        X.C78983UzD.LJIIZILJ(r0);
     */
    static {
        /*
            java.lang.String r2 = "download_component_exp_switch"
            com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager r0 = new com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager
            r0.<init>()
            com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager.INSTANCE = r0
            X.Gbe r0 = X.C41850Gbe.LJLIL
            X.Ol8 r0 = X.C221108m2.LIZIZ(r0)
            com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager.downloadService$delegate = r0
            r1 = 0
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L21
            r0.getClass()     // Catch: java.lang.Throwable -> L21
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r2, r1)     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L25
            r0 = 3
            goto L26
        L21:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)
        L25:
            r0 = 0
        L26:
            com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager.retryExpCount = r0
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L34
            r0.getClass()     // Catch: java.lang.Throwable -> L34
            boolean r1 = com.bytedance.ies.abmock.SettingsManager.LIZ(r2, r1)     // Catch: java.lang.Throwable -> L34
            goto L38
        L34:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)
        L38:
            com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager.isAutoRemoveListener = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager.<clinit>():void");
    }

    public final IDownloadService getDownloadService() {
        Object value = downloadService$delegate.getValue();
        o.LJIIIIZZ(value, "<get-downloadService>(...)");
        return (IDownloadService) value;
    }

    public final int getRetryExpCount() {
        return retryExpCount;
    }

    public final boolean isAutoRemoveListener() {
        return isAutoRemoveListener;
    }
}
