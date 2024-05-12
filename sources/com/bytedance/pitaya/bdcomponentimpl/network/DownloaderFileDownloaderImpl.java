package com.bytedance.pitaya.bdcomponentimpl.network;

import X.C84261X5d;
import X.C93267aO7;
import X.C93335aPD;
import X.InterfaceC93313aOr;
import android.content.Context;
import com.bytedance.pitaya.thirdcomponent.downloader.PTYFileDownloader;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes30.dex */
public final class DownloaderFileDownloaderImpl implements PTYFileDownloader {
    public static final C93267aO7 Companion = new C93267aO7();
    public static final HashSet<Integer> downloadingIds = new HashSet<>();

    public static final HashSet<Integer> getDownloadingIds() {
        return downloadingIds;
    }

    @Override // com.bytedance.pitaya.thirdcomponent.downloader.PTYFileDownloader
    public void cancelAllDownload(Context context) {
        o.LJIIJ(context, "context");
        HashSet<Integer> hashSet = downloadingIds;
        synchronized (hashSet) {
            Iterator<Integer> it = hashSet.iterator();
            while (it.hasNext()) {
                Integer downloadingId = it.next();
                Downloader downloader = Downloader.getInstance(context);
                o.LJFF(downloadingId, "downloadingId");
                if (downloader.isDownloading(downloadingId.intValue())) {
                    Downloader.getInstance(context).cancel(downloadingId.intValue());
                }
            }
        }
    }

    @Override // com.bytedance.pitaya.thirdcomponent.downloader.PTYFileDownloader
    public void downloadFile(Context context, String url, String fileName, String str, String savePath, InterfaceC93313aOr listener) {
        o.LJIIJ(context, "context");
        o.LJIIJ(url, "url");
        o.LJIIJ(fileName, "fileName");
        o.LJIIJ(savePath, "savePath");
        o.LJIIJ(listener, "listener");
        DownloadTask with = C84261X5d.with(context);
        with.url(url);
        with.name(fileName);
        with.md5(str);
        with.savePath(savePath);
        with.subThreadListener(new C93335aPD(listener));
        int download = with.download();
        HashSet<Integer> hashSet = downloadingIds;
        synchronized (hashSet) {
            hashSet.add(Integer.valueOf(download));
        }
    }
}
