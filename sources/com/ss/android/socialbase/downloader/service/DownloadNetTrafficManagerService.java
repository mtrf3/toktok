package com.ss.android.socialbase.downloader.service;

import X.C84262X5e;
import X.C84265X5h;
import X.EnumC84263X5f;
import X.WBN;
import X.X5N;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes16.dex */
public class DownloadNetTrafficManagerService implements IDownloadNetTrafficManagerService {
    @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
    public EnumC84263X5f getCurrentNetworkQuality() {
        return C84265X5h.LIZ.LIZ();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
    public double getDownloadKBitsPerSecond() {
        double d;
        C84262X5e c84262X5e = C84265X5h.LIZ;
        synchronized (c84262X5e) {
            WBN wbn = c84262X5e.LIZ;
            if (wbn != null) {
                d = wbn.LIZJ;
            } else {
                d = -1.0d;
            }
        }
        return d;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
    public void reset() {
        C84262X5e c84262X5e = C84265X5h.LIZ;
        c84262X5e.getClass();
        try {
            WBN wbn = c84262X5e.LIZ;
            if (wbn != null) {
                wbn.LIZJ = -1.0d;
                wbn.LIZLLL = 0;
            }
            c84262X5e.LIZJ.set(EnumC84263X5f.UNKNOWN);
        } catch (Throwable unused) {
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
    public EnumC84263X5f register(X5N x5n) {
        C84262X5e c84262X5e = C84265X5h.LIZ;
        if (x5n != null) {
            ((CopyOnWriteArrayList) c84262X5e.LJ).add(x5n);
        }
        return c84262X5e.LIZJ.get();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
    public void remove(X5N x5n) {
        C84262X5e c84262X5e = C84265X5h.LIZ;
        if (x5n != null) {
            ((CopyOnWriteArrayList) c84262X5e.LJ).remove(x5n);
        } else {
            c84262X5e.getClass();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a6, code lost:
    
        if (r5 < (r7 * 0.8d)) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1 A[Catch: all -> 0x00d7, TRY_LEAVE, TryCatch #0 {all -> 0x00d7, blocks: (B:19:0x004a, B:29:0x00b7, B:31:0x00c1, B:36:0x008e, B:38:0x0096, B:41:0x009e), top: B:18:0x004a }] */
    @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addBandwidth(long r12, long r14) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.service.DownloadNetTrafficManagerService.addBandwidth(long, long):void");
    }
}
