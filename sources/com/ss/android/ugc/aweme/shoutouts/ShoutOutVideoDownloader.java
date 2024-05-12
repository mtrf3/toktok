package com.ss.android.ugc.aweme.shoutouts;

import X.ActivityC45651qj;
import X.C5L7;
import X.X1D;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.services.shoutout.ShoutoutVideoDownloadListener;
import java.io.File;
import ujb.o;

/* loaded from: classes8.dex */
public final class ShoutOutVideoDownloader implements GenericLifecycleObserver {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final ShoutoutVideoDownloadListener LJLJJI;
    public final LifecycleOwner LJLJJL;
    public int LJLJJLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (this.LJLJJLL != -1) {
            Downloader.getInstance(C5L7.LIZ()).cancel(this.LJLJJLL);
        }
        this.LJLJJL.getLifecycle().removeObserver(this);
    }

    public static String LIZ(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return "";
        }
        String savePath = downloadInfo.getSavePath();
        if (savePath != null && o.LJJJJ(savePath, "/", false)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(downloadInfo.getSavePath());
            LIZ.append(downloadInfo.getName());
            return X1D.LIZIZ(LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(downloadInfo.getSavePath());
        LIZ2.append(File.separator);
        LIZ2.append(downloadInfo.getName());
        return X1D.LIZIZ(LIZ2);
    }

    public ShoutOutVideoDownloader(String url, String filePath, String fileName, ShoutoutVideoDownloadListener shoutoutVideoDownloadListener, ActivityC45651qj owner) {
        kotlin.jvm.internal.o.LJIIIZ(url, "url");
        kotlin.jvm.internal.o.LJIIIZ(filePath, "filePath");
        kotlin.jvm.internal.o.LJIIIZ(fileName, "fileName");
        kotlin.jvm.internal.o.LJIIIZ(owner, "owner");
        this.LJLIL = url;
        this.LJLILLLLZI = filePath;
        this.LJLJI = fileName;
        this.LJLJJI = shoutoutVideoDownloadListener;
        this.LJLJJL = owner;
        this.LJLJJLL = -1;
    }
}
