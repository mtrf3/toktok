package com.ss.android.socialbase.downloader.service;

import X.C16880lQ;
import X.C65210PiY;
import X.C75806Tp4;
import X.C84212X3g;
import X.C84213X3h;
import X.C84222X3q;
import X.InterfaceC84169X1p;
import X.InterfaceC84208X3c;
import X.InterfaceC84209X3d;
import X.InterfaceC84210X3e;
import X.InterfaceC84211X3f;
import X.InterfaceC84214X3i;
import X.RunnableC84206X3a;
import X.X34;
import X.X37;
import X.X3A;
import X.X3F;
import X.X3J;
import X.X3U;
import X.X3Y;
import X.X3Z;
import X.X4P;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class DownloadComponentManagerService implements IDownloadComponentManagerService {
    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public InterfaceC84169X1p getDownloadInterceptor() {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public X3A getReserveWifiStatusListener() {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public JSONObject getDownloadSetting() {
        if (C84212X3g.LJJI == null || C84212X3g.LJJI.get() == null) {
            return X3U.LIZIZ;
        }
        return C84212X3g.LJJI.get();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void unRegisterDownloadReceiver() {
        synchronized (C84212X3g.class) {
            try {
                if (C84212X3g.LJJIIZI && C84212X3g.LJIJJLI != null && C84212X3g.LIZ != null) {
                    C16880lQ.LJJLIIIJL(C84212X3g.LIZ, C84212X3g.LJIJJLI);
                    C84212X3g.LJJIIZI = false;
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void clearSqlDownloadCacheData() {
        X3Y x3y;
        try {
            InterfaceC84211X3f LJIIJ = C84212X3g.LJIIJ();
            if (LJIIJ != null && (LJIIJ instanceof C84222X3q) && (x3y = ((C84222X3q) LJIIJ).LJLILLLLZI) != null) {
                x3y.clearData();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public Context getAppContext() {
        return C84212X3g.LJ();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public InterfaceC84214X3i getTTNetHandler() {
        return C84212X3g.LJIJI();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void initDownloadCacheImmediately() {
        C84212X3g.LJIIJ().LLZZJLIL();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public boolean isInit() {
        return C84212X3g.LJJJJI;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void setDownloadInMultiProcess() {
        C84212X3g.LJJIFFI();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void clearMemoryCacheData(double d) {
        C84212X3g.LJJIIJZLJL(new RunnableC84206X3a(d));
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void coverComponent(C84213X3h c84213X3h) {
        synchronized (C84212X3g.class) {
            C84212X3g.LJJ(c84213X3h);
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void initComponent(C84213X3h c84213X3h) {
        boolean z;
        synchronized (C84212X3g.class) {
            if (C84212X3g.LJJJJI) {
                C65210PiY.LIZJ("DownloadComponentManager", "initComponent", "Component has init");
                return;
            }
            boolean z2 = C84212X3g.LJJII;
            C84212X3g.LJJ(c84213X3h);
            if (C84212X3g.LIZIZ == null) {
                C84212X3g.LIZIZ = new C84222X3q();
            }
            if (C84212X3g.LIZLLL == null) {
                C84212X3g.LIZLLL = new X37();
            }
            if (C84212X3g.LJ == null && C84212X3g.LJFF != null) {
                ((X3J) C84212X3g.LJFF).getClass();
                C84212X3g.LJ = new X34();
            }
            if (C84212X3g.LIZJ == null) {
                C84212X3g.LIZJ = new X3F();
            }
            if (C84212X3g.LJIL == null) {
                C84212X3g.LJIL = new C75806Tp4();
            }
            int i = C84212X3g.LJJIJ;
            if (i <= 0 || i > C84212X3g.LJJIJIIJI) {
                C84212X3g.LJJIJ = C84212X3g.LJJIJIIJI;
            }
            if (C84212X3g.LJJII && !z2 && !X4P.LJIIL()) {
                z = true;
            } else {
                z = false;
            }
            C84212X3g.LJJIIJZLJL(new X3Z(z));
            if (TextUtils.isEmpty(X3U.LIZ)) {
                X3U.LIZ = "oppo";
                X3U.LIZ.toUpperCase();
            }
            C84212X3g.LJJJJI = true;
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void setAppContext(Context context) {
        C84212X3g.LJIL(context);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void setDownloadDBListener(InterfaceC84209X3d interfaceC84209X3d) {
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void setDownloadMemoryInfoListener(InterfaceC84210X3e interfaceC84210X3e) {
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void setDownloadThreadCheckListener(InterfaceC84208X3c interfaceC84208X3c) {
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void setReserveWifiStatusListener(X3A x3a) {
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void submitSingleTask(Runnable runnable) {
        C84212X3g.LJJIIZI(runnable);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void updateDownloadInfo(DownloadInfo downloadInfo) {
        X4P.LIZLLL("updateDownloadInfo");
        try {
            C84212X3g.LJIIJ().updateDownloadInfo(downloadInfo);
        } catch (Throwable unused) {
        }
    }
}
