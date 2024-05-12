package com.ss.android.socialbase.downloader.service;

import X.C16880lQ;
import X.C84236X4e;
import X.X43;
import X.X4I;
import X.X4Q;
import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes16.dex */
public class DownloadIdGeneratorService implements IDownloadIdGeneratorService {
    public X43 mDownloadIdGenerator;

    @Override // com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService
    public boolean isDefaultIdGenerator() {
        if (this.mDownloadIdGenerator == null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService
    public int generate(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return 0;
        }
        String taskKey = downloadInfo.getTaskKey();
        if (TextUtils.isEmpty(taskKey)) {
            taskKey = downloadInfo.getUrl();
        }
        return generate(taskKey, downloadInfo.getSavePath());
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService
    public void setDownloadIdGenerator(X43 x43) {
        this.mDownloadIdGenerator = x43;
    }

    private int generateImpl(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 0;
        }
        if (C84236X4e.LJ(str2) > 1) {
            if (!TextUtils.isEmpty(str2) && str2.startsWith("content")) {
                int i = 0;
                while (true) {
                    SparseArray<X4I> sparseArray = C84236X4e.LIZ;
                    if (i >= sparseArray.size()) {
                        break;
                    }
                    X4I x4i = sparseArray.get(sparseArray.keyAt(i));
                    if (str2.startsWith(x4i.LIZIZ)) {
                        str2 = x4i.LIZIZ;
                        break;
                    }
                    i++;
                }
            }
            str2 = null;
        }
        String LJJIFFI = X4Q.LJJIFFI(C16880lQ.LLLZ("%s_%s", new Object[]{str, str2}));
        if (TextUtils.isEmpty(LJJIFFI)) {
            return 0;
        }
        return LJJIFFI.hashCode();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService, X.X43
    public int generate(String str, String str2) {
        X43 x43 = this.mDownloadIdGenerator;
        if (x43 != null) {
            return x43.generate(str, str2);
        }
        return generateImpl(str, str2);
    }
}
