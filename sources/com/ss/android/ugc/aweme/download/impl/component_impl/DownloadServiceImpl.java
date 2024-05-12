package com.ss.android.ugc.aweme.download.impl.component_impl;

import X.AbstractC84258X5a;
import X.AbstractC84259X5b;
import X.C19N;
import X.C38995FSd;
import X.C58096Mr6;
import X.C65209PiX;
import X.C78983UzD;
import X.C79043V0l;
import X.C79391VDv;
import X.C79395VDz;
import X.C84213X3h;
import X.C84260X5c;
import X.EF7;
import X.FX0;
import X.InterfaceC84217X3l;
import X.X5Q;
import X.X5R;
import X.X5U;
import X.X5V;
import X.X5W;
import X.X5X;
import X.X5Y;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.commercialize.download.depend.DownloadConfigDepend;
import com.ss.android.ugc.aweme.commercialize.download.depend.DownloadMonitorLogSender;
import com.ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend;
import com.ss.android.ugc.aweme.download.component_api.depend.IMonitorLogSendDepend;
import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import com.ss.android.ugc.aweme.performanceopt.api.ITrafficMonitorApi;
import defpackage.e1;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class DownloadServiceImpl implements IDownloadService {
    public static IMonitorLogSendDepend LIZJ;
    public static IDownloadConfigDepend LIZLLL;
    public Context LIZ;
    public ITrafficMonitorApi LIZIZ;

    public static IDownloadService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IDownloadService.class, false);
        if (LIZ != null) {
            return (IDownloadService) LIZ;
        }
        if (C58096Mr6.A == null) {
            synchronized (IDownloadService.class) {
                if (C58096Mr6.A == null) {
                    C58096Mr6.A = new DownloadServiceImpl();
                }
            }
        }
        return C58096Mr6.A;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0067 -> B:25:0x006f). Please report as a decompilation issue!!! */
    public static JSONObject LIZLLL() {
        JSONObject jSONObject;
        String str;
        if (!e1.LIZ(31744, "tiktok_downloader_lru_settings", true, false)) {
            IDownloadConfigDepend iDownloadConfigDepend = LIZLLL;
            if (iDownloadConfigDepend == null || (str = iDownloadConfigDepend.getSettingString()) == null) {
                str = "";
            }
            try {
                if (!TextUtils.isEmpty(str)) {
                    jSONObject = new JSONObject(str);
                } else {
                    jSONObject = new JSONObject();
                }
            } catch (Exception unused) {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("switch_not_auto_boot_service", 1);
                jSONObject.put("download_completed_event_tag", "draw_ad");
                jSONObject.put("landing_page_progressbar_visible", 1);
                jSONObject.put("is_enable_show_retry_download_dialog", 1);
                jSONObject.put("save_path_security", 1);
            } catch (JSONException unused2) {
            }
        } else {
            String settingString = new DownloadConfigDepend().getSettingString();
            try {
                if (!TextUtils.isEmpty(settingString)) {
                    jSONObject = new JSONObject(settingString);
                } else {
                    jSONObject = new JSONObject();
                }
            } catch (Exception e) {
                C78983UzD.LJIIZILJ(e);
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("switch_not_auto_boot_service", 1);
                jSONObject.put("download_completed_event_tag", "draw_ad");
                jSONObject.put("landing_page_progressbar_visible", 1);
                jSONObject.put("is_enable_show_retry_download_dialog", 1);
                jSONObject.put("save_path_security", 1);
                jSONObject.put("lru_download_info_cache_enable", 1);
            } catch (JSONException e2) {
                C78983UzD.LJIIZILJ(e2);
            }
        }
        return jSONObject;
    }

    static {
        Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IDownloadService
    public final void LIZIZ(C79043V0l c79043V0l) {
        try {
            C79391VDv LIZIZ = C79391VDv.LIZIZ();
            C84260X5c c84260X5c = new C84260X5c(c79043V0l);
            if (LIZIZ.LIZ == null) {
                LIZIZ.LIZ = c84260X5c;
            }
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public final void cancel(int i) {
        Downloader.getInstance(this.LIZ).cancel(i);
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public final DownloadInfo getDownloadInfo(int i) {
        return Downloader.getInstance(this.LIZ).getDownloadInfo(i);
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public final X5R getDownloadTask(int i) {
        X5V LIZ = X5W.LIZ();
        if (LIZ != null) {
            return LIZ.LIZ.get(i);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public final AbstractC84258X5a getPageLifeMonitor(int i) {
        getDownloadTask(i);
        return new X5X();
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public final AbstractC84259X5b getViewLifeMonitor(int i) {
        getDownloadTask(i);
        return new X5Y();
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IDownloadService
    public final boolean isDownloading(int i) {
        return Downloader.getInstance(this.LIZ).isDownloading(i);
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public final void restart(int i) {
        Downloader.getInstance(this.LIZ).restart(i);
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public final X5R with(String str) {
        if (this.LIZ == null) {
            this.LIZ = EF7.LIZIZ();
        }
        return new X5Q(this.LIZ, str);
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public final int getDownloadId(String str, String str2) {
        return Downloader.getInstance(this.LIZ).getDownloadId(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public final DownloadInfo getDownloadInfo(String str, String str2) {
        return Downloader.getInstance(this.LIZ).getDownloadInfo(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IDownloadService
    public final void LIZ(Context context, DownloadMonitorLogSender downloadMonitorLogSender, DownloadConfigDepend downloadConfigDepend) {
        boolean z;
        InterfaceC84217X3l interfaceC84217X3l;
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        LIZJ = downloadMonitorLogSender;
        LIZLLL = downloadConfigDepend;
        boolean z2 = false;
        LIZLLL().optInt("download_exp_switch_temp", 0);
        C84213X3h c84213X3h = new C84213X3h(context);
        c84213X3h.LJ = new X5U(this);
        IDownloadConfigDepend iDownloadConfigDepend = LIZLLL;
        if (iDownloadConfigDepend != null) {
            z = iDownloadConfigDepend.needAutoRefreshUnSuccessTask();
        } else {
            z = false;
        }
        c84213X3h.LJIILJJIL = z;
        c84213X3h.LIZJ = new C79395VDz(this);
        if (C19N.LJ("replace_ttnet_download_service", false)) {
            c84213X3h.LJIILIIL = new C65209PiX();
        } else {
            IDownloadConfigDepend iDownloadConfigDepend2 = LIZLLL;
            if (iDownloadConfigDepend2 != null) {
                interfaceC84217X3l = iDownloadConfigDepend2.getTTNetDownloadHttpService();
            } else {
                interfaceC84217X3l = null;
            }
            c84213X3h.LIZIZ = interfaceC84217X3l;
        }
        if (LIZLLL().optInt("enable_thread_opt") == 1) {
            JSONObject LIZLLL2 = LIZLLL();
            int optInt = LIZLLL2.optInt("cpu_thread_count", -1);
            int optInt2 = LIZLLL2.optInt("io_thread_count", -1);
            int optInt3 = LIZLLL2.optInt("mix_default_thread_count", -1);
            int optInt4 = LIZLLL2.optInt("mix_frequent_thread_count", -1);
            int optInt5 = LIZLLL2.optInt("mix_apk_thread_count", 4);
            int optInt6 = LIZLLL2.optInt("db_thread_count", -1);
            int optInt7 = LIZLLL2.optInt("chunk_thread_count", -1);
            if (LIZLLL2.optInt("use_default_okhttp_executor", 0) == 1) {
                z2 = true;
            }
            ExecutorService LIZJ2 = C38995FSd.LIZJ();
            o.LJIIIIZZ(LIZJ2, "getDefaultExecutor()");
            c84213X3h.LJFF = FX0.LIZ(optInt, "cpu", LIZJ2);
            ExecutorService LIZLLL3 = C38995FSd.LIZLLL();
            o.LJIIIIZZ(LIZLLL3, "getIOExecutor()");
            c84213X3h.LJI = FX0.LIZ(optInt2, "io", LIZLLL3);
            ExecutorService LIZLLL4 = C38995FSd.LIZLLL();
            o.LJIIIIZZ(LIZLLL4, "getIOExecutor()");
            c84213X3h.LJII = FX0.LIZ(optInt3, "mix-default", LIZLLL4);
            ExecutorService LIZLLL5 = C38995FSd.LIZLLL();
            o.LJIIIIZZ(LIZLLL5, "getIOExecutor()");
            c84213X3h.LJIIIIZZ = FX0.LIZ(optInt4, "mix-frequent", LIZLLL5);
            ExecutorService LIZLLL6 = C38995FSd.LIZLLL();
            o.LJIIIIZZ(LIZLLL6, "getIOExecutor()");
            c84213X3h.LJIIIZ = FX0.LIZ(optInt5, "mix-apk", LIZLLL6);
            ExecutorService LIZLLL7 = C38995FSd.LIZLLL();
            o.LJIIIIZZ(LIZLLL7, "getIOExecutor()");
            c84213X3h.LJIIJ = FX0.LIZ(optInt6, "db", LIZLLL7);
            ExecutorService LIZLLL8 = C38995FSd.LIZLLL();
            o.LJIIIIZZ(LIZLLL8, "getIOExecutor()");
            c84213X3h.LJIIJJI = FX0.LIZ(optInt7, "chunk", LIZLLL8);
            if (!z2) {
                c84213X3h.LJIIL = C38995FSd.LIZLLL();
            }
        }
        Downloader.init(c84213X3h);
    }
}
