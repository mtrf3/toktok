package X;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadTTNetException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes16.dex */
public final class X4P {
    public static final String LIZ = C16880lQ.LJLLJ(X4P.class);
    public static volatile SparseArray<Boolean> LIZIZ;
    public static volatile SparseArray<List<X5K>> LIZJ;
    public static Pattern LIZLLL;
    public static Pattern LJ;
    public static Boolean LJFF;
    public static Boolean LJI;

    static {
        PatternProtector.compile(".*\\d+ *- *(\\d+) */ *\\d+");
        LIZIZ = new SparseArray<>();
        LIZJ = new SparseArray<>();
        LIZLLL = null;
        LJ = null;
    }

    public static boolean LJIIL() {
        Boolean bool = LJI;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (C84212X3g.LJ() == null) {
            return false;
        }
        String LJIIJ = X4Q.LJIIJ(C84212X3g.LJ());
        if (LJIIJ != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C84212X3g.LJ().getPackageName());
            LIZ2.append(":downloader");
            if (LJIIJ.equals(X1D.LIZIZ(LIZ2))) {
                LJI = Boolean.TRUE;
                return LJI.booleanValue();
            }
        }
        LJI = Boolean.FALSE;
        return LJI.booleanValue();
    }

    public static boolean LJIILJJIL() {
        Boolean bool = LJFF;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        if (X4H.LJFF.LJIIIIZZ("force_independent_process", 0) > 0) {
            Boolean bool2 = Boolean.FALSE;
            LJFF = bool2;
            return bool2.booleanValue();
        }
        if (C84212X3g.LJ() == null) {
            return true;
        }
        String LJIIJ = X4Q.LJIIJ(C84212X3g.LJ());
        if (LJIIJ != null) {
            if (LJIIJ.contains(":")) {
                LJFF = Boolean.FALSE;
                return LJFF.booleanValue();
            }
            if (LJIIJ.equals(C84212X3g.LJ().getPackageName())) {
                z = true;
            }
        }
        LJFF = Boolean.valueOf(z);
        return LJFF.booleanValue();
    }

    public static boolean LJIJ() {
        boolean z;
        if (!LJIIL()) {
            synchronized (C84212X3g.class) {
                z = C84212X3g.LJJII;
            }
            if (z && X3C.LIZ(true).LIZJ()) {
                return true;
            }
        }
        return false;
    }

    public static void LIZLLL(String str) {
        if (C65210PiY.LIZ() && X4Q.LJIJJLI()) {
            String str2 = LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("This method:");
            LIZ2.append(str);
            LIZ2.append(" cannot be executed on the main thread");
            C65210PiY.LIZJ(str2, "checkWorkerThread", X1D.LIZIZ(LIZ2));
        }
    }

    public static EnumC84256X4y LJ(int i) {
        EnumC84256X4y enumC84256X4y = EnumC84256X4y.MAIN;
        EnumC84256X4y enumC84256X4y2 = EnumC84256X4y.SUB;
        if (i != enumC84256X4y2.ordinal()) {
            enumC84256X4y2 = EnumC84256X4y.NOTIFICATION;
            if (i != enumC84256X4y2.ordinal()) {
                return enumC84256X4y;
            }
        }
        return enumC84256X4y2;
    }

    public static boolean LJIILL(Throwable th) {
        if (th == null) {
            return false;
        }
        if (C84212X3g.LJIJI().LIZLLL(th) == 412) {
            return true;
        }
        String LJIILLIIL = X4Q.LJIILLIIL(th);
        if (TextUtils.isEmpty(LJIILLIIL) || !LJIILLIIL.contains("Precondition Failed")) {
            return false;
        }
        return true;
    }

    public static boolean LJIILLIIL(Throwable th) {
        if (th == null) {
            return false;
        }
        if (C84212X3g.LJIJI().LIZLLL(th) == 416) {
            return true;
        }
        String LJIILLIIL = X4Q.LJIILLIIL(th);
        if (TextUtils.isEmpty(LJIILLIIL) || !LJIILLIIL.contains("Requested Range Not Satisfiable")) {
            return false;
        }
        return true;
    }

    public static long LJIJI(String str) {
        if (str == null) {
            return -1L;
        }
        String[] split = str.split("/");
        if (split.length >= 2) {
            try {
                return CastLongProtector.parseLong(split[1]);
            } catch (NumberFormatException e) {
                String str2 = LIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Exception:");
                LIZ2.append(e);
                C65210PiY.LIZJ(str2, "parseContentRangeOfInstanceLength", X1D.LIZIZ(LIZ2));
            }
        }
        return -1L;
    }

    public static DownloadInfo LJIJJ(Cursor cursor) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        C84248X4q c84248X4q = new C84248X4q();
        try {
            int columnIndex = cursor.getColumnIndex("_id");
            if (columnIndex != -1) {
                c84248X4q.LJJL = cursor.getInt(columnIndex);
            }
            int columnIndex2 = cursor.getColumnIndex("name");
            if (columnIndex2 != -1) {
                c84248X4q.LIZ = cursor.getString(columnIndex2);
            }
            int columnIndex3 = cursor.getColumnIndex("title");
            if (columnIndex3 != -1) {
                c84248X4q.LIZIZ = cursor.getString(columnIndex3);
            }
            int columnIndex4 = cursor.getColumnIndex("url");
            if (columnIndex4 != -1) {
                c84248X4q.LIZJ = cursor.getString(columnIndex4);
            }
            int columnIndex5 = cursor.getColumnIndex("savePath");
            if (columnIndex5 != -1) {
                c84248X4q.LIZLLL = cursor.getString(columnIndex5);
            }
            int columnIndex6 = cursor.getColumnIndex("tempPath");
            if (columnIndex6 != -1) {
                c84248X4q.LJ = cursor.getString(columnIndex6);
            }
            int columnIndex7 = cursor.getColumnIndex("chunkCount");
            if (columnIndex7 != -1) {
                c84248X4q.LJJLI = cursor.getInt(columnIndex7);
            }
            int columnIndex8 = cursor.getColumnIndex("status");
            boolean z10 = false;
            if (columnIndex8 != -1) {
                c84248X4q.LJJLIIIIJ = cursor.getInt(columnIndex8);
            } else {
                c84248X4q.LJJLIIIIJ = 0;
            }
            int columnIndex9 = cursor.getColumnIndex("curBytes");
            if (columnIndex9 != -1) {
                c84248X4q.LJJLIIIJ = cursor.getLong(columnIndex9);
            } else {
                c84248X4q.LJJLIIIJ = 0L;
            }
            int columnIndex10 = cursor.getColumnIndex("totalBytes");
            if (columnIndex10 != -1) {
                c84248X4q.LJJLIIIJILLIZJL = cursor.getLong(columnIndex10);
            }
            int columnIndex11 = cursor.getColumnIndex("eTag");
            if (columnIndex11 != -1) {
                c84248X4q.LJJZ = cursor.getString(columnIndex11);
            }
            int columnIndex12 = cursor.getColumnIndex("onlyWifi");
            if (columnIndex12 != -1) {
                if (cursor.getInt(columnIndex12) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                c84248X4q.LJFF = z9;
            }
            int columnIndex13 = cursor.getColumnIndex("force");
            if (columnIndex13 != -1) {
                if (cursor.getInt(columnIndex13) != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                c84248X4q.LJIILIIL = z8;
            }
            int columnIndex14 = cursor.getColumnIndex("retryCount");
            if (columnIndex14 != -1) {
                c84248X4q.LJIIJJI = cursor.getInt(columnIndex14);
            }
            int columnIndex15 = cursor.getColumnIndex("extra");
            if (columnIndex15 != -1) {
                c84248X4q.LJI = cursor.getString(columnIndex15);
            }
            int columnIndex16 = cursor.getColumnIndex("mimeType");
            if (columnIndex16 != -1) {
                c84248X4q.LJIJJ = cursor.getString(columnIndex16);
            }
            int columnIndex17 = cursor.getColumnIndex("notificationEnable");
            if (columnIndex17 != -1) {
                if (cursor.getInt(columnIndex17) != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                c84248X4q.LJIJ = z7;
            }
            int columnIndex18 = cursor.getColumnIndex("notificationVisibility");
            if (columnIndex18 != -1) {
                c84248X4q.LJJLIIIJJI = cursor.getInt(columnIndex18);
            }
            int columnIndex19 = cursor.getColumnIndex("isFirstDownload");
            if (columnIndex19 != -1) {
                if (cursor.getInt(columnIndex19) == 1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                c84248X4q.LJJLIIIJJIZ = z6;
            }
            int columnIndex20 = cursor.getColumnIndex("isFirstSuccess");
            if (columnIndex20 != -1) {
                if (cursor.getInt(columnIndex20) == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                c84248X4q.LJJLIIIJL = z5;
            }
            int columnIndex21 = cursor.getColumnIndex("needHttpsToHttpRetry");
            if (columnIndex21 != -1) {
                if (cursor.getInt(columnIndex21) == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c84248X4q.LJIJJLI = z4;
            }
            int columnIndex22 = cursor.getColumnIndex("downloadTime");
            if (columnIndex22 != -1) {
                c84248X4q.LJJLIIIJLJLI = cursor.getLong(columnIndex22);
            }
            int columnIndex23 = cursor.getColumnIndex("packageName");
            if (columnIndex23 != -1) {
                c84248X4q.LJJIFFI = cursor.getString(columnIndex23);
            }
            int columnIndex24 = cursor.getColumnIndex("md5");
            if (columnIndex24 != -1) {
                c84248X4q.LJJII = cursor.getString(columnIndex24);
            }
            int columnIndex25 = cursor.getColumnIndex("retryDelay");
            if (columnIndex25 != -1) {
                if (cursor.getInt(columnIndex25) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c84248X4q.LJJIIJ = z3;
            }
            int columnIndex26 = cursor.getColumnIndex("curRetryTime");
            if (columnIndex26 != -1) {
                c84248X4q.LJJLIIIJLLLLLLLZ = cursor.getInt(columnIndex26);
            }
            int columnIndex27 = cursor.getColumnIndex("retryDelayStatus");
            if (columnIndex27 != -1) {
                int i = cursor.getInt(columnIndex27);
                EnumC84257X4z enumC84257X4z = EnumC84257X4z.DELAY_RETRY_WAITING;
                if (i == enumC84257X4z.ordinal()) {
                    c84248X4q.LJJLIIJ = enumC84257X4z;
                } else {
                    EnumC84257X4z enumC84257X4z2 = EnumC84257X4z.DELAY_RETRY_DOWNLOADING;
                    if (i == enumC84257X4z2.ordinal()) {
                        c84248X4q.LJJLIIJ = enumC84257X4z2;
                    } else {
                        EnumC84257X4z enumC84257X4z3 = EnumC84257X4z.DELAY_RETRY_DOWNLOADED;
                        if (i == enumC84257X4z3.ordinal()) {
                            c84248X4q.LJJLIIJ = enumC84257X4z3;
                        } else {
                            c84248X4q.LJJLIIJ = EnumC84257X4z.DELAY_RETRY_NONE;
                        }
                    }
                }
            }
            int columnIndex28 = cursor.getColumnIndex("defaultHttpServiceBackUp");
            if (columnIndex28 != -1) {
                if (cursor.getInt(columnIndex28) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c84248X4q.LJJI = z2;
            }
            int columnIndex29 = cursor.getColumnIndex("retryDelayTimeArray");
            if (columnIndex29 != -1) {
                c84248X4q.LJJIIJZLJL = cursor.getString(columnIndex29);
            }
            int columnIndex30 = cursor.getColumnIndex("backUpUrlsStr");
            if (columnIndex30 != -1) {
                c84248X4q.LJJLIL = cursor.getString(columnIndex30);
            }
            int columnIndex31 = cursor.getColumnIndex("backUpUrlRetryCount");
            if (columnIndex31 != -1) {
                c84248X4q.LJIIL = cursor.getInt(columnIndex31);
            }
            int columnIndex32 = cursor.getColumnIndex("realDownloadTime");
            if (columnIndex32 != -1) {
                c84248X4q.LJJLJ = cursor.getLong(columnIndex32);
            }
            int columnIndex33 = cursor.getColumnIndex("retryScheduleMinutes");
            if (columnIndex33 != -1) {
                c84248X4q.LJJLJLI = cursor.getInt(columnIndex33);
            }
            int columnIndex34 = cursor.getColumnIndex("independentProcess");
            if (columnIndex34 != -1) {
                if (cursor.getInt(columnIndex34) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                c84248X4q.LJJIIZI = z;
            }
            int columnIndex35 = cursor.getColumnIndex("auxiliaryJsonobjectString");
            if (columnIndex35 != -1) {
                c84248X4q.LJJLL = cursor.getString(columnIndex35);
            }
            int columnIndex36 = cursor.getColumnIndex("iconUrl");
            if (columnIndex36 != -1) {
                c84248X4q.LJJIJIL = cursor.getString(columnIndex36);
            }
            int columnIndex37 = cursor.getColumnIndex("appVersionCode");
            if (columnIndex37 != -1) {
                c84248X4q.LJJIJL = cursor.getInt(columnIndex37);
            }
            int columnIndex38 = cursor.getColumnIndex("taskId");
            if (columnIndex38 != -1) {
                c84248X4q.LJJZZI = cursor.getString(columnIndex38);
            }
            int columnIndex39 = cursor.getColumnIndex("downloadStartTimeStamp");
            if (columnIndex39 != -1) {
                c84248X4q.LJJZZIII = cursor.getLong(columnIndex39);
            }
            int columnIndex40 = cursor.getColumnIndex("downloadFinishTimeStamp");
            if (columnIndex40 != -1) {
                c84248X4q.LJL = cursor.getLong(columnIndex40);
            }
            int columnIndex41 = cursor.getColumnIndex("installedTimeStamp");
            if (columnIndex41 != -1) {
                c84248X4q.LJLI = cursor.getLong(columnIndex41);
            }
            int columnIndex42 = cursor.getColumnIndex("hasDoInstallation");
            if (columnIndex42 != -1) {
                if (cursor.getInt(columnIndex42) == 1) {
                    z10 = true;
                }
                c84248X4q.LJLIIIL = z10;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return c84248X4q.LIZ();
    }

    public static long LJIL(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        Matcher matcher = PatternProtector.compile("max-age=([0-9]+)").matcher(str);
        if (!matcher.find()) {
            return 0L;
        }
        try {
            return CastLongProtector.parseLong(matcher.group(1));
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static ContentValues LJJ(DownloadInfo downloadInfo) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(downloadInfo.getRawId()));
        contentValues.put("url", downloadInfo.getUrl());
        contentValues.put("savePath", downloadInfo.getSavePath());
        contentValues.put("tempPath", downloadInfo.getRawTempPath());
        contentValues.put("name", downloadInfo.getName());
        contentValues.put("chunkCount", Integer.valueOf(downloadInfo.getChunkCount()));
        contentValues.put("status", Integer.valueOf(downloadInfo.getStatus()));
        contentValues.put("curBytes", Long.valueOf(downloadInfo.getCurBytes()));
        contentValues.put("totalBytes", Long.valueOf(downloadInfo.getTotalBytes()));
        contentValues.put("eTag", downloadInfo.geteTag());
        contentValues.put("onlyWifi", Integer.valueOf(downloadInfo.isOnlyWifi() ? 1 : 0));
        contentValues.put("force", Integer.valueOf(downloadInfo.isForce() ? 1 : 0));
        contentValues.put("retryCount", Integer.valueOf(downloadInfo.getRetryCount()));
        contentValues.put("extra", downloadInfo.getExtra());
        contentValues.put("mimeType", downloadInfo.getMimeType());
        contentValues.put("title", downloadInfo.getRawTitle());
        contentValues.put("notificationEnable", Integer.valueOf(downloadInfo.isShowNotification() ? 1 : 0));
        contentValues.put("notificationVisibility", Integer.valueOf(downloadInfo.getNotificationVisibility()));
        contentValues.put("isFirstDownload", Integer.valueOf(downloadInfo.getIsFirstDownload() ? 1 : 0));
        contentValues.put("isFirstSuccess", Integer.valueOf(downloadInfo.isFirstSuccess() ? 1 : 0));
        contentValues.put("needHttpsToHttpRetry", Integer.valueOf(downloadInfo.isNeedHttpsToHttpRetry() ? 1 : 0));
        contentValues.put("downloadTime", Long.valueOf(downloadInfo.getDownloadTime()));
        contentValues.put("packageName", downloadInfo.getPackageName());
        contentValues.put("md5", downloadInfo.getMd5());
        contentValues.put("retryDelay", Integer.valueOf(downloadInfo.isNeedRetryDelay() ? 1 : 0));
        contentValues.put("curRetryTime", Integer.valueOf(downloadInfo.getCurRetryTime()));
        contentValues.put("retryDelayStatus", Integer.valueOf(downloadInfo.getRetryDelayStatus().ordinal()));
        contentValues.put("defaultHttpServiceBackUp", Integer.valueOf(downloadInfo.isNeedDefaultHttpServiceBackUp() ? 1 : 0));
        contentValues.put("chunkRunnableReuse", (Integer) 0);
        contentValues.put("retryDelayTimeArray", downloadInfo.getRetryDelayTimeArray());
        contentValues.put("chunkDowngradeRetry", (Integer) 0);
        contentValues.put("backUpUrlsStr", downloadInfo.getBackUpUrlsStr());
        contentValues.put("backUpUrlRetryCount", Integer.valueOf(downloadInfo.getBackUpUrlRetryCount()));
        contentValues.put("realDownloadTime", Long.valueOf(downloadInfo.getRawRealDownloadTime()));
        contentValues.put("retryScheduleMinutes", Long.valueOf(downloadInfo.getRetryScheduleMinutes()));
        contentValues.put("independentProcess", Integer.valueOf(downloadInfo.isNeedIndependentProcess() ? 1 : 0));
        contentValues.put("auxiliaryJsonobjectString", downloadInfo.getDBJsonDataString());
        contentValues.put("iconUrl", downloadInfo.getIconUrl());
        contentValues.put("appVersionCode", Integer.valueOf(downloadInfo.getAppVersionCode()));
        contentValues.put("taskId", downloadInfo.getTaskId());
        contentValues.put("downloadStartTimeStamp", Long.valueOf(downloadInfo.getDownloadStartTimeStamp()));
        contentValues.put("downloadFinishTimeStamp", Long.valueOf(downloadInfo.getDownloadFinishTimeStamp()));
        contentValues.put("installedTimeStamp", Long.valueOf(downloadInfo.getInstalledTimeStamp()));
        contentValues.put("hasDoInstallation", Integer.valueOf(downloadInfo.isHasDoInstallation() ? 1 : 0));
        return contentValues;
    }

    public static void LIZIZ(DownloadInfo downloadInfo, List list) {
        if (downloadInfo.isAddTTNetCommonParam()) {
            ((ArrayList) list).add(new HttpHeader("extra_ttnet_common_param", "true"));
        }
        if (X4H.LJFF.LJIIIIZZ("enable_download_network_tag", 0) > 0) {
            ArrayList arrayList = (ArrayList) list;
            arrayList.add(new HttpHeader("x-ttnet-req-biz-id", "dl"));
            arrayList.add(new HttpHeader("x-ttnet-req-biz-ver", "1.3.8.36"));
        }
    }

    public static void LIZJ(DownloadInfo downloadInfo, List list) {
        if (X4H.LJFF(downloadInfo.getId(), null).LJIIIIZZ("use_default_throttle_speed", 1) != 1) {
            long throttleNetSpeed = downloadInfo.getThrottleNetSpeed();
            if (throttleNetSpeed > 0) {
                ((ArrayList) list).add(new HttpHeader("extra_throttle_net_speed", String.valueOf(throttleNetSpeed)));
            }
        }
    }

    public static boolean LJFF(C84238X4g c84238X4g, C84238X4g c84238X4g2) {
        File LIZJ2;
        try {
            boolean z = false;
            if (c84238X4g.LJIIJ() && !c84238X4g.isDirectory() && !c84238X4g.LJIIIIZZ().equals(c84238X4g2.LJIIIIZZ())) {
                if (c84238X4g2.LIZ.LIZ() == 1) {
                    z = true;
                }
                if (!z || (LIZJ2 = c84238X4g2.LIZJ()) == null || LIZJ2.mkdirs() || LIZJ2.isDirectory()) {
                    if (C65210PiY.LIZ()) {
                        String str = LIZ;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("SrcFile:");
                        LIZ2.append(c84238X4g.getPath());
                        LIZ2.append(" DestFile:");
                        LIZ2.append(c84238X4g2.getPath());
                        C65210PiY.LIZIZ(str, "copyFile", X1D.LIZIZ(LIZ2));
                    }
                    if (!c84238X4g2.LJIIJ() || c84238X4g2.LJIIJJI()) {
                        LJIIIIZZ(c84238X4g, c84238X4g2);
                        return true;
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Destination '");
                    LIZ3.append(c84238X4g2.LJIIIIZZ());
                    LIZ3.append("' exists but is read-only");
                    throw new IOException(X1D.LIZIZ(LIZ3));
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("Destination '");
                LIZ4.append(LIZJ2);
                LIZ4.append("' directory cannot be created");
                throw new BaseException(1053, X1D.LIZIZ(LIZ4));
            }
            return false;
        } catch (BaseException e) {
            throw e;
        } catch (Throwable th) {
            LJIJJLI("CopyFile", th);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [android.database.Cursor[]] */
    /* JADX WARN: Type inference failed for: r0v29, types: [android.database.Cursor[]] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r0v43, types: [android.database.Cursor[]] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.FileInputStream, java.io.InputStream] */
    public static void LJIIIIZZ(C84238X4g c84238X4g, C84238X4g c84238X4g2) {
        OutputStream outputStream;
        OutputStream outputStream2;
        if (!c84238X4g2.LJIIJ() || !c84238X4g2.isDirectory()) {
            if (Build.VERSION.SDK_INT >= 29 && C84236X4e.LJFF(c84238X4g2.getPath())) {
                String path = c84238X4g2.getPath();
                android.net.Uri contentUri = MediaStore.Files.getContentUri("external");
                OutputStream outputStream3 = null;
                try {
                    ?? LIZIZ2 = C84236X4e.LIZIZ(((IDownloadComponentManagerService) X41.LIZ(IDownloadComponentManagerService.class)).getAppContext().getContentResolver(), MediaStore.setIncludePending(contentUri), new String[]{"_id"}, "_data=? ", new String[]{path});
                    if (LIZIZ2 != 0) {
                        try {
                            if (LIZIZ2.moveToFirst()) {
                                android.net.Uri withAppendedId = ContentUris.withAppendedId(contentUri, LIZIZ2.getInt(LIZIZ2.getColumnIndex("_id")));
                                X4Q.LJJIII(new Cursor[]{LIZIZ2});
                                if (withAppendedId != null) {
                                    Context LJ2 = C84212X3g.LJ();
                                    String path2 = c84238X4g.getPath();
                                    ContentResolver contentResolver = LJ2.getContentResolver();
                                    try {
                                        ?? fileInputStream = new FileInputStream(new File(path2));
                                        try {
                                            try {
                                                outputStream3 = contentResolver.openOutputStream(withAppendedId);
                                                if (outputStream3 != null) {
                                                    try {
                                                        byte[] bArr = new byte[4096];
                                                        while (true) {
                                                            int read = fileInputStream.read(bArr);
                                                            if (read == -1) {
                                                                break;
                                                            } else {
                                                                outputStream3.write(bArr, 0, read);
                                                            }
                                                        }
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        outputStream = outputStream3;
                                                        outputStream3 = fileInputStream;
                                                        X4Q.LJJIIJ(outputStream3);
                                                        X4Q.LJJIIJ(outputStream);
                                                        throw th;
                                                    }
                                                }
                                                X4Q.LJJIIJ(new Closeable[]{fileInputStream});
                                                X4Q.LJJIIJ(outputStream3);
                                                return;
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        } catch (IOException unused) {
                                            outputStream2 = outputStream3;
                                            outputStream3 = fileInputStream;
                                            X4Q.LJJIIJ(outputStream3);
                                            X4Q.LJJIIJ(outputStream2);
                                            return;
                                        }
                                    } catch (IOException unused2) {
                                        outputStream2 = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        outputStream = null;
                                    }
                                }
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("Destination ");
                                LIZ2.append(c84238X4g2);
                                LIZ2.append("exists but contentUri is null");
                                throw new IOException(X1D.LIZIZ(LIZ2));
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            outputStream3 = LIZIZ2;
                            X4Q.LJJIII(new Cursor[]{outputStream3});
                            throw th;
                        }
                    }
                    X4Q.LJJIII(new Cursor[]{LIZIZ2});
                    StringBuilder LIZ22 = X1D.LIZ();
                    LIZ22.append("Destination ");
                    LIZ22.append(c84238X4g2);
                    LIZ22.append("exists but contentUri is null");
                    throw new IOException(X1D.LIZIZ(LIZ22));
                } catch (Throwable th5) {
                    th = th5;
                }
            } else {
                FileInputStream LJFF2 = c84238X4g.LJFF();
                try {
                    FileChannel channel = LJFF2.getChannel();
                    try {
                        FileOutputStream LJI2 = c84238X4g2.LJI();
                        try {
                            FileChannel channel2 = LJI2.getChannel();
                            try {
                                long size = channel.size();
                                long j = 0;
                                while (j < size) {
                                    long j2 = size - j;
                                    if (j2 > 31457280) {
                                        j2 = 31457280;
                                    }
                                    long transferFrom = channel2.transferFrom(channel, j, j2);
                                    if (transferFrom == 0) {
                                        break;
                                    } else {
                                        j += transferFrom;
                                    }
                                }
                                if (channel2 != null) {
                                    channel2.close();
                                }
                                LJI2.close();
                                channel.close();
                                LJFF2.close();
                                long length = c84238X4g.length();
                                long length2 = c84238X4g2.length();
                                if (length == length2) {
                                    c84238X4g2.LJIIIZ(c84238X4g.LJ());
                                    return;
                                }
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("Failed to copy full contents from '");
                                LIZ3.append(c84238X4g);
                                LIZ3.append("' to '");
                                LIZ3.append(c84238X4g2);
                                LIZ3.append("' Expected length: ");
                                LIZ3.append(length);
                                throw new IOException(C132805Jc.LIZLLL(LIZ3, " Actual: ", length2, LIZ3));
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th6) {
                    try {
                        throw th6;
                    } catch (Throwable th7) {
                        if (LJFF2 != null) {
                            try {
                                LJFF2.close();
                            } catch (Throwable th8) {
                                th6.addSuppressed(th8);
                            }
                        }
                        throw th7;
                    }
                }
            }
        } else {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("Destination '");
            LIZ4.append(c84238X4g2);
            LIZ4.append("' exists but is a directory");
            throw new IOException(X1D.LIZIZ(LIZ4));
        }
    }

    public static String LJIIIZ(X5J x5j, String str) {
        String LIZIZ2 = x5j.LIZIZ("Content-Disposition");
        String str2 = null;
        if (LIZIZ2 != null) {
            try {
                if (LIZLLL == null) {
                    LIZLLL = PatternProtector.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");
                }
                Matcher matcher = LIZLLL.matcher(LIZIZ2);
                if (matcher.find()) {
                    str2 = matcher.group(1);
                } else {
                    if (LJ == null) {
                        LJ = PatternProtector.compile("attachment;\\s*filename\\s*=\\s*(.*)");
                    }
                    Matcher matcher2 = LJ.matcher(LIZIZ2);
                    if (matcher2.find()) {
                        str2 = matcher2.group(1);
                    }
                }
            } catch (Exception unused) {
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return X4Q.LJJIFFI(str);
        }
        return str2;
    }

    public static void LJIIJJI(X5F x5f, BaseException baseException) {
        if (x5f == null || !(x5f instanceof X3T) || !(baseException instanceof DownloadTTNetException)) {
            return;
        }
        String LIZLLL2 = ((X3T) x5f).LIZLLL();
        if (!TextUtils.isEmpty(LIZLLL2)) {
            ((DownloadTTNetException) baseException).setRemoteIp(LIZLLL2);
        }
        ((DownloadTTNetException) baseException).parseRemoteIp();
    }

    public static boolean LJIILIIL(List<HttpHeader> list, List<HttpHeader> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list.size() != ((ArrayList) list2).size()) {
            return false;
        }
        return new HashSet(list).equals(new HashSet(list2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0078, code lost:
    
        if (X.C65210PiY.LIZ() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007a, code lost:
    
        r2 = X.X4P.LIZ;
        r1 = X.X1D.LIZ();
        r1.append("Copy DownloadFile Src:");
        r1.append(r6.getPath());
        r1.append(" Dest:");
        r1.append(r7.getPath());
        X.C65210PiY.LIZIZ(r2, "moveFile", X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009d, code lost:
    
        r6.LJIIL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (X.C84236X4e.LJFF(r7.LJIIIIZZ()) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        if (r5 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        r5 = LJFF(r6, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIZILJ(X.C84238X4g r6, X.C84238X4g r7) {
        /*
            boolean r0 = X.C65210PiY.LIZ()
            java.lang.String r4 = " Dest:"
            java.lang.String r3 = "moveFile"
            if (r0 == 0) goto L2d
            java.lang.String r2 = X.X4P.LIZ
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "DownloadFile Src:"
            r1.append(r0)
            java.lang.String r0 = r6.getPath()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r7.getPath()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C65210PiY.LIZIZ(r2, r3, r0)
        L2d:
            java.lang.Class<com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService> r0 = com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService.class
            java.lang.Object r0 = X.X41.LIZ(r0)
            com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService r0 = (com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService) r0
            android.content.Context r0 = r0.getAppContext()
            if (r0 != 0) goto L47
        L3c:
            boolean r5 = r6.LJII(r7)
            if (r5 != 0) goto La0
        L42:
            boolean r5 = LJFF(r6, r7)
            goto L74
        L47:
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r2 = r0.targetSdkVersion
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 >= r0) goto L54
            goto L3c
        L54:
            if (r2 != r0) goto L71
            boolean r0 = android.os.Environment.isExternalStorageLegacy()
            if (r0 != 0) goto L3c
        L5c:
            java.lang.String r0 = r6.LJIIIIZZ()
            boolean r0 = X.C84236X4e.LJFF(r0)
            if (r0 != 0) goto L3c
            java.lang.String r0 = r7.LJIIIIZZ()
            boolean r0 = X.C84236X4e.LJFF(r0)
            if (r0 == 0) goto L3c
            goto L42
        L71:
            if (r2 <= r0) goto L3c
            goto L5c
        L74:
            boolean r0 = X.C65210PiY.LIZ()     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L9d
            java.lang.String r2 = X.X4P.LIZ     // Catch: java.lang.Throwable -> La0
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = "Copy DownloadFile Src:"
            r1.append(r0)     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = r6.getPath()     // Catch: java.lang.Throwable -> La0
            r1.append(r0)     // Catch: java.lang.Throwable -> La0
            r1.append(r4)     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = r7.getPath()     // Catch: java.lang.Throwable -> La0
            r1.append(r0)     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> La0
            X.C65210PiY.LIZIZ(r2, r3, r0)     // Catch: java.lang.Throwable -> La0
        L9d:
            r6.LJIIL()     // Catch: java.lang.Throwable -> La0
        La0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X4P.LJIIZILJ(X.X4g, X.X4g):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0107, code lost:
    
        if (r1.contains("Exception in connect") != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJJLI(java.lang.String r8, java.lang.Throwable r9) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X4P.LJIJJLI(java.lang.String, java.lang.Throwable):void");
    }

    public static void LJI(DownloadInfo downloadInfo, String str, String str2) {
        if (downloadInfo == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || str2.equals(downloadInfo.getName())) {
            return;
        }
        C84238X4g c84238X4g = new C84238X4g(downloadInfo.getSavePath(), str2, true, true);
        C84238X4g c84238X4g2 = new C84238X4g(downloadInfo.getSavePath(), downloadInfo.getName(), true, true);
        if (C65210PiY.LIZ()) {
            String str3 = LIZ;
            int id = downloadInfo.getId();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ExistFile:");
            LIZ2.append(c84238X4g.getPath());
            LIZ2.append(" targetFile:");
            LIZ2.append(c84238X4g2.getPath());
            C65210PiY.LIZLLL(id, str3, "copyFileFromExistFileWithSameName", X1D.LIZIZ(LIZ2));
        }
        if (!c84238X4g2.LJIIJ() || c84238X4g2.LJIIJJI()) {
            if (!(!LJFF(c84238X4g, c84238X4g2))) {
                return;
            } else {
                throw new BaseException(1001, C16880lQ.LLLZ("Can't copy the exist file(%s/%s) to the target file(%s/%s)", new Object[]{downloadInfo.getSavePath(), str2, downloadInfo.getSavePath(), downloadInfo.getName()}));
            }
        }
        throw new BaseException(1001, "targetPath file exists but read-only");
    }

    public static void LJIIJ(int i, BaseException baseException, boolean z) {
        synchronized (LIZIZ) {
            List<X5K> list = LIZJ.get(i);
            if (list != null) {
                for (X5K x5k : list) {
                    if (x5k != null) {
                        if (z) {
                            x5k.onSuccess();
                        } else {
                            x5k.LIZ(baseException);
                        }
                    }
                }
            }
            if (C65210PiY.LIZ()) {
                C65210PiY.LIZLLL(i, LIZ, "handleTempSaveCallback", "Run");
            }
            LIZIZ.remove(i);
        }
    }

    public static List LIZ(long j, long j2, String str, List list) {
        String LLLZI;
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (Object obj : list) {
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(new HttpHeader("If-Match", str));
        }
        arrayList.add(new HttpHeader("Accept-Encoding", "identity"));
        if (j2 <= 0) {
            LLLZI = C16880lQ.LLLZI(Locale.US, "bytes=%d-", new Object[]{Long.valueOf(j)});
        } else {
            LLLZI = C16880lQ.LLLZI(Locale.US, "bytes=%d-%d", new Object[]{Long.valueOf(j), Long.valueOf(j2)});
        }
        arrayList.add(new HttpHeader("Range", LLLZI));
        if (C65210PiY.LIZ()) {
            String str2 = LIZ;
            StringBuilder LIZJ2 = V10.LIZJ("CurrentOffset:", j, " EndOffset:");
            C65232Piu.LIZLLL(LIZJ2, j2, ", range = ", LLLZI);
            C65210PiY.LIZIZ(str2, "addRangeHeader", X1D.LIZIZ(LIZJ2));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0076, code lost:
    
        if (r7 == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C65205PiT LJII(int r10, com.ss.android.socialbase.downloader.model.DownloadInfo r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X4P.LJII(int, com.ss.android.socialbase.downloader.model.DownloadInfo, java.lang.String, java.lang.String):X.PiT");
    }
}
