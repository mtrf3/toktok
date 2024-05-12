package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.0EP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0EP {
    public static C0EP LIZJ;
    public final HashMap<Integer, C0EO<Long, Long>> LIZ = new HashMap<>();
    public final HashMap<String, C0EN> LIZIZ = new HashMap<>();

    public static C0EP LJFF() {
        if (LIZJ == null) {
            synchronized (C0EP.class) {
                if (LIZJ == null) {
                    LIZJ = new C0EP();
                }
            }
        }
        return LIZJ;
    }

    public static DownloadInfo LIZJ(String str) {
        List<DownloadInfo> allDownloadInfo = Downloader.getInstance(C15380j0.LIZLLL()).getAllDownloadInfo();
        if (allDownloadInfo != null) {
            for (DownloadInfo downloadInfo : allDownloadInfo) {
                if (downloadInfo != null && TextUtils.equals(downloadInfo.getUrl(), str)) {
                    return downloadInfo;
                }
            }
            return null;
        }
        return null;
    }

    public static DownloadInfo LIZLLL(String str) {
        List<DownloadInfo> allDownloadInfo = Downloader.getInstance(C15380j0.LIZLLL()).getAllDownloadInfo();
        if (allDownloadInfo != null) {
            int size = allDownloadInfo.size();
            while (true) {
                size--;
                if (size >= 0) {
                    DownloadInfo downloadInfo = (DownloadInfo) ListProtector.get(allDownloadInfo, size);
                    if (downloadInfo != null && TextUtils.equals(downloadInfo.getExtra(), str)) {
                        return downloadInfo;
                    }
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }

    public static DownloadInfo LJ(int i) {
        return Downloader.getInstance(C15380j0.LIZLLL()).getDownloadInfo(i);
    }

    public static String LJI(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(CardStruct.IStatusCode.DEFAULT);
                    LIZ.append(hexString);
                    hexString = X1D.LIZIZ(LIZ);
                }
                stringBuffer.append(hexString);
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            HashMap hashMap = new HashMap();
            hashMap.put("error_msg", e.getMessage());
            C0K2.LJII(1, "ttlive_replay_MD5_fail", hashMap);
            return null;
        }
    }

    public final void LJII(String str, C0EN c0en) {
        this.LIZIZ.put(str, c0en);
    }

    public final void LIZIZ(int i, String str, String str2, String str3) {
        LIZ(str, str2, i, 1, str3, null);
    }

    public final int LJIIIIZZ(int i, final String str, String str2, String str3, final String str4) {
        DownloadTask with = C84261X5d.with(C15380j0.LIZLLL());
        with.url(str);
        with.name(str3);
        with.savePath(str2);
        with.minProgressTimeMsInterval(i);
        with.mainThreadListener(new AbsDownloadListener() { // from class: X.1ic
            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onPause(DownloadInfo downloadInfo) {
                super.onPause(downloadInfo);
                if (C0EP.this.LIZIZ.get(str) != null) {
                    C0EP.this.LIZIZ.get(str).onPause(downloadInfo);
                }
                if (!TextUtils.isEmpty(str4) && C0EP.this.LIZIZ.get(str4) != null) {
                    C0EP.this.LIZIZ.get(str4).onPause(downloadInfo);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("download_url", str);
                C0K2.LJII(2, "ttlive_live_replay_download_status_all", hashMap);
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onProgress(DownloadInfo downloadInfo) {
                super.onProgress(downloadInfo);
                if (C0EP.this.LIZIZ.get(str) != null) {
                    C0EP.this.LIZIZ.get(str).onProgress(downloadInfo);
                }
                if (!TextUtils.isEmpty(str4) && C0EP.this.LIZIZ.get(str4) != null) {
                    C0EP.this.LIZIZ.get(str4).onProgress(downloadInfo);
                }
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Long, F] */
            /* JADX WARN: Type inference failed for: r0v29, types: [S, java.lang.Long] */
            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                C0EO<Long, Long> c0eo;
                super.onSuccessed(downloadInfo);
                int id = downloadInfo.getId();
                if (C0EP.this.LIZ.containsKey(Integer.valueOf(id)) && (c0eo = C0EP.this.LIZ.get(Integer.valueOf(id))) != null) {
                    c0eo.LIZ = C0EM.LIZIZ(c0eo.LIZIZ, System.currentTimeMillis() + c0eo.LIZ.longValue());
                    c0eo.LIZIZ = Long.valueOf(System.currentTimeMillis());
                    C0EP.this.LIZ.put(Integer.valueOf(id), c0eo);
                }
                if (C0EP.this.LIZIZ.get(str) != null) {
                    C0EP.this.LIZIZ.get(str).LIZ(downloadInfo);
                }
                if (!TextUtils.isEmpty(str4) && C0EP.this.LIZIZ.get(str4) != null) {
                    C0EP.this.LIZIZ.get(str4).LIZ(downloadInfo);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("download_url", str);
                C0K2.LJII(0, "ttlive_live_replay_download_status_all", hashMap);
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Long, F] */
            /* JADX WARN: Type inference failed for: r0v26, types: [S, java.lang.Long] */
            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                int i2;
                String str5;
                super.onFailed(downloadInfo, baseException);
                if (C0EP.this.LIZIZ.get(str) != null) {
                    C0EP.this.LIZIZ.get(str).onFailed(downloadInfo, baseException);
                }
                if (!TextUtils.isEmpty(str4) && C0EP.this.LIZIZ.get(str4) != null) {
                    C0EP.this.LIZIZ.get(str4).onFailed(downloadInfo, baseException);
                }
                int id = downloadInfo.getId();
                if (C0EP.this.LIZ.containsKey(Integer.valueOf(id))) {
                    C0EO<Long, Long> c0eo = C0EP.this.LIZ.get(Integer.valueOf(id));
                    if (c0eo != null) {
                        c0eo.LIZ = C0EM.LIZIZ(c0eo.LIZIZ, System.currentTimeMillis() + c0eo.LIZ.longValue());
                        c0eo.LIZIZ = Long.valueOf(System.currentTimeMillis());
                        C0EP.this.LIZ.put(Integer.valueOf(id), c0eo);
                    }
                } else {
                    C0EP.this.LIZ.remove(Integer.valueOf(id));
                }
                HashMap hashMap = new HashMap();
                if (baseException != null) {
                    i2 = baseException.getErrorCode();
                } else {
                    i2 = -1;
                }
                hashMap.put("error_code", Integer.valueOf(i2));
                if (baseException != null) {
                    str5 = baseException.getErrorMessage();
                } else {
                    str5 = "";
                }
                hashMap.put("error_msg", str5);
                hashMap.put("download_url", str);
                C0K2.LJII(1, "ttlive_live_replay_download_status_all", hashMap);
                C0K2.LJII(1, "ttlive_live_replay_download_status_error", hashMap);
            }
        });
        if (!TextUtils.isEmpty(str4)) {
            with.extra(str4);
        }
        return with.download();
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Long, F] */
    /* JADX WARN: Type inference failed for: r0v23, types: [S, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v32, types: [S, java.lang.Long] */
    public final int LIZ(String str, String str2, int i, int i2, String str3, String str4) {
        C0EO<Long, Long> c0eo;
        C0EO<Long, Long> c0eo2;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            return 0;
                        }
                        int downloadId = Downloader.getInstance(C15380j0.LIZLLL()).getDownloadId(str, str2);
                        Downloader.getInstance(C15380j0.LIZLLL()).restart(downloadId);
                        return downloadId;
                    }
                    int downloadId2 = Downloader.getInstance(C15380j0.LIZLLL()).getDownloadId(str, str2);
                    if (this.LIZ.containsKey(Integer.valueOf(downloadId2)) && (c0eo2 = this.LIZ.get(Integer.valueOf(downloadId2))) != null) {
                        c0eo2.LIZIZ = Long.valueOf(System.currentTimeMillis());
                        this.LIZ.put(Integer.valueOf(downloadId2), c0eo2);
                    }
                    LJIIIIZZ(i2, str, str2, str3, str4);
                    return downloadId2;
                }
                int downloadId3 = Downloader.getInstance(C15380j0.LIZLLL()).getDownloadId(str, str2);
                if (this.LIZ.containsKey(Integer.valueOf(downloadId3)) && (c0eo = this.LIZ.get(Integer.valueOf(downloadId3))) != null) {
                    c0eo.LIZ = C0EM.LIZIZ(c0eo.LIZIZ, System.currentTimeMillis() + c0eo.LIZ.longValue());
                    c0eo.LIZIZ = Long.valueOf(System.currentTimeMillis());
                    this.LIZ.put(Integer.valueOf(downloadId3), c0eo);
                }
                Downloader.getInstance(C15380j0.LIZLLL()).pause(downloadId3);
                return downloadId3;
            }
            int downloadId4 = Downloader.getInstance(C15380j0.LIZLLL()).getDownloadId(str, str2);
            Downloader.getInstance(C15380j0.LIZLLL()).clearDownloadData(downloadId4);
            this.LIZ.remove(Integer.valueOf(downloadId4));
            return downloadId4;
        }
        int LJIIIIZZ = LJIIIIZZ(i2, str, str2, str3, str4);
        this.LIZ.put(Integer.valueOf(LJIIIIZZ), new C0EO<>(0L, Long.valueOf(System.currentTimeMillis())));
        return LJIIIIZZ;
    }
}
