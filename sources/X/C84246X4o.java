package X;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import java.io.File;

/* renamed from: X.X4o, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84246X4o {
    public static String LIZ(File file) {
        Context appContext = ((IDownloadComponentManagerService) X41.LIZ(IDownloadComponentManagerService.class)).getAppContext();
        if (LIZJ(file)) {
            return file.getAbsolutePath();
        }
        if (appContext == null) {
            C65210PiY.LIZJ("DownloadDirUtils", "getValidDownloadPath", "Context is null");
            return null;
        }
        File LLIIJI = C16880lQ.LLIIJI(appContext, Environment.DIRECTORY_DOWNLOADS);
        if (LIZJ(LLIIJI)) {
            return LLIIJI.getAbsolutePath();
        }
        Context appContext2 = ((IDownloadComponentManagerService) X41.LIZ(IDownloadComponentManagerService.class)).getAppContext();
        if (appContext2 == null) {
            return null;
        }
        return C16880lQ.LLIIJLIL(appContext2).getAbsolutePath();
    }

    public static boolean LIZIZ(String str) {
        Context appContext;
        if (X4H.LJFF.LJIIIIZZ("save_path_security", 1) <= 0 || (appContext = ((IDownloadComponentManagerService) X41.LIZ(IDownloadComponentManagerService.class)).getAppContext()) == null || TextUtils.isEmpty(str) || str.startsWith(Environment.getDataDirectory().getAbsolutePath())) {
            return true;
        }
        try {
            File LLIIIZ = C16880lQ.LLIIIZ(appContext);
            if (LLIIIZ != null) {
                if (str.startsWith(LLIIIZ.getParent())) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public static boolean LIZJ(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (!file.exists() && !file.mkdirs()) {
                return false;
            }
            if (!file.isDirectory()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
