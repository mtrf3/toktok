package X;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Handler;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxSettingsManager;
import com.lynx.tasm.base.LLog;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.FnT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40035FnT {
    public static RunnableC40038FnW LIZJ;
    public static Application LIZLLL;
    public static SharedPreferences LJ;
    public static final C40035FnT LJIIJ = new C40035FnT();
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final Handler LIZIZ = new Handler(C16880lQ.LLJJJJ());
    public static String LJFF = "";
    public static String LJI = "";
    public static String LJII = "";
    public static String LJIIIIZZ = "";
    public static String LJIIIZ = "";

    public static void LIZ() {
        boolean z;
        String sb;
        if (LJFF.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder(LJFF);
            sb2.append("?caller_name=lynx&os_type=android&aid=");
            sb2.append(LJI);
            sb2.append("&sdk_version=2.10.16-rc.10&app_version=");
            o.LJFF(LynxEnv.LJIIIZ(), "LynxEnv.inst()");
            sb2.append(LJII);
            sb2.append("&device_id=");
            sb2.append(LJIIIIZZ);
            sb2.append("&channel=");
            sb2.append(LJIIIZ);
            sb2.append("&settings_time=");
            LynxSettingsManager inst = LynxSettingsManager.inst();
            o.LJFF(inst, "LynxSettingsManager.inst()");
            sb2.append(String.valueOf(inst.getSettingsTime()));
            sb = sb2.toString();
        }
        if (sb != null) {
            try {
                if (sb.length() > 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    Charset forName = Charset.forName("UTF-8");
                    o.LJFF(forName, "Charset.forName(charsetName)");
                    byte[] bytes = sb.getBytes(forName);
                    o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
                    messageDigest.update(bytes);
                    String LIZ2 = C38357F3p.LIZ(messageDigest.digest());
                    if (LIZ2 != null) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        Application application = LIZLLL;
                        if (application != null) {
                            File filesDir = application.getFilesDir();
                            o.LJFF(filesDir, "mContext.filesDir");
                            LIZ3.append(filesDir.getAbsolutePath());
                            String LJFF2 = JBR.LJFF(LIZ3, File.separator, "lynx_settings_downloader", LIZ3);
                            C40036FnU c40036FnU = new C40036FnU(new File(LJFF2, LIZ2));
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("Start fetch with url: ");
                            LIZ4.append(sb);
                            LLog.LIZLLL(2, "LynxSettingsDownloader", X1D.LIZIZ(LIZ4));
                            Application application2 = LIZLLL;
                            if (application2 != null) {
                                DownloadTask with = C84261X5d.with(application2);
                                with.url(sb);
                                with.name(LIZ2);
                                with.savePath(LJFF2);
                                with.addListenerToSameTask(true);
                                with.deleteCacheIfCheckFailed(true);
                                with.retryCount(2);
                                with.autoSetHashCodeForSameTask(true);
                                with.ttnetProtectTimeout(20000L);
                                with.subThreadListener(c40036FnU);
                                with.download();
                                return;
                            }
                            o.LJIJI("mContext");
                            throw null;
                        }
                        o.LJIJI("mContext");
                        throw null;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void LIZIZ(File file, boolean z) {
        if (!z) {
            LLog.LIZLLL(4, "LynxSettingsDownloader", "Download failed");
            if (file.isFile()) {
                C16880lQ.LLZ(file);
                return;
            }
            return;
        }
        if (!file.isFile() || !file.exists()) {
            LLog.LIZLLL(4, "LynxSettingsDownloader", "Download succeeded but file not exists");
            return;
        }
        try {
            Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), PVC.LIZ);
            if (!(inputStreamReader instanceof BufferedReader)) {
                inputStreamReader = new BufferedReader(inputStreamReader, FileUtils.BUFFER_SIZE);
            }
            try {
                String LJIILJJIL = C77321UWf.LJIILJJIL(inputStreamReader);
                AnonymousClass636.LJFF(inputStreamReader, null);
                if (LJIILJJIL != null) {
                    RunnableC40038FnW runnableC40038FnW = LIZJ;
                    if (runnableC40038FnW != null) {
                        LIZIZ.removeCallbacks(runnableC40038FnW);
                    }
                    RunnableC40038FnW runnableC40038FnW2 = RunnableC40038FnW.LJLIL;
                    LIZJ = runnableC40038FnW2;
                    LIZIZ.postDelayed(runnableC40038FnW2, 86400000L);
                    LLog.LIZLLL(2, "LynxSettingsDownloader", "Will update settings: ".concat(LJIILJJIL));
                    LynxSettingsManager.inst().setSettingsWithContent(LJIILJJIL);
                    SharedPreferences sharedPreferences = LJ;
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putLong("lynx_settings_last_sync_time", System.currentTimeMillis()).apply();
                    } else {
                        o.LJIJI("mSharedPreferences");
                        throw null;
                    }
                }
            } finally {
            }
        } catch (IOException e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Read download data failed: ");
            LIZ2.append(e);
            LLog.LIZLLL(4, "LynxSettingsDownloader", X1D.LIZIZ(LIZ2));
        }
    }
}
