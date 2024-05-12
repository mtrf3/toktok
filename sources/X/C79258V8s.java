package X;

import com.bytedance.android.livesdkapi.util.file.FileDownloadTaskController;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.V8s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79258V8s {
    public static final C79258V8s LIZ = new C79258V8s();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C79257V8r.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C73017SlB.LJLIL);

    public static Downloader LIZJ() {
        return (Downloader) LIZIZ.getValue();
    }

    public static final void LIZ(InterfaceC88472Yns<? super DownloadInfo, Boolean> isTargetInfo) {
        int status;
        o.LJIIIZ(isTargetInfo, "isTargetInfo");
        List<DownloadInfo> allDownloadInfo = LIZJ().getAllDownloadInfo();
        if (allDownloadInfo != null) {
            for (DownloadInfo downloadInfo : allDownloadInfo) {
                if (C47261Igj.LJJIIJZLJL(downloadInfo.getStatus()) || (status = downloadInfo.getStatus()) == -1 || status == -2 || status == -7 || status == -4 || status == -5) {
                    if (isTargetInfo.invoke(downloadInfo).booleanValue()) {
                        LIZJ().clearDownloadData(downloadInfo.getId());
                    }
                }
            }
        }
    }

    public final FileDownloadTaskController LIZIZ(C31824CeK config, InterfaceC88472Yns cb) {
        o.LJIIIZ(config, "config");
        o.LJIIIZ(cb, "cb");
        C28721BOz.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("config: = ");
        LIZ2.append(config);
        BP1.LIZ("RemoteUrlFileDownloadUtil#download", X1D.LIZIZ(LIZ2));
        C79259V8t c79259V8t = new C79259V8t(config);
        cb.invoke(c79259V8t);
        DownloadTask downloaderTask = C84261X5d.with(C15380j0.LIZLLL());
        downloaderTask.url(config.LJIIIZ);
        downloaderTask.name(config.LIZ);
        downloaderTask.savePath(C78983UzD.LJJIIJ(config));
        downloaderTask.mimeType(config.LIZLLL);
        downloaderTask.retryCount(config.LJIILIIL);
        downloaderTask.extra(config.LJIIJ);
        if (config.LJIIL) {
            downloaderTask.mainThreadListener(c79259V8t);
        } else {
            downloaderTask.subThreadListener(c79259V8t);
        }
        Downloader downloader = LIZJ();
        o.LJIIIIZZ(downloader, "downloader");
        o.LJIIIIZZ(downloaderTask, "downloaderTask");
        FileDownloadTaskController fileDownloadTaskController = new FileDownloadTaskController(downloader, config, c79259V8t, downloaderTask);
        if (config.LJIIJJI && !fileDownloadTaskController.LJLJJL) {
            fileDownloadTaskController.LJLJJL = true;
            if (!fileDownloadTaskController.LJLILLLLZI.LJIILJJIL) {
                List<DownloadInfo> allDownloadInfo = fileDownloadTaskController.LJLIL.getAllDownloadInfo();
                ArrayList LIZIZ2 = s1.LIZIZ(allDownloadInfo, "downloader.allDownloadInfo");
                for (DownloadInfo downloadInfo : allDownloadInfo) {
                    DownloadInfo downloadInfo2 = downloadInfo;
                    if (o.LJ(downloadInfo2.getUrl(), fileDownloadTaskController.LJLILLLLZI.LJIIIZ) && downloadInfo2.getStatus() == -3 && X4Q.LJIJI(downloadInfo2.getSavePath(), downloadInfo2.getName())) {
                        LIZIZ2.add(downloadInfo);
                    }
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = LIZIZ2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (o.LJ(((DownloadInfo) next).getTargetFilePath(), C78983UzD.LJJIIJZLJL(fileDownloadTaskController.LJLILLLLZI))) {
                        arrayList.add(next);
                    }
                }
                if (true ^ arrayList.isEmpty()) {
                    fileDownloadTaskController.LJLJI.onSuccessed((DownloadInfo) ListProtector.get(arrayList, 0));
                }
            }
            fileDownloadTaskController.LJLJJI.asyncDownload(C78540Us4.LJLIL);
        }
        ((Number) LIZJ.getValue()).longValue();
        return fileDownloadTaskController;
    }
}
