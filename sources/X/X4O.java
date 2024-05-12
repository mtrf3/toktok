package X;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadFileExistException;
import com.ss.android.socialbase.downloader.exception.DownloadHttpException;
import com.ss.android.socialbase.downloader.exception.DownloadOnlyWifiException;
import com.ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException;
import com.ss.android.socialbase.downloader.exception.DownloadPauseReserveWifiException;
import com.ss.android.socialbase.downloader.exception.DownloadRetryNeedlessException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLHandshakeException;

/* loaded from: classes16.dex */
public final class X4O implements Runnable, X5P {
    public static final String LLIIIJ = C16880lQ.LJLLJ(X4O.class);
    public Future LJLIL;
    public final DownloadTask LJLILLLLZI;
    public volatile boolean LJLJI;
    public AtomicInteger LJLJJI;
    public volatile X4V LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public final AtomicBoolean LJLJLLL;
    public final InterfaceC84211X3f LJLLI;
    public final DownloadInfo LJLLILLLL;
    public final X44 LJLLJ;
    public volatile BaseException LJLLL;
    public X5F LJLLLL;
    public X5J LJLLLLLL;
    public final X1C LJLZ;
    public final X21 LJZ;
    public boolean LJZL;
    public boolean LL;
    public String LLD;
    public String LLF;
    public boolean LLFF;
    public long LLFFF;
    public long LLFII;
    public final X4H LLFZ;
    public final X4Y LLI;
    public final X53 LLIFFJFJJ;
    public int LLIIII;
    public volatile X4U LLIIIILZ;
    public volatile EnumC84254X4w LJLL = EnumC84254X4w.RUN_STATUS_NONE;
    public volatile int LJZI = 5;
    public boolean LLII = true;

    public final boolean LIZIZ() {
        if (this.LJLLILLLL.isChunked()) {
            DownloadInfo downloadInfo = this.LJLLILLLL;
            downloadInfo.setTotalBytes(downloadInfo.getCurBytes());
        }
        if (C65210PiY.LIZ()) {
            String str = LLIIIJ;
            int id = this.LJLLILLLL.getId();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("GetCurBytes: ");
            LIZ.append(this.LJLLILLLL.getCurBytes());
            LIZ.append(" getTotalBytes: ");
            LIZ.append(this.LJLLILLLL.getTotalBytes());
            C65210PiY.LIZLLL(id, str, "checkCompletedByteValid", X1D.LIZIZ(LIZ));
        }
        if (this.LJLLILLLL.getCurBytes() > 0 && (this.LJLLILLLL.isIgnoreDataVerify() || (this.LJLLILLLL.getTotalBytes() > 0 && this.LJLLILLLL.getCurBytes() == this.LJLLILLLL.getTotalBytes()))) {
            return true;
        }
        this.LJLLILLLL.setByteInvalidRetryStatus(VLG.BYTE_INVALID_RETRY_STATUS_RESTART);
        this.LJLLILLLL.reset();
        this.LJLLI.updateDownloadInfo(this.LJLLILLLL);
        this.LJLLI.LJLJI(this.LJLLILLLL.getId());
        X4Q.LJ(this.LJLLILLLL, true);
        return false;
    }

    public final void LIZLLL() {
        boolean z;
        X3D LJIIL;
        int id = this.LJLLILLLL.getId();
        int generate = ((IDownloadIdGeneratorService) X41.LIZ(IDownloadIdGeneratorService.class)).generate(this.LJLLILLLL);
        if (this.LLFZ.LJIIIIZZ("opt_file_exist_check", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!TextUtils.isEmpty(this.LJLLILLLL.getMd5()) && this.LJLLILLLL.isDownloaded() && !this.LJLLILLLL.isExpiredRedownload() && !this.LLFF) {
                throw new BaseException(1009, "file has downloaded");
            }
        } else if (this.LJLLILLLL.isDownloaded() && !this.LJLLILLLL.isExpiredRedownload() && !this.LLFF) {
            throw new BaseException(1009, "file has downloaded");
        }
        DownloadInfo downloadInfo = this.LJLLI.getDownloadInfo(generate);
        if (downloadInfo != null && (LJIIL = C84212X3g.LJIIL()) != null && downloadInfo.getId() != id && downloadInfo.equalsTask(this.LJLLILLLL)) {
            if (!LJIIL.LJIILJJIL(downloadInfo.getId())) {
                X4Q.LJ(this.LJLLILLLL, true);
                this.LJLLI.LJIIL(generate);
                if (!downloadInfo.isFileDataValid()) {
                    return;
                }
                this.LJLLILLLL.copyFromCacheData(downloadInfo, false);
                this.LJLLI.updateDownloadInfo(this.LJLLILLLL);
                throw new X5C("retry task because id generator changed");
            }
            this.LJLLI.LJIIL(id);
            throw new BaseException(1025, "another same task is downloading");
        }
    }

    public final void LJI() {
        if (!TextUtils.isEmpty(this.LJLLILLLL.getSavePath())) {
            if (!TextUtils.isEmpty(this.LJLLILLLL.getName())) {
                int i = 1;
                C84238X4g c84238X4g = new C84238X4g(this.LJLLILLLL.getSavePath(), this.LJLLILLLL.getName(), true, true);
                int i2 = 0;
                if (c84238X4g.LIZ.LIZ() == -1) {
                    LJIIJJI();
                    this.LJLLI.LJIIL(this.LJLLILLLL.getId());
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("download savePath error:");
                    LIZ.append(this.LJLLILLLL.getSavePath());
                    LIZ.append(" extra:");
                    LIZ.append(c84238X4g.LIZIZ());
                    throw new BaseException(1081, X1D.LIZIZ(LIZ));
                }
                int LIZ2 = c84238X4g.LIZ.LIZ();
                if (LIZ2 == 2 || LIZ2 == 3 || LIZ2 == 4 || LIZ2 == 5) {
                    return;
                }
                File file = new File(this.LJLLILLLL.getSavePath());
                if (!file.exists()) {
                    boolean mkdirs = file.mkdirs();
                    if (!mkdirs && !file.exists()) {
                        if (X4H.LJFF(this.LJLLILLLL.getId(), null).LJIIIIZZ("opt_mkdir_failed", 0) != 1) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("download savePath directory can not created:");
                            LIZ3.append(this.LJLLILLLL.getSavePath());
                            throw new BaseException(1030, X1D.LIZIZ(LIZ3));
                        }
                        do {
                            int i3 = i2 + 1;
                            if (i2 < 3) {
                                try {
                                    Thread.sleep(10L);
                                    mkdirs = file.mkdirs();
                                    i2 = i3;
                                } catch (InterruptedException unused) {
                                    if (mkdirs) {
                                        return;
                                    }
                                }
                            }
                            if (!file.exists()) {
                                if (X4Q.LJIIIIZZ(this.LJLLILLLL.getSavePath()) < 16384) {
                                    StringBuilder LIZ4 = X1D.LIZ();
                                    LIZ4.append("download savePath directory can not created:");
                                    LIZ4.append(this.LJLLILLLL.getSavePath());
                                    throw new BaseException(1006, X1D.LIZIZ(LIZ4));
                                }
                                StringBuilder LIZ5 = X1D.LIZ();
                                LIZ5.append("download savePath directory can not created:");
                                LIZ5.append(this.LJLLILLLL.getSavePath());
                                throw new BaseException(1030, X1D.LIZIZ(LIZ5));
                            }
                            return;
                        } while (!mkdirs);
                        return;
                    }
                    return;
                }
                if (!file.isDirectory()) {
                    DownloadInfo downloadInfo = this.LJLLILLLL;
                    if (downloadInfo != null) {
                        if (X4H.LJFF(downloadInfo.getId(), null).LJIIIIZZ("optimize_save_path", 0) != 1) {
                            i = 0;
                        }
                        i2 = i;
                    }
                    if (i2 != 0) {
                        C16880lQ.LLLZZIL(file);
                        if (file.mkdirs() || file.exists()) {
                            return;
                        }
                        StringBuilder LIZ6 = X1D.LIZ();
                        LIZ6.append("download savePath is not directory:path=");
                        LIZ6.append(this.LJLLILLLL.getSavePath());
                        throw new BaseException(1031, X1D.LIZIZ(LIZ6));
                    }
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append("download savePath is not a directory:");
                    LIZ7.append(this.LJLLILLLL.getSavePath());
                    throw new BaseException(1031, X1D.LIZIZ(LIZ7));
                }
                return;
            }
            throw new BaseException(1029, "download name can not be empty");
        }
        throw new BaseException(1028, "download savePath can not be empty");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0188, code lost:
    
