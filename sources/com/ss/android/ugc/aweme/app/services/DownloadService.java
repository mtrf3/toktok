package com.ss.android.ugc.aweme.app.services;

import X.C2NU;
import X.C36363EOx;
import X.C36364EOy;
import X.C38354F3m;
import X.C64923Pdv;
import android.content.Context;
import com.ss.android.common.util.NetworkUtils;
import java.io.File;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DownloadService implements IDownloadService {
    @Override // com.ss.android.ugc.aweme.app.services.IDownloadService
    public final boolean LIZ(Context context, String str, String str2, String str3) {
        List<C36364EOy> extractImageUrlList = C36363EOx.extractImageUrlList(str, null);
        o.LJIIIIZZ(extractImageUrlList, "extractImageUrlList(url, urlList)");
        if (extractImageUrlList.isEmpty()) {
            return false;
        }
        int i = 0;
        for (C36364EOy c36364EOy : extractImageUrlList) {
            if (c36364EOy != null) {
                String str4 = c36364EOy.LIZ;
                o.LJIIIIZZ(str4, "urlInfo.mUrl");
                if (C38354F3m.LJ(str4)) {
                    continue;
                } else {
                    i++;
                    if (i > 3) {
                        return false;
                    }
                    String[] strArr = new String[1];
                    int[] iArr = new int[1];
                    System.currentTimeMillis();
                    try {
                        try {
                            if (!C2NU.LIZ.LIZIZ()) {
                                return false;
                            }
                            try {
                                boolean downloadFile = NetworkUtils.downloadFile(20971520, str4, str2, "", str3, null, str3, null, c36364EOy.LIZIZ, strArr, iArr);
                                System.currentTimeMillis();
                                if (downloadFile) {
                                    try {
                                        try {
                                            File file = new File(str2, str3);
                                            if (file.isFile()) {
                                                long length = file.length();
                                                if (length > 0 && iArr[0] <= 0 && length < 2147483647L) {
                                                    iArr[0] = (int) length;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            if ((th instanceof SocketException) || (th instanceof IOException) || (th instanceof SocketTimeoutException) || (th instanceof C64923Pdv)) {
                                                if (!C2NU.LIZ.LIZIZ()) {
                                                    return false;
                                                }
                                            } else {
                                                throw th;
                                            }
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                                return downloadFile;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Exception unused2) {
                        return false;
                    }
                }
            }
        }
        return false;
    }
}
