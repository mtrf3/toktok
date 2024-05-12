package com.bytedance.pitaya.cep_package.util;

import X.C16880lQ;
import X.C38323F2h;
import X.C39745Fin;
import X.C48153Iv7;
import X.C62848OlY;
import X.C64797Pbt;
import X.C65019PfT;
import X.C65083PgV;
import X.C76800UCe;
import X.FQ9;
import X.FQA;
import X.FQB;
import X.PVC;
import X.PVJ;
import X.PVP;
import X.X1D;
import Y.ARunnableS13S0000000_6;
import Y.ARunnableS8S0000100_6;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.pitaya.cep_engine.error.CepErrorCode;
import com.bytedance.pitaya.cep_engine.inner.JniCaller;
import com.bytedance.pitaya.cep_package.network.CommonPostService;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AndroidUtility implements Utility {
    public static Handler runByOrderHandler;
    public static Thread runByOrderThread;
    public static final AndroidUtility INSTANCE = new AndroidUtility();
    public static Object globalLock = new Object();
    public static int poolSize = 2;
    public static final ExecutorService worker = C16880lQ.LLLLZ(2);
    public static final FQB httpClient = new FQB();
    public static final C38323F2h fileDownloader = new C38323F2h();

    /* renamed from: runByOrder$lambda-3$lambda-1 */
    public static final void m89runByOrder$lambda3$lambda1() {
        synchronized (globalLock) {
            Looper.prepare();
            Looper myLooper = Looper.myLooper();
            o.LJI(myLooper);
            runByOrderHandler = new Handler(myLooper);
            globalLock.notifyAll();
        }
        if (runByOrderHandler != null) {
            Looper.loop();
        }
    }

    /* renamed from: async$lambda-5 */
    public static final void m84async$lambda5(long j) {
        try {
            JniCaller.LIZ.callNoParamsCallback(j);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: async$lambda-7 */
    public static final void m85async$lambda7(long j) {
        try {
            JniCaller.LIZ.callNoParamsCallback(j);
        } catch (Throwable unused) {
        }
    }

    public final void runByOrder(Runnable block) {
        o.LJIIIZ(block, "block");
        if (runByOrderHandler == null) {
            synchronized (this) {
                if (runByOrderHandler == null) {
                    PthreadThread pthreadThread = new PthreadThread(null, new ARunnableS13S0000000_6(0), "cep-utility_thread", 0L);
                    runByOrderThread = pthreadThread;
                    pthreadThread.start();
                    synchronized (globalLock) {
                        while (runByOrderHandler == null) {
                            globalLock.wait();
                        }
                    }
                }
            }
        }
        Handler handler = runByOrderHandler;
        if (handler == null) {
            return;
        }
        handler.post(block);
    }

    @Override // com.bytedance.pitaya.cep_package.util.Utility
    public void async(int i, long j) {
        if (i != 0 && i != 1) {
            worker.execute(new ARunnableS8S0000100_6(j, 1));
        } else {
            runByOrder(new ARunnableS8S0000100_6(j, 0));
        }
    }

    @Override // com.bytedance.pitaya.cep_package.util.Utility
    public void download(String url, String distDir, long j) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(distDir, "distDir");
        File file = new File(distDir);
        String parent = file.getParent();
        if (parent != null) {
            C38323F2h c38323F2h = fileDownloader;
            String name = file.getName();
            o.LJIIIIZZ(name, "file.name");
            FQA fqa = new FQA(j);
            c38323F2h.getClass();
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(parent);
                LIZ.append('/');
                LIZ.append(name);
                C38323F2h.LIZ(url, X1D.LIZIZ(LIZ));
                fqa.LIZIZ();
            } catch (Throwable th) {
                th.getLocalizedMessage();
                fqa.LIZ();
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        try {
            JniCaller.LIZ.callDataCallback(j, false, CepErrorCode.DOWNLOAD_FAILED.getCode(), null);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.FilterOutputStream, java.io.BufferedOutputStream] */
    @Override // com.bytedance.pitaya.cep_package.util.Utility
    public void unzip(String src, String dst, long j) {
        String canonicalDirPath;
        ?? zipInputStream;
        o.LJIIIZ(src, "src");
        o.LJIIIZ(dst, "dst");
        File file = new File(dst);
        ZipInputStream zipInputStream2 = null;
        ?? r2 = 0;
        zipInputStream2 = null;
        zipInputStream2 = null;
        try {
            try {
                try {
                    canonicalDirPath = file.getCanonicalPath();
                    zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(src)));
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            th = th;
            if (zipInputStream2 == null) {
                throw th;
            }
        }
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            while (nextEntry != null) {
                r2 = new File(file, nextEntry.getName());
                String canonicalDestPath = r2.getCanonicalPath();
                o.LJIIIIZZ(canonicalDestPath, "canonicalDestPath");
                o.LJIIIIZZ(canonicalDirPath, "canonicalDirPath");
                if (ujb.o.LJJJLIIL(canonicalDestPath, canonicalDirPath, false)) {
                    if (nextEntry.isDirectory()) {
                        r2.mkdirs();
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        File parentFile = r2.getParentFile();
                        if (parentFile != null && !parentFile.exists()) {
                            parentFile.mkdirs();
                        } else if (r2.exists()) {
                            C16880lQ.LLLZZIL(r2);
                        }
                        ?? bufferedOutputStream = new BufferedOutputStream(new FileOutputStream((File) r2));
                        r2 = new byte[FileUtils.BUFFER_SIZE];
                        while (true) {
                            int read = zipInputStream.read(r2);
                            if (read == -1) {
                                break;
                            } else {
                                bufferedOutputStream.write(r2, 0, read);
                            }
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    }
                } else {
                    throw new IOException(o.LJIILLIIL(nextEntry.getName(), "Entry is outside of the target dir: "));
                }
            }
            JniCaller.LIZ.callDataCallback(j, true, CepErrorCode.SUCCESS.getCode(), null);
            zipInputStream.close();
            zipInputStream2 = r2;
        } catch (IOException unused2) {
            JniCaller.LIZ.callDataCallback(j, false, CepErrorCode.UNZIP_FAILED.getCode(), null);
            if (zipInputStream2 != null) {
                zipInputStream2.close();
                zipInputStream2 = zipInputStream2;
            }
        } finally {
            th = th;
            try {
                zipInputStream2.close();
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
                throw th;
            }
        }
    }

    @Override // com.bytedance.pitaya.cep_package.util.Utility
    public void request(int i, String url, String str, long j) {
        byte[] bytes;
        o.LJIIIZ(url, "url");
        FQ9 fq9 = new FQ9(j);
        FQB fqb = httpClient;
        PVJ pvj = null;
        if (str == null) {
            bytes = null;
        } else {
            bytes = str.getBytes(PVC.LIZ);
            o.LJIIIIZZ(bytes, "(this as java.lang.String).getBytes(charset)");
        }
        fqb.getClass();
        C65019PfT LJIIL = C65083PgV.LJIIL(url);
        if (LJIIL == null) {
            fq9.LIZ(-1, "url is empty");
            return;
        }
        C48153Iv7 c48153Iv7 = new C48153Iv7();
        c48153Iv7.LIZJ = LivePlayEnforceIntervalSetting.DEFAULT;
        c48153Iv7.LIZLLL = LivePlayEnforceIntervalSetting.DEFAULT;
        c48153Iv7.LJ = LivePlayEnforceIntervalSetting.DEFAULT;
        c48153Iv7.LJIIIZ = true;
        CommonPostService commonPostService = (CommonPostService) LJIIL.LIZ(CommonPostService.class);
        if (bytes != null) {
            pvj = PVP.LIZLLL(C39745Fin.LIZJ("application/json; charset=utf-8"), bytes);
        }
        try {
            C64797Pbt<TypedInput> execute = commonPostService.request(url, pvj, c48153Iv7).execute();
            int i2 = execute.LIZ.LIZIZ;
            if (!execute.LIZIZ()) {
                InputStream in = execute.LIZJ.in();
                o.LJIIIIZZ(in, "rawResponse.errorBody().`in`()");
                fq9.LIZ(i2, new String(C62848OlY.LJFF(in), PVC.LIZ));
            } else {
                InputStream in2 = execute.LIZIZ.in();
                o.LJIIIIZZ(in2, "rawResponse.body().`in`()");
                fq9.LIZIZ(C62848OlY.LJFF(in2));
            }
        } catch (Exception e) {
            fq9.LIZ(-1, e.toString());
        }
    }
}