        if (r12.LLFZ.LJI("fix_file_exist_update_download_info", false) != false) goto L87;
     */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x017e: IF  (r11 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:104:0x0196 (LINE:382), block:B:95:0x017e */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0180: IF  (r7 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:97:0x018a (LINE:384), block:B:96:0x0180 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0142 A[Catch: all -> 0x017d, TryCatch #11 {all -> 0x017d, blocks: (B:31:0x013e, B:33:0x0142, B:35:0x0146, B:91:0x017c), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ() {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X4O.LJIIIIZZ():void");
    }

    public final void LJIIIZ() {
        long curBytes;
        boolean z;
        DownloadInfo downloadInfo = this.LJLLILLLL;
        if (downloadInfo == null || !downloadInfo.isFileDataValid()) {
            curBytes = 0;
        } else {
            curBytes = downloadInfo.getCurBytes();
        }
        long curBytes2 = this.LJLLILLLL.getCurBytes();
        if (curBytes != curBytes2 && C65210PiY.LIZ()) {
            String str = LLIIIJ;
            int id = this.LJLLILLLL.getId();
            StringBuilder LIZJ = V10.LIZJ("Offset:", curBytes, " curBytes: ");
            LIZJ.append(curBytes2);
            C65210PiY.LIZLLL(id, str, "checkTaskCanResume", X1D.LIZIZ(LIZJ));
        }
        this.LJLLILLLL.setCurBytes(curBytes);
        if (curBytes > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJJLL = z;
        if (!z && !this.LLFF) {
            if (C65210PiY.LIZ()) {
                C65210PiY.LIZLLL(this.LJLLILLLL.getId(), LLIIIJ, "checkTaskCanResume", "deleteAllDownloadFiles");
            }
            this.LJLLI.LJLJI(this.LJLLILLLL.getId());
            X4Q.LJ(this.LJLLILLLL, true);
        }
    }

    public final void LJIIJ() {
        Context LJ;
        if (this.LLFZ.LJIIIIZZ("opt_network_check", 0) != 1 && this.LJLLILLLL.isOnlyWifi() && ((LJ = C84212X3g.LJ()) == null || TextUtils.isEmpty("android.permission.ACCESS_NETWORK_STATE") || LJ.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0)) {
            throw new DownloadRetryNeedlessException(1019, C16880lQ.LLLZ("download task need permission:%s", new Object[]{"android.permission.ACCESS_NETWORK_STATE"}));
        }
        if (C84232X4a.LJFF == 1) {
            return;
        }
        if (this.LJLLILLLL.isOnlyWifi()) {
            C84232X4a.LJFF();
            if (C84232X4a.LIZJ()) {
                throw new DownloadOnlyWifiException();
            }
        }
        if (!this.LJLLILLLL.isDownloadFromReserveWifi() || !this.LJLLILLLL.isPauseReserveOnWifi()) {
            return;
        }
        C84232X4a.LJFF();
        if (!C84232X4a.LIZJ()) {
        } else {
            throw new DownloadPauseReserveWifiException();
        }
    }

    public final void LJIIL() {
        X5J x5j = this.LJLLLLLL;
        if (x5j != null) {
            x5j.cancel();
            this.LJLLLLLL = null;
        }
        X5F x5f = this.LJLLLL;
        if (x5f != null) {
            x5f.end();
            this.LJLLLL = null;
        }
    }

    public final void LJIILIIL() {
        List<InterfaceC84219X3n> list = C84212X3g.LJJJ;
        synchronized (list) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                InterfaceC84219X3n interfaceC84219X3n = (InterfaceC84219X3n) it.next();
                if (interfaceC84219X3n != null) {
                    interfaceC84219X3n.onStart();
                }
            }
        }
        try {
            C84232X4a.LIZIZ().LIZLLL();
            LJJIJIIJIL();
            C84232X4a.LIZIZ().LJ();
            C84212X3g.LJIJJLI(this.LJLILLLLZI);
        } catch (Throwable th) {
            C84232X4a.LIZIZ().LJ();
            throw th;
        }
    }

    public final boolean LJIILLIIL() {
        if (this.LJLL == EnumC84254X4w.RUN_STATUS_ERROR) {
            this.LJLLJ.LJI(this.LJLLL);
        } else if (this.LJLL == EnumC84254X4w.RUN_STATUS_CANCELED) {
            this.LJLLJ.LJIIL(-4, null, true);
        } else if (this.LJLL == EnumC84254X4w.RUN_STATUS_PAUSE) {
            this.LJLLJ.LJIIIIZZ();
        } else if (this.LJLL == EnumC84254X4w.RUN_STATUS_END_RIGHT_NOW) {
            try {
                this.LJLLJ.LIZLLL();
            } catch (BaseException e) {
                this.LJLLJ.LJI(e);
            }
        } else if (this.LJLL == EnumC84254X4w.RUN_STATUS_END_FOR_FILE_EXIST) {
            try {
                this.LJLLJ.LJ(this.LLD, this.LLF);
            } catch (BaseException e2) {
                this.LJLLJ.LJI(e2);
            }
        } else {
            if (this.LJLL == EnumC84254X4w.RUN_STATUS_ALL_CHUNK_RETRY_WITH_RESET) {
                this.LJLLJ.LJIIIZ(this.LJLLL, false);
                return false;
            }
            if (this.LJLL == EnumC84254X4w.RUN_STATUS_WAITING_ASYNC_HANDLER) {
                return true;
            }
            EnumC84254X4w enumC84254X4w = this.LJLL;
            EnumC84254X4w enumC84254X4w2 = EnumC84254X4w.RUN_STATUS_RETRY_DELAY;
            if (enumC84254X4w != enumC84254X4w2 || (this.LJLLILLLL.getCurBytes() > 0 && this.LJLLILLLL.getCurBytes() == this.LJLLILLLL.getTotalBytes())) {
                try {
                    if (!LIZIZ()) {
                        return false;
                    }
                    this.LJLLJ.LJFF();
                    X47.LIZ().scheduleRetryWhenHasTaskSucceed();
                } catch (Throwable th) {
                    LJJIIJ(new BaseException(1008, X4Q.LJIIL("doTaskStatusHandle onComplete", th)));
                }
            } else {
                this.LJLL = EnumC84254X4w.RUN_STATUS_NONE;
                if (this.LJLL == enumC84254X4w2) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0114, code lost:
    
        if (X.C65210PiY.LIZ() != false) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIZILJ() {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X4O.LJIIZILJ():boolean");
    }

    public final void LJIJI() {
        boolean z;
        X3E x3e;
        int i = 0;
        if (this.LJLL != EnumC84254X4w.RUN_STATUS_PAUSE && this.LJLL != EnumC84254X4w.RUN_STATUS_CANCELED) {
            z = true;
        } else {
            z = false;
        }
        if (C65210PiY.LIZ()) {
            String str = LLIIIJ;
            int id = this.LJLLILLLL.getId();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RunStatus: ");
            LIZ.append(this.LJLL);
            C65210PiY.LIZLLL(id, str, "endDownloadRunnable", X1D.LIZIZ(LIZ));
        }
        try {
            if (!LJIILLIIL() && 0 == 0) {
                this.LJZL = true;
                if (C65210PiY.LIZ()) {
                    C65210PiY.LIZLLL(this.LJLLILLLL.getId(), LLIIIJ, "endDownloadRunnable", "Jump to restart");
                    return;
                }
                return;
            }
        } catch (Exception e) {
            if (e instanceof BaseException) {
                this.LJLLJ.LJI((BaseException) e);
            } else {
                this.LJLLJ.LJI(new BaseException(1046, e));
            }
        }
        this.LJLJLLL.set(false);
        if (z) {
            try {
                if (C84212X3g.LJIIL() != null && (x3e = X3F.LJIIJJI) != null) {
                    Iterator it = ((ConcurrentHashMap) x3e.LIZ).entrySet().iterator();
                    while (it.hasNext()) {
                        if (((Map.Entry) it.next()).getValue() == this) {
                            it.remove();
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                InterfaceC84194X2o monitorDepend = this.LJLILLLLZI.getMonitorDepend();
                DownloadInfo downloadInfo = this.LJLLILLLL;
                BaseException baseException = new BaseException(1014, X4Q.LJIIL("removeDownloadRunnable", th));
                DownloadInfo downloadInfo2 = this.LJLLILLLL;
                if (downloadInfo2 != null) {
                    i = downloadInfo2.getStatus();
                }
                X4R.LJIIIIZZ(monitorDepend, downloadInfo, baseException, i);
            }
        }
    }

    public final boolean LJJIII() {
        if (this.LJLL == EnumC84254X4w.RUN_STATUS_CANCELED || this.LJLL == EnumC84254X4w.RUN_STATUS_PAUSE) {
            return true;
        }
        return false;
    }

    public final void LJJIJ() {
        if (this.LJLLILLLL.getChunkCount() > 1) {
            this.LJLLILLLL.reset();
            this.LJLLI.updateDownloadInfo(this.LJLLILLLL);
            X4Q.LJ(this.LJLLILLLL, true);
        }
    }

    public final void LJJIJIIJI() {
        int retryCount;
        if (X4H.LJFF(this.LJLLILLLL.getId(), null).LJIIIIZZ("reset_retain_retry_times", 0) == 1 && this.LLIIII < 3) {
            AtomicInteger atomicInteger = this.LJLJJI;
            if (this.LJLLILLLL.isBackUpUrlUsed()) {
                retryCount = this.LJLLILLLL.getBackUpUrlRetryCount();
            } else {
                retryCount = this.LJLLILLLL.getRetryCount();
            }
            atomicInteger.set(retryCount);
            this.LLIIII++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e5 A[Catch: all -> 0x0537, TryCatch #15 {all -> 0x0537, blocks: (B:172:0x032b, B:174:0x0350, B:176:0x0358, B:178:0x0366, B:180:0x036d, B:182:0x0375, B:183:0x0378, B:185:0x0382, B:196:0x0413, B:198:0x0360, B:150:0x02c0, B:152:0x02e5, B:154:0x02ea, B:156:0x02f0, B:159:0x0302, B:161:0x0306, B:163:0x030e, B:166:0x03ca, B:168:0x03f4, B:241:0x039a, B:243:0x03bf, B:239:0x0417, B:113:0x018c, B:235:0x01a1, B:237:0x01a7, B:115:0x01b6, B:117:0x01c4, B:119:0x01c8, B:122:0x01d7, B:124:0x01e2, B:126:0x01f3, B:127:0x0204, B:128:0x0213, B:130:0x0219, B:132:0x0223, B:135:0x022f, B:137:0x0241, B:139:0x025b, B:207:0x0266, B:141:0x0280, B:143:0x0288, B:145:0x0297, B:210:0x0272, B:211:0x027c, B:221:0x02ac, B:222:0x02b6, B:230:0x01d3), top: B:171:0x032b, outer: #19, inners: #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x041a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0350 A[Catch: all -> 0x0537, TryCatch #15 {all -> 0x0537, blocks: (B:172:0x032b, B:174:0x0350, B:176:0x0358, B:178:0x0366, B:180:0x036d, B:182:0x0375, B:183:0x0378, B:185:0x0382, B:196:0x0413, B:198:0x0360, B:150:0x02c0, B:152:0x02e5, B:154:0x02ea, B:156:0x02f0, B:159:0x0302, B:161:0x0306, B:163:0x030e, B:166:0x03ca, B:168:0x03f4, B:241:0x039a, B:243:0x03bf, B:239:0x0417, B:113:0x018c, B:235:0x01a1, B:237:0x01a7, B:115:0x01b6, B:117:0x01c4, B:119:0x01c8, B:122:0x01d7, B:124:0x01e2, B:126:0x01f3, B:127:0x0204, B:128:0x0213, B:130:0x0219, B:132:0x0223, B:135:0x022f, B:137:0x0241, B:139:0x025b, B:207:0x0266, B:141:0x0280, B:143:0x0288, B:145:0x0297, B:210:0x0272, B:211:0x027c, B:221:0x02ac, B:222:0x02b6, B:230:0x01d3), top: B:171:0x032b, outer: #19, inners: #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x041a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0424 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
    /* JADX WARN: Type inference failed for: r0v95, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL() {
        /*
            Method dump skipped, instructions count: 1345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X4O.LJJIJIIJIL():void");
    }

    public final void LJJIJL() {
        DownloadInfo downloadInfo = this.LJLLILLLL;
        if (downloadInfo == null) {
            return;
        }
        int retryCount = downloadInfo.getRetryCount() - this.LJLLILLLL.getCurRetryTime();
        if (retryCount < 0) {
            retryCount = 0;
        }
        AtomicInteger atomicInteger = this.LJLJJI;
        if (atomicInteger == null) {
            this.LJLJJI = new AtomicInteger(retryCount);
        } else {
            atomicInteger.set(retryCount);
        }
    }

    public final boolean LJ() {
        if (LJJIII() || this.LJLLILLLL.getStatus() == -2) {
            if (!LJJIII()) {
                if (this.LJLLILLLL.getStatus() == -2) {
                    this.LJLL = EnumC84254X4w.RUN_STATUS_PAUSE;
                    return true;
                }
                if (this.LJLLILLLL.getStatus() != -4) {
                    return true;
                }
                this.LJLL = EnumC84254X4w.RUN_STATUS_CANCELED;
                return true;
            }
            return true;
        }
        return false;
    }

    public final void LJIIJJI() {
        if (C65210PiY.LIZ()) {
            String str = LLIIIJ;
            int id = this.LJLLILLLL.getId();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Trace:");
            LIZ.append(android.util.Log.getStackTraceString(new Throwable()));
            C65210PiY.LIZLLL(id, str, "clearCurrentDownloadData", X1D.LIZIZ(LIZ));
        }
        try {
            this.LJLLI.LJLJI(this.LJLLILLLL.getId());
            X4Q.LJ(this.LJLLILLLL, true);
            this.LJLJJLL = false;
            this.LJLLILLLL.resetDataForEtagEndure("");
            this.LJLLI.updateDownloadInfo(this.LJLLILLLL);
        } catch (Throwable unused) {
        }
    }

    public final void LJIJJ() {
        if (C65210PiY.LIZ()) {
            C65210PiY.LIZLLL(this.LJLLILLLL.getId(), LLIIIJ, "finishWithFileExist", "File exits");
        }
        if (X4H.LJFF.LJI("fix_end_for_file_exist_error", true)) {
            if (this.LLF.equals(this.LJLLILLLL.getName())) {
                this.LJLL = EnumC84254X4w.RUN_STATUS_END_RIGHT_NOW;
            } else {
                this.LJLL = EnumC84254X4w.RUN_STATUS_END_FOR_FILE_EXIST;
            }
        } else if (this.LLF.equals(this.LJLLILLLL.getTargetFilePath())) {
            this.LJLL = EnumC84254X4w.RUN_STATUS_END_RIGHT_NOW;
        } else {
            this.LJLL = EnumC84254X4w.RUN_STATUS_END_FOR_FILE_EXIST;
        }
        this.LJLLILLLL.setCacheExistsInDownloading(true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LJIILIIL();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static boolean LIZJ(DownloadInfo downloadInfo) {
        downloadInfo.setInterceptFlag(0);
        return false;
    }

    public final boolean LIZ(BaseException baseException) {
        if (this.LLIIIILZ != null && X4Q.LJJ(baseException) && this.LJLJJI.get() < this.LJLLILLLL.getRetryCount()) {
            return false;
        }
        if (baseException instanceof DownloadHttpException) {
            DownloadHttpException downloadHttpException = (DownloadHttpException) baseException;
            if (downloadHttpException.getHttpStatusCode() == 412 || downloadHttpException.getHttpStatusCode() == 416) {
                if (!this.LJLJI) {
                    X4Q.LJ(this.LJLLILLLL, true);
                    this.LJLJI = true;
                }
                return true;
            }
        }
        if (baseException.getErrorCode() == 1083) {
            return false;
        }
        if (this.LLI.LIZ(baseException)) {
            return true;
        }
        AtomicInteger atomicInteger = this.LJLJJI;
        if (((atomicInteger == null || atomicInteger.get() <= 0) && !this.LJLLILLLL.hasNextBackupUrl() && ((baseException.getErrorCode() != 1011 && (baseException.getCause() == null || !(baseException.getCause() instanceof SSLHandshakeException))) || !this.LJLLILLLL.canReplaceHttpForRetry())) || (baseException instanceof DownloadRetryNeedlessException)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:9|(5:49|50|(1:52)|53|(4:55|(4:57|58|(1:60)(1:62)|61)|64|(4:66|(4:68|(1:70)|71|(2:73|74)(2:75|76))|77|(7:79|(1:81)|22|23|24|25|26))(2:82|(5:84|23|24|25|26)(4:85|(1:87)(1:90)|88|89))))(2:11|(4:13|(1:15)(1:18)|16|17)(2:19|(2:47|48)))|21|22|23|24|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0190, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0191, code lost:
    
        r3 = X.X4O.LLIIIJ;
        r1 = r26.LJLLILLLL.getId();
        r12 = X.X1D.LIZ();
        r12.append("Exception: ");
        r12.append(r11.toString());
        r12.append(" mustSetLength: ");
        r12.append(r2);
        X.C65210PiY.LJ(r1, r3, "checkSpaceOverflow", X.X1D.LIZIZ(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01bc, code lost:
    
        if (r4 >= r27) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01c8, code lost:
    
        r24.LJLIL.LIZJ(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01d0, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d1, code lost:
    
        r5 = X.X4O.LLIIIJ;
        r4 = r26.LJLLILLLL.getId();
        r3 = X.X1D.LIZ();
        r3.append("Exception2: ");
        r3.append(r11.toString());
        r3.append(" mustSetLength: ");
        r3.append(r2);
        X.C65210PiY.LJ(r4, r5, "checkSpaceOverflow", X.X1D.LIZIZ(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01f8, code lost:
    
        if (r2 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0200, code lost:
    
        throw new com.ss.android.socialbase.downloader.exception.BaseException(1040, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0201, code lost:
    
        if (r2 != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0212, code lost:
    
        throw new com.ss.android.socialbase.downloader.exception.BaseException(1040, r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(long r27) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X4O.LJII(long):void");
    }

    public final List<HttpHeader> LJIJJLI(long j) {
        List<HttpHeader> extraHeaders = this.LJLLILLLL.getExtraHeaders();
        List<HttpHeader> LIZ = X4P.LIZ(j, this.LJLLILLLL.getEndOffset(), this.LJLLILLLL.geteTag(), extraHeaders);
        if (this.LJLLILLLL.isExpiredRedownload() && this.LLFF && this.LJLLILLLL.getLastModified() != null) {
            ArrayList arrayList = (ArrayList) LIZ;
            arrayList.add(new HttpHeader("if-modified-since", this.LJLLILLLL.getLastModified()));
            arrayList.add(new HttpHeader("download-tc21-1-15", "download-tc21-1-15"));
            if (C65210PiY.LIZ()) {
                String str = LLIIIJ;
                int id = this.LJLLILLLL.getId();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("LastModified: ");
                LIZ2.append(this.LJLLILLLL.getLastModified());
                C65210PiY.LIZLLL(id, str, "getExtraHeaders", X1D.LIZIZ(LIZ2));
            }
        }
        ((ArrayList) LIZ).add(new HttpHeader("extra_download_id", String.valueOf(this.LJLLILLLL.getId())));
        return LIZ;
    }

    public final boolean LJJIFFI(BaseException baseException) {
        this.LLIFFJFJJ.LIZ(baseException);
        if (this.LLI.LIZ(baseException)) {
            this.LLI.LIZIZ();
            this.LJLLILLLL.setCurNetworkRetryCount(this.LLI.LJIIIIZZ);
            return false;
        }
        AtomicInteger atomicInteger = this.LJLJJI;
        boolean z = true;
        if (atomicInteger != null) {
            if (atomicInteger.get() <= 0 || baseException.getErrorCode() == 1070) {
                if (this.LJLLILLLL.trySwitchToNextBackupUrl()) {
                    this.LJLJJI.set(this.LJLLILLLL.getBackUpUrlRetryCount());
                    this.LJLLILLLL.updateCurRetryTime(this.LJLJJI.get());
                } else if ((baseException.getErrorCode() == 1011 || (baseException.getCause() != null && (baseException.getCause() instanceof SSLHandshakeException))) && this.LJLLILLLL.canReplaceHttpForRetry()) {
                    this.LJLJJI.set(this.LJLLILLLL.getRetryCount());
                    this.LJLLILLLL.updateCurRetryTime(this.LJLJJI.get());
                    this.LJLLILLLL.setHttpsToHttpRetryUsed(true);
                } else {
                    LJJIIJ(new BaseException(baseException.getErrorCode(), C16880lQ.LLLZI(Locale.US, "retry for exception, but current retry time : %s , retry Time %d all used, last error is %s", new Object[]{String.valueOf(this.LJLJJI), Integer.valueOf(this.LJLLILLLL.getRetryCount()), baseException.getErrorMessage()})));
                    return true;
                }
                z = false;
            }
            if (this.LJLL != EnumC84254X4w.RUN_STATUS_RETRY_DELAY && z) {
                this.LJLLILLLL.updateCurRetryTime(this.LJLJJI.decrementAndGet());
            }
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("retry for exception, but retain retry time is null, last error is :");
        LIZ.append(baseException.getErrorMessage());
        LJJIIJ(new BaseException(1043, X1D.LIZIZ(LIZ)));
        return true;
    }

    public final void LJJIIJ(BaseException baseException) {
        this.LJLL = EnumC84254X4w.RUN_STATUS_ERROR;
        this.LJLLL = baseException;
    }

    public final boolean LJJIIJZLJL(long j) {
        boolean z;
        BaseException baseException;
        boolean z2;
        long j2;
        int LJIIIIZZ;
        long j3;
        boolean z3;
        if (this.LLFFF > 0 && this.LJLLILLLL.getCurBytes() > this.LLFFF) {
            try {
                j2 = X4Q.LJIIIIZZ(this.LJLLILLLL.getTempPath());
            } catch (BaseException unused) {
                j2 = 0;
            }
            if (C65210PiY.LIZ()) {
                String str = LLIIIJ;
                int id = this.LJLLILLLL.getId();
                StringBuilder sb = new StringBuilder("Available: ");
                if (j2 > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                sb.append(z3);
                C65210PiY.LIZLLL(id, str, "checkSpaceOverflowInProgress", sb.toString());
            }
            if (j2 > 0) {
                long totalBytes = this.LJLLILLLL.getTotalBytes() - this.LJLLILLLL.getCurBytes();
                if (j2 < totalBytes && (LJIIIIZZ = X4H.LJFF(this.LJLLILLLL.getId(), null).LJIIIIZZ("space_fill_min_keep_mb", 100)) > 0) {
                    long j4 = j2 - (LJIIIIZZ * 1048576);
                    if (C65210PiY.LIZ()) {
                        String str2 = LLIIIJ;
                        C65210PiY.LIZLLL(this.LJLLILLLL.getId(), str2, "checkSpaceOverflowInProgress", "MinKeep: " + LJIIIIZZ + "MB canDownload:" + (j4 / 1048576.0d) + "MB");
                        j3 = 0;
                    } else {
                        j3 = 0;
                    }
                    if (j4 > j3) {
                        this.LLFFF = j4 + 1048576 + this.LJLLILLLL.getCurBytes();
                    } else {
                        this.LLFFF = j3;
                        throw new DownloadOutOfSpaceException(j2, totalBytes);
                    }
                }
            }
            this.LLFFF = 0L;
        }
        X44 x44 = this.LJLLJ;
        x44.LJIIJJI.addAndGet(j);
        x44.LIZJ.increaseCurBytes(j);
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!x44.LJIIL) {
            x44.LJIIL = true;
            z = true;
        } else {
            long j5 = uptimeMillis - x44.LJIIJ;
            if (x44.LJIIJJI.get() >= x44.LJIILJJIL || j5 >= x44.LJIILIIL) {
                z = true;
                x44.LJIIJ = uptimeMillis;
                x44.LJIIJJI.set(0L);
            } else {
                z = false;
            }
        }
        if (x44.LIZJ.getCurBytes() == x44.LIZJ.getTotalBytes()) {
            try {
                x44.LIZLLL.LJJLI(x44.LIZJ.getId(), x44.LIZJ.getCurBytes());
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            return false;
        }
        if (x44.LJIIIZ) {
            x44.LJIIIZ = false;
            x44.LIZJ.setStatus(4);
        }
        if (x44.LIZJ.isNeedPostProgress() && z) {
            baseException = null;
            z2 = true;
        } else {
            baseException = null;
            z2 = false;
        }
        x44.LJIIL(4, baseException, z2);
        return z;
    }

    public final PPE LJJIIZ(BaseException baseException) {
        long totalBytes;
        long j;
        this.LJLLL = baseException;
        this.LJLLILLLL.increaseCurBytes(0L);
        this.LJLLI.updateDownloadInfo(this.LJLLILLLL);
        if (LJJIII()) {
            return PPE.RETURN;
        }
        boolean z = false;
        if (baseException.getErrorCode() == 1047) {
            if (this.LJLZ == null || this.LJLLILLLL.isForbiddenRetryed()) {
                if (LJJIFFI(baseException)) {
                    return PPE.RETURN;
                }
            } else {
                X3H x3h = new X3H(this);
                boolean LIZ = ((X19) this.LJLZ).LIZ(x3h);
                this.LJLLILLLL.setForbiddenRetryed();
                if (LIZ && !x3h.LIZ) {
                    this.LJLLJ.LIZJ();
                    this.LJLL = EnumC84254X4w.RUN_STATUS_WAITING_ASYNC_HANDLER;
                    return PPE.RETURN;
                }
            }
        } else if (X4Q.LJIJJ(baseException)) {
            if (this.LJZ == null) {
                LJJIIJ(baseException);
                return PPE.RETURN;
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            X3G x3g = new X3G(this, atomicBoolean);
            if (baseException instanceof DownloadOutOfSpaceException) {
                DownloadOutOfSpaceException downloadOutOfSpaceException = (DownloadOutOfSpaceException) baseException;
                j = downloadOutOfSpaceException.getAvaliableSpaceBytes();
                totalBytes = downloadOutOfSpaceException.getRequiredSpaceBytes();
            } else {
                totalBytes = this.LJLLILLLL.getTotalBytes();
                j = -1;
            }
            synchronized (this) {
                if (((C84179X1z) this.LJZ).LIZ(j, totalBytes, x3g)) {
                    if (!X4H.LJFF(this.LJLLILLLL.getId(), null).LJI("not_delete_when_clean_space", false)) {
                        LIZIZ();
                    }
                    if (!atomicBoolean.get()) {
                        EnumC84254X4w enumC84254X4w = this.LJLL;
                        EnumC84254X4w enumC84254X4w2 = EnumC84254X4w.RUN_STATUS_WAITING_ASYNC_HANDLER;
                        if (enumC84254X4w != enumC84254X4w2) {
                            this.LJLL = enumC84254X4w2;
                            this.LJLLJ.LIZJ();
                        }
                        return PPE.RETURN;
                    }
                    if (LJJIFFI(baseException)) {
                        return PPE.RETURN;
                    }
                } else {
                    if (this.LJLL == EnumC84254X4w.RUN_STATUS_WAITING_ASYNC_HANDLER) {
                        return PPE.RETURN;
                    }
                    LJJIIJ(baseException);
                    return PPE.RETURN;
                }
            }
        } else if (LJJIFFI(baseException)) {
            return PPE.RETURN;
        }
        X44 x44 = this.LJLLJ;
        EnumC84254X4w enumC84254X4w3 = this.LJLL;
        EnumC84254X4w enumC84254X4w4 = EnumC84254X4w.RUN_STATUS_RETRY_DELAY;
        if (enumC84254X4w3 == enumC84254X4w4) {
            z = true;
        }
        x44.LJIIIZ(baseException, z);
        if (this.LJLL == enumC84254X4w4) {
            return PPE.RETURN;
        }
        return PPE.CONTINUE;
    }

    public final void LJJIJIL(X5F x5f) {
        String LIZIZ;
        if (x5f != null) {
            try {
                int LIZ = x5f.LIZ();
                this.LJLLILLLL.setHttpStatusCode(LIZ);
                this.LJLLILLLL.setHttpStatusMessage(C1JI.LJIJI(LIZ));
                List<String> accessHttpHeaderKeys = this.LJLLILLLL.getAccessHttpHeaderKeys();
                if (accessHttpHeaderKeys != null && !accessHttpHeaderKeys.isEmpty()) {
                    HashMap hashMap = new HashMap();
                    for (String str : accessHttpHeaderKeys) {
                        if (str != null && (LIZIZ = x5f.LIZIZ(str)) != null) {
                            hashMap.put(str, LIZIZ);
                        }
                    }
                    if (!hashMap.isEmpty()) {
                        this.LJLLILLLL.setHttpHeaders(hashMap);
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable unused) {
            }
        }
        this.LJLLILLLL.setHttpStatusCode(-1);
        this.LJLLILLLL.setHttpStatusMessage("");
    }

    public X4O(DownloadTask downloadTask, INK ink) {
        this.LJLILLLLZI = downloadTask;
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            this.LJLLILLLL = downloadInfo;
            this.LJLZ = downloadTask.getForbiddenHandler();
            this.LJZ = downloadTask.getDiskSpaceHandler();
            if (downloadTask.getRetryDelayTimeCalculator() == null) {
                DownloadInfo downloadInfo2 = downloadTask.getDownloadInfo();
                if (downloadInfo2 != null) {
                    String retryDelayTimeArray = downloadInfo2.getRetryDelayTimeArray();
                    if (!TextUtils.isEmpty(retryDelayTimeArray)) {
                        new C29821Fa(retryDelayTimeArray);
                    }
                }
                if (C84212X3g.LJIL == null) {
                    synchronized (C84212X3g.class) {
                        if (C84212X3g.LJIL == null) {
                            C84212X3g.LJIL = new C75806Tp4();
                        }
                    }
                }
            }
            this.LLFZ = X4H.LJFF(downloadInfo.getId(), null);
            this.LLI = new X4Y(downloadInfo);
            this.LLIFFJFJJ = new X53(downloadInfo);
        } else {
            this.LLFZ = X4H.LJFF;
            this.LLI = new X4Y(null);
            this.LLIFFJFJJ = new X53(null);
        }
        LJJIJL();
        this.LJLLI = C84212X3g.LJIIJ();
        this.LJLLJ = new X44(downloadTask, ink);
        this.LJLJLLL = new AtomicBoolean(true);
    }

    public final void LJFF(int i, long j) {
        if (j <= 0 || i <= 0 || j <= i) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Current Bytes:");
        LIZ.append(j);
        LIZ.append("Limit bytes:");
        LIZ.append(i);
        throw new BaseException(1088, X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:13|(4:15|16|17|(3:21|22|(1:24)(2:25|26)))|30|31) */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(java.lang.String r14, java.util.List<com.ss.android.socialbase.downloader.model.HttpHeader> r15) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X4O.LJIILJJIL(java.lang.String, java.util.List):void");
    }

    public final void LJJ(String str, String str2) {
        this.LJLLI.LJLJI(this.LJLLILLLL.getId());
        X4Q.LJ(this.LJLLILLLL, true);
        this.LJLJJLL = false;
        this.LLFF = false;
        this.LJLLILLLL.resetDataForEtagEndure(str);
        this.LJLLI.updateDownloadInfo(this.LJLLILLLL);
        throw new X5C(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        r9.LJLLLLLL = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(long r10, java.lang.String r12, java.util.List r13) {
        /*
            r9 = this;
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r9.LJLLILLLL
            int r0 = r0.getChunkCount()
            r3 = 1
            if (r0 != r3) goto L18
            X.X4l r0 = X.X5I.LIZ
            X.X4k r0 = r0.LIZ(r12, r13)
            if (r0 == 0) goto L18
            r9.LJLLLLLL = r0
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r9.LJLLILLLL
            r0.setPreconnectLevel(r3)
        L18:
            X.X5J r0 = r9.LJLLLLLL
            r4 = 0
            if (r0 != 0) goto L69
            boolean r0 = r9.LL
            if (r0 != 0) goto L69
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r9.LJLLILLLL
            boolean r0 = r0.isHeadConnectionAvailable()
            if (r0 == 0) goto L69
            X.X4H r1 = r9.LLFZ     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "net_lib_strategy"
            int r2 = r1.LJIIIIZZ(r0, r4)     // Catch: java.lang.Throwable -> L5f
            X.X4H r1 = r9.LLFZ     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "monitor_download_connect"
            int r0 = r1.LJIIIIZZ(r0, r4)     // Catch: java.lang.Throwable -> L5f
            if (r0 <= 0) goto L3d
            r8 = 1
            goto L3e
        L3d:
            r8 = 0
        L3e:
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r9.LJLLILLLL     // Catch: java.lang.Throwable -> L5f
            int[] r6 = X.C84212X3g.LJIILL(r2)     // Catch: java.lang.Throwable -> L5f
            int r5 = r6.length     // Catch: java.lang.Throwable -> L5f
            r4 = 0
            r2 = r4
            r1 = 0
        L48:
            if (r1 >= r5) goto L59
            r0 = r6[r1]     // Catch: java.lang.Throwable -> L5f
            X.X5J r0 = X.C84212X3g.LIZLLL(r12, r13, r0, r8, r7)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5f
            if (r0 == 0) goto L54
            goto L57
        L53:
            r2 = move-exception
        L54:
            int r1 = r1 + 1
            goto L48
        L57:
            r4 = r0
            goto L5b
        L59:
            if (r2 != 0) goto L5e
        L5b:
            r9.LJLLLLLL = r4     // Catch: java.lang.Throwable -> L5f
            goto L69
        L5e:
            throw r2     // Catch: java.lang.Throwable -> L5f
        L5f:
            r0 = move-exception
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r9.LJLLILLLL
            java.lang.String r0 = X.X4Q.LJIILLIIL(r0)
            r1.setHeadConnectionException(r0)
        L69:
            X.X5J r0 = r9.LJLLLLLL
            if (r0 == 0) goto L85
            r9.LJIL(r12, r0, r10)     // Catch: java.lang.Throwable -> L71
            goto L85
        L71:
            r2 = move-exception
            boolean r0 = r2 instanceof com.ss.android.socialbase.downloader.exception.BaseException
            if (r0 == 0) goto L83
            r0 = r2
            com.ss.android.socialbase.downloader.exception.BaseException r0 = (com.ss.android.socialbase.downloader.exception.BaseException) r0
            int r1 = r0.getErrorCode()
            r0 = 1083(0x43b, float:1.518E-42)
            if (r1 != r0) goto L83
            throw r2
        L83:
            r9.LL = r3
        L85:
            X.X5J r0 = r9.LJLLLLLL
            if (r0 == 0) goto L8d
            boolean r0 = r9.LL
            if (r0 == 0) goto L95
        L8d:
            r9.LJIILJJIL(r12, r13)
            X.X5F r0 = r9.LJLLLL
            r9.LJIL(r12, r0, r10)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X4O.LJIILL(long, java.lang.String, java.util.List):void");
    }

    public final void LJIL(String str, X5J x5j, long j) {
        boolean z;
        String str2;
        long j2;
        if (x5j == null) {
            return;
        }
        try {
            C84244X4m c84244X4m = new C84244X4m(x5j, str);
            int i = c84244X4m.LIZJ;
            String LIZIZ = c84244X4m.LIZIZ();
            if (TextUtils.isEmpty(this.LJLLILLLL.getMimeType()) && !TextUtils.isEmpty(LIZIZ)) {
                this.LJLLILLLL.setMimeType(LIZIZ);
            }
            boolean LIZ = c84244X4m.LIZ();
            this.LJLJL = LIZ;
            this.LJLLILLLL.setSupportPartial(LIZ);
            int i2 = c84244X4m.LIZJ;
            if (i2 == 200 || i2 == 201 || i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            this.LJLJLJ = z;
            String str3 = this.LJLLILLLL.geteTag();
            String LIZIZ2 = c84244X4m.LIZIZ.LIZIZ("Etag");
            String LIZJ = c84244X4m.LIZJ();
            String LJIILJJIL = X4Q.LJIILJJIL(c84244X4m.LIZIZ, "Cache-Control");
            if (C65210PiY.LIZ()) {
                String str4 = LLIIIJ;
                int id = this.LJLLILLLL.getId();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("ResponseCode=");
                LIZ2.append(i);
                LIZ2.append(" last_modified=");
                LIZ2.append(LIZJ);
                LIZ2.append(" CACHE_CONTROL=");
                LIZ2.append(LJIILJJIL);
                LIZ2.append(" max-age=");
                LIZ2.append(X4P.LJIL(X4Q.LJIILJJIL(c84244X4m.LIZIZ, "Cache-Control")));
                LIZ2.append(" isDeleteCacheIfCheckFailed=");
                LIZ2.append(this.LJLLILLLL.isDeleteCacheIfCheckFailed());
                C65210PiY.LIZLLL(id, str4, "handleFirstConnection", X1D.LIZIZ(LIZ2));
                int id2 = this.LJLLILLLL.getId();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("firstOffset=");
                LIZ3.append(j);
                LIZ3.append(" cur=");
                LIZ3.append(LIZJ);
                LIZ3.append(" before=");
                LIZ3.append(this.LJLLILLLL.getLastModified());
                LIZ3.append(" cur=");
                LIZ3.append(c84244X4m.LIZLLL());
                LIZ3.append(" before=");
                LIZ3.append(this.LJLLILLLL.getTotalBytes());
                C65210PiY.LIZLLL(id2, str4, "handleFirstConnection", X1D.LIZIZ(LIZ3));
            }
            if (x5j instanceof X3T) {
                String LJ = ((X3T) x5j).LJ();
                if (!TextUtils.isEmpty(LJ)) {
                    this.LJLLILLLL.setRedirectPartialUrlResults(LJ);
                }
            }
            if (!TextUtils.isEmpty(LJIILJJIL)) {
                this.LJLLILLLL.setCacheControl(LJIILJJIL);
                if (X4P.LJIL(X4Q.LJIILJJIL(c84244X4m.LIZIZ, "Cache-Control")) > 0) {
                    this.LJLLILLLL.setCacheExpiredTime((X4P.LJIL(X4Q.LJIILJJIL(c84244X4m.LIZIZ, "Cache-Control")) * 1000) + System.currentTimeMillis());
                }
            }
            String str5 = "";
            if (this.LJLLILLLL.isExpiredRedownload() && this.LLFF && !TextUtils.isEmpty(this.LLF)) {
                if (i != 304 && ((TextUtils.isEmpty(this.LJLLILLLL.getLastModified()) && this.LJLLILLLL.isDeleteCacheIfCheckFailed()) || !TextUtils.equals(LIZJ, this.LJLLILLLL.getLastModified()))) {
                    if (this.LLFZ.LJI("fix_expire_download_file_not_exits", true)) {
                        LIZIZ2 = "";
                    }
                    if (C65210PiY.LIZ()) {
                        C65210PiY.LIZLLL(this.LJLLILLLL.getId(), LLIIIJ, "handleFirstConnection", "Delete");
                    }
                    X4Q.LIZLLL(this.LJLLILLLL);
                    this.LLFF = false;
                }
                if (C65210PiY.LIZ()) {
                    String str6 = LLIIIJ;
                    int id3 = this.LJLLILLLL.getId();
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("ResponseCode=");
                    LIZ4.append(i);
                    LIZ4.append(" lastModified not changed, use local file  ");
                    LIZ4.append(LIZJ);
                    C65210PiY.LIZLLL(id3, str6, "handleFirstConnection", X1D.LIZIZ(LIZ4));
                }
                if (!X4Q.LJIJ(this.LJLLILLLL, false, null)) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("Download file delete responseCode:");
                    LIZ5.append(i);
                    LJJ("", X1D.LIZIZ(LIZ5));
                    throw null;
                }
                throw new DownloadFileExistException(this.LLD, this.LLF);
            }
            if (j > 0 && this.LJLLILLLL.isExpiredRedownload() && !TextUtils.equals(LIZJ, this.LJLLILLLL.getLastModified())) {
                if (C65210PiY.LIZ()) {
                    C65210PiY.LIZLLL(this.LJLLILLLL.getId(), LLIIIJ, "handleFirstConnection", "Cdn file change, so retry");
                }
                LJJ("", "cdn file changed");
                throw null;
            }
            if (!TextUtils.isEmpty(LIZJ)) {
                this.LJLLILLLL.setLastModified(LIZJ);
            }
            if (LJJII(i, str3, LIZIZ2)) {
                if (x5j instanceof X5F) {
                    if (TextUtils.isEmpty(str3) || !str3.equals(LIZIZ2)) {
                        str5 = LIZIZ2;
                    }
                    LJJ(str5, "eTag of server file changed");
                    throw null;
                }
                throw new DownloadHttpException(1002, i, "");
            }
            if (this.LJLJL || this.LJLJLJ) {
                if (this.LJLJLJ && j > 0) {
                    if (x5j instanceof X5F) {
                        LJJ("", "http head request not support");
                        throw null;
                    }
                    throw new BaseException(1004, "isResponseFromBegin but firstOffset > 0");
                }
                if (c84244X4m.LIZLLL <= 0) {
                    c84244X4m.LIZLLL = X4Q.LJIIIZ(c84244X4m.LIZIZ);
                }
                long j3 = c84244X4m.LIZLLL;
                if ((x5j instanceof X5F) || j3 >= 0 || !C78946Uyc.LJJI(this.LJLLILLLL)) {
                    if (!TextUtils.isEmpty(this.LJLLILLLL.getName())) {
                        str2 = "";
                    } else {
                        str2 = X4P.LJIIIZ(x5j, this.LJLLILLLL.getUrl());
                    }
                    if (!c84244X4m.LJFF()) {
                        if (j3 != 0 || (x5j instanceof X5F)) {
                            String LJIILJJIL2 = X4Q.LJIILJJIL(x5j, "Content-Range");
                            if (C65210PiY.LIZ()) {
                                String str7 = LLIIIJ;
                                int id4 = this.LJLLILLLL.getId();
                                StringBuilder LIZ6 = X1D.LIZ();
                                LIZ6.append("ContentRange:");
                                LIZ6.append(LJIILJJIL2);
                                C65210PiY.LIZLLL(id4, str7, "handleFirstConnection", X1D.LIZIZ(LIZ6));
                            }
                            if (!TextUtils.isEmpty(LJIILJJIL2) && this.LLFZ.LJI("fix_get_total_bytes", true)) {
                                j2 = X4P.LJIJI(LJIILJJIL2);
                                if (C65210PiY.LIZ()) {
                                    String str8 = LLIIIJ;
                                    int id5 = this.LJLLILLLL.getId();
                                    StringBuilder LIZ7 = X1D.LIZ();
                                    LIZ7.append("TotalLength:");
                                    LIZ7.append(j2);
                                    C65210PiY.LIZLLL(id5, str8, "handleFirstConnection", X1D.LIZIZ(LIZ7));
                                }
                            } else {
                                j2 = j + j3;
                                if (C65210PiY.LIZ()) {
                                    String str9 = LLIIIJ;
                                    int id6 = this.LJLLILLLL.getId();
                                    StringBuilder LIZ8 = X1D.LIZ();
                                    LIZ8.append("TotalLength2:");
                                    LIZ8.append(j2);
                                    C65210PiY.LIZLLL(id6, str9, "handleFirstConnection", X1D.LIZIZ(LIZ8));
                                }
                            }
                        } else {
                            throw new BaseException(1004, "");
                        }
                    } else {
                        this.LJLLILLLL.setXTotalBytes(c84244X4m.LJ());
                        j2 = -1;
                    }
                    long j4 = 0;
                    if (this.LJLLILLLL.getStartOffset() > 0 || this.LJLLILLLL.getEndOffset() >= 0) {
                        if (this.LJLLILLLL.getStartOffset() >= 0 && this.LJLLILLLL.getEndOffset() < j2 && (this.LJLLILLLL.getEndOffset() < 0 || this.LJLLILLLL.getStartOffset() <= this.LJLLILLLL.getEndOffset())) {
                            j4 = 0;
                            if (this.LJLLILLLL.getEndOffset() < 0) {
                                j2 -= this.LJLLILLLL.getStartOffset();
                            } else {
                                j2 = (this.LJLLILLLL.getEndOffset() - this.LJLLILLLL.getStartOffset()) + 1;
                            }
                        } else {
                            StringBuilder LIZ9 = X1D.LIZ();
                            LIZ9.append("startOffset = ");
                            LIZ9.append(this.LJLLILLLL.getStartOffset());
                            LIZ9.append(", endOffset = ");
                            LIZ9.append(this.LJLLILLLL.getEndOffset());
                            LIZ9.append(", totalLength = ");
                            LIZ9.append(j2);
                            throw new BaseException(1084, X1D.LIZIZ(LIZ9));
                        }
                    }
                    if (!TextUtils.isEmpty(this.LJLLILLLL.getTaskKey()) && this.LJLLILLLL.getTotalBytes() > j4 && j2 != this.LJLLILLLL.getTotalBytes()) {
                        if (x5j instanceof X5F) {
                            LJJ("", "file totalLength changed");
                            throw null;
                        }
                        throw new DownloadHttpException(1002, i, "");
                    }
                    if (LJ()) {
                        return;
                    }
                    if (this.LJLLILLLL.getExpectFileLength() <= j4 || X4H.LJ(this.LJLLILLLL.getId()).LJIIIIZZ("force_check_file_length", 0) != 1 || this.LJLLILLLL.getExpectFileLength() == j2) {
                        LIZJ(this.LJLLILLLL);
                        this.LJLLJ.LJII(j2, LIZIZ2, str2);
                        return;
                    }
                    StringBuilder LIZ10 = X1D.LIZ();
                    LIZ10.append("expectFileLength = ");
                    LIZ10.append(this.LJLLILLLL.getExpectFileLength());
                    LIZ10.append(" , totalLength = ");
                    LIZ10.append(j2);
                    throw new BaseException(1070, X1D.LIZIZ(LIZ10));
                }
                throw new BaseException(1004, "");
            }
            if (i != 403) {
                if (this.LJLLILLLL.getStartOffset() < 0 || (this.LJLLILLLL.getEndOffset() >= 0 && this.LJLLILLLL.getStartOffset() > this.LJLLILLLL.getEndOffset())) {
                    StringBuilder LIZ11 = X1D.LIZ();
                    LIZ11.append("startOffset = ");
                    LIZ11.append(this.LJLLILLLL.getStartOffset());
                    LIZ11.append(", endOffset = ");
                    LIZ11.append(this.LJLLILLLL.getEndOffset());
                    LIZ11.append(", response code error : ");
                    LIZ11.append(i);
                    throw new BaseException(1084, X1D.LIZIZ(LIZ11));
                }
                StringBuilder LIZ12 = X1D.LIZ();
                LIZ12.append("response code error : ");
                LIZ12.append(i);
                throw new DownloadHttpException(1004, i, X1D.LIZIZ(LIZ12));
            }
            throw new BaseException(1047, "response code error : 403");
        } catch (X5C e) {
            throw e;
        } catch (BaseException e2) {
            throw e2;
        } catch (Throwable th) {
            X4P.LJIJJLI("HandleFirstConnection", th);
            throw null;
        }
    }

    public final boolean LJJII(int i, String str, String str2) {
        if (i == 412) {
            return true;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !str.equals(str2) && (this.LJLJLJ || this.LJLJL)) {
            return true;
        }
        if ((i == 201 || i == 416) && this.LJLLILLLL.getCurBytes() > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x0170, code lost:
    
        if (r7 <= 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02ab, code lost:
    
        ((X.X4O) r9.LJIIIZ).LJJIIJZLJL((long) r7);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03cd A[Catch: all -> 0x0560, TryCatch #0 {all -> 0x0560, blocks: (B:125:0x03a0, B:127:0x03cd, B:128:0x03d4, B:155:0x0537, B:156:0x053d, B:159:0x053f, B:160:0x0546, B:237:0x0410, B:239:0x0445, B:264:0x0554, B:266:0x055a, B:267:0x055d, B:268:0x055f), top: B:41:0x00ae, inners: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0537 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0445 A[Catch: all -> 0x0560, TryCatch #0 {all -> 0x0560, blocks: (B:125:0x03a0, B:127:0x03cd, B:128:0x03d4, B:155:0x0537, B:156:0x053d, B:159:0x053f, B:160:0x0546, B:237:0x0410, B:239:0x0445, B:264:0x0554, B:266:0x055a, B:267:0x055d, B:268:0x055f), top: B:41:0x00ae, inners: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x055a A[Catch: all -> 0x0560, TryCatch #0 {all -> 0x0560, blocks: (B:125:0x03a0, B:127:0x03cd, B:128:0x03d4, B:155:0x0537, B:156:0x053d, B:159:0x053f, B:160:0x0546, B:237:0x0410, B:239:0x0445, B:264:0x0554, B:266:0x055a, B:267:0x055d, B:268:0x055f), top: B:41:0x00ae, inners: #17 }] */
    /* JADX WARN: Type inference failed for: r1v11, types: [X.X4H] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v10, types: [int] */
    /* JADX WARN: Type inference failed for: r7v11, types: [int] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    /* JADX WARN: Type inference failed for: r7v6, types: [int] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(long r39, long r41, java.lang.String r43, X.X5F r44) {
        /*
            Method dump skipped, instructions count: 1519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X4O.LJJI(long, long, java.lang.String, X.X5F):void");
    }
}
