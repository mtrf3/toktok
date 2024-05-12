package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadTTNetException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class X4R {
    public static void LIZJ(X49 x49) {
        VE0 ve0 = C84212X3g.LJJ;
        if (ve0 == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("db_init_duration", x49.LIZ);
            jSONObject.put("db_init_disk_cache_count", x49.LIZIZ);
            jSONObject.put("db_init_memory_cache_count", x49.LIZJ);
            jSONObject.put("db_init_disk_cache_size", x49.LIZLLL);
            ve0.LIZ("download_db", jSONObject);
        } catch (Throwable unused) {
        }
    }

    public static void LJI(DownloadTask downloadTask, BaseException baseException, int i) {
        int[] LIZ;
        if (downloadTask == null) {
            return;
        }
        try {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo == null) {
                return;
            }
            InterfaceC84194X2o monitorDepend = downloadTask.getMonitorDepend();
            if (i != 2 && i != -3 && i != -1 && i != -4 && i != -2 && i != 6 && i != 0) {
                int[] extraMonitorStatus = downloadInfo.getExtraMonitorStatus();
                if (extraMonitorStatus != null && extraMonitorStatus.length > 0) {
                    for (int i2 : extraMonitorStatus) {
                        if (i == i2) {
                            break;
                        }
                    }
                }
                if (monitorDepend != null && (monitorDepend instanceof AbstractC84195X2p) && (LIZ = ((AbstractC84195X2p) monitorDepend).LIZ()) != null && LIZ.length > 0) {
                    for (int i3 : LIZ) {
                        if (i != i3) {
                        }
                    }
                    return;
                }
                return;
            }
            try {
                IDownloadDepend depend = downloadTask.getDepend();
                if (depend != null) {
                    depend.monitorLogSend(downloadInfo, baseException, i);
                }
            } catch (Throwable unused) {
            }
            LJIIIIZZ(monitorDepend, downloadInfo, baseException, i);
            LJII(C84212X3g.LJJ, downloadInfo, baseException, i);
        } catch (Throwable unused2) {
        }
    }

    public static void LJIIIZ(int i, JSONObject jSONObject, DownloadInfo downloadInfo) {
        String str;
        if (i != -5) {
            if (i != -4) {
                if (i != -3) {
                    if (i != -2) {
                        if (i != 0) {
                            if (i != 2) {
                                if (i != 6) {
                                    str = "";
                                } else {
                                    str = "download_first_start";
                                }
                            } else {
                                str = "download_start";
                            }
                        } else {
                            str = "download_create";
                        }
                    } else {
                        str = "download_pause";
                    }
                } else {
                    double downloadSpeed = downloadInfo.getDownloadSpeed();
                    if (downloadSpeed >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                        jSONObject.put("download_speed", downloadSpeed);
                    }
                    jSONObject.put("throttle_speed", downloadInfo.getThrottleNetSpeed());
                    str = "download_success";
                }
            } else {
                str = "download_cancel";
            }
        } else {
            str = "download_uncomplete";
        }
        jSONObject.put("status", str);
    }

    public static JSONObject LIZ(String str, DownloadInfo downloadInfo, BaseException baseException, int i) {
        JSONObject jSONObject;
        String str2;
        int i2;
        int i3;
        int i4;
        String md5;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        String str3;
        String str4;
        int i10;
        int i11;
        int i12;
        String str5;
        String taskId;
        int i13;
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e) {
            e = e;
            jSONObject = null;
        }
        try {
            synchronized (C84212X3g.class) {
            }
            String str6 = "";
            if (baseException != null && (baseException instanceof DownloadTTNetException)) {
                str6 = ((DownloadTTNetException) baseException).getRequestLog();
            }
            jSONObject.put("event_page", str);
            jSONObject.put("app_id", "");
            jSONObject.put("device_id", "");
            jSONObject.put("device_id_postfix", "");
            int i14 = 0;
            jSONObject.put("update_version", 0);
            jSONObject.put("download_status", i);
            if (downloadInfo != null) {
                jSONObject.put("setting_tag", X4H.LJFF(downloadInfo.getId(), downloadInfo).LJIIJJI());
                jSONObject.put("download_id", downloadInfo.getId());
                jSONObject.put("name", downloadInfo.getName());
                jSONObject.put("url", downloadInfo.getUrl());
                jSONObject.put("save_path", downloadInfo.getSavePath());
                jSONObject.put("download_time", downloadInfo.getDownloadTime());
                jSONObject.put("cur_bytes", downloadInfo.getCurBytes());
                jSONObject.put("total_bytes", downloadInfo.getTotalBytes());
                jSONObject.put("network_quality", downloadInfo.getNetworkQuality());
                int i15 = 1;
                if (downloadInfo.isOnlyWifi()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                jSONObject.put("only_wifi", i2);
                if (downloadInfo.isNeedHttpsToHttpRetry()) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                jSONObject.put("need_https_degrade", i3);
                if (downloadInfo.isHttpsToHttpRetryUsed()) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                jSONObject.put("https_degrade_retry_used", i4);
                if (downloadInfo.getMd5() == null) {
                    md5 = "";
                } else {
                    md5 = downloadInfo.getMd5();
                }
                jSONObject.put("md5", md5);
                jSONObject.put("chunk_count", downloadInfo.getChunkCount());
                if (downloadInfo.isForce()) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                jSONObject.put("is_force", i5);
                jSONObject.put("retry_count", downloadInfo.getRetryCount());
                if (downloadInfo.isNeedRetryDelay()) {
                    i6 = 1;
                } else {
                    i6 = 0;
                }
                jSONObject.put("need_retry_delay", i6);
                if (downloadInfo.isNeedReuseFirstConnection()) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                jSONObject.put("need_reuse_first_connection", i7);
                if (downloadInfo.isNeedDefaultHttpServiceBackUp()) {
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                jSONObject.put("default_http_service_backup", i8);
                jSONObject.put("retry_delay_status", downloadInfo.getRetryDelayStatus().ordinal());
                jSONObject.put("download_byte_error_retry_status", downloadInfo.getByteInvalidRetryStatus().ordinal());
                jSONObject.put("forbidden_handler_status", downloadInfo.getAsyncHandleStatus().ordinal());
                if (downloadInfo.isNeedIndependentProcess()) {
                    i9 = 1;
                } else {
                    i9 = 0;
                }
                jSONObject.put("need_independent_process", i9);
                if (downloadInfo.getHeadConnectionException() != null) {
                    str3 = downloadInfo.getHeadConnectionException();
                } else {
                    str3 = "";
                }
                jSONObject.put("head_connection_error_msg", str3);
                if (downloadInfo.getExtra() != null) {
                    str4 = downloadInfo.getExtra();
                } else {
                    str4 = "";
                }
                jSONObject.put("extra", str4);
                if (downloadInfo.isAddListenerToSameTask()) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                jSONObject.put("add_listener_to_same_task", i10);
                if (downloadInfo.getBackUpUrls() != null) {
                    i11 = downloadInfo.getBackUpUrls().size();
                } else {
                    i11 = 0;
                }
                jSONObject.put("backup_url_count", i11);
                if (downloadInfo.getBackUpUrls() != null) {
                    i12 = downloadInfo.getCurBackUpUrlIndex();
                } else {
                    i12 = -1;
                }
                jSONObject.put("cur_backup_url_index", i12);
                if (downloadInfo.getForbiddenBackupUrls() != null) {
                    str5 = downloadInfo.getForbiddenBackupUrls().toString();
                } else {
                    str5 = "";
                }
                jSONObject.put("forbidden_urls", str5);
                if (TextUtils.isEmpty(downloadInfo.getTaskId())) {
                    taskId = "";
                } else {
                    taskId = downloadInfo.getTaskId();
                }
                jSONObject.put("task_id", taskId);
                jSONObject.put("network_retry_count", downloadInfo.getCurNetworkRetryCount());
                jSONObject.put("cache_exists_in_downloading", downloadInfo.isCacheExistsInDownloading());
                if (i == -3 || i == -4 || i == -1 || i == -2) {
                    jSONObject.put("all_connect_time", downloadInfo.getAllConnectTime());
                    jSONObject.put("first_speed_time", downloadInfo.getFirstSpeedTime());
                    jSONObject.put("real_download_time", downloadInfo.getRealDownloadTime());
                    jSONObject.put("download_time", downloadInfo.getDownloadTime());
                    if (downloadInfo.isHttpsToHttpRetryUsed()) {
                        i13 = 1;
                    } else {
                        i13 = 0;
                    }
                    jSONObject.put("https_degrade_retry_used", i13);
                    if (!downloadInfo.isBackUpUrlUsed()) {
                        i15 = 0;
                    }
                    jSONObject.put("backup_url_used", i15);
                    jSONObject.put("cur_retry_time", downloadInfo.getCurRetryTime());
                    jSONObject.put("cur_retry_time_in_total", downloadInfo.getCurRetryTimeInTotal());
                }
                try {
                    String str7 = "";
                    String str8 = "";
                    String str9 = "";
                    String url = downloadInfo.getUrl();
                    if (!TextUtils.isEmpty(url)) {
                        android.net.Uri parse = UriProtector.parse(url);
                        str7 = parse.getHost();
                        str8 = parse.getPath();
                        str9 = parse.getLastPathSegment();
                        if (!TextUtils.isEmpty(str8) && !TextUtils.isEmpty(str9)) {
                            try {
                                str8 = str8.substring(0, str8.length() - str9.length());
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    jSONObject.put("url_host", str7);
                    jSONObject.put("url_path", str8);
                    jSONObject.put("url_last_path_segment", str9);
                } catch (Throwable unused2) {
                }
            }
            if (baseException != null) {
                i14 = baseException.getErrorCode();
            }
            jSONObject.put("error_code", i14);
            if (baseException != null) {
                str2 = baseException.getErrorMessage();
            } else {
                str2 = "";
            }
            jSONObject.put("error_msg", str2);
            jSONObject.put("request_log", str6);
        } catch (JSONException e2) {
            e = e2;
            C16880lQ.LLLLIIL(e);
            return jSONObject;
        }
        return jSONObject;
    }

    public static void LJII(VE0 ve0, DownloadInfo downloadInfo, BaseException baseException, int i) {
        int i2;
        if (ve0 == null || !downloadInfo.isNeedSDKMonitor()) {
            return;
        }
        try {
            JSONObject LIZ = LIZ(downloadInfo.getMonitorScene(), downloadInfo, baseException, i);
            if (LIZ == null) {
                LIZ = new JSONObject();
            }
            if (i == -1) {
                LIZ.put("status", baseException.getErrorCode());
                if (X4Q.LJIL(C84212X3g.LJ())) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                LIZ.put("net_connected", i2);
                ve0.LIZ("download_failed", LIZ);
                return;
            }
            LJIIIZ(i, LIZ, downloadInfo);
            ve0.LIZ("download_common", LIZ);
        } catch (Throwable unused) {
        }
    }

    public static void LJIIIIZZ(InterfaceC84194X2o interfaceC84194X2o, DownloadInfo downloadInfo, BaseException baseException, int i) {
        if (interfaceC84194X2o == null) {
            return;
        }
        try {
            String eventPage = interfaceC84194X2o.getEventPage();
            if (TextUtils.isEmpty(eventPage)) {
                eventPage = "default";
            }
            JSONObject LIZ = LIZ(eventPage, downloadInfo, baseException, i);
            if (LIZ == null) {
                LIZ = new JSONObject();
            }
            interfaceC84194X2o.monitorLogSend(LIZ);
        } catch (Throwable unused) {
        }
    }

    public static void LIZIZ(X5J x5j, String str, String str2, long j, String str3, int i, IOException iOException, DownloadInfo downloadInfo) {
        String str4;
        String requestLog;
        int httpStatusCode;
        VE0 ve0;
        if (downloadInfo == null) {
            return;
        }
        String str5 = null;
        X4H LJFF = X4H.LJFF(downloadInfo.getId(), null);
        int LJIIIIZZ = LJFF.LJIIIIZZ("monitor_download_connect", 0);
        if (LJIIIIZZ <= 0 || TextUtils.isEmpty(str)) {
            return;
        }
        int i2 = -1;
        if (x5j != null) {
            try {
                i2 = x5j.LIZ();
            } catch (Throwable unused) {
            }
            try {
                if (x5j instanceof X3T) {
                    str4 = ((X3T) x5j).LIZLLL();
                } else {
                    str4 = null;
                }
            } catch (Throwable unused2) {
                return;
            }
        } else {
            str4 = null;
            i2 = -1;
        }
        String str6 = "";
        if (i2 < 200 || i2 >= 400) {
            if (downloadInfo.getCurRetryTime() != 0 && ((httpStatusCode = downloadInfo.getHttpStatusCode()) < 200 || httpStatusCode >= 400)) {
                return;
            }
            if (iOException != null) {
                if (X4Q.LJIL(C84212X3g.LJ()) || X4H.LIZIZ().optBoolean("disable_check_no_network")) {
                    try {
                        X4P.LJIJJLI("", iOException);
                        throw null;
                    } catch (BaseException e) {
                        i2 = e.getErrorCode();
                        str5 = e.getErrorMessage();
                        if (e instanceof DownloadTTNetException) {
                            requestLog = ((DownloadTTNetException) e).getRequestLog();
                        }
                    }
                } else {
                    i2 = 1049;
                }
            }
        }
        requestLog = "";
        android.net.Uri parse = UriProtector.parse(str);
        String host = parse.getHost();
        String path = parse.getPath();
        String lastPathSegment = parse.getLastPathSegment();
        if (!TextUtils.isEmpty(path) && !TextUtils.isEmpty(lastPathSegment)) {
            try {
                path = path.substring(0, path.length() - lastPathSegment.length());
            } catch (Throwable unused3) {
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("setting_tag", LJFF.LJIIJJI());
            jSONObject.put("url_host", host);
            jSONObject.putOpt("host_ip", str2);
            jSONObject.putOpt("host_real_ip", str4);
            jSONObject.put("url_path", path);
            jSONObject.put("url_last_path_segment", lastPathSegment);
            jSONObject.put("net_lib", i);
            jSONObject.put("connect_type", str3);
            jSONObject.put("status_code", i2);
            jSONObject.put("request_log", requestLog);
            if (str5 != null) {
                int LJIIIIZZ2 = LJFF.LJIIIIZZ("exception_msg_length", LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
                if (LJIIIIZZ2 != 0) {
                    if (TextUtils.isEmpty(str5) || str5.length() <= LJIIIIZZ2) {
                        str6 = str5;
                    } else {
                        str6 = str5.substring(0, LJIIIIZZ2);
                    }
                }
                jSONObject.put("error_msg", str6);
            }
            jSONObject.put("connect_time", j);
            jSONObject.put("pkg_name", downloadInfo.getPackageName());
            jSONObject.put("name", downloadInfo.getTitle());
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        if ((LJIIIIZZ == 1 || LJIIIIZZ == 3) && (ve0 = C84212X3g.LJJ) != null) {
            ve0.LIZ("download_connect", jSONObject);
        }
        if (LJIIIIZZ == 2 || LJIIIIZZ == 3) {
            if (C84212X3g.LJJJJ == null) {
                C84212X3g.LJJJJ = new C1FP();
            }
            C1FP c1fp = C84212X3g.LJJJJ;
            downloadInfo.getId();
            c1fp.getClass();
        }
    }

    public static void LJFF(X4H x4h, DownloadInfo downloadInfo, String str, String str2, String str3, boolean z, X5F x5f, BaseException baseException, long j, long j2) {
        LJ("segment_io", x4h.LJIIIIZZ("monitor_segment_io", 0), x4h, downloadInfo, str, str2, str3, x5f, z, false, baseException, j, j2, false, -1L, -1L, -1L);
    }

    public static void LIZLLL(X4H x4h, DownloadInfo downloadInfo, String str, X5F x5f, boolean z, boolean z2, BaseException baseException, long j, long j2, boolean z3, long j3, long j4, long j5) {
        LJ("download_io", x4h.LJIIIIZZ("monitor_download_io", 0), x4h, downloadInfo, str, null, null, x5f, z, z2, baseException, j, j2, z3, j3, j4, j5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076 A[Catch: all -> 0x0010, TRY_ENTER, TryCatch #0 {all -> 0x0010, blocks: (B:6:0x0011, B:8:0x0028, B:17:0x006a, B:20:0x0076, B:23:0x007d, B:25:0x0089, B:26:0x0093, B:31:0x00a7, B:33:0x00ab, B:34:0x00ae, B:36:0x00b2, B:37:0x00b8, B:39:0x010e, B:42:0x012c, B:43:0x0120, B:45:0x0126, B:47:0x013a, B:48:0x012f, B:51:0x0146, B:53:0x014e, B:54:0x0169, B:62:0x018f, B:64:0x0193, B:65:0x019a, B:68:0x0181, B:70:0x0185, B:78:0x0049, B:80:0x0053, B:83:0x0066, B:84:0x0062), top: B:5:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010e A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:6:0x0011, B:8:0x0028, B:17:0x006a, B:20:0x0076, B:23:0x007d, B:25:0x0089, B:26:0x0093, B:31:0x00a7, B:33:0x00ab, B:34:0x00ae, B:36:0x00b2, B:37:0x00b8, B:39:0x010e, B:42:0x012c, B:43:0x0120, B:45:0x0126, B:47:0x013a, B:48:0x012f, B:51:0x0146, B:53:0x014e, B:54:0x0169, B:62:0x018f, B:64:0x0193, B:65:0x019a, B:68:0x0181, B:70:0x0185, B:78:0x0049, B:80:0x0053, B:83:0x0066, B:84:0x0062), top: B:5:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:6:0x0011, B:8:0x0028, B:17:0x006a, B:20:0x0076, B:23:0x007d, B:25:0x0089, B:26:0x0093, B:31:0x00a7, B:33:0x00ab, B:34:0x00ae, B:36:0x00b2, B:37:0x00b8, B:39:0x010e, B:42:0x012c, B:43:0x0120, B:45:0x0126, B:47:0x013a, B:48:0x012f, B:51:0x0146, B:53:0x014e, B:54:0x0169, B:62:0x018f, B:64:0x0193, B:65:0x019a, B:68:0x0181, B:70:0x0185, B:78:0x0049, B:80:0x0053, B:83:0x0066, B:84:0x0062), top: B:5:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014e A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:6:0x0011, B:8:0x0028, B:17:0x006a, B:20:0x0076, B:23:0x007d, B:25:0x0089, B:26:0x0093, B:31:0x00a7, B:33:0x00ab, B:34:0x00ae, B:36:0x00b2, B:37:0x00b8, B:39:0x010e, B:42:0x012c, B:43:0x0120, B:45:0x0126, B:47:0x013a, B:48:0x012f, B:51:0x0146, B:53:0x014e, B:54:0x0169, B:62:0x018f, B:64:0x0193, B:65:0x019a, B:68:0x0181, B:70:0x0185, B:78:0x0049, B:80:0x0053, B:83:0x0066, B:84:0x0062), top: B:5:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0193 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:6:0x0011, B:8:0x0028, B:17:0x006a, B:20:0x0076, B:23:0x007d, B:25:0x0089, B:26:0x0093, B:31:0x00a7, B:33:0x00ab, B:34:0x00ae, B:36:0x00b2, B:37:0x00b8, B:39:0x010e, B:42:0x012c, B:43:0x0120, B:45:0x0126, B:47:0x013a, B:48:0x012f, B:51:0x0146, B:53:0x014e, B:54:0x0169, B:62:0x018f, B:64:0x0193, B:65:0x019a, B:68:0x0181, B:70:0x0185, B:78:0x0049, B:80:0x0053, B:83:0x0066, B:84:0x0062), top: B:5:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a3  */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(java.lang.String r21, int r22, X.X4H r23, com.ss.android.socialbase.downloader.model.DownloadInfo r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, X.X5F r28, boolean r29, boolean r30, com.ss.android.socialbase.downloader.exception.BaseException r31, long r32, long r34, boolean r36, long r37, long r39, long r41) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X4R.LJ(java.lang.String, int, X.X4H, com.ss.android.socialbase.downloader.model.DownloadInfo, java.lang.String, java.lang.String, java.lang.String, X.X5F, boolean, boolean, com.ss.android.socialbase.downloader.exception.BaseException, long, long, boolean, long, long, long):void");
    }
}
